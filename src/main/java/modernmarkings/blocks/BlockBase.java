package modernmarkings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import modernmarkings.ModernMarkings;

public class BlockBase extends Block {

    protected BlockBase(String name, String textureName) {
        super(Material.carpet);
        setBlockName(name);
        setBlockTextureName(ModernMarkings.MODID + ":" + textureName);

        setCreativeTab(ModernMarkings.CREATIVE_TAB);

    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
