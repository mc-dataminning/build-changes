package net.minecraft.world.level.levelgen.feature.foliageplacers;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.material.Fluids;

public abstract class FoliagePlacer {
   public static final Codec<FoliagePlacer> CODEC = BuiltInRegistries.FOLIAGE_PLACER_TYPE.byNameCodec().dispatch(FoliagePlacer::type, FoliagePlacerType::codec);
   protected final IntProvider radius;
   protected final IntProvider offset;

   protected static <P extends FoliagePlacer> P2<Mu<P>, IntProvider, IntProvider> foliagePlacerParts(final Instance<P> instance) {
      return instance.group(
         IntProviders.codec(0, 16).fieldOf("radius").forGetter(p -> p.radius), IntProviders.codec(0, 16).fieldOf("offset").forGetter(p -> p.offset)
      );
   }

   public FoliagePlacer(final IntProvider radius, final IntProvider offset) {
      this.radius = radius;
      this.offset = offset;
   }

   protected abstract FoliagePlacerType<?> type();

   public void createFoliage(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final int treeHeight,
      final FoliagePlacer.FoliageAttachment foliageAttachment,
      final int foliageHeight,
      final int leafRadius
   ) {
      this.createFoliage(level, foliageSetter, random, tree, treeHeight, foliageAttachment, foliageHeight, leafRadius, this.offset(random));
   }

   protected abstract void createFoliage(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final int treeHeight,
      final FoliagePlacer.FoliageAttachment foliageAttachment,
      final int foliageHeight,
      final int leafRadius,
      final int offset
   );

   public abstract int foliageHeight(final RandomSource random, final int treeHeight, final TreeFeature tree);

   public int foliageRadius(final RandomSource random, final int trunkHeight) {
      return this.radius.sample(random);
   }

   private int offset(final RandomSource random) {
      return this.offset.sample(random);
   }

   protected abstract boolean shouldSkipLocation(
      final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk
   );

   protected boolean shouldSkipLocationSigned(
      final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: iload 6
      // 02: ifeq 28
      // 05: iload 2
      // 06: invokestatic java/lang/Math.abs (I)I
      // 09: iload 2
      // 0a: bipush 1
      // 0b: isub
      // 0c: invokestatic java/lang/Math.abs (I)I
      // 0f: invokestatic java/lang/Math.min (II)I
      // 12: istore 7
      // 14: iload 4
      // 16: invokestatic java/lang/Math.abs (I)I
      // 19: iload 4
      // 1b: bipush 1
      // 1c: isub
      // 1d: invokestatic java/lang/Math.abs (I)I
      // 20: invokestatic java/lang/Math.min (II)I
      // 23: istore 8
      // 25: goto 35
      // 28: iload 2
      // 29: invokestatic java/lang/Math.abs (I)I
      // 2c: istore 7
      // 2e: iload 4
      // 30: invokestatic java/lang/Math.abs (I)I
      // 33: istore 8
      // 35: aload 0
      // 36: aload 1
      // 37: iload 7
      // 39: iload 3
      // 3a: iload 8
      // 3c: iload 5
      // 3e: iload 6
      // 40: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer.shouldSkipLocation (Lnet/minecraft/util/RandomSource;IIIIZ)Z
      // 43: ireturn
   }

   protected void placeLeavesRow(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final BlockPos origin,
      final int currentRadius,
      final int y,
      final boolean doubleTrunk
   ) {
      int offset = doubleTrunk ? 1 : 0;
      BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

      for (int dx = -currentRadius; dx <= currentRadius + offset; dx++) {
         for (int dz = -currentRadius; dz <= currentRadius + offset; dz++) {
            if (!this.shouldSkipLocationSigned(random, dx, y, dz, currentRadius, doubleTrunk)) {
               pos.setWithOffset(origin, dx, y, dz);
               tryPlaceLeaf(level, foliageSetter, random, tree, pos);
            }
         }
      }
   }

   protected final void placeLeavesRowWithHangingLeavesBelow(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final BlockPos origin,
      final int currentRadius,
      final int y,
      final boolean doubleTrunk,
      final float hangingLeavesChance,
      final float hangingLeavesExtensionChance
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: aload 4
      // 06: aload 5
      // 08: iload 6
      // 0a: iload 7
      // 0c: iload 8
      // 0e: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer.placeLeavesRow (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;Lnet/minecraft/core/BlockPos;IIZ)V
      // 11: iload 8
      // 13: ifeq 1a
      // 16: bipush 1
      // 17: goto 1b
      // 1a: bipush 0
      // 1b: istore 11
      // 1d: aload 5
      // 1f: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 22: astore 12
      // 24: new net/minecraft/core/BlockPos$MutableBlockPos
      // 27: dup
      // 28: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> ()V
      // 2b: astore 13
      // 2d: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
      // 30: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
      // 33: astore 14
      // 35: aload 14
      // 37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c: ifeq fc
      // 3f: aload 14
      // 41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 46: checkcast net/minecraft/core/Direction
      // 49: astore 15
      // 4b: aload 15
      // 4d: invokevirtual net/minecraft/core/Direction.getClockWise ()Lnet/minecraft/core/Direction;
      // 50: astore 16
      // 52: aload 16
      // 54: invokevirtual net/minecraft/core/Direction.getAxisDirection ()Lnet/minecraft/core/Direction$AxisDirection;
      // 57: getstatic net/minecraft/core/Direction$AxisDirection.POSITIVE Lnet/minecraft/core/Direction$AxisDirection;
      // 5a: if_acmpne 65
      // 5d: iload 6
      // 5f: iload 11
      // 61: iadd
      // 62: goto 67
      // 65: iload 6
      // 67: istore 17
      // 69: aload 13
      // 6b: aload 5
      // 6d: bipush 0
      // 6e: iload 7
      // 70: bipush 1
      // 71: isub
      // 72: bipush 0
      // 73: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setWithOffset (Lnet/minecraft/core/Vec3i;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 76: aload 16
      // 78: iload 17
      // 7a: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 7d: aload 15
      // 7f: iload 6
      // 81: ineg
      // 82: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 85: pop
      // 86: iload 6
      // 88: ineg
      // 89: istore 18
      // 8b: iload 18
      // 8d: iload 6
      // 8f: iload 11
      // 91: iadd
      // 92: if_icmpge f9
      // 95: aload 2
      // 96: aload 13
      // 98: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 9b: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 9e: invokeinterface net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter.isSet (Lnet/minecraft/core/BlockPos;)Z 2
      // a3: istore 19
      // a5: aload 13
      // a7: getstatic net/minecraft/core/Direction.DOWN Lnet/minecraft/core/Direction;
      // aa: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // ad: pop
      // ae: iload 19
      // b0: ifne b6
      // b3: goto eb
      // b6: aload 1
      // b7: aload 2
      // b8: aload 3
      // b9: aload 4
      // bb: fload 9
      // bd: aload 12
      // bf: aload 13
      // c1: invokestatic net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer.tryPlaceExtension (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;FLnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Z
      // c4: ifne ca
      // c7: goto eb
      // ca: aload 13
      // cc: getstatic net/minecraft/core/Direction.DOWN Lnet/minecraft/core/Direction;
      // cf: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // d2: pop
      // d3: aload 1
      // d4: aload 2
      // d5: aload 3
      // d6: aload 4
      // d8: fload 10
      // da: aload 12
      // dc: aload 13
      // de: invokestatic net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer.tryPlaceExtension (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;FLnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Z
      // e1: pop
      // e2: aload 13
      // e4: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // e7: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // ea: pop
      // eb: iinc 18 1
      // ee: aload 13
      // f0: aload 15
      // f2: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // f5: pop
      // f6: goto 8b
      // f9: goto 35
      // fc: return
   }

   private static boolean tryPlaceExtension(
      final WorldGenLevel level,
      final FoliagePlacer.FoliageSetter foliageSetter,
      final RandomSource random,
      final TreeFeature tree,
      final float chance,
      final BlockPos logPos,
      final BlockPos.MutableBlockPos pos
   ) {
      if (pos.distManhattan(logPos) >= 7) {
         return false;
      } else {
         return random.nextFloat() > chance ? false : tryPlaceLeaf(level, foliageSetter, random, tree, pos);
      }
   }

   protected static boolean tryPlaceLeaf(
      final WorldGenLevel level, final FoliagePlacer.FoliageSetter foliageSetter, final RandomSource random, final TreeFeature tree, final BlockPos pos
   ) {
      boolean isPersistent = level.isStateAtPosition(pos, state -> state.getValueOrElse(BlockStateProperties.PERSISTENT, Boolean.valueOf(false)));
      if (!isPersistent && TreeFeature.validTreePos(level, pos)) {
         BlockState foliageState = tree.foliageProvider().value().getState(level, random, pos);
         if (foliageState.hasProperty(BlockStateProperties.WATERLOGGED)) {
            foliageState = foliageState.setValue(
               BlockStateProperties.WATERLOGGED, Boolean.valueOf(level.isFluidAtPosition(pos, fluidState -> fluidState.isSourceOfType(Fluids.WATER)))
            );
         }

         foliageSetter.set(pos, foliageState);
         return true;
      } else {
         return false;
      }
   }

   public static record FoliageAttachment(BlockPos pos, int radiusOffsetXZ, int foliageHeightOffset, int sizeX, int sizeZ) {
      public FoliageAttachment(final BlockPos pos, final int radiusOffsetXZ, final boolean doubleTrunk) {
         int sizeXZ = doubleTrunk ? 2 : 1;
         this(pos, radiusOffsetXZ, sizeXZ, sizeXZ);
      }

      public FoliageAttachment(final BlockPos pos, final int radiusOffsetXZ, final int sizeX, final int sizeZ) {
         this(pos, radiusOffsetXZ, 0, sizeX, sizeZ);
      }

      public boolean doubleTrunk() {
         return this.sizeX == 2 && this.sizeZ == 2;
      }
   }

   public interface FoliageSetter {
      void set(final BlockPos pos, final BlockState state);

      boolean isSet(final BlockPos pos);
   }
}
