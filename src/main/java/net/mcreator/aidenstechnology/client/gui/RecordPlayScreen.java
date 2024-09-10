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

import net.mcreator.aidenstechnology.world.inventory.RecordPlayMenu;
import net.mcreator.aidenstechnology.network.RecordPlayButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RecordPlayScreen extends AbstractContainerScreen<RecordPlayMenu> {
	private final static HashMap<String, Object> guistate = RecordPlayMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_play;

	public RecordPlayScreen(RecordPlayMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("aidens_technology:textures/screens/record_play.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.aidens_technology.record_play.label_record_player"), 4, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_play = Button.builder(Component.translatable("gui.aidens_technology.record_play.button_play"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new RecordPlayButtonMessage(0, x, y, z));
				RecordPlayButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 87, this.topPos + 33, 46, 20).build();
		guistate.put("button:button_play", button_play);
		this.addRenderableWidget(button_play);
	}
}
