package modernmarkings.tileentities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cleanroommc.modularui.api.IGuiHolder;
import com.cleanroommc.modularui.api.IPanelHandler;
import com.cleanroommc.modularui.api.widget.IWidget;
import com.cleanroommc.modularui.drawable.Circle;
import com.cleanroommc.modularui.drawable.GuiTextures;
import com.cleanroommc.modularui.drawable.Rectangle;
import com.cleanroommc.modularui.drawable.UITexture;
import com.cleanroommc.modularui.drawable.text.LangKey;
import com.cleanroommc.modularui.factory.PosGuiData;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.screen.UISettings;
import com.cleanroommc.modularui.utils.Alignment;
import com.cleanroommc.modularui.utils.Color;
import com.cleanroommc.modularui.utils.item.ItemStackHandler;
import com.cleanroommc.modularui.value.DoubleValue;
import com.cleanroommc.modularui.value.IntValue;
import com.cleanroommc.modularui.value.StringValue;
import com.cleanroommc.modularui.value.StringValue.Dynamic;
import com.cleanroommc.modularui.value.sync.DoubleSyncValue;
import com.cleanroommc.modularui.value.sync.IntSyncValue;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;
import com.cleanroommc.modularui.value.sync.SyncHandler;
import com.cleanroommc.modularui.value.sync.SyncHandlers;
import com.cleanroommc.modularui.widget.AbstractScrollWidget;
import com.cleanroommc.modularui.widget.EmptyWidget;
import com.cleanroommc.modularui.widget.ScrollWidget;
import com.cleanroommc.modularui.widget.Widget;
import com.cleanroommc.modularui.widget.WidgetTree;
import com.cleanroommc.modularui.widget.scroll.HorizontalScrollData;
import com.cleanroommc.modularui.widget.scroll.VerticalScrollData;
import com.cleanroommc.modularui.widgets.ButtonWidget;
import com.cleanroommc.modularui.widgets.ColorPickerDialog;
import com.cleanroommc.modularui.widgets.CycleButtonWidget;
import com.cleanroommc.modularui.widgets.SliderWidget;
import com.cleanroommc.modularui.widgets.SlotGroupWidget;
import com.cleanroommc.modularui.widgets.TextWidget;
import com.cleanroommc.modularui.widgets.layout.Column;
import com.cleanroommc.modularui.widgets.layout.Grid;
import com.cleanroommc.modularui.widgets.layout.Row;
import com.cleanroommc.modularui.widgets.slot.ItemSlot;
import com.cleanroommc.modularui.widgets.textfield.TextFieldWidget;

import modernmarkings.config.DesignerConfig;
import modernmarkings.gui.widgets.CanvasPixelWidget;
import modernmarkings.gui.widgets.CanvasWidget;
import modernmarkings.gui.widgets.CanvasWidget.Brush;
import net.minecraft.tileentity.TileEntity;

public class MarkingDesigner extends TileEntity implements IGuiHolder<PosGuiData>{

    private static final int WHITE = Color.argb(255, 255, 255, 255);

    // Single slot for the canvas item
    private ItemStackHandler inventory = new ItemStackHandler(1);
    private int currentColor = WHITE;
    private int canvasSize = 64;
    private int brushSize = 1;
    private Brush brushType = Brush.Square;
    private double zoom = 1;
    private StringValue encodedCanvas = new StringValue("");

    @Override
    public ModularPanel buildUI(PosGuiData data, PanelSyncManager syncManager, UISettings settings) {
        syncManager.syncValue("color", SyncHandlers.intNumber(() -> currentColor, val -> { currentColor = val; markDirty(); }));
        syncManager.syncValue("canvasSize", SyncHandlers.doubleNumber(() -> canvasSize, val -> { canvasSize = (int) Math.ceil(val); markDirty(); }));
        syncManager.syncValue("zoom", SyncHandlers.doubleNumber(() -> zoom, val -> { zoom = val; markDirty(); }));
        syncManager.syncValue("brushSize", SyncHandlers.doubleNumber(() -> brushSize, val -> { brushSize = (int) Math.ceil(val); markDirty(); }));
        syncManager.syncValue("brushType", SyncHandlers.intNumber(() -> brushType.ordinal(), val -> { brushType = Brush.values()[val]; markDirty(); }));
        settings.getNEISettings().disableNEI();
        syncManager.bindPlayerInventory(data.getPlayer());
        ModularPanel gui = new ModularPanel("designer-gui");
        gui.sizeRel(1, 1);
        CanvasWidget canvasUI = new CanvasWidget();
        canvasUI.sizeRel(1,1);
        canvasUI.setColor(() -> currentColor);
        canvasUI.setBrushSize(() -> brushSize);
        canvasUI.setBrushType(() -> brushType);
        ButtonWidget<?> colorBtn = new ButtonWidget<>();
        IPanelHandler colorPicker = IPanelHandler.simple(gui, (mainPanel, player) -> new ColorPickerDialog("color-picker", val -> { currentColor = val; colorBtn.background(new Rectangle().setColor(currentColor)); }, currentColor, true)
            .setDraggable(true), true);
        SlotGroupWidget playerInv = SlotGroupWidget.playerInventory(0, true, (index, slot) -> slot);
        gui.padding(4).child(new Row()
            .sizeRel(0.99f, 0.99f)
            .child(new Column()
                .marginRight(2)
                .sizeRel(0.24f, 0.99f)
                .child(new Column()
                    .marginBottom(2)
                    .sizeRel(1f, 0.1f)
                    .child(new TextWidget(new LangKey("gui.canvas.canvas-item")).sizeRel(1f, 0.5f))
                    .child(new ItemSlot().slot(inventory, 0).sizeRel(0.5f))
                ).child(new Row()
                    .child(new ButtonWidget<>()
                        .onMousePressed(mouseBtn -> {
                            return true;
                        })
                        .sizeRel(0.5f, 1f)
                        .overlay(new LangKey("gui.canvas.save")))
                    .child(new ButtonWidget<>()
                        .onMousePressed(mouseBtn -> {
                            return true;
                        })
                        .sizeRel(0.5f, 1f)
                        .overlay(new LangKey("gui.canvas.load")))
                    .margin(0, 2)
                    .sizeRel(1f, 0.05f)
                ).child(new Column()
                    .child(new TextWidget(new LangKey(() -> "gui.canvas.canvas-size", () -> new Object[] { canvasSize })).sizeRel(1, 0.5f))
                    .child(new SliderWidget()
                        .bounds(1, DesignerConfig.maximumCanvasSize)
                        .stopper(1)
                        .sizeRel(1,0.5f)
                        .value(new DoubleValue.Dynamic(() -> canvasSize, val -> {
                            canvasSize = (int) Math.ceil(val);
                            canvasUI.setCanvasSize(canvasSize);
                        })))
                    .margin(0, 2)
                    .sizeRel(1, 0.05f)
                ).child(new Column()
                    .child(new TextWidget(new LangKey(() -> "gui.canvas.zoom", () -> new Object[] { String.format("%.1f", zoom) })).sizeRel(1, 0.5f))
                    .child(new SliderWidget()
                        .bounds(0.1, 8)
                        .stopper(0.1)
                        .sizeRel(1, 0.5f)
                        .value(new DoubleValue.Dynamic(() -> zoom, val -> {
                            zoom = val;
                            canvasUI.setZoom(zoom);
                        })))
                    .margin(0, 2)
                    .sizeRel(1, 0.05f)
                ).child(new Column()
                    .child(new TextWidget(new LangKey(() -> "gui.canvas.color")).sizeRel(1, 0.5f))
                    .child(colorBtn
                        .disableHoverBackground()
                        .background(new Rectangle().setColor(currentColor))
                        .onMousePressed(btn -> {
                            colorPicker.openPanel();
                            return true;
                        })
                        .sizeRel(1, 0.5f))
                    .margin(0, 2)
                    .sizeRel(1, 0.05f)
                ).child(new Column()
                    .child(new TextWidget(new LangKey("gui.canvas.brush-type")).sizeRel(1, 0.25f))
                    .child(new Row()
                        .child(new CycleButtonWidget()
                            .stateOverlay(0, new Rectangle().setColor(WHITE))
                            .stateOverlay(1, new Circle().setColor(WHITE, WHITE))
                            .syncHandler("brushType")
                            .stateCount(2)
                            .center()
                            .sizeRel(0.075f, 1))
                        .sizeRel(1, 0.75f))
                    .sizeRel(1, 0.15f)
                ).child(new Column()
                    .child(new TextWidget(new LangKey(() -> "gui.canvas.brush-size", () -> new Object[] { brushSize })).sizeRel(1, 0.5f))
                    .child(new SliderWidget()
                        .bounds(1, DesignerConfig.maximumCanvasSize)
                        .stopper(1)
                        .sizeRel(1, 0.5f)
                        .syncHandler("brushSize"))
                    .margin(0, 2)
                    .sizeRel(1, 0.05f)
                ).child(new Column()
                    .child(new Row()
                        .sizeRel(1f, 0.5f)
                        .child(new ButtonWidget<>()
                            .onMousePressed(mouseBtn -> {
                                return true;
                            })
                            .sizeRel(0.5f, 1f)
                            .overlay(new LangKey("gui.canvas.export")))
                        .child(new ButtonWidget<>()
                            .onMousePressed(mouseBtn -> {
                                return true;
                            })
                            .sizeRel(0.5f, 1f)
                            .overlay(new LangKey("gui.canvas.import")))
                    ).child(new TextFieldWidget().value(encodedCanvas).sizeRel(1, 0.5f))
                    .margin(0, 2)
                    .sizeRel(1f, 0.1f)
                ).child(new Grid()
                    .scrollable()
                    .nextRow()
                    .child(playerInv)
                    .marginTop(2)
                    .sizeRel(1f, 0.3f))
            ).child(new Column()
                .marginLeft(2)
                .sizeRel(0.74f, 1)
                .child(canvasUI)
            )
        );

        return gui;
    }

}
