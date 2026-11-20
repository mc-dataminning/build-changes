package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.monster.cubemob.SulfurCube;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;

public class IgniteDispenseBehavior implements DispenseBehavior {
   public static final IgniteDispenseBehavior INSTANCE = new IgniteDispenseBehavior();
   public static final MapCodec<IgniteDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private IgniteDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      ServerLevel level = source.level();
      Direction facing = source.state().getValue(DispenserBlock.FACING);
      BlockPos targetPos = source.pos().relative(facing);
      BlockState target = level.getBlockState(targetPos);
      if (tryIgnite(dispensed, level, targetPos, facing, target)) {
         FlintAndSteelItem.playSound(level, targetPos);
         dispensed.hurtAndBreak(1, level, null, var0 -> {});
         return DispenseBehavior.DispenseResult.success(dispensed);
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   private static boolean tryIgnite(
      final ItemStack dispensed, final ServerLevel level, final BlockPos targetPos, final Direction facing, final BlockState target
   ) {
      if (tryIgniteExplosiveEntities(level, targetPos)) {
         return true;
      } else if (BaseFireBlock.canBePlacedAt(level, targetPos, facing)) {
         level.setBlockAndUpdate(targetPos, BaseFireBlock.getState(level, targetPos));
         level.gameEvent(null, GameEvent.BLOCK_PLACE, targetPos);
         return true;
      } else if (CampfireBlock.canLight(target) || CandleBlock.canLight(target) || CandleCakeBlock.canLight(target)) {
         level.setBlockAndUpdate(targetPos, target.setValue(BlockStateProperties.LIT, true));
         level.gameEvent(null, GameEvent.BLOCK_CHANGE, targetPos);
         return true;
      } else if (target.getBlock() instanceof TntBlock && TntBlock.prime(level, targetPos, null, dispensed)) {
         level.removeBlock(targetPos, false);
         return true;
      } else {
         return false;
      }
   }

   private static boolean tryIgniteExplosiveEntities(final ServerLevel level, final BlockPos pos) {
      List<SulfurCube> entities = level.getEntitiesOfClass(SulfurCube.class, new AABB(pos), SulfurCube::canExplode);
      if (entities.isEmpty()) {
         return false;
      }

      entities.getFirst().primeTime(false);
      return true;
   }

   @Override
   public MapCodec<IgniteDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
