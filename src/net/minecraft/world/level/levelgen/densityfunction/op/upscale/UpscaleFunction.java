package net.minecraft.world.level.levelgen.densityfunction.op.upscale;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.Interval;
import net.minecraft.util.Mth;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;
import org.jspecify.annotations.Nullable;

public record UpscaleFunction(DensityFunction input, UpscaleFunction.Axis x, UpscaleFunction.Axis y, UpscaleFunction.Axis z) implements DensityFunction {
   public static final MapCodec<UpscaleFunction> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            DensityFunction.CODEC.fieldOf("input").forGetter(UpscaleFunction::input),
            UpscaleFunction.Axis.CODEC.fieldOf("x").forGetter(UpscaleFunction::x),
            UpscaleFunction.Axis.CODEC.fieldOf("y").forGetter(UpscaleFunction::y),
            UpscaleFunction.Axis.CODEC.fieldOf("z").forGetter(UpscaleFunction::z)
         )
         .apply(i, UpscaleFunction::new)
   );

   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      DensitySampler input = this.input.compileSampler(context);
      if (this.x.mode == UpscaleFunction.Mode.NEAREST_NEIGHBOR
         && this.y.mode == UpscaleFunction.Mode.NEAREST_NEIGHBOR
         && this.z.mode == UpscaleFunction.Mode.NEAREST_NEIGHBOR) {
         return new UpscaleFunction.NearestNeighborSampler(input, this.x.cellSize, this.y.cellSize, this.z.cellSize);
      }

      Upscaler valueUpscaler = context.upscalerCache().getOrCreate(this.x.mode, this.y.mode, this.z.mode, this.x.cellSize, this.y.cellSize, this.z.cellSize);
      return new UpscaleFunction.Sampler(input, valueUpscaler, this.x, this.y, this.z, context.upscalerCache());
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      return input == this.input ? this : new UpscaleFunction(input, this.x, this.y, this.z);
   }

   @Override
   public Interval range() {
      Interval range = this.input.range();
      range = this.z.modifyRange(range);
      range = this.x.modifyRange(range);
      return this.y.modifyRange(range);
   }

   @Override
   public @DensityFunction.Axes int domainAxes() {
      return this.input.domainAxes();
   }

   @Override
   public MapCodec<UpscaleFunction> codec() {
      return CODEC;
   }

   public record Axis(UpscaleFunction.Mode mode, int cellSize) {
      public static final Codec<UpscaleFunction.Axis> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               UpscaleFunction.Mode.CODEC.fieldOf("mode").forGetter(UpscaleFunction.Axis::mode),
               ExtraCodecs.intRange(1, 64).fieldOf("cell_size").forGetter(UpscaleFunction.Axis::cellSize)
            )
            .apply(i, UpscaleFunction.Axis::new)
      );

      @VisibleForTesting
      Upscaler.@Nullable AxisPlan planUpsample(final int outputMinBlock, final int outputSize, int outputStepBlocks) {
         if (outputSize == 1) {
            outputStepBlocks = this.cellSize;
         }

         int outputMaxBlock = outputMinBlock + (outputSize - 1) * outputStepBlocks;
         boolean minVertexAligned = Mth.isMultipleOf(outputMinBlock, this.cellSize);
         boolean maxVertexAligned = Mth.isMultipleOf(outputMaxBlock, this.cellSize);
         boolean cellDividesOutput = Mth.isMultipleOf(outputStepBlocks, this.cellSize);
         if (cellDividesOutput && minVertexAligned && this.mode.exactValueOnVertex) {
            return Upscaler.AxisPlan.exactlyAligned(outputMinBlock, outputSize, outputStepBlocks);
         }

         boolean outputDividesCell = Mth.isMultipleOf(this.cellSize, outputStepBlocks);
         if (!outputDividesCell) {
            return null;
         }

         int minCell = Mth.floorDiv(outputMinBlock, this.cellSize);
         int maxCell = Mth.floorDiv(outputMaxBlock, this.cellSize);
         int minSampleCell = minCell - this.mode.samplesBefore;
         int maxSampleCell = maxCell + Math.max(this.mode.samplesAfter - (this.mode.exactValueOnVertex && maxVertexAligned ? 1 : 0), 0);
         int minCellBlockRelative = minCell * this.cellSize - outputMinBlock;
         int minCellOutput;
         int cellSizeOutput;
         if (outputStepBlocks != 1 && outputSize != 1) {
            if (!Mth.isMultipleOf(minCellBlockRelative, outputStepBlocks)) {
               return null;
            }

            minCellOutput = minCellBlockRelative / outputStepBlocks;
            cellSizeOutput = this.cellSize / outputStepBlocks;
         } else {
            minCellOutput = minCellBlockRelative;
            cellSizeOutput = this.cellSize;
         }

         return new Upscaler.AxisPlan(
            this.mode,
            false,
            maxSampleCell - minSampleCell + 1,
            minSampleCell * this.cellSize,
            this.cellSize,
            maxCell - minCell + 1,
            minCellOutput,
            cellSizeOutput
         );
      }

      public Interval modifyRange(final Interval inputRange) {
         return Upscaler.Coefficients.modifyRange(inputRange, this.cellSize, this.mode);
      }
   }

   public enum Mode implements StringRepresentable {
      NEAREST_NEIGHBOR("nearest_neighbor", 0, 0, true),
      INTERPOLATE_LINEAR("interpolate_linear", 0, 1, true),
      INTERPOLATE_COSINE("interpolate_cosine", 0, 1, true),
      INTERPOLATE_CUBIC("interpolate_cubic", 1, 2, true),
      B_SPLINE_CUBIC("b_spline_cubic", 1, 2, false);

      public static final Codec<UpscaleFunction.Mode> CODEC = StringRepresentable.fromEnum(UpscaleFunction.Mode::values);
      private final String name;
      private final int samplesBefore;
      private final int samplesAfter;
      private final boolean exactValueOnVertex;

      Mode(final String name, final int samplesBefore, final int samplesAfter, final boolean exactValueOnVertex) {
         this.name = name;
         this.samplesBefore = samplesBefore;
         this.samplesAfter = samplesAfter;
         this.exactValueOnVertex = exactValueOnVertex;
      }

      public int sampleCount() {
         return this.samplesBefore + 1 + this.samplesAfter;
      }

      @Override
      public String getSerializedName() {
         return this.name;
      }
   }

   public record NearestNeighborSampler(DensitySampler input, int cellSizeX, int cellSizeY, int cellSizeZ) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.fitsOnGrid(this.cellSizeX, this.cellSizeY, this.cellSizeZ)) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume cellVolume = this.getCellSampleVolume(volume);

            try (ScopedDensityBuffer cellBuffer = context.acquireBuffer(cellVolume)) {
               this.input.sampleVolume(context, cellBuffer, cellVolume);
               Zone var6 = TracyClient.beginZone("upscale", false);

               try {
                  this.upscale(outputBuffer, volume, cellVolume, cellBuffer);
               } catch (Throwable var11) {
                  if (var6 != null) {
                     try {
                        var6.close();
                     } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                     }
                  }

                  throw var11;
               }

               if (var6 != null) {
                  var6.close();
               }
            }
         }
      }

      private DensityVolume getCellSampleVolume(final DensityVolume volume) {
         int minCellX = Mth.floorDiv(volume.minBlockX(), this.cellSizeX);
         int minCellY = Mth.floorDiv(volume.minBlockY(), this.cellSizeY);
         int minCellZ = Mth.floorDiv(volume.minBlockZ(), this.cellSizeZ);
         int maxCellX = Mth.floorDiv(volume.maxBlockX(), this.cellSizeX);
         int maxCellY = Mth.floorDiv(volume.maxBlockY(), this.cellSizeY);
         int maxCellZ = Mth.floorDiv(volume.maxBlockZ(), this.cellSizeZ);
         return new DensityVolume(
            maxCellX - minCellX + 1,
            maxCellY - minCellY + 1,
            maxCellZ - minCellZ + 1,
            minCellX * this.cellSizeX,
            minCellY * this.cellSizeY,
            minCellZ * this.cellSizeZ,
            this.cellSizeX,
            this.cellSizeY,
            this.cellSizeZ
         );
      }

      private void upscale(final DensityBuffer outputBuffer, final DensityVolume volume, final DensityVolume cellVolume, final ScopedDensityBuffer cellBuffer) {
         int firstXInCell = Math.floorMod(volume.minBlockX(), this.cellSizeX);
         int firstYInCell = Math.floorMod(volume.minBlockY(), this.cellSizeY);
         int firstZInCell = Math.floorMod(volume.minBlockZ(), this.cellSizeZ);
         int index = 0;
         int cellX = 0;
         int xInCell = firstXInCell;

         for (int x = 0; x < volume.sizeX(); x++) {
            int cellZ = 0;
            int zInCell = firstZInCell;

            for (int z = 0; z < volume.sizeZ(); z++) {
               int yInCell = firstYInCell;
               int cellIndex = cellVolume.indexUnchecked(cellX, 0, cellZ);
               float cellValue = cellBuffer.get(cellIndex);

               for (int y = 0; y < volume.sizeY(); y++) {
                  if (yInCell >= this.cellSizeY) {
                     int step = yInCell / this.cellSizeY;
                     cellIndex += step;
                     yInCell -= step * this.cellSizeY;
                     cellValue = cellBuffer.get(cellIndex);
                  }

                  outputBuffer.set(index++, cellValue);
                  yInCell += volume.stepBlockY();
               }

               zInCell += volume.stepBlockZ();
               if (zInCell >= this.cellSizeZ) {
                  int step = zInCell / this.cellSizeZ;
                  cellZ += step;
                  zInCell -= step * this.cellSizeZ;
               }
            }

            xInCell += volume.stepBlockX();
            if (xInCell >= this.cellSizeX) {
               int step = xInCell / this.cellSizeX;
               cellX += step;
               xInCell -= step * this.cellSizeX;
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         int cellX = Mth.floorDiv(blockX, this.cellSizeX);
         int cellY = Mth.floorDiv(blockY, this.cellSizeY);
         int cellZ = Mth.floorDiv(blockZ, this.cellSizeZ);
         return this.input.sampleValue(context, cellX * this.cellSizeX, cellY * this.cellSizeY, cellZ * this.cellSizeZ);
      }
   }

   private record Sampler(
      DensitySampler input, Upscaler valueUpscaler, UpscaleFunction.Axis x, UpscaleFunction.Axis y, UpscaleFunction.Axis z, Upscaler.Cache upscalerCache
   ) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         Upscaler.AxisPlan x = this.x.planUpsample(volume.minBlockX(), volume.sizeX(), volume.stepBlockX());
         Upscaler.AxisPlan y = this.y.planUpsample(volume.minBlockY(), volume.sizeY(), volume.stepBlockY());
         Upscaler.AxisPlan z = this.z.planUpsample(volume.minBlockZ(), volume.sizeZ(), volume.stepBlockZ());
         if (x != null && y != null && z != null) {
            this.sampleAndUpscale(context, outputBuffer, volume, x, y, z);
         } else {
            Zone var7 = TracyClient.beginZone("upscaleFallback", false);

            try {
               this.sampleAndUpscaleFallback(context, outputBuffer, volume);
            } catch (Throwable var11) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }
               }

               throw var11;
            }

            if (var7 != null) {
               var7.close();
            }
         }
      }

      private void sampleAndUpscaleFallback(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         DensityVolume blockVolume = new DensityVolume(
            (volume.sizeX() - 1) * volume.stepBlockX() + 1,
            (volume.sizeY() - 1) * volume.stepBlockY() + 1,
            (volume.sizeZ() - 1) * volume.stepBlockZ() + 1,
            volume.minBlockX(),
            volume.minBlockY(),
            volume.minBlockZ(),
            1,
            1,
            1
         );

         try (ScopedDensityBuffer blockBuffer = context.acquireBuffer(blockVolume)) {
            this.sampleAndUpscale(
               context,
               blockBuffer,
               blockVolume,
               Objects.requireNonNull(this.x.planUpsample(blockVolume.minBlockX(), blockVolume.sizeX(), 1)),
               Objects.requireNonNull(this.y.planUpsample(blockVolume.minBlockY(), blockVolume.sizeY(), 1)),
               Objects.requireNonNull(this.z.planUpsample(blockVolume.minBlockZ(), blockVolume.sizeZ(), 1))
            );

            for (int x = 0; x < volume.sizeX(); x++) {
               for (int z = 0; z < volume.sizeZ(); z++) {
                  for (int y = 0; y < volume.sizeY(); y++) {
                     float value = blockBuffer.get(blockVolume.indexUnchecked(x * volume.stepBlockX(), y * volume.stepBlockY(), z * volume.stepBlockZ()));
                     outputBuffer.set(volume.indexUnchecked(x, y, z), value);
                  }
               }
            }
         }
      }

      private void sampleAndUpscale(
         final SamplerContext context,
         final DensityBuffer outputBuffer,
         final DensityVolume volume,
         final Upscaler.AxisPlan x,
         final Upscaler.AxisPlan y,
         final Upscaler.AxisPlan z
      ) {
         if (x.exactlyAligned() && y.exactlyAligned() && z.exactlyAligned()) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume cellVolume = new DensityVolume(
               x.cellSampleCount(),
               y.cellSampleCount(),
               z.cellSampleCount(),
               x.cellSampleMinBlock(),
               y.cellSampleMinBlock(),
               z.cellSampleMinBlock(),
               x.cellSampleStep(),
               y.cellSampleStep(),
               z.cellSampleStep()
            );

            try (ScopedDensityBuffer cellBuffer = context.acquireBuffer(cellVolume)) {
               this.input.sampleVolume(context, cellBuffer, cellVolume);
               Zone var9 = TracyClient.beginZone("upscale", false);

               try {
                  Upscaler.upscale(this.upscalerCache, x, y, z, outputBuffer, volume, cellBuffer, cellVolume);
               } catch (Throwable var14) {
                  if (var9 != null) {
                     try {
                        var9.close();
                     } catch (Throwable var13) {
                        var14.addSuppressed(var13);
                     }
                  }

                  throw var14;
               }

               if (var9 != null) {
                  var9.close();
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         int xInCell = Math.floorMod(blockX, this.x.cellSize);
         int yInCell = Math.floorMod(blockY, this.y.cellSize);
         int zInCell = Math.floorMod(blockZ, this.z.cellSize);
         if (xInCell == 0 && this.x.mode.exactValueOnVertex && yInCell == 0 && this.y.mode.exactValueOnVertex && zInCell == 0 && this.z.mode.exactValueOnVertex
            )
          {
            return this.input.sampleValue(context, blockX, blockY, blockZ);
         }

         DensityVolume volume = new DensityVolume(
            this.x.mode.sampleCount(),
            this.y.mode.sampleCount(),
            this.z.mode.sampleCount(),
            blockX - xInCell - this.x.mode.samplesBefore * this.x.cellSize,
            blockY - yInCell - this.y.mode.samplesBefore * this.y.cellSize,
            blockZ - zInCell - this.z.mode.samplesBefore * this.z.cellSize,
            this.x.cellSize,
            this.y.cellSize,
            this.z.cellSize
         );

         try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(volume)) {
            this.input.sampleVolume(context, inputBuffer, volume);
            return this.valueUpscaler.upscaleValue(xInCell, yInCell, zInCell, inputBuffer);
         }
      }
   }
}
