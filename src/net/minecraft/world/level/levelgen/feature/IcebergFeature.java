package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;

public record IcebergFeature(BlockState state) implements Feature {
   public static final MapCodec<IcebergFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(BlockState.CODEC.fieldOf("state").forGetter(IcebergFeature::state)).apply(i, IcebergFeature::new)
   );

   @Override
   public MapCodec<IcebergFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, BlockPos origin) {
      origin = new BlockPos(origin.getX(), chunkGenerator.getSeaLevel(), origin.getZ());
      boolean snowOnTop = random.nextDouble() > 0.7;
      BlockState mainBlockState = this.state;
      double shapeAngle = random.nextDouble() * 2.0 * Math.PI;
      int shapeEllipseA = 11 - random.nextInt(5);
      int shapeEllipseC = 3 + random.nextInt(3);
      boolean isEllipse = random.nextDouble() > 0.7;
      int maxWidthRoundIceberg = 11;
      int overWaterHeight = isEllipse ? random.nextInt(6) + 6 : random.nextInt(15) + 3;
      if (!isEllipse && random.nextDouble() > 0.9) {
         overWaterHeight += random.nextInt(19) + 7;
      }

      int underWaterHeight = Math.min(overWaterHeight + random.nextInt(11), 18);
      int width = Math.min(overWaterHeight + random.nextInt(7) - random.nextInt(5), 11);
      int a = isEllipse ? shapeEllipseA : 11;

      for (int xo = -a; xo < a; xo++) {
         for (int zo = -a; zo < a; zo++) {
            for (int yOff = 0; yOff < overWaterHeight; yOff++) {
               int radius = isEllipse
                  ? this.heightDependentRadiusEllipse(yOff, overWaterHeight, width)
                  : this.heightDependentRadiusRound(random, yOff, overWaterHeight, width);
               if (isEllipse || xo < radius) {
                  this.generateIcebergBlock(
                     level, random, origin, overWaterHeight, xo, yOff, zo, radius, a, isEllipse, shapeEllipseC, shapeAngle, snowOnTop, mainBlockState
                  );
               }
            }
         }
      }

      this.smooth(level, origin, width, overWaterHeight, isEllipse, shapeEllipseA);

      for (int xo = -a; xo < a; xo++) {
         for (int zo = -a; zo < a; zo++) {
            for (int yOffx = -1; yOffx > -underWaterHeight; yOffx--) {
               int newA = isEllipse ? Mth.ceil((float)a * (1.0F - (float)Math.pow((double)yOffx, 2.0) / ((float)underWaterHeight * 8.0F))) : a;
               int radius = this.heightDependentRadiusSteep(random, -yOffx, underWaterHeight, width);
               if (xo < radius) {
                  this.generateIcebergBlock(
                     level, random, origin, underWaterHeight, xo, yOffx, zo, radius, newA, isEllipse, shapeEllipseC, shapeAngle, snowOnTop, mainBlockState
                  );
               }
            }
         }
      }

      boolean doCutOut = isEllipse ? random.nextDouble() > 0.1 : random.nextDouble() > 0.7;
      if (doCutOut) {
         this.generateCutOut(random, level, width, overWaterHeight, origin, isEllipse, shapeEllipseA, shapeAngle, shapeEllipseC);
      }

      return true;
   }

   private void generateCutOut(
      final RandomSource random,
      final LevelAccessor level,
      final int width,
      final int height,
      final BlockPos globalOrigin,
      final boolean isEllipse,
      final int shapeEllipseA,
      final double shapeAngle,
      final int shapeEllipseC
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
      // 006: ifeq 00d
      // 009: bipush -1
      // 00a: goto 00e
      // 00d: bipush 1
      // 00e: istore 11
      // 010: aload 1
      // 011: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
      // 016: ifeq 01d
      // 019: bipush -1
      // 01a: goto 01e
      // 01d: bipush 1
      // 01e: istore 12
      // 020: aload 1
      // 021: iload 3
      // 022: bipush 2
      // 023: idiv
      // 024: bipush 2
      // 025: isub
      // 026: bipush 1
      // 027: invokestatic java/lang/Math.max (II)I
      // 02a: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 02f: istore 13
      // 031: aload 1
      // 032: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
      // 037: ifeq 053
      // 03a: iload 3
      // 03b: bipush 2
      // 03c: idiv
      // 03d: bipush 1
      // 03e: iadd
      // 03f: aload 1
      // 040: iload 3
      // 041: iload 3
      // 042: bipush 2
      // 043: idiv
      // 044: isub
      // 045: bipush 1
      // 046: isub
      // 047: bipush 1
      // 048: invokestatic java/lang/Math.max (II)I
      // 04b: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 050: isub
      // 051: istore 13
      // 053: aload 1
      // 054: iload 3
      // 055: bipush 2
      // 056: idiv
      // 057: bipush 2
      // 058: isub
      // 059: bipush 1
      // 05a: invokestatic java/lang/Math.max (II)I
      // 05d: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 062: istore 14
      // 064: aload 1
      // 065: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
      // 06a: ifeq 086
      // 06d: iload 3
      // 06e: bipush 2
      // 06f: idiv
      // 070: bipush 1
      // 071: iadd
      // 072: aload 1
      // 073: iload 3
      // 074: iload 3
      // 075: bipush 2
      // 076: idiv
      // 077: isub
      // 078: bipush 1
      // 079: isub
      // 07a: bipush 1
      // 07b: invokestatic java/lang/Math.max (II)I
      // 07e: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 083: isub
      // 084: istore 14
      // 086: iload 6
      // 088: ifeq 09e
      // 08b: aload 1
      // 08c: iload 7
      // 08e: bipush 5
      // 08f: isub
      // 090: bipush 1
      // 091: invokestatic java/lang/Math.max (II)I
      // 094: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 099: dup
      // 09a: istore 14
      // 09c: istore 13
      // 09e: new net/minecraft/core/BlockPos
      // 0a1: dup
      // 0a2: iload 11
      // 0a4: iload 13
      // 0a6: imul
      // 0a7: bipush 0
      // 0a8: iload 12
      // 0aa: iload 14
      // 0ac: imul
      // 0ad: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0b0: astore 15
      // 0b2: iload 6
      // 0b4: ifeq 0c0
      // 0b7: dload 8
      // 0b9: ldc2_w 1.5707963267948966
      // 0bc: dadd
      // 0bd: goto 0ce
      // 0c0: aload 1
      // 0c1: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 0c6: ldc2_w 2.0
      // 0c9: dmul
      // 0ca: ldc2_w 3.141592653589793
      // 0cd: dmul
      // 0ce: dstore 16
      // 0d0: bipush 0
      // 0d1: istore 18
      // 0d3: iload 18
      // 0d5: iload 4
      // 0d7: bipush 3
      // 0d8: isub
      // 0d9: if_icmpge 102
      // 0dc: aload 0
      // 0dd: aload 1
      // 0de: iload 18
      // 0e0: iload 4
      // 0e2: iload 3
      // 0e3: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.heightDependentRadiusRound (Lnet/minecraft/util/RandomSource;III)I
      // 0e6: istore 19
      // 0e8: aload 0
      // 0e9: iload 19
      // 0eb: iload 18
      // 0ed: aload 5
      // 0ef: aload 2
      // 0f0: bipush 0
      // 0f1: dload 16
      // 0f3: aload 15
      // 0f5: iload 7
      // 0f7: iload 10
      // 0f9: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.carve (IILnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelAccessor;ZDLnet/minecraft/core/BlockPos;II)V
      // 0fc: iinc 18 1
      // 0ff: goto 0d3
      // 102: bipush -1
      // 103: istore 18
      // 105: iload 18
      // 107: iload 4
      // 109: ineg
      // 10a: aload 1
      // 10b: bipush 5
      // 10c: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 111: iadd
      // 112: if_icmple 13c
      // 115: aload 0
      // 116: aload 1
      // 117: iload 18
      // 119: ineg
      // 11a: iload 4
      // 11c: iload 3
      // 11d: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.heightDependentRadiusSteep (Lnet/minecraft/util/RandomSource;III)I
      // 120: istore 19
      // 122: aload 0
      // 123: iload 19
      // 125: iload 18
      // 127: aload 5
      // 129: aload 2
      // 12a: bipush 1
      // 12b: dload 16
      // 12d: aload 15
      // 12f: iload 7
      // 131: iload 10
      // 133: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.carve (IILnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelAccessor;ZDLnet/minecraft/core/BlockPos;II)V
      // 136: iinc 18 -1
      // 139: goto 105
      // 13c: return
   }

   private void carve(
      final int radius,
      final int yOff,
      final BlockPos globalOrigin,
      final LevelAccessor level,
      final boolean underWater,
      final double angle,
      final BlockPos localOrigin,
      final int shapeEllipseA,
      final int shapeEllipseC
   ) {
      int a = radius + 1 + shapeEllipseA / 3;
      int c = Math.min(radius - 3, 3) + shapeEllipseC / 2 - 1;

      for (int xo = -a; xo < a; xo++) {
         for (int zo = -a; zo < a; zo++) {
            double signedDist = this.signedDistanceEllipse(xo, zo, localOrigin, a, c, angle);
            if (signedDist < 0.0) {
               BlockPos pos = globalOrigin.offset(xo, yOff, zo);
               BlockState state = level.getBlockState(pos);
               if (isIcebergState(state) || state.is(Blocks.SNOW_BLOCK)) {
                  if (underWater) {
                     this.setBlock(level, pos, Blocks.WATER.defaultBlockState());
                  } else {
                     this.setBlock(level, pos, Blocks.AIR.defaultBlockState());
                     this.removeFloatingSnowLayer(level, pos);
                  }
               }
            }
         }
      }
   }

   private void removeFloatingSnowLayer(final LevelAccessor level, final BlockPos pos) {
      if (level.getBlockState(pos.above()).is(Blocks.SNOW)) {
         this.setBlock(level, pos.above(), Blocks.AIR.defaultBlockState());
      }
   }

   private void generateIcebergBlock(
      final LevelAccessor level,
      final RandomSource random,
      final BlockPos origin,
      final int height,
      final int xo,
      final int yOff,
      final int zo,
      final int radius,
      final int a,
      final boolean isEllipse,
      final int shapeEllipseC,
      final double shapeAngle,
      final boolean snowOnTop,
      final BlockState mainBlockState
   ) {
      double signedDist = isEllipse
         ? this.signedDistanceEllipse(xo, zo, BlockPos.ZERO, a, this.getEllipseC(yOff, height, shapeEllipseC), shapeAngle)
         : this.signedDistanceCircle(xo, zo, BlockPos.ZERO, radius, random);
      if (signedDist < 0.0) {
         BlockPos pos = origin.offset(xo, yOff, zo);
         double compareVal = isEllipse ? -0.5 : (double)(-6 - random.nextInt(3));
         if (signedDist > compareVal && random.nextDouble() > 0.9) {
            return;
         }

         this.setIcebergBlock(pos, level, random, height - yOff, height, isEllipse, snowOnTop, mainBlockState);
      }
   }

   private void setIcebergBlock(
      final BlockPos pos,
      final LevelAccessor level,
      final RandomSource random,
      final int hDiff,
      final int height,
      final boolean isEllipse,
      final boolean snowOnTop,
      final BlockState mainBlockState
   ) {
      BlockState state = level.getBlockState(pos);
      if (state.isAir() || state.is(Blocks.SNOW_BLOCK) || state.is(Blocks.ICE) || state.is(Blocks.WATER)) {
         boolean randomness = !isEllipse || random.nextDouble() > 0.05;
         int divisor = isEllipse ? 3 : 2;
         if (snowOnTop
            && !state.is(Blocks.WATER)
            && (double)hDiff <= (double)random.nextInt(Math.max(1, height / divisor)) + (double)height * 0.6
            && randomness) {
            this.setBlock(level, pos, Blocks.SNOW_BLOCK.defaultBlockState());
         } else {
            this.setBlock(level, pos, mainBlockState);
         }
      }
   }

   private int getEllipseC(final int yOff, final int height, final int shapeEllipseC) {
      int c = shapeEllipseC;
      if (yOff > 0 && height - yOff <= 3) {
         c = shapeEllipseC - (4 - (height - yOff));
      }

      return c;
   }

   private double signedDistanceCircle(final int xo, final int zo, final BlockPos origin, final int radius, final RandomSource random) {
      float off = 10.0F * Mth.clamp(random.nextFloat(), 0.2F, 0.8F) / (float)radius;
      return (double)off + Math.pow((double)(xo - origin.getX()), 2.0) + Math.pow((double)(zo - origin.getZ()), 2.0) - Math.pow((double)radius, 2.0);
   }

   private double signedDistanceEllipse(final int xo, final int zo, final BlockPos origin, final int a, final int c, final double angle) {
      return Math.pow(((double)(xo - origin.getX()) * Math.cos(angle) - (double)(zo - origin.getZ()) * Math.sin(angle)) / (double)a, 2.0)
         + Math.pow(((double)(xo - origin.getX()) * Math.sin(angle) + (double)(zo - origin.getZ()) * Math.cos(angle)) / (double)c, 2.0)
         - 1.0;
   }

   private int heightDependentRadiusRound(final RandomSource random, final int yOff, final int height, final int width) {
      float k = 3.5F - random.nextFloat();
      float scale = (1.0F - (float)Math.pow((double)yOff, 2.0) / ((float)height * k)) * (float)width;
      if (height > 15 + random.nextInt(5)) {
         int tempYOff = yOff < 3 + random.nextInt(6) ? yOff / 2 : yOff;
         scale = (1.0F - (float)tempYOff / ((float)height * k * 0.4F)) * (float)width;
      }

      return Mth.ceil(scale / 2.0F);
   }

   private int heightDependentRadiusEllipse(final int yOff, final int height, final int width) {
      float k = 1.0F;
      float scale = (1.0F - (float)Math.pow((double)yOff, 2.0) / ((float)height * 1.0F)) * (float)width;
      return Mth.ceil(scale / 2.0F);
   }

   private int heightDependentRadiusSteep(final RandomSource random, final int yOff, final int height, final int width) {
      float k = 1.0F + random.nextFloat() / 2.0F;
      float scale = (1.0F - (float)yOff / ((float)height * k)) * (float)width;
      return Mth.ceil(scale / 2.0F);
   }

   private static boolean isIcebergState(final BlockState state) {
      return state.is(Blocks.PACKED_ICE) || state.is(Blocks.SNOW_BLOCK) || state.is(Blocks.BLUE_ICE);
   }

   private boolean belowIsAir(final BlockGetter level, final BlockPos pos) {
      return level.getBlockState(pos.below()).isAir();
   }

   private void smooth(final LevelAccessor level, final BlockPos origin, final int width, final int height, final boolean isEllipse, final int shapeEllipseA) {
      int a = isEllipse ? shapeEllipseA : width / 2;

      for (int x = -a; x <= a; x++) {
         for (int z = -a; z <= a; z++) {
            for (int yOff = 0; yOff <= height; yOff++) {
               BlockPos pos = origin.offset(x, yOff, z);
               BlockState state = level.getBlockState(pos);
               if (isIcebergState(state) || state.is(Blocks.SNOW)) {
                  if (this.belowIsAir(level, pos)) {
                     this.setBlock(level, pos, Blocks.AIR.defaultBlockState());
                     this.setBlock(level, pos.above(), Blocks.AIR.defaultBlockState());
                  } else if (isIcebergState(state)) {
                     BlockState[] sides = new BlockState[]{
                        level.getBlockState(pos.west()), level.getBlockState(pos.east()), level.getBlockState(pos.north()), level.getBlockState(pos.south())
                     };
                     int counter = 0;

                     for (BlockState side : sides) {
                        if (!isIcebergState(side)) {
                           counter++;
                        }
                     }

                     if (counter >= 3) {
                        this.setBlock(level, pos, Blocks.AIR.defaultBlockState());
                     }
                  }
               }
            }
         }
      }
   }
}
