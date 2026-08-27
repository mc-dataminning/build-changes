package net.minecraft.world.level.biome;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.Util;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class MobSpawnSettings {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final float DEFAULT_CREATURE_WORLD_GEN_SPAWN_PROBABILITY = 0.1F;
   public static final WeightedList<MobSpawnSettings.SpawnerData> EMPTY_MOB_LIST = WeightedList.of();
   public static final MobSpawnSettings EMPTY = new MobSpawnSettings.Builder().build();
   public static final MobSpawnSettings NO_SPAWNS = Util.make(() -> {
      MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();

      for (MobCategory category : MobCategory.values()) {
         builder.noSpawns(category);
      }

      return builder.build();
   });
   public static final Codec<MobSpawnSettings> CODEC = RecordCodecBuilder.create(
      i -> i.group(
               Codec.simpleMap(
                     MobCategory.CODEC,
                     WeightedList.codec(MobSpawnSettings.SpawnerData.CODEC).promotePartial(Util.prefix("Spawn data: ", LOGGER::error)),
                     StringRepresentable.keys(MobCategory.values())
                  )
                  .fieldOf("spawns_by_category")
                  .forGetter(b -> b.spawnsByCategory),
               Codec.simpleMap(BuiltInRegistries.ENTITY_TYPE.byNameCodec(), MobSpawnSettings.MobSpawnCost.CODEC, BuiltInRegistries.ENTITY_TYPE)
                  .fieldOf("spawn_costs")
                  .forGetter(b -> b.mobSpawnCosts)
            )
            .apply(i, MobSpawnSettings::new)
   );
   private final Map<MobCategory, WeightedList<MobSpawnSettings.SpawnerData>> spawnsByCategory;
   private final Map<EntityType<?>, MobSpawnSettings.MobSpawnCost> mobSpawnCosts;

   private MobSpawnSettings(
      final Map<MobCategory, WeightedList<MobSpawnSettings.SpawnerData>> spawnsByCategory,
      final Map<EntityType<?>, MobSpawnSettings.MobSpawnCost> mobSpawnCosts
   ) {
      this.spawnsByCategory = ImmutableMap.copyOf(spawnsByCategory);
      this.mobSpawnCosts = ImmutableMap.copyOf(mobSpawnCosts);
   }

   public WeightedList<MobSpawnSettings.SpawnerData> getMobsToSpawn(final MobCategory category) {
      return this.spawnsByCategory.getOrDefault(category, EMPTY_MOB_LIST);
   }

   @Nullable
   public WeightedList<MobSpawnSettings.SpawnerData> getMobsInCategory(final MobCategory category) {
      return this.spawnsByCategory.get(category);
   }

   public Set<MobCategory> definedCategories() {
      return this.spawnsByCategory.keySet();
   }

   @Nullable
   public MobSpawnSettings.MobSpawnCost getMobSpawnCost(final EntityType<?> type) {
      return this.mobSpawnCosts.get(type);
   }

   public Map<EntityType<?>, MobSpawnSettings.MobSpawnCost> allSpawnCosts() {
      return this.mobSpawnCosts;
   }

   public static class Builder {
      private final Map<MobCategory, WeightedList.Builder<MobSpawnSettings.SpawnerData>> spawnsByCategory = new EnumMap<>(MobCategory.class);
      private final Map<EntityType<?>, MobSpawnSettings.MobSpawnCost> mobSpawnCosts = Maps.newLinkedHashMap();

      public MobSpawnSettings.Builder addSpawn(final EntityType<?> type, final int weight, final int minCount, final int maxCount) {
         IntProvider count;
         if (minCount == maxCount) {
            count = new ConstantInt(minCount);
         } else {
            count = new UniformInt(minCount, maxCount);
         }

         this.addSpawn(type, type.getCategory(), weight, count);
         return this;
      }

      public MobSpawnSettings.Builder addSpawn(final EntityType<?> type, final int weight, final IntProvider count) {
         this.addSpawn(type, type.getCategory(), weight, count);
         return this;
      }

      @Deprecated
      public MobSpawnSettings.Builder addSpawn(final EntityType<?> type, final MobCategory category, final int weight, final IntProvider count) {
         this.forCategory(category).add(new MobSpawnSettings.SpawnerData(type, count), weight);
         return this;
      }

      public MobSpawnSettings.Builder addAllSpawns(final MobCategory category, final WeightedList<MobSpawnSettings.SpawnerData> spawns) {
         this.forCategory(category).addAll(spawns);
         return this;
      }

      public MobSpawnSettings.Builder noSpawns(final MobCategory category) {
         this.spawnsByCategory.put(category, WeightedList.builder());
         return this;
      }

      public MobSpawnSettings.Builder dontOverride(final MobCategory category) {
         this.spawnsByCategory.remove(category);
         return this;
      }

      public MobSpawnSettings.Builder addMobSpawnCost(final EntityType<?> type, final double charge, final double energyBudget) {
         this.mobSpawnCosts.put(type, new MobSpawnSettings.MobSpawnCost(energyBudget, charge));
         return this;
      }

      public MobSpawnSettings.Builder addAllCosts(final Map<EntityType<?>, MobSpawnSettings.MobSpawnCost> costs) {
         this.mobSpawnCosts.putAll(costs);
         return this;
      }

      public MobSpawnSettings build() {
         return new MobSpawnSettings(
            this.spawnsByCategory.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, e -> ((WeightedList.Builder)e.getValue()).build())),
            ImmutableMap.copyOf(this.mobSpawnCosts)
         );
      }

      private WeightedList.Builder<MobSpawnSettings.SpawnerData> forCategory(final MobCategory category) {
         return this.spawnsByCategory.computeIfAbsent(category, var0 -> WeightedList.builder());
      }
   }

   public static record MobSpawnCost(double energyBudget, double charge) {
      public static final Codec<MobSpawnSettings.MobSpawnCost> CODEC = RecordCodecBuilder.create(
         i -> i.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter(e -> e.energyBudget), Codec.DOUBLE.fieldOf("charge").forGetter(e -> e.charge))
               .apply(i, MobSpawnSettings.MobSpawnCost::new)
      );
   }

   public static record SpawnerData(EntityType<?> type, IntProvider count) {
      public static final MapCodec<MobSpawnSettings.SpawnerData> CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(
                  BuiltInRegistries.ENTITY_TYPE.byNameCodec().fieldOf("type").forGetter(MobSpawnSettings.SpawnerData::type),
                  IntProviders.CODEC.fieldOf("count").forGetter(MobSpawnSettings.SpawnerData::count)
               )
               .apply(i, MobSpawnSettings.SpawnerData::new)
      );

      public SpawnerData(EntityType<?> type, IntProvider count) {
         type = type.getCategory() == MobCategory.MISC ? EntityTypes.PIG : type;
         this.type = type;
         this.count = count;
      }

      @Override
      public String toString() {
         return EntityType.getKey(this.type)
            + "*("
            + this.count.minInclusive()
            + "-"
            + this.count.maxInclusive()
            + ") ("
            + BuiltInRegistries.INT_PROVIDER_TYPE.getKey(this.count.codec())
            + ")";
      }
   }
}
