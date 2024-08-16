
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aidenstechnology.item.SteelIngotItem;
import net.mcreator.aidenstechnology.item.SteelDustItem;
import net.mcreator.aidenstechnology.item.RawLeadItem;
import net.mcreator.aidenstechnology.item.OilItem;
import net.mcreator.aidenstechnology.item.NosinBulletItemItem;
import net.mcreator.aidenstechnology.item.MosinNagantItem;
import net.mcreator.aidenstechnology.item.M16Item;
import net.mcreator.aidenstechnology.item.M16BulletItemItem;
import net.mcreator.aidenstechnology.item.LeadNuggetItem;
import net.mcreator.aidenstechnology.item.LeadIngotItem;
import net.mcreator.aidenstechnology.item.JetpackItem;
import net.mcreator.aidenstechnology.item.FuelCanItem;
import net.mcreator.aidenstechnology.item.CopperNuggetItem;
import net.mcreator.aidenstechnology.AidensTechnologyMod;

public class AidensTechnologyModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AidensTechnologyMod.MODID);
	public static final DeferredHolder<Item, Item> STEEL_INGOT = REGISTRY.register("steel_ingot", SteelIngotItem::new);
	public static final DeferredHolder<Item, Item> STEEL_DUST = REGISTRY.register("steel_dust", SteelDustItem::new);
	public static final DeferredHolder<Item, Item> NOSIN_BULLET_ITEM = REGISTRY.register("nosin_bullet_item", NosinBulletItemItem::new);
	public static final DeferredHolder<Item, Item> MOSIN_NAGANT = REGISTRY.register("mosin_nagant", MosinNagantItem::new);
	public static final DeferredHolder<Item, Item> LEAD_INGOT = REGISTRY.register("lead_ingot", LeadIngotItem::new);
	public static final DeferredHolder<Item, Item> RAW_LEAD = REGISTRY.register("raw_lead", RawLeadItem::new);
	public static final DeferredHolder<Item, Item> LEAD_ORE = block(AidensTechnologyModBlocks.LEAD_ORE);
	public static final DeferredHolder<Item, Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", CopperNuggetItem::new);
	public static final DeferredHolder<Item, Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", LeadNuggetItem::new);
	public static final DeferredHolder<Item, Item> M_16 = REGISTRY.register("m_16", M16Item::new);
	public static final DeferredHolder<Item, Item> M_16_BULLET_ITEM = REGISTRY.register("m_16_bullet_item", M16BulletItemItem::new);
	public static final DeferredHolder<Item, Item> JETPACK_CHESTPLATE = REGISTRY.register("jetpack_chestplate", JetpackItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> FUEL_CAN = REGISTRY.register("fuel_can", FuelCanItem::new);
	public static final DeferredHolder<Item, Item> OIL_BUCKET = REGISTRY.register("oil_bucket", OilItem::new);
	public static final DeferredHolder<Item, Item> GAS_PUMP = block(AidensTechnologyModBlocks.GAS_PUMP);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
