package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.gameevent.GameEvent;

public class SpawnGolemFromCarvedPumpkinDispenseBehavior implements DispenseBehavior {
   public static final SpawnGolemFromCarvedPumpkinDispenseBehavior INSTANCE = new SpawnGolemFromCarvedPumpkinDispenseBehavior();
   public static final MapCodec<SpawnGolemFromCarvedPumpkinDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private SpawnGolemFromCarvedPumpkinDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      ServerLevel level = source.level();
      BlockPos target = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
      CarvedPumpkinBlock pumpkinBlock = (CarvedPumpkinBlock)Blocks.CARVED_PUMPKIN;
      if (level.isEmptyBlock(target) && pumpkinBlock.canSpawnGolem(level, target)) {
         level.setBlockAndUpdate(target, pumpkinBlock.defaultBlockState());
         level.gameEvent(null, GameEvent.BLOCK_PLACE, target);
         dispensed.shrink(1);
         return DispenseBehavior.DispenseResult.success(dispensed);
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<SpawnGolemFromCarvedPumpkinDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
