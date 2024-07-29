package dhyces.waxablecoral.data;

import dhyces.waxablecoral.integration.upgradeaquatic.UpgradeAquaticCompat;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static dhyces.waxablecoral.Register.*;

public class ModLangProvider extends LanguageProvider {

    public ModLangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(WAXED_TUBE_CORAL_BLOCK.get(), "Waxed Tube Coral Block");
        add(WAXED_BRAIN_CORAL_BLOCK.get(), "Waxed Brain Coral Block");
        add(WAXED_BUBBLE_CORAL_BLOCK.get(), "Waxed Bubble Coral Block");
        add(WAXED_FIRE_CORAL_BLOCK.get(), "Waxed Fire Coral Block");
        add(WAXED_HORN_CORAL_BLOCK.get(), "Waxed Horn Coral Block");

        add(WAXED_TUBE_CORAL.get(), "Waxed Tube Coral");
        add(WAXED_BRAIN_CORAL.get(), "Waxed Brain Coral");
        add(WAXED_BUBBLE_CORAL.get(), "Waxed Bubble Coral");
        add(WAXED_FIRE_CORAL.get(), "Waxed Fire Coral");
        add(WAXED_HORN_CORAL.get(), "Waxed Horn Coral");

        add(WAXED_TUBE_CORAL_FAN.get(), "Waxed Tube Coral Fan");
        add(WAXED_BRAIN_CORAL_FAN.get(), "Waxed Brain Coral Fan");
        add(WAXED_BUBBLE_CORAL_FAN.get(), "Waxed Bubble Coral Fan");
        add(WAXED_FIRE_CORAL_FAN.get(), "Waxed Fire Coral Fan");
        add(WAXED_HORN_CORAL_FAN.get(), "Waxed Horn Coral Fan");

        add(WAXED_TUBE_CORAL_WALL_FAN.get(), "Waxed Tube Coral Fan");
        add(WAXED_BRAIN_CORAL_WALL_FAN.get(), "Waxed Brain Coral Fan");
        add(WAXED_BUBBLE_CORAL_WALL_FAN.get(), "Waxed Bubble Coral Fan");
        add(WAXED_FIRE_CORAL_WALL_FAN.get(), "Waxed Fire Coral Fan");
        add(WAXED_HORN_CORAL_WALL_FAN.get(), "Waxed Horn Coral Fan");

        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_BLOCK.get(), "Waxed Acan Coral Block");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_BLOCK.get(), "Waxed Finger Coral Block");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_BLOCK.get(), "Waxed Star Coral Block");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_BLOCK.get(), "Waxed Moss Coral Block");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_BLOCK.get(), "Waxed Petal Coral Block");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_BLOCK.get(), "Waxed Branch Coral Block");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_BLOCK.get(), "Waxed Rock Coral Block");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_BLOCK.get(), "Waxed Pillow Coral Block");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_BLOCK.get(), "Waxed Silk Coral Block");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_BLOCK.get(), "Waxed Chrome Coral Block");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_BLOCK.get(), "Waxed Prismarine Coral Block");

        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL.get(), "Waxed Acan Coral");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL.get(), "Waxed Finger Coral");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL.get(), "Waxed Star Coral");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL.get(), "Waxed Moss Coral");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL.get(), "Waxed Petal Coral");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL.get(), "Waxed Branch Coral");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL.get(), "Waxed Rock Coral");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL.get(), "Waxed Pillow Coral");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL.get(), "Waxed Silk Coral");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL.get(), "Waxed Chrome Coral");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL.get(), "Waxed Prismarine Coral");

        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_FAN.get(), "Waxed Acan Coral Fan");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_FAN.get(), "Waxed Finger Coral Fan");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_FAN.get(), "Waxed Star Coral Fan");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_FAN.get(), "Waxed Moss Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_FAN.get(), "Waxed Petal Coral Fan");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_FAN.get(), "Waxed Branch Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_FAN.get(), "Waxed Rock Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_FAN.get(), "Waxed Pillow Coral Fan");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_FAN.get(), "Waxed Silk Coral Fan");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_FAN.get(), "Waxed Chrome Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_FAN.get(), "Waxed Prismarine Coral Fan");

        add(UpgradeAquaticCompat.WAXED_ACAN_CORAL_WALL_FAN.get(), "Waxed Acan Coral Fan");
        add(UpgradeAquaticCompat.WAXED_FINGER_CORAL_WALL_FAN.get(), "Waxed Finger Coral Fan");
        add(UpgradeAquaticCompat.WAXED_STAR_CORAL_WALL_FAN.get(), "Waxed Star Coral Fan");
        add(UpgradeAquaticCompat.WAXED_MOSS_CORAL_WALL_FAN.get(), "Waxed Moss Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PETAL_CORAL_WALL_FAN.get(), "Waxed Petal Coral Fan");
        add(UpgradeAquaticCompat.WAXED_BRANCH_CORAL_WALL_FAN.get(), "Waxed Branch Coral Fan");
        add(UpgradeAquaticCompat.WAXED_ROCK_CORAL_WALL_FAN.get(), "Waxed Rock Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PILLOW_CORAL_WALL_FAN.get(), "Waxed Pillow Coral Fan");
        add(UpgradeAquaticCompat.WAXED_SILK_CORAL_WALL_FAN.get(), "Waxed Silk Coral Fan");
        add(UpgradeAquaticCompat.WAXED_CHROME_CORAL_WALL_FAN.get(), "Waxed Chrome Coral Fan");
        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_WALL_FAN.get(), "Waxed Prismarine Coral Fan");

        add(UpgradeAquaticCompat.WAXED_PRISMARINE_CORAL_SHOWER.get(), "Waxed Prismarine Coral Shower");
    }
}
