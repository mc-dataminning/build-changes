package net.minecraft.world.level.levelgen.densityfunction;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.densityfunction.generator.ConstantFunction;
import net.minecraft.world.level.levelgen.densityfunction.generator.GradientFunction;
import net.minecraft.world.level.levelgen.densityfunction.op.SliceFunction;

@FunctionalInterface
public interface DfRewriteRule {
   DfRewriteRule INLINE_REFERENCE = function -> {
      if (function instanceof DensityFunctions.HolderHolder $b$0) {
         DensityFunctions.HolderHolder var10000 = $b$0;

         try {
            var5 = var10000.function();
         } catch (Throwable var4) {
            throw new MatchException(var4.toString(), var4);
         }

         Holder patt1$temp = var5;
         return (DensityFunction)patt1$temp.value();
      } else {
         return function;
      }
   };
   DfRewriteRule SLICE_UNIFORM_AXES = new DfRewriteRule.SliceUniformAxes(7);

   static DfRewriteRule sequence(final DfRewriteRule... rules) {
      return function -> {
         for (DfRewriteRule rule : rules) {
            function = rule.rewrite(function);
         }

         return function;
      };
   }

   DensityFunction rewrite(DensityFunction function);

   public static record SliceUniformAxes(@DensityFunction.Axes int parentDomainAxes) implements DfRewriteRule {
      @Override
      public DensityFunction rewrite(final DensityFunction function) {
         if (shouldSkip(function)) {
            return function;
         } else {
            int domainAxes = function.domainAxes();
            if (this.parentDomainAxes == domainAxes) {
               return function.rewriteChildren(this);
            } else {
               DensityFunction newFunction = function.rewriteChildren(new DfRewriteRule.SliceUniformAxes(domainAxes));
               int removedAxes = this.parentDomainAxes & ~domainAxes;
               return this.removeAxes(newFunction, removedAxes);
            }
         }
      }

      private DensityFunction removeAxes(DensityFunction function, @DensityFunction.Axes final int axes) {
         int filteredAxes = axes & ~getExistingRemovedAxes(function);
         if ((filteredAxes & 1) != 0) {
            function = new SliceFunction(Direction.Axis.X, 0, function);
         }

         if ((filteredAxes & 4) != 0) {
            function = new SliceFunction(Direction.Axis.Z, 0, function);
         }

         if ((filteredAxes & 2) != 0) {
            function = new SliceFunction(Direction.Axis.Y, 0, function);
         }

         return function;
      }

      @DensityFunction.Axes
      private static int getExistingRemovedAxes(DensityFunction function) {
         int axes = 0;

         while (function instanceof SliceFunction) {
            SliceFunction slice = (SliceFunction)function;
            axes |= DensityFunction.axesFrom(slice.axis());
            function = slice.input();
         }

         return axes;
      }

      private static boolean shouldSkip(final DensityFunction function) {
         return function instanceof ConstantFunction || function instanceof GradientFunction;
      }
   }
}
