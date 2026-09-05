package net.minecraft.world.level.levelgen.feature.foliageplacers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.TreeFeature;

public class MegaPineFoliagePlacer extends FoliagePlacer {
   public static final MapCodec<MegaPineFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(
      i -> foliagePlacerParts(i).and(IntProviders.codec(0, 24).fieldOf("crown_height").forGetter(p -> p.crownHeight)).apply(i, MegaPineFoliagePlacer::new)
   );
   private final IntProvider crownHeight;

   public MegaPineFoliagePlacer(final IntProvider radius, final IntProvider offset, final IntProvider crownHeight) {
      super(radius, offset);
      this.crownHeight = crownHeight;
   }

   @Override
   protected FoliagePlacerType<?> type() {
      return FoliagePlacerType.MEGA_PINE_FOLIAGE_PLACER;
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
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 6
      // 02: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageAttachment.pos ()Lnet/minecraft/core/BlockPos;
      // 05: astore 10
      // 07: bipush 0
      // 08: istore 11
      // 0a: iload 7
      // 0c: aload 6
      // 0e: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageAttachment.foliageHeightOffset ()I
      // 11: iadd
      // 12: istore 12
      // 14: aload 10
      // 16: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 19: iload 12
      // 1b: isub
      // 1c: iload 9
      // 1e: iadd
      // 1f: istore 13
      // 21: iload 13
      // 23: aload 10
      // 25: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 28: iload 9
      // 2a: iadd
      // 2b: if_icmpgt 9e
      // 2e: aload 10
      // 30: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 33: iload 13
      // 35: isub
      // 36: istore 14
      // 38: iload 8
      // 3a: aload 6
      // 3c: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageAttachment.radiusOffsetXZ ()I
      // 3f: iadd
      // 40: iload 14
      // 42: i2f
      // 43: iload 12
      // 45: i2f
      // 46: fdiv
      // 47: ldc 3.5
      // 49: fmul
      // 4a: invokestatic net/minecraft/util/Mth.floor (F)I
      // 4d: iadd
      // 4e: istore 15
      // 50: iload 14
      // 52: ifle 6c
      // 55: iload 15
      // 57: iload 11
      // 59: if_icmpne 6c
      // 5c: iload 13
      // 5e: bipush 1
      // 5f: iand
      // 60: ifne 6c
      // 63: iload 15
      // 65: bipush 1
      // 66: iadd
      // 67: istore 16
      // 69: goto 70
      // 6c: iload 15
      // 6e: istore 16
      // 70: aload 0
      // 71: aload 1
      // 72: aload 2
      // 73: aload 3
      // 74: aload 4
      // 76: new net/minecraft/core/BlockPos
      // 79: dup
      // 7a: aload 10
      // 7c: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 7f: iload 13
      // 81: aload 10
      // 83: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 86: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 89: iload 16
      // 8b: bipush 0
      // 8c: aload 6
      // 8e: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageAttachment.doubleTrunk ()Z
      // 91: invokevirtual net/minecraft/world/level/levelgen/feature/foliageplacers/MegaPineFoliagePlacer.placeLeavesRow (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;Lnet/minecraft/core/BlockPos;IIZ)V
      // 94: iload 15
      // 96: istore 11
      // 98: iinc 13 1
      // 9b: goto 21
      // 9e: return
   }

   @Override
   public int foliageHeight(final RandomSource random, final int treeHeight, final TreeFeature tree) {
      return this.crownHeight.sample(random);
   }

   @Override
   protected boolean shouldSkipLocation(final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk) {
      return dx + dz >= 7 ? true : dx * dx + dz * dz > currentRadius * currentRadius;
   }
}
