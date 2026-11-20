package net.minecraft.world.level.material;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;

public class Fluids {
   public static final Fluid EMPTY = register(FluidIds.EMPTY, new EmptyFluid());
   public static final FlowingFluid WATER = register(FluidIds.WATER, new WaterFluid());
   public static final FlowingFluid LAVA = register(FluidIds.LAVA, new LavaFluid());

   private static <T extends Fluid> T register(final ResourceKey<Fluid> id, final T fluid) {
      return Registry.register(BuiltInRegistries.FLUID, id, fluid);
   }

   static {
      for (Fluid fluid : BuiltInRegistries.FLUID) {
         UnmodifiableIterator var2 = fluid.getStateDefinition().getPossibleStates().iterator();

         while (var2.hasNext()) {
            FluidState state = (FluidState)var2.next();
            Fluid.FLUID_STATE_REGISTRY.add(state);
         }
      }
   }
}
