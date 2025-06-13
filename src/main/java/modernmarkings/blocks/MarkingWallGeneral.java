package modernmarkings.blocks;

import net.minecraft.item.ItemBlock;

import modernmarkings.init.ModBlocks;
import modernmarkings.init.ModItems;

public class MarkingWallGeneral extends MarkingWall {

    public MarkingWallGeneral(String name, String textureName) {
        super(name, textureName);
        ModBlocks.BLOCKS.add(this);
        ModBlocks.FLOOR_BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this));
    }
}
