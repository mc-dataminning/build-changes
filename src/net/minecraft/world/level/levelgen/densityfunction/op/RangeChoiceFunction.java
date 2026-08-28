package net.minecraft.world.level.levelgen.densityfunction.op;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Interval;
import net.minecraft.world.level.levelgen.densityfunction.DensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunctions;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.DensityVolume;
import net.minecraft.world.level.levelgen.densityfunction.DfRewriteRule;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.generator.ConstantFunction;

public record RangeChoiceFunction(DensityFunction input, float minInclusive, float maxExclusive, DensityFunction whenInRange, DensityFunction whenOutOfRange)
   implements DensityFunction {
   public static final MapCodec<RangeChoiceFunction> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
               DensityFunction.CODEC.fieldOf("input").forGetter(RangeChoiceFunction::input),
               DensityFunctions.NOISE_VALUE_CODEC.fieldOf("min_inclusive").forGetter(RangeChoiceFunction::minInclusive),
               DensityFunctions.NOISE_VALUE_CODEC.fieldOf("max_exclusive").forGetter(RangeChoiceFunction::maxExclusive),
               DensityFunction.CODEC.fieldOf("when_in_range").forGetter(RangeChoiceFunction::whenInRange),
               DensityFunction.CODEC.fieldOf("when_out_of_range").forGetter(RangeChoiceFunction::whenOutOfRange)
            )
            .apply(i, RangeChoiceFunction::new)
   );

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      DensitySampler input = this.input.compileSampler(context);
      if (this.whenInRange instanceof ConstantFunction var3) {
         ConstantFunction var10000 = var3;

         float var8;
         label36: {
            label41: {
               try {
                  var16 = var10000.value();
               } catch (Throwable var11) {
                  var15 = var11;
                  boolean var10001 = false;
                  break label41;
               }

               var8 = var16;
               if (false || !(this.whenOutOfRange instanceof ConstantFunction var5)) {
                  return new RangeChoiceFunction.Sampler(
                     input, this.minInclusive, this.maxExclusive, this.whenInRange.compileSampler(context), this.whenOutOfRange.compileSampler(context)
                  );
               }

               var10000 = var5;

               try {
                  var18 = var10000.value();
                  break label36;
               } catch (Throwable var10) {
                  var15 = var10;
                  boolean var19 = false;
               }
            }

            Throwable var12 = var15;
            throw new MatchException(var12.toString(), var12);
         }

         var8 = var18;
         if (true) {
            return new RangeChoiceFunction.ConstSampler(input, this.minInclusive, this.maxExclusive, var8, var8);
         }
      }

      return new RangeChoiceFunction.Sampler(
         input, this.minInclusive, this.maxExclusive, this.whenInRange.compileSampler(context), this.whenOutOfRange.compileSampler(context)
      );
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      DensityFunction whenInRange = rule.rewrite(this.whenInRange);
      DensityFunction whenOutOfRange = rule.rewrite(this.whenOutOfRange);
      return input == this.input && whenInRange == this.whenInRange && whenOutOfRange == this.whenOutOfRange
         ? this
         : new RangeChoiceFunction(input, this.minInclusive, this.maxExclusive, whenInRange, whenOutOfRange);
   }

   @Override
   public Interval range() {
      return Interval.encapsulating(this.whenInRange.range(), this.whenOutOfRange.range());
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.input.domainAxes() | this.whenInRange.domainAxes() | this.whenOutOfRange.domainAxes();
   }

   @Override
   public MapCodec<RangeChoiceFunction> codec() {
      return CODEC;
   }

   private static record ConstSampler(DensitySampler input, float minInclusive, float maxExclusive, float whenInRange, float whenOutOfRange)
      implements DensitySampler {
      private float choose(final float input) {
         return input >= this.minInclusive && input < this.maxExclusive ? this.whenInRange : this.whenOutOfRange;
      }

      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, this.choose(outputBuffer.get(i)));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         return this.choose(this.input.sampleValue(context, blockX, blockY, blockZ));
      }
   }

   private static record Sampler(DensitySampler input, float minInclusive, float maxExclusive, DensitySampler whenInRange, DensitySampler whenOutOfRange)
      implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.whenInRange.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer inputBuffer = context.acquireBuffer(volume)) {
            this.input.sampleVolume(context, inputBuffer, volume);

            try (ScopedDensityBuffer whenOutOfRangeBuffer = context.acquireBuffer(volume)) {
               this.whenOutOfRange.sampleVolume(context, whenOutOfRangeBuffer, volume);

               for (int i = 0; i < outputBuffer.size(); i++) {
                  float input = inputBuffer.get(i);
                  if (!(input >= this.minInclusive) || !(input < this.maxExclusive)) {
                     outputBuffer.set(i, whenOutOfRangeBuffer.get(i));
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float inputValue = this.input.sampleValue(context, blockX, blockY, blockZ);
         return inputValue >= this.minInclusive && inputValue < this.maxExclusive
            ? this.whenInRange.sampleValue(context, blockX, blockY, blockZ)
            : this.whenOutOfRange.sampleValue(context, blockX, blockY, blockZ);
      }
   }
}
