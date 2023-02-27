package dhyces.waxablecoral;

import dhyces.waxablecoral.registration.RegistrationProvider;
import dhyces.waxablecoral.registration.RegistryObject;
import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class Register {
    public static void init() {}
    
    private static final RegistrationProvider<Block> BLOCK = RegistrationProvider.get(Registries.BLOCK, WaxableCoral.MODID);
    private static final RegistrationProvider<Item> ITEM = RegistrationProvider.get(Registries.ITEM, WaxableCoral.MODID);

    public static final RegistryObject<Block> WAXED_TUBE_CORAL_BLOCK = registerBlock("waxed_tube_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.BLUE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_BRAIN_CORAL_BLOCK = registerBlock("waxed_brain_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PINK).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_BUBBLE_CORAL_BLOCK = registerBlock("waxed_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PURPLE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_FIRE_CORAL_BLOCK = registerBlock("waxed_fire_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_HORN_CORAL_BLOCK = registerBlock("waxed_horn_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.YELLOW).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_TUBE_CORAL = registerBlock("waxed_tube_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_BRAIN_CORAL = registerBlock("waxed_brain_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_BUBBLE_CORAL = registerBlock("waxed_bubble_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_FIRE_CORAL = registerBlock("waxed_fire_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_HORN_CORAL = registerBlock("waxed_horn_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final RegistryObject<BaseCoralFanBlock> WAXED_TUBE_CORAL_FAN = registerBlock("waxed_tube_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_BRAIN_CORAL_FAN = registerBlock("waxed_brain_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_BUBBLE_CORAL_FAN = registerBlock("waxed_bubble_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_FIRE_CORAL_FAN = registerBlock("waxed_fire_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_HORN_CORAL_FAN = registerBlock("waxed_horn_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_TUBE_CORAL_WALL_FAN = registerBlock("waxed_tube_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_BRAIN_CORAL_WALL_FAN = registerBlock("waxed_brain_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_BUBBLE_CORAL_WALL_FAN = registerBlock("waxed_bubble_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_FIRE_CORAL_WALL_FAN = registerBlock("waxed_fire_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_HORN_CORAL_WALL_FAN = registerBlock("waxed_horn_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    
    public static final RegistryObject<BlockItem> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_TUBE_CORAL_BLOCK);
    public static final RegistryObject<BlockItem> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRAIN_CORAL_BLOCK);
    public static final RegistryObject<BlockItem> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL_BLOCK);
    public static final RegistryObject<BlockItem> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FIRE_CORAL_BLOCK);
    public static final RegistryObject<BlockItem> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_HORN_CORAL_BLOCK);
    
    public static final RegistryObject<BlockItem> WAXED_TUBE_CORAL_ITEM = registerBlockItem(WAXED_TUBE_CORAL);
    public static final RegistryObject<BlockItem> WAXED_BRAIN_CORAL_ITEM = registerBlockItem(WAXED_BRAIN_CORAL);
    public static final RegistryObject<BlockItem> WAXED_BUBBLE_CORAL_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL);
    public static final RegistryObject<BlockItem> WAXED_FIRE_CORAL_ITEM = registerBlockItem(WAXED_FIRE_CORAL);
    public static final RegistryObject<BlockItem> WAXED_HORN_CORAL_ITEM = registerBlockItem(WAXED_HORN_CORAL);
    
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_TUBE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_BRAIN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_BUBBLE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_FIRE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_HORN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    private static <T extends Block> RegistryObject<T> registerBlock(String id, Supplier<T> objectSupplier) {
        return BLOCK.register(id, objectSupplier);
    }

    private static <T extends Item> RegistryObject<T> registerItem(String id, Supplier<T> objectSupplier) {
        return ITEM.register(id, objectSupplier);
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(RegistryObject<T> block) {
        return registerItem(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block, E extends Block> RegistryObject<StandingAndWallBlockItem> registerStandingWallBlockItem(RegistryObject<T> standingBlock, RegistryObject<E> wallBlock) {
        return registerItem(standingBlock.getId().getPath(), () -> new StandingAndWallBlockItem(standingBlock.get(), wallBlock.get(), new Item.Properties(), Direction.DOWN));
    }
}
