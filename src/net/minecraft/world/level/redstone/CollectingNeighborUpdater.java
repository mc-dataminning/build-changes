package net.minecraft.world.level.redstone;

import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class CollectingNeighborUpdater implements NeighborUpdater {
   private static final Logger LOGGER = LogUtils.getLogger();
   private final Level level;
   private final int maxChainedNeighborUpdates;
   private final ArrayDeque<CollectingNeighborUpdater.NeighborUpdates> stack = new ArrayDeque<>();
   private final List<CollectingNeighborUpdater.NeighborUpdates> addedThisLayer = new ArrayList<>();
   private int count = 0;
   private @Nullable Consumer<BlockPos> debugListener;

   public CollectingNeighborUpdater(final Level level, final int maxChainedNeighborUpdates) {
      this.level = level;
      this.maxChainedNeighborUpdates = maxChainedNeighborUpdates;
   }

   public void setDebugListener(final @Nullable Consumer<BlockPos> debugListener) {
      this.debugListener = debugListener;
   }

   @Override
   public void shapeUpdate(
      final Direction direction,
      final BlockState neighborState,
      final BlockPos pos,
      final BlockPos neighborPos,
      final @Block.UpdateFlags int updateFlags,
      final int updateLimit
   ) {
      this.addAndRun(
         pos, new CollectingNeighborUpdater.ShapeUpdate(direction, neighborState, pos.immutable(), neighborPos.immutable(), updateFlags, updateLimit)
      );
   }

   @Override
   public void neighborChanged(final BlockPos pos, final Block block, final @Nullable Orientation orientation) {
      this.addAndRun(pos, new CollectingNeighborUpdater.SimpleNeighborUpdate(pos, block, orientation));
   }

   @Override
   public void neighborChanged(
      final BlockState state, final BlockPos pos, final Block block, final @Nullable Orientation orientation, final boolean movedByPiston
   ) {
      this.addAndRun(pos, new CollectingNeighborUpdater.FullNeighborUpdate(state, pos.immutable(), block, orientation, movedByPiston));
   }

   @Override
   public void updateNeighborsAtExceptFromFacing(
      final BlockPos pos, final Block block, final @Nullable Direction skipDirection, final @Nullable Orientation orientation
   ) {
      this.addAndRun(pos, new CollectingNeighborUpdater.MultiNeighborUpdate(pos.immutable(), block, orientation, skipDirection));
   }

   private void addAndRun(final BlockPos pos, final CollectingNeighborUpdater.NeighborUpdates update) {
      boolean runningAlready = this.count > 0;
      boolean tooManyUpdates = this.maxChainedNeighborUpdates >= 0 && this.count >= this.maxChainedNeighborUpdates;
      this.count++;
      if (!tooManyUpdates) {
         if (runningAlready) {
            this.addedThisLayer.add(update);
         } else {
            this.stack.push(update);
         }
      } else if (this.count - 1 == this.maxChainedNeighborUpdates) {
         LOGGER.error("Too many chained neighbor updates. Skipping the rest. First skipped position: {}", pos.toShortString());
      }

      if (!runningAlready) {
         this.runUpdates();
      }
   }

   private void runUpdates() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // 04: invokevirtual java/util/ArrayDeque.isEmpty ()Z
      // 07: ifeq 16
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 0e: invokeinterface java/util/List.isEmpty ()Z 1
      // 13: ifne 8c
      // 16: aload 0
      // 17: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 1a: invokeinterface java/util/List.size ()I 1
      // 1f: bipush 1
      // 20: isub
      // 21: istore 1
      // 22: iload 1
      // 23: iflt 40
      // 26: aload 0
      // 27: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // 2a: aload 0
      // 2b: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 2e: iload 1
      // 2f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 34: checkcast net/minecraft/world/level/redstone/CollectingNeighborUpdater$NeighborUpdates
      // 37: invokevirtual java/util/ArrayDeque.push (Ljava/lang/Object;)V
      // 3a: iinc 1 -1
      // 3d: goto 22
      // 40: aload 0
      // 41: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 44: invokeinterface java/util/List.clear ()V 1
      // 49: aload 0
      // 4a: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // 4d: invokevirtual java/util/ArrayDeque.peek ()Ljava/lang/Object;
      // 50: checkcast net/minecraft/world/level/redstone/CollectingNeighborUpdater$NeighborUpdates
      // 53: astore 1
      // 54: aload 0
      // 55: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.debugListener Ljava/util/function/Consumer;
      // 58: ifnull 65
      // 5b: aload 1
      // 5c: aload 0
      // 5d: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.debugListener Ljava/util/function/Consumer;
      // 60: invokeinterface net/minecraft/world/level/redstone/CollectingNeighborUpdater$NeighborUpdates.forEachUpdatedPos (Ljava/util/function/Consumer;)V 2
      // 65: aload 0
      // 66: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 69: invokeinterface java/util/List.isEmpty ()Z 1
      // 6e: ifeq 89
      // 71: aload 1
      // 72: aload 0
      // 73: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.level Lnet/minecraft/world/level/Level;
      // 76: invokeinterface net/minecraft/world/level/redstone/CollectingNeighborUpdater$NeighborUpdates.runNext (Lnet/minecraft/world/level/Level;)Z 2
      // 7b: ifne 65
      // 7e: aload 0
      // 7f: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // 82: invokevirtual java/util/ArrayDeque.pop ()Ljava/lang/Object;
      // 85: pop
      // 86: goto 89
      // 89: goto 00
      // 8c: aload 0
      // 8d: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // 90: invokevirtual java/util/ArrayDeque.clear ()V
      // 93: aload 0
      // 94: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // 97: invokeinterface java/util/List.clear ()V 1
      // 9c: aload 0
      // 9d: bipush 0
      // 9e: putfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.count I
      // a1: goto bc
      // a4: astore 2
      // a5: aload 0
      // a6: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.stack Ljava/util/ArrayDeque;
      // a9: invokevirtual java/util/ArrayDeque.clear ()V
      // ac: aload 0
      // ad: getfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.addedThisLayer Ljava/util/List;
      // b0: invokeinterface java/util/List.clear ()V 1
      // b5: aload 0
      // b6: bipush 0
      // b7: putfield net/minecraft/world/level/redstone/CollectingNeighborUpdater.count I
      // ba: aload 2
      // bb: athrow
      // bc: return
      // try (0 -> 56): 66 null
   }

   private record FullNeighborUpdate(BlockState state, BlockPos pos, Block block, @Nullable Orientation orientation, boolean movedByPiston)
      implements CollectingNeighborUpdater.NeighborUpdates {
      @Override
      public boolean runNext(final Level level) {
         NeighborUpdater.executeUpdate(level, this.state, this.pos, this.block, this.orientation, this.movedByPiston);
         return false;
      }

      @Override
      public void forEachUpdatedPos(final Consumer<BlockPos> output) {
         output.accept(this.pos);
      }
   }

   private static final class MultiNeighborUpdate implements CollectingNeighborUpdater.NeighborUpdates {
      private final BlockPos sourcePos;
      private final Block sourceBlock;
      private @Nullable Orientation orientation;
      private final @Nullable Direction skipDirection;
      private int idx = 0;

      public MultiNeighborUpdate(
         final BlockPos sourcePos, final Block sourceBlock, final @Nullable Orientation orientation, final @Nullable Direction skipDirection
      ) {
         this.sourcePos = sourcePos;
         this.sourceBlock = sourceBlock;
         this.orientation = orientation;
         this.skipDirection = skipDirection;
         if (NeighborUpdater.UPDATE_ORDER[this.idx] == skipDirection) {
            this.idx++;
         }
      }

      @Override
      public boolean runNext(final Level level) {
         Direction direction = NeighborUpdater.UPDATE_ORDER[this.idx++];
         BlockPos neighborPos = this.sourcePos.relative(direction);
         BlockState state = level.getBlockState(neighborPos);
         Orientation orientation = null;
         if (level.enabledFeatures().contains(FeatureFlags.REDSTONE_EXPERIMENTS)) {
            if (this.orientation == null) {
               this.orientation = ExperimentalRedstoneUtils.initialOrientation(
                  level, this.skipDirection == null ? null : this.skipDirection.getOpposite(), null
               );
            }

            orientation = this.orientation.withFront(direction);
         }

         NeighborUpdater.executeUpdate(level, state, neighborPos, this.sourceBlock, orientation, false);
         if (this.idx < NeighborUpdater.UPDATE_ORDER.length && NeighborUpdater.UPDATE_ORDER[this.idx] == this.skipDirection) {
            this.idx++;
         }

         return this.idx < NeighborUpdater.UPDATE_ORDER.length;
      }

      @Override
      public void forEachUpdatedPos(final Consumer<BlockPos> output) {
         for (Direction direction : NeighborUpdater.UPDATE_ORDER) {
            if (direction != this.skipDirection) {
               BlockPos neighborPos = this.sourcePos.relative(direction);
               output.accept(neighborPos);
            }
         }
      }
   }

   private interface NeighborUpdates {
      boolean runNext(Level level);

      void forEachUpdatedPos(Consumer<BlockPos> output);
   }

   private record ShapeUpdate(
      Direction direction, BlockState neighborState, BlockPos pos, BlockPos neighborPos, @Block.UpdateFlags int updateFlags, int updateLimit
   ) implements CollectingNeighborUpdater.NeighborUpdates {
      @Override
      public boolean runNext(final Level level) {
         NeighborUpdater.executeShapeUpdate(level, this.direction, this.pos, this.neighborPos, this.neighborState, this.updateFlags, this.updateLimit);
         return false;
      }

      @Override
      public void forEachUpdatedPos(final Consumer<BlockPos> output) {
         output.accept(this.pos);
      }
   }

   private record SimpleNeighborUpdate(BlockPos pos, Block block, @Nullable Orientation orientation) implements CollectingNeighborUpdater.NeighborUpdates {
      @Override
      public boolean runNext(final Level level) {
         BlockState state = level.getBlockState(this.pos);
         NeighborUpdater.executeUpdate(level, state, this.pos, this.block, this.orientation, false);
         return false;
      }

      @Override
      public void forEachUpdatedPos(final Consumer<BlockPos> output) {
         output.accept(this.pos);
      }
   }
}
