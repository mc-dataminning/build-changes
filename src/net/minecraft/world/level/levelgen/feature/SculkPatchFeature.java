package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SculkBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;

public record SculkPatchFeature(int chargeCount, int amountPerCharge, int spreadAttempts, int growthRounds, int spreadRounds) implements Feature {
   public static final MapCodec<SculkPatchFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            Codec.intRange(1, 32).fieldOf("charge_count").forGetter(SculkPatchFeature::chargeCount),
            Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(SculkPatchFeature::amountPerCharge),
            Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(SculkPatchFeature::spreadAttempts),
            Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(SculkPatchFeature::growthRounds),
            Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(SculkPatchFeature::spreadRounds)
         )
         .apply(i, SculkPatchFeature::new)
   );

   @Override
   public MapCodec<SculkPatchFeature> codec() {
      return CODEC;
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 4
      // 04: invokevirtual net/minecraft/world/level/levelgen/feature/SculkPatchFeature.canSpreadFrom (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Z
      // 07: ifne 0c
      // 0a: bipush 0
      // 0b: ireturn
      // 0c: invokestatic net/minecraft/world/level/block/SculkSpreader.createWorldGenSpreader ()Lnet/minecraft/world/level/block/SculkSpreader;
      // 0f: astore 5
      // 11: aload 0
      // 12: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.spreadRounds I
      // 15: aload 0
      // 16: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.growthRounds I
      // 19: iadd
      // 1a: istore 6
      // 1c: bipush 0
      // 1d: istore 7
      // 1f: iload 7
      // 21: iload 6
      // 23: if_icmpge 7b
      // 26: bipush 0
      // 27: istore 8
      // 29: iload 8
      // 2b: aload 0
      // 2c: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.chargeCount I
      // 2f: if_icmpge 43
      // 32: aload 5
      // 34: aload 4
      // 36: aload 0
      // 37: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.amountPerCharge I
      // 3a: invokevirtual net/minecraft/world/level/block/SculkSpreader.addCursors (Lnet/minecraft/core/BlockPos;I)V
      // 3d: iinc 8 1
      // 40: goto 29
      // 43: iload 7
      // 45: aload 0
      // 46: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.spreadRounds I
      // 49: if_icmpge 50
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: istore 8
      // 53: bipush 0
      // 54: istore 9
      // 56: iload 9
      // 58: aload 0
      // 59: getfield net/minecraft/world/level/levelgen/feature/SculkPatchFeature.spreadAttempts I
      // 5c: if_icmpge 70
      // 5f: aload 5
      // 61: aload 1
      // 62: aload 4
      // 64: aload 3
      // 65: iload 8
      // 67: invokevirtual net/minecraft/world/level/block/SculkSpreader.updateCursors (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Z)V
      // 6a: iinc 9 1
      // 6d: goto 56
      // 70: aload 5
      // 72: invokevirtual net/minecraft/world/level/block/SculkSpreader.clear ()V
      // 75: iinc 7 1
      // 78: goto 1f
      // 7b: bipush 1
      // 7c: ireturn
   }

   private boolean canSpreadFrom(final LevelAccessor level, final BlockPos origin) {
      BlockState start = level.getBlockState(origin);
      if (start.getBlock() instanceof SculkBehaviour) {
         return true;
      } else {
         return !start.isAir() && (!start.is(Blocks.WATER) || !start.getFluidState().isSource())
            ? false
            : Direction.stream().map(origin::relative).anyMatch(pos -> level.getBlockState(pos).isCollisionShapeFullBlock(level, pos));
      }
   }
}
