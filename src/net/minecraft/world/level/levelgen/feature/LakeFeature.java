package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

@Deprecated
public record LakeFeature(
   Holder<BlockStateProvider> fluid,
   Holder<BlockStateProvider> barrier,
   BlockPredicate canPlaceFeature,
   BlockPredicate canReplaceWithAirOrFluid,
   BlockPredicate canReplaceWithBarrier
) implements Feature {
   public static final MapCodec<LakeFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            BlockStateProvider.CODEC.fieldOf("fluid").forGetter(LakeFeature::fluid),
            BlockStateProvider.CODEC.fieldOf("barrier").forGetter(LakeFeature::barrier),
            BlockPredicate.CODEC.fieldOf("can_place_feature").forGetter(LakeFeature::canPlaceFeature),
            BlockPredicate.CODEC.fieldOf("can_replace_with_air_or_fluid").forGetter(LakeFeature::canReplaceWithAirOrFluid),
            BlockPredicate.CODEC.fieldOf("can_replace_with_barrier").forGetter(LakeFeature::canReplaceWithBarrier)
         )
         .apply(i, LakeFeature::new)
   );
   private static final BlockState AIR = Blocks.CAVE_AIR.defaultBlockState();

   @Override
   public MapCodec<LakeFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 4
      // 002: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 005: aload 1
      // 006: invokeinterface net/minecraft/world/level/WorldGenLevel.getMinY ()I 1
      // 00b: bipush 4
      // 00c: iadd
      // 00d: if_icmpgt 012
      // 010: bipush 0
      // 011: ireturn
      // 012: aload 4
      // 014: bipush -8
      // 016: bipush -4
      // 018: bipush -8
      // 01a: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 01d: astore 4
      // 01f: sipush 2048
      // 022: newarray 4
      // 024: astore 5
      // 026: aload 3
      // 027: bipush 4
      // 028: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 02d: bipush 4
      // 02e: iadd
      // 02f: istore 6
      // 031: bipush 0
      // 032: istore 7
      // 034: iload 7
      // 036: iload 6
      // 038: if_icmpge 150
      // 03b: aload 3
      // 03c: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 041: ldc2_w 6.0
      // 044: dmul
      // 045: ldc2_w 3.0
      // 048: dadd
      // 049: dstore 8
      // 04b: aload 3
      // 04c: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 051: ldc2_w 4.0
      // 054: dmul
      // 055: ldc2_w 2.0
      // 058: dadd
      // 059: dstore 10
      // 05b: aload 3
      // 05c: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 061: ldc2_w 6.0
      // 064: dmul
      // 065: ldc2_w 3.0
      // 068: dadd
      // 069: dstore 12
      // 06b: aload 3
      // 06c: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 071: ldc2_w 16.0
      // 074: dload 8
      // 076: dsub
      // 077: ldc2_w 2.0
      // 07a: dsub
      // 07b: dmul
      // 07c: dconst_1
      // 07d: dadd
      // 07e: dload 8
      // 080: ldc2_w 2.0
      // 083: ddiv
      // 084: dadd
      // 085: dstore 14
      // 087: aload 3
      // 088: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 08d: ldc2_w 8.0
      // 090: dload 10
      // 092: dsub
      // 093: ldc2_w 4.0
      // 096: dsub
      // 097: dmul
      // 098: ldc2_w 2.0
      // 09b: dadd
      // 09c: dload 10
      // 09e: ldc2_w 2.0
      // 0a1: ddiv
      // 0a2: dadd
      // 0a3: dstore 16
      // 0a5: aload 3
      // 0a6: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 0ab: ldc2_w 16.0
      // 0ae: dload 12
      // 0b0: dsub
      // 0b1: ldc2_w 2.0
      // 0b4: dsub
      // 0b5: dmul
      // 0b6: dconst_1
      // 0b7: dadd
      // 0b8: dload 12
      // 0ba: ldc2_w 2.0
      // 0bd: ddiv
      // 0be: dadd
      // 0bf: dstore 18
      // 0c1: bipush 1
      // 0c2: istore 20
      // 0c4: iload 20
      // 0c6: bipush 15
      // 0c8: if_icmpge 14a
      // 0cb: bipush 1
      // 0cc: istore 21
      // 0ce: iload 21
      // 0d0: bipush 15
      // 0d2: if_icmpge 144
      // 0d5: bipush 1
      // 0d6: istore 22
      // 0d8: iload 22
      // 0da: bipush 7
      // 0dc: if_icmpge 13e
      // 0df: iload 20
      // 0e1: i2d
      // 0e2: dload 14
      // 0e4: dsub
      // 0e5: dload 8
      // 0e7: ldc2_w 2.0
      // 0ea: ddiv
      // 0eb: ddiv
      // 0ec: dstore 23
      // 0ee: iload 22
      // 0f0: i2d
      // 0f1: dload 16
      // 0f3: dsub
      // 0f4: dload 10
      // 0f6: ldc2_w 2.0
      // 0f9: ddiv
      // 0fa: ddiv
      // 0fb: dstore 25
      // 0fd: iload 21
      // 0ff: i2d
      // 100: dload 18
      // 102: dsub
      // 103: dload 12
      // 105: ldc2_w 2.0
      // 108: ddiv
      // 109: ddiv
      // 10a: dstore 27
      // 10c: dload 23
      // 10e: dload 23
      // 110: dmul
      // 111: dload 25
      // 113: dload 25
      // 115: dmul
      // 116: dadd
      // 117: dload 27
      // 119: dload 27
      // 11b: dmul
      // 11c: dadd
      // 11d: dstore 29
      // 11f: dload 29
      // 121: dconst_1
      // 122: dcmpg
      // 123: ifge 138
      // 126: aload 5
      // 128: iload 20
      // 12a: bipush 16
      // 12c: imul
      // 12d: iload 21
      // 12f: iadd
      // 130: bipush 8
      // 132: imul
      // 133: iload 22
      // 135: iadd
      // 136: bipush 1
      // 137: bastore
      // 138: iinc 22 1
      // 13b: goto 0d8
      // 13e: iinc 21 1
      // 141: goto 0ce
      // 144: iinc 20 1
      // 147: goto 0c4
      // 14a: iinc 7 1
      // 14d: goto 034
      // 150: aload 0
      // 151: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.fluid Lnet/minecraft/core/Holder;
      // 154: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 159: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 15c: aload 1
      // 15d: aload 3
      // 15e: aload 4
      // 160: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 165: astore 7
      // 167: bipush 0
      // 168: istore 8
      // 16a: iload 8
      // 16c: bipush 16
      // 16e: if_icmpge 2ae
      // 171: bipush 0
      // 172: istore 9
      // 174: iload 9
      // 176: bipush 16
      // 178: if_icmpge 2a8
      // 17b: bipush 0
      // 17c: istore 10
      // 17e: iload 10
      // 180: bipush 8
      // 182: if_icmpge 2a2
      // 185: aload 5
      // 187: iload 8
      // 189: bipush 16
      // 18b: imul
      // 18c: iload 9
      // 18e: iadd
      // 18f: bipush 8
      // 191: imul
      // 192: iload 10
      // 194: iadd
      // 195: baload
      // 196: ifne 245
      // 199: iload 8
      // 19b: bipush 15
      // 19d: if_icmpge 1b6
      // 1a0: aload 5
      // 1a2: iload 8
      // 1a4: bipush 1
      // 1a5: iadd
      // 1a6: bipush 16
      // 1a8: imul
      // 1a9: iload 9
      // 1ab: iadd
      // 1ac: bipush 8
      // 1ae: imul
      // 1af: iload 10
      // 1b1: iadd
      // 1b2: baload
      // 1b3: ifne 241
      // 1b6: iload 8
      // 1b8: ifle 1d1
      // 1bb: aload 5
      // 1bd: iload 8
      // 1bf: bipush 1
      // 1c0: isub
      // 1c1: bipush 16
      // 1c3: imul
      // 1c4: iload 9
      // 1c6: iadd
      // 1c7: bipush 8
      // 1c9: imul
      // 1ca: iload 10
      // 1cc: iadd
      // 1cd: baload
      // 1ce: ifne 241
      // 1d1: iload 9
      // 1d3: bipush 15
      // 1d5: if_icmpge 1ee
      // 1d8: aload 5
      // 1da: iload 8
      // 1dc: bipush 16
      // 1de: imul
      // 1df: iload 9
      // 1e1: iadd
      // 1e2: bipush 1
      // 1e3: iadd
      // 1e4: bipush 8
      // 1e6: imul
      // 1e7: iload 10
      // 1e9: iadd
      // 1ea: baload
      // 1eb: ifne 241
      // 1ee: iload 9
      // 1f0: ifle 209
      // 1f3: aload 5
      // 1f5: iload 8
      // 1f7: bipush 16
      // 1f9: imul
      // 1fa: iload 9
      // 1fc: bipush 1
      // 1fd: isub
      // 1fe: iadd
      // 1ff: bipush 8
      // 201: imul
      // 202: iload 10
      // 204: iadd
      // 205: baload
      // 206: ifne 241
      // 209: iload 10
      // 20b: bipush 7
      // 20d: if_icmpge 226
      // 210: aload 5
      // 212: iload 8
      // 214: bipush 16
      // 216: imul
      // 217: iload 9
      // 219: iadd
      // 21a: bipush 8
      // 21c: imul
      // 21d: iload 10
      // 21f: iadd
      // 220: bipush 1
      // 221: iadd
      // 222: baload
      // 223: ifne 241
      // 226: iload 10
      // 228: ifle 245
      // 22b: aload 5
      // 22d: iload 8
      // 22f: bipush 16
      // 231: imul
      // 232: iload 9
      // 234: iadd
      // 235: bipush 8
      // 237: imul
      // 238: iload 10
      // 23a: bipush 1
      // 23b: isub
      // 23c: iadd
      // 23d: baload
      // 23e: ifeq 245
      // 241: bipush 1
      // 242: goto 246
      // 245: bipush 0
      // 246: istore 11
      // 248: iload 11
      // 24a: ifeq 29c
      // 24d: aload 4
      // 24f: iload 8
      // 251: iload 10
      // 253: iload 9
      // 255: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 258: astore 12
      // 25a: aload 1
      // 25b: aload 12
      // 25d: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 262: astore 13
      // 264: iload 10
      // 266: bipush 4
      // 267: if_icmplt 274
      // 26a: aload 13
      // 26c: invokevirtual net/minecraft/world/level/block/state/BlockState.liquid ()Z
      // 26f: ifeq 274
      // 272: bipush 0
      // 273: ireturn
      // 274: iload 10
      // 276: bipush 4
      // 277: if_icmpge 28b
      // 27a: aload 13
      // 27c: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 27f: ifne 28b
      // 282: aload 13
      // 284: aload 7
      // 286: if_acmpeq 28b
      // 289: bipush 0
      // 28a: ireturn
      // 28b: aload 0
      // 28c: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.canPlaceFeature Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 28f: aload 1
      // 290: aload 12
      // 292: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 297: ifne 29c
      // 29a: bipush 0
      // 29b: ireturn
      // 29c: iinc 10 1
      // 29f: goto 17e
      // 2a2: iinc 9 1
      // 2a5: goto 174
      // 2a8: iinc 8 1
      // 2ab: goto 16a
      // 2ae: bipush 0
      // 2af: istore 8
      // 2b1: iload 8
      // 2b3: bipush 16
      // 2b5: if_icmpge 350
      // 2b8: bipush 0
      // 2b9: istore 9
      // 2bb: iload 9
      // 2bd: bipush 16
      // 2bf: if_icmpge 34a
      // 2c2: bipush 0
      // 2c3: istore 10
      // 2c5: iload 10
      // 2c7: bipush 8
      // 2c9: if_icmpge 344
      // 2cc: aload 5
      // 2ce: iload 8
      // 2d0: bipush 16
      // 2d2: imul
      // 2d3: iload 9
      // 2d5: iadd
      // 2d6: bipush 8
      // 2d8: imul
      // 2d9: iload 10
      // 2db: iadd
      // 2dc: baload
      // 2dd: ifeq 33e
      // 2e0: aload 4
      // 2e2: iload 8
      // 2e4: iload 10
      // 2e6: iload 9
      // 2e8: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 2eb: astore 11
      // 2ed: aload 0
      // 2ee: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.canReplaceWithAirOrFluid Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 2f1: aload 1
      // 2f2: aload 11
      // 2f4: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 2f9: ifne 2ff
      // 2fc: goto 33e
      // 2ff: iload 10
      // 301: bipush 4
      // 302: if_icmplt 309
      // 305: bipush 1
      // 306: goto 30a
      // 309: bipush 0
      // 30a: istore 12
      // 30c: aload 1
      // 30d: aload 11
      // 30f: iload 12
      // 311: ifeq 31a
      // 314: getstatic net/minecraft/world/level/levelgen/feature/LakeFeature.AIR Lnet/minecraft/world/level/block/state/BlockState;
      // 317: goto 31c
      // 31a: aload 7
      // 31c: bipush 2
      // 31d: invokeinterface net/minecraft/world/level/WorldGenLevel.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z 4
      // 322: pop
      // 323: iload 12
      // 325: ifeq 33e
      // 328: aload 1
      // 329: aload 11
      // 32b: getstatic net/minecraft/world/level/levelgen/feature/LakeFeature.AIR Lnet/minecraft/world/level/block/state/BlockState;
      // 32e: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 331: bipush 0
      // 332: invokeinterface net/minecraft/world/level/WorldGenLevel.scheduleTick (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;I)V 4
      // 337: aload 0
      // 338: aload 1
      // 339: aload 11
      // 33b: invokevirtual net/minecraft/world/level/levelgen/feature/LakeFeature.markAboveForPostProcessing (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)V
      // 33e: iinc 10 1
      // 341: goto 2c5
      // 344: iinc 9 1
      // 347: goto 2bb
      // 34a: iinc 8 1
      // 34d: goto 2b1
      // 350: aload 0
      // 351: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.barrier Lnet/minecraft/core/Holder;
      // 354: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 359: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 35c: aload 1
      // 35d: aload 3
      // 35e: aload 4
      // 360: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 365: astore 8
      // 367: aload 8
      // 369: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 36c: ifne 4c5
      // 36f: bipush 0
      // 370: istore 9
      // 372: iload 9
      // 374: bipush 16
      // 376: if_icmpge 4c5
      // 379: bipush 0
      // 37a: istore 10
      // 37c: iload 10
      // 37e: bipush 16
      // 380: if_icmpge 4bf
      // 383: bipush 0
      // 384: istore 11
      // 386: iload 11
      // 388: bipush 8
      // 38a: if_icmpge 4b9
      // 38d: aload 5
      // 38f: iload 9
      // 391: bipush 16
      // 393: imul
      // 394: iload 10
      // 396: iadd
      // 397: bipush 8
      // 399: imul
      // 39a: iload 11
      // 39c: iadd
      // 39d: baload
      // 39e: ifne 44d
      // 3a1: iload 9
      // 3a3: bipush 15
      // 3a5: if_icmpge 3be
      // 3a8: aload 5
      // 3aa: iload 9
      // 3ac: bipush 1
      // 3ad: iadd
      // 3ae: bipush 16
      // 3b0: imul
      // 3b1: iload 10
      // 3b3: iadd
      // 3b4: bipush 8
      // 3b6: imul
      // 3b7: iload 11
      // 3b9: iadd
      // 3ba: baload
      // 3bb: ifne 449
      // 3be: iload 9
      // 3c0: ifle 3d9
      // 3c3: aload 5
      // 3c5: iload 9
      // 3c7: bipush 1
      // 3c8: isub
      // 3c9: bipush 16
      // 3cb: imul
      // 3cc: iload 10
      // 3ce: iadd
      // 3cf: bipush 8
      // 3d1: imul
      // 3d2: iload 11
      // 3d4: iadd
      // 3d5: baload
      // 3d6: ifne 449
      // 3d9: iload 10
      // 3db: bipush 15
      // 3dd: if_icmpge 3f6
      // 3e0: aload 5
      // 3e2: iload 9
      // 3e4: bipush 16
      // 3e6: imul
      // 3e7: iload 10
      // 3e9: iadd
      // 3ea: bipush 1
      // 3eb: iadd
      // 3ec: bipush 8
      // 3ee: imul
      // 3ef: iload 11
      // 3f1: iadd
      // 3f2: baload
      // 3f3: ifne 449
      // 3f6: iload 10
      // 3f8: ifle 411
      // 3fb: aload 5
      // 3fd: iload 9
      // 3ff: bipush 16
      // 401: imul
      // 402: iload 10
      // 404: bipush 1
      // 405: isub
      // 406: iadd
      // 407: bipush 8
      // 409: imul
      // 40a: iload 11
      // 40c: iadd
      // 40d: baload
      // 40e: ifne 449
      // 411: iload 11
      // 413: bipush 7
      // 415: if_icmpge 42e
      // 418: aload 5
      // 41a: iload 9
      // 41c: bipush 16
      // 41e: imul
      // 41f: iload 10
      // 421: iadd
      // 422: bipush 8
      // 424: imul
      // 425: iload 11
      // 427: iadd
      // 428: bipush 1
      // 429: iadd
      // 42a: baload
      // 42b: ifne 449
      // 42e: iload 11
      // 430: ifle 44d
      // 433: aload 5
      // 435: iload 9
      // 437: bipush 16
      // 439: imul
      // 43a: iload 10
      // 43c: iadd
      // 43d: bipush 8
      // 43f: imul
      // 440: iload 11
      // 442: bipush 1
      // 443: isub
      // 444: iadd
      // 445: baload
      // 446: ifeq 44d
      // 449: bipush 1
      // 44a: goto 44e
      // 44d: bipush 0
      // 44e: istore 12
      // 450: iload 12
      // 452: ifeq 4b3
      // 455: iload 11
      // 457: bipush 4
      // 458: if_icmplt 465
      // 45b: aload 3
      // 45c: bipush 2
      // 45d: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 462: ifeq 4b3
      // 465: aload 4
      // 467: iload 9
      // 469: iload 11
      // 46b: iload 10
      // 46d: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 470: astore 13
      // 472: aload 1
      // 473: aload 13
      // 475: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 47a: astore 14
      // 47c: aload 14
      // 47e: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 481: ifeq 4b3
      // 484: aload 0
      // 485: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.canReplaceWithBarrier Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 488: aload 1
      // 489: aload 13
      // 48b: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 490: ifeq 4b3
      // 493: aload 4
      // 495: iload 9
      // 497: iload 11
      // 499: iload 10
      // 49b: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 49e: astore 15
      // 4a0: aload 1
      // 4a1: aload 15
      // 4a3: aload 8
      // 4a5: bipush 2
      // 4a6: invokeinterface net/minecraft/world/level/WorldGenLevel.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z 4
      // 4ab: pop
      // 4ac: aload 0
      // 4ad: aload 1
      // 4ae: aload 15
      // 4b0: invokevirtual net/minecraft/world/level/levelgen/feature/LakeFeature.markAboveForPostProcessing (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)V
      // 4b3: iinc 11 1
      // 4b6: goto 386
      // 4b9: iinc 10 1
      // 4bc: goto 37c
      // 4bf: iinc 9 1
      // 4c2: goto 372
      // 4c5: aload 7
      // 4c7: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 4ca: getstatic net/minecraft/tags/FluidTags.WATER Lnet/minecraft/tags/TagKey;
      // 4cd: invokevirtual net/minecraft/world/level/material/FluidState.is (Lnet/minecraft/tags/TagKey;)Z
      // 4d0: ifeq 53b
      // 4d3: bipush 0
      // 4d4: istore 9
      // 4d6: iload 9
      // 4d8: bipush 16
      // 4da: if_icmpge 53b
      // 4dd: bipush 0
      // 4de: istore 10
      // 4e0: iload 10
      // 4e2: bipush 16
      // 4e4: if_icmpge 535
      // 4e7: bipush 4
      // 4e8: istore 11
      // 4ea: aload 4
      // 4ec: iload 9
      // 4ee: bipush 4
      // 4ef: iload 10
      // 4f1: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 4f4: astore 12
      // 4f6: aload 1
      // 4f7: aload 12
      // 4f9: invokeinterface net/minecraft/world/level/WorldGenLevel.getBiome (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder; 2
      // 4fe: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 503: checkcast net/minecraft/world/level/biome/Biome
      // 506: aload 1
      // 507: aload 12
      // 509: bipush 0
      // 50a: invokevirtual net/minecraft/world/level/biome/Biome.shouldFreeze (Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Z)Z
      // 50d: ifeq 52f
      // 510: aload 0
      // 511: getfield net/minecraft/world/level/levelgen/feature/LakeFeature.canReplaceWithAirOrFluid Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 514: aload 1
      // 515: aload 12
      // 517: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 51c: ifeq 52f
      // 51f: aload 1
      // 520: aload 12
      // 522: getstatic net/minecraft/world/level/block/Blocks.ICE Lnet/minecraft/world/level/block/Block;
      // 525: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 528: bipush 2
      // 529: invokeinterface net/minecraft/world/level/WorldGenLevel.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z 4
      // 52e: pop
      // 52f: iinc 10 1
      // 532: goto 4e0
      // 535: iinc 9 1
      // 538: goto 4d6
      // 53b: bipush 1
      // 53c: ireturn
   }
}
