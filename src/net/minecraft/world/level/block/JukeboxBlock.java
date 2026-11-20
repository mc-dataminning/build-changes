package net.minecraft.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.item.component.TypedEntityData;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.BlockHitResult;
import org.jspecify.annotations.Nullable;

public class JukeboxBlock extends BaseEntityBlock {
   public static final BooleanProperty HAS_RECORD = BlockStateProperties.HAS_RECORD;
   public static final BooleanProperty PLAYLIST_MODE = BlockStateProperties.PLAYLIST_MODE;

   protected JukeboxBlock(final BlockBehaviour.Properties properties) {
      super(properties);
      this.registerDefaultState(this.stateDefinition.any().setValue(HAS_RECORD, false).setValue(PLAYLIST_MODE, false));
   }

   @Override
   public @Nullable BlockState getStateForPlacement(final BlockPlaceContext context) {
      return super.getStateForPlacement(context).setValue(PLAYLIST_MODE, JukeboxBlockEntity.isInPlaylistMode(context.getLevel(), context.getClickedPos()));
   }

   @Override
   protected void neighborChanged(
      final BlockState state, final Level level, final BlockPos pos, final Block block, final @Nullable Orientation orientation, final boolean movedByPiston
   ) {
      boolean shouldBeInPlaylistMode = JukeboxBlockEntity.isInPlaylistMode(level, pos);
      if (state.getValue(PLAYLIST_MODE) != shouldBeInPlaylistMode) {
         level.setBlock(pos, state.setValue(PLAYLIST_MODE, shouldBeInPlaylistMode), 2);
      }
   }

   @Override
   public void setPlacedBy(final Level level, final BlockPos pos, final BlockState state, final @Nullable LivingEntity by, final ItemStack itemStack) {
      super.setPlacedBy(level, pos, state, by, itemStack);
      TypedEntityData<BlockEntityType<?>> blockEntityData = itemStack.get(DataComponents.BLOCK_ENTITY_DATA);
      if (blockEntityData != null && blockEntityData.contains("RecordItem")) {
         level.setBlock(pos, state.setValue(HAS_RECORD, true), 2);
      }
   }

   @Override
   protected InteractionResult useWithoutItem(
      final BlockState state, final Level level, final BlockPos pos, final Player player, final BlockHitResult hitResult
   ) {
      if (state.getValue(HAS_RECORD) && level.getBlockEntity(pos) instanceof JukeboxBlockEntity jukebox) {
         jukebox.popOutTheItem();
         return InteractionResult.SUCCESS;
      } else {
         return InteractionResult.PASS;
      }
   }

   @Override
   protected InteractionResult useItemOn(
      final ItemStack itemStack,
      final BlockState state,
      final Level level,
      final BlockPos pos,
      final Player player,
      final InteractionHand hand,
      final BlockHitResult hitResult
   ) {
      if (state.getValue(HAS_RECORD)) {
         return InteractionResult.TRY_WITH_EMPTY_HAND;
      }

      ItemStack toInsert = player.getItemInHand(hand);
      InteractionResult result = JukeboxPlayable.tryInsertIntoJukebox(level, pos, toInsert, player);
      return !result.consumesAction() ? InteractionResult.TRY_WITH_EMPTY_HAND : result;
   }

   @Override
   protected void affectNeighborsAfterRemoval(final BlockState state, final ServerLevel level, final BlockPos pos, final boolean movedByPiston) {
      Containers.updateNeighboursAfterDestroy(state, level, pos);
   }

   @Override
   public BlockEntity newBlockEntity(final BlockPos worldPosition, final BlockState blockState) {
      return new JukeboxBlockEntity(worldPosition, blockState);
   }

   @Override
   public boolean isSignalSource(final BlockState state) {
      return true;
   }

   @Override
   protected int ownSignal(final BlockState state, final BlockGetter level, final BlockPos pos) {
      return level.getBlockEntity(pos) instanceof JukeboxBlockEntity jukebox && jukebox.getSongPlayer().isPlaying() ? 15 : 0;
   }

   @Override
   protected boolean hasAnalogOutputSignal(final BlockState state) {
      return true;
   }

   @Override
   protected int getAnalogOutputSignal(final BlockState state, final Level level, final BlockPos pos, final Direction direction) {
      return level.getBlockEntity(pos) instanceof JukeboxBlockEntity jukebox ? jukebox.getComparatorOutput() : 0;
   }

   @Override
   protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(HAS_RECORD, PLAYLIST_MODE);
   }

   @Override
   public <T extends BlockEntity> @Nullable BlockEntityTicker<T> getTicker(final Level level, final BlockState blockState, final BlockEntityType<T> type) {
      if (blockState.getValue(HAS_RECORD)) {
         return createTickerHelper(type, BlockEntityTypes.JUKEBOX, JukeboxBlockEntity::tickWithRecord);
      } else {
         return blockState.getValue(PLAYLIST_MODE) && !level.isClientSide()
            ? createTickerHelper(type, BlockEntityTypes.JUKEBOX, JukeboxBlockEntity::tickWithoutRecord)
            : null;
      }
   }
}
