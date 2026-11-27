package net.minecraft.world.level.levelgen.feature.treedecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShelfMushroomBlock;

public class ShelfMushroomDecorator extends TreeDecorator {
   public static final MapCodec<ShelfMushroomDecorator> CODEC = Codec.floatRange(0.0F, 1.0F)
      .fieldOf("probability")
      .xmap(ShelfMushroomDecorator::new, d -> d.placementProbability);
   private static final int MIN_HEIGHT_OFFSET = 1;
   private static final int MAX_HEIGHT_OFFSET = 4;
   private static final float PER_SIDE_PLACEMENT_CHANCE = 0.25F;
   private static final int MAX_AGE_EXCLUSIVE = 2;
   private final float placementProbability;

   public ShelfMushroomDecorator(final float probability) {
      this.placementProbability = probability;
   }

   @Override
   protected TreeDecoratorType<?> type() {
      return TreeDecoratorType.SHELF_MUSHROOM;
   }

   @Override
   public void place(final TreeDecorator.Context context) {
      RandomSource random = context.random();
      if (!(random.nextFloat() >= this.placementProbability)) {
         List<BlockPos> logs = context.logs();
         if (!logs.isEmpty()) {
            if (isFallenLog(logs)) {
               placeOnFallenLog(context, logs, random);
            } else {
               placeOnStandingTree(context, logs, random);
            }
         }
      }
   }

   private static void placeOnStandingTree(final TreeDecorator.Context context, final List<BlockPos> logs, final RandomSource random) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokestatic net/minecraft/world/level/levelgen/feature/treedecorators/ShelfMushroomDecorator.pickTwoPerpendicularDirections (Lnet/minecraft/util/RandomSource;)[Lnet/minecraft/core/Direction;
      // 04: astore 3
      // 05: aload 1
      // 06: invokeinterface java/util/List.getFirst ()Ljava/lang/Object; 1
      // 0b: checkcast net/minecraft/core/BlockPos
      // 0e: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 11: istore 4
      // 13: aload 1
      // 14: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22: ifeq 7e
      // 25: aload 5
      // 27: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c: checkcast net/minecraft/core/BlockPos
      // 2f: astore 6
      // 31: aload 6
      // 33: iload 4
      // 35: invokestatic net/minecraft/world/level/levelgen/feature/treedecorators/ShelfMushroomDecorator.isWithinDecoratableHeight (Lnet/minecraft/core/BlockPos;I)Z
      // 38: ifne 3e
      // 3b: goto 1b
      // 3e: aload 3
      // 3f: astore 7
      // 41: aload 7
      // 43: arraylength
      // 44: istore 8
      // 46: bipush 0
      // 47: istore 9
      // 49: iload 9
      // 4b: iload 8
      // 4d: if_icmpge 7b
      // 50: aload 7
      // 52: iload 9
      // 54: aaload
      // 55: astore 10
      // 57: aload 2
      // 58: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 5d: ldc 0.25
      // 5f: fcmpl
      // 60: ifle 66
      // 63: goto 75
      // 66: aload 0
      // 67: aload 6
      // 69: aload 10
      // 6b: aload 2
      // 6c: invokestatic net/minecraft/world/level/levelgen/feature/treedecorators/ShelfMushroomDecorator.tryPlaceMushroomOnStandingTree (Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/util/RandomSource;)Z
      // 6f: ifeq 75
      // 72: goto 7b
      // 75: iinc 9 1
      // 78: goto 49
      // 7b: goto 1b
      // 7e: return
   }

   private static void placeOnFallenLog(final TreeDecorator.Context context, final List<BlockPos> logs, final RandomSource random) {
      Direction[] directions = perpendicularToFallenLog(logs);

      for (BlockPos logPos : logs) {
         for (Direction facing : directions) {
            if (!(random.nextFloat() > 0.25F)) {
               tryPlaceMushroomOnFallenTree(context, logPos, facing, random);
            }
         }
      }
   }

   private static boolean tryPlaceMushroomOnStandingTree(
      final TreeDecorator.Context context, final BlockPos logPos, final Direction facing, final RandomSource random
   ) {
      BlockPos mushroomPos = mushroomPosFor(logPos, facing);
      if (!isBlockReplaceableWithShelfMushroom(context, mushroomPos)) {
         return false;
      }

      if (hasShelfMushroomAt(context, mushroomPos.below())) {
         return false;
      }

      placeMushroom(context, mushroomPos, facing, random);
      return true;
   }

   private static void tryPlaceMushroomOnFallenTree(
      final TreeDecorator.Context context, final BlockPos logPos, final Direction facing, final RandomSource random
   ) {
      BlockPos mushroomPos = mushroomPosFor(logPos, facing);
      if (isBlockReplaceableWithShelfMushroom(context, mushroomPos)) {
         if (!hasHorizontallyAdjacentShelfMushroom(context, mushroomPos) && !hasHorizontallyAdjacentShelfMushroom(context, logPos)) {
            placeMushroom(context, mushroomPos, facing, random);
         }
      }
   }

   private static boolean isFallenLog(final List<BlockPos> logs) {
      return logs.getFirst().getY() == logs.getLast().getY();
   }

   private static Direction[] pickTwoPerpendicularDirections(final RandomSource random) {
      Direction first = Direction.Plane.HORIZONTAL.getRandomDirection(random);
      return new Direction[]{first, first.getClockWise()};
   }

   private static Direction[] perpendicularToFallenLog(final List<BlockPos> logs) {
      BlockPos first = logs.getFirst();
      BlockPos last = logs.getLast();
      Direction.Axis logAxis = first.getX() != last.getX() ? Direction.Axis.X : Direction.Axis.Z;
      return logAxis == Direction.Axis.X ? new Direction[]{Direction.NORTH, Direction.SOUTH} : new Direction[]{Direction.EAST, Direction.WEST};
   }

   private static boolean isWithinDecoratableHeight(final BlockPos pos, final int treeBaseY) {
      int dy = pos.getY() - treeBaseY;
      return dy >= 1 && dy <= 4;
   }

   private static BlockPos mushroomPosFor(final BlockPos logPos, final Direction facing) {
      return logPos.offset(facing.getStepX(), 0, facing.getStepZ());
   }

   private static void placeMushroom(final TreeDecorator.Context context, final BlockPos pos, final Direction facing, final RandomSource random) {
      context.setBlock(
         pos, Blocks.SHELF_MUSHROOM.defaultBlockState().setValue(ShelfMushroomBlock.AGE, random.nextInt(2)).setValue(ShelfMushroomBlock.FACING, facing)
      );
   }

   private static boolean hasShelfMushroomAt(final TreeDecorator.Context context, final BlockPos pos) {
      return context.checkBlock(pos, state -> state.is(Blocks.SHELF_MUSHROOM));
   }

   private static boolean hasHorizontallyAdjacentShelfMushroom(final TreeDecorator.Context context, final BlockPos pos) {
      for (Direction dir : Direction.Plane.HORIZONTAL) {
         if (hasShelfMushroomAt(context, pos.relative(dir))) {
            return true;
         }
      }

      return false;
   }

   public static boolean isBlockReplaceableWithShelfMushroom(final TreeDecorator.Context context, final BlockPos pos) {
      return context.isReplaceable(pos) && !context.isWaterOrWaterNearby(pos);
   }
}
