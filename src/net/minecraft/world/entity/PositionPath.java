package net.minecraft.world.entity;

import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.phys.Vec3;

public sealed interface PositionPath permits PositionPath.Linear, PositionPath.Stepped {
   StreamCodec<ByteBuf, PositionPath> STREAM_CODEC = PositionPath.Type.STREAM_CODEC.dispatch(PositionPath::type, PositionPath.Type::streamCodec);

   Vec3 endPosition();

   PositionPath.Type type();

   static PositionPath of(final Vec3 position) {
      return new PositionPath.Linear(position);
   }

   static PositionPath stepped(final List<PositionStep> steps, final boolean startImmediately) {
      return new PositionPath.Stepped(steps, startImmediately);
   }

   record Linear(Vec3 endPosition) implements PositionPath {
      public static final StreamCodec<ByteBuf, PositionPath.Linear> STREAM_CODEC = Vec3.STREAM_CODEC
         .map(PositionPath.Linear::new, PositionPath.Linear::endPosition);

      @Override
      public PositionPath.Type type() {
         return PositionPath.Type.LINEAR;
      }
   }

   record Stepped(Vec3 endPosition, List<PositionStep> steps, boolean startImmediately) implements PositionPath {
      public static final StreamCodec<ByteBuf, PositionPath.Stepped> STREAM_CODEC = StreamCodec.composite(
         PositionStep.STREAM_CODEC.apply(ByteBufCodecs.list()),
         PositionPath.Stepped::steps,
         ByteBufCodecs.BOOL,
         PositionPath.Stepped::startImmediately,
         PositionPath.Stepped::new
      );

      public Stepped(final List<PositionStep> steps, final boolean startImmediately) {
         this(steps.getLast().position(), steps, startImmediately);
      }

      @Override
      public PositionPath.Type type() {
         return PositionPath.Type.STEPPED;
      }
   }

   enum Type {
      LINEAR(0, PositionPath.Linear.STREAM_CODEC),
      STEPPED(1, PositionPath.Stepped.STREAM_CODEC);

      public static final StreamCodec<ByteBuf, PositionPath.Type> STREAM_CODEC = ByteBufCodecs.enumCodec(PositionPath.Type.class, PositionPath.Type::getId);
      private final int id;
      private final StreamCodec<ByteBuf, ? extends PositionPath> streamCodec;

      Type(final int id, final StreamCodec<ByteBuf, ? extends PositionPath> streamCodec) {
         this.id = id;
         this.streamCodec = streamCodec;
      }

      public int getId() {
         return this.id;
      }

      public StreamCodec<ByteBuf, ? extends PositionPath> streamCodec() {
         return this.streamCodec;
      }
   }
}
