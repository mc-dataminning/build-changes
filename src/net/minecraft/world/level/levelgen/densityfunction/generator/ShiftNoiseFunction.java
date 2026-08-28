package net.minecraft.world.level.levelgen.densityfunction.generator;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import net.minecraft.core.Holder;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.op.BinaryFunction;
import net.minecraft.world.level.levelgen.synth.Noise;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

public interface ShiftNoiseFunction extends DensityFunction {
   double COORDINATE_FACTOR = 0.25;
   float VALUE_FACTOR = 4.0F;

   Holder<NormalNoise> offsetNoise();

   @Override
   default Interval range() {
      return Interval.mul(this.offsetNoise().value().range(), Interval.ofExact(4.0F));
   }

   @Override
   MapCodec<? extends ShiftNoiseFunction> codec();

   public static record Shift(Holder<NormalNoise> offsetNoise) implements ShiftNoiseFunction {
      public static final MapCodec<ShiftNoiseFunction.Shift> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(NormalNoise.CODEC.fieldOf("noise").forGetter(ShiftNoiseFunction.Shift::offsetNoise)).apply(i, ShiftNoiseFunction.Shift::new)
      );

      @Override
      public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
         Noise noise = context.createNoiseSampler(this.offsetNoise);
         return new BinaryFunction.ConstMulSampler(new NoiseFunction.Sampler(noise, 0.25, 0.25), 4.0F);
      }

      @Override
      public DensityFunction rewriteChildren(final DfRewriteRule rule) {
         return new ShiftNoiseFunction.Shift(this.offsetNoise);
      }

      @DensityFunction.Axes
      @Override
      public int domainAxes() {
         return 7;
      }

      @Override
      public MapCodec<ShiftNoiseFunction.Shift> codec() {
         return CODEC;
      }
   }

   public static record ShiftA(Holder<NormalNoise> offsetNoise) implements ShiftNoiseFunction {
      public static final MapCodec<ShiftNoiseFunction.ShiftA> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(NormalNoise.CODEC.fieldOf("noise").forGetter(ShiftNoiseFunction.ShiftA::offsetNoise)).apply(i, ShiftNoiseFunction.ShiftA::new)
      );

      @Override
      public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
         Noise noise = context.createNoiseSampler(this.offsetNoise);
         return new BinaryFunction.ConstMulSampler(new NoiseFunction.Sampler(noise, 0.25, 0.0), 4.0F);
      }

      @Override
      public DensityFunction rewriteChildren(final DfRewriteRule rule) {
         return new ShiftNoiseFunction.ShiftA(this.offsetNoise);
      }

      @DensityFunction.Axes
      @Override
      public int domainAxes() {
         return 5;
      }

      @Override
      public MapCodec<ShiftNoiseFunction.ShiftA> codec() {
         return CODEC;
      }
   }

   public static record ShiftB(Holder<NormalNoise> offsetNoise) implements ShiftNoiseFunction {
      public static final MapCodec<ShiftNoiseFunction.ShiftB> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(NormalNoise.CODEC.fieldOf("noise").forGetter(ShiftNoiseFunction.ShiftB::offsetNoise)).apply(i, ShiftNoiseFunction.ShiftB::new)
      );

      @Override
      public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
         final Noise noise = context.createNoiseSampler(this.offsetNoise);
         return new DensitySampler() {
            {
               Objects.requireNonNull(ShiftB.this);
            }

            @Override
            public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
               DensityVolume transposedVolume = new DensityVolume(
                  volume.sizeZ(), volume.sizeX(), 1, volume.minBlockZ(), volume.minBlockX(), 0, volume.stepBlockZ(), volume.stepBlockX(), 1
               );

               try (ScopedDensityBuffer transposedBuffer = context.acquireBuffer(transposedVolume)) {
                  transposedBuffer.fill(0.0F);
                  noise.addToVolume(transposedBuffer, transposedVolume, 0.25, 0.25, 4.0F);

                  for (int z = 0; z < volume.sizeZ(); z++) {
                     for (int x = 0; x < volume.sizeX(); x++) {
                        float value = transposedBuffer.get(transposedVolume.indexUnchecked(z, x, 0));
                        outputBuffer.setRange(volume.indexUnchecked(x, 0, z), volume.sizeY(), value);
                     }
                  }
               }
            }

            @Override
            public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
               return noise.get((double)blockZ * 0.25, (double)blockX * 0.25, 0.0) * 4.0F;
            }
         };
      }

      @Override
      public DensityFunction rewriteChildren(final DfRewriteRule rule) {
         return new ShiftNoiseFunction.ShiftB(this.offsetNoise);
      }

      @DensityFunction.Axes
      @Override
      public int domainAxes() {
         return 5;
      }

      @Override
      public MapCodec<ShiftNoiseFunction.ShiftB> codec() {
         return CODEC;
      }
   }
}
