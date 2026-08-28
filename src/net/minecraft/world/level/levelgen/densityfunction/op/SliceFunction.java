package net.minecraft.world.level.levelgen.densityfunction.op;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Direction;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;

public record SliceFunction(Direction.Axis axis, int coordinate, DensityFunction input) implements DensityFunction {
   public static final MapCodec<SliceFunction> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
               Direction.Axis.CODEC.fieldOf("axis").forGetter(SliceFunction::axis),
               Codec.INT.fieldOf("coordinate").forGetter(SliceFunction::coordinate),
               DensityFunction.CODEC.fieldOf("input").forGetter(SliceFunction::input)
            )
            .apply(i, SliceFunction::new)
   );

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      Throwable var18;
      label60: {
         if (this.input instanceof SliceFunction input) {
            SliceFunction var10000 = input;

            try {
               var19 = var10000.axis();
            } catch (Throwable var11) {
               var18 = var11;
               boolean var10001 = false;
               break label60;
            }

            Direction.Axis z = var19;
            SliceFunction var20 = input;

            try {
               var21 = var20.coordinate();
            } catch (Throwable var10) {
               var18 = var10;
               boolean var25 = false;
               break label60;
            }

            int var15 = var21;
            if (true) {
               SliceFunction var22 = input;

               try {
                  var23 = var22.input();
               } catch (Throwable var9) {
                  var18 = var9;
                  boolean var26 = false;
                  break label60;
               }

               DensityFunction var16 = var23;
               if (this.axis == Direction.Axis.X && z == Direction.Axis.Z || this.axis == Direction.Axis.Z && z == Direction.Axis.X) {
                  int x;
                  int zx;
                  if (this.axis == Direction.Axis.X) {
                     x = this.coordinate;
                     zx = var15;
                  } else {
                     x = var15;
                     zx = this.coordinate;
                  }

                  return new SliceFunction.XzSampler(var16.compileSampler(context), x, zx);
               }
            }
         }

         DensitySampler input = this.input.compileSampler(context);

         return (DensitySampler)(switch (this.axis) {
            case X -> new SliceFunction.XSampler(input, this.coordinate);
            case Y -> new SliceFunction.YSampler(input, this.coordinate);
            case Z -> new SliceFunction.ZSampler(input, this.coordinate);
         });
      }

      Throwable var13 = var18;
      throw new MatchException(var13.toString(), var13);
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      return input == this.input ? this : new SliceFunction(this.axis, this.coordinate, input);
   }

   @Override
   public Interval range() {
      return this.input.range();
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.input.domainAxes() & ~DensityFunction.axesFrom(this.axis);
   }

   @Override
   public MapCodec<SliceFunction> codec() {
      return CODEC;
   }

   public static record XSampler(DensitySampler input, int x) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeX() == 1 && volume.minBlockX() == this.x) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               1, volume.sizeY(), volume.sizeZ(), this.x, volume.minBlockY(), volume.minBlockZ(), volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);
               int index = 0;

               for (int z = 0; z < volume.sizeZ(); z++) {
                  for (int x = 0; x < volume.sizeX(); x++) {
                     for (int y = 0; y < volume.sizeY(); y++) {
                        outputBuffer.set(index, inputBuffer.get(inputVolume.indexUnchecked(0, y, z)));
                        index++;
                     }
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, this.x, blockY, blockZ);
      }
   }

   public static record XzSampler(DensitySampler input, int x, int z) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeX() == 1 && volume.sizeZ() == 1 && volume.minBlockX() == this.x && volume.minBlockZ() == this.z) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               1, volume.sizeY(), 1, this.x, volume.minBlockY(), this.z, volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);

               for (int y = 0; y < volume.sizeY(); y++) {
                  float input = inputBuffer.get(inputVolume.indexUnchecked(0, y, 0));
                  int index = volume.indexUnchecked(0, y, 0);

                  for (int z = 0; z < volume.sizeZ(); z++) {
                     for (int x = 0; x < volume.sizeX(); x++) {
                        outputBuffer.set(index, input);
                        index += volume.sizeY();
                     }
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, this.x, blockY, this.z);
      }
   }

   public static record YSampler(DensitySampler input, int y) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeY() == 1 && volume.minBlockY() == this.y) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               volume.sizeX(), 1, volume.sizeZ(), volume.minBlockX(), this.y, volume.minBlockZ(), volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);

               for (int z = 0; z < volume.sizeZ(); z++) {
                  for (int x = 0; x < volume.sizeX(); x++) {
                     float input = inputBuffer.get(inputVolume.indexUnchecked(x, 0, z));
                     outputBuffer.setRange(volume.indexUnchecked(x, 0, z), volume.sizeY(), input);
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, blockX, this.y, blockZ);
      }
   }

   public static record ZSampler(DensitySampler input, int z) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         if (volume.sizeZ() == 1 && volume.minBlockZ() == this.z) {
            this.input.sampleVolume(context, outputBuffer, volume);
         } else {
            DensityVolume inputVolume = new DensityVolume(
               volume.sizeX(), volume.sizeY(), 1, volume.minBlockX(), volume.minBlockY(), this.z, volume.stepBlockX(), volume.stepBlockY(), volume.stepBlockZ()
            );

            try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(inputVolume)) {
               this.input.sampleVolume(context, inputBuffer, inputVolume);
               int index = 0;

               for (int z = 0; z < volume.sizeZ(); z++) {
                  for (int x = 0; x < volume.sizeX(); x++) {
                     for (int y = 0; y < volume.sizeY(); y++) {
                        outputBuffer.set(index, inputBuffer.get(inputVolume.indexUnchecked(x, y, 0)));
                        index++;
                     }
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.input.sampleValue(context, blockX, blockY, this.z);
      }
   }
}
