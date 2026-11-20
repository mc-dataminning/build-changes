package net.minecraft.commands.arguments;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public class FloatArgument extends BrigadierWrapperArgument<Float, FloatArgumentType> {
   private static final Float MIN = -Float.MAX_VALUE;
   private static final Float MAX = Float.MAX_VALUE;
   private static final MapCodec<FloatArgument> MAP_CODEC = MinMaxBounds.Bounds.createMapCodec(Codec.FLOAT).xmap(FloatArgument::new, arg -> arg.bounds);
   private static final StreamCodec<ByteBuf, FloatArgument> STREAM_CODEC = MinMaxBounds.Bounds.createStreamCodec(ByteBufCodecs.FLOAT)
      .map(FloatArgument::new, arg -> arg.bounds);
   public static final SerializableArgument.Type<FloatArgument> TYPE = new SerializableArgument.Type<>(MAP_CODEC, STREAM_CODEC);
   private final MinMaxBounds.Bounds<Float> bounds;

   private FloatArgument(final MinMaxBounds.Bounds<Float> bounds) {
      super(FloatArgumentType.floatArg(bounds.min().orElse(MIN), bounds.max().orElse(MAX)));
      this.bounds = bounds;
   }

   @Override
   public SerializableArgument.Type<FloatArgument> type() {
      return TYPE;
   }

   private static ArgumentType<Float> floatArg(final MinMaxBounds.Bounds<Float> bounds) {
      return new FloatArgument(bounds).toBrigadier();
   }

   public static ArgumentType<Float> floatArg() {
      return floatArg(MinMaxBounds.Bounds.any());
   }

   public static ArgumentType<Float> floatArg(final float min) {
      return floatArg(MinMaxBounds.Bounds.atLeast(min));
   }

   public static ArgumentType<Float> floatArg(final float min, final float max) {
      return floatArg(MinMaxBounds.Bounds.between(min, max));
   }

   public static float getFloat(final CommandContext<?> context, final String name) {
      return FloatArgumentType.getFloat(context, name);
   }
}
