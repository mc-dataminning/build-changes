package net.minecraft.core.dispenser;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.DirectionalPlaceContext;
import net.minecraft.world.level.block.DispenserBlock;
import org.slf4j.Logger;

public class PlaceBlockDispenseBehavior implements DispenseBehavior {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final PlaceBlockDispenseBehavior INSTANCE = new PlaceBlockDispenseBehavior();
   public static final MapCodec<PlaceBlockDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private PlaceBlockDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      if (dispensed.getItem() instanceof BlockItem blockItem) {
         Direction facing = source.state().getValue(DispenserBlock.FACING);
         BlockPos relativePos = source.pos().relative(facing);
         Direction clickedFace = source.level().isEmptyBlock(relativePos.below()) ? facing : Direction.UP;

         try {
            boolean placed = blockItem.place(new DirectionalPlaceContext(source.level(), relativePos, facing, dispensed, clickedFace)).consumesAction();
            if (placed) {
               return DispenseBehavior.DispenseResult.success(dispensed);
            }
         } catch (Exception e) {
            LOGGER.error("Error trying to place block at {}", relativePos, e);
         }
      }

      return DispenseBehavior.DispenseResult.failure();
   }

   @Override
   public MapCodec<PlaceBlockDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
