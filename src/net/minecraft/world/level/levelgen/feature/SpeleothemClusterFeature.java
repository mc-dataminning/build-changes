package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ClampedNormalFloat;
import net.minecraft.util.valueproviders.FloatProvider;
import net.minecraft.util.valueproviders.FloatProviders;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;

public record SpeleothemClusterFeature(
   BlockState baseBlock,
   BlockState pointedBlock,
   HolderSet<Block> replaceableBlocks,
   int floorToCeilingSearchRange,
   IntProvider height,
   IntProvider radius,
   int maxStalagmiteStalactiteHeightDiff,
   int heightDeviation,
   IntProvider speleothemBlockLayerThickness,
   FloatProvider density,
   FloatProvider wetness,
   float chanceOfSpeleothemAtMaxDistanceFromCenter,
   int maxDistanceFromEdgeAffectingChanceOfSpeleothem,
   int maxDistanceFromCenterAffectingHeightBias
) implements Feature {
   public static final MapCodec<SpeleothemClusterFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
               BlockState.CODEC.fieldOf("base_block").forGetter(SpeleothemClusterFeature::baseBlock),
               BlockState.CODEC.fieldOf("pointed_block").forGetter(SpeleothemClusterFeature::pointedBlock),
               RegistryCodecs.holderSet(Registries.BLOCK).fieldOf("replaceable_blocks").forGetter(SpeleothemClusterFeature::replaceableBlocks),
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").forGetter(SpeleothemClusterFeature::floorToCeilingSearchRange),
               IntProviders.codec(1, 128).fieldOf("height").forGetter(SpeleothemClusterFeature::height),
               IntProviders.codec(1, 128).fieldOf("radius").forGetter(SpeleothemClusterFeature::radius),
               Codec.intRange(0, 64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter(SpeleothemClusterFeature::maxStalagmiteStalactiteHeightDiff),
               Codec.intRange(1, 64).fieldOf("height_deviation").forGetter(SpeleothemClusterFeature::heightDeviation),
               IntProviders.codec(0, 128).fieldOf("speleothem_block_layer_thickness").forGetter(SpeleothemClusterFeature::speleothemBlockLayerThickness),
               FloatProviders.codec(0.0F, 2.0F).fieldOf("density").forGetter(SpeleothemClusterFeature::density),
               FloatProviders.codec(0.0F, 2.0F).fieldOf("wetness").forGetter(SpeleothemClusterFeature::wetness),
               Codec.floatRange(0.0F, 1.0F)
                  .fieldOf("chance_of_speleothem_at_max_distance_from_center")
                  .forGetter(SpeleothemClusterFeature::chanceOfSpeleothemAtMaxDistanceFromCenter),
               Codec.intRange(1, 64)
                  .fieldOf("max_distance_from_edge_affecting_chance_of_speleothem")
                  .forGetter(SpeleothemClusterFeature::maxDistanceFromEdgeAffectingChanceOfSpeleothem),
               Codec.intRange(1, 64)
                  .fieldOf("max_distance_from_center_affecting_height_bias")
                  .forGetter(SpeleothemClusterFeature::maxDistanceFromCenterAffectingHeightBias)
            )
            .apply(i, SpeleothemClusterFeature::new)
   );

   @Override
   public MapCodec<SpeleothemClusterFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      if (!SpeleothemUtils.isEmptyOrWater(level, origin)) {
         return false;
      } else {
         int height = this.height.sample(random);
         float wetness = this.wetness.sample(random);
         float density = this.density.sample(random);
         int xRadius = this.radius.sample(random);
         int zRadius = this.radius.sample(random);

         for (int dx = -xRadius; dx <= xRadius; dx++) {
            for (int dz = -zRadius; dz <= zRadius; dz++) {
               double chanceOfStalagmiteOrStalactite = this.getChanceOfStalagmiteOrStalactite(xRadius, zRadius, dx, dz);
               BlockPos pos = origin.offset(dx, 0, dz);
               this.placeColumn(level, random, pos, dx, dz, wetness, chanceOfStalagmiteOrStalactite, height, density);
            }
         }

         return true;
      }
   }

   private void placeColumn(
      final WorldGenLevel level,
      final RandomSource random,
      final BlockPos pos,
      final int dx,
      final int dz,
      final float chanceOfWater,
      final double chanceOfStalagmiteOrStalactite,
      final int clusterHeight,
      final float density
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 3
      // 002: aload 0
      // 003: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.floorToCeilingSearchRange I
      // 006: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/levelgen/feature/SpeleothemUtils.isEmptyOrWater (Lnet/minecraft/world/level/block/state/BlockState;)Z, (Lnet/minecraft/world/level/block/state/BlockState;)Z ]
      // 00b: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/levelgen/feature/SpeleothemUtils.isNeitherEmptyNorWater (Lnet/minecraft/world/level/block/state/BlockState;)Z, (Lnet/minecraft/world/level/block/state/BlockState;)Z ]
      // 010: invokestatic net/minecraft/world/level/levelgen/Column.scan (Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;ILjava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/Optional;
      // 013: astore 11
      // 015: aload 11
      // 017: invokevirtual java/util/Optional.isEmpty ()Z
      // 01a: ifeq 01e
      // 01d: return
      // 01e: aload 11
      // 020: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 023: checkcast net/minecraft/world/level/levelgen/Column
      // 026: invokevirtual net/minecraft/world/level/levelgen/Column.getCeiling ()Ljava/util/OptionalInt;
      // 029: astore 12
      // 02b: aload 11
      // 02d: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 030: checkcast net/minecraft/world/level/levelgen/Column
      // 033: invokevirtual net/minecraft/world/level/levelgen/Column.getFloor ()Ljava/util/OptionalInt;
      // 036: astore 13
      // 038: aload 12
      // 03a: invokevirtual java/util/OptionalInt.isEmpty ()Z
      // 03d: ifeq 049
      // 040: aload 13
      // 042: invokevirtual java/util/OptionalInt.isEmpty ()Z
      // 045: ifeq 049
      // 048: return
      // 049: aload 2
      // 04a: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 04f: fload 6
      // 051: fcmpg
      // 052: ifge 059
      // 055: bipush 1
      // 056: goto 05a
      // 059: bipush 0
      // 05a: istore 14
      // 05c: iload 14
      // 05e: ifeq 0ac
      // 061: aload 13
      // 063: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 066: ifeq 0ac
      // 069: aload 0
      // 06a: aload 1
      // 06b: aload 3
      // 06c: aload 13
      // 06e: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 071: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 074: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.canPlacePool (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z
      // 077: ifeq 0ac
      // 07a: aload 13
      // 07c: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 07f: istore 16
      // 081: aload 11
      // 083: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 086: checkcast net/minecraft/world/level/levelgen/Column
      // 089: iload 16
      // 08b: bipush 1
      // 08c: isub
      // 08d: invokestatic java/util/OptionalInt.of (I)Ljava/util/OptionalInt;
      // 090: invokevirtual net/minecraft/world/level/levelgen/Column.withFloor (Ljava/util/OptionalInt;)Lnet/minecraft/world/level/levelgen/Column;
      // 093: astore 15
      // 095: aload 1
      // 096: aload 3
      // 097: iload 16
      // 099: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 09c: getstatic net/minecraft/world/level/block/Blocks.WATER Lnet/minecraft/world/level/block/Block;
      // 09f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 0a2: bipush 2
      // 0a3: invokeinterface net/minecraft/world/level/WorldGenLevel.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z 4
      // 0a8: pop
      // 0a9: goto 0b6
      // 0ac: aload 11
      // 0ae: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 0b1: checkcast net/minecraft/world/level/levelgen/Column
      // 0b4: astore 15
      // 0b6: aload 15
      // 0b8: invokevirtual net/minecraft/world/level/levelgen/Column.getFloor ()Ljava/util/OptionalInt;
      // 0bb: astore 16
      // 0bd: aload 2
      // 0be: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 0c3: dload 7
      // 0c5: dcmpg
      // 0c6: ifge 0cd
      // 0c9: bipush 1
      // 0ca: goto 0ce
      // 0cd: bipush 0
      // 0ce: istore 18
      // 0d0: aload 12
      // 0d2: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 0d5: ifeq 140
      // 0d8: iload 18
      // 0da: ifeq 140
      // 0dd: aload 0
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: aload 12
      // 0e2: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 0e5: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 0e8: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.isLava (Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z
      // 0eb: ifne 140
      // 0ee: aload 0
      // 0ef: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.speleothemBlockLayerThickness Lnet/minecraft/util/valueproviders/IntProvider;
      // 0f2: aload 2
      // 0f3: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 0f8: istore 19
      // 0fa: aload 0
      // 0fb: aload 1
      // 0fc: aload 3
      // 0fd: aload 12
      // 0ff: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 102: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 105: iload 19
      // 107: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 10a: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.replaceBlocksWithBaseBlocks (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/Direction;)V
      // 10d: aload 16
      // 10f: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 112: ifeq 12a
      // 115: iload 9
      // 117: aload 12
      // 119: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 11c: aload 16
      // 11e: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 121: isub
      // 122: invokestatic java/lang/Math.min (II)I
      // 125: istore 20
      // 127: goto 12e
      // 12a: iload 9
      // 12c: istore 20
      // 12e: aload 0
      // 12f: aload 2
      // 130: iload 4
      // 132: iload 5
      // 134: fload 10
      // 136: iload 20
      // 138: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.getSpeleothemHeight (Lnet/minecraft/util/RandomSource;IIFI)I
      // 13b: istore 17
      // 13d: goto 143
      // 140: bipush 0
      // 141: istore 17
      // 143: aload 2
      // 144: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 149: dload 7
      // 14b: dcmpg
      // 14c: ifge 153
      // 14f: bipush 1
      // 150: goto 154
      // 153: bipush 0
      // 154: istore 20
      // 156: aload 16
      // 158: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 15b: ifeq 1c6
      // 15e: iload 20
      // 160: ifeq 1c6
      // 163: aload 0
      // 164: aload 1
      // 165: aload 3
      // 166: aload 16
      // 168: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 16b: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 16e: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.isLava (Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z
      // 171: ifne 1c6
      // 174: aload 0
      // 175: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.speleothemBlockLayerThickness Lnet/minecraft/util/valueproviders/IntProvider;
      // 178: aload 2
      // 179: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 17e: istore 21
      // 180: aload 0
      // 181: aload 1
      // 182: aload 3
      // 183: aload 16
      // 185: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 188: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 18b: iload 21
      // 18d: getstatic net/minecraft/core/Direction.DOWN Lnet/minecraft/core/Direction;
      // 190: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.replaceBlocksWithBaseBlocks (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/Direction;)V
      // 193: aload 12
      // 195: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 198: ifeq 1b4
      // 19b: bipush 0
      // 19c: iload 17
      // 19e: aload 2
      // 19f: aload 0
      // 1a0: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.maxStalagmiteStalactiteHeightDiff I
      // 1a3: ineg
      // 1a4: aload 0
      // 1a5: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.maxStalagmiteStalactiteHeightDiff I
      // 1a8: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 1ab: iadd
      // 1ac: invokestatic java/lang/Math.max (II)I
      // 1af: istore 19
      // 1b1: goto 1c3
      // 1b4: aload 0
      // 1b5: aload 2
      // 1b6: iload 4
      // 1b8: iload 5
      // 1ba: fload 10
      // 1bc: iload 9
      // 1be: invokevirtual net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.getSpeleothemHeight (Lnet/minecraft/util/RandomSource;IIFI)I
      // 1c1: istore 19
      // 1c3: goto 1c9
      // 1c6: bipush 0
      // 1c7: istore 19
      // 1c9: aload 12
      // 1cb: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 1ce: ifeq 239
      // 1d1: aload 16
      // 1d3: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 1d6: ifeq 239
      // 1d9: aload 12
      // 1db: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 1de: iload 17
      // 1e0: isub
      // 1e1: aload 16
      // 1e3: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 1e6: iload 19
      // 1e8: iadd
      // 1e9: if_icmpgt 239
      // 1ec: aload 16
      // 1ee: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 1f1: istore 23
      // 1f3: aload 12
      // 1f5: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 1f8: istore 24
      // 1fa: iload 24
      // 1fc: iload 17
      // 1fe: isub
      // 1ff: iload 23
      // 201: bipush 1
      // 202: iadd
      // 203: invokestatic java/lang/Math.max (II)I
      // 206: istore 25
      // 208: iload 23
      // 20a: iload 19
      // 20c: iadd
      // 20d: iload 24
      // 20f: bipush 1
      // 210: isub
      // 211: invokestatic java/lang/Math.min (II)I
      // 214: istore 26
      // 216: aload 2
      // 217: iload 25
      // 219: iload 26
      // 21b: bipush 1
      // 21c: iadd
      // 21d: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 220: istore 27
      // 222: iload 27
      // 224: bipush 1
      // 225: isub
      // 226: istore 28
      // 228: iload 24
      // 22a: iload 27
      // 22c: isub
      // 22d: istore 21
      // 22f: iload 28
      // 231: iload 23
      // 233: isub
      // 234: istore 22
      // 236: goto 241
      // 239: iload 17
      // 23b: istore 21
      // 23d: iload 19
      // 23f: istore 22
      // 241: aload 2
      // 242: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
      // 247: ifeq 273
      // 24a: iload 21
      // 24c: ifle 273
      // 24f: iload 22
      // 251: ifle 273
      // 254: aload 15
      // 256: invokevirtual net/minecraft/world/level/levelgen/Column.getHeight ()Ljava/util/OptionalInt;
      // 259: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 25c: ifeq 273
      // 25f: iload 21
      // 261: iload 22
      // 263: iadd
      // 264: aload 15
      // 266: invokevirtual net/minecraft/world/level/levelgen/Column.getHeight ()Ljava/util/OptionalInt;
      // 269: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 26c: if_icmpne 273
      // 26f: bipush 1
      // 270: goto 274
      // 273: bipush 0
      // 274: istore 23
      // 276: aload 12
      // 278: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 27b: ifeq 2a6
      // 27e: aload 1
      // 27f: aload 3
      // 280: aload 12
      // 282: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 285: bipush 1
      // 286: isub
      // 287: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 28a: getstatic net/minecraft/core/Direction.DOWN Lnet/minecraft/core/Direction;
      // 28d: iload 21
      // 28f: iload 23
      // 291: aload 0
      // 292: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.baseBlock Lnet/minecraft/world/level/block/state/BlockState;
      // 295: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 298: aload 0
      // 299: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.pointedBlock Lnet/minecraft/world/level/block/state/BlockState;
      // 29c: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 29f: aload 0
      // 2a0: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.replaceableBlocks Lnet/minecraft/core/HolderSet;
      // 2a3: invokestatic net/minecraft/world/level/levelgen/feature/SpeleothemUtils.growSpeleothem (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;IZLnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)V
      // 2a6: aload 16
      // 2a8: invokevirtual java/util/OptionalInt.isPresent ()Z
      // 2ab: ifeq 2d6
      // 2ae: aload 1
      // 2af: aload 3
      // 2b0: aload 16
      // 2b2: invokevirtual java/util/OptionalInt.getAsInt ()I
      // 2b5: bipush 1
      // 2b6: iadd
      // 2b7: invokevirtual net/minecraft/core/BlockPos.atY (I)Lnet/minecraft/core/BlockPos;
      // 2ba: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 2bd: iload 22
      // 2bf: iload 23
      // 2c1: aload 0
      // 2c2: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.baseBlock Lnet/minecraft/world/level/block/state/BlockState;
      // 2c5: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 2c8: aload 0
      // 2c9: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.pointedBlock Lnet/minecraft/world/level/block/state/BlockState;
      // 2cc: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 2cf: aload 0
      // 2d0: getfield net/minecraft/world/level/levelgen/feature/SpeleothemClusterFeature.replaceableBlocks Lnet/minecraft/core/HolderSet;
      // 2d3: invokestatic net/minecraft/world/level/levelgen/feature/SpeleothemUtils.growSpeleothem (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;IZLnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)V
      // 2d6: return
   }

   private boolean isLava(final LevelReader level, final BlockPos pos) {
      return level.getBlockState(pos).is(Blocks.LAVA);
   }

   private int getSpeleothemHeight(final RandomSource random, final int dx, final int dz, final float density, final int maxHeight) {
      if (random.nextFloat() > density) {
         return 0;
      } else {
         int distanceFromCenter = Math.abs(dx) + Math.abs(dz);
         float heightMean = (float)Mth.clampedMap(
            (double)distanceFromCenter, 0.0, (double)this.maxDistanceFromCenterAffectingHeightBias, (double)maxHeight / 2.0, 0.0
         );
         return (int)randomBetweenBiased(random, 0.0F, (float)maxHeight, heightMean, (float)this.heightDeviation);
      }
   }

   private boolean canPlacePool(final WorldGenLevel level, final BlockPos pos) {
      BlockState state = level.getBlockState(pos);
      if (!state.is(Blocks.WATER) && !state.is(this.baseBlock.getBlock()) && !state.is(this.pointedBlock.getBlock())) {
         if (level.getBlockState(pos.above()).getFluidState().is(FluidTags.WATER)) {
            return false;
         } else {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
               if (!this.canBeAdjacentToWater(level, pos.relative(direction))) {
                  return false;
               }
            }

            return this.canBeAdjacentToWater(level, pos.below());
         }
      } else {
         return false;
      }
   }

   private boolean canBeAdjacentToWater(final LevelAccessor level, final BlockPos pos) {
      BlockState state = level.getBlockState(pos);
      return state.is(BlockTags.BASE_STONE_OVERWORLD) || state.getFluidState().is(FluidTags.WATER);
   }

   private void replaceBlocksWithBaseBlocks(final WorldGenLevel level, final BlockPos firstPos, final int maxCount, final Direction direction) {
      BlockPos.MutableBlockPos pos = firstPos.mutable();

      for (int i = 0; i < maxCount; i++) {
         if (!SpeleothemUtils.placeBaseBlockIfPossible(level, pos, this.baseBlock.getBlock(), this.replaceableBlocks)) {
            return;
         }

         pos.move(direction);
      }
   }

   private double getChanceOfStalagmiteOrStalactite(final int xRadius, final int zRadius, final int dx, final int dz) {
      int xDistanceFromEdge = xRadius - Math.abs(dx);
      int zDistanceFromEdge = zRadius - Math.abs(dz);
      int distanceFromEdge = Math.min(xDistanceFromEdge, zDistanceFromEdge);
      return (double)Mth.clampedMap(
         (float)distanceFromEdge, 0.0F, (float)this.maxDistanceFromEdgeAffectingChanceOfSpeleothem, this.chanceOfSpeleothemAtMaxDistanceFromCenter, 1.0F
      );
   }

   private static float randomBetweenBiased(final RandomSource random, final float min, final float maxExclusive, final float mean, final float deviation) {
      return ClampedNormalFloat.sample(random, mean, deviation, min, maxExclusive);
   }
}
