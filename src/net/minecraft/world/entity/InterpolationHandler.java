package net.minecraft.world.entity;

import net.minecraft.core.PositionAndRotation;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public interface InterpolationHandler {
   InterpolationHandler NO_OP = new InterpolationHandler.NoOpInterpolationHandler();

   default InterpolationTracker interpolationTracker() {
      return InterpolationTracker.NO_OP;
   }

   @Nullable
   PositionAndRotation target();

   boolean interpolateTo(@Nullable PositionPath position, float yRot, float xRot, boolean hasRotation);

   void interpolate();

   void applyPredictedMovement(Vec3 delta);

   boolean hasActiveInterpolation();

   void cancel();

   public static class NoOpInterpolationHandler implements InterpolationHandler {
      @Nullable
      @Override
      public PositionAndRotation target() {
         return null;
      }

      @Override
      public boolean interpolateTo(@Nullable final PositionPath position, final float yRot, final float xRot, final boolean hasRotation) {
         return false;
      }

      @Override
      public void interpolate() {
      }

      @Override
      public void applyPredictedMovement(final Vec3 delta) {
      }

      @Override
      public boolean hasActiveInterpolation() {
         return false;
      }

      @Override
      public void cancel() {
      }
   }
}
