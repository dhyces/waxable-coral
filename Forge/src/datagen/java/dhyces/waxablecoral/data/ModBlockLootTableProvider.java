package dhyces.waxablecoral.data;

import dhyces.waxablecoral.ForgeWaxableCoral;
import dhyces.waxablecoral.Register;
import dhyces.waxablecoral.integration.upgradeaquatic.UpgradeAquaticCompat;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;

public class ModBlockLootTableProvider extends LootTableProvider {

    public ModBlockLootTableProvider(PackOutput pOutput) {
        super(pOutput, Set.of(), List.of(new SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS);
        }

        @Override
        protected void generate() {
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

            dropSelf(UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK.get());

            dropSelf(UpgradeAquaticCompat.WAXED_ACAN_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_FINGER_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_STAR_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_MOSS_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PETAL_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_BRANCH_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_ROCK_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PILLOW_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_SILK_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_CHROME_CORAL.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL.get());

            dropSelf(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN.get());

            dropSelf(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN.get());
            dropSelf(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN.get());

            dropSelf(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ForgeWaxableCoral.BLOCK_REGISTER.getEntries().stream().map(RegistryObject::get).toList();
        }
    }
}
