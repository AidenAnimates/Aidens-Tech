
package net.mcreator.aidenstechnology.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.aidenstechnology.init.AidensTechnologyModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(AidensTechnologyModFluids.OIL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
