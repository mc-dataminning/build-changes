package net.minecraft.world.level.material;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.InsideBlockEffectType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gamerules.GameRules;

public class WaterFluid extends FlowingFluid {
   public static final double FLOW_SCALE = 0.014;

   public WaterFluid(final Fluid.Properties properties) {
      super(properties);
   }

   @Override
   public void animateTick(final Level level, final BlockPos pos, final FluidState fluidState, final RandomSource random) {
      if (!fluidState.isSource() && !fluidState.isFalling()) {
         if (random.nextInt(64) == 0) {
            level.playLocalSound(
               pos.getX() + 0.5,
               pos.getY() + 0.5,
               pos.getZ() + 0.5,
               SoundEvents.WATER_AMBIENT,
               SoundSource.AMBIENT,
               random.nextFloat() * 0.25F + 0.75F,
               random.nextFloat() + 0.5F,
               false
            );
         }
      } else if (random.nextInt(10) == 0) {
         level.addParticle(
            ParticleTypes.UNDERWATER, pos.getX() + random.nextDouble(), pos.getY() + random.nextDouble(), pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0
         );
      }
   }

   @Override
   protected boolean canConvertToSource(final ServerLevel level) {
      return level.getGameRules().get(GameRules.WATER_SOURCE_CONVERSION);
   }

   @Override
   protected void beforeDestroyingBlock(final LevelAccessor level, final BlockPos pos, final BlockState state) {
   }

   @Override
   protected void entityInside(final Level level, final BlockPos pos, final Entity entity, final InsideBlockEffectApplier effectApplier) {
      effectApplier.apply(InsideBlockEffectType.EXTINGUISH);
   }

   @Override
   public double getFlowScale(final Level level) {
      return 0.014;
   }

   @Override
   public int getSlopeFindDistance(final LevelReader level) {
      return 4;
   }

   @Override
   public BlockState createLegacyBlock(final FluidState fluidState) {
      return Blocks.WATER.defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(fluidState));
   }

   @Override
   public int getDropOff(final LevelReader level) {
      return 1;
   }

   @Override
   public int getTickDelay(final LevelReader level) {
      return 5;
   }

   @Override
   public boolean canBeReplacedWith(final FluidState state, final BlockGetter level, final BlockPos pos, final FluidState other, final Direction direction) {
      return direction == Direction.DOWN && !other.is(FluidTags.WATER);
   }
}
