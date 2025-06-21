package modernmarkings.config;

import com.gtnewhorizon.gtnhlib.config.Config;

import modernmarkings.ModernMarkings;

@Config(modid = ModernMarkings.MODID, category = "designer")
public class DesignerConfig {

    @Config.DefaultInt(64)
    public static int maximumCanvasSize;
}
