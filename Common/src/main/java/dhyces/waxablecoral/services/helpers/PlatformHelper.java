package dhyces.waxablecoral.services.helpers;

import com.google.common.collect.BiMap;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public interface PlatformHelper {
    BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties);
    BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties);
    BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties);

    <T extends Item> Supplier<T> registerItem(String id, Supplier<T> objectSupplier);
    <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> objectSupplier);

    BiMap<Block, Block> getWaxMap();
}
