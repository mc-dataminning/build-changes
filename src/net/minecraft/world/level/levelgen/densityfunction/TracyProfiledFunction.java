package net.minecraft.world.level.levelgen.densityfunction;

import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.serialization.MapCodec;
import net.minecraft.util.Interval;

public record TracyProfiledFunction(String name, DensityFunction function) implements DensityFunction {
   @Override
   public DensitySampler compileSampler(final DensityFunction.CompileContext context) {
      return new TracyProfiledFunction.Sampler(this.name, this.function.compileSampler(context));
   }

   @Override
   public DensityFunction rewriteChildren(final DfRewriteRule rule) {
      DensityFunction function = rule.rewrite(this.function);
      return function == this.function ? this : new TracyProfiledFunction(this.name, function);
   }

   @Override
   public Interval range() {
      return this.function.range();
   }

   @Override
   public @DensityFunction.Axes int domainAxes() {
      return this.function.domainAxes();
   }

   @Override
   public MapCodec<TracyProfiledFunction> codec() {
      throw new UnsupportedOperationException("TracyProfiledFunction should never be encoded");
   }

   public record Sampler(String name, DensitySampler sampler) implements DensitySampler {
      @Override
      public void sampleVolume(final SamplerContext context, final DensityBuffer outputBuffer, final DensityVolume volume) {
         Zone var4 = TracyClient.beginZone(this.name, false);

         try {
            this.sampler.sampleVolume(context, outputBuffer, volume);
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }
      }

      @Override
      public float sampleValue(final SamplerContext context, final int blockX, final int blockY, final int blockZ) {
         Zone var5 = TracyClient.beginZone(this.name, false);

         float var6;
         try {
            var6 = this.sampler.sampleValue(context, blockX, blockY, blockZ);
         } catch (Throwable var9) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if (var5 != null) {
            var5.close();
         }

         return var6;
      }
   }
}
