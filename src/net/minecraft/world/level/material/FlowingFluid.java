package net.minecraft.world.level.material;

import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class FlowingFluid extends Fluid {
   public static final BooleanProperty SOURCE = BlockStateProperties.SOURCE;
   public static final IntegerProperty LEVEL = BlockStateProperties.LEVEL_FLOWING;
   private static final int CACHE_SIZE = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<FlowingFluid.BlockStatePairKey>> OCCLUSION_CACHE = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<FlowingFluid.BlockStatePairKey> map = new Object2ByteLinkedOpenHashMap<FlowingFluid.BlockStatePairKey>(200) {
         protected void rehash(final int newN) {
         }
      };
      map.defaultReturnValue((byte)127);
      return map;
   });
   private final Map<FluidState, VoxelShape> shapes = new IdentityHashMap<>();

   protected FlowingFluid(final Fluid.Properties properties) {
      super(properties);
   }

   @Override
   protected void createFluidStateDefinition(final StateDefinition.Builder<Fluid, FluidState> builder) {
      builder.add(SOURCE);
      builder.add(LEVEL);
   }

   @Override
   protected FluidState makeDefaultState(final FluidState state) {
      return state.setValue(SOURCE, true).setValue(LEVEL, 8);
   }

   @Override
   public Vec3 getFlow(final BlockGetter level, final BlockPos pos, final FluidState fluidState) {
      double flowX = 0.0;
      double flowZ = 0.0;
      BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos();

      for (Direction direction : Direction.Plane.HORIZONTAL) {
         blockPos.setWithOffset(pos, direction);
         FluidState neighbourFluid = level.getFluidState(blockPos);
         if (this.affectsFlow(neighbourFluid)) {
            float neighborHeight = neighbourFluid.getOwnHeight();
            float distance = 0.0F;
            if (neighborHeight == 0.0F) {
               if (!level.getBlockState(blockPos).is(BlockTags.BLOCKS_FLUID_FLOW)) {
                  BlockPos neighborPos = blockPos.below();
                  FluidState belowNeighborState = level.getFluidState(neighborPos);
                  if (this.affectsFlow(belowNeighborState)) {
                     neighborHeight = belowNeighborState.getOwnHeight();
                     if (neighborHeight > 0.0F) {
                        distance = fluidState.getOwnHeight() - (neighborHeight - 0.8888889F);
                     }
                  }
               }
            } else if (neighborHeight > 0.0F) {
               distance = fluidState.getOwnHeight() - neighborHeight;
            }

            if (distance != 0.0F) {
               flowX += direction.getStepX() * distance;
               flowZ += direction.getStepZ() * distance;
            }
         }
      }

      Vec3 flow = new Vec3(flowX, 0.0, flowZ);
      if (fluidState.isFalling()) {
         for (Direction direction : Direction.Plane.HORIZONTAL) {
            blockPos.setWithOffset(pos, direction);
            if (this.isSolidFace(level, blockPos, direction) || this.isSolidFace(level, blockPos.above(), direction)) {
               flow = flow.normalize().add(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return flow.normalize();
   }

   private boolean affectsFlow(final FluidState neighbourFluid) {
      return neighbourFluid.isEmpty() || neighbourFluid.is(this);
   }

   protected boolean isSolidFace(final BlockGetter level, final BlockPos pos, final Direction direction) {
      BlockState state = level.getBlockState(pos);
      FluidState fluidState = level.getFluidState(pos);
      if (fluidState.is(this)) {
         return false;
      } else if (direction == Direction.UP) {
         return true;
      } else {
         return state.getBlock() instanceof IceBlock ? false : state.isFaceSturdy(level, pos, direction);
      }
   }

   protected void spread(final ServerLevel level, final BlockPos pos, final BlockState state, final FluidState fluidState) {
      if (!fluidState.isEmpty()) {
         BlockPos belowPos = pos.below();
         BlockState belowState = level.getBlockState(belowPos);
         FluidState belowFluid = belowState.getFluidState();
         if (this.canMaybePassThrough(level, pos, state, Direction.DOWN, belowPos, belowState, belowFluid)) {
            FluidState newBelowFluid = this.getNewLiquid(level, belowPos, belowState);
            if (belowFluid.canBeReplacedWith(level, belowPos, newBelowFluid, Direction.DOWN)
               && canHoldSpecificFluid(level, belowPos, belowState, newBelowFluid)) {
               this.spreadTo(level, belowPos, belowState, Direction.DOWN, newBelowFluid);
               if (this.sourceNeighborCount(level, pos) >= 3) {
                  this.spreadToSides(level, pos, fluidState, state);
               }

               return;
            }
         }

         if (fluidState.isSource() || !this.isWaterHole(level, pos, state, belowPos, belowState)) {
            this.spreadToSides(level, pos, fluidState, state);
         }
      }
   }

   private void spreadToSides(final ServerLevel level, final BlockPos pos, final FluidState fluidState, final BlockState state) {
      int neighbor = fluidState.getAmount() - this.getDropOff(level);
      if (fluidState.isFalling()) {
         neighbor = 7;
      }

      if (neighbor > 0) {
         Map<Direction, FluidState> spreads = this.getSpread(level, pos, state);

         for (Entry<Direction, FluidState> entry : spreads.entrySet()) {
            Direction spread = entry.getKey();
            FluidState newNeighborFluid = entry.getValue();
            BlockPos neighborPos = pos.relative(spread);
            this.spreadTo(level, neighborPos, level.getBlockState(neighborPos), spread, newNeighborFluid);
         }
      }
   }

   protected FluidState getNewLiquid(final ServerLevel level, final BlockPos pos, final BlockState state) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 4
      // 003: bipush 0
      // 004: istore 5
      // 006: new net/minecraft/core/BlockPos$MutableBlockPos
      // 009: dup
      // 00a: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> ()V
      // 00d: astore 6
      // 00f: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
      // 012: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
      // 015: astore 7
      // 017: aload 7
      // 019: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01e: ifeq 07b
      // 021: aload 7
      // 023: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 028: checkcast net/minecraft/core/Direction
      // 02b: astore 8
      // 02d: aload 6
      // 02f: aload 2
      // 030: aload 8
      // 032: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setWithOffset (Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 035: astore 9
      // 037: aload 1
      // 038: aload 9
      // 03a: invokevirtual net/minecraft/server/level/ServerLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 03d: astore 10
      // 03f: aload 10
      // 041: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 044: astore 11
      // 046: aload 11
      // 048: aload 0
      // 049: invokevirtual net/minecraft/world/level/material/FluidState.is (Ljava/lang/Object;)Z
      // 04c: ifne 052
      // 04f: goto 017
      // 052: aload 8
      // 054: aload 1
      // 055: aload 2
      // 056: aload 3
      // 057: aload 9
      // 059: aload 10
      // 05b: invokestatic net/minecraft/world/level/material/FlowingFluid.canPassThroughWall (Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 05e: ifeq 078
      // 061: aload 11
      // 063: invokevirtual net/minecraft/world/level/material/FluidState.isSource ()Z
      // 066: ifeq 06c
      // 069: iinc 5 1
      // 06c: iload 4
      // 06e: aload 11
      // 070: invokevirtual net/minecraft/world/level/material/FluidState.getAmount ()I
      // 073: invokestatic java/lang/Math.max (II)I
      // 076: istore 4
      // 078: goto 017
      // 07b: iload 5
      // 07d: bipush 2
      // 07e: if_icmplt 0b5
      // 081: aload 0
      // 082: aload 1
      // 083: invokevirtual net/minecraft/world/level/material/FlowingFluid.canConvertToSource (Lnet/minecraft/server/level/ServerLevel;)Z
      // 086: ifeq 0b5
      // 089: aload 1
      // 08a: aload 6
      // 08c: aload 2
      // 08d: getstatic net/minecraft/core/Direction.DOWN Lnet/minecraft/core/Direction;
      // 090: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setWithOffset (Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 093: invokevirtual net/minecraft/server/level/ServerLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 096: astore 7
      // 098: aload 7
      // 09a: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 09d: astore 8
      // 09f: aload 7
      // 0a1: invokevirtual net/minecraft/world/level/block/state/BlockState.isSolid ()Z
      // 0a4: ifne 0b0
      // 0a7: aload 0
      // 0a8: aload 8
      // 0aa: invokevirtual net/minecraft/world/level/material/FlowingFluid.isSourceBlockOfThisType (Lnet/minecraft/world/level/material/FluidState;)Z
      // 0ad: ifeq 0b5
      // 0b0: aload 0
      // 0b1: invokevirtual net/minecraft/world/level/material/FlowingFluid.getSource ()Lnet/minecraft/world/level/material/FluidState;
      // 0b4: areturn
      // 0b5: aload 6
      // 0b7: aload 2
      // 0b8: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 0bb: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setWithOffset (Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 0be: astore 7
      // 0c0: aload 1
      // 0c1: aload 7
      // 0c3: invokevirtual net/minecraft/server/level/ServerLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0c6: astore 8
      // 0c8: aload 8
      // 0ca: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 0cd: astore 9
      // 0cf: aload 9
      // 0d1: invokevirtual net/minecraft/world/level/material/FluidState.isEmpty ()Z
      // 0d4: ifne 0f7
      // 0d7: aload 9
      // 0d9: aload 0
      // 0da: invokevirtual net/minecraft/world/level/material/FluidState.is (Ljava/lang/Object;)Z
      // 0dd: ifeq 0f7
      // 0e0: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // 0e3: aload 1
      // 0e4: aload 2
      // 0e5: aload 3
      // 0e6: aload 7
      // 0e8: aload 8
      // 0ea: invokestatic net/minecraft/world/level/material/FlowingFluid.canPassThroughWall (Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0ed: ifeq 0f7
      // 0f0: aload 0
      // 0f1: bipush 8
      // 0f3: invokevirtual net/minecraft/world/level/material/FlowingFluid.getFlowing (I)Lnet/minecraft/world/level/material/FluidState;
      // 0f6: areturn
      // 0f7: iload 4
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: invokevirtual net/minecraft/world/level/material/FlowingFluid.getDropOff (Lnet/minecraft/world/level/LevelReader;)I
      // 0fe: isub
      // 0ff: istore 10
      // 101: iload 10
      // 103: ifgt 10d
      // 106: getstatic net/minecraft/world/level/material/Fluids.EMPTY Lnet/minecraft/world/level/material/Fluid;
      // 109: invokevirtual net/minecraft/world/level/material/Fluid.defaultFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 10c: areturn
      // 10d: aload 0
      // 10e: iload 10
      // 110: invokevirtual net/minecraft/world/level/material/FlowingFluid.getFlowing (I)Lnet/minecraft/world/level/material/FluidState;
      // 113: areturn
   }

   private static boolean canPassThroughWall(
      final Direction direction,
      final BlockGetter level,
      final BlockPos sourcePos,
      final BlockState sourceState,
      final BlockPos targetPos,
      final BlockState targetState
   ) {
      if (!SharedConstants.DEBUG_DISABLE_LIQUID_SPREADING && (!SharedConstants.DEBUG_ONLY_GENERATE_HALF_THE_WORLD || targetPos.getZ() >= 0)) {
         VoxelShape targetShape = targetState.getCollisionShape(level, targetPos);
         if (targetShape == Shapes.block()) {
            return false;
         }

         VoxelShape sourceShape = sourceState.getCollisionShape(level, sourcePos);
         if (sourceShape == Shapes.block()) {
            return false;
         }

         if (sourceShape == Shapes.empty() && targetShape == Shapes.empty()) {
            return true;
         }

         Object2ByteLinkedOpenHashMap<FlowingFluid.BlockStatePairKey> cache;
         if (!sourceState.getBlock().hasDynamicShape() && !targetState.getBlock().hasDynamicShape()) {
            cache = OCCLUSION_CACHE.get();
         } else {
            cache = null;
         }

         FlowingFluid.BlockStatePairKey key;
         if (cache != null) {
            key = new FlowingFluid.BlockStatePairKey(sourceState, targetState, direction);
            byte cached = cache.getAndMoveToFirst(key);
            if (cached != 127) {
               return cached != 0;
            }
         } else {
            key = null;
         }

         boolean result = !Shapes.mergedFaceOccludes(sourceShape, targetShape, direction);
         if (cache != null) {
            if (cache.size() == 200) {
               cache.removeLastByte();
            }

            cache.putAndMoveToFirst(key, (byte)(result ? 1 : 0));
         }

         return result;
      } else {
         return false;
      }
   }

   public FluidState getFlowing(final int amount) {
      return this.defaultFluidState().setValue(LEVEL, amount).setValue(SOURCE, false);
   }

   public FluidState getSource() {
      return this.defaultFluidState();
   }

   @Override
   public boolean isSource(final FluidState fluidState) {
      return fluidState.getValue(SOURCE);
   }

   @Override
   public boolean isFalling(final FluidState fluidState) {
      return !fluidState.getValue(SOURCE) && fluidState.getAmount() == 8;
   }

   protected abstract boolean canConvertToSource(ServerLevel level);

   protected void spreadTo(final LevelAccessor level, final BlockPos pos, final BlockState state, final Direction direction, final FluidState target) {
      if (state.getBlock() instanceof LiquidBlockContainer container) {
         container.placeLiquid(level, pos, state, target);
      } else {
         if (!state.isAir()) {
            this.beforeDestroyingBlock(level, pos, state);
            level.destroyBlock(pos, true);
         }

         level.setBlockAndUpdate(pos, target.createLegacyBlock());
      }
   }

   protected void beforeDestroyingBlock(final LevelAccessor level, final BlockPos pos, final BlockState state) {
   }

   protected int getSlopeDistance(
      final LevelReader level, final BlockPos pos, final int pass, final Direction from, final BlockState state, final FlowingFluid.SpreadContext context
   ) {
      int lowest = 1000;

      for (Direction direction : Direction.Plane.HORIZONTAL) {
         if (direction != from) {
            BlockPos testPos = pos.relative(direction);
            BlockState testState = context.getBlockState(testPos);
            FluidState testFluidState = testState.getFluidState();
            if (this.canPassThrough(level, pos, state, direction, testPos, testState, testFluidState)) {
               if (context.isHole(testPos)) {
                  return pass;
               }

               if (pass < this.getSlopeFindDistance(level)) {
                  int v = this.getSlopeDistance(level, testPos, pass + 1, direction.getOpposite(), testState, context);
                  if (v < lowest) {
                     lowest = v;
                  }
               }
            }
         }
      }

      return lowest;
   }

   private boolean isWaterHole(
      final BlockGetter level, final BlockPos topPos, final BlockState topState, final BlockPos bottomPos, final BlockState bottomState
   ) {
      if (!canPassThroughWall(Direction.DOWN, level, topPos, topState, bottomPos, bottomState)) {
         return false;
      } else {
         return bottomState.getFluidState().is(this) ? true : canHoldFluid(level, bottomPos, bottomState, this.getFlowing(8));
      }
   }

   private boolean canPassThrough(
      final BlockGetter level,
      final BlockPos sourcePos,
      final BlockState sourceState,
      final Direction direction,
      final BlockPos testPos,
      final BlockState testState,
      final FluidState testFluidState
   ) {
      return this.canMaybePassThrough(level, sourcePos, sourceState, direction, testPos, testState, testFluidState)
         && canHoldSpecificFluid(level, testPos, testState, this.getFlowing(8));
   }

   private boolean canMaybePassThrough(
      final BlockGetter level,
      final BlockPos sourcePos,
      final BlockState sourceState,
      final Direction direction,
      final BlockPos testPos,
      final BlockState testState,
      final FluidState testFluidState
   ) {
      return !this.isSourceBlockOfThisType(testFluidState)
         && canHoldAnyFluid(testState)
         && canPassThroughWall(direction, level, sourcePos, sourceState, testPos, testState);
   }

   private boolean isSourceBlockOfThisType(final FluidState state) {
      return state.is(this) && state.isSource();
   }

   protected abstract int getSlopeFindDistance(LevelReader level);

   private int sourceNeighborCount(final LevelReader level, final BlockPos pos) {
      int count = 0;

      for (Direction direction : Direction.Plane.HORIZONTAL) {
         BlockPos testPos = pos.relative(direction);
         FluidState testFluidState = level.getFluidState(testPos);
         if (this.isSourceBlockOfThisType(testFluidState)) {
            count++;
         }
      }

      return count;
   }

   protected Map<Direction, FluidState> getSpread(final ServerLevel level, final BlockPos pos, final BlockState state) {
      int lowest = 1000;
      Map<Direction, FluidState> result = new EnumMap<>(Direction.class);
      FlowingFluid.SpreadContext context = null;

      for (Direction direction : Direction.Plane.HORIZONTAL) {
         BlockPos testPos = pos.relative(direction);
         BlockState testState = level.getBlockState(testPos);
         FluidState testFluidState = testState.getFluidState();
         if (this.canMaybePassThrough(level, pos, state, direction, testPos, testState, testFluidState)) {
            FluidState newFluid = this.getNewLiquid(level, testPos, testState);
            if (canHoldSpecificFluid(level, testPos, testState, newFluid)) {
               if (context == null) {
                  context = new FlowingFluid.SpreadContext(level, pos);
               }

               int distance;
               if (context.isHole(testPos)) {
                  distance = 0;
               } else {
                  distance = this.getSlopeDistance(level, testPos, 1, direction.getOpposite(), testState, context);
               }

               if (distance < lowest) {
                  result.clear();
               }

               if (distance <= lowest) {
                  if (testFluidState.canBeReplacedWith(level, testPos, newFluid, direction)) {
                     result.put(direction, newFluid);
                  }

                  lowest = distance;
               }
            }
         }
      }

      return result;
   }

   private static boolean canHoldAnyFluid(final BlockState state) {
      Block block = state.getBlock();
      return block instanceof LiquidBlockContainer ? true : state.is(BlockTags.WASHED_AWAY_BY_FLUIDS);
   }

   private static boolean canHoldFluid(final BlockGetter level, final BlockPos pos, final BlockState state, final FluidState newFluid) {
      return canHoldAnyFluid(state) && canHoldSpecificFluid(level, pos, state, newFluid);
   }

   private static boolean canHoldSpecificFluid(final BlockGetter level, final BlockPos pos, final BlockState state, final FluidState newFluid) {
      return state.getBlock() instanceof LiquidBlockContainer container ? container.canPlaceLiquid(null, level, pos, state, newFluid) : true;
   }

   protected abstract int getDropOff(LevelReader level);

   protected int getSpreadDelay(final Level level, final BlockPos pos, final FluidState oldFluidState, final FluidState newFluidState) {
      return this.getTickDelay(level);
   }

   @Override
   public void tick(final ServerLevel level, final BlockPos pos, BlockState blockState, FluidState fluidState) {
      if (!fluidState.isSource()) {
         FluidState newFluidState = this.getNewLiquid(level, pos, level.getBlockState(pos));
         int tickDelay = this.getSpreadDelay(level, pos, fluidState, newFluidState);
         if (newFluidState.isEmpty()) {
            fluidState = newFluidState;
            blockState = Blocks.AIR.defaultBlockState();
            level.setBlockAndUpdate(pos, blockState);
         } else if (newFluidState != fluidState) {
            fluidState = newFluidState;
            blockState = fluidState.createLegacyBlock();
            level.setBlockAndUpdate(pos, blockState);
            level.scheduleTick(pos, fluidState.getType(), tickDelay);
         }
      }

      this.spread(level, pos, blockState, fluidState);
   }

   protected static int getLegacyLevel(final FluidState fluidState) {
      return fluidState.isSource() ? 0 : 8 - Math.min(fluidState.getAmount(), 8) + (fluidState.isFalling() ? 8 : 0);
   }

   private static boolean hasSameAbove(final FluidState fluidState, final BlockGetter level, final BlockPos pos) {
      return fluidState.is(level.getFluidState(pos.above()).getType());
   }

   @Override
   public float getHeight(final FluidState fluidState, final BlockGetter level, final BlockPos pos) {
      return hasSameAbove(fluidState, level, pos) ? 1.0F : fluidState.getOwnHeight();
   }

   @Override
   public float getOwnHeight(final FluidState fluidState) {
      return fluidState.getAmount() / 9.0F;
   }

   @Override
   public int getAmount(final FluidState fluidState) {
      return fluidState.getValue(LEVEL);
   }

   @Override
   public VoxelShape getShape(final FluidState state, final BlockGetter level, final BlockPos pos) {
      return state.getAmount() == 9 && hasSameAbove(state, level, pos)
         ? Shapes.block()
         : this.shapes.computeIfAbsent(state, fluidState -> Shapes.box(0.0, 0.0, 0.0, 1.0, fluidState.getHeight(level, pos), 1.0));
   }

   private record BlockStatePairKey(BlockState first, BlockState second, Direction direction) {
      @Override
      public boolean equals(final Object o) {
         return o instanceof FlowingFluid.BlockStatePairKey that && this.first == that.first && this.second == that.second && this.direction == that.direction;
      }

      @Override
      public int hashCode() {
         int result = System.identityHashCode(this.first);
         result = 31 * result + System.identityHashCode(this.second);
         return 31 * result + this.direction.hashCode();
      }
   }

   protected class SpreadContext {
      private final BlockGetter level;
      private final BlockPos origin;
      private final Short2ObjectMap<BlockState> stateCache = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap holeCache = new Short2BooleanOpenHashMap();

      private SpreadContext(final BlockGetter level, final BlockPos origin) {
         this.level = level;
         this.origin = origin;
      }

      public BlockState getBlockState(final BlockPos pos) {
         return this.getBlockState(pos, this.getCacheKey(pos));
      }

      private BlockState getBlockState(final BlockPos pos, final short key) {
         return (BlockState)this.stateCache.computeIfAbsent(key, k -> this.level.getBlockState(pos));
      }

      public boolean isHole(final BlockPos pos) {
         return this.holeCache.computeIfAbsent(this.getCacheKey(pos), key -> {
            BlockState state = this.getBlockState(pos, key);
            BlockPos below = pos.below();
            BlockState belowState = this.level.getBlockState(below);
            return FlowingFluid.this.isWaterHole(this.level, pos, state, below, belowState);
         });
      }

      private short getCacheKey(final BlockPos pos) {
         int relativeX = pos.getX() - this.origin.getX();
         int relativeZ = pos.getZ() - this.origin.getZ();
         return (short)((relativeX + 128 & 0xFF) << 8 | relativeZ + 128 & 0xFF);
      }
   }
}
