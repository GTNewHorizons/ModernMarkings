package modernmarkings.blocks;

import static modernmarkings.init.ModBlocks.WALL_BLOCKS_FLAG;

public class MarkingFlag extends MarkingWall {

    public MarkingFlag(String name, String textureName) {
        super(name, textureName);
        WALL_BLOCKS_FLAG.add(this);
    }

}
