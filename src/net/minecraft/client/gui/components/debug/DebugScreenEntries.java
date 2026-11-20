package net.minecraft.client.gui.components.debug;

import java.util.Map;
import net.minecraft.client.core.registries.ClientRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

public class DebugScreenEntries {
   public static final ResourceKey<DebugScreenEntry> GAME_VERSION = key("game_version");
   public static final ResourceKey<DebugScreenEntry> FPS = key("fps");
   public static final ResourceKey<DebugScreenEntry> TPS = key("tps");
   public static final ResourceKey<DebugScreenEntry> MEMORY = key("memory");
   public static final ResourceKey<DebugScreenEntry> DETAILED_MEMORY = key("detailed_memory");
   public static final ResourceKey<DebugScreenEntry> SYSTEM_SPECS = key("system_specs");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_BLOCK_STATE = key("looking_at_block_state");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_BLOCK_TAGS = key("looking_at_block_tags");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_FLUID_STATE = key("looking_at_fluid_state");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_FLUID_TAGS = key("looking_at_fluid_tags");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_ENTITY = key("looking_at_entity");
   public static final ResourceKey<DebugScreenEntry> LOOKING_AT_ENTITY_TAGS = key("looking_at_entity_tags");
   public static final ResourceKey<DebugScreenEntry> CHUNK_RENDER_STATS = key("chunk_render_stats");
   public static final ResourceKey<DebugScreenEntry> CHUNK_GENERATION_STATS = key("chunk_generation_stats");
   public static final ResourceKey<DebugScreenEntry> ENTITY_RENDER_STATS = key("entity_render_stats");
   public static final ResourceKey<DebugScreenEntry> PARTICLE_RENDER_STATS = key("particle_render_stats");
   public static final ResourceKey<DebugScreenEntry> CHUNK_SECTION_STATUS = key("chunk_section_status");
   public static final ResourceKey<DebugScreenEntry> CHUNK_LOAD_STATUS = key("chunk_load_status");
   public static final ResourceKey<DebugScreenEntry> PLAYER_POSITION = key("player_position");
   public static final ResourceKey<DebugScreenEntry> PLAYER_SECTION_POSITION = key("player_section_position");
   public static final ResourceKey<DebugScreenEntry> PLAYER_SPEED = key("player_speed");
   public static final ResourceKey<DebugScreenEntry> LIGHT_LEVELS = key("light_levels");
   public static final ResourceKey<DebugScreenEntry> LIGHTMAP_TEXTURE = key("lightmap_texture");
   public static final ResourceKey<DebugScreenEntry> HEIGHTMAP = key("heightmap");
   public static final ResourceKey<DebugScreenEntry> BIOME = key("biome");
   public static final ResourceKey<DebugScreenEntry> LOCAL_DIFFICULTY = key("local_difficulty");
   public static final ResourceKey<DebugScreenEntry> DAY_COUNT = key("day_count");
   public static final ResourceKey<DebugScreenEntry> ENTITY_SPAWN_COUNTS = key("entity_spawn_counts");
   public static final ResourceKey<DebugScreenEntry> SOUND_MOOD = key("sound_mood");
   public static final ResourceKey<DebugScreenEntry> SOUND_CACHE = key("sound_cache");
   public static final ResourceKey<DebugScreenEntry> POST_EFFECTS = key("post_effects");
   public static final ResourceKey<DebugScreenEntry> ENTITY_HITBOXES = key("entity_hitboxes");
   public static final ResourceKey<DebugScreenEntry> CHUNK_BORDERS = key("chunk_borders");
   public static final ResourceKey<DebugScreenEntry> THREE_DIMENSIONAL_CROSSHAIR = key("3d_crosshair");
   public static final ResourceKey<DebugScreenEntry> CHUNK_SECTION_PATHS = key("chunk_section_paths");
   public static final ResourceKey<DebugScreenEntry> GPU_UTILIZATION = key("gpu_utilization");
   public static final ResourceKey<DebugScreenEntry> SIMPLE_PERFORMANCE_IMPACTORS = key("simple_performance_impactors");
   public static final ResourceKey<DebugScreenEntry> CHUNK_SECTION_OCTREE = key("chunk_section_octree");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_WATER_LEVELS = key("visualize_water_levels");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_HEIGHTMAP = key("visualize_heightmap");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_COLLISION_BOXES = key("visualize_collision_boxes");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_ENTITY_SUPPORTING_BLOCKS = key("visualize_entity_supporting_blocks");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_BLOCK_LIGHT_LEVELS = key("visualize_block_light_levels");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_SKY_LIGHT_LEVELS = key("visualize_sky_light_levels");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_SOLID_FACES = key("visualize_solid_faces");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_CHUNKS_ON_SERVER = key("visualize_chunks_on_server");
   public static final ResourceKey<DebugScreenEntry> VISUALIZE_SKY_LIGHT_SECTIONS = key("visualize_sky_light_sections");
   public static final ResourceKey<DebugScreenEntry> CHUNK_SECTION_VISIBILITY = key("chunk_section_visibility");
   public static final Map<DebugScreenProfile, Map<ResourceKey<DebugScreenEntry>, DebugScreenEntryStatus>> PROFILES;

   private static ResourceKey<DebugScreenEntry> key(final String name) {
      return ResourceKey.create(ClientRegistries.DEBUG_SCREEN_ENTRY, Identifier.withDefaultNamespace(name));
   }

   public static Object bootstrap(final Registry<DebugScreenEntry> registry) {
      Registry.register(registry, GAME_VERSION, new DebugEntryVersion());
      Registry.register(registry, FPS, new DebugEntryFps());
      Registry.register(registry, TPS, new DebugEntryTps());
      Registry.register(registry, MEMORY, new DebugEntryMemory());
      Registry.register(registry, DETAILED_MEMORY, new DebugEntryDetailedMemory());
      Registry.register(registry, SYSTEM_SPECS, new DebugEntrySystemSpecs());
      Registry.register(registry, LOOKING_AT_BLOCK_STATE, new DebugEntryLookingAt.BlockStateInfo());
      Registry.register(registry, LOOKING_AT_BLOCK_TAGS, new DebugEntryLookingAt.BlockTagInfo());
      Registry.register(registry, LOOKING_AT_FLUID_STATE, new DebugEntryLookingAt.FluidStateInfo());
      Registry.register(registry, LOOKING_AT_FLUID_TAGS, new DebugEntryLookingAt.FluidTagInfo());
      Registry.register(registry, LOOKING_AT_ENTITY, new DebugEntryLookingAtEntity());
      Registry.register(registry, LOOKING_AT_ENTITY_TAGS, new DebugEntryLookingAtEntityTags());
      Registry.register(registry, CHUNK_RENDER_STATS, new DebugEntryChunkRenderStats());
      Registry.register(registry, CHUNK_GENERATION_STATS, new DebugEntryChunkGeneration());
      Registry.register(registry, ENTITY_RENDER_STATS, new DebugEntryEntityRenderStats());
      Registry.register(registry, PARTICLE_RENDER_STATS, new DebugEntryParticleRenderStats());
      Registry.register(registry, CHUNK_SECTION_STATUS, new DebugEntryChunkSectionStatus());
      Registry.register(registry, CHUNK_LOAD_STATUS, new DebugEntryChunkLoadStatus());
      Registry.register(registry, PLAYER_POSITION, new DebugEntryPosition());
      Registry.register(registry, PLAYER_SECTION_POSITION, new DebugEntrySectionPosition());
      Registry.register(registry, PLAYER_SPEED, new DebugEntryPlayerSpeed());
      Registry.register(registry, LIGHT_LEVELS, new DebugEntryLight());
      Registry.register(registry, LIGHTMAP_TEXTURE, new DebugEntryLightmapTexture());
      Registry.register(registry, HEIGHTMAP, new DebugEntryHeightmap());
      Registry.register(registry, BIOME, new DebugEntryBiome());
      Registry.register(registry, LOCAL_DIFFICULTY, new DebugEntryLocalDifficulty());
      Registry.register(registry, DAY_COUNT, new DebugEntryDayCount());
      Registry.register(registry, ENTITY_SPAWN_COUNTS, new DebugEntrySpawnCounts());
      Registry.register(registry, SOUND_MOOD, new DebugEntrySoundMood());
      Registry.register(registry, SOUND_CACHE, new DebugEntrySoundCache());
      Registry.register(registry, POST_EFFECTS, new DebugEntryPostEffects());
      Registry.register(registry, ENTITY_HITBOXES, new DebugEntryNoop());
      Registry.register(registry, CHUNK_BORDERS, new DebugEntryNoop());
      Registry.register(registry, THREE_DIMENSIONAL_CROSSHAIR, new DebugEntryNoop());
      Registry.register(registry, CHUNK_SECTION_PATHS, new DebugEntryNoop());
      Registry.register(registry, GPU_UTILIZATION, new DebugEntryGpuUtilization());
      Registry.register(registry, SIMPLE_PERFORMANCE_IMPACTORS, new DebugEntrySimplePerformanceImpactors());
      Registry.register(registry, CHUNK_SECTION_OCTREE, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_WATER_LEVELS, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_HEIGHTMAP, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_COLLISION_BOXES, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_ENTITY_SUPPORTING_BLOCKS, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_BLOCK_LIGHT_LEVELS, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_SKY_LIGHT_LEVELS, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_SOLID_FACES, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_CHUNKS_ON_SERVER, new DebugEntryNoop());
      Registry.register(registry, VISUALIZE_SKY_LIGHT_SECTIONS, new DebugEntryNoop());
      return Registry.register(registry, CHUNK_SECTION_VISIBILITY, new DebugEntryNoop());
   }

   static {
      Map<ResourceKey<DebugScreenEntry>, DebugScreenEntryStatus> defaultProfile = Map.of(
         THREE_DIMENSIONAL_CROSSHAIR,
         DebugScreenEntryStatus.IN_OVERLAY,
         GAME_VERSION,
         DebugScreenEntryStatus.IN_OVERLAY,
         TPS,
         DebugScreenEntryStatus.IN_OVERLAY,
         FPS,
         DebugScreenEntryStatus.IN_OVERLAY,
         MEMORY,
         DebugScreenEntryStatus.IN_OVERLAY,
         SYSTEM_SPECS,
         DebugScreenEntryStatus.IN_OVERLAY,
         PLAYER_POSITION,
         DebugScreenEntryStatus.IN_OVERLAY,
         PLAYER_SECTION_POSITION,
         DebugScreenEntryStatus.IN_OVERLAY,
         SIMPLE_PERFORMANCE_IMPACTORS,
         DebugScreenEntryStatus.IN_OVERLAY
      );
      Map<ResourceKey<DebugScreenEntry>, DebugScreenEntryStatus> performance = Map.of(
         TPS,
         DebugScreenEntryStatus.IN_OVERLAY,
         FPS,
         DebugScreenEntryStatus.ALWAYS_ON,
         GPU_UTILIZATION,
         DebugScreenEntryStatus.IN_OVERLAY,
         MEMORY,
         DebugScreenEntryStatus.IN_OVERLAY,
         SIMPLE_PERFORMANCE_IMPACTORS,
         DebugScreenEntryStatus.IN_OVERLAY
      );
      PROFILES = Map.of(DebugScreenProfile.DEFAULT, defaultProfile, DebugScreenProfile.PERFORMANCE, performance);
   }
}
