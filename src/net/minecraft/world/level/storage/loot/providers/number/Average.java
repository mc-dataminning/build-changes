package net.minecraft.world.level.storage.loot.providers.number;

import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.storage.loot.LootContext;

public record Average(HolderSet<NumberProvider> operands) implements Aggregate {
   public static final MapCodec<Average> MAP_CODEC = Aggregate.codec(Average::new);

   @SafeVarargs
   public static Holder<NumberProvider> average(final Holder<NumberProvider>... operands) {
      return Holder.direct(new Average(HolderSet.direct(operands)));
   }

   @Override
   public MapCodec<Average> codec() {
      return MAP_CODEC;
   }

   @Override
   public float getFloat(final LootContext context) {
      float sum = 0.0F;
      int count = 0;

      for (Holder<NumberProvider> operand : this.operands) {
         sum += operand.value().getFloat(context);
         count++;
      }

      return count == 0 ? 0.0F : sum / (float)count;
   }

   @Override
   public int getInt(final LootContext context) {
      long sum = 0L;
      long count = 0L;

      for (Holder<NumberProvider> operand : this.operands) {
         sum += (long)operand.value().getInt(context);
         count++;
      }

      return count == 0L ? 0 : Ints.saturatedCast(sum / count);
   }
}
