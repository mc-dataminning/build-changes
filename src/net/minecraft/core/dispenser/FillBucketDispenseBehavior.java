package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class FillBucketDispenseBehavior implements DispenseBehavior {
   public static final FillBucketDispenseBehavior INSTANCE = new FillBucketDispenseBehavior();
   public static final MapCodec<FillBucketDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private FillBucketDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      LevelAccessor level = source.level();
      BlockPos target = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
      BlockState blockState = level.getBlockState(target);
      if (blockState.getBlock() instanceof BucketPickup pickupSource) {
         ItemStack pickup = pickupSource.pickupBlock(null, level, target, blockState);
         if (pickup.isEmpty()) {
            return DispenseBehavior.DispenseResult.failure();
         }

         pickupSource.getPickupSound().ifPresent(soundEvent -> level.playSound(null, target, soundEvent, SoundSource.BLOCKS));
         level.gameEvent(null, GameEvent.FLUID_PICKUP, target);
         return DispenseBehavior.consumeWithRemainder(source, dispensed, new ItemStack(pickup.getItem()));
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<FillBucketDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
