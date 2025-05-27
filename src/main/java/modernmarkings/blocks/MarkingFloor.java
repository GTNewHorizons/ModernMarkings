package modernmarkings.blocks;

import static modernmarkings.init.ModBlocks.FLOOR_BLOCKS;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modernmarkings.init.ModRenderers;

public class MarkingFloor extends BlockBase {

    public MarkingFloor(String name, String textureName) {
        super(name, textureName);
        FLOOR_BLOCKS.add(this);
        setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.0001f, 1.0f);
    }

    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World worldIn, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(0.0, 0.0, 0.0, 1.0, 0.0001, 1.0);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World worldIn, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(0, 0, 0, 0, 0, 0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderType() {
        return ModRenderers.renderMarkingFloorID;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, int x, int y, int z, EntityLivingBase placer, ItemStack itemIn) {

        // Normalize rotationYaw to be within [0, 360)
        float yaw = placer.rotationYaw % 360.0F;
        if (yaw < 0.0F) {
            yaw += 360.0F;
        }

        int rotation = MathHelper.floor_double((yaw * 4.0F / 360.0F) + 0.5D) & 3;
        int meta = 0;
        switch (rotation) {
            case 0:
                meta = 3;
                break;
            case 1:
                meta = 2;
                break;
            case 2:
                meta = 0;
                break;
            case 3:
                meta = 1;
                break;
            default:
                meta = 0;
                break;
        }
        worldIn.setBlockMetadataWithNotify(x, y, z, meta, 3);
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        // Ensure the placement is valid per normal block rules
        if (!super.canPlaceBlockAt(world, x, y, z)) {
            return false;
        }

        // Check that the block below is solid and not air.
        return World.doesBlockHaveSolidTopSurface(world, x, y - 1, z);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        // If the block below is no longer solid, drop the block as an item and remove it.
        if (!World.doesBlockHaveSolidTopSurface(world, x, y - 1, z)) {
            world.setBlockToAir(x, y, z);
            this.dropBlockAsItem(world, x, y, z, 0, 0);
        }
        super.onNeighborBlockChange(world, x, y, z, neighbor);
    }

}
