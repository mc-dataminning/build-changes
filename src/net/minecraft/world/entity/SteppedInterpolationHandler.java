package net.minecraft.world.entity;

import java.util.List;
import java.util.Objects;
import net.minecraft.core.PositionAndRotation;
import net.minecraft.util.ArrayListDeque;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public class SteppedInterpolationHandler extends AbstractInterpolationHandler {
   private final SteppedInterpolationHandler.InterpolationData interpolationData = new SteppedInterpolationHandler.InterpolationData();
   private final int updateInterval;

   private SteppedInterpolationHandler(final Entity entity, final int interpolationSteps) {
      super(entity, interpolationSteps);
      this.updateInterval = entity.getType().updateInterval();
   }

   private SteppedInterpolationHandler(final Entity entity) {
      super(entity, entity.getType().updateInterval());
      this.updateInterval = this.interpolationSteps;
   }

   public static InterpolationHandler create(final Entity entity, final int interpolationSteps) {
      return entity.level().isClientSide() ? new SteppedInterpolationHandler(entity, interpolationSteps) : new SteppedInterpolationTracker(entity);
   }

   public static InterpolationHandler create(final Entity entity) {
      return entity.level().isClientSide() ? new SteppedInterpolationHandler(entity) : new SteppedInterpolationTracker(entity);
   }

   @Override
   protected PositionAndRotation.Mutable interpolationData() {
      return this.interpolationData;
   }

   @Override
   protected void startInterpolating(final PositionPath position, final float yRot, final float xRot) {
      if (position instanceof PositionPath.Stepped stepped && stepped.startImmediately()) {
         this.cancel();
      }

      if (!this.hasActiveInterpolation()) {
         this.interpolationData.setStartingPoint(this.entity.position(), this.entity.getYRot(), this.entity.getXRot());
      }

      Vec3 endPosition = position.endPosition();
      if (Objects.equals(endPosition, this.interpolationData.position())) {
         this.interpolationData.addStep(endPosition, yRot, xRot, this.updateInterval);
      } else {
         this.interpolationData.addSteps(position, yRot, xRot, this.updateInterval);
      }

      this.interpolationData.set(endPosition, yRot, xRot);
      this.interpolationData.remainingTicks = this.interpolationSteps;
   }

   @Override
   protected void doInterpolate() {
      this.interpolationData.advance(this.entity.level().getRelativeTickSpeed());
      PositionAndRotation target = this.interpolationData.currentStepPosRot;
      this.entity.setPos(target.position());
      this.entity.setRot(target.yRot(), target.xRot());
   }

   @Override
   public boolean hasActiveInterpolation() {
      return this.interpolationData.remainingTicks > 0.0F;
   }

   @Override
   public void cancel() {
      this.interpolationData.reset();
   }

   private static class InterpolationData extends PositionAndRotation.Mutable {
      private final List<SteppedInterpolationHandler.Step> remainingSteps = new ArrayListDeque<>();
      private final PositionAndRotation.Mutable currentStepPosRot = new PositionAndRotation.Mutable();
      private float remainingTicks;
      private float totalWeight;

      private void advance(final float ticks) {
         float advanceByWeight = ticks * this.totalWeight / this.remainingTicks;
         this.totalWeight -= advanceByWeight;
         this.remainingTicks -= ticks;
         if (!this.advanceToNextStep(advanceByWeight)) {
            this.reset();
         }
      }

      private boolean advanceToNextStep(float advanceByWeight) {
         while (!this.remainingSteps.isEmpty()) {
            SteppedInterpolationHandler.Step step = this.remainingSteps.getFirst();
            float weight = step.weight;
            if (advanceByWeight < weight) {
               float a = advanceByWeight / weight;
               if (a > 0.0F) {
                  this.currentStepPosRot
                     .set(
                        this.currentStepPosRot.position().lerp(step.position(), a),
                        Mth.rotLerp(a, this.currentStepPosRot.yRot(), step.yRot()),
                        Mth.lerp(a, this.currentStepPosRot.xRot(), step.xRot())
                     );
               }

               step.weight -= advanceByWeight;
               return true;
            }

            advanceByWeight -= weight;
            this.currentStepPosRot.set(step.position(), step.yRot(), step.xRot());
            this.remainingSteps.removeFirst();
         }

         return false;
      }

      private void reset() {
         this.remainingSteps.clear();
         this.remainingTicks = 0.0F;
         this.totalWeight = 0.0F;
      }

      @Override
      public void addDelta(final Vec3 delta) {
         super.addDelta(delta);

         for (SteppedInterpolationHandler.Step step : this.remainingSteps) {
            step.addDelta(delta);
         }

         this.currentStepPosRot.addDelta(delta);
      }

      @Override
      public void addRotation(final float yRot, final float xRot) {
         super.addRotation(yRot, xRot);

         for (SteppedInterpolationHandler.Step step : this.remainingSteps) {
            step.addRotation(yRot, xRot);
         }

         this.currentStepPosRot.addRotation(yRot, xRot);
      }

      private void setStartingPoint(final Vec3 position, final float yRot, final float xRot) {
         this.currentStepPosRot.set(position, yRot, xRot);
      }

      private void addStep(final Vec3 position, final float yRot, final float xRot, final int weight) {
         this.remainingSteps.add(new SteppedInterpolationHandler.Step(position, yRot, xRot, weight));
         this.totalWeight += weight;
      }

      private void addSteps(final PositionPath position, final float yRot, final float xRot, final int weight) {
         switch (position) {
            case PositionPath.Linear(Vec3 pos):
               this.addStep(pos, yRot, xRot, weight);
               break;
            case PositionPath.Stepped var9:
               PositionPath.Stepped var10000 = var9;

               try {
                  var10000.endPosition();
               } catch (Throwable var18) {
                  throw new MatchException(var18.toString(), var18);
               }

               var10000 = var9;

               try {
                  var25 = var10000.steps();
               } catch (Throwable var17) {
                  throw new MatchException(var17.toString(), var17);
               }

               List totalInterpolationTicks = var25;
               List<PositionStep> steps = totalInterpolationTicks;
               var10000 = var9;

               try {
                  var10000.startImmediately();
               } catch (Throwable var16) {
                  throw new MatchException(var16.toString(), var16);
               }

               if (yRot == this.yRot() && xRot == this.xRot()) {
                  for (PositionStep step : steps) {
                     this.addStep(step.position(), yRot, xRot, step.tickOffset());
                  }

                  return;
               }

               int totalInterpolationTicksx = getInterpolationTicks(steps);
               int offset = 0;

               for (PositionStep step : steps) {
                  offset += step.tickOffset();
                  float a = (float)offset / totalInterpolationTicksx;
                  this.addStep(step.position(), Mth.rotLerp(a, this.yRot(), yRot), Mth.lerp(a, this.xRot(), xRot), step.tickOffset());
               }
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      private static int getInterpolationTicks(final List<PositionStep> steps) {
         int ticks = 0;

         for (PositionStep step : steps) {
            ticks += step.tickOffset();
         }

         return ticks;
      }
   }

   private static class Step extends PositionAndRotation.Mutable {
      private float weight;

      public Step(final Vec3 position, final float yRot, final float xRot, final int weight) {
         this.weight = weight;
         this.set(position, yRot, xRot);
      }
   }
}
