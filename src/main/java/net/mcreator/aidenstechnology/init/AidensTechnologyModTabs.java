
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.aidenstechnology.AidensTechnologyMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AidensTechnologyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AidensTechnologyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AidensTechnologyModItems.MOSIN_NAGANT.get());
			tabData.accept(AidensTechnologyModItems.M_16.get());
			tabData.accept(AidensTechnologyModItems.M_1911.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AidensTechnologyModItems.STEEL_INGOT.get());
			tabData.accept(AidensTechnologyModItems.STEEL_DUST.get());
			tabData.accept(AidensTechnologyModItems.LEAD_INGOT.get());
			tabData.accept(AidensTechnologyModItems.COPPER_NUGGET.get());
			tabData.accept(AidensTechnologyModItems.LEAD_NUGGET.get());
			tabData.accept(AidensTechnologyModItems.OIL_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AidensTechnologyModItems.NOSIN_BULLET_ITEM.get());
			tabData.accept(AidensTechnologyModItems.M_16_BULLET_ITEM.get());
			tabData.accept(AidensTechnologyModItems.JETPACK_CHESTPLATE.get());
			tabData.accept(AidensTechnologyModItems.FUEL_CAN.get());
			tabData.accept(AidensTechnologyModBlocks.GAS_PUMP.get().asItem());
			tabData.accept(AidensTechnologyModItems.LEATHER_BACKPACK.get());
			tabData.accept(AidensTechnologyModItems.REINFORCED_BACKPACK.get());
			tabData.accept(AidensTechnologyModItems.M_1911_BULLET_ITEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AidensTechnologyModBlocks.LEAD_ORE.get().asItem());
		}
	}
}
