package net.mcreator.aidenstechnology.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.aidenstechnology.world.inventory.RecorderGUIMenu;
import net.mcreator.aidenstechnology.network.RecorderGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RecorderGUIScreen extends AbstractContainerScreen<RecorderGUIMenu> {
	private final static HashMap<String, Object> guistate = RecorderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox RecordedText;
	Button button_write;

	public RecorderGUIScreen(RecorderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("aidens_technology:textures/screens/recorder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		RecordedText.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (RecordedText.isFocused())
			return RecordedText.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String RecordedTextValue = RecordedText.getValue();
		super.resize(minecraft, width, height);
		RecordedText.setValue(RecordedTextValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.aidens_technology.recorder_gui.label_recorder"), 4, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		RecordedText = new EditBox(this.font, this.leftPos + 29, this.topPos + 20, 118, 18, Component.translatable("gui.aidens_technology.recorder_gui.RecordedText")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.aidens_technology.recorder_gui.RecordedText").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.aidens_technology.recorder_gui.RecordedText").getString());
				else
					setSuggestion(null);
			}
		};
		RecordedText.setMaxLength(32767);
		RecordedText.setSuggestion(Component.translatable("gui.aidens_technology.recorder_gui.RecordedText").getString());
		guistate.put("text:RecordedText", RecordedText);
		this.addWidget(this.RecordedText);
		button_write = Button.builder(Component.translatable("gui.aidens_technology.recorder_gui.button_write"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new RecorderGUIButtonMessage(0, x, y, z));
				RecorderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 48, 51, 20).build();
		guistate.put("button:button_write", button_write);
		this.addRenderableWidget(button_write);
	}
}
