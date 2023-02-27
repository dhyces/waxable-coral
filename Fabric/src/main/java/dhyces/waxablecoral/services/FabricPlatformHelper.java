package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class FabricPlatformHelper implements PlatformHelper {

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
        return HoneycombItem.WAXABLES.get();
    }

    private <T> T cast(Object o) {
        return (T)o;
    }
}
