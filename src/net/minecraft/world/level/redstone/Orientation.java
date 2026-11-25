package net.minecraft.world.level.redstone;

import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
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
   private final Map<Direction, Orientation> withFront = new EnumMap<>(Direction.class);
   private final Map<Direction, Orientation> withUp = new EnumMap<>(Direction.class);
   private final Map<Orientation.SideBias, Orientation> withSideBias = new EnumMap<>(Orientation.SideBias.class);

   private Orientation(final Direction up, final Direction front, final Orientation.SideBias sideBias) {
      this.up = up;
      this.front = front;
      this.sideBias = sideBias;
      this.index = generateIndex(up, front, sideBias);
      Vec3i rightVector = front.getUnitVec3i().cross(up.getUnitVec3i());
      Direction side = Direction.getNearest(rightVector, null);
      Objects.requireNonNull(side);
      if (this.sideBias == Orientation.SideBias.RIGHT) {
         this.side = side;
      } else {
         this.side = side.getOpposite();
      }

      this.neighbors = List.of(this.front.getOpposite(), this.front, this.side, this.side.getOpposite(), this.up.getOpposite(), this.up);
      this.horizontalNeighbors = this.neighbors.stream().filter(d -> d.getAxis() != this.up.getAxis()).toList();
      this.verticalNeighbors = this.neighbors.stream().filter(d -> d.getAxis() == this.up.getAxis()).toList();
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
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: invokevirtual net/minecraft/world/level/redstone/Orientation.getIndex ()I
      // 005: aaload
      // 006: ifnull 010
      // 009: aload 1
      // 00a: aload 0
      // 00b: invokevirtual net/minecraft/world/level/redstone/Orientation.getIndex ()I
      // 00e: aaload
      // 00f: areturn
      // 010: aload 1
      // 011: aload 0
      // 012: invokevirtual net/minecraft/world/level/redstone/Orientation.getIndex ()I
      // 015: aload 0
      // 016: aastore
      // 017: invokestatic net/minecraft/world/level/redstone/Orientation$SideBias.values ()[Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 01a: astore 2
      // 01b: aload 2
      // 01c: arraylength
      // 01d: istore 3
      // 01e: bipush 0
      // 01f: istore 4
      // 021: iload 4
      // 023: iload 3
      // 024: if_icmpge 054
      // 027: aload 2
      // 028: iload 4
      // 02a: aaload
      // 02b: astore 5
      // 02d: aload 0
      // 02e: getfield net/minecraft/world/level/redstone/Orientation.withSideBias Ljava/util/Map;
      // 031: aload 5
      // 033: new net/minecraft/world/level/redstone/Orientation
      // 036: dup
      // 037: aload 0
      // 038: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 03b: aload 0
      // 03c: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 03f: aload 5
      // 041: invokespecial net/minecraft/world/level/redstone/Orientation.<init> (Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)V
      // 044: aload 1
      // 045: invokestatic net/minecraft/world/level/redstone/Orientation.generateContext (Lnet/minecraft/world/level/redstone/Orientation;[Lnet/minecraft/world/level/redstone/Orientation;)Lnet/minecraft/world/level/redstone/Orientation;
      // 048: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 04d: pop
      // 04e: iinc 4 1
      // 051: goto 021
      // 054: invokestatic net/minecraft/core/Direction.values ()[Lnet/minecraft/core/Direction;
      // 057: astore 2
      // 058: aload 2
      // 059: arraylength
      // 05a: istore 3
      // 05b: bipush 0
      // 05c: istore 4
      // 05e: iload 4
      // 060: iload 3
      // 061: if_icmpge 0b9
      // 064: aload 2
      // 065: iload 4
      // 067: aaload
      // 068: astore 5
      // 06a: aload 0
      // 06b: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 06e: astore 6
      // 070: aload 5
      // 072: aload 0
      // 073: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 076: if_acmpne 082
      // 079: aload 0
      // 07a: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 07d: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 080: astore 6
      // 082: aload 5
      // 084: aload 0
      // 085: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 088: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 08b: if_acmpne 094
      // 08e: aload 0
      // 08f: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 092: astore 6
      // 094: aload 0
      // 095: getfield net/minecraft/world/level/redstone/Orientation.withFront Ljava/util/Map;
      // 098: aload 5
      // 09a: new net/minecraft/world/level/redstone/Orientation
      // 09d: dup
      // 09e: aload 6
      // 0a0: aload 5
      // 0a2: aload 0
      // 0a3: getfield net/minecraft/world/level/redstone/Orientation.sideBias Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 0a6: invokespecial net/minecraft/world/level/redstone/Orientation.<init> (Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)V
      // 0a9: aload 1
      // 0aa: invokestatic net/minecraft/world/level/redstone/Orientation.generateContext (Lnet/minecraft/world/level/redstone/Orientation;[Lnet/minecraft/world/level/redstone/Orientation;)Lnet/minecraft/world/level/redstone/Orientation;
      // 0ad: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0b2: pop
      // 0b3: iinc 4 1
      // 0b6: goto 05e
      // 0b9: invokestatic net/minecraft/core/Direction.values ()[Lnet/minecraft/core/Direction;
      // 0bc: astore 2
      // 0bd: aload 2
      // 0be: arraylength
      // 0bf: istore 3
      // 0c0: bipush 0
      // 0c1: istore 4
      // 0c3: iload 4
      // 0c5: iload 3
      // 0c6: if_icmpge 11e
      // 0c9: aload 2
      // 0ca: iload 4
      // 0cc: aaload
      // 0cd: astore 5
      // 0cf: aload 0
      // 0d0: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 0d3: astore 6
      // 0d5: aload 5
      // 0d7: aload 0
      // 0d8: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 0db: if_acmpne 0e7
      // 0de: aload 0
      // 0df: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 0e2: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 0e5: astore 6
      // 0e7: aload 5
      // 0e9: aload 0
      // 0ea: getfield net/minecraft/world/level/redstone/Orientation.front Lnet/minecraft/core/Direction;
      // 0ed: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
      // 0f0: if_acmpne 0f9
      // 0f3: aload 0
      // 0f4: getfield net/minecraft/world/level/redstone/Orientation.up Lnet/minecraft/core/Direction;
      // 0f7: astore 6
      // 0f9: aload 0
      // 0fa: getfield net/minecraft/world/level/redstone/Orientation.withUp Ljava/util/Map;
      // 0fd: aload 5
      // 0ff: new net/minecraft/world/level/redstone/Orientation
      // 102: dup
      // 103: aload 5
      // 105: aload 6
      // 107: aload 0
      // 108: getfield net/minecraft/world/level/redstone/Orientation.sideBias Lnet/minecraft/world/level/redstone/Orientation$SideBias;
      // 10b: invokespecial net/minecraft/world/level/redstone/Orientation.<init> (Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)V
      // 10e: aload 1
      // 10f: invokestatic net/minecraft/world/level/redstone/Orientation.generateContext (Lnet/minecraft/world/level/redstone/Orientation;[Lnet/minecraft/world/level/redstone/Orientation;)Lnet/minecraft/world/level/redstone/Orientation;
      // 112: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 117: pop
      // 118: iinc 4 1
      // 11b: goto 0c3
      // 11e: aload 0
      // 11f: areturn
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
