package dhyces.waxablecoral;

import dhyces.waxablecoral.integration.ua.UpgradeAquaticCompat;
import dhyces.waxablecoral.registryutil.CommonRegistryObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;

import static dhyces.waxablecoral.Register.*;

public class ModLangProvider extends LanguageProvider {

    public ModLangProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(WAXED_TUBE_CORAL_BLOCK.get(), "Waxed Tube Coral Block");
        add(WAXED_BRAIN_CORAL_BLOCK.get(), "Waxed Brain Coral Block");
        add(WAXED_BUBBLE_CORAL_BLOCK.get(), "Waxed Bubble Coral Block");
        add(WAXED_FIRE_CORAL_BLOCK.get(), "Waxed Fire Coral Block");
        add(WAXED_HORN_CORAL_BLOCK.get(), "Waxed Horn Coral Block");
        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK, "Waxed Acan Coral Block");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK, "Waxed Finger Coral Block");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK, "Waxed Star Coral Block");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK, "Waxed Moss Coral Block");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK, "Waxed Petal Coral Block");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK, "Waxed Branch Coral Block");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK, "Waxed Rock Coral Block");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK, "Waxed Pillow Coral Block");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK, "Waxed Silk Coral Block");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK, "Waxed Chrome Coral Block");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK, "Waxed Prismarine Coral Block");

        add(WAXED_TUBE_CORAL.get(), "Waxed Tube Coral");
        add(WAXED_BRAIN_CORAL.get(), "Waxed Brain Coral");
        add(WAXED_BUBBLE_CORAL.get(), "Waxed Bubble Coral");
        add(WAXED_FIRE_CORAL.get(), "Waxed Fire Coral");
        add(WAXED_HORN_CORAL.get(), "Waxed Horn Coral");
        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL, "Waxed Acan Coral");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL, "Waxed Finger Coral");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL, "Waxed Star Coral");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL, "Waxed Moss Coral");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL, "Waxed Petal Coral");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL, "Waxed Branch Coral");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL, "Waxed Rock Coral");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL, "Waxed Pillow Coral");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL, "Waxed Silk Coral");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL, "Waxed Chrome Coral");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL, "Waxed Prismarine Coral");

        add(WAXED_TUBE_CORAL_FAN.get(), "Waxed Tube Coral Fan");
        add(WAXED_BRAIN_CORAL_FAN.get(), "Waxed Brain Coral Fan");
        add(WAXED_BUBBLE_CORAL_FAN.get(), "Waxed Bubble Coral Fan");
        add(WAXED_FIRE_CORAL_FAN.get(), "Waxed Fire Coral Fan");
        add(WAXED_HORN_CORAL_FAN.get(), "Waxed Horn Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN, "Waxed Acan Coral Fan");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN, "Waxed Finger Coral Fan");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN, "Waxed Star Coral Fan");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN, "Waxed Moss Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN, "Waxed Petal Coral Fan");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN, "Waxed Branch Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN, "Waxed Rock Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN, "Waxed Pillow Coral Fan");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN, "Waxed Silk Coral Fan");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN, "Waxed Chrome Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN, "Waxed Prismarine Coral Fan");

        add(WAXED_TUBE_CORAL_WALL_FAN.get(), "Waxed Tube Coral Fan");
        add(WAXED_BRAIN_CORAL_WALL_FAN.get(), "Waxed Brain Coral Fan");
        add(WAXED_BUBBLE_CORAL_WALL_FAN.get(), "Waxed Bubble Coral Fan");
        add(WAXED_FIRE_CORAL_WALL_FAN.get(), "Waxed Fire Coral Fan");
        add(WAXED_HORN_CORAL_WALL_FAN.get(), "Waxed Horn Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN, "Waxed Acan Coral Fan");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN, "Waxed Finger Coral Fan");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN, "Waxed Star Coral Fan");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN, "Waxed Moss Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN, "Waxed Petal Coral Fan");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN, "Waxed Branch Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN, "Waxed Rock Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN, "Waxed Pillow Coral Fan");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN, "Waxed Silk Coral Fan");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN, "Waxed Chrome Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN, "Waxed Prismarine Coral Fan");

        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER, "Waxed Prismarine Coral Shower");
    }

    private void add(CommonRegistryObject<? extends Block> block, String translation) {
        add(block.get(), translation);
    }
}
