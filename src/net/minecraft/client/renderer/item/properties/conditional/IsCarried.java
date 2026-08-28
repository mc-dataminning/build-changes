package net.minecraft.client.renderer.item.properties.conditional;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

public record IsCarried() implements ConditionalItemModelProperty {
   public static final MapCodec<IsCarried> MAP_CODEC = MapCodec.unit(new IsCarried());

   @Override
   public boolean get(
      final ItemStack itemStack, @Nullable final ClientLevel level, @Nullable final LivingEntity owner, final int seed, final ItemDisplayContext displayContext
   ) {
      if (owner instanceof LocalPlayer player && player.containerMenu.getCarried() == itemStack) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<IsCarried> type() {
      return MAP_CODEC;
   }
}
