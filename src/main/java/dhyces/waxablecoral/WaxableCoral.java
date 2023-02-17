package dhyces.waxablecoral;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(WaxableCoral.MODID)
public class WaxableCoral {
    public static final String MODID = "waxablecoral";
    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }
    public static final Logger LOGGER = LogManager.getLogger(WaxableCoral.class);

    public static final TagKey<Block> WAXED_CORAL_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_coral_blocks"));
    public static final TagKey<Block> WAXED_CORAL_PLANTS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_coral_plants"));
    public static final TagKey<Block> WAXED_CORALS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_corals"));
    public static final TagKey<Block> WAXED_WALL_CORALS = TagKey.create(Registry.BLOCK_REGISTRY, id("waxed_wall_corals"));

    private static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(Registry.BLOCK_REGISTRY, MODID);
    private static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(Registry.ITEM_REGISTRY, MODID);

    public static final RegistryObject<Block> WAXED_TUBE_CORAL_BLOCK = BLOCK_REGISTER.register("waxed_tube_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.BLUE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_BRAIN_CORAL_BLOCK = BLOCK_REGISTER.register("waxed_brain_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PINK).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_BUBBLE_CORAL_BLOCK = BLOCK_REGISTER.register("waxed_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.PURPLE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_FIRE_CORAL_BLOCK = BLOCK_REGISTER.register("waxed_fire_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.RED).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> WAXED_HORN_CORAL_BLOCK = BLOCK_REGISTER.register("waxed_horn_coral_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, DyeColor.YELLOW).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<BaseCoralPlantBlock> WAXED_TUBE_CORAL = BLOCK_REGISTER.register("waxed_tube_coral", () -> new BaseCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_BRAIN_CORAL = BLOCK_REGISTER.register("waxed_brain_coral", () -> new BaseCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_BUBBLE_CORAL = BLOCK_REGISTER.register("waxed_bubble_coral", () -> new BaseCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_FIRE_CORAL = BLOCK_REGISTER.register("waxed_fire_coral", () -> new BaseCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralPlantBlock> WAXED_HORN_CORAL = BLOCK_REGISTER.register("waxed_horn_coral", () -> new BaseCoralPlantBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));

    public static final RegistryObject<BaseCoralFanBlock> WAXED_TUBE_CORAL_FAN = BLOCK_REGISTER.register("waxed_tube_coral_fan", () -> new BaseCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_BRAIN_CORAL_FAN = BLOCK_REGISTER.register("waxed_brain_coral_fan", () -> new BaseCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_BUBBLE_CORAL_FAN = BLOCK_REGISTER.register("waxed_bubble_coral_fan", () -> new BaseCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_FIRE_CORAL_FAN = BLOCK_REGISTER.register("waxed_fire_coral_fan", () -> new BaseCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralFanBlock> WAXED_HORN_CORAL_FAN = BLOCK_REGISTER.register("waxed_horn_coral_fan", () -> new BaseCoralFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));

    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_TUBE_CORAL_WALL_FAN = BLOCK_REGISTER.register("waxed_tube_coral_wall_fan", () -> new BaseCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.BLUE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_BRAIN_CORAL_WALL_FAN = BLOCK_REGISTER.register("waxed_brain_coral_wall_fan", () -> new BaseCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PINK).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_BUBBLE_CORAL_WALL_FAN = BLOCK_REGISTER.register("waxed_bubble_coral_wall_fan", () -> new BaseCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.PURPLE).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_FIRE_CORAL_WALL_FAN = BLOCK_REGISTER.register("waxed_fire_coral_wall_fan", () -> new BaseCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.RED).noCollission().instabreak().sound(SoundType.WET_GRASS)));
    public static final RegistryObject<BaseCoralWallFanBlock> WAXED_HORN_CORAL_WALL_FAN = BLOCK_REGISTER.register("waxed_horn_coral_wall_fan", () -> new BaseCoralWallFanBlock(BlockBehaviour.Properties.of(Material.WATER_PLANT, DyeColor.YELLOW).noCollission().instabreak().sound(SoundType.WET_GRASS)));

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

    private static final BiMap<Block, Block> WAXING_BIMAP = HashBiMap.create();

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(RegistryObject<T> block) {
        return ITEM_REGISTER.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }

    private static <T extends Block, E extends Block> RegistryObject<StandingAndWallBlockItem> registerStandingWallBlockItem(RegistryObject<T> standingBlock, RegistryObject<E> wallBlock) {
        return ITEM_REGISTER.register(standingBlock.getId().getPath(), () -> new StandingAndWallBlockItem(standingBlock.get(), wallBlock.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }

    public WaxableCoral() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCK_REGISTER.register(modBus);
        ITEM_REGISTER.register(modBus);

        if (!FMLLoader.isProduction()) {
            modBus.addListener(this::datagen);
        }
        if (FMLLoader.getDist().isClient()) {
            WaxableCoralClient.init(modBus);
        }

        modBus.addListener(this::onCommonLoad);
        MinecraftForge.EVENT_BUS.addListener(this::onBlockRightClick);
        MinecraftForge.EVENT_BUS.addListener(this::onAxeWaxOffUsed);
    }

    private void onCommonLoad(final FMLCommonSetupEvent event) {
        event.enqueueWork(this::fillWaxingMap);
    }

    private void fillWaxingMap() {
        WAXING_BIMAP.put(Blocks.TUBE_CORAL_BLOCK, WAXED_TUBE_CORAL_BLOCK.get());
        WAXING_BIMAP.put(Blocks.BRAIN_CORAL_BLOCK, WAXED_BRAIN_CORAL_BLOCK.get());
        WAXING_BIMAP.put(Blocks.BUBBLE_CORAL_BLOCK, WAXED_BUBBLE_CORAL_BLOCK.get());
        WAXING_BIMAP.put(Blocks.FIRE_CORAL_BLOCK, WAXED_FIRE_CORAL_BLOCK.get());
        WAXING_BIMAP.put(Blocks.HORN_CORAL_BLOCK, WAXED_HORN_CORAL_BLOCK.get());

        WAXING_BIMAP.put(Blocks.TUBE_CORAL, WAXED_TUBE_CORAL.get());
        WAXING_BIMAP.put(Blocks.BRAIN_CORAL, WAXED_BRAIN_CORAL.get());
        WAXING_BIMAP.put(Blocks.BUBBLE_CORAL, WAXED_BUBBLE_CORAL.get());
        WAXING_BIMAP.put(Blocks.FIRE_CORAL, WAXED_FIRE_CORAL.get());
        WAXING_BIMAP.put(Blocks.HORN_CORAL, WAXED_HORN_CORAL.get());

        WAXING_BIMAP.put(Blocks.TUBE_CORAL_FAN, WAXED_TUBE_CORAL_FAN.get());
        WAXING_BIMAP.put(Blocks.BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_FAN.get());
        WAXING_BIMAP.put(Blocks.BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_FAN.get());
        WAXING_BIMAP.put(Blocks.FIRE_CORAL_FAN, WAXED_FIRE_CORAL_FAN.get());
        WAXING_BIMAP.put(Blocks.HORN_CORAL_FAN, WAXED_HORN_CORAL_FAN.get());

        WAXING_BIMAP.put(Blocks.TUBE_CORAL_WALL_FAN, WAXED_TUBE_CORAL_WALL_FAN.get());
        WAXING_BIMAP.put(Blocks.BRAIN_CORAL_WALL_FAN, WAXED_BRAIN_CORAL_WALL_FAN.get());
        WAXING_BIMAP.put(Blocks.BUBBLE_CORAL_WALL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN.get());
        WAXING_BIMAP.put(Blocks.FIRE_CORAL_WALL_FAN, WAXED_FIRE_CORAL_WALL_FAN.get());
        WAXING_BIMAP.put(Blocks.HORN_CORAL_WALL_FAN, WAXED_HORN_CORAL_WALL_FAN.get());
    }

    private void datagen(final GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateProvider(event.getGenerator(), MODID, event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModLangProvider(event.getGenerator(), MODID, "en_us"));
        event.getGenerator().addProvider(event.includeClient(), new ModBlockLootTableProvider(event.getGenerator()));
    }

    private void onBlockRightClick(final PlayerInteractEvent.RightClickBlock event) {
        BlockPos waxingPos = event.getHitVec().getBlockPos();
        BlockState state = event.getLevel().getBlockState(waxingPos);
        ItemStack usedStack = event.getItemStack();
        Level level = event.getLevel();
        if ((state.is(BlockTags.CORALS) || state.is(BlockTags.CORAL_BLOCKS) || state.is(BlockTags.WALL_CORALS)) && usedStack.is(Items.HONEYCOMB)) {
            Block waxed = WAXING_BIMAP.get(state.getBlock());
            if (waxed != null) {
                BlockState waxedState = waxed.withPropertiesOf(state);
                level.setBlock(waxingPos, waxedState, Block.UPDATE_ALL_IMMEDIATE);

                if (!event.getEntity().getAbilities().instabuild) {
                    usedStack.shrink(1);
                }
                event.getEntity().awardStat(Stats.ITEM_USED.get(usedStack.getItem()));
                if (event.getEntity() instanceof ServerPlayer serverPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, waxingPos, usedStack);
                }
                level.gameEvent(GameEvent.BLOCK_CHANGE, waxingPos, GameEvent.Context.of(event.getEntity(), waxedState));
                level.levelEvent(event.getEntity(), 3003, waxingPos, 0);
                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }

    private void onAxeWaxOffUsed(final BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction().equals(ToolActions.AXE_WAX_OFF)) {
            BlockState state = event.getLevel().getBlockState(event.getContext().getClickedPos());
            if (state.is(WAXED_CORALS) || state.is(WAXED_CORAL_BLOCKS) || state.is(WAXED_WALL_CORALS)) {
                Block unwaxed = WAXING_BIMAP.inverse().get(state.getBlock());
                if (unwaxed != null) {
                    event.setFinalState(unwaxed.withPropertiesOf(state));
                    event.getLevel().scheduleTick(event.getPos(), unwaxed, 60 + event.getLevel().getRandom().nextInt(40));
                }
            }
        }
    }
}
