package dhyces.waxablecoral.integration.upgradeaquatic;

import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.WaxableCoralAPI;
import dhyces.waxablecoral.integration.upgradeaquatic.block.ConduitCoralBlock;
import dhyces.waxablecoral.integration.upgradeaquatic.block.ConduitCoralFanBlock;
import dhyces.waxablecoral.integration.upgradeaquatic.block.ConduitCoralPlantBlock;
import dhyces.waxablecoral.integration.upgradeaquatic.block.ConduitCoralWallFanBlock;
import dhyces.waxablecoral.integration.upgradeaquatic.block.WaxedCoralShowerBlock;
import dhyces.waxablecoral.services.Services;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.loading.FMLLoader;

import java.util.function.Supplier;

public final class UpgradeAquaticCompat extends Register {
    private UpgradeAquaticCompat() {}

    public static void init(IEventBus modBus) {
        modBus.addListener(UpgradeAquaticCompat::addToCreativeTab);
        modBus.addListener(UpgradeAquaticCompat::commonLoaded);

        if (FMLLoader.getDist().isClient()) {
            UpgradeAquaticCompatClient.init(modBus);
        }
    }

    public static final Supplier<Block> WAXED_ACAN_CORAL_BLOCK = registerBlock("waxed_acan_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.ACAN_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_FINGER_CORAL_BLOCK = registerBlock("waxed_finger_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.FINGER_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_STAR_CORAL_BLOCK = registerBlock("waxed_star_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.STAR_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_MOSS_CORAL_BLOCK = registerBlock("waxed_moss_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.MOSS_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_PETAL_CORAL_BLOCK = registerBlock("waxed_petal_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.PETAL_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_BRANCH_CORAL_BLOCK = registerBlock("waxed_branch_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.BRANCH_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_ROCK_CORAL_BLOCK = registerBlock("waxed_rock_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.ROCK_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_PILLOW_CORAL_BLOCK = registerBlock("waxed_pillow_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.PILLOW_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_SILK_CORAL_BLOCK = registerBlock("waxed_silk_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.SILK_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_CHROME_CORAL_BLOCK = registerBlock("waxed_chrome_coral_block", () -> new Block(BlockBehaviour.Properties.copy(UABlocks.CHROME_CORAL_BLOCK.get())));
    public static final Supplier<Block> WAXED_PRISMARINE_CORAL_BLOCK = registerBlock("waxed_prismarine_coral_block", () -> new ConduitCoralBlock(UABlocks.UAProperties.createPrismarineCoralBlock(false)));

    public static final Supplier<BaseCoralPlantBlock> WAXED_ACAN_CORAL = registerBlock("waxed_acan_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.ACAN_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_FINGER_CORAL = registerBlock("waxed_finger_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.FINGER_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_STAR_CORAL = registerBlock("waxed_star_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.STAR_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_MOSS_CORAL = registerBlock("waxed_moss_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.MOSS_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_PETAL_CORAL = registerBlock("waxed_petal_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.PETAL_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_BRANCH_CORAL = registerBlock("waxed_branch_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.BRANCH_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_ROCK_CORAL = registerBlock("waxed_rock_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.ROCK_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_PILLOW_CORAL = registerBlock("waxed_pillow_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.PILLOW_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_SILK_CORAL = registerBlock("waxed_silk_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.SILK_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_CHROME_CORAL = registerBlock("waxed_chrome_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.copy(UABlocks.CHROME_CORAL.get())));
    public static final Supplier<BaseCoralPlantBlock> WAXED_PRISMARINE_CORAL = registerBlock("waxed_prismarine_coral", () -> new ConduitCoralPlantBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final Supplier<BaseCoralFanBlock> WAXED_ACAN_CORAL_FAN = registerBlock("waxed_acan_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.ACAN_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_FINGER_CORAL_FAN = registerBlock("waxed_finger_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.FINGER_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_STAR_CORAL_FAN = registerBlock("waxed_star_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.STAR_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_MOSS_CORAL_FAN = registerBlock("waxed_moss_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.MOSS_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_PETAL_CORAL_FAN = registerBlock("waxed_petal_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.PETAL_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_BRANCH_CORAL_FAN = registerBlock("waxed_branch_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.BRANCH_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_ROCK_CORAL_FAN = registerBlock("waxed_rock_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.ROCK_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_PILLOW_CORAL_FAN = registerBlock("waxed_pillow_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.PILLOW_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_SILK_CORAL_FAN = registerBlock("waxed_silk_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.SILK_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_CHROME_CORAL_FAN = registerBlock("waxed_chrome_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.copy(UABlocks.CHROME_CORAL_FAN.get())));
    public static final Supplier<BaseCoralFanBlock> WAXED_PRISMARINE_CORAL_FAN = registerBlock("waxed_prismarine_coral_fan", () -> new ConduitCoralFanBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final Supplier<BaseCoralWallFanBlock> WAXED_ACAN_CORAL_WALL_FAN = registerBlock("waxed_acan_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.ACAN_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_FINGER_CORAL_WALL_FAN = registerBlock("waxed_finger_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.FINGER_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_STAR_CORAL_WALL_FAN = registerBlock("waxed_star_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.STAR_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_MOSS_CORAL_WALL_FAN = registerBlock("waxed_moss_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.MOSS_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_PETAL_CORAL_WALL_FAN = registerBlock("waxed_petal_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.PETAL_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_BRANCH_CORAL_WALL_FAN = registerBlock("waxed_branch_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.BRANCH_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_ROCK_CORAL_WALL_FAN = registerBlock("waxed_rock_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.ROCK_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_PILLOW_CORAL_WALL_FAN = registerBlock("waxed_pillow_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.PILLOW_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_SILK_CORAL_WALL_FAN = registerBlock("waxed_silk_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.SILK_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_CHROME_CORAL_WALL_FAN = registerBlock("waxed_chrome_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.copy(UABlocks.CHROME_CORAL_WALL_FAN.get())));
    public static final Supplier<BaseCoralWallFanBlock> WAXED_PRISMARINE_CORAL_WALL_FAN = registerBlock("waxed_prismarine_coral_wall_fan", () -> new ConduitCoralWallFanBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final Supplier<WaxedCoralShowerBlock> WAXED_PRISMARINE_CORAL_SHOWER = registerBlock("waxed_prismarine_coral_shower", () -> new WaxedCoralShowerBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final Supplier<BlockItem> WAXED_ACAN_CORAL_BLOCK_ITEM = registerBlockItem("waxed_acan_coral_block", WAXED_ACAN_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_FINGER_CORAL_BLOCK_ITEM = registerBlockItem("waxed_finger_coral_block", WAXED_FINGER_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_STAR_CORAL_BLOCK_ITEM = registerBlockItem("waxed_star_coral_block", WAXED_STAR_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_MOSS_CORAL_BLOCK_ITEM = registerBlockItem("waxed_moss_coral_block", WAXED_MOSS_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_PETAL_CORAL_BLOCK_ITEM = registerBlockItem("waxed_petal_coral_block", WAXED_PETAL_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_BRANCH_CORAL_BLOCK_ITEM = registerBlockItem("waxed_branch_coral_block", WAXED_BRANCH_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_ROCK_CORAL_BLOCK_ITEM = registerBlockItem("waxed_rock_coral_block", WAXED_ROCK_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_PILLOW_CORAL_BLOCK_ITEM = registerBlockItem("waxed_pillow_coral_block", WAXED_PILLOW_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_SILK_CORAL_BLOCK_ITEM = registerBlockItem("waxed_silk_coral_block", WAXED_SILK_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_CHROME_CORAL_BLOCK_ITEM = registerBlockItem("waxed_chrome_coral_block", WAXED_CHROME_CORAL_BLOCK);
    public static final Supplier<BlockItem> WAXED_PRISMARINE_CORAL_BLOCK_ITEM = registerBlockItem("waxed_prismarine_coral_block", WAXED_PRISMARINE_CORAL_BLOCK);

    public static final Supplier<BlockItem> WAXED_ACAN_CORAL_ITEM = registerBlockItem("waxed_acan_coral", WAXED_ACAN_CORAL);
    public static final Supplier<BlockItem> WAXED_FINGER_CORAL_ITEM = registerBlockItem("waxed_finger_coral", WAXED_FINGER_CORAL);
    public static final Supplier<BlockItem> WAXED_STAR_CORAL_CORAL_ITEM = registerBlockItem("waxed_star_coral", WAXED_STAR_CORAL);
    public static final Supplier<BlockItem> WAXED_MOSS_CORAL_CORAL_ITEM = registerBlockItem("waxed_moss_coral", WAXED_MOSS_CORAL);
    public static final Supplier<BlockItem> WAXED_PETAL_CORAL_CORAL_ITEM = registerBlockItem("waxed_petal_coral", WAXED_PETAL_CORAL);
    public static final Supplier<BlockItem> WAXED_BRANCH_CORAL_CORAL_ITEM = registerBlockItem("waxed_branch_coral", WAXED_BRANCH_CORAL);
    public static final Supplier<BlockItem> WAXED_ROCK_CORAL_CORAL_ITEM = registerBlockItem("waxed_rock_coral", WAXED_ROCK_CORAL);
    public static final Supplier<BlockItem> WAXED_PILLOW_CORAL_CORAL_ITEM = registerBlockItem("waxed_pillow_coral", WAXED_PILLOW_CORAL);
    public static final Supplier<BlockItem> WAXED_SILK_CORAL_CORAL_ITEM = registerBlockItem("waxed_silk_coral", WAXED_SILK_CORAL);
    public static final Supplier<BlockItem> WAXED_CHROME_CORAL_CORAL_ITEM = registerBlockItem("waxed_chrome_coral", WAXED_CHROME_CORAL);
    public static final Supplier<BlockItem> WAXED_PRISMARINE_CORAL_CORAL_ITEM = registerBlockItem("waxed_prismarine_coral", WAXED_PRISMARINE_CORAL);

    public static final Supplier<StandingAndWallBlockItem> WAXED_ACAN_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_acan_coral_fan", WAXED_ACAN_CORAL_FAN, WAXED_ACAN_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_FINGER_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_finger_coral_fan", WAXED_FINGER_CORAL_FAN, WAXED_FINGER_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_STAR_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_star_coral_fan", WAXED_STAR_CORAL_FAN, WAXED_STAR_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_MOSS_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_moss_coral_fan", WAXED_MOSS_CORAL_FAN, WAXED_MOSS_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_PETAL_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_petal_coral_fan", WAXED_PETAL_CORAL_FAN, WAXED_PETAL_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_BRANCH_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_branch_coral_fan", WAXED_BRANCH_CORAL_FAN, WAXED_BRANCH_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_ROCK_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_rock_coral_fan", WAXED_ROCK_CORAL_FAN, WAXED_ROCK_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_PILLOW_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_pillow_coral_fan", WAXED_PILLOW_CORAL_FAN, WAXED_PILLOW_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_SILK_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_silk_coral_fan", WAXED_SILK_CORAL_FAN, WAXED_SILK_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_CHROME_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_chrome_coral_fan", WAXED_CHROME_CORAL_FAN, WAXED_CHROME_CORAL_WALL_FAN);
    public static final Supplier<StandingAndWallBlockItem> WAXED_PRISMARINE_CORAL_CORAL_FAN_ITEM = registerStandingWallBlockItem("waxed_prismarine_coral_fan", WAXED_PRISMARINE_CORAL_FAN, WAXED_PRISMARINE_CORAL_WALL_FAN);

    public static final Supplier<BlockItem> WAXED_PRISMARINE_CORAL_SHOWER_ITEM = registerItem("waxed_prismarine_coral_shower", () -> new BlockItem(WAXED_PRISMARINE_CORAL_SHOWER.get(), new Item.Properties()));

    public static void addWaxing() {
        WaxableCoralAPI.addBehaviors(biMap -> {
            biMap.put(UABlocks.ACAN_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK.get());
            biMap.put(UABlocks.ACAN_CORAL.get(), UpgradeAquaticCompat.WAXED_ACAN_CORAL.get());
            biMap.put(UABlocks.ACAN_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN.get());
            biMap.put(UABlocks.ACAN_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.FINGER_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK.get());
            biMap.put(UABlocks.FINGER_CORAL.get(), UpgradeAquaticCompat.WAXED_FINGER_CORAL.get());
            biMap.put(UABlocks.FINGER_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN.get());
            biMap.put(UABlocks.FINGER_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.STAR_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK.get());
            biMap.put(UABlocks.STAR_CORAL.get(), UpgradeAquaticCompat.WAXED_STAR_CORAL.get());
            biMap.put(UABlocks.STAR_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN.get());
            biMap.put(UABlocks.STAR_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.MOSS_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK.get());
            biMap.put(UABlocks.MOSS_CORAL.get(), UpgradeAquaticCompat.WAXED_MOSS_CORAL.get());
            biMap.put(UABlocks.MOSS_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN.get());
            biMap.put(UABlocks.MOSS_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.PETAL_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK.get());
            biMap.put(UABlocks.PETAL_CORAL.get(), UpgradeAquaticCompat.WAXED_PETAL_CORAL.get());
            biMap.put(UABlocks.PETAL_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN.get());
            biMap.put(UABlocks.PETAL_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.BRANCH_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK.get());
            biMap.put(UABlocks.BRANCH_CORAL.get(), UpgradeAquaticCompat.WAXED_BRANCH_CORAL.get());
            biMap.put(UABlocks.BRANCH_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN.get());
            biMap.put(UABlocks.BRANCH_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.ROCK_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK.get());
            biMap.put(UABlocks.ROCK_CORAL.get(), UpgradeAquaticCompat.WAXED_ROCK_CORAL.get());
            biMap.put(UABlocks.ROCK_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN.get());
            biMap.put(UABlocks.ROCK_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.PILLOW_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK.get());
            biMap.put(UABlocks.PILLOW_CORAL.get(), UpgradeAquaticCompat.WAXED_PILLOW_CORAL.get());
            biMap.put(UABlocks.PILLOW_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN.get());
            biMap.put(UABlocks.PILLOW_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.SILK_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK.get());
            biMap.put(UABlocks.SILK_CORAL.get(), UpgradeAquaticCompat.WAXED_SILK_CORAL.get());
            biMap.put(UABlocks.SILK_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN.get());
            biMap.put(UABlocks.SILK_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.CHROME_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK.get());
            biMap.put(UABlocks.CHROME_CORAL.get(), UpgradeAquaticCompat.WAXED_CHROME_CORAL.get());
            biMap.put(UABlocks.CHROME_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN.get());
            biMap.put(UABlocks.CHROME_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.PRISMARINE_CORAL_BLOCK.get(), UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK.get());
            biMap.put(UABlocks.PRISMARINE_CORAL.get(), UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL.get());
            biMap.put(UABlocks.PRISMARINE_CORAL_FAN.get(), UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN.get());
            biMap.put(UABlocks.PRISMARINE_CORAL_WALL_FAN.get(), UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN.get());

            biMap.put(UABlocks.PRISMARINE_CORAL_SHOWER.get(), UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER.get());
        });
    }

    private static void commonLoaded(final FMLCommonSetupEvent event) {
        event.enqueueWork(UpgradeAquaticCompat::addWaxing);
    }

    private static void addToCreativeTab(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            putAllAfterFullVis(event.getEntries(), Register.WAXED_HORN_CORAL_BLOCK_ITEM.get(),
                    WAXED_ACAN_CORAL_BLOCK,
                    WAXED_FINGER_CORAL_BLOCK,
                    WAXED_STAR_CORAL_BLOCK,
                    WAXED_MOSS_CORAL_BLOCK,
                    WAXED_PETAL_CORAL_BLOCK,
                    WAXED_BRANCH_CORAL_BLOCK,
                    WAXED_ROCK_CORAL_BLOCK,
                    WAXED_PILLOW_CORAL_BLOCK,
                    WAXED_SILK_CORAL_BLOCK,
                    WAXED_CHROME_CORAL_BLOCK,
                    WAXED_PRISMARINE_CORAL_BLOCK
            );
            putAllAfterFullVis(event.getEntries(), Register.WAXED_HORN_CORAL_ITEM.get(),
                    WAXED_ACAN_CORAL,
                    WAXED_FINGER_CORAL,
                    WAXED_STAR_CORAL,
                    WAXED_MOSS_CORAL,
                    WAXED_PETAL_CORAL,
                    WAXED_BRANCH_CORAL,
                    WAXED_ROCK_CORAL,
                    WAXED_PILLOW_CORAL,
                    WAXED_SILK_CORAL,
                    WAXED_CHROME_CORAL,
                    WAXED_PRISMARINE_CORAL
            );
            putAllAfterFullVis(event.getEntries(), Register.WAXED_HORN_CORAL_FAN_ITEM.get(),
                    WAXED_ACAN_CORAL_FAN,
                    WAXED_FINGER_CORAL_FAN,
                    WAXED_STAR_CORAL_FAN,
                    WAXED_MOSS_CORAL_FAN,
                    WAXED_PETAL_CORAL_FAN,
                    WAXED_BRANCH_CORAL_FAN,
                    WAXED_ROCK_CORAL_FAN,
                    WAXED_PILLOW_CORAL_FAN,
                    WAXED_SILK_CORAL_FAN,
                    WAXED_CHROME_CORAL_FAN,
                    WAXED_PRISMARINE_CORAL_FAN
            );
            putBeforeFullVis(event.getEntries(), Items.SPONGE, WAXED_PRISMARINE_CORAL_SHOWER.get());
        }
    }

    private static void putAllBeforeFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, Supplier<? extends Block>... regObjs) {
        for (Supplier<? extends Block> obj : regObjs) {
            putBeforeFullVis(tabItems, item, obj.get());
        }
    }

    private static void putBeforeFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, ItemLike regObj) {
        tabItems.putBefore(item.getDefaultInstance(), regObj.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void putAllAfterFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, Supplier<? extends Block>... regObjs) {
        Item last = item;
        for (Supplier<? extends Block> obj : regObjs) {
            putAfterFullVis(tabItems, last, obj.get());
            last = obj.get().asItem();
        }
    }

    private static void putAfterFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, ItemLike regObj) {
        tabItems.putAfter(item.getDefaultInstance(), regObj.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
