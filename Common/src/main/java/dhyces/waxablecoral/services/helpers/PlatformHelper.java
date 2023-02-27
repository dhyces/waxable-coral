package dhyces.waxablecoral.services.helpers;

import com.google.common.collect.BiMap;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public interface PlatformHelper {
    BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties);
    BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties);
    BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties);

    BiMap<Block, Block> getWaxMap();
}
