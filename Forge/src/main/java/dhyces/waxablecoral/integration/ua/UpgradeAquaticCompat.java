package dhyces.waxablecoral.integration.ua;

import com.teamabnormals.upgrade_aquatic.common.block.ConduitSupportingBlock;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.WaxableCoralAPI;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MaterialColor;

public class UpgradeAquaticCompat extends Register {
    public static void init() {}

    public static final CommonRegistryObject<Block> WAXED_ACAN_CORAL_BLOCK = registerCoralBlock("waxed_acan_coral_block", coralBlockProperties(MaterialColor.COLOR_CYAN, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_FINGER_CORAL_BLOCK = registerCoralBlock("waxed_finger_coral_block", coralBlockProperties(MaterialColor.TERRACOTTA_ORANGE, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_STAR_CORAL_BLOCK = registerCoralBlock("waxed_star_coral_block", coralBlockProperties(MaterialColor.COLOR_LIGHT_GREEN, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_MOSS_CORAL_BLOCK = registerCoralBlock("waxed_moss_coral_block", coralBlockProperties(MaterialColor.COLOR_GREEN, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_PETAL_CORAL_BLOCK = registerCoralBlock("waxed_petal_coral_block", coralBlockProperties(MaterialColor.COLOR_LIGHT_BLUE, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_BRANCH_CORAL_BLOCK = registerCoralBlock("waxed_branch_coral_block", coralBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_ROCK_CORAL_BLOCK = registerCoralBlock("waxed_rock_coral_block", coralBlockProperties(MaterialColor.COLOR_BROWN, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_PILLOW_CORAL_BLOCK = registerCoralBlock("waxed_pillow_coral_block", coralBlockProperties(MaterialColor.TERRACOTTA_WHITE, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_SILK_CORAL_BLOCK = registerCoralBlock("waxed_silk_coral_block", coralBlockProperties(MaterialColor.COLOR_PURPLE, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_CHROME_CORAL_BLOCK = registerCoralBlock("waxed_chrome_coral_block", coralBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.CORAL_BLOCK));
    public static final CommonRegistryObject<Block> WAXED_PRISMARINE_CORAL_BLOCK = registerBlock("waxed_prismarine_coral_block", () -> new ConduitSupportingBlock(UABlocks.UAProperties.createPrismarineCoralBlock(false)));
    
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_ACAN_CORAL = registerCoralPlantBlock("waxed_acan_coral", coralPlantBlockProperties(MaterialColor.COLOR_CYAN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_FINGER_CORAL = registerCoralPlantBlock("waxed_finger_coral", coralPlantBlockProperties(MaterialColor.TERRACOTTA_ORANGE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_STAR_CORAL = registerCoralPlantBlock("waxed_star_coral", coralPlantBlockProperties(MaterialColor.COLOR_LIGHT_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_MOSS_CORAL = registerCoralPlantBlock("waxed_moss_coral", coralPlantBlockProperties(MaterialColor.COLOR_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_PETAL_CORAL = registerCoralPlantBlock("waxed_petal_coral", coralPlantBlockProperties(MaterialColor.COLOR_LIGHT_BLUE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_BRANCH_CORAL = registerCoralPlantBlock("waxed_branch_coral", coralPlantBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_ROCK_CORAL = registerCoralPlantBlock("waxed_rock_coral", coralPlantBlockProperties(MaterialColor.COLOR_BROWN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_PILLOW_CORAL = registerCoralPlantBlock("waxed_pillow_coral", coralPlantBlockProperties(MaterialColor.TERRACOTTA_WHITE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_SILK_CORAL = registerCoralPlantBlock("waxed_silk_coral", coralPlantBlockProperties(MaterialColor.COLOR_PURPLE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_CHROME_CORAL = registerCoralPlantBlock("waxed_chrome_coral", coralPlantBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralPlantBlock> WAXED_PRISMARINE_CORAL = registerBlock("waxed_prismarine_coral", () -> new ConduitCoralPlantBlock(UABlocks.UAProperties.createPrismarineCoral(false)));//registerCoralPlantBlock("waxed_prismarine_coral", coralPlantBlockProperties(MaterialColor.DIAMOND, SoundType.GLASS)); // TODO: add the ability for this to be a conduit frame

    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_ACAN_CORAL_FAN = registerCoralFanBlock("waxed_acan_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_CYAN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_FINGER_CORAL_FAN = registerCoralFanBlock("waxed_finger_coral_fan", coralFanBlockProperties(MaterialColor.TERRACOTTA_ORANGE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_STAR_CORAL_FAN = registerCoralFanBlock("waxed_star_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_LIGHT_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_MOSS_CORAL_FAN = registerCoralFanBlock("waxed_moss_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_PETAL_CORAL_FAN = registerCoralFanBlock("waxed_petal_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_LIGHT_BLUE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_BRANCH_CORAL_FAN = registerCoralFanBlock("waxed_branch_coral_fan", coralFanBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_ROCK_CORAL_FAN = registerCoralFanBlock("waxed_rock_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_BROWN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_PILLOW_CORAL_FAN = registerCoralFanBlock("waxed_pillow_coral_fan", coralFanBlockProperties(MaterialColor.TERRACOTTA_WHITE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_SILK_CORAL_FAN = registerCoralFanBlock("waxed_silk_coral_fan", coralFanBlockProperties(MaterialColor.COLOR_PURPLE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_CHROME_CORAL_FAN = registerCoralFanBlock("waxed_chrome_coral_fan", coralFanBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralFanBlock> WAXED_PRISMARINE_CORAL_FAN = registerBlock("waxed_prismarine_coral_fan", () -> new ConduitCoralFanBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_ACAN_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_acan_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_CYAN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_FINGER_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_finger_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.TERRACOTTA_ORANGE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_STAR_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_star_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_LIGHT_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_MOSS_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_moss_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_GREEN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_PETAL_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_petal_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_LIGHT_BLUE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_BRANCH_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_branch_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_ROCK_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_rock_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_BROWN, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_PILLOW_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_pillow_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.TERRACOTTA_WHITE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_SILK_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_silk_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.COLOR_PURPLE, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_CHROME_CORAL_WALL_FAN = registerCoralWallFanBlock("waxed_chrome_coral_wall_fan", coralWallFanBlockProperties(MaterialColor.TERRACOTTA_GRAY, SoundType.WET_GRASS));
    public static final CommonRegistryObject<BaseCoralWallFanBlock> WAXED_PRISMARINE_CORAL_WALL_FAN = registerBlock("waxed_prismarine_coral_wall_fan", () -> new ConduitCoralWallFanBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final CommonRegistryObject<WaxedCoralShowerBlock> WAXED_PRISMARINE_CORAL_SHOWER = registerBlock("waxed_prismarine_coral_shower", () -> new WaxedCoralShowerBlock(UABlocks.UAProperties.createPrismarineCoral(false)));

    public static final CommonRegistryObject<BlockItem> WAXED_ACAN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_ACAN_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_FINGER_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FINGER_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_STAR_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_STAR_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_MOSS_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_MOSS_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_PETAL_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_PETAL_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_BRANCH_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRANCH_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_ROCK_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_ROCK_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_PILLOW_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_PILLOW_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_SILK_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_SILK_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_CHROME_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_CHROME_CORAL_BLOCK);
    public static final CommonRegistryObject<BlockItem> WAXED_PRISMARINE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_PRISMARINE_CORAL_BLOCK);

    public static final CommonRegistryObject<BlockItem> WAXED_ACAN_CORAL_ITEM = registerPlantItem(WAXED_ACAN_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_FINGER_CORAL_ITEM = registerPlantItem(WAXED_FINGER_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_STAR_CORAL_CORAL_ITEM = registerPlantItem(WAXED_STAR_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_MOSS_CORAL_CORAL_ITEM = registerPlantItem(WAXED_MOSS_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_PETAL_CORAL_CORAL_ITEM = registerPlantItem(WAXED_PETAL_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_BRANCH_CORAL_CORAL_ITEM = registerPlantItem(WAXED_BRANCH_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_ROCK_CORAL_CORAL_ITEM = registerPlantItem(WAXED_ROCK_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_PILLOW_CORAL_CORAL_ITEM = registerPlantItem(WAXED_PILLOW_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_SILK_CORAL_CORAL_ITEM = registerPlantItem(WAXED_SILK_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_CHROME_CORAL_CORAL_ITEM = registerPlantItem(WAXED_CHROME_CORAL);
    public static final CommonRegistryObject<BlockItem> WAXED_PRISMARINE_CORAL_CORAL_ITEM = registerPlantItem(WAXED_PRISMARINE_CORAL);

    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_ACAN_CORAL_FAN_ITEM = registerFanItem(WAXED_ACAN_CORAL_FAN, WAXED_ACAN_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_FINGER_CORAL_FAN_ITEM = registerFanItem(WAXED_FINGER_CORAL_FAN, WAXED_FINGER_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_STAR_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_STAR_CORAL_FAN, WAXED_STAR_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_MOSS_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_MOSS_CORAL_FAN, WAXED_MOSS_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_PETAL_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_PETAL_CORAL_FAN, WAXED_PETAL_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_BRANCH_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_BRANCH_CORAL_FAN, WAXED_BRANCH_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_ROCK_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_ROCK_CORAL_FAN, WAXED_ROCK_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_PILLOW_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_PILLOW_CORAL_FAN, WAXED_PILLOW_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_SILK_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_SILK_CORAL_FAN, WAXED_SILK_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_CHROME_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_CHROME_CORAL_FAN, WAXED_CHROME_CORAL_WALL_FAN);
    public static final CommonRegistryObject<StandingAndWallBlockItem> WAXED_PRISMARINE_CORAL_CORAL_FAN_ITEM = registerFanItem(WAXED_PRISMARINE_CORAL_FAN, WAXED_PRISMARINE_CORAL_WALL_FAN);

    public static final CommonRegistryObject<BlockItem> WAXED_PRISMARINE_CORAL_CORAL_SHOWER_ITEM = registerItem("waxed_prismarine_coral_shower", () -> new BlockItem(WAXED_PRISMARINE_CORAL_SHOWER.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

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
}
