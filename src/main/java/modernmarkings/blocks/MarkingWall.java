package modernmarkings.blocks;

import static modernmarkings.init.ModBlocks.WALL_BLOCKS;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modernmarkings.init.ModRenderers;

public class MarkingWall extends BlockBase {

    public MarkingWall(String name, String textureName) {
        super(name, textureName);
        WALL_BLOCKS.add(this);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    private static final AxisAlignedBB BOUNDING_BOX_S = AxisAlignedBB.getBoundingBox(0.0, 0.0, 0.0, 1.0, 1.0, 0.0001);
    private static final AxisAlignedBB BOUNDING_BOX_W = AxisAlignedBB.getBoundingBox(0.9999, 0.0, 0.0, 1.0, 1.0, 1.0);
    private static final AxisAlignedBB BOUNDING_BOX_N = AxisAlignedBB.getBoundingBox(0.0, 0.0, 0.9999, 1.0, 1.0, 1.0);
    private static final AxisAlignedBB BOUNDING_BOX_E = AxisAlignedBB.getBoundingBox(0.0, 0.0, 0.0, 0.0001, 1.0, 1.0);

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
        // Only allow placement on wall sides.
        // If placed on top or bottom, continue to calculation with yaw.
        // The metadata is based on the ForgeDirection enum.
        // 0 = DOWN, 1 = UP, 2 = NORTH
        // 3 = SOUTH, 4 = EAST, 5 = WEST
        if (side != 0 && side != 1) {
            return side;
        }
        return getDirectionFromPlacedPlayer(world, x, y, z);
    }

    private int getDirectionFromPlacedPlayer(World world, int x, int y, int z) {
        EntityPlayer player = world.getClosestPlayer(x, y, z, -1);
        float yaw = player.rotationYaw % 360.0F;
        if (yaw < 0.0F) {
            yaw += 360.0F;
        }

        int rotation = MathHelper.floor_double((yaw * 4.0F / 360.0F) + 0.5D) & 3;
        switch (rotation) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 5;
        }
        // Unreachable since we are & 0b11-ing rotation
        throw new RuntimeException("rotation wasn't 0<x<4 " + rotation);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        switch (meta) {
            case 2: // North face clicked; sign is attached to north wall.
                return AxisAlignedBB.getBoundingBox(
                    x + BOUNDING_BOX_N.minX,
                    y + BOUNDING_BOX_N.minY,
                    z + BOUNDING_BOX_N.minZ,
                    x + BOUNDING_BOX_N.maxX,
                    y + BOUNDING_BOX_N.maxY,
                    z + BOUNDING_BOX_N.maxZ);
            case 3: // South
                return AxisAlignedBB.getBoundingBox(
                    x + BOUNDING_BOX_S.minX,
                    y + BOUNDING_BOX_S.minY,
                    z + BOUNDING_BOX_S.minZ,
                    x + BOUNDING_BOX_S.maxX,
                    y + BOUNDING_BOX_S.maxY,
                    z + BOUNDING_BOX_S.maxZ);
            case 4: // West
                return AxisAlignedBB.getBoundingBox(
                    x + BOUNDING_BOX_W.minX,
                    y + BOUNDING_BOX_W.minY,
                    z + BOUNDING_BOX_W.minZ,
                    x + BOUNDING_BOX_W.maxX,
                    y + BOUNDING_BOX_W.maxY,
                    z + BOUNDING_BOX_W.maxZ);
            case 5: // East
                return AxisAlignedBB.getBoundingBox(
                    x + BOUNDING_BOX_E.minX,
                    y + BOUNDING_BOX_E.minY,
                    z + BOUNDING_BOX_E.minZ,
                    x + BOUNDING_BOX_E.maxX,
                    y + BOUNDING_BOX_E.maxY,
                    z + BOUNDING_BOX_E.maxZ);
            default:
                // Fallback if metadata is not as expected.
                return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World worldIn, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(0, 0, 0, 0, 0, 0);
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, int x, int y, int z) {
        int meta = worldIn.getBlockMetadata(x, y, z);

        float minY = 0;
        float maxY = 1.0F;
        float minX = 0.0F;
        float maxX = 1.0F;
        float thickness = 0.01F;

        // From BlockSign
        switch (meta) {
            case 2 -> this.setBlockBounds(minX, minY, 1.0F - thickness, maxX, maxY, 1.0F);
            case 3 -> this.setBlockBounds(minX, minY, 0.0F, maxX, maxY, thickness);
            case 4 -> this.setBlockBounds(1.0F - thickness, minY, minX, 1.0F, maxY, maxX);
            case 5 -> this.setBlockBounds(0.0F, minY, minX, thickness, maxY, maxX);
            default -> this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderType() {
        return ModRenderers.renderMarkingWallID;
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        // Ensure the placement is valid per normal block rules
        if (!super.canPlaceBlockAt(world, x, y, z)) {
            return false;
        }
        int direction = getDirectionFromPlacedPlayer(world, x, y, z);

        ForgeDirection dir = ForgeDirection.getOrientation(direction);
        return world.isSideSolid(x + dir.offsetX, y, z + dir.offsetZ, dir, false);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        int meta = world.getBlockMetadata(x, y, z);

        // I have no idea why .getOpposite is required here when it's not in canPlaceBlockAt,
        // but it works like this
        ForgeDirection dir = ForgeDirection.getOrientation(meta)
            .getOpposite();
        if (!world.isSideSolid(x + dir.offsetX, y, z + dir.offsetZ, dir, false)) {
            world.setBlockToAir(x, y, z);
            this.dropBlockAsItem(world, x, y, z, 0, 0);
        }
        super.onNeighborBlockChange(world, x, y, z, neighbor);
    }

}
