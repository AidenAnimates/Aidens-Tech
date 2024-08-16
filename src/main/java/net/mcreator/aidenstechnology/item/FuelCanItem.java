
package net.mcreator.aidenstechnology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FuelCanItem extends Item {
	public FuelCanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
