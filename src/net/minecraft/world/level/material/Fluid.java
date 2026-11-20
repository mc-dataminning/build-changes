package net.minecraft.world.level.material;

import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.IdMapper;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

public abstract class Fluid {
   public static final IdMapper<FluidState> FLUID_STATE_REGISTRY = new IdMapper<>();
   protected final StateDefinition<Fluid, FluidState> stateDefinition;
   private final ResourceKey<Item> bucketItem;
   private final Optional<SoundEvent> pickupSound;
   private final @Nullable ParticleOptions dripParticle;
   private final float explosionResistance;
   private final boolean randomTicking;
   private FluidState defaultFluidState;
   private final Holder.Reference<Fluid> builtInRegistryHolder = BuiltInRegistries.FLUID.createIntrusiveHolder(this);
   private final float drag;
   private final FogType fogType;
   private final boolean useCameraPositionForFogDetection;
   private final float fallDistanceMultiplier;
   private final OptionalDouble dripstoneTransferProbability;
   private final boolean pathfindable;

   protected Fluid(final Fluid.Properties properties) {
      StateDefinition.Builder<Fluid, FluidState> builder = new StateDefinition.Builder<>(this);
      this.createFluidStateDefinition(builder);
      this.stateDefinition = builder.create(Fluid::defaultFluidState, FluidState::new);
      this.registerDefaultState(this.makeDefaultState(this.stateDefinition.any()));
      this.bucketItem = properties.bucketItem;
      this.pickupSound = properties.pickupSound;
      this.dripParticle = properties.dripParticle;
      this.explosionResistance = properties.explosionResistance;
      this.randomTicking = properties.randomTicking;
      this.drag = properties.drag;
      this.fogType = properties.fogType;
      this.useCameraPositionForFogDetection = properties.useCameraPositionForFogDetection;
      this.fallDistanceMultiplier = properties.fallDistanceMultiplier;
      this.dripstoneTransferProbability = properties.dripstoneTransferProbability;
      this.pathfindable = properties.pathfindable;
   }

   protected void createFluidStateDefinition(final StateDefinition.Builder<Fluid, FluidState> builder) {
   }

   protected FluidState makeDefaultState(final FluidState state) {
      return state;
   }

   public StateDefinition<Fluid, FluidState> getStateDefinition() {
      return this.stateDefinition;
   }

   protected final void registerDefaultState(final FluidState state) {
      this.defaultFluidState = state;
   }

   public final FluidState defaultFluidState() {
      return this.defaultFluidState;
   }

   public ResourceKey<Item> getBucket() {
      return this.bucketItem;
   }

   public float getFallDistanceMultiplier() {
      return this.fallDistanceMultiplier;
   }

   protected void animateTick(final Level level, final BlockPos pos, final FluidState fluidState, final RandomSource random) {
   }

   protected void tick(final ServerLevel level, final BlockPos pos, final BlockState blockState, final FluidState fluidState) {
   }

   protected void randomTick(final ServerLevel level, final BlockPos pos, final FluidState fluidState, final RandomSource random) {
   }

   protected void entityInside(final Level level, final BlockPos pos, final Entity entity, final InsideBlockEffectApplier effectApplier) {
   }

   protected @Nullable ParticleOptions getDripParticle() {
      return this.dripParticle;
   }

   protected abstract boolean canBeReplacedWith(FluidState state, final BlockGetter level, final BlockPos pos, FluidState other, Direction direction);

   protected abstract Vec3 getFlow(BlockGetter level, BlockPos pos, FluidState fluidState);

   public double getFlowScale(final Level level) {
      return 0.0;
   }

   public abstract int getTickDelay(LevelReader level);

   protected boolean isRandomlyTicking() {
      return this.randomTicking;
   }

   protected boolean isEmpty() {
      return false;
   }

   protected float getExplosionResistance() {
      return this.explosionResistance;
   }

   public abstract float getHeight(FluidState fluidState, final BlockGetter level, final BlockPos pos);

   public abstract float getOwnHeight(FluidState fluidState);

   protected abstract BlockState createLegacyBlock(FluidState fluidState);

   public abstract boolean isSource(FluidState fluidState);

   public abstract boolean isFalling(final FluidState fluidState);

   public abstract int getAmount(FluidState fluidState);

   public abstract VoxelShape getShape(final FluidState state, final BlockGetter level, final BlockPos pos);

   public @Nullable AABB getAABB(final FluidState state, final BlockGetter level, final BlockPos pos) {
      if (this.isEmpty()) {
         return null;
      }

      float height = state.getHeight(level, pos);
      return new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1.0, pos.getY() + height, pos.getZ() + 1.0);
   }

   public Optional<SoundEvent> getPickupSound() {
      return this.pickupSound;
   }

   @Deprecated
   public Holder.Reference<Fluid> builtInRegistryHolder() {
      return this.builtInRegistryHolder;
   }

   public float getDrag() {
      return this.drag;
   }

   public FogType getFogType() {
      return this.fogType;
   }

   public boolean getUseCameraPositionForFogDetection() {
      return this.useCameraPositionForFogDetection;
   }

   public OptionalDouble dripstoneTransferProbability() {
      return this.dripstoneTransferProbability;
   }

   public boolean isPathfindable() {
      return this.pathfindable;
   }

   public static class Properties {
      private ResourceKey<Item> bucketItem = BlockItemIds.AIR.item();
      private Optional<SoundEvent> pickupSound = Optional.empty();
      private @Nullable ParticleOptions dripParticle;
      private float explosionResistance;
      private boolean randomTicking;
      private float drag = 1.0F;
      private FogType fogType = FogType.NONE;
      private boolean useCameraPositionForFogDetection;
      private float fallDistanceMultiplier;
      private boolean pathfindable;
      private OptionalDouble dripstoneTransferProbability = OptionalDouble.empty();

      private Properties() {
      }

      public static Fluid.Properties of() {
         return new Fluid.Properties();
      }

      public Fluid.Properties bucketItem(final ResourceKey<Item> bucketItem) {
         this.bucketItem = bucketItem;
         return this;
      }

      public Fluid.Properties soundEvent(final SoundEvent pickupSound) {
         this.pickupSound = Optional.of(pickupSound);
         return this;
      }

      public Fluid.Properties dripParticle(final ParticleOptions dripParticle) {
         this.dripParticle = dripParticle;
         return this;
      }

      public Fluid.Properties explosionResistance(final float explosionResistance) {
         this.explosionResistance = explosionResistance;
         return this;
      }

      public Fluid.Properties randomTicking() {
         this.randomTicking = true;
         return this;
      }

      public Fluid.Properties drag(final float drag) {
         this.drag = drag;
         return this;
      }

      public Fluid.Properties fogType(final FogType fogType) {
         this.fogType = fogType;
         return this;
      }

      public Fluid.Properties useCameraPositionForFogDetection() {
         this.useCameraPositionForFogDetection = true;
         return this;
      }

      public Fluid.Properties fallDistanceMultiplier(final float fallDistanceMultiplier) {
         this.fallDistanceMultiplier = fallDistanceMultiplier;
         return this;
      }

      public Fluid.Properties dripstoneTransferProbability(final double dripstoneTransferProbability) {
         this.dripstoneTransferProbability = OptionalDouble.of(dripstoneTransferProbability);
         return this;
      }

      public Fluid.Properties pathfindable() {
         this.pathfindable = true;
         return this;
      }
   }
}
