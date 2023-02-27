package dhyces.waxablecoral.services.helpers;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public interface PlatformHelper {
    <T> CommonRegistryObject<T> register(String id, ResourceKey<? extends Registry<T>> registryKey, Supplier<T> objectSupplier);

    BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties);
    BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties);
    BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties);

    BiMap<Block, Block> getWaxMap();
}
