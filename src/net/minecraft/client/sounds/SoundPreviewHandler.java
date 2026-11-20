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
            case RECORDS -> SimpleSoundInstance.forPreview(SoundEvents.NOTE_BLOCK_GUITAR, category, volume);
            case WEATHER -> SimpleSoundInstance.forPreview(SoundEvents.LIGHTNING_BOLT_THUNDER, category, volume);
            case BLOCKS -> SimpleSoundInstance.forPreview(SoundEvents.GRASS.placeSound().orElseThrow(), category, volume);
            case HOSTILE -> SimpleSoundInstance.forPreview(SoundEvents.ZOMBIE_AMBIENT, category, volume);
            case NEUTRAL -> SimpleSoundInstance.forPreview(
               SoundEvents.COW_SOUNDS.get(CowSoundVariants.SoundSet.CLASSIC).ambientSound().orElseThrow(), category, volume
            );
            case PLAYERS -> SimpleSoundInstance.forPreview(SoundEvents.GENERIC_EAT, category, volume);
            case AMBIENT -> SimpleSoundInstance.forPreview(SoundEvents.AMBIENT_CAVE, category, volume);
            case UI -> SimpleSoundInstance.forPreview(SoundEvents.UI_BUTTON_CLICK, category, volume);
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
