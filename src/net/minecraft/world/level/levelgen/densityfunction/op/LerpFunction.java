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
import net.minecraft.world.level.levelgen.densityfunction.ScopedDensityBuffer;
import net.minecraft.world.level.levelgen.densityfunction.generator.ConstantFunction;

public record LerpFunction(DensityFunction alpha, DensityFunction first, DensityFunction second) implements DensityFunction {
   public static final MapCodec<LerpFunction> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
               DensityFunction.CODEC.fieldOf("alpha").forGetter(LerpFunction::alpha),
               DensityFunction.CODEC.fieldOf("first").forGetter(LerpFunction::first),
               DensityFunction.CODEC.fieldOf("second").forGetter(LerpFunction::second)
            )
            .apply(i, LerpFunction::new)
   );

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      Throwable var17;
      label44: {
         DensitySampler alpha = this.alpha.compileSampler(context);
         DensitySampler first = this.first.compileSampler(context);
         DensitySampler second = this.second.compileSampler(context);
         if (this.first instanceof ConstantFunction var5) {
            ConstantFunction var10000 = var5;

            try {
               var18 = var10000.value();
            } catch (Throwable var13) {
               var17 = var13;
               boolean var10001 = false;
               break label44;
            }

            float var10 = var18;
            if (true) {
               return new LerpFunction.ConstFirstSampler(alpha, var10, second);
            }
         }

         if (!(this.second instanceof ConstantFunction var7)) {
            return new LerpFunction.Sampler(alpha, first, second);
         }

         ConstantFunction var19 = var7;

         try {
            var20 = var19.value();
         } catch (Throwable var12) {
            var17 = var12;
            boolean var21 = false;
            break label44;
         }

         float var16 = var20;
         if (true) {
            return new LerpFunction.ConstSecondSampler(alpha, first, var16);
         }

         return new LerpFunction.Sampler(alpha, first, second);
      }

      Throwable var14 = var17;
      throw new MatchException(var14.toString(), var14);
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction alpha = rule.rewrite(this.alpha);
      DensityFunction first = rule.rewrite(this.first);
      DensityFunction second = rule.rewrite(this.second);
      return alpha == this.alpha && first == this.first && second == this.second ? this : new LerpFunction(alpha, first, second);
   }

   @Override
   public Interval range() {
      return Interval.lerp(this.alpha.range(), this.first.range(), this.second.range());
   }

   @DensityFunction.Axes
   @Override
   public int domainAxes() {
      return this.alpha.domainAxes() | this.first.domainAxes() | this.second.domainAxes();
   }

   @Override
   public MapCodec<LerpFunction> codec() {
      return CODEC;
   }

   public static record ConstFirstSampler(DensitySampler alpha, float first, DensitySampler second) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.alpha.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer secondBuffer = context.acquireBuffer(volume)) {
            this.second.sampleVolume(context, secondBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               float alpha = outputBuffer.get(i);
               float second = secondBuffer.get(i);
               if (alpha == 0.0F) {
                  outputBuffer.set(i, this.first);
               } else if (alpha == 1.0F) {
                  outputBuffer.set(i, second);
               } else {
                  outputBuffer.set(i, Mth.lerp(alpha, this.first, second));
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float alpha = this.alpha.sampleValue(context, blockX, blockY, blockZ);
         if (alpha == 0.0F) {
            return this.first;
         } else {
            return alpha == 1.0F
               ? this.second.sampleValue(context, blockX, blockY, blockZ)
               : Mth.lerp(alpha, this.first, this.second.sampleValue(context, blockX, blockY, blockZ));
         }
      }
   }

   public static record ConstSecondSampler(DensitySampler alpha, DensitySampler first, float second) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.alpha.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer firstBuffer = context.acquireBuffer(volume)) {
            this.first.sampleVolume(context, firstBuffer, volume);

            for (int i = 0; i < outputBuffer.size(); i++) {
               float alpha = outputBuffer.get(i);
               float first = firstBuffer.get(i);
               if (alpha == 0.0F) {
                  outputBuffer.set(i, first);
               } else if (alpha == 1.0F) {
                  outputBuffer.set(i, this.second);
               } else {
                  outputBuffer.set(i, Mth.lerp(alpha, first, this.second));
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float alpha = this.alpha.sampleValue(context, blockX, blockY, blockZ);
         if (alpha == 0.0F) {
            return this.first.sampleValue(context, blockX, blockY, blockZ);
         } else {
            return alpha == 1.0F ? this.second : Mth.lerp(alpha, this.first.sampleValue(context, blockX, blockY, blockZ), this.second);
         }
      }
   }

   public static record Sampler(DensitySampler alpha, DensitySampler first, DensitySampler second) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         this.alpha.sampleVolume(context, outputBuffer, volume);

         try (ScopedDensityBuffer firstBuffer = context.acquireBuffer(volume)) {
            this.first.sampleVolume(context, firstBuffer, volume);

            try (ScopedDensityBuffer secondBuffer = context.acquireBuffer(volume)) {
               this.second.sampleVolume(context, secondBuffer, volume);

               for (int i = 0; i < outputBuffer.size(); i++) {
                  float alpha = outputBuffer.get(i);
                  float first = firstBuffer.get(i);
                  float second = secondBuffer.get(i);
                  if (alpha == 0.0F) {
                     outputBuffer.set(i, first);
                  } else if (alpha == 1.0F) {
                     outputBuffer.set(i, second);
                  } else {
                     outputBuffer.set(i, Mth.lerp(alpha, first, second));
                  }
               }
            }
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         float alpha = this.alpha.sampleValue(context, blockX, blockY, blockZ);
         if (alpha == 0.0F) {
            return this.first.sampleValue(context, blockX, blockY, blockZ);
         } else {
            return alpha == 1.0F
               ? this.second.sampleValue(context, blockX, blockY, blockZ)
               : Mth.lerp(alpha, this.first.sampleValue(context, blockX, blockY, blockZ), this.second.sampleValue(context, blockX, blockY, blockZ));
         }
      }
   }
}
