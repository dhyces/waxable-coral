package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class FabricPlatformHelper implements PlatformHelper {
    @Override
    public <T> CommonRegistryObject<T> register(String id, ResourceKey<? extends Registry<T>> registryKey, Supplier<T> objectSupplier) {
        ResourceLocation rl = WaxableCoral.id(id);
        ResourceKey<T> key = ResourceKey.create(registryKey, rl);
        T obj = objectSupplier.get();
        Registry<?> registry = Registry.REGISTRY.get(registryKey.location());
        Registry.register(cast(registry), key, obj);
        return CommonRegistryObject.of(key, () -> obj);
    }

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
