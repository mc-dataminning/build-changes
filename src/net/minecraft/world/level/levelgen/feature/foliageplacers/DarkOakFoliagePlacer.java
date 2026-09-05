package net.minecraft.world.level.levelgen.feature.foliageplacers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.TreeFeature;

public class DarkOakFoliagePlacer extends FoliagePlacer {
   public static final MapCodec<DarkOakFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(i -> foliagePlacerParts(i).apply(i, DarkOakFoliagePlacer::new));

   public DarkOakFoliagePlacer(final IntProvider radius, final IntProvider offset) {
      super(radius, offset);
   }

   @Override
   protected FoliagePlacerType<?> type() {
      return FoliagePlacerType.DARK_OAK_FOLIAGE_PLACER;
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
      BlockPos pos = foliageAttachment.pos().above(offset);
      boolean doubleTrunk = foliageAttachment.doubleTrunk();
      if (doubleTrunk) {
         this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius + 2, -1, doubleTrunk);
         this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius + 3, 0, doubleTrunk);
         this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius + 2, 1, doubleTrunk);
         if (random.nextBoolean()) {
            this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius, 2, doubleTrunk);
         }
      } else {
         this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius + 2, -1, doubleTrunk);
         this.placeLeavesRow(level, foliageSetter, random, tree, pos, leafRadius + 1, 0, doubleTrunk);
      }
   }

   @Override
   public int foliageHeight(final RandomSource random, final int treeHeight, final TreeFeature tree) {
      return 4;
   }

   @Override
   protected boolean shouldSkipLocationSigned(
      final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: iload 3
      // 01: ifne 27
      // 04: iload 6
      // 06: ifeq 27
      // 09: iload 2
      // 0a: iload 5
      // 0c: ineg
      // 0d: if_icmpeq 16
      // 10: iload 2
      // 11: iload 5
      // 13: if_icmplt 27
      // 16: iload 4
      // 18: iload 5
      // 1a: ineg
      // 1b: if_icmpeq 25
      // 1e: iload 4
      // 20: iload 5
      // 22: if_icmplt 27
      // 25: bipush 1
      // 26: ireturn
      // 27: aload 0
      // 28: aload 1
      // 29: iload 2
      // 2a: iload 3
      // 2b: iload 4
      // 2d: iload 5
      // 2f: iload 6
      // 31: invokespecial net/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer.shouldSkipLocationSigned (Lnet/minecraft/util/RandomSource;IIIIZ)Z
      // 34: ireturn
   }

   @Override
   protected boolean shouldSkipLocation(final RandomSource random, final int dx, final int y, final int dz, final int currentRadius, final boolean doubleTrunk) {
      if (y == -1 && !doubleTrunk) {
         return dx == currentRadius && dz == currentRadius;
      } else {
         return y == 1 ? dx + dz > currentRadius * 2 - 2 : false;
      }
   }
}
