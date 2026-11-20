package net.minecraft.world.level.levelgen.feature;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import org.jspecify.annotations.Nullable;

public record CrevasseFeature(
   int maxWidth,
   int maxLength,
   int minFootprint,
   int cursorSurfaceSearchRange,
   int columnSurfaceSearchRange,
   float twistiness,
   float tapering,
   float turnFactor,
   IntProvider carveDepth,
   IntProvider fillDepth,
   Holder<BlockStateProvider> surfaceBlock,
   Holder<BlockStateProvider> fillBlock,
   BlockPredicate carvableBlocks,
   BlockPredicate acceptableBarrier
) implements Feature {
   public static final MapCodec<CrevasseFeature> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            ExtraCodecs.intRange(2, 8).fieldOf("max_width").forGetter(CrevasseFeature::maxWidth),
            ExtraCodecs.intRange(4, 16).fieldOf("max_length").forGetter(CrevasseFeature::maxLength),
            ExtraCodecs.intRange(1, 32).fieldOf("min_footprint").forGetter(CrevasseFeature::minFootprint),
            ExtraCodecs.POSITIVE_INT.fieldOf("cursor_surface_search_range").forGetter(CrevasseFeature::cursorSurfaceSearchRange),
            ExtraCodecs.POSITIVE_INT.fieldOf("column_surface_search_range").forGetter(CrevasseFeature::columnSurfaceSearchRange),
            ExtraCodecs.floatRange(0.0F, 16.0F).fieldOf("twistiness").forGetter(CrevasseFeature::twistiness),
            ExtraCodecs.floatRange(0.0F, 1.0F).fieldOf("tapering").forGetter(CrevasseFeature::tapering),
            ExtraCodecs.floatRange(0.0F, 1.0F).fieldOf("turn_factor").forGetter(CrevasseFeature::turnFactor),
            IntProviders.POSITIVE_CODEC.fieldOf("carve_depth").forGetter(CrevasseFeature::carveDepth),
            IntProviders.POSITIVE_CODEC.fieldOf("fill_depth").forGetter(CrevasseFeature::fillDepth),
            BlockStateProvider.CODEC.fieldOf("surface_block").forGetter(CrevasseFeature::surfaceBlock),
            BlockStateProvider.CODEC.fieldOf("fill_block").forGetter(CrevasseFeature::fillBlock),
            BlockPredicate.CODEC.fieldOf("carvable_blocks").forGetter(CrevasseFeature::carvableBlocks),
            BlockPredicate.CODEC.fieldOf("acceptable_barrier").forGetter(CrevasseFeature::acceptableBarrier)
         )
         .apply(i, CrevasseFeature::new)
   );
   private static final int MAX_STEP_HEIGHT_DIFFERENCE = 1;

   @Override
   public MapCodec<CrevasseFeature> codec() {
      return CODEC;
   }

   private boolean wouldExposeSideLiquid(final WorldGenLevel region, final BlockPos pos) {
      for (Direction dir : Direction.Plane.HORIZONTAL) {
         if (!region.getFluidState(pos.relative(dir)).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private Optional<CrevasseFeature.Surface> findCarvableSurface(final WorldGenLevel region, final BlockPos centerPos, final int searchRange) {
      BlockPos pos = centerPos.above(searchRange / 2);
      boolean isBlockAboveEmpty = region.getBlockState(pos.above()).isAir();
      int minY = Math.max(region.getMinY(), pos.getY() - searchRange);
      BlockPos.MutableBlockPos blockPos = pos.mutable();

      while (blockPos.getY() >= minY) {
         BlockState block = region.getBlockState(blockPos);
         if (this.carvableBlocks.test(region, blockPos) && isBlockAboveEmpty) {
            return Optional.of(new CrevasseFeature.Surface(blockPos.immutable(), block));
         }

         isBlockAboveEmpty = block.isAir();
         blockPos.move(Direction.DOWN);
      }

      return Optional.empty();
   }

   private CrevasseFeature.@Nullable CarveColumn findColumn(final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns, final int x, final int z) {
      return (CrevasseFeature.CarveColumn)columns.getOrDefault(ChunkPos.pack(x, z), null);
   }

   private int getFillLevel(final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns, final int originSurfaceY, final int fillDepth) {
      CrevasseFeature.CarveColumn lowestColumn = columns.values().stream().min(Comparator.comparingInt(a -> a.surfacePos.getY())).get();
      return Math.min(originSurfaceY - fillDepth, lowestColumn.surfacePos.getY() - 1);
   }

   private boolean hasSteepNeighbor(final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns, final CrevasseFeature.CarveColumn column) {
      for (Direction facing : Direction.Plane.HORIZONTAL) {
         BlockPos neighborPos = column.surfacePos.relative(facing);
         CrevasseFeature.CarveColumn neighbor = this.findColumn(columns, neighborPos.getX(), neighborPos.getZ());
         if (neighbor != null && Math.abs(column.surfacePos.getY() - neighbor.surfacePos.getY()) > 1) {
            return true;
         }
      }

      return false;
   }

   private void removeDisconnectedColumns(final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns, final BlockPos originSurfacePos) {
      CrevasseFeature.CarveColumn originColumn = this.findColumn(columns, originSurfacePos.getX(), originSurfacePos.getZ());
      if (originColumn != null && !this.hasSteepNeighbor(columns, originColumn)) {
         List<CrevasseFeature.CarveColumn> connectedColumns = new ArrayList<>();
         LongSet processedColumns = new LongOpenHashSet();
         connectedColumns.add(originColumn);
         processedColumns.add(ChunkPos.pack(originSurfacePos.getX(), originSurfacePos.getZ()));

         for (int index = 0; index < connectedColumns.size(); index++) {
            CrevasseFeature.CarveColumn column = connectedColumns.get(index);

            for (Direction facing : Direction.Plane.HORIZONTAL) {
               BlockPos neighborPos = column.surfacePos().relative(facing);
               CrevasseFeature.CarveColumn neighbor = this.findColumn(columns, neighborPos.getX(), neighborPos.getZ());
               if (neighbor != null) {
                  long neighborIndex = ChunkPos.pack(neighborPos.getX(), neighborPos.getZ());
                  boolean wasProcessed = processedColumns.contains(neighborIndex);
                  if (!wasProcessed && !this.hasSteepNeighbor(columns, neighbor)) {
                     connectedColumns.add(neighbor);
                     processedColumns.add(neighborIndex);
                  }
               }
            }
         }

         columns.clear();

         for (CrevasseFeature.CarveColumn column : connectedColumns) {
            columns.put(ChunkPos.pack(column.surfacePos.getX(), column.surfacePos.getZ()), column);
         }
      } else {
         columns.clear();
      }
   }

   private void appendBranchColumns(
      final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns,
      final WorldGenLevel region,
      final BlockPos originSurfacePos,
      final int branchLength,
      final int carveDepth,
      float yaw,
      final RandomSource random
   ) {
      double cursorX = originSurfacePos.getX();
      double cursorZ = originSurfacePos.getZ();
      int previousSurfaceY = originSurfacePos.getY();
      float yawAcceleration = 0.0F;

      for (int step = 0; step < branchLength; step++) {
         cursorX += Math.cos(yaw);
         cursorZ += Math.sin(yaw);
         float turnDirection = (float)random.nextGaussian();
         float turnMagnitude = random.nextFloat();
         float var35 = yawAcceleration * 0.5F;
         yawAcceleration = var35 + turnDirection * turnMagnitude * this.twistiness;
         yaw += yawAcceleration * this.turnFactor;
         int blockX = Mth.floor(cursorX);
         int blockZ = Mth.floor(cursorZ);
         Optional<CrevasseFeature.Surface> surface = this.findCarvableSurface(
            region, new BlockPos(blockX, previousSurfaceY, blockZ), this.cursorSurfaceSearchRange
         );
         if (!surface.isEmpty()) {
            float progress = (float)step / branchLength;
            float taper = 1.0F - progress * this.tapering;
            float radius = Math.max(this.maxWidth * 0.5F * taper, 0.5F);
            float radiusSquared = Mth.square(radius);
            int maxDepth = Math.max((int)(carveDepth * taper), 1);
            int expandedRadius = Mth.ceil(radius);

            for (int x = blockX - expandedRadius; x <= blockX + expandedRadius; x++) {
               for (int z = blockZ - expandedRadius; z <= blockZ + expandedRadius; z++) {
                  int dx = x - blockX;
                  int dz = z - blockZ;
                  if (!(Mth.lengthSquared(dx, dz) > radiusSquared)) {
                     long columnIndex = ChunkPos.pack(x, z);
                     if (!columns.containsKey(columnIndex)) {
                        Optional<CrevasseFeature.Surface> columnSurface = this.findCarvableSurface(
                           region, new BlockPos(x, surface.get().pos.getY(), z), this.columnSurfaceSearchRange
                        );
                        if (!columnSurface.isEmpty()) {
                           int depth = 1;

                           for (BlockPos.MutableBlockPos testPos = columnSurface.get().pos.mutable().move(Direction.DOWN);
                              depth < maxDepth && this.carvableBlocks.test(region, testPos);
                              depth++
                           ) {
                              testPos.move(Direction.DOWN);
                           }

                           columns.put(columnIndex, new CrevasseFeature.CarveColumn(columnSurface.get().pos, columnSurface.get().block, depth - 1));
                        }
                     }
                  }
               }
            }

            previousSurfaceY = surface.get().pos.getY();
         }
      }
   }

   private void sealExternalSides(
      final WorldGenLevel region,
      final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns,
      final CrevasseFeature.CarveColumn column,
      final BlockPos pos,
      final Block placementBlock
   ) {
      for (Direction facing : Direction.Plane.HORIZONTAL) {
         BlockPos neighborPos = pos.relative(facing);
         if (!this.acceptableBarrier.test(region, neighborPos)) {
            CrevasseFeature.CarveColumn neighborColumn = this.findColumn(columns, neighborPos.getX(), neighborPos.getZ());
            if (neighborColumn == null || !neighborColumn.containsY(pos.getY())) {
               BlockState neighborBlock = region.getBlockState(neighborPos);
               if (!neighborBlock.is(placementBlock)) {
                  region.setBlock(neighborPos, column.originalSurfaceBlock, 2);
               }
            }
         }
      }
   }

   private void sealFilledBottom(final WorldGenLevel region, final CrevasseFeature.CarveColumn column, final BlockPos pos, final Block fillBlock) {
      BlockPos belowPos = pos.below();
      if (!this.acceptableBarrier.test(region, belowPos)) {
         BlockState belowBlock = region.getBlockState(belowPos);
         if (!belowBlock.is(fillBlock)) {
            region.setBlock(belowPos, column.originalSurfaceBlock, 2);
         }
      }
   }

   private void carveColumn(
      final WorldGenLevel region,
      final Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns,
      final CrevasseFeature.CarveColumn column,
      final int fillLevel,
      final RandomSource random
   ) {
      BlockState air = Blocks.AIR.defaultBlockState();
      int carveMinY = column.getBottomY();
      boolean carvedAnyBlock = false;
      BlockPos.MutableBlockPos carvePos = column.surfacePos.mutable();

      while (carvePos.getY() >= carveMinY) {
         BlockState fillBlock = this.fillBlock.value().getOptionalState(region, random, carvePos);
         boolean shouldFill = fillBlock != null && carvePos.getY() <= fillLevel;
         if (!shouldFill && this.wouldExposeSideLiquid(region, carvePos)) {
            break;
         }

         Block placementBlock = shouldFill ? fillBlock.getBlock() : air.getBlock();
         this.sealExternalSides(region, columns, column, carvePos, placementBlock);
         region.setBlock(carvePos, shouldFill ? fillBlock : air, 2);
         if (shouldFill && carvePos.getY() == carveMinY) {
            this.sealFilledBottom(region, column, carvePos, placementBlock);
         }

         carvedAnyBlock = true;
         carvePos.move(Direction.DOWN);
      }

      if (carvedAnyBlock) {
         BlockState blockState = this.surfaceBlock.value().getOptionalState(region, random, column.surfacePos);
         if (blockState != null) {
            region.setBlock(column.surfacePos, blockState, 2);
         }
      }
   }

   @Override
   public boolean place(final WorldGenLevel region, final ChunkGenerator chunkGenerator, final RandomSource random, final BlockPos pos) {
      int carveDepth = this.carveDepth.sample(random);
      if (pos.getY() <= region.getMinY() + carveDepth) {
         return false;
      }

      int branchLength = this.maxLength / 2;
      float yaw = random.nextFloat() * (float) (Math.PI * 2);
      int fillDepth = this.fillDepth.sample(random);
      Long2ObjectOpenHashMap<CrevasseFeature.CarveColumn> columns = new Long2ObjectOpenHashMap(50);

      for (int direction = 0; direction < 2; direction++) {
         this.appendBranchColumns(columns, region, pos, branchLength, carveDepth, yaw + direction * (float) Math.PI, random);
      }

      this.removeDisconnectedColumns(columns, pos);
      if (columns.size() < this.minFootprint) {
         return false;
      }

      int fillLevel = this.getFillLevel(columns, pos.getY(), fillDepth);

      for (CrevasseFeature.CarveColumn column : columns.values().stream().sorted(CrevasseFeature.CarveColumn::compareTo).toList()) {
         this.carveColumn(region, columns, column, fillLevel, random);
      }

      return true;
   }

   private record CarveColumn(BlockPos surfacePos, BlockState originalSurfaceBlock, int depth) implements Comparable<CrevasseFeature.CarveColumn> {
      public int getBottomY() {
         return this.surfacePos.getY() - this.depth;
      }

      public boolean containsY(final int y) {
         return y >= this.getBottomY() && y <= this.surfacePos.getY();
      }

      public int compareTo(final CrevasseFeature.CarveColumn other) {
         int xDiff = this.surfacePos.getX() - other.surfacePos.getX();
         return xDiff == 0 ? this.surfacePos.getZ() - other.surfacePos.getZ() : xDiff;
      }
   }

   private record Surface(BlockPos pos, BlockState block) {
   }
}
