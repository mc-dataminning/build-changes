package net.minecraft.world.level.levelgen.presets;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList;
import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterLists;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.DebugLevelSource;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.minecraft.world.level.levelgen.flat.FlatLayerInfo;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.StructureSet;

public class WorldPresets {
   public static final ResourceKey<WorldPreset> NORMAL = register("normal");
   public static final ResourceKey<WorldPreset> FLAT = register("flat");
   public static final ResourceKey<WorldPreset> FLAT_ALL_DIMENSIONS = register("flat_all_dimensions");
   public static final ResourceKey<WorldPreset> LARGE_BIOMES = register("large_biomes");
   public static final ResourceKey<WorldPreset> AMPLIFIED = register("amplified");
   public static final ResourceKey<WorldPreset> SINGLE_BIOME_SURFACE = register("single_biome_surface");
   public static final ResourceKey<WorldPreset> DEBUG = register("debug_all_block_states");

   public static void bootstrap(final BootstrapContext<WorldPreset> context) {
      new WorldPresets.Bootstrap(context).bootstrap();
   }

   private static ResourceKey<WorldPreset> register(final String name) {
      return ResourceKey.create(Registries.WORLD_PRESET, Identifier.withDefaultNamespace(name));
   }

   public static Optional<ResourceKey<WorldPreset>> fromSettings(final WorldDimensions dimensions) {
      return dimensions.get(LevelStem.OVERWORLD).flatMap(levelStem -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ChunkGenerator selector0$temp = (ChunkGenerator)var10000;

         levelStem.generator();
         return switch (selector0$temp) {
            case FlatLevelSource ignored -> Optional.of(FLAT);
            case DebugLevelSource ignoredx -> Optional.of(DEBUG);
            case NoiseBasedChunkGenerator ignoredxx -> Optional.of(NORMAL);
            default -> Optional.empty();
         };
      });
   }

   public static WorldDimensions createNormalWorldDimensions(final HolderLookup.Provider registries) {
      return registries.lookupOrThrow(Registries.WORLD_PRESET).getOrThrow(NORMAL).value().createWorldDimensions();
   }

   public static LevelStem getNormalOverworld(final HolderLookup.Provider registries) {
      return registries.lookupOrThrow(Registries.WORLD_PRESET).getOrThrow(NORMAL).value().overworld().orElseThrow();
   }

   public static WorldDimensions createTestWorldDimensions(final HolderLookup.Provider registries) {
      return registries.lookupOrThrow(Registries.WORLD_PRESET).getOrThrow(FLAT_ALL_DIMENSIONS).value().createWorldDimensions();
   }

   private static class Bootstrap {
      private final BootstrapContext<WorldPreset> context;
      private final HolderGetter<NoiseGeneratorSettings> noiseSettings;
      private final HolderGetter<Biome> biomes;
      private final HolderGetter<PlacedFeature> placedFeatures;
      private final HolderGetter<StructureSet> structureSets;
      private final HolderGetter<MultiNoiseBiomeSourceParameterList> multiNoiseBiomeSourceParameterLists;
      private final Holder<DimensionType> overworldDimensionType;
      private final Holder<DimensionType> netherDimensionType;
      private final Holder<DimensionType> endDimensionType;
      private final LevelStem netherStem;
      private final LevelStem endStem;

      private Bootstrap(final BootstrapContext<WorldPreset> context) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 00: aload 0
         // 01: invokespecial java/lang/Object.<init> ()V
         // 04: aload 0
         // 05: aload 1
         // 06: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.context Lnet/minecraft/data/worldgen/BootstrapContext;
         // 09: aload 1
         // 0a: getstatic net/minecraft/core/registries/Registries.DIMENSION_TYPE Lnet/minecraft/resources/ResourceKey;
         // 0d: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 12: astore 2
         // 13: aload 0
         // 14: aload 1
         // 15: getstatic net/minecraft/core/registries/Registries.NOISE_SETTINGS Lnet/minecraft/resources/ResourceKey;
         // 18: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 1d: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.noiseSettings Lnet/minecraft/core/HolderGetter;
         // 20: aload 0
         // 21: aload 1
         // 22: getstatic net/minecraft/core/registries/Registries.BIOME Lnet/minecraft/resources/ResourceKey;
         // 25: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 2a: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.biomes Lnet/minecraft/core/HolderGetter;
         // 2d: aload 0
         // 2e: aload 1
         // 2f: getstatic net/minecraft/core/registries/Registries.PLACED_FEATURE Lnet/minecraft/resources/ResourceKey;
         // 32: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 37: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.placedFeatures Lnet/minecraft/core/HolderGetter;
         // 3a: aload 0
         // 3b: aload 1
         // 3c: getstatic net/minecraft/core/registries/Registries.STRUCTURE_SET Lnet/minecraft/resources/ResourceKey;
         // 3f: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 44: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.structureSets Lnet/minecraft/core/HolderGetter;
         // 47: aload 0
         // 48: aload 1
         // 49: getstatic net/minecraft/core/registries/Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST Lnet/minecraft/resources/ResourceKey;
         // 4c: invokeinterface net/minecraft/data/worldgen/BootstrapContext.lookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderGetter; 2
         // 51: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.multiNoiseBiomeSourceParameterLists Lnet/minecraft/core/HolderGetter;
         // 54: aload 0
         // 55: aload 2
         // 56: getstatic net/minecraft/world/level/dimension/BuiltinDimensionTypes.OVERWORLD Lnet/minecraft/resources/ResourceKey;
         // 59: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // 5e: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.overworldDimensionType Lnet/minecraft/core/Holder;
         // 61: aload 0
         // 62: aload 2
         // 63: getstatic net/minecraft/world/level/dimension/BuiltinDimensionTypes.NETHER Lnet/minecraft/resources/ResourceKey;
         // 66: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // 6b: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.netherDimensionType Lnet/minecraft/core/Holder;
         // 6e: aload 0
         // 6f: aload 2
         // 70: getstatic net/minecraft/world/level/dimension/BuiltinDimensionTypes.END Lnet/minecraft/resources/ResourceKey;
         // 73: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // 78: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.endDimensionType Lnet/minecraft/core/Holder;
         // 7b: aload 0
         // 7c: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.noiseSettings Lnet/minecraft/core/HolderGetter;
         // 7f: getstatic net/minecraft/world/level/levelgen/NoiseGeneratorSettings.NETHER Lnet/minecraft/resources/ResourceKey;
         // 82: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // 87: astore 3
         // 88: aload 0
         // 89: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.multiNoiseBiomeSourceParameterLists Lnet/minecraft/core/HolderGetter;
         // 8c: getstatic net/minecraft/world/level/biome/MultiNoiseBiomeSourceParameterLists.NETHER Lnet/minecraft/resources/ResourceKey;
         // 8f: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // 94: astore 4
         // 96: aload 0
         // 97: new net/minecraft/world/level/dimension/LevelStem
         // 9a: dup
         // 9b: aload 0
         // 9c: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.netherDimensionType Lnet/minecraft/core/Holder;
         // 9f: new net/minecraft/world/level/levelgen/NoiseBasedChunkGenerator
         // a2: dup
         // a3: aload 4
         // a5: invokestatic net/minecraft/world/level/biome/MultiNoiseBiomeSource.createFromPreset (Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;
         // a8: aload 3
         // a9: invokespecial net/minecraft/world/level/levelgen/NoiseBasedChunkGenerator.<init> (Lnet/minecraft/world/level/biome/BiomeSource;Lnet/minecraft/core/Holder;)V
         // ac: invokespecial net/minecraft/world/level/dimension/LevelStem.<init> (Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/chunk/ChunkGenerator;)V
         // af: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.netherStem Lnet/minecraft/world/level/dimension/LevelStem;
         // b2: aload 0
         // b3: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.noiseSettings Lnet/minecraft/core/HolderGetter;
         // b6: getstatic net/minecraft/world/level/levelgen/NoiseGeneratorSettings.END Lnet/minecraft/resources/ResourceKey;
         // b9: invokeinterface net/minecraft/core/HolderGetter.getOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference; 2
         // be: astore 5
         // c0: aload 0
         // c1: new net/minecraft/world/level/dimension/LevelStem
         // c4: dup
         // c5: aload 0
         // c6: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.endDimensionType Lnet/minecraft/core/Holder;
         // c9: new net/minecraft/world/level/levelgen/NoiseBasedChunkGenerator
         // cc: dup
         // cd: aload 0
         // ce: getfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.biomes Lnet/minecraft/core/HolderGetter;
         // d1: invokestatic net/minecraft/world/level/biome/TheEndBiomeSource.create (Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/TheEndBiomeSource;
         // d4: aload 5
         // d6: invokespecial net/minecraft/world/level/levelgen/NoiseBasedChunkGenerator.<init> (Lnet/minecraft/world/level/biome/BiomeSource;Lnet/minecraft/core/Holder;)V
         // d9: invokespecial net/minecraft/world/level/dimension/LevelStem.<init> (Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/chunk/ChunkGenerator;)V
         // dc: putfield net/minecraft/world/level/levelgen/presets/WorldPresets$Bootstrap.endStem Lnet/minecraft/world/level/dimension/LevelStem;
         // df: return
      }

      private LevelStem makeOverworld(final ChunkGenerator generator) {
         return new LevelStem(this.overworldDimensionType, generator);
      }

      private LevelStem makeNether(final ChunkGenerator generator) {
         return new LevelStem(this.netherDimensionType, generator);
      }

      private LevelStem makeEnd(final ChunkGenerator generator) {
         return new LevelStem(this.endDimensionType, generator);
      }

      private LevelStem makeNoiseBasedOverworld(final BiomeSource overworldBiomeSource, final Holder<NoiseGeneratorSettings> noiseSettings) {
         return this.makeOverworld(new NoiseBasedChunkGenerator(overworldBiomeSource, noiseSettings));
      }

      private WorldPreset createPresetWithCustomOverworld(final LevelStem overworldStem) {
         return new WorldPreset(Map.of(LevelStem.OVERWORLD, overworldStem, LevelStem.NETHER, this.netherStem, LevelStem.END, this.endStem));
      }

      private void registerCustomOverworldPreset(final ResourceKey<WorldPreset> debug, final LevelStem overworld) {
         this.context.register(debug, this.createPresetWithCustomOverworld(overworld));
      }

      private void registerOverworlds(final BiomeSource biomeSource) {
         Holder<NoiseGeneratorSettings> overworldNoiseSettings = this.noiseSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD);
         this.registerCustomOverworldPreset(WorldPresets.NORMAL, this.makeNoiseBasedOverworld(biomeSource, overworldNoiseSettings));
         Holder<NoiseGeneratorSettings> largeBiomesNoiseSettings = this.noiseSettings.getOrThrow(NoiseGeneratorSettings.LARGE_BIOMES);
         this.registerCustomOverworldPreset(WorldPresets.LARGE_BIOMES, this.makeNoiseBasedOverworld(biomeSource, largeBiomesNoiseSettings));
         Holder<NoiseGeneratorSettings> amplifiedNoiseSettings = this.noiseSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED);
         this.registerCustomOverworldPreset(WorldPresets.AMPLIFIED, this.makeNoiseBasedOverworld(biomeSource, amplifiedNoiseSettings));
      }

      public void bootstrap() {
         Holder.Reference<MultiNoiseBiomeSourceParameterList> overworldPreset = this.multiNoiseBiomeSourceParameterLists
            .getOrThrow(MultiNoiseBiomeSourceParameterLists.OVERWORLD);
         this.registerOverworlds(MultiNoiseBiomeSource.createFromPreset(overworldPreset));
         Holder<NoiseGeneratorSettings> overworldNoiseSettings = this.noiseSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD);
         Holder.Reference<Biome> plains = this.biomes.getOrThrow(Biomes.PLAINS);
         this.registerCustomOverworldPreset(
            WorldPresets.SINGLE_BIOME_SURFACE, this.makeNoiseBasedOverworld(new FixedBiomeSource(plains), overworldNoiseSettings)
         );
         this.registerCustomOverworldPreset(
            WorldPresets.FLAT,
            this.makeOverworld(new FlatLevelSource(FlatLevelGeneratorSettings.getDefault(this.biomes, this.structureSets, this.placedFeatures)))
         );
         this.context.register(WorldPresets.FLAT_ALL_DIMENSIONS, this.createFlatAllDimensionsPreset());
         this.registerCustomOverworldPreset(WorldPresets.DEBUG, this.makeOverworld(new DebugLevelSource(plains)));
      }

      private FlatLevelGeneratorSettings flatSettingsForBiomeAndLayers(final ResourceKey<Biome> biomeKey, final List<FlatLayerInfo> layers) {
         return FlatLevelGeneratorSettings.getDefault(this.biomes, this.structureSets, this.placedFeatures)
            .withBiomeAndLayers(layers, Optional.empty(), this.biomes.getOrThrow(biomeKey));
      }

      private WorldPreset createFlatAllDimensionsPreset() {
         LevelStem overworldFlat = this.makeOverworld(
            new FlatLevelSource(
               this.flatSettingsForBiomeAndLayers(Biomes.DESERT, List.of(new FlatLayerInfo(1, Blocks.BEDROCK), new FlatLayerInfo(67, Blocks.SANDSTONE)))
            )
         );
         LevelStem netherFlat = this.makeNether(
            new FlatLevelSource(
               this.flatSettingsForBiomeAndLayers(Biomes.BASALT_DELTAS, List.of(new FlatLayerInfo(1, Blocks.BEDROCK), new FlatLayerInfo(3, Blocks.BASALT)))
            )
         );
         LevelStem endFlat = this.makeEnd(
            new FlatLevelSource(
               this.flatSettingsForBiomeAndLayers(Biomes.THE_END, List.of(new FlatLayerInfo(1, Blocks.BEDROCK), new FlatLayerInfo(3, Blocks.END_STONE)))
            )
         );
         return new WorldPreset(Map.of(LevelStem.OVERWORLD, overworldFlat, LevelStem.NETHER, netherFlat, LevelStem.END, endFlat));
      }
   }
}
