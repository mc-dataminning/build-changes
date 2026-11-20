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
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: new net/minecraft/core/BlockPos
      // 003: dup
      // 004: aload 4
      // 006: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 009: aload 2
      // 00a: invokevirtual net/minecraft/world/level/chunk/ChunkGenerator.getSeaLevel ()I
      // 00d: aload 4
      // 00f: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 012: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 015: astore 4
      // 017: aload 3
      // 018: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 01d: ldc2_w 0.7
      // 020: dcmpl
      // 021: ifle 028
      // 024: bipush 1
      // 025: goto 029
      // 028: bipush 0
      // 029: istore 5
      // 02b: aload 0
      // 02c: getfield net/minecraft/world/level/levelgen/feature/IcebergFeature.state Lnet/minecraft/world/level/block/state/BlockState;
      // 02f: astore 6
      // 031: aload 3
      // 032: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 037: ldc2_w 2.0
      // 03a: dmul
      // 03b: ldc2_w 3.141592653589793
      // 03e: dmul
      // 03f: dstore 7
      // 041: bipush 11
      // 043: aload 3
      // 044: bipush 5
      // 045: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 04a: isub
      // 04b: istore 9
      // 04d: bipush 3
      // 04e: aload 3
      // 04f: bipush 3
      // 050: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 055: iadd
      // 056: istore 10
      // 058: aload 3
      // 059: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 05e: ldc2_w 0.7
      // 061: dcmpl
      // 062: ifle 069
      // 065: bipush 1
      // 066: goto 06a
      // 069: bipush 0
      // 06a: istore 11
      // 06c: bipush 11
      // 06e: istore 12
      // 070: iload 11
      // 072: ifeq 083
      // 075: aload 3
      // 076: bipush 6
      // 078: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 07d: bipush 6
      // 07f: iadd
      // 080: goto 08d
      // 083: aload 3
      // 084: bipush 15
      // 086: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 08b: bipush 3
      // 08c: iadd
      // 08d: istore 13
      // 08f: iload 11
      // 091: ifne 0b1
      // 094: aload 3
      // 095: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 09a: ldc2_w 0.9
      // 09d: dcmpl
      // 09e: ifle 0b1
      // 0a1: iload 13
      // 0a3: aload 3
      // 0a4: bipush 19
      // 0a6: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 0ab: bipush 7
      // 0ad: iadd
      // 0ae: iadd
      // 0af: istore 13
      // 0b1: iload 13
      // 0b3: aload 3
      // 0b4: bipush 11
      // 0b6: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 0bb: iadd
      // 0bc: bipush 18
      // 0be: invokestatic java/lang/Math.min (II)I
      // 0c1: istore 14
      // 0c3: iload 13
      // 0c5: aload 3
      // 0c6: bipush 7
      // 0c8: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 0cd: iadd
      // 0ce: aload 3
      // 0cf: bipush 5
      // 0d0: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 0d5: isub
      // 0d6: bipush 11
      // 0d8: invokestatic java/lang/Math.min (II)I
      // 0db: istore 15
      // 0dd: iload 11
      // 0df: ifeq 0e7
      // 0e2: iload 9
      // 0e4: goto 0e9
      // 0e7: bipush 11
      // 0e9: istore 16
      // 0eb: iload 16
      // 0ed: ineg
      // 0ee: istore 17
      // 0f0: iload 17
      // 0f2: iload 16
      // 0f4: if_icmpge 16b
      // 0f7: iload 16
      // 0f9: ineg
      // 0fa: istore 18
      // 0fc: iload 18
      // 0fe: iload 16
      // 100: if_icmpge 165
      // 103: bipush 0
      // 104: istore 19
      // 106: iload 19
      // 108: iload 13
      // 10a: if_icmpge 15f
      // 10d: iload 11
      // 10f: ifeq 11f
      // 112: aload 0
      // 113: iload 19
      // 115: iload 13
      // 117: iload 15
      // 119: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.heightDependentRadiusEllipse (III)I
      // 11c: goto 12a
      // 11f: aload 0
      // 120: aload 3
      // 121: iload 19
      // 123: iload 13
      // 125: iload 15
      // 127: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.heightDependentRadiusRound (Lnet/minecraft/util/RandomSource;III)I
      // 12a: istore 20
      // 12c: iload 11
      // 12e: ifne 13b
      // 131: iload 17
      // 133: iload 20
      // 135: if_icmplt 13b
      // 138: goto 159
      // 13b: aload 0
      // 13c: aload 1
      // 13d: aload 3
      // 13e: aload 4
      // 140: iload 13
      // 142: iload 17
      // 144: iload 19
      // 146: iload 18
      // 148: iload 20
      // 14a: iload 16
      // 14c: iload 11
      // 14e: iload 10
      // 150: dload 7
      // 152: iload 5
      // 154: aload 6
      // 156: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.generateIcebergBlock (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;IIIIIIZIDZLnet/minecraft/world/level/block/state/BlockState;)V
      // 159: iinc 19 1
      // 15c: goto 106
      // 15f: iinc 18 1
      // 162: goto 0fc
      // 165: iinc 17 1
      // 168: goto 0f0
      // 16b: aload 0
      // 16c: aload 1
      // 16d: aload 4
      // 16f: iload 15
      // 171: iload 13
      // 173: iload 11
      // 175: iload 9
      // 177: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.smooth (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;IIZI)V
      // 17a: iload 16
      // 17c: ineg
      // 17d: istore 17
      // 17f: iload 17
      // 181: iload 16
      // 183: if_icmpge 20b
      // 186: iload 16
      // 188: ineg
      // 189: istore 18
      // 18b: iload 18
      // 18d: iload 16
      // 18f: if_icmpge 205
      // 192: bipush -1
      // 193: istore 19
      // 195: iload 19
      // 197: iload 14
      // 199: ineg
      // 19a: if_icmple 1ff
      // 19d: iload 11
      // 19f: ifeq 1bf
      // 1a2: iload 16
      // 1a4: i2f
      // 1a5: fconst_1
      // 1a6: iload 19
      // 1a8: i2d
      // 1a9: ldc2_w 2.0
      // 1ac: invokestatic java/lang/Math.pow (DD)D
      // 1af: d2f
      // 1b0: iload 14
      // 1b2: i2f
      // 1b3: ldc 8.0
      // 1b5: fmul
      // 1b6: fdiv
      // 1b7: fsub
      // 1b8: fmul
      // 1b9: invokestatic net/minecraft/util/Mth.ceil (F)I
      // 1bc: goto 1c1
      // 1bf: iload 16
      // 1c1: istore 20
      // 1c3: aload 0
      // 1c4: aload 3
      // 1c5: iload 19
      // 1c7: ineg
      // 1c8: iload 14
      // 1ca: iload 15
      // 1cc: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.heightDependentRadiusSteep (Lnet/minecraft/util/RandomSource;III)I
      // 1cf: istore 21
      // 1d1: iload 17
      // 1d3: iload 21
      // 1d5: if_icmplt 1db
      // 1d8: goto 1f9
      // 1db: aload 0
      // 1dc: aload 1
      // 1dd: aload 3
      // 1de: aload 4
      // 1e0: iload 14
      // 1e2: iload 17
      // 1e4: iload 19
      // 1e6: iload 18
      // 1e8: iload 21
      // 1ea: iload 20
      // 1ec: iload 11
      // 1ee: iload 10
      // 1f0: dload 7
      // 1f2: iload 5
      // 1f4: aload 6
      // 1f6: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.generateIcebergBlock (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;IIIIIIZIDZLnet/minecraft/world/level/block/state/BlockState;)V
      // 1f9: iinc 19 -1
      // 1fc: goto 195
      // 1ff: iinc 18 1
      // 202: goto 18b
      // 205: iinc 17 1
      // 208: goto 17f
      // 20b: iload 11
      // 20d: ifeq 225
      // 210: aload 3
      // 211: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 216: ldc2_w 0.1
      // 219: dcmpl
      // 21a: ifle 221
      // 21d: bipush 1
      // 21e: goto 237
      // 221: bipush 0
      // 222: goto 237
      // 225: aload 3
      // 226: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 22b: ldc2_w 0.7
      // 22e: dcmpl
      // 22f: ifle 236
      // 232: bipush 1
      // 233: goto 237
      // 236: bipush 0
      // 237: istore 17
      // 239: iload 17
      // 23b: ifeq 252
      // 23e: aload 0
      // 23f: aload 3
      // 240: aload 1
      // 241: iload 15
      // 243: iload 13
      // 245: aload 4
      // 247: iload 11
      // 249: iload 9
      // 24b: dload 7
      // 24d: iload 10
      // 24f: invokevirtual net/minecraft/world/level/levelgen/feature/IcebergFeature.generateCutOut (Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/LevelAccessor;IILnet/minecraft/core/BlockPos;ZIDI)V
      // 252: bipush 1
      // 253: ireturn
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
      int randomSignX = random.nextBoolean() ? -1 : 1;
      int randomSignZ = random.nextBoolean() ? -1 : 1;
      int xOff = random.nextInt(Math.max(width / 2 - 2, 1));
      if (random.nextBoolean()) {
         xOff = width / 2 + 1 - random.nextInt(Math.max(width - width / 2 - 1, 1));
      }

      int zOff = random.nextInt(Math.max(width / 2 - 2, 1));
      if (random.nextBoolean()) {
         zOff = width / 2 + 1 - random.nextInt(Math.max(width - width / 2 - 1, 1));
      }

      if (isEllipse) {
         xOff = zOff = random.nextInt(Math.max(shapeEllipseA - 5, 1));
      }

      BlockPos localOrigin = new BlockPos(randomSignX * xOff, 0, randomSignZ * zOff);
      double angle = isEllipse ? shapeAngle + (Math.PI / 2) : random.nextDouble() * 2.0 * Math.PI;

      for (int yOff = 0; yOff < height - 3; yOff++) {
         int radius = this.heightDependentRadiusRound(random, yOff, height, width);
         this.carve(radius, yOff, globalOrigin, level, false, angle, localOrigin, shapeEllipseA, shapeEllipseC);
      }

      for (int yOff = -1; yOff > -height + random.nextInt(5); yOff--) {
         int radius = this.heightDependentRadiusSteep(random, -yOff, height, width);
         this.carve(radius, yOff, globalOrigin, level, true, angle, localOrigin, shapeEllipseA, shapeEllipseC);
      }
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
         double compareVal = isEllipse ? -0.5 : -6 - random.nextInt(3);
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
         if (snowOnTop && !state.is(Blocks.WATER) && hDiff <= random.nextInt(Math.max(1, height / divisor)) + height * 0.6 && randomness) {
            this.setBlock(level, pos, Blocks.SNOW_BLOCK.defaultBlockState());
         } else {
            this.setBlock(level, pos, mainBlockState);
         }
      }
   }

   private int getEllipseC(final int yOff, final int height, final int shapeEllipseC) {
      int c = shapeEllipseC;
      if (yOff > 0 && height - yOff <= 3) {
         c -= 4 - (height - yOff);
      }

      return c;
   }

   private double signedDistanceCircle(final int xo, final int zo, final BlockPos origin, final int radius, final RandomSource random) {
      float off = 10.0F * Math.clamp(random.nextFloat(), 0.2F, 0.8F) / radius;
      return off + Math.pow(xo - origin.getX(), 2.0) + Math.pow(zo - origin.getZ(), 2.0) - Math.pow(radius, 2.0);
   }

   private double signedDistanceEllipse(final int xo, final int zo, final BlockPos origin, final int a, final int c, final double angle) {
      return Math.pow(((xo - origin.getX()) * Math.cos(angle) - (zo - origin.getZ()) * Math.sin(angle)) / a, 2.0)
         + Math.pow(((xo - origin.getX()) * Math.sin(angle) + (zo - origin.getZ()) * Math.cos(angle)) / c, 2.0)
         - 1.0;
   }

   private int heightDependentRadiusRound(final RandomSource random, final int yOff, final int height, final int width) {
      float k = 3.5F - random.nextFloat();
      float scale = (1.0F - (float)Math.pow(yOff, 2.0) / (height * k)) * width;
      if (height > 15 + random.nextInt(5)) {
         int tempYOff = yOff < 3 + random.nextInt(6) ? yOff / 2 : yOff;
         scale = (1.0F - tempYOff / (height * k * 0.4F)) * width;
      }

      return Mth.ceil(scale / 2.0F);
   }

   private int heightDependentRadiusEllipse(final int yOff, final int height, final int width) {
      float k = 1.0F;
      float scale = (1.0F - (float)Math.pow(yOff, 2.0) / (height * 1.0F)) * width;
      return Mth.ceil(scale / 2.0F);
   }

   private int heightDependentRadiusSteep(final RandomSource random, final int yOff, final int height, final int width) {
      float k = 1.0F + random.nextFloat() / 2.0F;
      float scale = (1.0F - yOff / (height * k)) * width;
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
