package dhyces.waxablecoral.data;

import dhyces.waxablecoral.WaxableCoral;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static dhyces.waxablecoral.Register.*;

public class ModLangProvider extends LanguageProvider {

    public ModLangProvider(PackOutput output) {
        super(output, WaxableCoral.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(WAXED_TUBE_CORAL_BLOCK::value, "Waxed Tube Coral Block");
        addBlock(WAXED_BRAIN_CORAL_BLOCK::value, "Waxed Brain Coral Block");
        addBlock(WAXED_BUBBLE_CORAL_BLOCK::value, "Waxed Bubble Coral Block");
        addBlock(WAXED_FIRE_CORAL_BLOCK::value, "Waxed Fire Coral Block");
        addBlock(WAXED_HORN_CORAL_BLOCK::value, "Waxed Horn Coral Block");

        addBlock(WAXED_TUBE_CORAL::value, "Waxed Tube Coral");
        addBlock(WAXED_BRAIN_CORAL::value, "Waxed Brain Coral");
        addBlock(WAXED_BUBBLE_CORAL::value, "Waxed Bubble Coral");
        addBlock(WAXED_FIRE_CORAL::value, "Waxed Fire Coral");
        addBlock(WAXED_HORN_CORAL::value, "Waxed Horn Coral");

        addBlock(WAXED_TUBE_CORAL_FAN::value, "Waxed Tube Coral Fan");
        addBlock(WAXED_BRAIN_CORAL_FAN::value, "Waxed Brain Coral Fan");
        addBlock(WAXED_BUBBLE_CORAL_FAN::value, "Waxed Bubble Coral Fan");
        addBlock(WAXED_FIRE_CORAL_FAN::value, "Waxed Fire Coral Fan");
        addBlock(WAXED_HORN_CORAL_FAN::value, "Waxed Horn Coral Fan");

        addBlock(WAXED_TUBE_CORAL_WALL_FAN::value, "Waxed Tube Coral Fan");
        addBlock(WAXED_BRAIN_CORAL_WALL_FAN::value, "Waxed Brain Coral Fan");
        addBlock(WAXED_BUBBLE_CORAL_WALL_FAN::value, "Waxed Bubble Coral Fan");
        addBlock(WAXED_FIRE_CORAL_WALL_FAN::value, "Waxed Fire Coral Fan");
        addBlock(WAXED_HORN_CORAL_WALL_FAN::value, "Waxed Horn Coral Fan");
    }
}
