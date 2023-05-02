package dhyces.waxablecoral.integration.ua;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ConduitCoralBlock extends Block {
    public ConduitCoralBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isConduitFrame(BlockState state, LevelReader level, BlockPos pos, BlockPos conduit) {
        return true;
    }
}
