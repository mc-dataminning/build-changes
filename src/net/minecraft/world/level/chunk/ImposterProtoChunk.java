package net.minecraft.world.level.chunk;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blending.BlendingData;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.lighting.ChunkSkyLightSources;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.ticks.BlackholeTickAccess;
import net.minecraft.world.ticks.TickContainerAccess;
import org.jspecify.annotations.Nullable;

public class ImposterProtoChunk extends ProtoChunk {
   private final LevelChunk wrapped;

   public ImposterProtoChunk(final LevelChunk wrapped) {
      super(wrapped.getPos(), UpgradeData.EMPTY, wrapped.levelHeightAccessor, wrapped.getLevel().palettedContainerFactory(), wrapped.getBlendingData());
      this.wrapped = wrapped;
   }

   @Override
   public @Nullable BlockEntity getBlockEntity(final BlockPos pos) {
      return this.wrapped.getBlockEntity(pos);
   }

   @Override
   public BlockState getBlockState(final BlockPos pos) {
      return this.wrapped.getBlockState(pos);
   }

   @Override
   public FluidState getFluidState(final BlockPos pos) {
      return this.wrapped.getFluidState(pos);
   }

   @Override
   public LevelChunkSection getSection(final int sectionIndex) {
      return super.getSection(sectionIndex);
   }

   @Override
   public @Nullable BlockState setBlockState(final BlockPos pos, final BlockState state, final @Block.UpdateFlags int flags) {
      return null;
   }

   @Override
   public void setBlockEntity(final BlockEntity blockEntity) {
   }

   @Override
   public void addEntity(final Entity entity) {
   }

   @Override
   public void setPersistedStatus(final ChunkStatus status) {
   }

   @Override
   public LevelChunkSection[] getSections() {
      return this.wrapped.getSections();
   }

   @Override
   public void setHeightmap(final Heightmap.Types key, final long[] data) {
   }

   private Heightmap.Types fixType(final Heightmap.Types type) {
      if (type == Heightmap.Types.WORLD_SURFACE_WG) {
         return Heightmap.Types.WORLD_SURFACE;
      } else {
         return type == Heightmap.Types.OCEAN_FLOOR_WG ? Heightmap.Types.OCEAN_FLOOR : type;
      }
   }

   @Override
   public Heightmap getOrCreateHeightmapUnprimed(final Heightmap.Types type) {
      return this.wrapped.getOrCreateHeightmapUnprimed(type);
   }

   @Override
   public int getHeight(final Heightmap.Types type, final int x, final int z) {
      return this.wrapped.getHeight(this.fixType(type), x, z);
   }

   @Override
   public Holder<Biome> getBiome(final int x, final int y, final int z) {
      return this.wrapped.getBiome(x, y, z);
   }

   @Override
   public ChunkPos getPos() {
      return this.wrapped.getPos();
   }

   @Override
   public @Nullable StructureStart getStartForStructure(final Structure structure) {
      return this.wrapped.getStartForStructure(structure);
   }

   @Override
   public void setStartForStructure(final Structure structure, final StructureStart structureStart) {
   }

   @Override
   public Map<Structure, StructureStart> getAllStarts() {
      return this.wrapped.getAllStarts();
   }

   @Override
   public void setAllStarts(final Map<Structure, StructureStart> starts) {
   }

   @Override
   public LongSet getReferencesForStructure(final Structure structure) {
      return this.wrapped.getReferencesForStructure(structure);
   }

   @Override
   public void addReferenceForStructure(final Structure structure, final long reference) {
   }

   @Override
   public Map<Structure, LongSet> getAllReferences() {
      return this.wrapped.getAllReferences();
   }

   @Override
   public void setAllReferences(final Map<Structure, LongSet> data) {
   }

   @Override
   public void markUnsaved() {
      this.wrapped.markUnsaved();
   }

   @Override
   public boolean canBeSerialized() {
      return false;
   }

   @Override
   public boolean tryMarkSaved() {
      return false;
   }

   @Override
   public boolean isUnsaved() {
      return false;
   }

   @Override
   public ChunkStatus getPersistedStatus() {
      return this.wrapped.getPersistedStatus();
   }

   @Override
   public void removeBlockEntity(final BlockPos pos) {
   }

   @Override
   public void markPosForPostProcessing(final BlockPos blockPos) {
   }

   @Override
   public void setBlockEntityNbt(final CompoundTag entityTag) {
   }

   @Override
   public @Nullable CompoundTag getBlockEntityNbt(final BlockPos blockPos) {
      return this.wrapped.getBlockEntityNbt(blockPos);
   }

   @Override
   public @Nullable CompoundTag getBlockEntityNbtForSaving(final BlockPos blockPos, final HolderLookup.Provider registryAccess) {
      return this.wrapped.getBlockEntityNbtForSaving(blockPos, registryAccess);
   }

   @Override
   public void findBlocks(final Predicate<BlockState> predicate, final BiConsumer<BlockPos, BlockState> consumer) {
      this.wrapped.findBlocks(predicate, consumer);
   }

   @Override
   public TickContainerAccess<Block> getBlockTicks() {
      return BlackholeTickAccess.emptyContainer();
   }

   @Override
   public TickContainerAccess<Fluid> getFluidTicks() {
      return BlackholeTickAccess.emptyContainer();
   }

   @Override
   public ChunkAccess.PackedTicks getTicksForSerialization(final long currentTick) {
      return this.wrapped.getTicksForSerialization(currentTick);
   }

   @Override
   public @Nullable BlendingData getBlendingData() {
      return this.wrapped.getBlendingData();
   }

   public LevelChunk getWrapped() {
      return this.wrapped;
   }

   @Override
   public boolean isLightCorrect() {
      return this.wrapped.isLightCorrect();
   }

   @Override
   public void setLightCorrect(final boolean isLightCorrect) {
      this.wrapped.setLightCorrect(isLightCorrect);
   }

   @Override
   public void fillBiomes(final BiomeResolver biomeResolver) {
   }

   @Override
   public void initializeLightSources() {
      this.wrapped.initializeLightSources();
   }

   @Override
   public ChunkSkyLightSources getSkyLightSources() {
      return this.wrapped.getSkyLightSources();
   }
}
