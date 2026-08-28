package net.minecraft.world.level.storage.loot.providers.number;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;

public sealed interface ResolvableNumber permits ResolvableNumber.Constant, ResolvableNumber.Reference {
   Codec<ResolvableNumber> CODEC = Codec.either(ResolvableNumber.Constant.CODEC, ResolvableNumber.Reference.CODEC).xmap(Either::unwrap, ResolvableNumber::wrap);
   StreamCodec<ByteBuf, ResolvableNumber> STREAM_CODEC = ByteBufCodecs.either(ResolvableNumber.Constant.STREAM_CODEC, ResolvableNumber.Reference.STREAM_CODEC)
      .map(Either::unwrap, ResolvableNumber::wrap);

   private static Either<ResolvableNumber.Constant, ResolvableNumber.Reference> wrap(final ResolvableNumber resolvableNumber) {
      Objects.requireNonNull(resolvableNumber);

      return switch (resolvableNumber) {
         case ResolvableNumber.Constant constant -> Either.left(constant);
         case ResolvableNumber.Reference reference -> Either.right(reference);
         default -> throw new MatchException(null, null);
      };
   }

   float getFloat(LootContext context, float defaultValue);

   int getInt(LootContext context, int defaultValue);

   static ResolvableNumber fromKey(final ResourceKey<NumberProvider> key) {
      return new ResolvableNumber.Reference(key);
   }

   static <T> float getFloatFromItem(
      final ItemStack itemStack,
      final DataComponentType<T> componentType,
      final Function<T, ResolvableNumber> getter,
      final LootContext context,
      final float defaultValue
   ) {
      T component = itemStack.get(componentType);
      return component != null ? getter.apply(component).getFloat(context, defaultValue) : defaultValue;
   }

   static <T> int getIntFromItem(
      final ItemStack itemStack,
      final DataComponentType<T> componentType,
      final Function<T, ResolvableNumber> getter,
      final LootContext context,
      final int defaultValue
   ) {
      T component = itemStack.get(componentType);
      return component != null ? getter.apply(component).getInt(context, defaultValue) : defaultValue;
   }

   public static record Constant(float value) implements ResolvableNumber {
      private static final Codec<ResolvableNumber.Constant> CODEC = Codec.FLOAT.xmap(ResolvableNumber.Constant::new, ResolvableNumber.Constant::value);
      private static final StreamCodec<ByteBuf, ResolvableNumber.Constant> STREAM_CODEC = ByteBufCodecs.FLOAT
         .map(ResolvableNumber.Constant::new, ResolvableNumber.Constant::value);

      @Override
      public float getFloat(final LootContext context, final float defaultValue) {
         return this.value;
      }

      @Override
      public int getInt(final LootContext context, final int defaultValue) {
         return Math.round(this.value);
      }
   }

   public static record Reference(ResourceKey<NumberProvider> key) implements ResolvableNumber {
      private static final Codec<ResolvableNumber.Reference> CODEC = ResourceKey.codec(Registries.NUMBER_PROVIDER)
         .xmap(ResolvableNumber.Reference::new, ResolvableNumber.Reference::key);
      private static final StreamCodec<ByteBuf, ResolvableNumber.Reference> STREAM_CODEC = ResourceKey.streamCodec(Registries.NUMBER_PROVIDER)
         .map(ResolvableNumber.Reference::new, ResolvableNumber.Reference::key);

      @Override
      public float getFloat(final LootContext context, final float defaultValue) {
         return this.getProvider(context).map(provider -> provider.getFloat(context)).orElse(defaultValue);
      }

      @Override
      public int getInt(final LootContext context, final int defaultValue) {
         return this.getProvider(context).map(provider -> provider.getInt(context)).orElse(defaultValue);
      }

      private Optional<NumberProvider> getProvider(final LootContext context) {
         return context.getResolver().lookupOrThrow(Registries.NUMBER_PROVIDER).get(this.key).map(Holder.Reference::value);
      }
   }
}
