package modernmarkings.blocks;

import com.cleanroommc.modularui.factory.TileEntityGuiFactory;

import cpw.mods.fml.common.registry.GameRegistry;
import modernmarkings.init.ModBlocks;
import modernmarkings.tileentities.MarkingDesigner;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DesignerBlock extends BlockBase implements ITileEntityProvider {

    public DesignerBlock(String name, String textureName) {
        super(name, textureName);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        ModBlocks.BLOCKS.add(this);
        GameRegistry.registerTileEntity(MarkingDesigner.class, "marking-designer-tile");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new MarkingDesigner();
    }

    @Override
    public boolean onBlockActivated(World worldIn, int x, int y, int z, EntityPlayer player, int side, float subX,
            float subY, float subZ) {
        TileEntityGuiFactory.INSTANCE.openClient(x, y, z);
        return true;
    }

}
