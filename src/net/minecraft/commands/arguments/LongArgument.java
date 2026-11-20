package net.minecraft.commands.arguments;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

public class LongArgument extends BrigadierWrapperArgument<Long, LongArgumentType> {
   private static final Long MIN = Long.MIN_VALUE;
   private static final Long MAX = Long.MAX_VALUE;
   private static final MapCodec<LongArgument> MAP_CODEC = MinMaxBounds.Bounds.createMapCodec(Codec.LONG).xmap(LongArgument::new, arg -> arg.bounds);
   private static final StreamCodec<ByteBuf, LongArgument> STREAM_CODEC = MinMaxBounds.Bounds.createStreamCodec(ByteBufCodecs.LONG)
      .map(LongArgument::new, arg -> arg.bounds);
   public static final SerializableArgument.Type<LongArgument> TYPE = new SerializableArgument.Type<>(MAP_CODEC, STREAM_CODEC);
   private final MinMaxBounds.Bounds<Long> bounds;

   public LongArgument(final MinMaxBounds.Bounds<Long> bounds) {
      super(LongArgumentType.longArg(bounds.min().orElse(MIN), bounds.max().orElse(MAX)));
      this.bounds = bounds;
   }

   @Override
   public SerializableArgument.Type<LongArgument> type() {
      return TYPE;
   }

   public static ArgumentType<Long> longArg(final MinMaxBounds.Bounds<Long> bounds) {
      return new LongArgument(bounds).toBrigadier();
   }

   public static ArgumentType<Long> longArg() {
      return longArg(MinMaxBounds.Bounds.any());
   }

   public static ArgumentType<Long> longArg(final long min) {
      return longArg(MinMaxBounds.Bounds.atLeast(min));
   }

   public static ArgumentType<Long> longArg(final long min, final long max) {
      return longArg(MinMaxBounds.Bounds.between(min, max));
   }

   public static long getLong(final CommandContext<?> context, final String name) {
      return LongArgumentType.getLong(context, name);
   }
}
