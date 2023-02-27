package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ForgePlatformHelper implements PlatformHelper {
    private static final BiMap<Block, Block> WAXING_BIMAP = HashBiMap.create();

    @Override
    public BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralPlantBlock(properties);
    }

    @Override
    public BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralFanBlock(properties);
    }

    @Override
    public BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralWallFanBlock(properties);
    }

    @Override
    public BiMap<Block, Block> getWaxMap() {
        return WAXING_BIMAP;
    }
}
