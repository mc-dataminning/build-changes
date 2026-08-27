package net.minecraft.world.level.storage.loot.providers.number;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.util.Mth;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.Validatable;
import net.minecraft.world.level.storage.loot.ValidationContext;

public record UniformGenerator(Holder<NumberProvider> min, Holder<NumberProvider> max) implements NumberProvider {
   public static final MapCodec<UniformGenerator> MAP_CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(NumberProviders.CODEC.fieldOf("min").forGetter(UniformGenerator::min), NumberProviders.CODEC.fieldOf("max").forGetter(UniformGenerator::max))
            .apply(i, UniformGenerator::new)
   );

   @Override
   public MapCodec<UniformGenerator> codec() {
      return MAP_CODEC;
   }

   public static Holder<NumberProvider> between(final float min, final float max) {
      return Holder.direct(new UniformGenerator(ConstantValue.exactly(min), ConstantValue.exactly(max)));
   }

   @Override
   public int getInt(final LootContext context) {
      return Mth.nextInt(context.getRandom(), this.min.value().getInt(context), this.max.value().getInt(context));
   }

   @Override
   public float getFloat(final LootContext context) {
      return Mth.nextFloat(context.getRandom(), this.min.value().getFloat(context), this.max.value().getFloat(context));
   }

   @Override
   public void validate(final ValidationContext context) {
      NumberProvider.super.validate(context);
      Validatable.validateHolder(context, "min", this.min);
      Validatable.validateHolder(context, "max", this.max);
   }
}
