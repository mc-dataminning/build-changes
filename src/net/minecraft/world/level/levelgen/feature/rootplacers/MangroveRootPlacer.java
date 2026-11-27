package net.minecraft.world.level.levelgen.feature.rootplacers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class MangroveRootPlacer extends RootPlacer {
   public static final int ROOT_WIDTH_LIMIT = 8;
   public static final int ROOT_LENGTH_LIMIT = 15;
   public static final MapCodec<MangroveRootPlacer> CODEC = RecordCodecBuilder.mapCodec(
      i -> rootPlacerParts(i)
         .and(MangroveRootPlacement.CODEC.fieldOf("mangrove_root_placement").forGetter(c -> c.mangroveRootPlacement))
         .apply(i, MangroveRootPlacer::new)
   );
   private final MangroveRootPlacement mangroveRootPlacement;

   public MangroveRootPlacer(
      final IntProvider trunkOffsetY,
      final Holder<BlockStateProvider> rootProvider,
      final Optional<AboveRootPlacement> aboveRootPlacement,
      final MangroveRootPlacement mangroveRootPlacement
   ) {
      super(trunkOffsetY, rootProvider, aboveRootPlacement);
      this.mangroveRootPlacement = mangroveRootPlacement;
   }

   @Override
   public boolean placeRoots(
      final WorldGenLevel level,
      final BiConsumer<BlockPos, BlockState> rootSetter,
      final RandomSource random,
      final BlockPos origin,
      final BlockPos trunkOrigin,
      final TreeFeature tree
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 7
      // 09: aload 4
      // 0b: invokevirtual net/minecraft/core/BlockPos.mutable ()Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 0e: astore 8
      // 10: aload 8
      // 12: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.getY ()I
      // 15: aload 5
      // 17: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 1a: if_icmpge 35
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 8
      // 21: invokevirtual net/minecraft/world/level/levelgen/feature/rootplacers/MangroveRootPlacer.canPlaceRoot (Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z
      // 24: ifne 29
      // 27: bipush 0
      // 28: ireturn
      // 29: aload 8
      // 2b: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 2e: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.move (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 31: pop
      // 32: goto 10
      // 35: aload 7
      // 37: aload 5
      // 39: invokevirtual net/minecraft/core/BlockPos.below ()Lnet/minecraft/core/BlockPos;
      // 3c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 41: pop
      // 42: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
      // 45: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
      // 48: astore 9
      // 4a: aload 9
      // 4c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51: ifeq a2
      // 54: aload 9
      // 56: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5b: checkcast net/minecraft/core/Direction
      // 5e: astore 10
      // 60: aload 5
      // 62: aload 10
      // 64: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 67: astore 11
      // 69: new java/util/ArrayList
      // 6c: dup
      // 6d: invokespecial java/util/ArrayList.<init> ()V
      // 70: astore 12
      // 72: aload 0
      // 73: aload 1
      // 74: aload 3
      // 75: aload 11
      // 77: aload 10
      // 79: aload 5
      // 7b: aload 12
      // 7d: bipush 0
      // 7e: invokevirtual net/minecraft/world/level/levelgen/feature/rootplacers/MangroveRootPlacer.simulateRoots (Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Ljava/util/List;I)Z
      // 81: ifne 86
      // 84: bipush 0
      // 85: ireturn
      // 86: aload 7
      // 88: aload 12
      // 8a: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 8f: pop
      // 90: aload 7
      // 92: aload 5
      // 94: aload 10
      // 96: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 99: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9e: pop
      // 9f: goto 4a
      // a2: aload 7
      // a4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a9: astore 9
      // ab: aload 9
      // ad: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b2: ifeq cf
      // b5: aload 9
      // b7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // bc: checkcast net/minecraft/core/BlockPos
      // bf: astore 10
      // c1: aload 0
      // c2: aload 1
      // c3: aload 2
      // c4: aload 3
      // c5: aload 10
      // c7: aload 6
      // c9: invokevirtual net/minecraft/world/level/levelgen/feature/rootplacers/MangroveRootPlacer.placeRoot (Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;)V
      // cc: goto ab
      // cf: bipush 1
      // d0: ireturn
   }

   private boolean simulateRoots(
      final LevelSimulatedReader level,
      final RandomSource random,
      final BlockPos rootPos,
      final Direction dir,
      final BlockPos rootOrigin,
      final List<BlockPos> rootPositions,
      final int layer
   ) {
      int maxRootLength = this.mangroveRootPlacement.maxRootLength();
      if (layer != maxRootLength && rootPositions.size() <= maxRootLength) {
         for (BlockPos pos : this.potentialRootPositions(rootPos, dir, random, rootOrigin)) {
            if (this.canPlaceRoot(level, pos)) {
               rootPositions.add(pos);
               if (!this.simulateRoots(level, random, pos, dir, rootOrigin, rootPositions, layer + 1)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected List<BlockPos> potentialRootPositions(final BlockPos pos, final Direction prevDir, final RandomSource random, final BlockPos rootOrigin) {
      BlockPos below = pos.below();
      BlockPos nextTo = pos.relative(prevDir);
      int width = pos.distManhattan(rootOrigin);
      int maxRootWidth = this.mangroveRootPlacement.maxRootWidth();
      float randomSkewChance = this.mangroveRootPlacement.randomSkewChance();
      if (width > maxRootWidth - 3 && width <= maxRootWidth) {
         return random.nextFloat() < randomSkewChance ? List.of(below, nextTo.below()) : List.of(below);
      } else if (width > maxRootWidth) {
         return List.of(below);
      } else if (random.nextFloat() < randomSkewChance) {
         return List.of(below);
      } else {
         return random.nextBoolean() ? List.of(nextTo) : List.of(below);
      }
   }

   @Override
   protected boolean canPlaceRoot(final LevelSimulatedReader level, final BlockPos pos) {
      return super.canPlaceRoot(level, pos) || level.isStateAtPosition(pos, state -> state.is(this.mangroveRootPlacement.canGrowThrough()));
   }

   @Override
   protected void placeRoot(
      final WorldGenLevel level, final BiConsumer<BlockPos, BlockState> rootSetter, final RandomSource random, final BlockPos pos, final TreeFeature tree
   ) {
      if (level.isStateAtPosition(pos, s -> s.is(this.mangroveRootPlacement.muddyRootsIn()))) {
         BlockState muddyRoots = this.mangroveRootPlacement.muddyRootsProvider().value().getState(level, random, pos);
         rootSetter.accept(pos, this.getPotentiallyWaterloggedState(level, pos, muddyRoots));
      } else {
         super.placeRoot(level, rootSetter, random, pos, tree);
      }
   }

   @Override
   protected RootPlacerType<?> type() {
      return RootPlacerType.MANGROVE_ROOT_PLACER;
   }
}
