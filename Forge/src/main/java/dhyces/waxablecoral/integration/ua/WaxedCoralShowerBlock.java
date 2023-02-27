package dhyces.waxablecoral.integration.ua;

import com.teamabnormals.upgrade_aquatic.core.registry.UAParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class WaxedCoralShowerBlock extends BaseCoralPlantBlock {
    protected static final VoxelShape SHAPE = Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0);

    public WaxedCoralShowerBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pFacing == Direction.UP && !pState.canSurvive(pLevel, pCurrentPos)) {
            return Blocks.AIR.defaultBlockState();
        }
        if (pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return pState;
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos abovePos = pPos.above();
        return pLevel.getBlockState(abovePos).isFaceSturdy(pLevel, abovePos, Direction.DOWN);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
        double xOffset = pRandom.nextBoolean() ? -(Math.random() * 0.4) : Math.random() * 0.4;
        double yOffset = pRandom.nextBoolean() ? -(Math.random() * 0.4) : Math.random() * 0.4;
        double zOffset = pRandom.nextBoolean() ? -(Math.random() * 0.4) : Math.random() * 0.4;
        double d0 = pPos.getX() + 0.5 + xOffset;
        double d1 = pPos.getY() + 0.5 + yOffset;
        double d2 = pPos.getZ() + 0.5 + zOffset;
        pLevel.addParticle(UAParticleTypes.PRISMARINE_SHOWER.get(), d0, d1, d2, 0.0, 0.004, 0.0);
    }

    @Override
    public boolean isConduitFrame(BlockState state, LevelReader level, BlockPos pos, BlockPos conduit) {
        return true;
    }
}
