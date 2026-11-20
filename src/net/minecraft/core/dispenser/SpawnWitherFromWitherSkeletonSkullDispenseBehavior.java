package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.WitherSkullBlock;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.level.gameevent.GameEvent;

public class SpawnWitherFromWitherSkeletonSkullDispenseBehavior implements DispenseBehavior {
   public static final SpawnWitherFromWitherSkeletonSkullDispenseBehavior INSTANCE = new SpawnWitherFromWitherSkeletonSkullDispenseBehavior();
   public static final MapCodec<SpawnWitherFromWitherSkeletonSkullDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private SpawnWitherFromWitherSkeletonSkullDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      Level level = source.level();
      Direction direction = source.state().getValue(DispenserBlock.FACING);
      BlockPos target = source.pos().relative(direction);
      if (level.isEmptyBlock(target) && WitherSkullBlock.canSpawnMob(level, target, dispensed)) {
         level.setBlockAndUpdate(
            target, Blocks.WITHER_SKELETON_SKULL.defaultBlockState().setValue(SkullBlock.ROTATION, RotationSegment.convertToSegment(direction))
         );
         level.gameEvent(null, GameEvent.BLOCK_PLACE, target);
         if (level.getBlockEntity(target) instanceof SkullBlockEntity skullBlockEntity) {
            WitherSkullBlock.checkSpawn(level, target, skullBlockEntity);
         }

         dispensed.shrink(1);
         return DispenseBehavior.DispenseResult.success(dispensed);
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<SpawnWitherFromWitherSkeletonSkullDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
