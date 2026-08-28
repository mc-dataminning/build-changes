package net.minecraft.world.level.storage.loot.providers.number;

import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.storage.loot.LootContext;

public record Sum(HolderSet<NumberProvider> operands) implements Aggregate {
   public static final MapCodec<Sum> MAP_CODEC = Aggregate.codec(Sum::new);

   @SafeVarargs
   public static Holder<NumberProvider> sum(final Holder<NumberProvider>... operands) {
      return Holder.direct(new Sum(HolderSet.direct(operands)));
   }

   @Override
   public MapCodec<Sum> codec() {
      return MAP_CODEC;
   }

   @Override
   public float getFloat(final LootContext context) {
      float value = 0.0F;

      for (Holder<NumberProvider> operand : this.operands) {
         value += operand.value().getFloat(context);
      }

      return value;
   }

   @Override
   public int getInt(final LootContext context) {
      long value = 0L;

      for (Holder<NumberProvider> operand : this.operands) {
         value += (long)operand.value().getInt(context);
      }

      return Ints.saturatedCast(value);
   }
}
