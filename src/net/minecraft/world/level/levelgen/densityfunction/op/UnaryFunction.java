package net.minecraft.world.level.levelgen.densityfunction.op;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Interval;
import net.minecraft.util.Mth;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;

public record UnaryFunction(UnaryFunction.Type type, DensityFunction input) implements DensityFunction {
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      DensitySampler input = this.input.compileSampler(context);

      return (DensitySampler)(switch (this.type) {
         case ABS -> new UnaryFunction.AbsSampler(input);
         case SQUARE -> new UnaryFunction.SquareSampler(input);
         case CUBE -> new UnaryFunction.CubeSampler(input);
         case SQRT -> new UnaryFunction.SqrtSampler(input);
         case HALF_NEGATIVE -> new UnaryFunction.LeakyReLUSampler(input, 0.5F);
         case QUARTER_NEGATIVE -> new UnaryFunction.LeakyReLUSampler(input, 0.25F);
         case RECIPROCAL -> new UnaryFunction.ReciprocalSampler(input);
         case NEGATE -> new UnaryFunction.NegateSampler(input);
         case SQUEEZE -> new UnaryFunction.SqueezeSampler(input);
         case LOG -> new UnaryFunction.LogSampler(input);
         case SIGN -> new UnaryFunction.SignSampler(input);
      });
   }

   public UnaryFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      return input == this.input ? this : new UnaryFunction(this.type, input);
   }

   @Override
   public MapCodec<UnaryFunction> codec() {
      return this.type.codec;
   }

   @Override
   public Interval range() {
      Interval input = this.input.range();

      return switch (this.type) {
         case ABS -> Interval.abs(input);
         case SQUARE -> Interval.square(input);
         case CUBE -> Interval.mapMonotonic(input, Mth::cube);
         case SQRT -> Interval.pow(input, Interval.ofExact(0.5F));
         case HALF_NEGATIVE -> Interval.mapMonotonic(input, value -> UnaryFunction.LeakyReLUSampler.apply(0.5F, value));
         case QUARTER_NEGATIVE -> Interval.mapMonotonic(input, value -> UnaryFunction.LeakyReLUSampler.apply(0.25F, value));
         case RECIPROCAL -> Interval.reciprocal(input);
         case NEGATE -> Interval.sub(Interval.ofExact(0.0F), input);
         case SQUEEZE -> Interval.mapMonotonic(input, UnaryFunction.SqueezeSampler::apply);
         case LOG -> Interval.log(input);
         case SIGN -> Interval.sign(input);
      };
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.input.domainAxes();
   }

   public static record AbsSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, Math.abs(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Math.abs(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record CubeSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, Mth.cube(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Mth.cube(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record LeakyReLUSampler(DensitySampler input, float negativeFactor) implements DensitySampler {
      private static float apply(final float negativeFactor, final float input) {
         return input > 0.0F ? input : input * negativeFactor;
      }

      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, apply(this.negativeFactor, outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return apply(this.negativeFactor, this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record LogSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, (float)Math.log((double)outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return (float)Math.log((double)this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record NegateSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, -outputBuffer.get(i));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return -this.input.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record ReciprocalSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, 1.0F / outputBuffer.get(i));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return 1.0F / this.input.sampleValue(context, blockX, blockY, blockZ);
      }
   }

   public static record SignSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, Math.signum(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Math.signum(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record SqrtSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, Mth.sqrt(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Mth.sqrt(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record SquareSampler(DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, Mth.square(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return Mth.square(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static record SqueezeSampler(DensitySampler input) implements DensitySampler {
      private static float apply(final float input) {
         float clampedInput = Mth.clamp(input, -1.0F, 1.0F);
         return clampedInput / 2.0F - Mth.cube(clampedInput) / 24.0F;
      }

      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, apply(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return apply(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   public static enum Type {
      ABS("abs"),
      SQUARE("square"),
      CUBE("cube"),
      SQRT("sqrt"),
      HALF_NEGATIVE("half_negative"),
      QUARTER_NEGATIVE("quarter_negative"),
      RECIPROCAL("reciprocal"),
      NEGATE("negate"),
      SQUEEZE("squeeze"),
      LOG("log"),
      SIGN("sign");

      public final String id;
      public final MapCodec<UnaryFunction> codec = RecordCodecBuilder.mapCodec(
         i -> i.group(DensityFunction.CODEC.fieldOf("input").forGetter(UnaryFunction::input)).apply(i, input -> new UnaryFunction(this, input))
      );

      private Type(final String id) {
         this.id = id;
      }
   }
}
