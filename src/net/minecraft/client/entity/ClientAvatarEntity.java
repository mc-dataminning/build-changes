package net.minecraft.client.entity;

import net.minecraft.world.entity.animal.parrot.Parrot;
import net.minecraft.world.entity.player.PlayerSkin;
import org.jspecify.annotations.Nullable;

public interface ClientAvatarEntity {
   ClientAvatarState avatarState();

   PlayerSkin getSkin();

   @Nullable
   Parrot.Variant getParrotVariantOnShoulder(boolean left);

   boolean showExtraEars();
}
