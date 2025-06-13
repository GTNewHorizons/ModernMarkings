package modernmarkings.blocks;

import net.minecraft.item.ItemBlock;

import modernmarkings.config.BlockConfig;
import modernmarkings.init.ModBlocks;
import modernmarkings.init.ModItems;

public class MarkingFlag extends MarkingWall {

    public MarkingFlag(String name, String textureName) {
        super(name, textureName);
        if (BlockConfig.enableFlags) {

            ModBlocks.BLOCKS.add(this);
            ModBlocks.WALL_BLOCKS_FLAG.add(this);
            ModItems.ITEMS.add(new ItemBlock(this));
        }
    }

}
