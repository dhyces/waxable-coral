package dhyces.waxablecoral;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.ConditionUserBuilder;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockLootTableProvider extends LootTableProvider {
    public ModBlockLootTableProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return List.of(Pair.of(ModBlockLoot::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
        // NO-OP
    }

    static class ModBlockLoot implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>> {

        private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(ImmutableSet.toImmutableSet());
        private final Map<ResourceLocation, LootTable.Builder> map = Maps.newHashMap();

        protected void addTables() {
            dropSelf(Register.WAXED_TUBE_CORAL_BLOCK.get());
            dropSelf(Register.WAXED_BRAIN_CORAL_BLOCK.get());
            dropSelf(Register.WAXED_BUBBLE_CORAL_BLOCK.get());
            dropSelf(Register.WAXED_FIRE_CORAL_BLOCK.get());
            dropSelf(Register.WAXED_HORN_CORAL_BLOCK.get());

            dropSelf(Register.WAXED_TUBE_CORAL.get());
            dropSelf(Register.WAXED_BRAIN_CORAL.get());
            dropSelf(Register.WAXED_BUBBLE_CORAL.get());
            dropSelf(Register.WAXED_FIRE_CORAL.get());
            dropSelf(Register.WAXED_HORN_CORAL.get());

            dropSelf(Register.WAXED_TUBE_CORAL_FAN.get());
            dropSelf(Register.WAXED_BRAIN_CORAL_FAN.get());
            dropSelf(Register.WAXED_BUBBLE_CORAL_FAN.get());
            dropSelf(Register.WAXED_FIRE_CORAL_FAN.get());
            dropSelf(Register.WAXED_HORN_CORAL_FAN.get());

            dropSelf(Register.WAXED_TUBE_CORAL_WALL_FAN.get());
            dropSelf(Register.WAXED_BRAIN_CORAL_WALL_FAN.get());
            dropSelf(Register.WAXED_BUBBLE_CORAL_WALL_FAN.get());
            dropSelf(Register.WAXED_FIRE_CORAL_WALL_FAN.get());
            dropSelf(Register.WAXED_HORN_CORAL_WALL_FAN.get());
        }

        protected static <T extends ConditionUserBuilder<T>> T applyExplosionCondition(ItemLike pItem, ConditionUserBuilder<T> pCondition) {
            return (T)(!EXPLOSION_RESISTANT.contains(pItem.asItem()) ? pCondition.when(ExplosionCondition.survivesExplosion()) : pCondition.unwrap());
        }

        protected static LootTable.Builder createSingleItemTable(ItemLike p_124127_) {
            return LootTable.lootTable().withPool(applyExplosionCondition(p_124127_, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(p_124127_))));
        }

        public void dropOther(Block pBlock, ItemLike pDrop) {
            this.add(pBlock, createSingleItemTable(pDrop));
        }

        public void dropSelf(Block pBlock) {
            this.dropOther(pBlock, pBlock);
        }

        protected void add(Block pBlock, LootTable.Builder pLootTableBuilder) {
            this.map.put(pBlock.getLootTable(), pLootTableBuilder);
        }

        @Override
        public void accept(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            this.addTables();

            for (Map.Entry<ResourceLocation, LootTable.Builder> entry : map.entrySet()) {
                consumer.accept(entry.getKey(), entry.getValue());
            }
        }
    }
}
