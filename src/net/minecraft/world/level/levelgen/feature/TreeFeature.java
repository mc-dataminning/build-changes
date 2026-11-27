package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.LevelWriter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.rootplacers.RootPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.shapes.BitSetDiscreteVoxelShape;
import net.minecraft.world.phys.shapes.DiscreteVoxelShape;

public record TreeFeature(
   Holder<BlockStateProvider> trunkProvider,
   TrunkPlacer trunkPlacer,
   Holder<BlockStateProvider> foliageProvider,
   FoliagePlacer foliagePlacer,
   Optional<RootPlacer> rootPlacer,
   FeatureSize minimumSize,
   List<TreeDecorator> decorators,
   boolean ignoreVines,
   Holder<BlockStateProvider> belowTrunkProvider
) implements Feature {
   public static final MapCodec<TreeFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            BlockStateProvider.CODEC.fieldOf("trunk_provider").forGetter(TreeFeature::trunkProvider),
            TrunkPlacer.CODEC.fieldOf("trunk_placer").forGetter(TreeFeature::trunkPlacer),
            BlockStateProvider.CODEC.fieldOf("foliage_provider").forGetter(TreeFeature::foliageProvider),
            FoliagePlacer.CODEC.fieldOf("foliage_placer").forGetter(TreeFeature::foliagePlacer),
            RootPlacer.CODEC.optionalFieldOf("root_placer").forGetter(TreeFeature::rootPlacer),
            FeatureSize.CODEC.fieldOf("minimum_size").forGetter(TreeFeature::minimumSize),
            TreeDecorator.CODEC.listOf().fieldOf("decorators").forGetter(TreeFeature::decorators),
            Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(TreeFeature::ignoreVines),
            BlockStateProvider.CODEC.fieldOf("below_trunk_provider").forGetter(TreeFeature::belowTrunkProvider)
         )
         .apply(i, TreeFeature::new)
   );
   private static final @Block.UpdateFlags int BLOCK_UPDATE_FLAGS = 19;
   private static final Direction[] DIRECTIONS = Direction.values();

   @Override
   public MapCodec<TreeFeature> codec() {
      return CODEC;
   }

   public static boolean isVine(final LevelSimulatedReader level, final BlockPos pos) {
      return level.isStateAtPosition(pos, state -> state.is(Blocks.VINE));
   }

   public static boolean isAirOrLeaves(final LevelSimulatedReader level, final BlockPos pos) {
      return level.isStateAtPosition(pos, state -> state.isAir() || state.is(BlockTags.LEAVES));
   }

   private static void setBlockKnownShape(final LevelWriter level, final BlockPos pos, final BlockState blockState) {
      level.setBlock(pos, blockState, 19);
   }

   public static boolean validTreePos(final LevelSimulatedReader level, final BlockPos pos) {
      return level.isStateAtPosition(pos, state -> state.isAir() || state.is(BlockTags.REPLACEABLE_BY_TREES));
   }

   private boolean doPlace(
      final WorldGenLevel level,
      final RandomSource random,
      final BlockPos origin,
      final BiConsumer<BlockPos, BlockState> rootSetter,
      final BiConsumer<BlockPos, BlockState> trunkSetter,
      final FoliagePlacer.FoliageSetter foliageSetter
   ) {
      int treeHeight = this.trunkPlacer.getTreeHeight(random);
      int foliageHeight = this.foliagePlacer.foliageHeight(random, treeHeight, this);
      int trunkHeight = treeHeight - foliageHeight;
      int leafRadius = this.foliagePlacer.foliageRadius(random, trunkHeight);
      BlockPos trunkOrigin = this.rootPlacer.<BlockPos>map(rootPlacer -> rootPlacer.getTrunkOrigin(origin, random)).orElse(origin);
      int minY = Math.min(origin.getY(), trunkOrigin.getY());
      int maxY = Math.max(origin.getY(), trunkOrigin.getY()) + treeHeight + 1;
      if (minY >= level.getMinY() + 1 && maxY <= level.getMaxY() + 1) {
         OptionalInt minClippedHeight = this.minimumSize.minClippedHeight();
         int clippedTreeHeight = this.getMaxFreeTreeHeight(level, treeHeight, trunkOrigin);
         if (clippedTreeHeight >= treeHeight || !minClippedHeight.isEmpty() && clippedTreeHeight >= minClippedHeight.getAsInt()) {
            if (this.rootPlacer.isPresent() && !this.rootPlacer.get().placeRoots(level, rootSetter, random, origin, trunkOrigin, this)) {
               return false;
            }

            List<FoliagePlacer.FoliageAttachment> foliageAttachments = this.trunkPlacer
               .placeTrunk(level, trunkSetter, random, clippedTreeHeight, trunkOrigin, this);
            foliageAttachments.forEach(
               foliageAttachment -> this.foliagePlacer
                  .createFoliage(level, foliageSetter, random, this, clippedTreeHeight, foliageAttachment, foliageHeight, leafRadius)
            );
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int getMaxFreeTreeHeight(final WorldGenLevel level, final int maxTreeHeight, final BlockPos treePos) {
      BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos();

      for (int y = 0; y <= maxTreeHeight + 1; y++) {
         int r = this.minimumSize.getSizeAtHeight(maxTreeHeight, y);

         for (int x = -r; x <= r; x++) {
            for (int z = -r; z <= r; z++) {
               blockPos.setWithOffset(treePos, x, y, z);
               if (!this.trunkPlacer.isFree(level, blockPos) || !this.ignoreVines && isVine(level, blockPos)) {
                  return y - 2;
               }
            }
         }
      }

      return maxTreeHeight;
   }

   @Override
   public void setBlock(final LevelWriter level, final BlockPos pos, final BlockState blockState) {
      setBlockKnownShape(level, pos, blockState);
   }

   @Override
   public boolean place(final WorldGenLevel level, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/jdk.internal.misc.Unsafe.allocateUninitializedArray(Unsafe.java:1396)
      //   at java.base/java.lang.StringConcatHelper.newArray(StringConcatHelper.java:578)
      //   at java.base/java.lang.StringConcatHelper.newArrayWithSuffix(StringConcatHelper.java:611)
      //   at java.base/java.lang.String$$StringConcat/0x00000000900b1c00.concat(Unknown Source)
      //   at java.base/java.lang.invoke.DirectMethodHandle$Holder.invokeSpecial(DirectMethodHandle$Holder)
      //   at java.base/java.lang.invoke.LambdaForm$MH/0x00000000900b1400.invoke(LambdaForm$MH)
      //   at java.base/java.lang.invoke.Invokers$Holder.linkToTargetMethod(Invokers$Holder)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:133)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:137)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:120)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:115)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.lambda$resetExprentTypes$1(VarTypeProcessor.java:108)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor$$Lambda/0x00000000900cc168.processExprent(Unknown Source)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectGraph.iterateExprents(DirectGraph.java:114)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.resetExprentTypes(VarTypeProcessor.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.calculateVarTypes(VarTypeProcessor.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarVersionsProcessor.setVarVersions(VarVersionsProcessor.java:68)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarVersions(VarProcessor.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:241)
      //
      // Bytecode:
      // 00: new java/util/HashSet
      // 03: dup
      // 04: invokespecial java/util/HashSet.<init> ()V
      // 07: astore 5
      // 09: new java/util/HashSet
      // 0c: dup
      // 0d: invokespecial java/util/HashSet.<init> ()V
      // 10: astore 6
      // 12: new java/util/HashSet
      // 15: dup
      // 16: invokespecial java/util/HashSet.<init> ()V
      // 19: astore 7
      // 1b: new java/util/HashSet
      // 1e: dup
      // 1f: invokespecial java/util/HashSet.<init> ()V
      // 22: astore 8
      // 24: aload 5
      // 26: aload 1
      // 27: invokedynamic accept (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, net/minecraft/world/level/levelgen/feature/TreeFeature.lambda$place$0 (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V, (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V ]
      // 2c: astore 9
      // 2e: aload 6
      // 30: aload 1
      // 31: invokedynamic accept (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, net/minecraft/world/level/levelgen/feature/TreeFeature.lambda$place$1 (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V, (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V ]
      // 36: astore 10
      // 38: new net/minecraft/world/level/levelgen/feature/TreeFeature$1
      // 3b: dup
      // 3c: aload 0
      // 3d: aload 7
      // 3f: aload 1
      // 40: invokespecial net/minecraft/world/level/levelgen/feature/TreeFeature$1.<init> (Lnet/minecraft/world/level/levelgen/feature/TreeFeature;Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;)V
      // 43: astore 11
      // 45: aload 8
      // 47: aload 1
      // 48: invokedynamic accept (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, net/minecraft/world/level/levelgen/feature/TreeFeature.lambda$place$2 (Ljava/util/Set;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V, (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V ]
      // 4d: astore 12
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 3
      // 52: aload 4
      // 54: aload 9
      // 56: aload 10
      // 58: aload 11
      // 5a: invokevirtual net/minecraft/world/level/levelgen/feature/TreeFeature.doPlace (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;Lnet/minecraft/world/level/levelgen/feature/foliageplacers/FoliagePlacer$FoliageSetter;)Z
      // 5d: istore 13
      // 5f: iload 13
      // 61: ifeq 78
      // 64: aload 6
      // 66: invokeinterface java/util/Set.isEmpty ()Z 1
      // 6b: ifeq 7a
      // 6e: aload 7
      // 70: invokeinterface java/util/Set.isEmpty ()Z 1
      // 75: ifeq 7a
      // 78: bipush 0
      // 79: ireturn
      // 7a: aload 0
      // 7b: getfield net/minecraft/world/level/levelgen/feature/TreeFeature.decorators Ljava/util/List;
      // 7e: invokeinterface java/util/List.isEmpty ()Z 1
      // 83: ifne a9
      // 86: new net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context
      // 89: dup
      // 8a: aload 1
      // 8b: aload 12
      // 8d: aload 3
      // 8e: aload 6
      // 90: aload 7
      // 92: aload 5
      // 94: invokespecial net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.<init> (Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
      // 97: astore 14
      // 99: aload 0
      // 9a: getfield net/minecraft/world/level/levelgen/feature/TreeFeature.decorators Ljava/util/List;
      // 9d: aload 14
      // 9f: invokedynamic accept (Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, net/minecraft/world/level/levelgen/feature/TreeFeature.lambda$place$3 (Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator;)V, (Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator;)V ]
      // a4: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // a9: aload 5
      // ab: aload 6
      // ad: aload 7
      // af: aload 8
      // b1: invokestatic com/google/common/collect/Iterables.concat (Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;
      // b4: invokestatic net/minecraft/world/level/levelgen/structure/BoundingBox.encapsulatingPositions (Ljava/lang/Iterable;)Ljava/util/Optional;
      // b7: aload 1
      // b8: aload 6
      // ba: aload 8
      // bc: aload 5
      // be: aload 7
      // c0: invokedynamic apply (Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/levelgen/feature/TreeFeature.lambda$place$4 (Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Ljava/lang/Boolean;, (Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Ljava/lang/Boolean; ]
      // c5: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // c8: bipush 0
      // c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // cc: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // cf: checkcast java/lang/Boolean
      // d2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // d5: ireturn
   }

   private static DiscreteVoxelShape updateLeaves(
      final LevelAccessor level, final BoundingBox bounds, final Set<BlockPos> logs, final Set<BlockPos> decorations, final Set<BlockPos> roots
   ) {
      DiscreteVoxelShape updatedShape = new BitSetDiscreteVoxelShape(bounds.getXSpan(), bounds.getYSpan(), bounds.getZSpan());
      Consumer<BlockPos> fillShape = posx -> updatedShape.fill(posx.getX() - bounds.minX(), posx.getY() - bounds.minY(), posx.getZ() - bounds.minZ());
      logs.forEach(fillShape);
      decorations.forEach(fillShape);
      roots.forEach(fillShape);
      BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
      BlockPos.MutableBlockPos neighborPos = new BlockPos.MutableBlockPos();
      int distance = 0;
      LongArrayList blocksToCheck = new LongArrayList(logs.size());

      for (BlockPos log : logs) {
         blocksToCheck.add(log.asLong());
      }

      LongArrayList nextBlocksToCheck = new LongArrayList();

      while (!blocksToCheck.isEmpty() || !nextBlocksToCheck.isEmpty()) {
         if (blocksToCheck.isEmpty()) {
            blocksToCheck.addAll(nextBlocksToCheck);
            nextBlocksToCheck.clear();
            distance++;
         }

         pos.set(blocksToCheck.popLong());
         int neighborDistance = distance + 1;

         for (Direction direction : DIRECTIONS) {
            neighborPos.setWithOffset(pos, direction);
            if (bounds.isInside(neighborPos)) {
               int neighborIndexX = neighborPos.getX() - bounds.minX();
               int neighborIndexY = neighborPos.getY() - bounds.minY();
               int neighborIndexZ = neighborPos.getZ() - bounds.minZ();
               if (!updatedShape.isFull(neighborIndexX, neighborIndexY, neighborIndexZ)) {
                  BlockState neighborState = level.getBlockState(neighborPos);
                  OptionalInt existingNeighborDistance = LeavesBlock.getOptionalDistanceAt(neighborState);
                  if (!existingNeighborDistance.isEmpty() && existingNeighborDistance.getAsInt() >= neighborDistance) {
                     setBlockKnownShape(level, neighborPos, neighborState.setValue(BlockStateProperties.DISTANCE, neighborDistance));
                     updatedShape.fill(neighborIndexX, neighborIndexY, neighborIndexZ);
                     if (neighborDistance + 1 < 7) {
                        nextBlocksToCheck.push(neighborPos.asLong());
                     }
                  }
               }
            }
         }
      }

      return updatedShape;
   }

   public static List<BlockPos> getLowestTrunkOrRootOfTree(final TreeDecorator.Context context) {
      List<BlockPos> blockPositions = new ArrayList<>();
      List<BlockPos> roots = context.roots();
      List<BlockPos> logs = context.logs();
      if (roots.isEmpty()) {
         blockPositions.addAll(logs);
      } else if (!logs.isEmpty() && roots.get(0).getY() == logs.get(0).getY()) {
         blockPositions.addAll(logs);
         blockPositions.addAll(roots);
      } else {
         blockPositions.addAll(roots);
      }

      return blockPositions;
   }

   public static class Builder {
      public final Holder<BlockStateProvider> trunkProvider;
      private final TrunkPlacer trunkPlacer;
      public final Holder<BlockStateProvider> foliageProvider;
      private final FoliagePlacer foliagePlacer;
      private final Optional<RootPlacer> rootPlacer;
      private final FeatureSize minimumSize;
      private List<TreeDecorator> decorators = List.of();
      private boolean ignoreVines;
      private Holder<BlockStateProvider> belowTrunkProvider;

      public Builder(
         final Holder<BlockStateProvider> trunkProvider,
         final TrunkPlacer trunkPlacer,
         final Holder<BlockStateProvider> foliageProvider,
         final FoliagePlacer foliagePlacer,
         final Optional<RootPlacer> rootPlacer,
         final FeatureSize minimumSize,
         final Holder<BlockStateProvider> belowTrunkProvider
      ) {
         this.trunkProvider = trunkProvider;
         this.trunkPlacer = trunkPlacer;
         this.foliageProvider = foliageProvider;
         this.foliagePlacer = foliagePlacer;
         this.rootPlacer = rootPlacer;
         this.minimumSize = minimumSize;
         this.belowTrunkProvider = belowTrunkProvider;
      }

      public Builder(
         final BlockStateProvider trunkProvider,
         final TrunkPlacer trunkPlacer,
         final BlockStateProvider foliageProvider,
         final FoliagePlacer foliagePlacer,
         final Optional<RootPlacer> rootPlacer,
         final FeatureSize minimumSize,
         final Holder<BlockStateProvider> belowTrunkProvider
      ) {
         this(Holder.direct(trunkProvider), trunkPlacer, Holder.direct(foliageProvider), foliagePlacer, rootPlacer, minimumSize, belowTrunkProvider);
      }

      public Builder(
         final BlockStateProvider trunkProvider,
         final TrunkPlacer trunkPlacer,
         final BlockStateProvider foliageProvider,
         final FoliagePlacer foliagePlacer,
         final FeatureSize minimumSize,
         final Holder<BlockStateProvider> belowTrunkProvider
      ) {
         this(trunkProvider, trunkPlacer, foliageProvider, foliagePlacer, Optional.empty(), minimumSize, belowTrunkProvider);
      }

      public TreeFeature.Builder belowTrunkProvider(final Holder<BlockStateProvider> belowTrunkProvider) {
         this.belowTrunkProvider = belowTrunkProvider;
         return this;
      }

      public TreeFeature.Builder decorators(final List<TreeDecorator> decorators) {
         this.decorators = decorators;
         return this;
      }

      public TreeFeature.Builder ignoreVines() {
         this.ignoreVines = true;
         return this;
      }

      public TreeFeature build() {
         return new TreeFeature(
            this.trunkProvider,
            this.trunkPlacer,
            this.foliageProvider,
            this.foliagePlacer,
            this.rootPlacer,
            this.minimumSize,
            this.decorators,
            this.ignoreVines,
            this.belowTrunkProvider
         );
      }
   }
}
