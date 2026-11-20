package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.DispenserBlock;

public class EmptyBucketDispenseBehavior implements DispenseBehavior {
   public static final EmptyBucketDispenseBehavior INSTANCE = new EmptyBucketDispenseBehavior();
   public static final MapCodec<EmptyBucketDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private EmptyBucketDispenseBehavior() {
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      if (dispensed.getItem() instanceof DispensibleContainerItem bucket) {
         BlockPos var6 = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
         ServerLevel level = source.level();
         if (bucket.emptyContents(null, level, var6, null)) {
            bucket.checkExtraContent(null, level, dispensed, var6);
            return DispenseBehavior.consumeWithRemainder(source, dispensed, new ItemStack(Items.BUCKET));
         } else {
            return DispenseBehavior.DispenseResult.failure();
         }
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<EmptyBucketDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
