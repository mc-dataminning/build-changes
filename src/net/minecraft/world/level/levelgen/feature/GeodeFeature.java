package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

public record GeodeFeature(
   GeodeBlockSettings blockSettings,
   GeodeLayerSettings layerSettings,
   GeodeCrackSettings crackSettings,
   double usePotentialPlacementsChance,
   double useAlternateLayer0Chance,
   boolean placementsRequireLayer0Alternate,
   IntProvider outerWallDistance,
   IntProvider distributionPoints,
   IntProvider pointOffset,
   int minGenOffset,
   int maxGenOffset,
   double noiseMultiplier,
   int invalidBlocksThreshold
) implements Feature {
   private static final NormalNoise NOISE_PARAMETERS = NormalNoise.createParity(-4, 1.0);
   public static final Codec<Double> CHANCE_RANGE = Codec.doubleRange(0.0, 1.0);
   public static final MapCodec<GeodeFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            GeodeBlockSettings.CODEC.fieldOf("blocks").forGetter(GeodeFeature::blockSettings),
            GeodeLayerSettings.CODEC.fieldOf("layers").forGetter(GeodeFeature::layerSettings),
            GeodeCrackSettings.CODEC.fieldOf("crack").forGetter(GeodeFeature::crackSettings),
            CHANCE_RANGE.optionalFieldOf("use_potential_placements_chance", 0.35).forGetter(GeodeFeature::usePotentialPlacementsChance),
            CHANCE_RANGE.optionalFieldOf("use_alternate_layer0_chance", 0.0).forGetter(GeodeFeature::useAlternateLayer0Chance),
            Codec.BOOL.optionalFieldOf("placements_require_layer0_alternate", true).forGetter(GeodeFeature::placementsRequireLayer0Alternate),
            IntProviders.codec(1, 20).optionalFieldOf("outer_wall_distance", UniformInt.of(4, 5)).forGetter(GeodeFeature::outerWallDistance),
            IntProviders.codec(1, 20).optionalFieldOf("distribution_points", UniformInt.of(3, 4)).forGetter(GeodeFeature::distributionPoints),
            IntProviders.codec(0, 10).optionalFieldOf("point_offset", UniformInt.of(1, 2)).forGetter(GeodeFeature::pointOffset),
            Codec.INT.optionalFieldOf("min_gen_offset", -16).forGetter(GeodeFeature::minGenOffset),
            Codec.INT.optionalFieldOf("max_gen_offset", 16).forGetter(GeodeFeature::maxGenOffset),
            CHANCE_RANGE.optionalFieldOf("noise_multiplier", 0.05).forGetter(GeodeFeature::noiseMultiplier),
            Codec.INT.fieldOf("invalid_blocks_threshold").forGetter(GeodeFeature::invalidBlocksThreshold)
         )
         .apply(i, GeodeFeature::new)
   );
   private static final Direction[] DIRECTIONS = Direction.values();

   @Override
   public MapCodec<GeodeFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.entryList(SFormsFastMapDirect.java:345)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mapsEqual(SFormsConstructor.java:469)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.hasUpdated(SFormsConstructor.java:495)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:131)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:45)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:67)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 5
      // 009: aload 0
      // 00a: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.distributionPoints Lnet/minecraft/util/valueproviders/IntProvider;
      // 00d: aload 3
      // 00e: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 013: istore 6
      // 015: getstatic net/minecraft/world/level/levelgen/feature/GeodeFeature.NOISE_PARAMETERS Lnet/minecraft/world/level/levelgen/synth/NormalNoise;
      // 018: new net/minecraft/world/level/levelgen/WorldgenRandom
      // 01b: dup
      // 01c: new net/minecraft/world/level/levelgen/LegacyRandomSource
      // 01f: dup
      // 020: aload 1
      // 021: invokeinterface net/minecraft/world/level/WorldGenLevel.getSeed ()J 1
      // 026: invokespecial net/minecraft/world/level/levelgen/LegacyRandomSource.<init> (J)V
      // 029: invokespecial net/minecraft/world/level/levelgen/WorldgenRandom.<init> (Lnet/minecraft/util/RandomSource;)V
      // 02c: invokevirtual net/minecraft/world/level/levelgen/synth/NormalNoise.create (Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/levelgen/synth/Noise;
      // 02f: astore 7
      // 031: new java/util/ArrayList
      // 034: dup
      // 035: invokespecial java/util/ArrayList.<init> ()V
      // 038: astore 8
      // 03a: iload 6
      // 03c: i2d
      // 03d: aload 0
      // 03e: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.outerWallDistance Lnet/minecraft/util/valueproviders/IntProvider;
      // 041: invokeinterface net/minecraft/util/valueproviders/IntProvider.maxInclusive ()I 1
      // 046: i2d
      // 047: ddiv
      // 048: dstore 9
      // 04a: dconst_1
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.layerSettings Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;
      // 04f: getfield net/minecraft/world/level/levelgen/GeodeLayerSettings.filling D
      // 052: invokestatic java/lang/Math.sqrt (D)D
      // 055: ddiv
      // 056: dstore 11
      // 058: dconst_1
      // 059: aload 0
      // 05a: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.layerSettings Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;
      // 05d: getfield net/minecraft/world/level/levelgen/GeodeLayerSettings.innerLayer D
      // 060: dload 9
      // 062: dadd
      // 063: invokestatic java/lang/Math.sqrt (D)D
      // 066: ddiv
      // 067: dstore 13
      // 069: dconst_1
      // 06a: aload 0
      // 06b: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.layerSettings Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;
      // 06e: getfield net/minecraft/world/level/levelgen/GeodeLayerSettings.middleLayer D
      // 071: dload 9
      // 073: dadd
      // 074: invokestatic java/lang/Math.sqrt (D)D
      // 077: ddiv
      // 078: dstore 15
      // 07a: dconst_1
      // 07b: aload 0
      // 07c: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.layerSettings Lnet/minecraft/world/level/levelgen/GeodeLayerSettings;
      // 07f: getfield net/minecraft/world/level/levelgen/GeodeLayerSettings.outerLayer D
      // 082: dload 9
      // 084: dadd
      // 085: invokestatic java/lang/Math.sqrt (D)D
      // 088: ddiv
      // 089: dstore 17
      // 08b: dconst_1
      // 08c: aload 0
      // 08d: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.crackSettings Lnet/minecraft/world/level/levelgen/GeodeCrackSettings;
      // 090: getfield net/minecraft/world/level/levelgen/GeodeCrackSettings.baseCrackSize D
      // 093: aload 3
      // 094: invokeinterface net/minecraft/util/RandomSource.nextDouble ()D 1
      // 099: ldc2_w 2.0
      // 09c: ddiv
      // 09d: dadd
      // 09e: iload 6
      // 0a0: bipush 3
      // 0a1: if_icmple 0a9
      // 0a4: dload 9
      // 0a6: goto 0aa
      // 0a9: dconst_0
      // 0aa: dadd
      // 0ab: invokestatic java/lang/Math.sqrt (D)D
      // 0ae: ddiv
      // 0af: dstore 19
      // 0b1: aload 3
      // 0b2: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 0b7: f2d
      // 0b8: aload 0
      // 0b9: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.crackSettings Lnet/minecraft/world/level/levelgen/GeodeCrackSettings;
      // 0bc: getfield net/minecraft/world/level/levelgen/GeodeCrackSettings.generateCrackChance D
      // 0bf: dcmpg
      // 0c0: ifge 0c7
      // 0c3: bipush 1
      // 0c4: goto 0c8
      // 0c7: bipush 0
      // 0c8: istore 21
      // 0ca: bipush 0
      // 0cb: istore 22
      // 0cd: bipush 0
      // 0ce: istore 23
      // 0d0: iload 23
      // 0d2: iload 6
      // 0d4: if_icmpge 157
      // 0d7: aload 0
      // 0d8: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.outerWallDistance Lnet/minecraft/util/valueproviders/IntProvider;
      // 0db: aload 3
      // 0dc: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 0e1: istore 24
      // 0e3: aload 0
      // 0e4: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.outerWallDistance Lnet/minecraft/util/valueproviders/IntProvider;
      // 0e7: aload 3
      // 0e8: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 0ed: istore 25
      // 0ef: aload 0
      // 0f0: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.outerWallDistance Lnet/minecraft/util/valueproviders/IntProvider;
      // 0f3: aload 3
      // 0f4: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 0f9: istore 26
      // 0fb: aload 4
      // 0fd: iload 24
      // 0ff: iload 25
      // 101: iload 26
      // 103: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 106: astore 27
      // 108: aload 1
      // 109: aload 27
      // 10b: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 110: astore 28
      // 112: aload 28
      // 114: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 117: ifne 129
      // 11a: aload 28
      // 11c: aload 0
      // 11d: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 120: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.invalidBlocks ()Lnet/minecraft/core/HolderSet;
      // 123: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Lnet/minecraft/core/HolderSet;)Z
      // 126: ifeq 137
      // 129: iinc 22 1
      // 12c: iload 22
      // 12e: aload 0
      // 12f: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.invalidBlocksThreshold I
      // 132: if_icmple 137
      // 135: bipush 0
      // 136: ireturn
      // 137: aload 5
      // 139: aload 27
      // 13b: aload 0
      // 13c: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.pointOffset Lnet/minecraft/util/valueproviders/IntProvider;
      // 13f: aload 3
      // 140: invokeinterface net/minecraft/util/valueproviders/IntProvider.sample (Lnet/minecraft/util/RandomSource;)I 2
      // 145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 148: invokestatic com/mojang/datafixers/util/Pair.of (Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/datafixers/util/Pair;
      // 14b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 150: pop
      // 151: iinc 23 1
      // 154: goto 0d0
      // 157: iload 21
      // 159: ifeq 257
      // 15c: aload 3
      // 15d: bipush 4
      // 15e: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
      // 163: istore 23
      // 165: iload 6
      // 167: bipush 2
      // 168: imul
      // 169: bipush 1
      // 16a: iadd
      // 16b: istore 24
      // 16d: iload 23
      // 16f: ifne 1a9
      // 172: aload 8
      // 174: aload 4
      // 176: iload 24
      // 178: bipush 7
      // 17a: bipush 0
      // 17b: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 17e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 183: pop
      // 184: aload 8
      // 186: aload 4
      // 188: iload 24
      // 18a: bipush 5
      // 18b: bipush 0
      // 18c: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 18f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 194: pop
      // 195: aload 8
      // 197: aload 4
      // 199: iload 24
      // 19b: bipush 1
      // 19c: bipush 0
      // 19d: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1a0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a5: pop
      // 1a6: goto 257
      // 1a9: iload 23
      // 1ab: bipush 1
      // 1ac: if_icmpne 1e6
      // 1af: aload 8
      // 1b1: aload 4
      // 1b3: bipush 0
      // 1b4: bipush 7
      // 1b6: iload 24
      // 1b8: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1bb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1c0: pop
      // 1c1: aload 8
      // 1c3: aload 4
      // 1c5: bipush 0
      // 1c6: bipush 5
      // 1c7: iload 24
      // 1c9: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1cc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d1: pop
      // 1d2: aload 8
      // 1d4: aload 4
      // 1d6: bipush 0
      // 1d7: bipush 1
      // 1d8: iload 24
      // 1da: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1dd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1e2: pop
      // 1e3: goto 257
      // 1e6: iload 23
      // 1e8: bipush 2
      // 1e9: if_icmpne 226
      // 1ec: aload 8
      // 1ee: aload 4
      // 1f0: iload 24
      // 1f2: bipush 7
      // 1f4: iload 24
      // 1f6: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1f9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1fe: pop
      // 1ff: aload 8
      // 201: aload 4
      // 203: iload 24
      // 205: bipush 5
      // 206: iload 24
      // 208: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 20b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 210: pop
      // 211: aload 8
      // 213: aload 4
      // 215: iload 24
      // 217: bipush 1
      // 218: iload 24
      // 21a: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 21d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 222: pop
      // 223: goto 257
      // 226: aload 8
      // 228: aload 4
      // 22a: bipush 0
      // 22b: bipush 7
      // 22d: bipush 0
      // 22e: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 231: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 236: pop
      // 237: aload 8
      // 239: aload 4
      // 23b: bipush 0
      // 23c: bipush 5
      // 23d: bipush 0
      // 23e: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 241: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 246: pop
      // 247: aload 8
      // 249: aload 4
      // 24b: bipush 0
      // 24c: bipush 1
      // 24d: bipush 0
      // 24e: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 251: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 256: pop
      // 257: new java/util/ArrayList
      // 25a: dup
      // 25b: invokespecial java/util/ArrayList.<init> ()V
      // 25e: astore 23
      // 260: aload 0
      // 261: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 264: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.cannotReplace ()Lnet/minecraft/core/HolderSet;
      // 267: astore 24
      // 269: aload 24
      // 26b: invokedynamic test (Lnet/minecraft/core/HolderSet;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, net/minecraft/world/level/levelgen/feature/GeodeFeature.lambda$place$0 (Lnet/minecraft/core/HolderSet;Lnet/minecraft/world/level/block/state/BlockState;)Z, (Lnet/minecraft/world/level/block/state/BlockState;)Z ]
      // 270: astore 25
      // 272: aload 4
      // 274: aload 0
      // 275: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.minGenOffset I
      // 278: aload 0
      // 279: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.minGenOffset I
      // 27c: aload 0
      // 27d: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.minGenOffset I
      // 280: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 283: aload 4
      // 285: aload 0
      // 286: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.maxGenOffset I
      // 289: aload 0
      // 28a: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.maxGenOffset I
      // 28d: aload 0
      // 28e: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.maxGenOffset I
      // 291: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 294: invokestatic net/minecraft/core/BlockPos.betweenClosed (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Iterable;
      // 297: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 29c: astore 26
      // 29e: aload 26
      // 2a0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a5: ifeq 4ea
      // 2a8: aload 26
      // 2aa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2af: checkcast net/minecraft/core/BlockPos
      // 2b2: astore 27
      // 2b4: aload 7
      // 2b6: aload 27
      // 2b8: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 2bb: i2d
      // 2bc: aload 27
      // 2be: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 2c1: i2d
      // 2c2: aload 27
      // 2c4: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 2c7: i2d
      // 2c8: invokeinterface net/minecraft/world/level/levelgen/synth/Noise.get (DDD)F 7
      // 2cd: f2d
      // 2ce: aload 0
      // 2cf: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.noiseMultiplier D
      // 2d2: dmul
      // 2d3: dstore 28
      // 2d5: dconst_0
      // 2d6: dstore 30
      // 2d8: aload 5
      // 2da: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2df: astore 32
      // 2e1: aload 32
      // 2e3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2e8: ifeq 31f
      // 2eb: aload 32
      // 2ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f2: checkcast com/mojang/datafixers/util/Pair
      // 2f5: astore 33
      // 2f7: dload 30
      // 2f9: aload 27
      // 2fb: aload 33
      // 2fd: invokevirtual com/mojang/datafixers/util/Pair.getFirst ()Ljava/lang/Object;
      // 300: checkcast net/minecraft/core/Vec3i
      // 303: invokevirtual net/minecraft/core/BlockPos.distSqr (Lnet/minecraft/core/Vec3i;)D
      // 306: aload 33
      // 308: invokevirtual com/mojang/datafixers/util/Pair.getSecond ()Ljava/lang/Object;
      // 30b: checkcast java/lang/Integer
      // 30e: invokevirtual java/lang/Integer.intValue ()I
      // 311: i2d
      // 312: dadd
      // 313: invokestatic net/minecraft/util/Mth.invSqrt (D)D
      // 316: dload 28
      // 318: dadd
      // 319: dadd
      // 31a: dstore 30
      // 31c: goto 2e1
      // 31f: dload 30
      // 321: dload 17
      // 323: dcmpg
      // 324: ifge 32a
      // 327: goto 29e
      // 32a: dload 30
      // 32c: dload 11
      // 32e: dcmpl
      // 32f: iflt 356
      // 332: aload 0
      // 333: aload 1
      // 334: aload 27
      // 336: aload 0
      // 337: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 33a: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.fillingProvider ()Lnet/minecraft/core/Holder;
      // 33d: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 342: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 345: aload 1
      // 346: aload 3
      // 347: aload 27
      // 349: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 34e: aload 25
      // 350: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 353: goto 29e
      // 356: dconst_0
      // 357: dstore 32
      // 359: aload 8
      // 35b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 360: astore 34
      // 362: aload 34
      // 364: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 369: ifeq 396
      // 36c: aload 34
      // 36e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 373: checkcast net/minecraft/core/BlockPos
      // 376: astore 35
      // 378: dload 32
      // 37a: aload 27
      // 37c: aload 35
      // 37e: invokevirtual net/minecraft/core/BlockPos.distSqr (Lnet/minecraft/core/Vec3i;)D
      // 381: aload 0
      // 382: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.crackSettings Lnet/minecraft/world/level/levelgen/GeodeCrackSettings;
      // 385: getfield net/minecraft/world/level/levelgen/GeodeCrackSettings.crackPointOffset I
      // 388: i2d
      // 389: dadd
      // 38a: invokestatic net/minecraft/util/Mth.invSqrt (D)D
      // 38d: dload 28
      // 38f: dadd
      // 390: dadd
      // 391: dstore 32
      // 393: goto 362
      // 396: iload 21
      // 398: ifeq 3ff
      // 39b: dload 32
      // 39d: dload 19
      // 39f: dcmpl
      // 3a0: iflt 3ff
      // 3a3: aload 0
      // 3a4: aload 1
      // 3a5: aload 27
      // 3a7: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 3aa: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 3ad: aload 25
      // 3af: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 3b2: getstatic net/minecraft/world/level/levelgen/feature/GeodeFeature.DIRECTIONS [Lnet/minecraft/core/Direction;
      // 3b5: astore 34
      // 3b7: aload 34
      // 3b9: arraylength
      // 3ba: istore 35
      // 3bc: bipush 0
      // 3bd: istore 36
      // 3bf: iload 36
      // 3c1: iload 35
      // 3c3: if_icmpge 3fc
      // 3c6: aload 34
      // 3c8: iload 36
      // 3ca: aaload
      // 3cb: astore 37
      // 3cd: aload 27
      // 3cf: aload 37
      // 3d1: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 3d4: astore 38
      // 3d6: aload 1
      // 3d7: aload 38
      // 3d9: invokeinterface net/minecraft/world/level/WorldGenLevel.getFluidState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState; 2
      // 3de: astore 39
      // 3e0: aload 39
      // 3e2: invokevirtual net/minecraft/world/level/material/FluidState.isEmpty ()Z
      // 3e5: ifne 3f6
      // 3e8: aload 1
      // 3e9: aload 38
      // 3eb: aload 39
      // 3ed: invokevirtual net/minecraft/world/level/material/FluidState.getType ()Lnet/minecraft/world/level/material/Fluid;
      // 3f0: bipush 0
      // 3f1: invokeinterface net/minecraft/world/level/WorldGenLevel.scheduleTick (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;I)V 4
      // 3f6: iinc 36 1
      // 3f9: goto 3bf
      // 3fc: goto 4e7
      // 3ff: dload 30
      // 401: dload 13
      // 403: dcmpl
      // 404: iflt 492
      // 407: aload 3
      // 408: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 40d: f2d
      // 40e: aload 0
      // 40f: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.useAlternateLayer0Chance D
      // 412: dcmpg
      // 413: ifge 41a
      // 416: bipush 1
      // 417: goto 41b
      // 41a: bipush 0
      // 41b: istore 34
      // 41d: iload 34
      // 41f: ifeq 446
      // 422: aload 0
      // 423: aload 1
      // 424: aload 27
      // 426: aload 0
      // 427: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 42a: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.alternateInnerLayerProvider ()Lnet/minecraft/core/Holder;
      // 42d: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 432: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 435: aload 1
      // 436: aload 3
      // 437: aload 27
      // 439: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 43e: aload 25
      // 440: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 443: goto 467
      // 446: aload 0
      // 447: aload 1
      // 448: aload 27
      // 44a: aload 0
      // 44b: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 44e: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.innerLayerProvider ()Lnet/minecraft/core/Holder;
      // 451: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 456: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 459: aload 1
      // 45a: aload 3
      // 45b: aload 27
      // 45d: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 462: aload 25
      // 464: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 467: aload 0
      // 468: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.placementsRequireLayer0Alternate Z
      // 46b: ifeq 473
      // 46e: iload 34
      // 470: ifeq 48f
      // 473: aload 3
      // 474: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 479: f2d
      // 47a: aload 0
      // 47b: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.usePotentialPlacementsChance D
      // 47e: dcmpg
      // 47f: ifge 48f
      // 482: aload 23
      // 484: aload 27
      // 486: invokevirtual net/minecraft/core/BlockPos.immutable ()Lnet/minecraft/core/BlockPos;
      // 489: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 48e: pop
      // 48f: goto 4e7
      // 492: dload 30
      // 494: dload 15
      // 496: dcmpl
      // 497: iflt 4be
      // 49a: aload 0
      // 49b: aload 1
      // 49c: aload 27
      // 49e: aload 0
      // 49f: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 4a2: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.middleLayerProvider ()Lnet/minecraft/core/Holder;
      // 4a5: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 4aa: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 4ad: aload 1
      // 4ae: aload 3
      // 4af: aload 27
      // 4b1: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 4b6: aload 25
      // 4b8: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 4bb: goto 4e7
      // 4be: dload 30
      // 4c0: dload 17
      // 4c2: dcmpl
      // 4c3: iflt 4e7
      // 4c6: aload 0
      // 4c7: aload 1
      // 4c8: aload 27
      // 4ca: aload 0
      // 4cb: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 4ce: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.outerLayerProvider ()Lnet/minecraft/core/Holder;
      // 4d1: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // 4d6: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // 4d9: aload 1
      // 4da: aload 3
      // 4db: aload 27
      // 4dd: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // 4e2: aload 25
      // 4e4: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 4e7: goto 29e
      // 4ea: aload 0
      // 4eb: getfield net/minecraft/world/level/levelgen/feature/GeodeFeature.blockSettings Lnet/minecraft/world/level/levelgen/GeodeBlockSettings;
      // 4ee: invokevirtual net/minecraft/world/level/levelgen/GeodeBlockSettings.innerPlacements ()Ljava/util/List;
      // 4f1: astore 26
      // 4f3: aload 23
      // 4f5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4fa: astore 27
      // 4fc: aload 27
      // 4fe: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 503: ifeq 591
      // 506: aload 27
      // 508: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 50d: checkcast net/minecraft/core/BlockPos
      // 510: astore 28
      // 512: aload 26
      // 514: aload 3
      // 515: invokestatic net/minecraft/util/Util.getRandom (Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;
      // 518: checkcast net/minecraft/world/level/block/state/BlockState
      // 51b: astore 29
      // 51d: getstatic net/minecraft/world/level/levelgen/feature/GeodeFeature.DIRECTIONS [Lnet/minecraft/core/Direction;
      // 520: astore 30
      // 522: aload 30
      // 524: arraylength
      // 525: istore 31
      // 527: bipush 0
      // 528: istore 32
      // 52a: iload 32
      // 52c: iload 31
      // 52e: if_icmpge 58e
      // 531: aload 30
      // 533: iload 32
      // 535: aaload
      // 536: astore 33
      // 538: aload 29
      // 53a: getstatic net/minecraft/world/level/block/state/properties/BlockStateProperties.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 53d: aload 33
      // 53f: invokevirtual net/minecraft/world/level/block/state/BlockState.trySetValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 542: checkcast net/minecraft/world/level/block/state/BlockState
      // 545: astore 29
      // 547: aload 28
      // 549: aload 33
      // 54b: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 54e: astore 34
      // 550: aload 1
      // 551: aload 34
      // 553: invokeinterface net/minecraft/world/level/WorldGenLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 2
      // 558: astore 35
      // 55a: aload 29
      // 55c: getstatic net/minecraft/world/level/block/state/properties/BlockStateProperties.WATERLOGGED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 55f: aload 35
      // 561: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 564: invokevirtual net/minecraft/world/level/material/FluidState.isSource ()Z
      // 567: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 56a: invokevirtual net/minecraft/world/level/block/state/BlockState.trySetValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 56d: checkcast net/minecraft/world/level/block/state/BlockState
      // 570: astore 29
      // 572: aload 35
      // 574: invokestatic net/minecraft/world/level/block/BuddingAmethystBlock.canClusterGrowAtState (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 577: ifeq 588
      // 57a: aload 0
      // 57b: aload 1
      // 57c: aload 34
      // 57e: aload 29
      // 580: aload 25
      // 582: invokevirtual net/minecraft/world/level/levelgen/feature/GeodeFeature.safeSetBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V
      // 585: goto 58e
      // 588: iinc 32 1
      // 58b: goto 52a
      // 58e: goto 4fc
      // 591: bipush 1
      // 592: ireturn
   }
}
