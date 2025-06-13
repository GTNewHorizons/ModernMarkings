package modernmarkings.config;

import com.gtnewhorizon.gtnhlib.config.Config;

import modernmarkings.ModernMarkings;

@Config(modid = ModernMarkings.MODID, category = "blocks")
public class BlockConfig {

    @Config.DefaultBoolean(true)
    public static boolean enableFlags;
}
