package modernmarkings.gui.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.cleanroommc.modularui.api.layout.ILayoutWidget;
import com.cleanroommc.modularui.api.widget.IParentWidget;
import com.cleanroommc.modularui.api.widget.IWidget;
import com.cleanroommc.modularui.api.widget.Interactable;
import com.cleanroommc.modularui.drawable.Rectangle;
import com.cleanroommc.modularui.screen.viewport.ModularGuiContext;
import com.cleanroommc.modularui.theme.WidgetTheme;
import com.cleanroommc.modularui.utils.Color;
import com.cleanroommc.modularui.widget.AbstractScrollWidget;
import com.cleanroommc.modularui.widget.Widget;
import com.cleanroommc.modularui.widget.scroll.HorizontalScrollData;
import com.cleanroommc.modularui.widget.scroll.VerticalScrollData;
import com.cleanroommc.modularui.widget.sizer.Area;
import com.cleanroommc.modularui.widgets.ButtonWidget;
import com.cleanroommc.modularui.widgets.layout.Column;
import com.cleanroommc.modularui.widgets.layout.Grid;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class CanvasWidget extends AbstractScrollWidget<CanvasPixelWidget, CanvasWidget> implements ILayoutWidget {

    private static final int PIXEL_SIZE = 8;

    // Default color white
    private Supplier<Integer> currentColor = () -> Color.argb(255, 255, 255, 255);
    // Default canvas size of 64
    private int canvasSize = 64;
    // Default ZoomLevel of 1, a pixel is 8x8 pixels
    private double zoomLevel = 1.0;
    // Size of the brush to decide how many pixels need to be changed around the center
    private Supplier<Integer> brushSize = () -> 1;
    // The type of brush
    private Supplier<Brush> brush = () -> Brush.Square;
    // Canvas that we draw on
    private List<List<CanvasPixelWidget>> canvas = new ArrayList<>();

    public CanvasWidget() {
        super(new HorizontalScrollData(false, 1), new VerticalScrollData(false, 1));
        resizeCanvas();
    }

    public CanvasWidget setColor(int color) {
        return setColor(() -> color);
    }

    public CanvasWidget setColor(Supplier<Integer> color) {
        this.currentColor = color;
        return this;
    }

    public CanvasWidget setZoom(double zoomLevel) {
        this.zoomLevel = zoomLevel;
        resizeCanvas();
        return this;
    }

    public CanvasWidget setCanvasSize(int canvasSize) {
        this.canvasSize = canvasSize;
        resizeCanvas();
        return this;
    }

    public CanvasWidget setBrushType(Supplier<Brush> brush) {
        this.brush = brush;
        return this;
    }

    public CanvasWidget setBrushSize(Supplier<Integer> brushSize) {
        this.brushSize = brushSize;
        return this;
    }

    private void resizeCanvas() {
        List<List<CanvasPixelWidget>> oldCanvas = canvas;
        int oldCanvasSize = oldCanvas.size();
        canvas = new ArrayList<>();
        for (int i = 0; i < this.canvasSize; i++) {
            List<CanvasPixelWidget> row = new ArrayList<>();
            for (int j = 0; j < this.canvasSize; j++) {
                if (i < oldCanvasSize && j < oldCanvasSize) {
                    CanvasPixelWidget oldPixel = oldCanvas.get(i).get(j);
                    oldPixel.size((int) Math.ceil(PIXEL_SIZE * zoomLevel));
                    row.add(oldPixel);
                } else {
                    CanvasPixelWidget newPixel = new CanvasPixelWidget();
                    newPixel.size((int) Math.ceil(PIXEL_SIZE * zoomLevel));
                    newPixel.disableHoverBackground();
                    int x = i;
                    int y = j;
                    newPixel.onMousePressed(mouseButton -> {
                        for (int k = -brushSize.get()+ 1; k <= brushSize.get() - 1; k++) {
                            if (x + k < 0 || x + k >= canvasSize) continue;
                            for (int l = -brushSize.get() + 1; l <= brushSize.get() - 1; l++) {
                                if (y + l < 0 || y + l >= canvasSize) continue;
                                switch (brush.get()) {
                                    case Square:
                                        break;
                                    case Circle:
                                        if (Math.sqrt(Math.pow(k, 2) + Math.pow(l, 2)) > brushSize.get()) continue;
                                        break;
                                    default:
                                        break;
                                }
                                CanvasPixelWidget pixel = canvas.get(x+k).get(y+l);
                                pixel.setPixelColor(currentColor.get());
                            }
                        }
                        return true;
                    });
                    if (isValid()) {
                        newPixel.initialise(this);
                    }
                    row.add(newPixel);
                }
            }
            canvas.add(row);
        }
        scheduleResize();
    }

    public List<List<Integer>> getCanvas() {
        return null;
    }

    @Override
    public void draw(ModularGuiContext context, WidgetTheme widgetTheme) {
        super.draw(context, widgetTheme);
    }

    @Override
    public void layoutWidgets() {
        int x = 0, y = 0;
        for (int r = 0; r < Math.min(canvasSize, canvas.size()); r++) {
            x = 0;
            int height = (int) Math.ceil(PIXEL_SIZE * zoomLevel);
            for (int c = 0; c < Math.min(canvasSize, canvas.get(r).size()); c++) {
                int width = (int) Math.ceil(PIXEL_SIZE * zoomLevel);
                IWidget child = this.canvas.get(r).get(c);
                if (child != null) {
                    child.getArea().rx = (int) (x + (width - child.getArea().width));
                    child.getArea().ry = (int) (y + (height - child.getArea().height));
                    child.resizer().setPosResized(true, true);
                }
                x += width;
            }
            y += height;
        }
        if (getScrollArea().getScrollX() != null) {
            getScrollArea().getScrollX().setScrollSize(x);
        }
        if (getScrollArea().getScrollY() != null) {
            getScrollArea().getScrollY().setScrollSize(y);
        }
    }

    @Override
    public boolean addChild(CanvasPixelWidget child, int index) {
        return super.addChild(child, index);
    }

    @Override
    public List<IWidget> getChildren() {
        List<IWidget> widgets = new ArrayList<>();
        canvas.forEach(row -> row.forEach(pixel -> widgets.add(pixel)));
        return widgets;
    }

    public static enum Brush {
        Square,
        Circle,
        None;
    }
}
