package modernmarkings.blocks;

import static modernmarkings.init.ModBlocks.WALL_BLOCKS_GENERAL;

public class MarkingWallGeneral extends MarkingWall {

    public MarkingWallGeneral(String name, String textureName) {
        super(name, textureName);
        WALL_BLOCKS_GENERAL.add(this);
    }
}
