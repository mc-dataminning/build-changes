package net.minecraft.world.entity.monster.zombie;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.animal.turtle.Turtle;
import net.minecraft.world.entity.npc.villager.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.throwableitemprojectile.IceBall;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.Vec3;

public class Frostbite extends RangedZombie {
   private static final int MELEE_ATTACK_TICKS = 30;
   private static final int FREEZING_TICKS_ON_MELEE = 60;

   public Frostbite(final EntityType<? extends Frostbite> type, final Level level) {
      super(type, level);
      this.setPathfindingMalus(PathType.POWDER_SNOW, 0.0F);
      this.setPathfindingMalus(PathType.ON_TOP_OF_POWDER_SNOW, 0.0F);
   }

   @Override
   protected void addBehaviourGoals() {
      this.goalSelector
         .addGoal(
            1,
            new RangedZombie.RangedZombieRangedAttackGoal(this, 1.0, this::getRangedAttackIntervalMin, this::getRangedAttackIntervalMax, 16.0F, false, false)
         );
      this.goalSelector.addGoal(2, new RangedZombie.RangedZombieMeleeAttackGoal(this, 1.0, false, 30, false));
      this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1.0));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers(ZombifiedPiglin.class));
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true, false));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
      this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR));
   }

   public static AttributeSupplier.Builder createAttributes() {
      return Zombie.createAttributes().add(Attributes.MAX_HEALTH, 24.0).add(Attributes.MOVEMENT_SPEED, 0.21F);
   }

   @Override
   protected SoundEvent getAmbientSound() {
      return SoundEvents.FROSTBITE_AMBIENT;
   }

   @Override
   protected SoundEvent getHurtSound(final DamageSource source) {
      return SoundEvents.FROSTBITE_HURT;
   }

   @Override
   protected SoundEvent getDeathSound() {
      return SoundEvents.FROSTBITE_DEATH;
   }

   @Override
   protected SoundEvent getStepSound() {
      return SoundEvents.FROSTBITE_STEP;
   }

   @Override
   protected void populateDefaultEquipmentSlots(final RandomSource random, final DifficultyInstance difficulty) {
      if (random.nextFloat() > 0.75) {
         this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.ICE_BALL));
      }
   }

   @Override
   public Item getRangedWeaponType() {
      return Items.ICE_BALL;
   }

   @Override
   protected Projectile getProjectile(final Level level, final LivingEntity owner, final ItemStack item) {
      return new IceBall(level, owner, item);
   }

   @Override
   protected SoundEvent getRangedAttackSound() {
      return SoundEvents.DROWNED_SHOOT;
   }

   @Override
   public TagKey<Item> getPreferredWeaponType() {
      return ItemTags.FROSTBITE_PREFERRED_WEAPONS;
   }

   @Override
   protected @LevelEvent.Value int getConversionSound() {
      return 1057;
   }

   @Override
   protected EntityType<? extends Zombie> convertsToWhenDrowning() {
      return EntityTypes.ZOMBIE;
   }

   @Override
   public boolean doHurtTarget(final ServerLevel level, final Entity target) {
      boolean result = super.doHurtTarget(level, target);
      if (result && target instanceof LivingEntity livingEntity) {
         livingEntity.addEffect(new MobEffectInstance(MobEffects.FREEZING, 60), this);
      }

      return result;
   }

   @Override
   public boolean canBeAffected(final MobEffectInstance newEffect) {
      return newEffect.is(MobEffects.FREEZING) ? false : super.canBeAffected(newEffect);
   }

   private int getRangedAttackIntervalMin() {
      return (int)(20.0F * switch (this.level().getDifficulty()) {
         case PEACEFUL, NORMAL -> 1.0F;
         case EASY -> 3.0F;
         case HARD -> 0.75F;
      });
   }

   private int getRangedAttackIntervalMax() {
      return (int)(20.0F * switch (this.level().getDifficulty()) {
         case PEACEFUL, NORMAL -> 2.0F;
         case EASY -> 3.0F;
         case HARD -> 1.5F;
      });
   }

   @Override
   public void makeStuckInBlock(final BlockState state, final Vec3 speedMultiplier) {
      if (!state.is(Blocks.POWDER_SNOW)) {
         super.makeStuckInBlock(state, speedMultiplier);
      }
   }

   @Override
   public void performRangedAttack(final LivingEntity target, final float power) {
      super.performRangedAttack(target, power);
      this.swingForAttack(InteractionHand.MAIN_HAND);
   }
}
