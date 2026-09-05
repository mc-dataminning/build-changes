package net.minecraft.world.level.storage.loot;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.core.Holder;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProvider;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import org.jspecify.annotations.Nullable;

public sealed interface FloatRangePredicate extends Validatable permits FloatRangePredicate.Point, FloatRangePredicate.Line {
   Codec<FloatRangePredicate.Point> POINT_CODEC = ContextFloatProviders.CODEC.xmap(FloatRangePredicate.Point::new, FloatRangePredicate.Point::value);
   Codec<FloatRangePredicate.Line> LINE_CODEC = RecordCodecBuilder.create(
      i -> i.group(
               ContextFloatProviders.CODEC.optionalFieldOf("min").forGetter(r -> r.min),
               ContextFloatProviders.CODEC.optionalFieldOf("max").forGetter(r -> r.max)
            )
            .apply(i, FloatRangePredicate.Line::new)
   );
   Codec<FloatRangePredicate> CODEC = Codec.either(POINT_CODEC, LINE_CODEC).xmap(Either::unwrap, range -> {
      Objects.requireNonNull(range);

      return switch (range) {
         case FloatRangePredicate.Point point -> Either.left(point);
         case FloatRangePredicate.Line line -> Either.right(line);
         default -> throw new MatchException(null, null);
      };
   });

   static FloatRangePredicate exact(final float value) {
      return new FloatRangePredicate.Point(ContextFloatProviders.exactly(value));
   }

   static FloatRangePredicate range(final float min, final float max) {
      return new FloatRangePredicate.Line(Optional.of(ContextFloatProviders.exactly(min)), Optional.of(ContextFloatProviders.exactly(max)));
   }

   static FloatRangePredicate lowerBound(final float value) {
      return new FloatRangePredicate.Line(Optional.of(ContextFloatProviders.exactly(value)), Optional.empty());
   }

   static FloatRangePredicate upperBound(final float value) {
      return new FloatRangePredicate.Line(Optional.empty(), Optional.of(ContextFloatProviders.exactly(value)));
   }

   boolean test(LootContext context, float input);

   default boolean test(final LootContext context, final ContextFloatProvider input) {
      return this.test(context, input.getFloat(context));
   }

   public static final class Line implements FloatRangePredicate {
      private final Optional<Holder<ContextFloatProvider>> min;
      private final Optional<Holder<ContextFloatProvider>> max;
      @Nullable
      private final FloatRangePredicate.Line.FloatChecker predicate;

      private Line(final Optional<Holder<ContextFloatProvider>> min, final Optional<Holder<ContextFloatProvider>> max) {
         this.min = min;
         this.max = max;
         this.predicate = createPredicate(min.orElse(null), max.orElse(null));
      }

      @Nullable
      private static FloatRangePredicate.Line.FloatChecker createPredicate(
         @Nullable final Holder<ContextFloatProvider> min, @Nullable final Holder<ContextFloatProvider> max
      ) {
         if (min == null) {
            return max == null ? null : (context, input) -> input <= max.value().getFloat(context);
         } else {
            return max == null
               ? (context, input) -> input >= min.value().getFloat(context)
               : (context, input) -> input >= min.value().getFloat(context) && input <= max.value().getFloat(context);
         }
      }

      @Override
      public void validate(final ValidationContext context) {
         Validatable.validateHolder(context, "min", this.min);
         Validatable.validateHolder(context, "max", this.max);
      }

      @Override
      public boolean test(final LootContext context, final float input) {
         return this.predicate == null || this.predicate.test(context, input);
      }

      @Override
      public boolean test(final LootContext context, final ContextFloatProvider input) {
         return this.predicate == null || this.predicate.test(context, input.getFloat(context));
      }

      @FunctionalInterface
      private interface FloatChecker {
         boolean test(LootContext context, float value);
      }
   }

   public static record Point(Holder<ContextFloatProvider> value) implements FloatRangePredicate {
      @Override
      public void validate(final ValidationContext context) {
         Validatable.validateHolder(context, this.value);
      }

      private float computeValue(final LootContext context) {
         return this.value.value().getFloat(context);
      }

      @Override
      public boolean test(final LootContext context, final float input) {
         return this.computeValue(context) == input;
      }
   }
}
