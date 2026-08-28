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

public record RoundFunction(RoundFunction.Type type, DensityFunction input, DensityFunction multiple) implements DensityFunction {
   private static float roundToInteger(final float input, final RoundFunction.Type type) {
      return switch (type) {
         case FLOOR -> (float)Math.floor((double)input);
         case ROUND -> (float)Math.round(input);
         case CEIL -> (float)Math.ceil((double)input);
         case TRUNCATE -> input > 0.0F ? (float)Math.floor((double)input) : (float)Math.ceil((double)input);
      };
   }

   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      DensitySampler input = this.input.compileSampler(context);
      if (this.multiple instanceof ConstantFunction var3) {
         ConstantFunction var10000 = var3;

         try {
            var9 = var10000.value();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         float var6 = var9;
         if (true && var6 == 1.0F) {
            return new RoundFunction.IntegerMultipleSampler(this.type, input);
         }
      }

      return new RoundFunction.Sampler(this.type, input, this.multiple.compileSampler(context));
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction input = rule.rewrite(this.input);
      DensityFunction multiple = rule.rewrite(this.multiple);
      return input == this.input && multiple == this.multiple ? this : new RoundFunction(this.type, input, multiple);
   }

   @Override
   public Interval range() {
      Interval multipleRange = this.multiple.range();
      return Interval.mul(Interval.mapMonotonic(Interval.div(this.input.range(), multipleRange), value -> roundToInteger(value, this.type)), multipleRange);
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.input.domainAxes() | this.multiple.domainAxes();
   }

   @Override
   public MapCodec<RoundFunction> codec() {
      return this.type.codec;
   }

   private static record IntegerMultipleSampler(RoundFunction.Type type, DensitySampler input) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         for (int i = 0; i < outputBuffer.size(); i++) {
            outputBuffer.set(i, RoundFunction.roundToInteger(outputBuffer.get(i), this.type));
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float input = this.input.sampleValue(context, blockX, blockY, blockZ);
         return RoundFunction.roundToInteger(input, this.type);
      }
   }

   private static record Sampler(RoundFunction.Type type, DensitySampler input, DensitySampler multiple) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.input.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer multipleBuffer = context.acquireBuffer(volume)) {
            this.multiple.sampleVolume(context, multipleBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               float input = outputBuffer.get(i);
               float multiple = multipleBuffer.get(i);
               outputBuffer.set(i, this.apply(input, multiple));
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float input = this.input.sampleValue(context, blockX, blockY, blockZ);
         float multiple = this.multiple.sampleValue(context, blockX, blockY, blockZ);
         return this.apply(input, multiple);
      }

      private float apply(final float input, final float multiple) {
         return multiple == 0.0F ? input : RoundFunction.roundToInteger(input / multiple, this.type) * multiple;
      }
   }

   public static enum Type {
      FLOOR("floor"),
      ROUND("round"),
      CEIL("ceil"),
      TRUNCATE("truncate");

      public final String id;
      public final MapCodec<RoundFunction> codec = RecordCodecBuilder.mapCodec(
         i -> i.group(
                  DensityFunction.CODEC.fieldOf("input").forGetter(RoundFunction::input),
                  DensityFunction.CODEC.optionalFieldOf("multiple", DensityFunctions.constant(1.0F)).forGetter(RoundFunction::multiple)
               )
               .apply(i, (input, multiple) -> new RoundFunction(this, input, multiple))
      );

      private Type(final String id) {
         this.id = id;
      }
   }
}
