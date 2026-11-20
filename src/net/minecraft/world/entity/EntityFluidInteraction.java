package net.minecraft.world.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.SectionPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class EntityFluidInteraction {
   private final List<EntityFluidInteraction.Tracker> fluidTrackers = new ArrayList<>();

   public boolean update(final Entity entity, final boolean ignoreCurrent) {
      this.fluidTrackers.removeIf(EntityFluidInteraction.Tracker::reset);
      AABB box = entity.getFluidInteractionBox();
      if (box == null) {
         return false;
      }

      int x0 = Mth.floor(box.minX);
      int y0 = Mth.floor(box.minY);
      int z0 = Mth.floor(box.minZ);
      int x1 = Mth.ceil(box.maxX) - 1;
      int y1 = Mth.ceil(box.maxY) - 1;
      int z1 = Mth.ceil(box.maxZ) - 1;
      if (!hasFluidAndLoaded(entity.level(), x0 - 1, y0, z0 - 1, x1 + 1, y1, z1 + 1)) {
         return false;
      }

      double entityY = entity.getBoundingBox().minY;
      int eyeBlockX = entity.getBlockX();
      double eyeY = entity.getEyeY();
      int eyeBlockZ = entity.getBlockZ();
      Holder<Fluid> lastFluidType = null;
      EntityFluidInteraction.Tracker tracker = null;
      EntityFluidInteraction.CurrentAccumulator current = null;
      BlockGetter level = entity.level();
      BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

      for (int x = x0; x <= x1; x++) {
         for (int y = y0; y <= y1; y++) {
            for (int z = z0; z <= z1; z++) {
               mutablePos.set(x, y, z);
               FluidState fluidState = level.getFluidState(mutablePos);
               if (!fluidState.isEmpty()) {
                  double fluidBottom = mutablePos.getY();
                  double fluidTop = fluidBottom + fluidState.getHeight(level, mutablePos);
                  if (!(fluidTop < box.minY)) {
                     Holder<Fluid> fluidType = fluidState.typeHolder();
                     if (fluidType != lastFluidType) {
                        lastFluidType = fluidType;
                        tracker = this.getOrCreateTrackerFor(fluidType);
                        if (!ignoreCurrent) {
                           current = tracker.getOrCreateCurrentAccumulator();
                        }
                     }

                     if (x == eyeBlockX && z == eyeBlockZ && eyeY >= fluidBottom) {
                        double fluidTopForCamera = fluidBottom + fluidState.getHeightForCamera(level, mutablePos);
                        if (eyeY <= fluidTopForCamera) {
                           tracker.eyesInside = true;
                        }
                     }

                     tracker.height = Math.max(fluidTop - entityY, tracker.height);
                     if (current != null) {
                        Vec3 flow = fluidState.getFlow(level, mutablePos);
                        current.height = Math.max(tracker.height, current.height);
                        if (current.height < 0.4) {
                           flow = flow.scale(current.height);
                        }

                        current.accumulate(flow);
                     }
                  }
               }
            }
         }
      }

      return lastFluidType != null;
   }

   private static boolean hasFluidAndLoaded(final Level level, final int x0, final int y0, final int z0, final int x1, final int y1, final int z1) {
      int sectionX0 = SectionPos.blockToSectionCoord(x0);
      int sectionY0 = SectionPos.blockToSectionCoord(y0);
      int sectionZ0 = SectionPos.blockToSectionCoord(z0);
      int sectionX1 = SectionPos.blockToSectionCoord(x1);
      int sectionY1 = SectionPos.blockToSectionCoord(y1);
      int sectionZ1 = SectionPos.blockToSectionCoord(z1);
      boolean hasFluid = false;

      for (int chunkZ = sectionZ0; chunkZ <= sectionZ1; chunkZ++) {
         for (int chunkX = sectionX0; chunkX <= sectionX1; chunkX++) {
            ChunkAccess chunk = level.getChunk(chunkX, chunkZ, ChunkStatus.FULL, false);
            if (chunk == null) {
               return false;
            }

            LevelChunkSection[] sections = chunk.getSections();

            for (int sectionY = sectionY0; sectionY <= sectionY1; sectionY++) {
               int sectionIndex = chunk.getSectionIndexFromSectionY(sectionY);
               if (sectionIndex >= 0 && sectionIndex < sections.length) {
                  hasFluid |= sections[sectionIndex].hasFluid();
               }
            }
         }
      }

      return hasFluid;
   }

   private EntityFluidInteraction.Tracker getOrCreateTrackerFor(final Holder<Fluid> fluidType) {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.fluidType.equals(fluidType)) {
            return tracker;
         }
      }

      EntityFluidInteraction.Tracker tracker = new EntityFluidInteraction.Tracker(fluidType);
      this.fluidTrackers.add(tracker);
      return tracker;
   }

   public void applyCurrentsTo(final Entity entity) {
      if (!this.fluidTrackers.isEmpty()) {
         Vec3 impulse = Vec3.ZERO;

         for (EntityFluidInteraction.Tracker fluidTracker : this.fluidTrackers) {
            EntityFluidInteraction.CurrentAccumulator current = fluidTracker.getCurrentAccumulator();
            if (current != null) {
               double flowScale = fluidTracker.fluidType.value().getFlowScale(entity.level());
               Vec3 impulseForFluid = current.getImpulse(entity, flowScale);
               impulse = impulse.add(impulseForFluid);
            }
         }

         Vec3 oldMovement = entity.getDeltaMovement();
         double min = 0.003;
         if (Mth.lengthSquared(oldMovement.x + impulse.x, oldMovement.z + impulse.z) < 9.0E-6
            && impulse.length() > 1.0E-5F
            && impulse.length() < 0.0045000000000000005) {
            impulse = impulse.normalize().scale(0.0045000000000000005);
         }

         entity.addDeltaMovement(impulse);
      }
   }

   public double getFluidHeight(final TagKey<Fluid> fluid) {
      double height = 0.0;

      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.height > height && tracker.fluidType.is(fluid)) {
            height = tracker.height;
         }
      }

      return height;
   }

   public boolean isInFluid(final TagKey<Fluid> fluid) {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.fluidType.is(fluid) && tracker.height > 0.0) {
            return true;
         }
      }

      return false;
   }

   @Deprecated
   public boolean isInFluid(final ResourceKey<Fluid> fluid) {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.fluidType.is(fluid) && tracker.height > 0.0) {
            return true;
         }
      }

      return false;
   }

   public boolean isInFluid() {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.height > 0.0) {
            return true;
         }
      }

      return false;
   }

   public boolean isEyeInFluid(final TagKey<Fluid> fluid) {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.eyesInside && tracker.fluidType.is(fluid)) {
            return true;
         }
      }

      return false;
   }

   public boolean isEyeInFluid(final ResourceKey<Fluid> fluid) {
      for (EntityFluidInteraction.Tracker tracker : this.fluidTrackers) {
         if (tracker.eyesInside && tracker.fluidType.is(fluid)) {
            return true;
         }
      }

      return false;
   }

   public void forEnteredFluids(final Consumer<Holder<Fluid>> onEnterFluid) {
      for (EntityFluidInteraction.Tracker fluidTracker : this.fluidTrackers) {
         if (!fluidTracker.wasInFluid && fluidTracker.height > 0.0) {
            onEnterFluid.accept(fluidTracker.fluidType);
         }
      }
   }

   public List<Holder<Fluid>> getFluidsToJumpIn(final double fluidJumpThreshold) {
      List<Holder<Fluid>> fluidsToJumpIn = new ArrayList<>();

      for (EntityFluidInteraction.Tracker fluidTracker : this.fluidTrackers) {
         if (fluidTracker.height > fluidJumpThreshold) {
            fluidsToJumpIn.add(fluidTracker.fluidType);
         }
      }

      return fluidsToJumpIn;
   }

   public OptionalDouble getDrag() {
      double maxDrag = Double.POSITIVE_INFINITY;

      for (EntityFluidInteraction.Tracker fluidTracker : this.fluidTrackers) {
         if (fluidTracker.height > 0.0) {
            float drag = fluidTracker.fluidType.value().getDrag();
            if (drag < maxDrag) {
               maxDrag = drag;
            }
         }
      }

      return maxDrag == Double.POSITIVE_INFINITY ? OptionalDouble.empty() : OptionalDouble.of(maxDrag);
   }

   public float getFallDistanceMultiplier() {
      float fallDistanceMultiplier = 1.0F;

      for (EntityFluidInteraction.Tracker fluidTracker : this.fluidTrackers) {
         float fluidFallDistanceMultiplier = fluidTracker.fluidType.value().getFallDistanceMultiplier();
         if (fluidTracker.touchedWhileMoving && fluidFallDistanceMultiplier == 0.0F) {
            return 0.0F;
         }

         if (fluidTracker.height > 0.0) {
            fallDistanceMultiplier = Math.min(fallDistanceMultiplier, fluidFallDistanceMultiplier);
         }
      }

      return fallDistanceMultiplier;
   }

   public void visitedFluidDuringMovement(final Fluid type) {
      EntityFluidInteraction.Tracker fluidTracker = this.getOrCreateTrackerFor(type.builtInRegistryHolder());
      fluidTracker.touchedWhileMoving = true;
   }

   private static class CurrentAccumulator {
      private double height;
      private Vec3 accumulatedCurrent = Vec3.ZERO;
      private int currentCount;

      public void reset() {
         this.height = 0.0;
         this.accumulatedCurrent = Vec3.ZERO;
         this.currentCount = 0;
      }

      public void accumulate(final Vec3 flow) {
         this.accumulatedCurrent = this.accumulatedCurrent.add(flow);
         this.currentCount++;
      }

      public Vec3 getImpulse(final Entity entity, final double scale) {
         if (this.currentCount != 0 && !(this.accumulatedCurrent.lengthSqr() < 1.0E-5F)) {
            Vec3 impulse;
            if (!(entity instanceof Player)) {
               impulse = this.accumulatedCurrent.normalize();
            } else {
               impulse = this.accumulatedCurrent.scale(1.0 / this.currentCount);
            }

            return impulse.scale(scale);
         } else {
            return Vec3.ZERO;
         }
      }
   }

   private static class Tracker {
      private final Holder<Fluid> fluidType;
      private boolean wasInFluid;
      private double height;
      private boolean eyesInside;
      private boolean touchedWhileMoving;
      private EntityFluidInteraction.@Nullable CurrentAccumulator currentAccumulator;

      public Tracker(final Holder<Fluid> fluidType) {
         this.fluidType = fluidType;
      }

      public boolean reset() {
         if (this.height == 0.0 && !this.eyesInside) {
            return true;
         }

         this.wasInFluid = true;
         this.height = 0.0;
         this.eyesInside = false;
         this.touchedWhileMoving = false;
         if (this.currentAccumulator != null) {
            this.currentAccumulator.reset();
         }

         return false;
      }

      public EntityFluidInteraction.CurrentAccumulator getOrCreateCurrentAccumulator() {
         if (this.currentAccumulator == null) {
            this.currentAccumulator = new EntityFluidInteraction.CurrentAccumulator();
         }

         return this.currentAccumulator;
      }

      public EntityFluidInteraction.@Nullable CurrentAccumulator getCurrentAccumulator() {
         return this.currentAccumulator;
      }
   }
}
