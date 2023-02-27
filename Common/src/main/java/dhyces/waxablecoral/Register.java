package dhyces.waxablecoral;

import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class Register {
    public static void init() {}

    public static final CommonRegistryObject<Block> WAXED_TUBE_CORAL_BLOCK = register("waxed_tube_coral_block", Registries.BLOCK, () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.BLUE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final CommonRegistryObject<Block> WAXED_BRAIN_CORAL_BLOCK = register("waxed_brain_coral_block", Registries.BLOCK, () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PINK).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final CommonRegistryObject<Block> WAXED_BUBBLE_CORAL_BLOCK = register("waxed_bubble_coral_block", Registries.BLOCK, () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PURPLE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final CommonRegistryObject<Block> WAXED_FIRE_CORAL_BLOCK = register("waxed_fire_coral_block", Registries.BLOCK, () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final CommonRegistryObject<Block> WAXED_HORN_CORAL_BLOCK = register("waxed_horn_coral_block", Registries.BLOCK, () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.YELLOW).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_TUBE_CORAL = register("waxed_tube_coral", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_BRAIN_CORAL = register("waxed_brain_coral", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_BUBBLE_CORAL = register("waxed_bubble_coral", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_FIRE_CORAL = register("waxed_fire_coral", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_HORN_CORAL = register("waxed_horn_coral", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_TUBE_CORAL_FAN = register("waxed_tube_coral_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_BRAIN_CORAL_FAN = register("waxed_brain_coral_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_BUBBLE_CORAL_FAN = register("waxed_bubble_coral_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_FIRE_CORAL_FAN = register("waxed_fire_coral_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_HORN_CORAL_FAN = register("waxed_horn_coral_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_TUBE_CORAL_WALL_FAN = register("waxed_tube_coral_wall_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_BRAIN_CORAL_WALL_FAN = register("waxed_brain_coral_wall_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_BUBBLE_CORAL_WALL_FAN = register("waxed_bubble_coral_wall_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_FIRE_CORAL_WALL_FAN = register("waxed_fire_coral_wall_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_HORN_CORAL_WALL_FAN = register("waxed_horn_coral_wall_fan", Registries.BLOCK, () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final CommonRegistryObject<BlockItem> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_TUBE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRAIN_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FIRE_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_HORN_CORAL_BLOCK);
    
    public static final CommonRegistryObject<BlockItem> WAXED_TUBE_CORAL_ITEM = registerBlockItem(WAXED_TUBE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_BRAIN_CORAL_ITEM = registerBlockItem(WAXED_BRAIN_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_BUBBLE_CORAL_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_FIRE_CORAL_ITEM = registerBlockItem(WAXED_FIRE_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_HORN_CORAL_ITEM = registerBlockItem(WAXED_HORN_CORAL);
    
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_TUBE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_BRAIN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_BUBBLE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_FIRE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_HORN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    private static <T, E extends T> CommonRegistryObject<E> register(String id, ResourceKey<? extends Registry<T>> registryKey, Supplier<E> objectSupplier) {
        return Services.PLATFORM_HELPER.register(id, cast(registryKey), objectSupplier);
    }

    private static <T extends Block> CommonRegistryObject<BlockItem> registerBlockItem(CommonRegistryObject<T> block) {
        return register(block.getId().getPath(), Registries.ITEM, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block, E extends Block> CommonRegistryObject<StandingAndWallBlockItem> registerStandingWallBlockItem(CommonRegistryObject<T> standingBlock, CommonRegistryObject<E> wallBlock) {
        return register(standingBlock.getId().getPath(), Registries.ITEM, () -> new StandingAndWallBlockItem(standingBlock.get(), wallBlock.get(), new Item.Properties(), Direction.DOWN));
    }

    static <T> T cast(Object o) {
        return (T) o;
    }
}
