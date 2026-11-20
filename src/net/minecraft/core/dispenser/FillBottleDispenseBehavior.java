package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class FillBottleDispenseBehavior implements DispenseBehavior {
   public static final FillBottleDispenseBehavior INSTANCE = new FillBottleDispenseBehavior();
   public static final MapCodec<FillBottleDispenseBehavior> MAP_CODEC = MapCodec.unit(INSTANCE);

   private FillBottleDispenseBehavior() {
   }

   private DispenseBehavior.DispenseResult takeLiquid(final BlockSource source, final ItemStack dispensed, final ItemStack filledItemStack) {
      ServerLevel level = source.level();
      BlockPos pos = source.pos();
      BottleItem.playGlassBottleFillSound(level, null, pos.getX(), pos.getY(), pos.getZ());
      level.gameEvent(null, GameEvent.FLUID_PICKUP, pos);
      return DispenseBehavior.consumeWithRemainder(source, dispensed, filledItemStack);
   }

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      ServerLevel level = source.level();
      BlockPos target = source.pos().relative(source.state().getValue(DispenserBlock.FACING));
      BlockState state = level.getBlockState(target);
      if (state.is(BlockTags.BEEHIVES, s -> s.getBlock() instanceof BeehiveBlock) && state.getValueOrElse(BeehiveBlock.HONEY_LEVEL, 0) >= 5) {
         ((BeehiveBlock)state.getBlock()).releaseBeesAndResetHoneyLevel(level, state, target, null, BeehiveBlockEntity.BeeReleaseStatus.BEE_RELEASED);
         return this.takeLiquid(source, dispensed, new ItemStack(Items.HONEY_BOTTLE));
      } else {
         return level.getFluidState(target).is(FluidTags.WATER)
            ? this.takeLiquid(source, dispensed, PotionContents.createItemStack(Items.POTION, Potions.WATER))
            : DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public MapCodec<FillBottleDispenseBehavior> codec() {
      return MAP_CODEC;
   }
}
