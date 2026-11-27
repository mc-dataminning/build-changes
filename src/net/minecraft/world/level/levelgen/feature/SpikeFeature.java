package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;

public record SpikeFeature(BlockState state, BlockPredicate canPlaceOn, BlockPredicate canReplace) implements Feature {
   public static final MapCodec<SpikeFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            BlockState.CODEC.fieldOf("state").forGetter(SpikeFeature::state),
            BlockPredicate.CODEC.fieldOf("can_place_on").forGetter(SpikeFeature::canPlaceOn),
            BlockPredicate.CODEC.fieldOf("can_replace").forGetter(SpikeFeature::canReplace)
         )
         .apply(i, SpikeFeature::new)
   );

   @Override
   public MapCodec<SpikeFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 4
      // 003: invokeinterface net/minecraft/world/level/WorldGenLevel.isEmptyBlock (Lnet/minecraft/core/BlockPos;)Z 2
      // 008: ifeq 025
      // 00b: aload 4
      // 00d: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 010: aload 1
      // 011: invokeinterface net/minecraft/world/level/WorldGenLevel.getMinY ()I 1
      // 016: bipush 2
      // 017: iadd
      // 018: if_icmple 025
      // 01b: aload 4
      // 01d: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 020: astore 4
      // 022: goto 000
      // 025: aload 0
      // 026: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.canPlaceOn Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 029: aload 1
      // 02a: aload 4
      // 02c: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 031: ifne 036
      // 034: bipush 0
      // 035: ireturn
      // 036: aload 4
      // 038: aload 3
      // 039: bipush 4
      // 03a: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 03f: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
      // 042: astore 4
      // 044: aload 3
      // 045: bipush 4
      // 046: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 04b: bipush 7
      // 04d: iadd
      // 04e: istore 5
      // 050: iload 5
      // 052: bipush 4
      // 053: idiv
      // 054: aload 3
      // 055: bipush 2
      // 056: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 05b: iadd
      // 05c: istore 6
      // 05e: iload 6
      // 060: bipush 1
      // 061: if_icmple 081
      // 064: aload 3
      // 065: bipush 60
      // 067: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 06c: ifne 081
      // 06f: aload 4
      // 071: bipush 10
      // 073: aload 3
      // 074: bipush 30
      // 076: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 07b: iadd
      // 07c: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
      // 07f: astore 4
      // 081: bipush 0
      // 082: istore 7
      // 084: iload 7
      // 086: iload 5
      // 088: if_icmpge 1ad
      // 08b: fconst_1
      // 08c: iload 7
      // 08e: i2f
      // 08f: iload 5
      // 091: i2f
      // 092: fdiv
      // 093: fsub
      // 094: iload 6
      // 096: i2f
      // 097: fmul
      // 098: fstore 8
      // 09a: fload 8
      // 09c: invokestatic net/minecraft/util/Mth.ceil (F)I
      // 09f: istore 9
      // 0a1: iload 9
      // 0a3: ineg
      // 0a4: istore 10
      // 0a6: iload 10
      // 0a8: iload 9
      // 0aa: if_icmpgt 1a7
      // 0ad: iload 10
      // 0af: invokestatic net/minecraft/util/Mth.abs (I)I
      // 0b2: i2f
      // 0b3: ldc 0.25
      // 0b5: fsub
      // 0b6: fstore 11
      // 0b8: iload 9
      // 0ba: ineg
      // 0bb: istore 12
      // 0bd: iload 12
      // 0bf: iload 9
      // 0c1: if_icmpgt 1a1
      // 0c4: iload 12
      // 0c6: invokestatic net/minecraft/util/Mth.abs (I)I
      // 0c9: i2f
      // 0ca: ldc 0.25
      // 0cc: fsub
      // 0cd: fstore 13
      // 0cf: iload 10
      // 0d1: ifne 0d9
      // 0d4: iload 12
      // 0d6: ifeq 0f0
      // 0d9: fload 11
      // 0db: fload 11
      // 0dd: fmul
      // 0de: fload 13
      // 0e0: fload 13
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: fload 8
      // 0e6: fload 8
      // 0e8: fmul
      // 0e9: fcmpl
      // 0ea: ifle 0f0
      // 0ed: goto 19b
      // 0f0: iload 10
      // 0f2: iload 9
      // 0f4: ineg
      // 0f5: if_icmpeq 10e
      // 0f8: iload 10
      // 0fa: iload 9
      // 0fc: if_icmpeq 10e
      // 0ff: iload 12
      // 101: iload 9
      // 103: ineg
      // 104: if_icmpeq 10e
      // 107: iload 12
      // 109: iload 9
      // 10b: if_icmpne 11d
      // 10e: aload 3
      // 10f: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 114: ldc 0.75
      // 116: fcmpl
      // 117: ifle 11d
      // 11a: goto 19b
      // 11d: aload 4
      // 11f: iload 10
      // 121: iload 7
      // 123: iload 12
      // 125: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 128: astore 14
      // 12a: aload 1
      // 12b: aload 14
      // 12d: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 132: astore 15
      // 134: aload 15
      // 136: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 139: ifne 14b
      // 13c: aload 0
      // 13d: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.canReplace Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 140: aload 1
      // 141: aload 14
      // 143: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 148: ifeq 156
      // 14b: aload 0
      // 14c: aload 1
      // 14d: aload 14
      // 14f: aload 0
      // 150: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.state Lnet/minecraft/world/level/block/state/BlockState;
      // 153: invokevirtual net/minecraft/world/level/levelgen/feature/SpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 156: iload 7
      // 158: ifeq 19b
      // 15b: iload 9
      // 15d: bipush 1
      // 15e: if_icmple 19b
      // 161: aload 4
      // 163: iload 10
      // 165: iload 7
      // 167: ineg
      // 168: iload 12
      // 16a: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 16d: astore 16
      // 16f: aload 1
      // 170: aload 16
      // 172: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 177: astore 15
      // 179: aload 15
      // 17b: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 17e: ifne 190
      // 181: aload 0
      // 182: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.canReplace Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 185: aload 1
      // 186: aload 16
      // 188: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 18d: ifeq 19b
      // 190: aload 0
      // 191: aload 1
      // 192: aload 16
      // 194: aload 0
      // 195: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.state Lnet/minecraft/world/level/block/state/BlockState;
      // 198: invokevirtual net/minecraft/world/level/levelgen/feature/SpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 19b: iinc 12 1
      // 19e: goto 0bd
      // 1a1: iinc 10 1
      // 1a4: goto 0a6
      // 1a7: iinc 7 1
      // 1aa: goto 084
      // 1ad: iload 6
      // 1af: bipush 1
      // 1b0: isub
      // 1b1: istore 7
      // 1b3: iload 7
      // 1b5: ifge 1be
      // 1b8: bipush 0
      // 1b9: istore 7
      // 1bb: goto 1c7
      // 1be: iload 7
      // 1c0: bipush 1
      // 1c1: if_icmple 1c7
      // 1c4: bipush 1
      // 1c5: istore 7
      // 1c7: iload 7
      // 1c9: ineg
      // 1ca: istore 8
      // 1cc: iload 8
      // 1ce: iload 7
      // 1d0: if_icmpgt 280
      // 1d3: iload 7
      // 1d5: ineg
      // 1d6: istore 9
      // 1d8: iload 9
      // 1da: iload 7
      // 1dc: if_icmpgt 27a
      // 1df: aload 4
      // 1e1: iload 8
      // 1e3: bipush -1
      // 1e4: iload 9
      // 1e6: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1e9: astore 10
      // 1eb: bipush 50
      // 1ed: istore 11
      // 1ef: iload 8
      // 1f1: invokestatic java/lang/Math.abs (I)I
      // 1f4: bipush 1
      // 1f5: if_icmpne 20a
      // 1f8: iload 9
      // 1fa: invokestatic java/lang/Math.abs (I)I
      // 1fd: bipush 1
      // 1fe: if_icmpne 20a
      // 201: aload 3
      // 202: bipush 5
      // 203: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 208: istore 11
      // 20a: aload 10
      // 20c: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 20f: bipush 50
      // 211: if_icmple 274
      // 214: aload 1
      // 215: aload 10
      // 217: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 21c: astore 12
      // 21e: aload 12
      // 220: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 223: ifne 23e
      // 226: aload 0
      // 227: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.canReplace Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;
      // 22a: aload 1
      // 22b: aload 10
      // 22d: invokeinterface net/minecraft/world/level/levelgen/blockpredicates/BlockPredicate.test (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 232: ifne 23e
      // 235: aload 12
      // 237: aload 0
      // 238: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.state Lnet/minecraft/world/level/block/state/BlockState;
      // 23b: if_acmpne 274
      // 23e: aload 0
      // 23f: aload 1
      // 240: aload 10
      // 242: aload 0
      // 243: getfield net/minecraft/world/level/levelgen/feature/SpikeFeature.state Lnet/minecraft/world/level/block/state/BlockState;
      // 246: invokevirtual net/minecraft/world/level/levelgen/feature/SpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 249: aload 10
      // 24b: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 24e: astore 10
      // 250: iinc 11 -1
      // 253: iload 11
      // 255: ifgt 271
      // 258: aload 10
      // 25a: aload 3
      // 25b: bipush 5
      // 25c: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 261: bipush 1
      // 262: iadd
      // 263: invokevirtual net/minecraft/core/BlockPos.below (I)Lnet/minecraft/core/BlockPos;
      // 266: astore 10
      // 268: aload 3
      // 269: bipush 5
      // 26a: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 26f: istore 11
      // 271: goto 20a
      // 274: iinc 9 1
      // 277: goto 1d8
      // 27a: iinc 8 1
      // 27d: goto 1cc
      // 280: bipush 1
      // 281: ireturn
   }
}
