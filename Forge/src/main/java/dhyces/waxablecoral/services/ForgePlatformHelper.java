package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import dhyces.waxablecoral.ForgeWaxableCoral;
import dhyces.waxablecoral.WaxableCoral;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ForgePlatformHelper implements PlatformHelper {
    private static final BiMap<Block, Block> WAXING_BIMAP = HashBiMap.create();

    @Override
    public <T> CommonRegistryObject<T> register(String id, ResourceKey<? extends Registry<T>> registryKey, Supplier<T> objectSupplier) {
        DeferredRegister<T> register = registryFor(registryKey);
        ResourceKey<T> key = ResourceKey.create(registryKey, WaxableCoral.id(id));
        return CommonRegistryObject.of(key, register.register(id, objectSupplier));
    }

    private <T> DeferredRegister<T> registryFor(ResourceKey<?> registryKey) {
        if (registryKey == Registries.BLOCK) {
            return (DeferredRegister<T>) ForgeWaxableCoral.BLOCK_REGISTER;
        } else if (registryKey == Registries.ITEM) {
            return (DeferredRegister<T>) ForgeWaxableCoral.ITEM_REGISTER;
        }
        return null;
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
        return WAXING_BIMAP;
    }
}
