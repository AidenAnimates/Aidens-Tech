
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.aidenstechnology.client.gui.ReinforcedBackpackGUIScreen;
import net.mcreator.aidenstechnology.client.gui.LeatherBackpackGUIScreen;
import net.mcreator.aidenstechnology.client.gui.GasPumpGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AidensTechnologyModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AidensTechnologyModMenus.GAS_PUMP_GUI.get(), GasPumpGUIScreen::new);
		event.register(AidensTechnologyModMenus.LEATHER_BACKPACK_GUI.get(), LeatherBackpackGUIScreen::new);
		event.register(AidensTechnologyModMenus.REINFORCED_BACKPACK_GUI.get(), ReinforcedBackpackGUIScreen::new);
	}
}
