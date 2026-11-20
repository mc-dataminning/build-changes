package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.monster.cubemob.SulfurCube;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.AABB;

public class EquipSulfurCubeDispenseBehavior implements DispenseBehavior {
   public static final EquipSulfurCubeDispenseBehavior INSTANCE = new EquipSulfurCubeDispenseBehavior();
   public static final MapCodec<EquipSulfurCubeDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private EquipSulfurCubeDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      if (!dispensed.is(ItemTags.SULFUR_CUBE_SWALLOWABLE)) {
         return DispenseBehavior.DispenseResult.failure();
      }

      ServerLevel level = source.level();
      BlockPos pos = source.pos().relative(source.state().getValue(DispenserBlock.FACING));

      for (SulfurCube entity : level.getEntitiesOfClass(SulfurCube.class, new AABB(pos))) {
         if (entity.equipItem(dispensed)) {
            dispensed.shrink(1);
            return DispenseBehavior.DispenseResult.success(dispensed);
         }
      }

      return DispenseBehavior.DispenseResult.failure();
   }

   @Override
   public MapCodec<EquipSulfurCubeDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
