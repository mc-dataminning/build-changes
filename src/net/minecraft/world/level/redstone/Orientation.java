package net.minecraft.world.level.redstone;

import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import net.minecraft.core.Direction;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;

public class Orientation {
   public static final StreamCodec<ByteBuf, Orientation> STREAM_CODEC = ByteBufCodecs.idMapper(Orientation::fromIndex, Orientation::getIndex);
   private static final Orientation[] ORIENTATIONS = Util.make(() -> {
      Orientation[] orientations = new Orientation[48];
      generateContext(new Orientation(Direction.UP, Direction.NORTH, Orientation.SideBias.LEFT), orientations);
      return orientations;
   });
   private final Direction up;
   private final Direction front;
   private final Direction side;
   private final Orientation.SideBias sideBias;
   private final int index;
   private final List<Direction> neighbors;
   private final List<Direction> horizontalNeighbors;
   private final List<Direction> verticalNeighbors;
   private final Map<Direction, Orientation> withFront;
   private final Map<Direction, Orientation> withUp;
   private final Map<Orientation.SideBias, Orientation> withSideBias;

   private Orientation(final Direction up, final Direction front, final Orientation.SideBias sideBias) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: new java/util/EnumMap
      // 08: dup
      // 09: ldc net/minecraft/core/Direction
      // 0b: invokespecial java/util/EnumMap.<init> (Ljava/lang/Class;)V
      // 0e: putfield net/minecraft/world/level/redstone/Orientation.withFront Ljava/util/Map;
      // 11: aload 0
      // 12: new java/util/EnumMap
      // 15: dup
      // 16: ldc net/minecraft/core/Direction
      // 18: invokespecial java/util/EnumMap.<init> (Ljava/lang/Class;)V
      // 1b: putfield net/minecraft/world/level/redstone/Orientation.withUp Ljava/util/Map;
      // 1e: aload 0
      // 1f: new java/util/EnumMap
      // 22: dup
      // 23: ldc net/minecraft/world/level/redstone/Orientation$SideBias
      // 25: invokespecial java/util/EnumMap.<init> (Ljava/lang/Class;)V
      // 28: putfield net/minecraft/world/level/redstone/Orientation.withSideBias Ljava/util/Map;
      // 2b: aload 0
      // 2c: aload 1
      // 2d: putfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 30: aload 0
      // 31: aload 2
      // 32: putfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 35: aload 0
      // 36: aload 3
      // 37: putfield net/minecraft/world/level/redstone/Orientation.sideBias Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: aload 3
      // 3e: invokestatic net/minecraft/world/level/redstone/Orientation.generateIndex (Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)I
      // 41: putfield net/minecraft/world/level/redstone/Orientation.index I
      // 44: aload 2
      // 45: invokevirtual net/minecraft/core/Direction.getUnitVec3i ()Lnet/minecraft/core/Vec3i;
      // 48: aload 1
      // 49: invokevirtual net/minecraft/core/Direction.getUnitVec3i ()Lnet/minecraft/core/Vec3i;
      // 4c: invokevirtual net/minecraft/core/Vec3i.cross (Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;
      // 4f: astore 4
      // 51: aload 4
      // 53: aconst_null
      // 54: invokestatic net/minecraft/core/Direction.getNearest (Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
      // 57: astore 5
      // 59: aload 5
      // 5b: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 5e: pop
      // 5f: aload 0
      // 60: getfield net/minecraft/world/level/redstone/Orientation.sideBias Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 63: getstatic net/minecraft/world/level/redstone/Orientation$SideBias.RIGHT Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 66: if_acmpne 72
      // 69: aload 0
      // 6a: aload 5
      // 6c: putfield net/minecraft/world/level/redstone/Orientation.side Lnet/minecraft/core/Direction;
      // 6f: goto 7b
      // 72: aload 0
      // 73: aload 5
      // 75: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 78: putfield net/minecraft/world/level/redstone/Orientation.side Lnet/minecraft/core/Direction;
      // 7b: aload 0
      // 7c: aload 0
      // 7d: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 80: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 83: aload 0
      // 84: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 87: aload 0
      // 88: getfield net/minecraft/world/level/redstone/Orientation.side Lnet/minecraft/core/Direction;
      // 8b: aload 0
      // 8c: getfield net/minecraft/world/level/redstone/Orientation.side Lnet/minecraft/core/Direction;
      // 8f: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 92: aload 0
      // 93: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 96: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 99: aload 0
      // 9a: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 9d: invokestatic java/util/List.of (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
      // a0: putfield net/minecraft/world/level/redstone/Orientation.neighbors Ljava/util/List;
      // a3: aload 0
      // a4: aload 0
      // a5: getfield net/minecraft/world/level/redstone/Orientation.neighbors Ljava/util/List;
      // a8: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // ad: aload 0
      // ae: invokedynamic test (Lnet/minecraft/world/level/redstone/Orientation;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/redstone/Orientation.lambda$new$0 (Lnet/minecraft/core/Direction;)Z, (Lnet/minecraft/core/Direction;)Z ]
      // b3: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // b8: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
      // bd: putfield net/minecraft/world/level/redstone/Orientation.horizontalNeighbors Ljava/util/List;
      // c0: aload 0
      // c1: aload 0
      // c2: getfield net/minecraft/world/level/redstone/Orientation.neighbors Ljava/util/List;
      // c5: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // ca: aload 0
      // cb: invokedynamic test (Lnet/minecraft/world/level/redstone/Orientation;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/redstone/Orientation.lambda$new$1 (Lnet/minecraft/core/Direction;)Z, (Lnet/minecraft/core/Direction;)Z ]
      // d0: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // d5: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
      // da: putfield net/minecraft/world/level/redstone/Orientation.verticalNeighbors Ljava/util/List;
      // dd: return
   }

   public static Orientation of(final Direction up, final Direction front, final Orientation.SideBias sideBias) {
      return ORIENTATIONS[generateIndex(up, front, sideBias)];
   }

   public Orientation withUp(final Direction up) {
      return this.withUp.get(up);
   }

   public Orientation withFront(final Direction front) {
      return this.withFront.get(front);
   }

   public Orientation withFrontPreserveUp(final Direction front) {
      return front.getAxis() == this.up.getAxis() ? this : this.withFront.get(front);
   }

   public Orientation withFrontAdjustSideBias(final Direction front) {
      Orientation withFront = this.withFront(front);
      return this.front == withFront.side ? withFront.withMirror() : withFront;
   }

   public Orientation withSideBias(final Orientation.SideBias sideBias) {
      return this.withSideBias.get(sideBias);
   }

   public Orientation withMirror() {
      return this.withSideBias(this.sideBias.getOpposite());
   }

   public Direction getFront() {
      return this.front;
   }

   public Direction getUp() {
      return this.up;
   }

   public Direction getSide() {
      return this.side;
   }

   public Orientation.SideBias getSideBias() {
      return this.sideBias;
   }

   public List<Direction> getDirections() {
      return this.neighbors;
   }

   public List<Direction> getHorizontalDirections() {
      return this.horizontalNeighbors;
   }

   public List<Direction> getVerticalDirections() {
      return this.verticalNeighbors;
   }

   @Override
   public String toString() {
      return "[up=" + this.up + ",front=" + this.front + ",sideBias=" + this.sideBias + "]";
   }

   public int getIndex() {
      return this.index;
   }

   public static Orientation fromIndex(final int index) {
      return ORIENTATIONS[index];
   }

   public static Orientation random(final RandomSource rand) {
      return Util.getRandom(ORIENTATIONS, rand);
   }

   private static Orientation generateContext(final Orientation self, final Orientation[] lookup) {
      if (lookup[self.getIndex()] != null) {
         return lookup[self.getIndex()];
      }

      lookup[self.getIndex()] = self;

      for (Orientation.SideBias sideBias : Orientation.SideBias.values()) {
         self.withSideBias.put(sideBias, generateContext(new Orientation(self.up, self.front, sideBias), lookup));
      }

      for (Direction facing : Direction.values()) {
         Direction up = self.up;
         if (facing == self.up) {
            up = self.front.getOpposite();
         }

         if (facing == self.up.getOpposite()) {
            up = self.front;
         }

         self.withFront.put(facing, generateContext(new Orientation(up, facing, self.sideBias), lookup));
      }

      for (Direction facing : Direction.values()) {
         Direction front = self.front;
         if (facing == self.front) {
            front = self.up.getOpposite();
         }

         if (facing == self.front.getOpposite()) {
            front = self.up;
         }

         self.withUp.put(facing, generateContext(new Orientation(facing, front, self.sideBias), lookup));
      }

      return self;
   }

   @VisibleForTesting
   protected static int generateIndex(final Direction up, final Direction front, final Orientation.SideBias sideBias) {
      if (up.getAxis() == front.getAxis()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      }

      int frontAxisKey;
      if (up.getAxis() == Direction.Axis.Y) {
         frontAxisKey = front.getAxis() == Direction.Axis.X ? 1 : 0;
      } else {
         frontAxisKey = front.getAxis() == Direction.Axis.Y ? 1 : 0;
      }

      int frontKey = frontAxisKey << 1 | front.getAxisDirection().ordinal();
      return ((up.ordinal() << 2) + frontKey << 1) + sideBias.ordinal();
   }

   public enum SideBias {
      LEFT("left"),
      RIGHT("right");

      private final String name;

      SideBias(final String name) {
         this.name = name;
      }

      public Orientation.SideBias getOpposite() {
         return this == LEFT ? RIGHT : LEFT;
      }

      @Override
      public String toString() {
         return this.name;
      }
   }
}
