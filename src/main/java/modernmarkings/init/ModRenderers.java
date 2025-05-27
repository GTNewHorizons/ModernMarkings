package modernmarkings.init;

import cpw.mods.fml.client.registry.RenderingRegistry;
import modernmarkings.renderer.MarkingFloorRenderer;
import modernmarkings.renderer.MarkingWallRenderer;

public class ModRenderers {

    public static int renderMarkingWallID = -1;
    public static int renderMarkingFloorID = -1;

    public static void initRenderers() {
        renderMarkingWallID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new MarkingWallRenderer());

        renderMarkingFloorID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new MarkingFloorRenderer());
    }
}
