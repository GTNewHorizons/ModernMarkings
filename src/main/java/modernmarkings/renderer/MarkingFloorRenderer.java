package modernmarkings.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modernmarkings.init.ModRenderers;

@SideOnly(Side.CLIENT)
public class MarkingFloorRenderer implements ISimpleBlockRenderingHandler {

    @Override
    @SideOnly(Side.CLIENT)
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
        Minecraft.getMinecraft()
            .getTextureManager()
            .bindTexture(TextureMap.locationBlocksTexture);

        Tessellator tessellator = Tessellator.instance;

        tessellator.startDrawingQuads();

        IIcon icon = block.getIcon(0, metadata);

        float uMin = icon.getMinU();
        float uMax = icon.getMaxU();
        float vMin = icon.getMinV();
        float vMax = icon.getMaxV();

        // For a flat quad, we draw in the X-Y plane at Z=0.
        GL11.glPushMatrix();

        GL11.glTranslatef(0.1F, 0.5F, 0);

        // Draw a quad from (0,0) to (1,1)
        tessellator.addVertexWithUV(0.0, 0.0, 0.0, uMin, vMin);
        tessellator.addVertexWithUV(0.0, 0.0, 1.0, uMin, vMax);
        tessellator.addVertexWithUV(1.0, 0.0, 1.0, uMax, vMax);
        tessellator.addVertexWithUV(1.0, 0.0, 0.0, uMax, vMin);

        tessellator.draw();
        GL11.glPopMatrix();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
        RenderBlocks renderer) {
        int meta = world.getBlockMetadata(x, y, z);

        renderer.setRenderBounds(0.0, 0.0, 0.0, 1.0, 0.0005, 1.0);

        IIcon icon = block.getIcon(getRenderSide(meta), meta);

        renderer.overrideBlockTexture = icon;
        renderer.uvRotateTop = meta % 4;
        boolean rendered = renderer.renderStandardBlock(block, x, y, z);
        renderer.clearOverrideBlockTexture();
        return rendered;
    }

    private int getRenderSide(int metadata) {
        // Here we assume metadata is the same as the side (2, 3, 4, or 5),
        // which you set when the block is placed.
        return metadata;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    @Override
    public int getRenderId() {
        return ModRenderers.renderMarkingFloorID;
    }
}
