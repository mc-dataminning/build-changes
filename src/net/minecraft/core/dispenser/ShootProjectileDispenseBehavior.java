package net.minecraft.core.dispenser;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Position;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.util.valueproviders.FloatProvider;
import net.minecraft.util.valueproviders.FloatProviders;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.Vec3;

public record ShootProjectileDispenseBehavior(
   Vec3 offset, double scale, float uncertainty, float power, Optional<ShootProjectileDispenseBehavior.DispenseSound> sound
) implements DispenseBehavior {
   public static final ShootProjectileDispenseBehavior DEFAULT = builder().build();
   public static final float DEFAULT_UNCERTAINTY = 6.0F;
   public static final float DEFAULT_POWER = 1.1F;
   public static final MapCodec<ShootProjectileDispenseBehavior> MAP_CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            Vec3.CODEC.fieldOf("offset").forGetter(ShootProjectileDispenseBehavior::offset),
            Codec.DOUBLE.fieldOf("scale").forGetter(ShootProjectileDispenseBehavior::scale),
            ExtraCodecs.NON_NEGATIVE_FLOAT.fieldOf("uncertainty").forGetter(ShootProjectileDispenseBehavior::uncertainty),
            ExtraCodecs.NON_NEGATIVE_FLOAT.fieldOf("power").forGetter(ShootProjectileDispenseBehavior::power),
            ShootProjectileDispenseBehavior.DispenseSound.CODEC.optionalFieldOf("sound").forGetter(ShootProjectileDispenseBehavior::sound)
         )
         .apply(i, ShootProjectileDispenseBehavior::new)
   );
   private static final ShootProjectileDispenseBehavior.DispenseSound DEFAULT_SOUND = new ShootProjectileDispenseBehavior.DispenseSound(
      SoundEvents.DISPENSER_LAUNCH, 1.0F, 1.2F
   );

   @Override
   public DispenseBehavior.DispenseResult execute(final BlockSource source, final ItemStack dispensed) {
      ServerLevel level = source.level();
      Direction direction = source.state().getValue(DispenserBlock.FACING);
      Position position = DispenserBlock.getDispensePosition(source, this.scale, this.offset);
      if (dispensed.getItem() instanceof ProjectileItem projectileItem) {
         Projectile.spawnProjectileUsingShoot(
            projectileItem.asProjectile(level, position, dispensed, direction),
            level,
            dispensed,
            direction.getStepX(),
            direction.getStepY(),
            direction.getStepZ(),
            this.power,
            this.uncertainty
         );
         dispensed.shrink(1);
         return DispenseBehavior.DispenseResult.success(dispensed);
      } else {
         return DispenseBehavior.DispenseResult.failure();
      }
   }

   @Override
   public void playSuccessSound(final BlockSource source) {
      ShootProjectileDispenseBehavior.DispenseSound sound = this.sound.orElse(DEFAULT_SOUND);
      Direction direction = source.state().getValueOrElse(DispenserBlock.FACING, Direction.UP);
      Vec3 pos = Vec3.atCenterOf(source.pos()).relative(direction, 0.5);
      RandomSource random = source.level().getRandom();
      source.level().playSound(null, pos.x(), pos.y(), pos.z(), sound.sound(), SoundSource.BLOCKS, sound.volume().sample(random), sound.pitch().sample(random));
   }

   public static ShootProjectileDispenseBehavior.Builder builder() {
      return new ShootProjectileDispenseBehavior.Builder();
   }

   @Override
   public MapCodec<ShootProjectileDispenseBehavior> codec() {
      return MAP_CODEC;
   }

   public static class Builder {
      private Vec3 offset = new Vec3(0.0, 0.1, 0.0);
      private double scale = 0.7F;
      private float uncertainty = 6.0F;
      private float power = 1.1F;
      private Optional<ShootProjectileDispenseBehavior.DispenseSound> sound = Optional.empty();

      public ShootProjectileDispenseBehavior.Builder position(final Vec3 offset, final double scale) {
         this.offset = offset;
         this.scale = scale;
         return this;
      }

      public ShootProjectileDispenseBehavior.Builder positionJustOutside() {
         return this.position(Vec3.ZERO, 0.5000099999997474);
      }

      public ShootProjectileDispenseBehavior.Builder uncertainty(final float uncertainty) {
         this.uncertainty = uncertainty;
         return this;
      }

      public ShootProjectileDispenseBehavior.Builder power(final float power) {
         this.power = power;
         return this;
      }

      public ShootProjectileDispenseBehavior.Builder sound(final ShootProjectileDispenseBehavior.DispenseSound sound) {
         this.sound = Optional.of(sound);
         return this;
      }

      public ShootProjectileDispenseBehavior build() {
         return new ShootProjectileDispenseBehavior(this.offset, this.scale, this.uncertainty, this.power, this.sound);
      }
   }

   public record DispenseSound(Holder<SoundEvent> sound, FloatProvider volume, FloatProvider pitch) {
      public static final Codec<ShootProjectileDispenseBehavior.DispenseSound> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               SoundEvent.CODEC.fieldOf("sound").forGetter(ShootProjectileDispenseBehavior.DispenseSound::sound),
               FloatProviders.CODEC.fieldOf("volume").forGetter(ShootProjectileDispenseBehavior.DispenseSound::volume),
               FloatProviders.CODEC.fieldOf("pitch").forGetter(ShootProjectileDispenseBehavior.DispenseSound::pitch)
            )
            .apply(i, ShootProjectileDispenseBehavior.DispenseSound::new)
      );

      public DispenseSound(final Holder<SoundEvent> sound, final float volume, final float pitch) {
         this(sound, ConstantFloat.of(volume), ConstantFloat.of(pitch));
      }
   }
}
