package net.minecraft.world.level.storage.loot.providers.number;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.storage.loot.LootContext;

public record Maximum(HolderSet<NumberProvider> operands) implements Aggregate {
   public static final MapCodec<Maximum> MAP_CODEC = Aggregate.codec(Maximum::new);

   @SafeVarargs
   public static Holder<NumberProvider> maximum(final Holder<NumberProvider>... operands) {
      return Holder.direct(new Maximum(HolderSet.direct(operands)));
   }

   @Override
   public MapCodec<Maximum> codec() {
      return MAP_CODEC;
   }

   @Override
   public float getFloat(final LootContext context) {
      float value = -Float.MAX_VALUE;

      for (Holder<NumberProvider> operand : this.operands) {
         value = Math.max(value, operand.value().getFloat(context));
      }

      return value;
   }

   @Override
   public int getInt(final LootContext context) {
      int value = -2147483647;

      for (Holder<NumberProvider> operand : this.operands) {
         value = Math.max(value, operand.value().getInt(context));
      }

      return value;
   }
}
