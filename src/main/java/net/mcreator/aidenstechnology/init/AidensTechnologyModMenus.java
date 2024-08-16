
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.aidenstechnology.world.inventory.GasPumpGUIMenu;
import net.mcreator.aidenstechnology.AidensTechnologyMod;

public class AidensTechnologyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AidensTechnologyMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<GasPumpGUIMenu>> GAS_PUMP_GUI = REGISTRY.register("gas_pump_gui", () -> IMenuTypeExtension.create(GasPumpGUIMenu::new));
}
