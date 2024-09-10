
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.aidenstechnology.block.entity.RecorderBlockEntity;
import net.mcreator.aidenstechnology.block.entity.RecordPlayerBlockEntity;
import net.mcreator.aidenstechnology.block.entity.GasPumpBlockEntity;
import net.mcreator.aidenstechnology.AidensTechnologyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AidensTechnologyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AidensTechnologyMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GAS_PUMP = register("gas_pump", AidensTechnologyModBlocks.GAS_PUMP, GasPumpBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RECORDER = register("recorder", AidensTechnologyModBlocks.RECORDER, RecorderBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RECORD_PLAYER = register("record_player", AidensTechnologyModBlocks.RECORD_PLAYER, RecordPlayerBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GAS_PUMP.get(), (blockEntity, side) -> ((GasPumpBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RECORDER.get(), (blockEntity, side) -> ((RecorderBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RECORD_PLAYER.get(), (blockEntity, side) -> ((RecordPlayerBlockEntity) blockEntity).getItemHandler());
	}
}
