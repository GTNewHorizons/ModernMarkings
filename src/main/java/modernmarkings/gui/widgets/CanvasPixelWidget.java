package modernmarkings.gui.widgets;

import com.cleanroommc.modularui.api.widget.Interactable;
import com.cleanroommc.modularui.drawable.Rectangle;
import com.cleanroommc.modularui.utils.Color;
import com.cleanroommc.modularui.widget.Widget;
import com.cleanroommc.modularui.widgets.ButtonWidget;

public class CanvasPixelWidget extends ButtonWidget<CanvasPixelWidget> implements Interactable {

    private Rectangle pixel = new Rectangle();

    public CanvasPixelWidget() {
        background(pixel);
        disableHoverBackground();
        disableHoverOverlay();
        pixel.setColor(Color.argb(255, 255, 255, 255));
    }

    public int getPixelColor() {
        return pixel.getColor();
    }

    public void setPixelColor(int color) {
        pixel.setColor(color);
    }

}
