
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.aidenstechnology.block.OilBlock;
import net.mcreator.aidenstechnology.block.LeadOreBlock;
import net.mcreator.aidenstechnology.block.GasPumpBlock;
import net.mcreator.aidenstechnology.AidensTechnologyMod;

public class AidensTechnologyModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AidensTechnologyMod.MODID);
	public static final DeferredHolder<Block, Block> LEAD_ORE = REGISTRY.register("lead_ore", LeadOreBlock::new);
	public static final DeferredHolder<Block, Block> OIL = REGISTRY.register("oil", OilBlock::new);
	public static final DeferredHolder<Block, Block> GAS_PUMP = REGISTRY.register("gas_pump", GasPumpBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
