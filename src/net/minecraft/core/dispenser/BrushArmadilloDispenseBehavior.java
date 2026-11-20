package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.animal.armadillo.Armadillo;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.AABB;

public class BrushArmadilloDispenseBehavior implements DispenseBehavior {
   public static final BrushArmadilloDispenseBehavior INSTANCE = new BrushArmadilloDispenseBehavior();
   public static final MapCodec<BrushArmadilloDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private BrushArmadilloDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      ServerLevel level = source.level();
      BlockPos pos = source.pos().relative(source.state().getValue(DispenserBlock.FACING));

      for (Armadillo armadillo : level.getEntitiesOfClass(Armadillo.class, new AABB(pos), EntitySelector.NO_SPECTATORS)) {
         if (armadillo.brushOffScute(null, dispensed)) {
            dispensed.hurtAndBreak(16, level, null, item -> {});
            return DispenseBehavior.DispenseResult.success(dispensed);
         }
      }

      return DispenseBehavior.DispenseResult.failure();
   }

   @Override
   public MapCodec<BrushArmadilloDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
