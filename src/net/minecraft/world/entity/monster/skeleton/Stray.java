package net.minecraft.world.entity.monster.skeleton;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

public class Stray extends AbstractSkeleton {
   public Stray(final EntityType<? extends Stray> type, final Level level) {
      super(type, level);
   }

   @Override
   protected SoundEvent getAmbientSound() {
      return SoundEvents.STRAY_AMBIENT;
   }

   @Override
   protected SoundEvent getHurtSound(final DamageSource source) {
      return SoundEvents.STRAY_HURT;
   }

   @Override
   protected SoundEvent getDeathSound() {
      return SoundEvents.STRAY_DEATH;
   }

   @Override
   protected SoundEvent getStepSound() {
      return SoundEvents.STRAY_STEP;
   }

   @Override
   protected AbstractArrow getArrow(final ItemStack projectile, final float power, final @Nullable ItemStack firingWeapon) {
      AbstractArrow arrow = super.getArrow(projectile, power, firingWeapon);
      if (arrow instanceof Arrow arrow2) {
         arrow2.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600));
      }

      return arrow;
   }
}
