package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.RespawnAnchorBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ChargeRespawnAnchorDispenseBehavior implements DispenseBehavior {
   public static final ChargeRespawnAnchorDispenseBehavior INSTANCE = new ChargeRespawnAnchorDispenseBehavior();
   public static final MapCodec<ChargeRespawnAnchorDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private ChargeRespawnAnchorDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      Direction direction = source.state().getValue(DispenserBlock.FACING);
      BlockPos pos = source.pos().relative(direction);
      Level level = source.level();
      BlockState blockState = level.getBlockState(pos);
      if (blockState.is(Blocks.RESPAWN_ANCHOR)) {
         if (blockState.getValue(RespawnAnchorBlock.CHARGE) != 4) {
            RespawnAnchorBlock.charge(null, level, pos, blockState);
            dispensed.shrink(1);
            return DispenseBehavior.DispenseResult.success(dispensed);
         } else {
            return DispenseBehavior.DispenseResult.stoppingFailure();
         }
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<ChargeRespawnAnchorDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
