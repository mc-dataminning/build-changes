package net.minecraft.world.level.storage.loot.providers.number;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.storage.loot.LootContext;

public record Minimum(HolderSet<NumberProvider> operands) implements Aggregate {
   public static final MapCodec<Minimum> MAP_CODEC = Aggregate.codec(Minimum::new);

   @SafeVarargs
   public static Holder<NumberProvider> minimum(final Holder<NumberProvider>... operands) {
      return Holder.direct(new Minimum(HolderSet.direct(operands)));
   }

   @Override
   public MapCodec<Minimum> codec() {
      return MAP_CODEC;
   }

   @Override
   public float getFloat(final LootContext context) {
      float value = Float.MAX_VALUE;

      for (Holder<NumberProvider> operand : this.operands) {
         value = Math.min(value, operand.value().getFloat(context));
      }

      return value;
   }

   @Override
   public int getInt(final LootContext context) {
      int value = Integer.MAX_VALUE;

      for (Holder<NumberProvider> operand : this.operands) {
         value = Math.min(value, operand.value().getInt(context));
      }

      return value;
   }
}
