
package net.mcreator.aidenstechnology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RecordItem extends Item {
	public RecordItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
