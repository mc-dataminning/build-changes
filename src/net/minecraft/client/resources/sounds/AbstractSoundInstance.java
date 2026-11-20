package net.minecraft.client.resources.sounds;

import java.util.Objects;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.client.sounds.WeighedSoundEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import org.jspecify.annotations.Nullable;

public abstract class AbstractSoundInstance implements SoundInstance {
   protected @Nullable Sound sound;
   protected @Nullable WeighedSoundEvents soundEvent;
   protected final SoundSource source;
   protected final Identifier identifier;
   protected float volume = 1.0F;
   protected float pitch = 1.0F;
   protected double x;
   protected double y;
   protected double z;
   protected boolean looping;
   protected int delay;
   protected SoundInstance.Attenuation attenuation = SoundInstance.Attenuation.LINEAR;
   protected boolean relative;
   protected final RandomSource random;

   protected AbstractSoundInstance(final SoundEvent event, final SoundSource source, final RandomSource random) {
      this(event.location(), source, random);
   }

   protected AbstractSoundInstance(final Identifier identifier, final SoundSource source, final RandomSource random) {
      this.identifier = identifier;
      this.source = source;
      this.random = random;
   }

   @Override
   public Identifier getIdentifier() {
      return this.identifier;
   }

   @Override
   public boolean resolveAndSelectSound(final SoundManager soundManager) {
      WeighedSoundEvents soundEvent = soundManager.getSoundEvent(this.identifier);
      if (soundEvent == null) {
         return false;
      }

      Sound sound = soundEvent.getSound(this.random);
      if (sound == null) {
         return false;
      }

      this.soundEvent = soundEvent;
      this.sound = sound;
      return true;
   }

   @Override
   public Sound getSound() {
      return Objects.requireNonNull(this.sound, "Not resolved");
   }

   @Override
   public WeighedSoundEvents getSoundEvent() {
      return Objects.requireNonNull(this.soundEvent, "Not resolved");
   }

   @Override
   public SoundSource getSource() {
      return this.source;
   }

   @Override
   public boolean isLooping() {
      return this.looping;
   }

   @Override
   public int getDelay() {
      return this.delay;
   }

   @Override
   public float getVolume() {
      return this.volume * this.getSound().getVolume().sample(this.random);
   }

   @Override
   public float getPitch() {
      return this.pitch * this.getSound().getPitch().sample(this.random);
   }

   @Override
   public double getX() {
      return this.x;
   }

   @Override
   public double getY() {
      return this.y;
   }

   @Override
   public double getZ() {
      return this.z;
   }

   @Override
   public SoundInstance.Attenuation getAttenuation() {
      return this.attenuation;
   }

   @Override
   public boolean isRelative() {
      return this.relative;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.identifier + "]";
   }
}
