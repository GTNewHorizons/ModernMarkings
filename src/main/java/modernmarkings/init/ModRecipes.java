package modernmarkings.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.cricketcraft.chisel.api.carving.CarvingUtils;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void registerRecipes() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModBlocks.FLOOR_MARKING_EXIT, 64),
                " Z ",
                " X ",
                " Y ",
                'X',
                Items.paper,
                'Y',
                Blocks.planks,
                'Z',
                "dye"));

        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModBlocks.WALL_MARKING_EXIT, 64),
                "   ",
                "YXZ",
                "   ",
                'X',
                Items.paper,
                'Y',
                Blocks.planks,
                'Z',
                "dye"));
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModBlocks.WALL_MARKING_FLAG_PRIDE, 64),
                "   ",
                "YXZ",
                "Y  ",
                'X',
                Items.paper,
                'Y',
                Items.stick,
                'Z',
                "dye"));
        addChiselRecipes();
    }

    public static void addChiselRecipes() {
        for (int i = 0; i < ModBlocks.FLOOR_BLOCKS.size(); i++) {
            Block block = ModBlocks.FLOOR_BLOCKS.get(i);
            CarvingUtils.chisel.addVariation("Floor blocks", block, 0, i);
        }

        for (int i = 0; i < ModBlocks.WALL_BLOCKS_GENERAL.size(); i++) {
            Block block = ModBlocks.WALL_BLOCKS_GENERAL.get(i);
            CarvingUtils.chisel.addVariation("Wall blocks", block, 0, i);
        }

        for (int i = 0; i < ModBlocks.WALL_BLOCKS_FLAG.size(); i++) {
            Block block = ModBlocks.WALL_BLOCKS_FLAG.get(i);
            CarvingUtils.chisel.addVariation("Flags", block, 0, i);
        }
    };

}
