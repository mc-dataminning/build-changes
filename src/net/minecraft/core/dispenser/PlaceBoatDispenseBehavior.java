package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.AbstractBoat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.TypedEntityData;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.Vec3;

public class PlaceBoatDispenseBehavior implements DispenseBehavior {
   public static final PlaceBoatDispenseBehavior INSTANCE = new PlaceBoatDispenseBehavior();
   public static final MapCodec<PlaceBoatDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private PlaceBoatDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      EntityType<?> type = TypedEntityData.getType(dispensed);
      if (type == null) {
         return DispenseBehavior.DispenseResult.failure();
      }

      Direction direction = source.state().getValue(DispenserBlock.FACING);
      ServerLevel level = source.level();
      Vec3 center = source.center();
      double justOutsideDispenser = 0.5625 + type.getWidth() / 2.0;
      double spawnX = center.x() + direction.getStepX() * justOutsideDispenser;
      double spawnY = center.y() + direction.getStepY() * 1.125F;
      double spawnZ = center.z() + direction.getStepZ() * justOutsideDispenser;
      BlockPos frontPos = source.pos().relative(direction);
      double yOffset;
      if (level.getFluidState(frontPos).is(FluidTags.WATER)) {
         yOffset = 1.0;
      } else {
         if (!level.getBlockState(frontPos).isAir() || !level.getFluidState(frontPos.below()).is(FluidTags.WATER)) {
            return DispenseBehavior.DispenseResult.failure();
         }

         yOffset = 0.0;
      }

      if (type.create(level, EntitySpawnReason.DISPENSER) instanceof AbstractBoat boat) {
         boat.setInitialPos(spawnX, spawnY + yOffset, spawnZ);
         EntityType.<AbstractBoat>createDefaultStackConfig(level, dispensed, null).apply(boat);
         boat.setYRot(direction.toYRot());
         level.addFreshEntity(boat);
         dispensed.shrink(1);
         return DispenseBehavior.DispenseResult.success(dispensed);
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<PlaceBoatDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
