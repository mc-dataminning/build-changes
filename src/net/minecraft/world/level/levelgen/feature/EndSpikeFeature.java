package net.minecraft.world.level.levelgen.feature;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.phys.AABB;

public record EndSpikeFeature(List<EndSpikeFeature.EndSpike> spikes, boolean crystalInvulnerable, Optional<BlockPos> crystalBeamTarget) implements Feature {
   private static final int NUMBER_OF_SPIKES = 10;
   private static final int SPIKE_DISTANCE = 42;
   private static final LoadingCache<Long, List<EndSpikeFeature.EndSpike>> SPIKE_CACHE = CacheBuilder.newBuilder()
      .expireAfterWrite(5L, TimeUnit.MINUTES)
      .build(new EndSpikeFeature.SpikeCacheLoader());
   public static final MapCodec<EndSpikeFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
               EndSpikeFeature.EndSpike.CODEC.listOf().fieldOf("spikes").forGetter(EndSpikeFeature::spikes),
               Codec.BOOL.optionalFieldOf("crystal_invulnerable", false).forGetter(EndSpikeFeature::crystalInvulnerable),
               BlockPos.CODEC.optionalFieldOf("crystal_beam_target").forGetter(EndSpikeFeature::crystalBeamTarget)
            )
            .apply(i, EndSpikeFeature::new)
   );

   public static List<EndSpikeFeature.EndSpike> getSpikesForLevel(final WorldGenLevel level) {
      RandomSource random = RandomSource.createThreadLocalInstance(level.getSeed());
      long key = random.nextLong() & 65535L;
      return (List<EndSpikeFeature.EndSpike>)SPIKE_CACHE.getUnchecked(key);
   }

   @Override
   public MapCodec<EndSpikeFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      List<EndSpikeFeature.EndSpike> spikes = this.spikes;
      if (spikes.isEmpty()) {
         spikes = getSpikesForLevel(level);
      }

      for (EndSpikeFeature.EndSpike spike : spikes) {
         if (spike.isCenterWithinChunk(origin)) {
            this.placeSpike(level, random, spike);
         }
      }

      return true;
   }

   private void placeSpike(final ServerLevelAccessor level, final RandomSource random, final EndSpikeFeature.EndSpike spike) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.ArrayDeque.<init>(ArrayDeque.java:179)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.getUsedVersions(StackVarsProcessor.java:796)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateExprent(StackVarsProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateStatements(StackVarsProcessor.java:189)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:224)
      //
      // Bytecode:
      // 000: aload 3
      // 001: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getRadius ()I
      // 004: istore 4
      // 006: new net/minecraft/core/BlockPos
      // 009: dup
      // 00a: aload 3
      // 00b: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterX ()I
      // 00e: iload 4
      // 010: isub
      // 011: aload 1
      // 012: invokeinterface net/minecraft/world/level/ServerLevelAccessor.getMinY ()I 1
      // 017: aload 3
      // 018: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterZ ()I
      // 01b: iload 4
      // 01d: isub
      // 01e: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 021: new net/minecraft/core/BlockPos
      // 024: dup
      // 025: aload 3
      // 026: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterX ()I
      // 029: iload 4
      // 02b: iadd
      // 02c: aload 3
      // 02d: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getHeight ()I
      // 030: bipush 10
      // 032: iadd
      // 033: aload 3
      // 034: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterZ ()I
      // 037: iload 4
      // 039: iadd
      // 03a: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 03d: invokestatic net/minecraft/core/BlockPos.betweenClosed (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Iterable;
      // 040: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 045: astore 5
      // 047: aload 5
      // 049: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04e: ifeq 0b4
      // 051: aload 5
      // 053: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 058: checkcast net/minecraft/core/BlockPos
      // 05b: astore 6
      // 05d: aload 6
      // 05f: aload 3
      // 060: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterX ()I
      // 063: i2d
      // 064: aload 6
      // 066: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 069: i2d
      // 06a: aload 3
      // 06b: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterZ ()I
      // 06e: i2d
      // 06f: invokevirtual net/minecraft/core/BlockPos.distToLowCornerSqr (DDD)D
      // 072: iload 4
      // 074: iload 4
      // 076: imul
      // 077: bipush 1
      // 078: iadd
      // 079: i2d
      // 07a: dcmpg
      // 07b: ifgt 09a
      // 07e: aload 6
      // 080: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 083: aload 3
      // 084: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getHeight ()I
      // 087: if_icmpge 09a
      // 08a: aload 0
      // 08b: aload 1
      // 08c: aload 6
      // 08e: getstatic net/minecraft/world/level/block/Blocks.OBSIDIAN Lnet/minecraft/world/level/block/Block;
      // 091: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 094: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 097: goto 0b1
      // 09a: aload 6
      // 09c: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 09f: bipush 65
      // 0a1: if_icmple 0b1
      // 0a4: aload 0
      // 0a5: aload 1
      // 0a6: aload 6
      // 0a8: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 0ab: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 0ae: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 0b1: goto 047
      // 0b4: aload 3
      // 0b5: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.isGuarded ()Z
      // 0b8: ifeq 206
      // 0bb: bipush -2
      // 0bd: istore 5
      // 0bf: bipush 2
      // 0c0: istore 6
      // 0c2: bipush 3
      // 0c3: istore 7
      // 0c5: new net/minecraft/core/BlockPos$MutableBlockPos
      // 0c8: dup
      // 0c9: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> ()V
      // 0cc: astore 8
      // 0ce: bipush -2
      // 0d0: istore 9
      // 0d2: iload 9
      // 0d4: bipush 2
      // 0d5: if_icmpgt 206
      // 0d8: bipush -2
      // 0da: istore 10
      // 0dc: iload 10
      // 0de: bipush 2
      // 0df: if_icmpgt 200
      // 0e2: bipush 0
      // 0e3: istore 11
      // 0e5: iload 11
      // 0e7: bipush 3
      // 0e8: if_icmpgt 1fa
      // 0eb: iload 9
      // 0ed: invokestatic net/minecraft/util/Mth.abs (I)I
      // 0f0: bipush 2
      // 0f1: if_icmpne 0f8
      // 0f4: bipush 1
      // 0f5: goto 0f9
      // 0f8: bipush 0
      // 0f9: istore 12
      // 0fb: iload 10
      // 0fd: invokestatic net/minecraft/util/Mth.abs (I)I
      // 100: bipush 2
      // 101: if_icmpne 108
      // 104: bipush 1
      // 105: goto 109
      // 108: bipush 0
      // 109: istore 13
      // 10b: iload 11
      // 10d: bipush 3
      // 10e: if_icmpne 115
      // 111: bipush 1
      // 112: goto 116
      // 115: bipush 0
      // 116: istore 14
      // 118: iload 12
      // 11a: ifne 127
      // 11d: iload 13
      // 11f: ifne 127
      // 122: iload 14
      // 124: ifeq 1f4
      // 127: iload 9
      // 129: bipush -2
      // 12b: if_icmpeq 139
      // 12e: iload 9
      // 130: bipush 2
      // 131: if_icmpeq 139
      // 134: iload 14
      // 136: ifeq 13d
      // 139: bipush 1
      // 13a: goto 13e
      // 13d: bipush 0
      // 13e: istore 15
      // 140: iload 10
      // 142: bipush -2
      // 144: if_icmpeq 152
      // 147: iload 10
      // 149: bipush 2
      // 14a: if_icmpeq 152
      // 14d: iload 14
      // 14f: ifeq 156
      // 152: bipush 1
      // 153: goto 157
      // 156: bipush 0
      // 157: istore 16
      // 159: getstatic net/minecraft/world/level/block/Blocks.IRON_BARS Lnet/minecraft/world/level/block/Block;
      // 15c: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 15f: getstatic net/minecraft/world/level/block/IronBarsBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 162: iload 15
      // 164: ifeq 172
      // 167: iload 10
      // 169: bipush -2
      // 16b: if_icmpeq 172
      // 16e: bipush 1
      // 16f: goto 173
      // 172: bipush 0
      // 173: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 176: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 179: checkcast net/minecraft/world/level/block/state/BlockState
      // 17c: getstatic net/minecraft/world/level/block/IronBarsBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 17f: iload 15
      // 181: ifeq 18e
      // 184: iload 10
      // 186: bipush 2
      // 187: if_icmpeq 18e
      // 18a: bipush 1
      // 18b: goto 18f
      // 18e: bipush 0
      // 18f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 192: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 195: checkcast net/minecraft/world/level/block/state/BlockState
      // 198: getstatic net/minecraft/world/level/block/IronBarsBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 19b: iload 16
      // 19d: ifeq 1ab
      // 1a0: iload 9
      // 1a2: bipush -2
      // 1a4: if_icmpeq 1ab
      // 1a7: bipush 1
      // 1a8: goto 1ac
      // 1ab: bipush 0
      // 1ac: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1af: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 1b2: checkcast net/minecraft/world/level/block/state/BlockState
      // 1b5: getstatic net/minecraft/world/level/block/IronBarsBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 1b8: iload 16
      // 1ba: ifeq 1c7
      // 1bd: iload 9
      // 1bf: bipush 2
      // 1c0: if_icmpeq 1c7
      // 1c3: bipush 1
      // 1c4: goto 1c8
      // 1c7: bipush 0
      // 1c8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1cb: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 1ce: checkcast net/minecraft/world/level/block/state/BlockState
      // 1d1: astore 17
      // 1d3: aload 0
      // 1d4: aload 1
      // 1d5: aload 8
      // 1d7: aload 3
      // 1d8: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterX ()I
      // 1db: iload 9
      // 1dd: iadd
      // 1de: aload 3
      // 1df: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getHeight ()I
      // 1e2: iload 11
      // 1e4: iadd
      // 1e5: aload 3
      // 1e6: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterZ ()I
      // 1e9: iload 10
      // 1eb: iadd
      // 1ec: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.set (III)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 1ef: aload 17
      // 1f1: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 1f4: iinc 11 1
      // 1f7: goto 0e5
      // 1fa: iinc 10 1
      // 1fd: goto 0dc
      // 200: iinc 9 1
      // 203: goto 0d2
      // 206: getstatic net/minecraft/world/entity/EntityTypes.END_CRYSTAL Lnet/minecraft/world/entity/EntityType;
      // 209: aload 1
      // 20a: invokeinterface net/minecraft/world/level/ServerLevelAccessor.getLevel ()Lnet/minecraft/server/level/ServerLevel; 1
      // 20f: getstatic net/minecraft/world/entity/EntitySpawnReason.STRUCTURE Lnet/minecraft/world/entity/EntitySpawnReason;
      // 212: invokevirtual net/minecraft/world/entity/EntityType.create (Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/world/entity/Entity;
      // 215: checkcast net/minecraft/world/entity/boss/enderdragon/EndCrystal
      // 218: astore 5
      // 21a: aload 5
      // 21c: ifnull 28d
      // 21f: aload 5
      // 221: aload 0
      // 222: getfield net/minecraft/world/level/levelgen/feature/EndSpikeFeature.crystalBeamTarget Ljava/util/Optional;
      // 225: aconst_null
      // 226: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 229: checkcast net/minecraft/core/BlockPos
      // 22c: invokevirtual net/minecraft/world/entity/boss/enderdragon/EndCrystal.setBeamTarget (Lnet/minecraft/core/BlockPos;)V
      // 22f: aload 5
      // 231: aload 0
      // 232: getfield net/minecraft/world/level/levelgen/feature/EndSpikeFeature.crystalInvulnerable Z
      // 235: invokevirtual net/minecraft/world/entity/boss/enderdragon/EndCrystal.setPermanentlyInvulnerable (Z)V
      // 238: aload 5
      // 23a: aload 3
      // 23b: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterX ()I
      // 23e: i2d
      // 23f: ldc2_w 0.5
      // 242: dadd
      // 243: aload 3
      // 244: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getHeight ()I
      // 247: bipush 1
      // 248: iadd
      // 249: i2d
      // 24a: aload 3
      // 24b: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.getCenterZ ()I
      // 24e: i2d
      // 24f: ldc2_w 0.5
      // 252: dadd
      // 253: aload 2
      // 254: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 259: ldc 360.0
      // 25b: fmul
      // 25c: fconst_0
      // 25d: invokevirtual net/minecraft/world/entity/boss/enderdragon/EndCrystal.snapTo (DDDFF)V
      // 260: aload 1
      // 261: aload 5
      // 263: invokeinterface net/minecraft/world/level/ServerLevelAccessor.addFreshEntity (Lnet/minecraft/world/entity/Entity;)Z 2
      // 268: pop
      // 269: aload 5
      // 26b: invokevirtual net/minecraft/world/entity/boss/enderdragon/EndCrystal.blockPosition ()Lnet/minecraft/core/BlockPos;
      // 26e: astore 6
      // 270: aload 0
      // 271: aload 1
      // 272: aload 6
      // 274: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 277: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 27a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 27d: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 280: aload 0
      // 281: aload 1
      // 282: aload 6
      // 284: aload 1
      // 285: aload 6
      // 287: invokestatic net/minecraft/world/level/block/FireBlock.getState (Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 28a: invokevirtual net/minecraft/world/level/levelgen/feature/EndSpikeFeature.setBlock (Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // 28d: return
   }

   public static class EndSpike {
      public static final Codec<EndSpikeFeature.EndSpike> CODEC = RecordCodecBuilder.create(
         i -> i.group(
                  Codec.INT.optionalFieldOf("centerX", 0).forGetter(s -> s.centerX),
                  Codec.INT.optionalFieldOf("centerZ", 0).forGetter(s -> s.centerZ),
                  Codec.INT.optionalFieldOf("radius", 0).forGetter(s -> s.radius),
                  Codec.INT.optionalFieldOf("height", 0).forGetter(s -> s.height),
                  Codec.BOOL.optionalFieldOf("guarded", false).forGetter(s -> s.guarded)
               )
               .apply(i, EndSpikeFeature.EndSpike::new)
      );
      private final int centerX;
      private final int centerZ;
      private final int radius;
      private final int height;
      private final boolean guarded;
      private final AABB topBoundingBox;

      public EndSpike(final int centerX, final int centerZ, final int radius, final int height, final boolean guarded) {
         this.centerX = centerX;
         this.centerZ = centerZ;
         this.radius = radius;
         this.height = height;
         this.guarded = guarded;
         this.topBoundingBox = new AABB(
            (double)(centerX - radius),
            (double)DimensionType.MIN_Y,
            (double)(centerZ - radius),
            (double)(centerX + radius),
            (double)DimensionType.MAX_Y,
            (double)(centerZ + radius)
         );
      }

      public boolean isCenterWithinChunk(final BlockPos chunkOrigin) {
         return SectionPos.blockToSectionCoord(chunkOrigin.getX()) == SectionPos.blockToSectionCoord(this.centerX)
            && SectionPos.blockToSectionCoord(chunkOrigin.getZ()) == SectionPos.blockToSectionCoord(this.centerZ);
      }

      public int getCenterX() {
         return this.centerX;
      }

      public int getCenterZ() {
         return this.centerZ;
      }

      public int getRadius() {
         return this.radius;
      }

      public int getHeight() {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 0: aload 0
         // 1: getfield net/minecraft/world/level/levelgen/feature/EndSpikeFeature$EndSpike.height I
         // 4: ireturn
      }

      public boolean isGuarded() {
         return this.guarded;
      }

      public AABB getTopBoundingBox() {
         return this.topBoundingBox;
      }
   }

   private static class SpikeCacheLoader extends CacheLoader<Long, List<EndSpikeFeature.EndSpike>> {
      public List<EndSpikeFeature.EndSpike> load(final Long seed) {
         IntArrayList sizes = Util.toShuffledList(IntStream.range(0, 10), RandomSource.createThreadLocalInstance(seed));
         List<EndSpikeFeature.EndSpike> result = Lists.newArrayList();

         for (int i = 0; i < 10; i++) {
            int x = Mth.floor(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)i)));
            int z = Mth.floor(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)i)));
            int size = sizes.get(i);
            int radius = 2 + size / 3;
            int height = 76 + size * 3;
            boolean guarded = size == 1 || size == 2;
            result.add(new EndSpikeFeature.EndSpike(x, z, radius, height, guarded));
         }

         return result;
      }
   }
}
