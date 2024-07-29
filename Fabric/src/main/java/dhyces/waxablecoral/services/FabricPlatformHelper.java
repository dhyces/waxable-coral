package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

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
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> objectSupplier) {
        T item = objectSupplier.get();
        Registry.register(BuiltInRegistries.ITEM, WaxableCoral.id(id), item);
        return () -> item;
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> objectSupplier) {
        T block = objectSupplier.get();
        Registry.register(BuiltInRegistries.BLOCK, WaxableCoral.id(id), block);
        return () -> block;
    }

    @Override
    public BiMap<Block, Block> getWaxMap() {
        return HoneycombItem.WAXABLES.get();
    }
}
