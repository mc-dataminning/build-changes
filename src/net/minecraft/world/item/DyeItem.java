package net.minecraft.world.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.entity.SignTextSlot;

public class DyeItem extends Item implements SignApplicator {
   public DyeItem(final Item.Properties properties) {
      super(properties);
   }

   @Override
   public boolean tryApplyToSign(final Level level, final SignBlockEntity sign, final SignTextSlot slot, final ItemStack item, final Player player) {
      DyeColor dye = item.get(DataComponents.DYE);
      if (dye != null && sign.updateText(text -> text.withColor(dye), slot)) {
         level.playSound(null, sign.getBlockPos(), SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
