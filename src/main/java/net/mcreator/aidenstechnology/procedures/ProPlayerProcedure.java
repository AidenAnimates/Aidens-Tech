package net.mcreator.aidenstechnology.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.aidenstechnology.init.AidensTechnologyModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ProPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double bpm = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == AidensTechnologyModItems.RECORD.get()
				&& world instanceof Level _level2 && _level2.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			{
				String[] _array = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("recordedText")).split(" ");
				if (_array.length != 0) {
					for (String stringiterator : _array) {
						if (stringiterator.startsWith("b")) {
							if (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(stringiterator.replace("b", "")) > 0) {
								bpm = new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(stringiterator.replace("b", ""));
							}
						}
					}
				} else {
					String stringiterator = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("recordedText"));
					for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
						if (stringiterator.startsWith("b")) {
							if (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(stringiterator.replace("b", "")) > 0) {
								bpm = new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(stringiterator.replace("b", ""));
							}
						}
					}
				}
			}
			long bpmx = (long) bpm;
			Thread cheese = new Thread(new Runnable() {
				public void run() {
					{
						String[] _array = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("recordedText")).split(" ");
						if (_array.length != 0) {
							for (String stringiterator : _array) {
								if ((stringiterator).equals("F#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.5);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.5, false);
										}
									}
								}
								if ((stringiterator).equals("G")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.529732);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.529732, false);
										}
									}
								}
								if ((stringiterator).equals("G#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.561231);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.561231, false);
										}
									}
								}
								if ((stringiterator).equals("A")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.594604);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.594604, false);
										}
									}
								}
								if ((stringiterator).equals("A#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.629961);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.629961, false);
										}
									}
								}
								if ((stringiterator).equals("B")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.66742);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.66742, false);
										}
									}
								}
								if ((stringiterator).equals("C")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.707107);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.707107, false);
										}
									}
								}
								if ((stringiterator).equals("C#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.749154);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.749154, false);
										}
									}
								}
								if ((stringiterator).equals("D")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.793701);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.793701, false);
										}
									}
								}
								if ((stringiterator).equals("D#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.840896);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.840896, false);
										}
									}
								}
								if ((stringiterator).equals("E")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.890899);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.890899, false);
										}
									}
								}
								if ((stringiterator).equals("F")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.943874);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.943874, false);
										}
									}
								}
								if ((stringiterator).equals("F#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 1, false);
										}
									}
								}
								if ((stringiterator).equals("G1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.059463);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.059463, false);
										}
									}
								}
								if ((stringiterator).equals("G#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.122462);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.122462, false);
										}
									}
								}
								if ((stringiterator).equals("A1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.189207);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.189207, false);
										}
									}
								}
								if ((stringiterator).equals("A#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.259921);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.259921, false);
										}
									}
								}
								if ((stringiterator).equals("B1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.33484);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.33484, false);
										}
									}
								}
								if ((stringiterator).equals("C1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.414214);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.414214, false);
										}
									}
								}
								if ((stringiterator).equals("C#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.498307);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.498307, false);
										}
									}
								}
								if ((stringiterator).equals("D1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.587401);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.587401, false);
										}
									}
								}
								if ((stringiterator).equals("D#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.681793);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.681793, false);
										}
									}
								}
								if ((stringiterator).equals("E1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.781797);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.781797, false);
										}
									}
								}
								if ((stringiterator).equals("F1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.887749);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.887749, false);
										}
									}
								}
								if ((stringiterator).equals("F#2")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 2);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 2, false);
										}
									}
								}
								try {
									Thread.sleep(60000 / bpmx);
								} catch (Exception e) {
								}
							}
						} else {
							String stringiterator = ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
									.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("recordedText"));
							for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
								if ((stringiterator).equals("F#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.5);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.5, false);
										}
									}
								}
								if ((stringiterator).equals("G")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.529732);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.529732, false);
										}
									}
								}
								if ((stringiterator).equals("G#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.561231);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.561231, false);
										}
									}
								}
								if ((stringiterator).equals("A")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.594604);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.594604, false);
										}
									}
								}
								if ((stringiterator).equals("A#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.629961);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.629961, false);
										}
									}
								}
								if ((stringiterator).equals("B")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.66742);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.66742, false);
										}
									}
								}
								if ((stringiterator).equals("C")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.707107);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.707107, false);
										}
									}
								}
								if ((stringiterator).equals("C#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.749154);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.749154, false);
										}
									}
								}
								if ((stringiterator).equals("D")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.793701);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.793701, false);
										}
									}
								}
								if ((stringiterator).equals("D#")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.840896);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.840896, false);
										}
									}
								}
								if ((stringiterator).equals("E")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.890899);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.890899, false);
										}
									}
								}
								if ((stringiterator).equals("F")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.943874);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 0.943874, false);
										}
									}
								}
								if ((stringiterator).equals("F#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 1, false);
										}
									}
								}
								if ((stringiterator).equals("G1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.059463);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.059463, false);
										}
									}
								}
								if ((stringiterator).equals("G#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.122462);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.122462, false);
										}
									}
								}
								if ((stringiterator).equals("A1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.189207);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.189207, false);
										}
									}
								}
								if ((stringiterator).equals("A#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.259921);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.259921, false);
										}
									}
								}
								if ((stringiterator).equals("B1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.33484);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.33484, false);
										}
									}
								}
								if ((stringiterator).equals("C1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.414214);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.414214, false);
										}
									}
								}
								if ((stringiterator).equals("C#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.498307);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.498307, false);
										}
									}
								}
								if ((stringiterator).equals("D1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.587401);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.587401, false);
										}
									}
								}
								if ((stringiterator).equals("D#1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.681793);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.681793, false);
										}
									}
								}
								if ((stringiterator).equals("E1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.781797);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.781797, false);
										}
									}
								}
								if ((stringiterator).equals("F1")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.887749);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, (float) 1.887749, false);
										}
									}
								}
								if ((stringiterator).equals("F#2")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 2);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.note_block.harp")), SoundSource.MUSIC, 1, 2, false);
										}
									}
								}
								try {
									Thread.sleep(60000 / bpmx);
								} catch (Exception e) {
								}
							}
						}
					}
				}
			});
			cheese.start();
		}
	}
}
