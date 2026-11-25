package net.minecraft.world.level.levelgen.densityfunction.generator;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Direction;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunctions;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.TilingMode;

public record GradientFunction(
   Direction.Axis axis, TilingMode tiling, GradientFunction.Coordinate fromCoordinate, GradientFunction.Coordinate toCoordinate, float fromValue, float toValue
) implements DensityFunction {
   public static final MapCodec<GradientFunction> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(
               Direction.Axis.CODEC.fieldOf("axis").forGetter(GradientFunction::axis),
               TilingMode.CODEC.optionalFieldOf("tiling", TilingMode.CLAMP_TO_EDGE).forGetter(GradientFunction::tiling),
               GradientFunction.Coordinate.CODEC.fieldOf("from_coordinate").forGetter(GradientFunction::fromCoordinate),
               GradientFunction.Coordinate.CODEC.fieldOf("to_coordinate").forGetter(GradientFunction::toCoordinate),
               DensityFunctions.NOISE_VALUE_CODEC.fieldOf("from_value").forGetter(GradientFunction::fromValue),
               DensityFunctions.NOISE_VALUE_CODEC.fieldOf("to_value").forGetter(GradientFunction::toValue)
            )
            .apply(i, GradientFunction::new)
      )
      .validate(GradientFunction::validate);

   private static DataResult<GradientFunction> validate(final GradientFunction gradient) {
      if (gradient.fromCoordinate.equals(gradient.toCoordinate)) {
         return DataResult.error(() -> "from_coordinate cannot be equal to to_coordinate");
      } else {
         return gradient.axis == Direction.Axis.Y
               || gradient.fromCoordinate instanceof GradientFunction.Coordinate.Absolute
                  && gradient.toCoordinate instanceof GradientFunction.Coordinate.Absolute
            ? DataResult.success(gradient)
            : DataResult.error(() -> "Cannot use vertical anchor for " + gradient.axis + " axis");
      }
   }

   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      int fromCoordinate = this.fromCoordinate.resolve(context);
      int toCoordinate = this.toCoordinate.resolve(context);
      if (fromCoordinate == toCoordinate) {
         toCoordinate = fromCoordinate + 1;
      }

      int coordinateRange = toCoordinate - fromCoordinate;
      float coordinateFactor = (this.toValue - this.fromValue) / coordinateRange;

      return switch (this.tiling) {
         case CLAMP_TO_EDGE -> {
            int minCoordinate = Math.min(fromCoordinate, toCoordinate);
            int maxCoordinate = Math.max(fromCoordinate, toCoordinate);
            yield new GradientFunction.ClampedSampler(this.axis, fromCoordinate, minCoordinate, maxCoordinate, this.fromValue, coordinateFactor);
         }
         case REPEAT -> new GradientFunction.RepeatSampler(this.axis, fromCoordinate, coordinateRange, this.fromValue, coordinateFactor);
         case MIRRORED_REPEAT -> new GradientFunction.MirroredRepeatSampler(this.axis, fromCoordinate, coordinateRange, this.fromValue, coordinateFactor);
      };
   }

   @Override
   public Interval range() {
      return Interval.encapsulating(this.fromValue, this.toValue);
   }

   @Override
   public @DensityFunction.Axes int domainAxes() {
      return DensityFunction.axesFrom(this.axis);
   }

   @Override
   public MapCodec<GradientFunction> codec() {
      return CODEC;
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      return this;
   }

   private record ClampedSampler(Direction.Axis axis, int fromCoordinate, int minCoordinate, int maxCoordinate, float fromValue, float coordinateFactor)
      implements GradientFunction.GradientSampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         GradientFunction.GradientSampler.sampleVolume(this, outputBuffer, volume);
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.compute(this.axis.choose(blockX, blockY, blockZ));
      }

      @Override
      public float compute(final int coordinate) {
         int relativeCoordinate = Math.clamp(coordinate, this.minCoordinate, this.maxCoordinate) - this.fromCoordinate;
         return this.fromValue + relativeCoordinate * this.coordinateFactor;
      }
   }

   public sealed interface Coordinate permits GradientFunction.Coordinate.Absolute, GradientFunction.Coordinate.YAnchor {
      Codec<GradientFunction.Coordinate> CODEC = Codec.either(GradientFunction.Coordinate.Absolute.CODEC, GradientFunction.Coordinate.YAnchor.CODEC)
         .xmap(Either::unwrap, coordinate -> {
            return switch (coordinate) {
               case GradientFunction.Coordinate.Absolute absolute -> Either.left(absolute);
               case GradientFunction.Coordinate.YAnchor yAnchor -> Either.right(yAnchor);
               default -> throw new MatchException(null, null);
            };
         });

      int resolve(DensityFunction.CompileContext context);

      record Absolute(int coordinate) implements GradientFunction.Coordinate {
         public static final Codec<GradientFunction.Coordinate.Absolute> CODEC = Codec.INT
            .xmap(GradientFunction.Coordinate.Absolute::new, GradientFunction.Coordinate.Absolute::coordinate);

         @Override
         public int resolve(final DensityFunction.CompileContext context) {
            return this.coordinate;
         }
      }

      record YAnchor(VerticalAnchor anchor) implements GradientFunction.Coordinate {
         public static final Codec<GradientFunction.Coordinate.YAnchor> CODEC = VerticalAnchor.CODEC
            .xmap(GradientFunction.Coordinate.YAnchor::new, GradientFunction.Coordinate.YAnchor::anchor);

         @Override
         public int resolve(final DensityFunction.CompileContext context) {
            return this.anchor.resolveY(context.verticalAnchors());
         }
      }
   }

   private interface GradientSampler extends DensitySampler {
      static void sampleVolume(final GradientFunction.GradientSampler sampler, final DensityBuffer output, final DensityVolume volume) {
         switch (sampler.axis()) {
            case X:
               int stride = volume.strideX();

               for (int x = 0; x < volume.sizeX(); x++) {
                  float value = sampler.compute(volume.blockX(x));
                  output.setRange(volume.indexUnchecked(x, 0, 0), stride, value);
               }
               break;
            case Y:
               for (int y = 0; y < volume.sizeY(); y++) {
                  float value = sampler.compute(volume.blockY(y));

                  for (int x = 0; x < volume.sizeX(); x++) {
                     for (int z = 0; z < volume.sizeZ(); z++) {
                        output.set(volume.indexUnchecked(x, y, z), value);
                     }
                  }
               }
               break;
            case Z:
               for (int z = 0; z < volume.sizeZ(); z++) {
                  float value = sampler.compute(volume.blockZ(z));

                  for (int x = 0; x < volume.sizeX(); x++) {
                     output.setRange(volume.indexUnchecked(x, 0, z), volume.strideZ(), value);
                  }
               }
         }
      }

      Direction.Axis axis();

      float compute(int coordinate);
   }

   private record MirroredRepeatSampler(Direction.Axis axis, int fromCoordinate, int coordinateRange, float fromValue, float coordinateFactor)
      implements GradientFunction.GradientSampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         GradientFunction.GradientSampler.sampleVolume(this, outputBuffer, volume);
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.compute(this.axis.choose(blockX, blockY, blockZ));
      }

      @Override
      public float compute(final int coordinate) {
         int relativeCoordinate = coordinate - this.fromCoordinate;
         int tileIndex = Math.floorDiv(relativeCoordinate, this.coordinateRange);
         int localCoordinate = relativeCoordinate - tileIndex * this.coordinateRange;
         return (tileIndex & 1) == 0
            ? this.fromValue + localCoordinate * this.coordinateFactor
            : this.fromValue + (this.coordinateRange - localCoordinate) * this.coordinateFactor;
      }
   }

   private record RepeatSampler(Direction.Axis axis, int fromCoordinate, int coordinateRange, float fromValue, float coordinateFactor)
      implements GradientFunction.GradientSampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         GradientFunction.GradientSampler.sampleVolume(this, outputBuffer, volume);
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.compute(this.axis.choose(blockX, blockY, blockZ));
      }

      @Override
      public float compute(final int coordinate) {
         int relativeCoordinate = coordinate - this.fromCoordinate;
         return this.fromValue + Math.floorMod(relativeCoordinate, this.coordinateRange) * this.coordinateFactor;
      }
   }
}
