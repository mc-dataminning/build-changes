package net.minecraft.world.level.levelgen.structure;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.QuartPos;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.profiling.jfr.JvmProfiler;
import net.minecraft.util.profiling.jfr.callback.ProfiledDuration;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.pieces.PiecesContainer;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public abstract class Structure {
   public static final Codec<Structure> DIRECT_CODEC = BuiltInRegistries.STRUCTURE_TYPE.byNameCodec().dispatch(Structure::type, StructureType::codec);
   public static final Codec<Holder<Structure>> CODEC = RegistryCodecs.holder(Registries.STRUCTURE, DIRECT_CODEC);
   protected final Structure.StructureSettings settings;

   public static <S extends Structure> RecordCodecBuilder<S, Structure.StructureSettings> settingsCodec(final Instance<S> i) {
      return Structure.StructureSettings.CODEC.forGetter(e -> e.settings);
   }

   public static <S extends Structure> MapCodec<S> simpleCodec(final Function<Structure.StructureSettings, S> constructor) {
      return RecordCodecBuilder.mapCodec(i -> i.group(settingsCodec(i)).apply(i, constructor));
   }

   protected Structure(final Structure.StructureSettings settings) {
      this.settings = settings;
   }

   public HolderSet<Biome> biomes() {
      return this.settings.biomes;
   }

   public Map<MobCategory, StructureSpawnOverride> spawnOverrides() {
      return this.settings.spawnOverrides;
   }

   public GenerationStep.Decoration step() {
      return this.settings.step;
   }

   public TerrainAdjustment terrainAdaptation() {
      return this.settings.terrainAdaptation;
   }

   public BoundingBox adjustBoundingBox(final BoundingBox boundingBox) {
      return this.terrainAdaptation() != TerrainAdjustment.NONE ? boundingBox.inflatedBy(12) : boundingBox;
   }

   public StructureStart generate(
      final Holder<Structure> selected,
      final ResourceKey<Level> dimension,
      final RegistryAccess registryAccess,
      final ChunkGenerator chunkGenerator,
      final BiomeSource biomeSource,
      final Climate.Sampler climateSampler,
      final RandomState randomState,
      final StructureTemplateManager structureTemplateManager,
      final long seed,
      final ChunkPos sourceChunkPos,
      final int references,
      final LevelHeightAccessor heightAccessor,
      final Predicate<Holder<Biome>> validBiome
   ) {
      ProfiledDuration profiled = JvmProfiler.INSTANCE.onStructureGenerate(sourceChunkPos, dimension, selected);
      Structure.GenerationContext context = new Structure.GenerationContext(
         registryAccess, chunkGenerator, biomeSource, climateSampler, randomState, structureTemplateManager, seed, sourceChunkPos, heightAccessor, validBiome
      );
      Optional<Structure.GenerationStub> generation = this.findValidGenerationPoint(context);
      if (generation.isPresent()) {
         StructurePiecesBuilder builder = generation.get().getPiecesBuilder();
         StructureStart testStart = new StructureStart(this, sourceChunkPos, references, builder.build());
         if (testStart.isValid()) {
            if (profiled != null) {
               profiled.finish(true);
            }

            return testStart;
         }
      }

      if (profiled != null) {
         profiled.finish(false);
      }

      return StructureStart.INVALID_START;
   }

   protected static Optional<Structure.GenerationStub> onTopOfChunkCenter(
      final Structure.GenerationContext context, final Heightmap.Types heightmap, final Consumer<StructurePiecesBuilder> generator
   ) {
      return !context.couldValidBiomeExistOnTopOfChunkCenter() ? Optional.empty() : onTopOfChunkCenterWithoutBiomeCheck(context, heightmap, generator);
   }

   protected static Optional<Structure.GenerationStub> onTopOfChunkCenterWithoutBiomeCheck(
      final Structure.GenerationContext context, final Heightmap.Types heightmap, final Consumer<StructurePiecesBuilder> generator
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual net/minecraft/world/level/levelgen/structure/Structure$GenerationContext.chunkPos ()Lnet/minecraft/world/level/ChunkPos;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual net/minecraft/world/level/ChunkPos.getMiddleBlockX ()I
      // 09: istore 4
      // 0b: aload 3
      // 0c: invokevirtual net/minecraft/world/level/ChunkPos.getMiddleBlockZ ()I
      // 0f: istore 5
      // 11: aload 0
      // 12: invokevirtual net/minecraft/world/level/levelgen/structure/Structure$GenerationContext.chunkGenerator ()Lnet/minecraft/world/level/chunk/ChunkGenerator;
      // 15: iload 4
      // 17: iload 5
      // 19: aload 1
      // 1a: aload 0
      // 1b: invokevirtual net/minecraft/world/level/levelgen/structure/Structure$GenerationContext.heightAccessor ()Lnet/minecraft/world/level/LevelHeightAccessor;
      // 1e: aload 0
      // 1f: invokevirtual net/minecraft/world/level/levelgen/structure/Structure$GenerationContext.randomState ()Lnet/minecraft/world/level/levelgen/RandomState;
      // 22: invokevirtual net/minecraft/world/level/chunk/ChunkGenerator.getFirstOccupiedHeight (IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I
      // 25: istore 6
      // 27: new net/minecraft/world/level/levelgen/structure/Structure$GenerationStub
      // 2a: dup
      // 2b: new net/minecraft/core/BlockPos
      // 2e: dup
      // 2f: iload 4
      // 31: iload 6
      // 33: iload 5
      // 35: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 38: aload 2
      // 39: invokespecial net/minecraft/world/level/levelgen/structure/Structure$GenerationStub.<init> (Lnet/minecraft/core/BlockPos;Ljava/util/function/Consumer;)V
      // 3c: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
      // 3f: areturn
   }

   public void afterPlace(
      final WorldGenLevel level,
      final StructureManager structureManager,
      final ChunkGenerator generator,
      final RandomSource random,
      final BoundingBox chunkBB,
      final ChunkPos chunkPos,
      final PiecesContainer pieces
   ) {
   }

   private static int[] getCornerHeights(final Structure.GenerationContext context, final int minX, final int sizeX, final int minZ, final int sizeZ) {
      ChunkGenerator chunkGenerator = context.chunkGenerator();
      LevelHeightAccessor heightAccessor = context.heightAccessor();
      RandomState randomState = context.randomState();
      return new int[]{
         chunkGenerator.getFirstOccupiedHeight(minX, minZ, Heightmap.Types.WORLD_SURFACE_WG, heightAccessor, randomState),
         chunkGenerator.getFirstOccupiedHeight(minX, minZ + sizeZ, Heightmap.Types.WORLD_SURFACE_WG, heightAccessor, randomState),
         chunkGenerator.getFirstOccupiedHeight(minX + sizeX, minZ, Heightmap.Types.WORLD_SURFACE_WG, heightAccessor, randomState),
         chunkGenerator.getFirstOccupiedHeight(minX + sizeX, minZ + sizeZ, Heightmap.Types.WORLD_SURFACE_WG, heightAccessor, randomState)
      };
   }

   public static int getMeanFirstOccupiedHeight(final Structure.GenerationContext context, final int minX, final int sizeX, final int minZ, final int sizeZ) {
      int[] cornerHeights = getCornerHeights(context, minX, sizeX, minZ, sizeZ);
      return (cornerHeights[0] + cornerHeights[1] + cornerHeights[2] + cornerHeights[3]) / 4;
   }

   protected static int getLowestY(final Structure.GenerationContext context, final int sizeX, final int sizeZ) {
      ChunkPos chunkPos = context.chunkPos();
      int minX = chunkPos.getMinBlockX();
      int minZ = chunkPos.getMinBlockZ();
      return getLowestY(context, minX, minZ, sizeX, sizeZ);
   }

   protected static int getLowestY(final Structure.GenerationContext context, final int minX, final int minZ, final int sizeX, final int sizeZ) {
      int[] cornerHeights = getCornerHeights(context, minX, sizeX, minZ, sizeZ);
      return Math.min(Math.min(cornerHeights[0], cornerHeights[1]), Math.min(cornerHeights[2], cornerHeights[3]));
   }

   @Deprecated
   protected BlockPos getLowestYIn5by5Box(final Structure.GenerationContext context, final int blockX, final int blockZ, final Rotation rotation) {
      int offsetX = 5;
      int offsetZ = 5;
      if (rotation == Rotation.CLOCKWISE_90) {
         offsetX = -5;
      } else if (rotation == Rotation.CLOCKWISE_180) {
         offsetX = -5;
         offsetZ = -5;
      } else if (rotation == Rotation.COUNTERCLOCKWISE_90) {
         offsetZ = -5;
      }

      return new BlockPos(blockX, getLowestY(context, blockX, blockZ, offsetX, offsetZ), blockZ);
   }

   protected abstract Optional<Structure.GenerationStub> findGenerationPoint(final Structure.GenerationContext context);

   public Optional<Structure.GenerationStub> findValidGenerationPoint(final Structure.GenerationContext context) {
      return this.findGenerationPoint(context).filter(context::isValidBiome);
   }

   public abstract StructureType<?> type();

   public static record GenerationContext(
      RegistryAccess registryAccess,
      ChunkGenerator chunkGenerator,
      BiomeSource biomeSource,
      Climate.Sampler climateSampler,
      BiomeResolver biomeResolver,
      RandomState randomState,
      StructureTemplateManager structureTemplateManager,
      WorldgenRandom random,
      long seed,
      ChunkPos chunkPos,
      LevelHeightAccessor heightAccessor,
      Predicate<Holder<Biome>> validBiome
   ) {
      public GenerationContext(
         final RegistryAccess registryAccess,
         final ChunkGenerator chunkGenerator,
         final BiomeSource biomeSource,
         final Climate.Sampler climateSampler,
         final RandomState randomState,
         final StructureTemplateManager structureTemplateManager,
         final long seed,
         final ChunkPos chunkPos,
         final LevelHeightAccessor heightAccessor,
         final Predicate<Holder<Biome>> validBiome
      ) {
         this(
            registryAccess,
            chunkGenerator,
            biomeSource,
            climateSampler,
            biomeSource.createResolver(climateSampler),
            randomState,
            structureTemplateManager,
            makeRandom(seed, chunkPos),
            seed,
            chunkPos,
            heightAccessor,
            validBiome
         );
      }

      private static WorldgenRandom makeRandom(final long seed, final ChunkPos chunkPos) {
         WorldgenRandom random = new WorldgenRandom(new LegacyRandomSource(0L));
         random.setLargeFeatureSeed(seed, chunkPos.x(), chunkPos.z());
         return random;
      }

      public boolean isValidBiome(final Structure.GenerationStub stub) {
         BlockPos startPos = stub.position();
         return this.validBiome
            .test(
               this.biomeResolver.getNoiseBiome(QuartPos.fromBlock(startPos.getX()), QuartPos.fromBlock(startPos.getY()), QuartPos.fromBlock(startPos.getZ()))
            );
      }

      public boolean couldStructureExistInColumn(final int blockX, final int blockZ, final int minBlockY, final int maxBlockY) {
         int quartX = QuartPos.fromBlock(blockX);
         int quartZ = QuartPos.fromBlock(blockZ);
         int minQuartY = QuartPos.fromBlock(minBlockY);
         int maxQuartY = QuartPos.fromBlock(maxBlockY);
         BiomeResolver columnResolver = this.biomeSource
            .createResolverForChunk(this.climateSampler, quartX, minQuartY, quartZ, 1, maxQuartY - minQuartY + 1, 1);

         for (int quartY = minQuartY; quartY <= maxQuartY; quartY++) {
            if (this.validBiome.test(columnResolver.getNoiseBiome(quartX, quartY, quartZ))) {
               return true;
            }
         }

         return false;
      }

      public boolean couldValidBiomeExistInTerrainColumn(final int blockX, final int blockZ) {
         return this.couldStructureExistInColumn(blockX, blockZ, this.heightAccessor.getMinY() - 1, this.heightAccessor.getMaxY());
      }

      public boolean couldValidBiomeExistOnTopOfChunkCenter() {
         return this.couldValidBiomeExistInTerrainColumn(this.chunkPos.getMiddleBlockX(), this.chunkPos.getMiddleBlockZ());
      }
   }

   public static record GenerationStub(BlockPos position, Either<Consumer<StructurePiecesBuilder>, StructurePiecesBuilder> generator) {
      public GenerationStub(final BlockPos position, final Consumer<StructurePiecesBuilder> generator) {
         this(position, Either.left(generator));
      }

      public StructurePiecesBuilder getPiecesBuilder() {
         return (StructurePiecesBuilder)this.generator.map(pieceGenerator -> {
            StructurePiecesBuilder newBuilder = new StructurePiecesBuilder();
            pieceGenerator.accept(newBuilder);
            return newBuilder;
         }, previousBuilder -> previousBuilder);
      }
   }

   public static record StructureSettings(
      HolderSet<Biome> biomes, Map<MobCategory, StructureSpawnOverride> spawnOverrides, GenerationStep.Decoration step, TerrainAdjustment terrainAdaptation
   ) {
      private static final Structure.StructureSettings DEFAULT = new Structure.StructureSettings(
         HolderSet.empty(), Map.of(), GenerationStep.Decoration.SURFACE_STRUCTURES, TerrainAdjustment.NONE
      );
      public static final MapCodec<Structure.StructureSettings> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(
                  RegistryCodecs.holderSet(Registries.BIOME).fieldOf("biomes").forGetter(Structure.StructureSettings::biomes),
                  Codec.simpleMap(MobCategory.CODEC, StructureSpawnOverride.CODEC, StringRepresentable.keys(MobCategory.values()))
                     .fieldOf("spawn_overrides")
                     .forGetter(Structure.StructureSettings::spawnOverrides),
                  GenerationStep.Decoration.CODEC.fieldOf("step").forGetter(Structure.StructureSettings::step),
                  TerrainAdjustment.CODEC
                     .optionalFieldOf("terrain_adaptation", DEFAULT.terrainAdaptation)
                     .forGetter(Structure.StructureSettings::terrainAdaptation)
               )
               .apply(i, Structure.StructureSettings::new)
      );

      public StructureSettings(final HolderSet<Biome> biomes) {
         this(biomes, DEFAULT.spawnOverrides, DEFAULT.step, DEFAULT.terrainAdaptation);
      }

      public static class Builder {
         private final HolderSet<Biome> biomes;
         private Map<MobCategory, StructureSpawnOverride> spawnOverrides;
         private GenerationStep.Decoration step;
         private TerrainAdjustment terrainAdaption;

         public Builder(final HolderSet<Biome> biomes) {
            this.spawnOverrides = Structure.StructureSettings.DEFAULT.spawnOverrides;
            this.step = Structure.StructureSettings.DEFAULT.step;
            this.terrainAdaption = Structure.StructureSettings.DEFAULT.terrainAdaptation;
            this.biomes = biomes;
         }

         public Structure.StructureSettings.Builder spawnOverrides(final Map<MobCategory, StructureSpawnOverride> spawnOverrides) {
            this.spawnOverrides = spawnOverrides;
            return this;
         }

         public Structure.StructureSettings.Builder generationStep(final GenerationStep.Decoration step) {
            this.step = step;
            return this;
         }

         public Structure.StructureSettings.Builder terrainAdapation(final TerrainAdjustment terrainAdaption) {
            this.terrainAdaption = terrainAdaption;
            return this;
         }

         public Structure.StructureSettings build() {
            return new Structure.StructureSettings(this.biomes, this.spawnOverrides, this.step, this.terrainAdaption);
         }
      }
   }
}
