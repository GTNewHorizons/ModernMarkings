package modernmarkings.config;

import com.gtnewhorizon.gtnhlib.config.Config;

import modernmarkings.ModernMarkings;

@Config(modid = ModernMarkings.MODID, category = "recipe")
public class RecipeConfig {

    @Config.DefaultBoolean(false)
    public static boolean enableRecipeDesigner;

}
