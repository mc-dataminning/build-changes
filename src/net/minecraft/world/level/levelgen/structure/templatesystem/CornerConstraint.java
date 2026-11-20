package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.util.InclusiveRange;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.densityfunction.DensityFunction;
import net.minecraft.world.level.levelgen.densityfunction.DensitySampler;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

public record CornerConstraint(List<CornerConstraint.DensityPredicate> densityPredicates) {
   public static final Codec<CornerConstraint> CODEC = CornerConstraint.DensityPredicate.CODEC
      .listOf(1, 10)
      .xmap(CornerConstraint::new, CornerConstraint::densityPredicates);

   public boolean test(final BoundingBox boundingBox, final RandomState randomState) {
      for (CornerConstraint.DensityPredicate densityPredicate : this.densityPredicates()) {
         if (!densityPredicate.test(boundingBox, randomState)) {
            return false;
         }
      }

      return true;
   }

   public record DensityPredicate(
      Holder<DensityFunction> densityFunction,
      InclusiveRange<Double> acceptableDensity,
      int padding,
      CornersToCheck corners,
      InclusiveRange<Integer> requiredCorners
   ) {
      public static final Codec<CornerConstraint.DensityPredicate> CODEC = RecordCodecBuilder.create(
            i -> i.group(
                  DensityFunction.REFERENCE_CODEC.fieldOf("density_function").forGetter(CornerConstraint.DensityPredicate::densityFunction),
                  InclusiveRange.codec(Codec.DOUBLE).fieldOf("acceptable_density").forGetter(CornerConstraint.DensityPredicate::acceptableDensity),
                  Codec.intRange(0, 8).optionalFieldOf("padding", 0).forGetter(CornerConstraint.DensityPredicate::padding),
                  CornersToCheck.CODEC.optionalFieldOf("corners", CornersToCheck.ALL).forGetter(CornerConstraint.DensityPredicate::corners),
                  InclusiveRange.codec(Codec.intRange(1, 8)).fieldOf("required_corners").forGetter(CornerConstraint.DensityPredicate::requiredCorners)
               )
               .apply(i, CornerConstraint.DensityPredicate::new)
         )
         .validate(
            densityPredicate -> densityPredicate.corners != CornersToCheck.ALL && densityPredicate.requiredCorners.maxInclusive() > 4
               ? DataResult.error(() -> "The number of required corners must be at most 4 when corners is " + densityPredicate.corners.name())
               : DataResult.success(densityPredicate)
         );

      private boolean test(final BoundingBox boundingBox, final RandomState randomState) {
         DensitySampler sampler = randomState.getSampler(this.densityFunction().value());
         BoundingBox paddedBoundingBox = boundingBox.inflatedBy(this.padding());
         List<BlockPos> corners = getCorners(paddedBoundingBox, this.corners());
         int totalCornerCount = corners.size();
         int checkedCorners = 0;
         int acceptedCorners = 0;

         for (BlockPos pos : corners) {
            double density = sampler.sampleValue(SamplerContext.EMPTY_UNCACHED, pos.getX(), pos.getY(), pos.getZ());
            checkedCorners++;
            if (this.acceptableDensity().isValueInRange(density)) {
               if (++acceptedCorners > this.requiredCorners().maxInclusive()) {
                  return false;
               }
            }

            int remainingCorners = totalCornerCount - checkedCorners;
            if (acceptedCorners + remainingCorners < this.requiredCorners().minInclusive()) {
               return false;
            }
         }

         return true;
      }

      private static List<BlockPos> getCorners(final BoundingBox boundingBox, final CornersToCheck corners) {
         List<BlockPos> result = new ArrayList<>(corners == CornersToCheck.ALL ? 8 : 4);
         Consumer<BlockPos> consumer = pos -> result.add(pos.immutable());
         switch (corners) {
            case BOTTOM:
               boundingBox.forAllBottomCorners(consumer);
               break;
            case TOP:
               boundingBox.forAllTopCorners(consumer);
               break;
            default:
               boundingBox.forAllCorners(consumer);
         }

         return result;
      }
   }
}
