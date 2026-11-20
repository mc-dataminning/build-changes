package net.minecraft.world.level.levelgen.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.chunk.ChunkGeneratorStructureState;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.jspecify.annotations.Nullable;

public record StructureSet(List<StructureSet.StructureSelectionEntry> structures, StructurePlacement placement) {
   public static final Codec<StructureSet> DIRECT_CODEC = RecordCodecBuilder.create(
      i -> i.group(
            StructureSet.StructureSelectionEntry.CODEC.listOf().fieldOf("structures").forGetter(StructureSet::structures),
            StructurePlacement.CODEC.fieldOf("placement").forGetter(StructureSet::placement)
         )
         .apply(i, StructureSet::new)
   );
   public static final Codec<Holder<StructureSet>> CODEC = RegistryCodecs.holder(Registries.STRUCTURE_SET, DIRECT_CODEC);

   public StructureSet(final Holder<Structure> singleEntry, final StructurePlacement placement) {
      this(List.of(new StructureSet.StructureSelectionEntry(singleEntry, 1)), placement);
   }

   public static StructureSet.StructureSelectionEntry entry(final Holder<Structure> structure, final int weight) {
      return new StructureSet.StructureSelectionEntry(structure, weight);
   }

   public static StructureSet.StructureSelectionEntry entry(final Holder<Structure> structure) {
      return new StructureSet.StructureSelectionEntry(structure, 1);
   }

   public @Nullable StructureStart tryGenerateStartInChunk(
      final ChunkGenerator generator,
      final RegistryAccess registryAccess,
      final ChunkGeneratorStructureState state,
      final ChunkPos chunkPos,
      final LevelHeightAccessor heightAccessor,
      final StructureTemplateManager structureTemplateManager,
      final ResourceKey<Level> dimension,
      final Climate.Sampler climateSampler
   ) {
      if (this.structures.size() == 1) {
         return tryGenerateStructure(
            this.structures.getFirst().structure(),
            generator,
            registryAccess,
            state.randomState(),
            structureTemplateManager,
            state.getLevelSeed(),
            chunkPos,
            heightAccessor,
            dimension,
            climateSampler
         );
      }

      ArrayList<StructureSet.StructureSelectionEntry> options = new ArrayList<>(this.structures.size());
      options.addAll(this.structures);
      WorldgenRandom random = new WorldgenRandom(new LegacyRandomSource(0L));
      random.setLargeFeatureSeed(state.getLevelSeed(), chunkPos.x(), chunkPos.z());
      int total = 0;

      for (StructureSet.StructureSelectionEntry option : options) {
         total += option.weight();
      }

      while (!options.isEmpty()) {
         int choice = random.nextInt(total);
         int index = 0;

         for (StructureSet.StructureSelectionEntry option : options) {
            choice -= option.weight();
            if (choice < 0) {
               break;
            }

            index++;
         }

         StructureSet.StructureSelectionEntry selected = options.get(index);
         StructureStart start = tryGenerateStructure(
            selected.structure(),
            generator,
            registryAccess,
            state.randomState(),
            structureTemplateManager,
            state.getLevelSeed(),
            chunkPos,
            heightAccessor,
            dimension,
            climateSampler
         );
         if (start != null) {
            return start;
         }

         options.remove(index);
         total -= selected.weight();
      }

      return null;
   }

   private static @Nullable StructureStart tryGenerateStructure(
      final Holder<Structure> structure,
      final ChunkGenerator generator,
      final RegistryAccess registryAccess,
      final RandomState randomState,
      final StructureTemplateManager structureTemplateManager,
      final long seed,
      final ChunkPos chunkPos,
      final LevelHeightAccessor heightAccessor,
      final ResourceKey<Level> dimension,
      final Climate.Sampler climateSampler
   ) {
      return structure.value()
         .generate(
            structure,
            dimension,
            registryAccess,
            generator,
            generator.getBiomeSource(),
            climateSampler,
            randomState,
            structureTemplateManager,
            seed,
            chunkPos,
            heightAccessor,
            structure.value().biomes()::contains
         );
   }

   public record StructureSelectionEntry(Holder<Structure> structure, int weight) {
      public static final Codec<StructureSet.StructureSelectionEntry> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               Structure.CODEC.fieldOf("structure").forGetter(StructureSet.StructureSelectionEntry::structure),
               ExtraCodecs.POSITIVE_INT.fieldOf("weight").forGetter(StructureSet.StructureSelectionEntry::weight)
            )
            .apply(i, StructureSet.StructureSelectionEntry::new)
      );
   }
}
