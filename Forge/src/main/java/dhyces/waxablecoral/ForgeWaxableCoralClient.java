package dhyces.waxablecoral;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import dhyces.waxablecoral.registration.RegistryObject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.client.event.RegisterItemDecorationsEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

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
            event.accept(Register.WAXED_TUBE_CORAL_BLOCK);
            event.accept(Register.WAXED_BRAIN_CORAL_BLOCK);
            event.accept(Register.WAXED_BUBBLE_CORAL_BLOCK);
            event.accept(Register.WAXED_FIRE_CORAL_BLOCK);
            event.accept(Register.WAXED_HORN_CORAL_BLOCK);

            event.accept(Register.WAXED_TUBE_CORAL);
            event.accept(Register.WAXED_BRAIN_CORAL);
            event.accept(Register.WAXED_BUBBLE_CORAL);
            event.accept(Register.WAXED_FIRE_CORAL);
            event.accept(Register.WAXED_HORN_CORAL);

            event.accept(Register.WAXED_TUBE_CORAL_FAN);
            event.accept(Register.WAXED_BRAIN_CORAL_FAN);
            event.accept(Register.WAXED_BUBBLE_CORAL_FAN);
            event.accept(Register.WAXED_FIRE_CORAL_FAN);
            event.accept(Register.WAXED_HORN_CORAL_FAN);
        }
    }

    private static void registerItemDecorator(RegisterItemDecorationsEvent event) {
        for (RegistryObject<Item> item : Register.ITEM.getEntries()) {
            event.register(item.get(), ForgeWaxableCoralClient::renderWaxedItemDecorator);
        }
        event.register(Items.WAXED_COPPER_BLOCK, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_CUT_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_CUT_COPPER_STAIRS, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_CUT_COPPER_SLAB, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_EXPOSED_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_WEATHERED_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER_STAIRS, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_OXIDIZED_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ForgeWaxableCoralClient::renderWaxedItemDecorator);
        event.register(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, ForgeWaxableCoralClient::renderWaxedItemDecorator);
    }

    public static final ResourceLocation WAXED_ICON = WaxableCoral.id("textures/gui/waxed_icon.png");

    private static boolean renderWaxedItemDecorator(Font font, ItemStack stack, int xOffset, int yOffset, float blitOffset) {
        if (!(Minecraft.getInstance().screen != null && Minecraft.getInstance().screen instanceof AbstractContainerScreen<?> containerScreen && containerScreen.getMenu().getCarried() == stack)) {
            RenderSystem.setShaderTexture(0, WAXED_ICON);
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            Tesselator tesselator = Tesselator.getInstance();
            BufferBuilder builder = tesselator.getBuilder();
            builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
            builder.vertex(xOffset+8, yOffset, blitOffset+200).uv(0, 0).endVertex();
            builder.vertex(xOffset+8, yOffset+8, blitOffset+200).uv(0, 1).endVertex();
            builder.vertex(xOffset+16, yOffset+8, blitOffset+200).uv(1, 1).endVertex();
            builder.vertex(xOffset+16, yOffset, blitOffset+200).uv(1, 0).endVertex();
            tesselator.end();
        }
        return true;
    }
}
