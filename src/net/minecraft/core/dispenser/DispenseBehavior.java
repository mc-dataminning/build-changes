package net.minecraft.core.dispenser;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;

public interface DispenseBehavior {
   Codec<DispenseBehavior> DIRECT_CODEC = BuiltInRegistries.DISPENSE_BEHAVIOR_TYPE.byNameCodec().dispatch(DispenseBehavior::codec, c -> c);
   Codec<List<DispenseBehavior>> LIST_CODEC = DIRECT_CODEC.listOf();
   Codec<Holder<List<DispenseBehavior>>> CODEC = RegistryCodecs.holder(Registries.DISPENSE_BEHAVIOR, LIST_CODEC);

   static ItemStack dispense(final Iterable<DispenseBehavior> behaviors, final BlockSource source, final ItemStack dispensed) {
      Direction direction = source.state().getValue(DispenserBlock.FACING);

      for (DispenseBehavior behavior : behaviors) {
         DispenseBehavior.DispenseResult result = behavior.execute(source, dispensed);
         if (result.shouldStop()) {
            behavior.playAnimation(source, direction);
            if (result instanceof DispenseBehavior.DispenseResult.Success(ItemStack remaining)) {
               behavior.playSuccessSound(source);
               return remaining;
            }

            behavior.playFailureSound(source);
            return dispensed;
         }
      }

      playDefaultFailureSound(source);
      playDefaultAnimation(source, direction);
      return dispensed;
   }

   DispenseBehavior.DispenseResult execute(BlockSource source, ItemStack dispensed);

   default void playSuccessSound(final BlockSource source) {
      playDefaultSuccessSound(source);
   }

   default void playFailureSound(final BlockSource source) {
      playDefaultFailureSound(source);
   }

   default void playAnimation(final BlockSource source, final Direction direction) {
      playDefaultAnimation(source, direction);
   }

   static void playDefaultAnimation(final BlockSource source, final Direction direction) {
      source.level().levelEvent(2000, source.pos(), direction.get3DDataValue());
   }

   private static void playDefaultSuccessSound(final BlockSource source) {
      source.level().levelEvent(1000, source.pos(), 0);
   }

   private static void playDefaultFailureSound(final BlockSource source) {
      source.level().levelEvent(1001, source.pos(), 0);
   }

   static DispenseBehavior.DispenseResult consumeWithRemainder(final BlockSource source, final ItemStack dispensed, final ItemStack remainder) {
      dispensed.shrink(1);
      if (dispensed.isEmpty()) {
         return DispenseBehavior.DispenseResult.success(remainder);
      }

      addToInventoryOrDispense(source, remainder);
      return DispenseBehavior.DispenseResult.success(dispensed);
   }

   private static void addToInventoryOrDispense(final BlockSource source, final ItemStack itemStack) {
      ItemStack remainder = source.blockEntity().insertItem(itemStack);
      if (!remainder.isEmpty()) {
         Direction direction = DropItemDispenseBehavior.spawnItem(source, remainder);
         playDefaultSuccessSound(source);
         playDefaultAnimation(source, direction);
      }
   }

   MapCodec<? extends DispenseBehavior> codec();

   sealed interface DispenseResult
      permits DispenseBehavior.DispenseResult.Success,
      DispenseBehavior.DispenseResult.Failure,
      DispenseBehavior.DispenseResult.StoppingFailure {
      boolean shouldStop();

      static DispenseBehavior.DispenseResult.Success success(final ItemStack remaining) {
         return new DispenseBehavior.DispenseResult.Success(remaining);
      }

      static DispenseBehavior.DispenseResult.Failure failure() {
         return DispenseBehavior.DispenseResult.Failure.INSTANCE;
      }

      static DispenseBehavior.DispenseResult.StoppingFailure stoppingFailure() {
         return DispenseBehavior.DispenseResult.StoppingFailure.INSTANCE;
      }

      final class Failure implements DispenseBehavior.DispenseResult {
         public static final DispenseBehavior.DispenseResult.Failure INSTANCE = new DispenseBehavior.DispenseResult.Failure();

         private Failure() {
         }

         @Override
         public boolean shouldStop() {
            return false;
         }
      }

      final class StoppingFailure implements DispenseBehavior.DispenseResult {
         public static final DispenseBehavior.DispenseResult.StoppingFailure INSTANCE = new DispenseBehavior.DispenseResult.StoppingFailure();

         private StoppingFailure() {
         }

         @Override
         public boolean shouldStop() {
            return true;
         }
      }

      record Success(ItemStack remaining) implements DispenseBehavior.DispenseResult {
         @Override
         public boolean shouldStop() {
            return true;
         }
      }
   }
}
