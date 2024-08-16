
package net.mcreator.aidenstechnology.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.aidenstechnology.init.AidensTechnologyModItems;
import net.mcreator.aidenstechnology.init.AidensTechnologyModFluids;
import net.mcreator.aidenstechnology.init.AidensTechnologyModFluidTypes;
import net.mcreator.aidenstechnology.init.AidensTechnologyModBlocks;

public abstract class OilFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> AidensTechnologyModFluidTypes.OIL_TYPE.get(), () -> AidensTechnologyModFluids.OIL.get(), () -> AidensTechnologyModFluids.FLOWING_OIL.get())
			.explosionResistance(100f).tickRate(15).bucket(() -> AidensTechnologyModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) AidensTechnologyModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
