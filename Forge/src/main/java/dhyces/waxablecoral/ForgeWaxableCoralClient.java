package dhyces.waxablecoral;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import dhyces.waxablecoral.registration.RegistryObject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemDecorator;
import net.minecraftforge.client.event.RegisterItemDecorationsEvent;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

public class ForgeWaxableCoralClient {
    static void init(IEventBus modBus) {
        modBus.addListener(ForgeWaxableCoralClient::clientSetup);
        modBus.addListener(ForgeWaxableCoralClient::addTabs);
        modBus.addListener(ForgeWaxableCoralClient::registerItemDecorator);
    }

    private static void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }

    private static void addTabs(final CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems = event.getEntries();

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_FAN);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_FAN);

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL);

            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_BLOCK);
            putAfterFullVis(tabItems, Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_BLOCK);
        }
    }

    private static void putAfterFullVis(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> tabItems, Item item, Supplier<? extends Block> regObj) {
        tabItems.putAfter(item.getDefaultInstance(), regObj.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void registerItemDecorator(RegisterItemDecorationsEvent event) {
        for (RegistryObject<Item> item : Register.ITEM.getEntries()) {
            event.register(item.get(), WaxedIconRenderer.INSTANCE);
        }
        event.register(Items.WAXED_COPPER_BLOCK, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_CUT_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_CUT_COPPER_STAIRS, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_CUT_COPPER_SLAB, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_EXPOSED_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_WEATHERED_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER_STAIRS, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_OXIDIZED_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS, WaxedIconRenderer.INSTANCE);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, WaxedIconRenderer.INSTANCE);
    }

    public static final ResourceLocation WAXED_ICON = WaxableCoral.id("textures/gui/waxed_icon.png");

    private static final class WaxedIconRenderer implements IItemDecorator {
        public static final WaxedIconRenderer INSTANCE = new WaxedIconRenderer();
        
        private WaxedIconRenderer() {}
        
        @Override
        public boolean render(PoseStack poseStack, Font font, ItemStack stack, int xOffset, int yOffset) {
            if (!isItemMouseCarried(stack)) {
                RenderSystem.setShaderTexture(0, WAXED_ICON);
                RenderSystem.setShader(GameRenderer::getPositionTexShader);
                Tesselator tesselator = Tesselator.getInstance();
                BufferBuilder builder = tesselator.getBuilder();
                poseStack.pushPose();
                poseStack.translate(xOffset+8, yOffset, 200);
                poseStack.scale(8, 8, 8);
                PoseStack.Pose pose = poseStack.last();
                builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
                builder.vertex(pose.pose(), 0, 0, 0).uv(0, 0).endVertex();
                builder.vertex(pose.pose(), 0, 1, 0).uv(0, 1).endVertex();
                builder.vertex(pose.pose(), 1, 1, 0).uv(1, 1).endVertex();
                builder.vertex(pose.pose(), 1, 0, 0).uv(1, 0).endVertex();
                poseStack.popPose();
                tesselator.end();
                return true;
            }
            return false;
        }

        private boolean isItemMouseCarried(ItemStack stack) {
            return Minecraft.getInstance().screen != null && Minecraft.getInstance().screen instanceof AbstractContainerScreen<?> containerScreen && containerScreen.getMenu().getCarried() == stack;
        }
    }
}
