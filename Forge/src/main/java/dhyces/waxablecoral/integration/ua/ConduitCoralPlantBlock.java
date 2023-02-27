package dhyces.waxablecoral.integration.ua;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ConduitCoralPlantBlock extends BaseCoralPlantBlock {
    public ConduitCoralPlantBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isConduitFrame(BlockState state, LevelReader level, BlockPos pos, BlockPos conduit) {
        return true;
    }
}
