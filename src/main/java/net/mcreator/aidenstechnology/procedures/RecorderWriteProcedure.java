package net.mcreator.aidenstechnology.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.aidenstechnology.init.AidensTechnologyModItems;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class RecorderWriteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == AidensTechnologyModItems.RECORD.get()
				&& world instanceof Level _level2 && _level2.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			{
				final String _tagName = "recordedText";
				final String _tagValue = (guistate.containsKey("text:RecordedText") ? ((EditBox) guistate.get("text:RecordedText")).getValue() : "");
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY),
						tag -> tag.putString(_tagName, _tagValue));
			}
			{
				final String _tagName = "recorded";
				final boolean _tagValue = true;
				CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY),
						tag -> tag.putBoolean(_tagName, _tagValue));
			}
		}
	}
}
