package net.minecraft.world.level.levelgen.feature.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;

public class PoplarFoliagePlacer extends FoliagePlacer {
   public static final MapCodec<PoplarFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(
      i -> foliagePlacerParts(i)
            .and(
               i.group(
                  IntProviders.codec(5, 16).fieldOf("height").forGetter(p -> p.height),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("side_hole_chance").forGetter(p -> p.sideHoleChance)
               )
            )
            .apply(i, PoplarFoliagePlacer::new)
   );
   private final IntProvider height;
   private final float sideHoleChance;

   public PoplarFoliagePlacer(final IntProvider radius, final IntProvider offset, final IntProvider height, final float sideHoleChance) {
      super(radius, offset);
      this.height = height;
      this.sideHoleChance = sideHoleChance;
   }

   @Override
   protected FoliagePlacerType<?> type() {
      return FoliagePlacerType.POPLAR_FOLIAGE_PLACER;
   }

   @Override
   protected void createFoliage(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final int treeHeight,
      final FoliagePlacer.FoliageAttachment foliageAttachment,
      final int foliageHeight,
      final int leafRadius,
      final int offset
   ) {
      boolean doubleTrunk = foliageAttachment.doubleTrunk();
      BlockPos foliagePos = foliageAttachment.pos().above(offset);
      int currentRadius = leafRadius + foliageAttachment.radiusOffsetXZ() - 1;
      boolean flipRhombusShape = random.nextBoolean();
      int foliageHeightWithOffset = foliageHeight + foliageAttachment.foliageHeightOffset();
      this.placeLeavesRow(
         level, foliageSetter, random, tree, foliagePos, currentRadius - 2, foliageHeightWithOffset - 1, doubleTrunk, foliageHeightWithOffset, flipRhombusShape
      );
      this.placeLeavesRow(
         level, foliageSetter, random, tree, foliagePos, currentRadius - 1, foliageHeightWithOffset - 2, doubleTrunk, foliageHeightWithOffset, flipRhombusShape
      );
      this.placeLeavesRow(
         level, foliageSetter, random, tree, foliagePos, currentRadius - 1, foliageHeightWithOffset - 3, doubleTrunk, foliageHeightWithOffset, flipRhombusShape
      );

      for (int y = foliageHeightWithOffset - 4; y >= 1; y--) {
         this.placeLeavesRow(level, foliageSetter, random, tree, foliagePos, currentRadius, y, doubleTrunk, foliageHeightWithOffset, flipRhombusShape);
      }

      this.replaceLeavesWithLog(
         level, foliageSetter, tree, random, foliagePos, currentRadius, foliageHeightWithOffset - 4, doubleTrunk, foliageHeightWithOffset, flipRhombusShape
      );
      this.placeLeavesRow(level, foliageSetter, random, tree, foliagePos, currentRadius - 1, 0, doubleTrunk, foliageHeightWithOffset, flipRhombusShape);
      this.placeLeavesRow(
         level, foliageSetter, random, tree, foliagePos, Mth.clamp(currentRadius - 2, 1, 2), -1, doubleTrunk, foliageHeightWithOffset, flipRhombusShape
      );
   }

   private void replaceLeavesWithLog(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final TreeFeature tree,
      final RandomSource random,
      final BlockPos origin,
      final int currentRadius,
      final int y,
      final boolean doubleTrunk,
      final int foliageHeight,
      final boolean flipRhombusShape
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: iload 8
      // 02: ifeq 09
      // 05: bipush 1
      // 06: goto 0a
      // 09: bipush 0
      // 0a: istore 11
      // 0c: new net/minecraft/core/BlockPos$MutableBlockPos
      // 0f: dup
      // 10: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> ()V
      // 13: astore 12
      // 15: iload 6
      // 17: ineg
      // 18: istore 13
      // 1a: iload 13
      // 1c: iload 6
      // 1e: iload 11
      // 20: iadd
      // 21: if_icmpgt b9
      // 24: iload 6
      // 26: ineg
      // 27: istore 14
      // 29: iload 14
      // 2b: iload 6
      // 2d: iload 11
      // 2f: iadd
      // 30: if_icmpgt b3
      // 33: iload 14
      // 35: invokestatic net/minecraft/util/Mth.abs (I)I
      // 38: istore 15
      // 3a: iload 13
      // 3c: invokestatic net/minecraft/util/Mth.abs (I)I
      // 3f: istore 16
      // 41: iload 6
      // 43: iload 16
      // 45: iload 15
      // 47: aload 0
      // 48: iload 13
      // 4a: iload 14
      // 4c: iload 6
      // 4e: aload 0
      // 4f: iload 9
      // 51: iload 7
      // 53: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/PoplarFoliagePlacer.shouldRowBePartialRhombusShape (II)Z
      // 56: iload 10
      // 58: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/PoplarFoliagePlacer.getCornerBlocksToCutForRhombusShape (IIIZZ)I
      // 5b: bipush 2
      // 5c: invokestatic net/minecraft/world/level/levelgen/feature/foliageplacers/PoplarFoliagePlacer.isWithinRhombusShape (IIIII)Z
      // 5f: ifeq ad
      // 62: iload 15
      // 64: ifne 70
      // 67: iload 6
      // 69: iload 16
      // 6b: isub
      // 6c: bipush 4
      // 6d: if_icmpge 7e
      // 70: iload 16
      // 72: ifne ad
      // 75: iload 6
      // 77: iload 15
      // 79: isub
      // 7a: bipush 4
      // 7b: if_icmplt ad
      // 7e: aload 12
      // 80: aload 5
      // 82: iload 13
      // 84: iload 7
      // 86: iload 14
      // 88: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setWithOffset (Lnet/minecraft/core/Vec3i;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 8b: pop
      // 8c: aload 1
      // 8d: aload 2
      // 8e: aload 4
      // 90: aload 3
      // 91: aload 12
      // 93: iload 15
      // 95: ifne 9e
      // 98: getstatic net/minecraft/core/Direction$Axis.X Lnet/minecraft/core/Direction$Axis;
      // 9b: goto a1
      // 9e: getstatic net/minecraft/core/Direction$Axis.Z Lnet/minecraft/core/Direction$Axis;
      // a1: getstatic net/minecraft/core/Direction$AxisDirection.POSITIVE Lnet/minecraft/core/Direction$AxisDirection;
      // a4: invokestatic net/minecraft/core/Direction.fromAxisAndDirection (Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/core/Direction$AxisDirection;)Lnet/minecraft/core/Direction;
      // a7: invokestatic net/minecraft/world/level/levelgen/feature/foliageplacers/PoplarFoliagePlacer.getSidewaysStateModifier (Lnet/minecraft/core/Direction;)Ljava/util/function/Function;
      // aa: invokestatic net/minecraft/world/level/levelgen/feature/foliageplacers/PoplarFoliagePlacer.tryPlaceLog (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;Lnet/minecraft/core/BlockPos;Ljava/util/function/Function;)V
      // ad: iinc 14 1
      // b0: goto 29
      // b3: iinc 13 1
      // b6: goto 1a
      // b9: return
   }

   private static void tryPlaceLog(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final BlockPos pos,
      final Function<BlockState, BlockState> stateModifier
   ) {
      if (level.isStateAtPosition(pos, state -> state.equals(tree.foliageProvider().value().getState(level, random, pos)))) {
         foliageSetter.set(pos, stateModifier.apply(tree.trunkProvider().value().getState(level, random, pos)));
      }
   }

   private static Function<BlockState, BlockState> getSidewaysStateModifier(final Direction branchDirection) {
      return state -> state.trySetValue(RotatedPillarBlock.AXIS, branchDirection.getAxis());
   }

   @Override
   public int foliageHeight(final RandomSource random, final int treeHeight, final TreeFeature tree) {
      return this.height.sample(random);
   }

   private void placeLeavesRow(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final BlockPos origin,
      final int currentRadius,
      final int y,
      final boolean doubleTrunk,
      final int foliageHeight,
      final boolean flipRhombusShape
   ) {
      int offset = doubleTrunk ? 1 : 0;
      BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

      for (int dx = -currentRadius; dx <= currentRadius + offset; dx++) {
         for (int dz = -currentRadius; dz <= currentRadius + offset; dz++) {
            if (!this.shouldSkipLocation(random, dx, y, dz, currentRadius, doubleTrunk, foliageHeight, flipRhombusShape)) {
               pos.setWithOffset(origin, dx, y, dz);
               tryPlaceLeaf(level, foliageSetter, random, tree, pos);
            }
         }
      }
   }

   private boolean shouldSkipLocation(
      final RandomSource random,
      final int dx,
      final int y,
      final int dz,
      final int currentRadius,
      final boolean doubleTrunk,
      final int foliageHeight,
      final boolean flipRhombusShape
   ) {
      boolean shouldRowBePartialRhombusShape = this.shouldRowBePartialRhombusShape(foliageHeight, y);
      int cornerBlocksToCutForRhombusShape = this.getCornerBlocksToCutForRhombusShape(dx, dz, currentRadius, shouldRowBePartialRhombusShape, flipRhombusShape);
      int absDx = Mth.abs(dx);
      int absDz = Mth.abs(dz);
      boolean isRhombusEdgeBlock = absDx == currentRadius || absDz == currentRadius;
      if (shouldRowBePartialRhombusShape && isRhombusEdgeBlock) {
         return true;
      } else {
         int additionalSideRemoval = random.nextFloat() <= this.sideHoleChance ? 1 : 0;
         return !isWithinRhombusShape(currentRadius, absDx, absDz, cornerBlocksToCutForRhombusShape, additionalSideRemoval);
      }
   }

   @Override
   protected boolean shouldSkipLocationSigned(
      final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk
   ) {
      throw new IllegalStateException("Overridden method needs more context");
   }

   @Override
   protected boolean shouldSkipLocation(final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk) {
      throw new IllegalStateException("Overridden method needs more context");
   }

   private int getCornerBlocksToCutForRhombusShape(
      final int dx, final int dz, final int currentRadius, final boolean shouldRowBePartialRhombusShape, final boolean flipRhombusShape
   ) {
      boolean isSmallCornerOfShape = flipRhombusShape ? isLeftTopCornerOrRightLowerCorner(dx, dz) : isLeftLowerCornerOrRightTopCorner(dx, dz);
      return isSmallCornerOfShape ? currentRadius - 1 : (shouldRowBePartialRhombusShape ? currentRadius + 1 : currentRadius);
   }

   private static boolean isWithinRhombusShape(
      final int currentRadius, final int absDx, final int absDz, final int cornerBlocksToCutForRhombusShape, final int additionalSideRemoval
   ) {
      return absDx + absDz <= currentRadius * 2 - (cornerBlocksToCutForRhombusShape + additionalSideRemoval);
   }

   private static boolean isLeftLowerCornerOrRightTopCorner(final int dx, final int dz) {
      return dx > 0 && dz < 0 || dz > 0 && dx < 0;
   }

   private static boolean isLeftTopCornerOrRightLowerCorner(final int dx, final int dz) {
      return dx > 0 && dz > 0 || dz < 0 && dx < 0;
   }

   private boolean shouldRowBePartialRhombusShape(final int foliageHeight, final int y) {
      return foliageHeight - 1 == y || foliageHeight - 2 == y;
   }
}
