package dhyces.waxablecoral;

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
    }
}
