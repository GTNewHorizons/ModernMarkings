package modernmarkings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import modernmarkings.config.DesignerConfig;
import modernmarkings.config.RecipeConfig;
import modernmarkings.init.ModBlocks;
import modernmarkings.init.ModFuelHandler;
import modernmarkings.init.ModItems;
import modernmarkings.init.ModRecipes;
import modernmarkings.init.ModRenderers;
import modernmarkings.init.ModTab;

@Mod(
    modid = ModernMarkings.MODID,
    version = VERSION.VERSION,
    name = ModernMarkings.NAME,
    acceptedMinecraftVersions = "[1.7.10]",
    dependencies = "required-after:chisel;"
    + " required-after:modularui2;"
    + " required-after:gtnhlib;")
public class ModernMarkings {

    public static final String MODID = "modernmarkings";
    public static final String NAME = "ModernMarkings";
    public static final Logger LOG = LogManager.getLogger(MODID);
    public static final ModTab CREATIVE_TAB = new ModTab("modernmarkings");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        try {
            ConfigurationManager.registerConfig(RecipeConfig.class);
            ConfigurationManager.registerConfig(DesignerConfig.class);
        } catch (ConfigException e) {
            throw new RuntimeException(e);
        }

        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModRecipes.registerRecipes();
        GameRegistry.registerFuelHandler(new ModFuelHandler());
        if (FMLCommonHandler.instance()
            .getSide() == Side.CLIENT) {
            ModRenderers.initRenderers();
        }
    }

}
