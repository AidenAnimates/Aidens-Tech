
package net.mcreator.aidenstechnology.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.aidenstechnology.init.AidensTechnologyModFluids;

public class OilBlock extends LiquidBlock {
	public OilBlock() {
		super(AidensTechnologyModFluids.OIL.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
