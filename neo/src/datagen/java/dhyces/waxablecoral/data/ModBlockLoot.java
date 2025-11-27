package dhyces.waxablecoral.data;

import com.google.common.collect.ImmutableSet;
import dhyces.waxablecoral.Register;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.ConditionUserBuilder;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class ModBlockLoot implements LootTableSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(ImmutableSet.toImmutableSet());
    private final Map<ResourceKey<LootTable>, LootTable.Builder> map = new Object2ObjectArrayMap<>();

    public ModBlockLoot(HolderLookup.Provider provider) {}

    protected void addTables() {
        dropSelf(Register.WAXED_TUBE_CORAL_BLOCK);
        dropSelf(Register.WAXED_BRAIN_CORAL_BLOCK);
        dropSelf(Register.WAXED_BUBBLE_CORAL_BLOCK);
        dropSelf(Register.WAXED_FIRE_CORAL_BLOCK);
        dropSelf(Register.WAXED_HORN_CORAL_BLOCK);

        dropSelf(Register.WAXED_TUBE_CORAL);
        dropSelf(Register.WAXED_BRAIN_CORAL);
        dropSelf(Register.WAXED_BUBBLE_CORAL);
        dropSelf(Register.WAXED_FIRE_CORAL);
        dropSelf(Register.WAXED_HORN_CORAL);

        dropSelf(Register.WAXED_TUBE_CORAL_FAN);
        dropSelf(Register.WAXED_BRAIN_CORAL_FAN);
        dropSelf(Register.WAXED_BUBBLE_CORAL_FAN);
        dropSelf(Register.WAXED_FIRE_CORAL_FAN);
        dropSelf(Register.WAXED_HORN_CORAL_FAN);
    }

    protected static <T extends ConditionUserBuilder<T>> T applyExplosionCondition(ItemLike pItem, ConditionUserBuilder<T> pCondition) {
        return !EXPLOSION_RESISTANT.contains(pItem.asItem()) ? pCondition.when(ExplosionCondition.survivesExplosion()) : pCondition.unwrap();
    }

    protected static LootTable.Builder createSingleItemTable(ItemLike p_124127_) {
        return LootTable.lootTable().withPool(applyExplosionCondition(p_124127_, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(p_124127_))));
    }

    public void dropOther(Holder<Block> block, ItemLike drop) {
        this.add(block, createSingleItemTable(drop));
    }

    public void dropSelf(Holder<Block> block) {
        this.dropOther(block, block.value());
    }

    protected void add(Holder<Block> block, LootTable.Builder lootTableBuilder) {
        block.value().getLootTable().ifPresent(key -> {
            this.map.put(key, lootTableBuilder);
        });
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        this.addTables();

        for (Map.Entry<ResourceKey<LootTable>, LootTable.Builder> entry : map.entrySet()) {
            output.accept(entry.getKey(), entry.getValue());
        }
    }
}
