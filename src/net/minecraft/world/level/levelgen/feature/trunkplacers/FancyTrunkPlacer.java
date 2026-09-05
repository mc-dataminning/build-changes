package net.minecraft.world.level.levelgen.feature.trunkplacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;

public class FancyTrunkPlacer extends TrunkPlacer {
   public static final MapCodec<FancyTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(i -> trunkPlacerParts(i).apply(i, FancyTrunkPlacer::new));
   private static final double TRUNK_HEIGHT_SCALE = 0.618;
   private static final double CLUSTER_DENSITY_MAGIC = 1.382;
   private static final double BRANCH_SLOPE = 0.381;
   private static final double BRANCH_LENGTH_MAGIC = 0.328;

   public FancyTrunkPlacer(final int baseHeight, final int heightRandA, final int heightRandB) {
      super(baseHeight, heightRandA, heightRandB);
   }

   @Override
   protected TrunkPlacerType<?> type() {
      return TrunkPlacerType.FANCY_TRUNK_PLACER;
   }

   @Override
   public List<FoliagePlacer.FoliageAttachment> placeTrunk(
      final WorldGenLevel level,
      final BiConsumer<BlockPos, BlockState> trunkSetter,
      final RandomSource random,
      final int treeHeight,
      final BlockPos origin,
      final TreeFeature tree
   ) {
      int assumedFoliageHeight = 5;
      int height = treeHeight + 2;
      int trunkHeight = Mth.floor((double)height * 0.618);
      placeBelowTrunkBlock(level, trunkSetter, random, origin.below(), tree);
      double foliageDensity = 1.0;
      int clustersPerY = Math.min(1, Mth.floor(1.382 + Math.pow(1.0 * (double)height / 13.0, 2.0)));
      int trunkTop = origin.getY() + trunkHeight;
      int relativeY = height - 5;
      List<FancyTrunkPlacer.FoliageCoords> foliageCoords = Lists.newArrayList();
      foliageCoords.add(new FancyTrunkPlacer.FoliageCoords(origin.above(relativeY), trunkTop));

      for (; relativeY >= 0; relativeY--) {
         float treeShape = treeShape(height, relativeY);
         if (!(treeShape < 0.0F)) {
            for (int i = 0; i < clustersPerY; i++) {
               double widthScale = 1.0;
               double radius = 1.0 * (double)treeShape * ((double)random.nextFloat() + 0.328);
               double angle = (double)(random.nextFloat() * 2.0F) * Math.PI;
               double x = radius * Math.sin(angle) + 0.5;
               double z = radius * Math.cos(angle) + 0.5;
               BlockPos checkStart = origin.offset(Mth.floor(x), relativeY - 1, Mth.floor(z));
               BlockPos checkEnd = checkStart.above(5);
               if (this.makeLimb(level, trunkSetter, random, checkStart, checkEnd, false, tree)) {
                  int dx = origin.getX() - checkStart.getX();
                  int dz = origin.getZ() - checkStart.getZ();
                  double branchHeight = (double)checkStart.getY() - Math.sqrt((double)(dx * dx + dz * dz)) * 0.381;
                  int branchTop = branchHeight > (double)trunkTop ? trunkTop : (int)branchHeight;
                  BlockPos checkBranchBase = new BlockPos(origin.getX(), branchTop, origin.getZ());
                  if (this.makeLimb(level, trunkSetter, random, checkBranchBase, checkStart, false, tree)) {
                     foliageCoords.add(new FancyTrunkPlacer.FoliageCoords(checkStart, checkBranchBase.getY()));
                  }
               }
            }
         }
      }

      this.makeLimb(level, trunkSetter, random, origin, origin.above(trunkHeight), true, tree);
      this.makeBranches(level, trunkSetter, random, height, origin, foliageCoords, tree);
      List<FoliagePlacer.FoliageAttachment> attachments = Lists.newArrayList();

      for (FancyTrunkPlacer.FoliageCoords foliageCoord : foliageCoords) {
         if (this.trimBranches(height, foliageCoord.getBranchBase() - origin.getY())) {
            attachments.add(foliageCoord.attachment);
         }
      }

      return attachments;
   }

   private boolean makeLimb(
      final WorldGenLevel level,
      final BiConsumer<BlockPos, BlockState> trunkSetter,
      final RandomSource random,
      final BlockPos startPos,
      final BlockPos endPos,
      final boolean doPlace,
      final TreeFeature tree
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:711)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:670)
      //   at java.base/java.util.HashMap.put(HashMap.java:619)
      //   at java.base/java.util.HashSet.add(HashSet.java:230)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectGraph.iterateExprents(DirectGraph.java:104)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.resetExprentTypes(VarTypeProcessor.java:89)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.calculateVarTypes(VarTypeProcessor.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarVersionsProcessor.setVarVersions(VarVersionsProcessor.java:68)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarVersions(VarProcessor.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:227)
      //
      // Bytecode:
      // 00: iload 6
      // 02: ifne 11
      // 05: aload 4
      // 07: aload 5
      // 09: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c: ifeq 11
      // 0f: bipush 1
      // 10: ireturn
      // 11: aload 5
      // 13: aload 4
      // 15: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 18: ineg
      // 19: aload 4
      // 1b: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 1e: ineg
      // 1f: aload 4
      // 21: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 24: ineg
      // 25: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 28: astore 8
      // 2a: aload 0
      // 2b: aload 8
      // 2d: invokevirtual net/minecraft/world/level/levelgen/feature/trunkplacers/FancyTrunkPlacer.getSteps (Lnet/minecraft/core/BlockPos;)I
      // 30: istore 9
      // 32: aload 8
      // 34: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 37: i2f
      // 38: iload 9
      // 3a: i2f
      // 3b: fdiv
      // 3c: fstore 10
      // 3e: aload 8
      // 40: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 43: i2f
      // 44: iload 9
      // 46: i2f
      // 47: fdiv
      // 48: fstore 11
      // 4a: aload 8
      // 4c: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 4f: i2f
      // 50: iload 9
      // 52: i2f
      // 53: fdiv
      // 54: fstore 12
      // 56: bipush 0
      // 57: istore 13
      // 59: iload 13
      // 5b: iload 9
      // 5d: if_icmpgt bb
      // 60: aload 4
      // 62: ldc 0.5
      // 64: iload 13
      // 66: i2f
      // 67: fload 10
      // 69: fmul
      // 6a: fadd
      // 6b: invokestatic net/minecraft/util/Mth.floor (F)I
      // 6e: ldc 0.5
      // 70: iload 13
      // 72: i2f
      // 73: fload 11
      // 75: fmul
      // 76: fadd
      // 77: invokestatic net/minecraft/util/Mth.floor (F)I
      // 7a: ldc 0.5
      // 7c: iload 13
      // 7e: i2f
      // 7f: fload 12
      // 81: fmul
      // 82: fadd
      // 83: invokestatic net/minecraft/util/Mth.floor (F)I
      // 86: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 89: astore 14
      // 8b: iload 6
      // 8d: ifeq a9
      // 90: aload 0
      // 91: aload 1
      // 92: aload 2
      // 93: aload 3
      // 94: aload 14
      // 96: aload 7
      // 98: aload 0
      // 99: aload 4
      // 9b: aload 14
      // 9d: invokedynamic apply (Lnet/minecraft/world/level/levelgen/feature/trunkplacers/FancyTrunkPlacer;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/levelgen/feature/trunkplacers/FancyTrunkPlacer.lambda$makeLimb$0 (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;, (Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState; ]
      // a2: invokevirtual net/minecraft/world/level/levelgen/feature/trunkplacers/FancyTrunkPlacer.placeLog (Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/feature/TreeFeature;Ljava/util/function/Function;)Z
      // a5: pop
      // a6: goto b5
      // a9: aload 0
      // aa: aload 1
      // ab: aload 14
      // ad: invokevirtual net/minecraft/world/level/levelgen/feature/trunkplacers/FancyTrunkPlacer.isFree (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z
      // b0: ifne b5
      // b3: bipush 0
      // b4: ireturn
      // b5: iinc 13 1
      // b8: goto 59
      // bb: bipush 1
      // bc: ireturn
   }

   private int getSteps(final BlockPos pos) {
      int absX = Mth.abs(pos.getX());
      int absY = Mth.abs(pos.getY());
      int absZ = Mth.abs(pos.getZ());
      return Math.max(absX, Math.max(absY, absZ));
   }

   private Direction.Axis getLogAxis(final BlockPos startPos, final BlockPos blockPos) {
      Direction.Axis axis = Direction.Axis.Y;
      int xdiff = Math.abs(blockPos.getX() - startPos.getX());
      int zdiff = Math.abs(blockPos.getZ() - startPos.getZ());
      int maxdiff = Math.max(xdiff, zdiff);
      if (maxdiff > 0) {
         if (xdiff == maxdiff) {
            axis = Direction.Axis.X;
         } else {
            axis = Direction.Axis.Z;
         }
      }

      return axis;
   }

   private boolean trimBranches(final int height, final int localY) {
      return (double)localY >= (double)height * 0.2;
   }

   private void makeBranches(
      final WorldGenLevel level,
      final BiConsumer<BlockPos, BlockState> trunkSetter,
      final RandomSource random,
      final int height,
      final BlockPos origin,
      final List<FancyTrunkPlacer.FoliageCoords> foliageCoords,
      final TreeFeature tree
   ) {
      for (FancyTrunkPlacer.FoliageCoords endCoord : foliageCoords) {
         int branchBase = endCoord.getBranchBase();
         BlockPos baseCoord = new BlockPos(origin.getX(), branchBase, origin.getZ());
         if (!baseCoord.equals(endCoord.attachment.pos()) && this.trimBranches(height, branchBase - origin.getY())) {
            this.makeLimb(level, trunkSetter, random, baseCoord, endCoord.attachment.pos(), true, tree);
         }
      }
   }

   private static float treeShape(final int height, final int y) {
      if ((float)y < (float)height * 0.3F) {
         return -1.0F;
      } else {
         float radius = (float)height / 2.0F;
         float adjacent = radius - (float)y;
         float distance = Mth.sqrt(radius * radius - adjacent * adjacent);
         if (adjacent == 0.0F) {
            distance = radius;
         } else if (Math.abs(adjacent) >= radius) {
            return 0.0F;
         }

         return distance * 0.5F;
      }
   }

   private static class FoliageCoords {
      private final FoliagePlacer.FoliageAttachment attachment;
      private final int branchBase;

      public FoliageCoords(final BlockPos pos, final int branchBase) {
         this.attachment = new FoliagePlacer.FoliageAttachment(pos, 0, false);
         this.branchBase = branchBase;
      }

      public int getBranchBase() {
         return this.branchBase;
      }
   }
}
