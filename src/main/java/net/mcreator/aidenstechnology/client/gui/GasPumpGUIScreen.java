package net.mcreator.aidenstechnology.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.aidenstechnology.world.inventory.GasPumpGUIMenu;
import net.mcreator.aidenstechnology.network.GasPumpGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GasPumpGUIScreen extends AbstractContainerScreen<GasPumpGUIMenu> {
	private final static HashMap<String, Object> guistate = GasPumpGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_pump;

	public GasPumpGUIScreen(GasPumpGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("aidens_technology:textures/screens/gas_pump_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.aidens_technology.gas_pump_gui.label_gas_pump"), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.aidens_technology.gas_pump_gui.label_empty"), 85, 30, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_pump = Button.builder(Component.translatable("gui.aidens_technology.gas_pump_gui.button_pump"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new GasPumpGUIButtonMessage(0, x, y, z));
				GasPumpGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 52, 46, 20).build();
		guistate.put("button:button_pump", button_pump);
		this.addRenderableWidget(button_pump);
	}
}
