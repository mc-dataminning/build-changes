package net.minecraft.client.sounds;

import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.animal.cow.CowSoundVariants;
import org.jspecify.annotations.Nullable;

public final class SoundPreviewHandler {
   private static @Nullable SoundInstance activePreview;
   private static @Nullable SoundSource previousCategory;

   public static void preview(final SoundManager soundManager, final SoundSource category, final float volume) {
      stopOtherCategoryPreview(soundManager, category);
      if (canPlaySound(soundManager)) {
         SoundInstance previewSound = switch (category) {
            case RECORDS -> SimpleSoundInstance.forUI(SoundEvents.NOTE_BLOCK_GUITAR, 1.0F, volume);
            case WEATHER -> SimpleSoundInstance.forUI(SoundEvents.LIGHTNING_BOLT_THUNDER, 1.0F, volume);
            case BLOCKS -> SimpleSoundInstance.forUI(SoundEvents.GRASS.placeSound().orElseThrow(), 1.0F, volume);
            case HOSTILE -> SimpleSoundInstance.forUI(SoundEvents.ZOMBIE_AMBIENT, 1.0F, volume);
            case NEUTRAL -> SimpleSoundInstance.forUI(SoundEvents.COW_SOUNDS.get(CowSoundVariants.SoundSet.CLASSIC).ambientSound().orElseThrow(), 1.0F, volume);
            case PLAYERS -> SimpleSoundInstance.forUI(SoundEvents.GENERIC_EAT, 1.0F, volume);
            case AMBIENT -> SimpleSoundInstance.forUI(SoundEvents.AMBIENT_CAVE, 1.0F, volume);
            case UI -> SimpleSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK, 1.0F, volume);
            default -> null;
         };
         if (previewSound != null) {
            activePreview = previewSound;
            soundManager.play(activePreview);
         }
      }
   }

   private static void stopOtherCategoryPreview(final SoundManager soundManager, final SoundSource category) {
      if (previousCategory != category) {
         previousCategory = category;
         if (activePreview != null) {
            soundManager.stop(activePreview);
         }
      }
   }

   private static boolean canPlaySound(final SoundManager soundManager) {
      return activePreview == null || !soundManager.isActive(activePreview);
   }
}
