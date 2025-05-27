package modernmarkings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import modernmarkings.ModernMarkings;
import modernmarkings.init.ModBlocks;
import modernmarkings.init.ModItems;

public class BlockBase extends Block {

    protected BlockBase(String name, String textureName) {
        super(Material.carpet);
        setBlockName(name);
        setBlockTextureName(ModernMarkings.MODID + ":" + textureName);

        setCreativeTab(ModernMarkings.CREATIVE_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this));

    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
