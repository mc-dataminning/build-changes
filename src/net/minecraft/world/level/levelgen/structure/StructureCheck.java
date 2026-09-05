package net.minecraft.world.level.levelgen.structure;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.visitors.CollectFields;
import net.minecraft.nbt.visitors.FieldSelector;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.chunk.storage.ChunkScanAccess;
import net.minecraft.world.level.chunk.storage.SimpleRegionStorage;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.densityfunction.SamplerContext;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class StructureCheck {
   private static final Logger LOGGER = LogUtils.getLogger();
   private static final int NO_STRUCTURE = -1;
   private static final int MAX_CHUNKS_WITHOUT_STORED_STARTS = 131072;
   private final ChunkScanAccess storageAccess;
   private final RegistryAccess registryAccess;
   private final StructureTemplateManager structureTemplateManager;
   private final ResourceKey<Level> dimension;
   private final ChunkGenerator chunkGenerator;
   private final RandomState randomState;
   private final LevelHeightAccessor heightAccessor;
   private final Climate.Sampler climateSampler;
   private final BiomeSource biomeSource;
   private final long seed;
   private final DataFixer fixerUpper;
   private final Long2ObjectMap<Object2IntMap<Structure>> loadedChunks = new Long2ObjectOpenHashMap();
   private final Map<Structure, Long2BooleanMap> featureChecks = new HashMap<>();
   private final LongSet chunksWithoutStartsInStorage = new LongOpenHashSet();

   public StructureCheck(
      final ChunkScanAccess storageAccess,
      final RegistryAccess registryAccess,
      final StructureTemplateManager structureTemplateManager,
      final ResourceKey<Level> dimension,
      final ChunkGenerator chunkGenerator,
      final RandomState randomState,
      final LevelHeightAccessor heightAccessor,
      final BiomeSource biomeSource,
      final long seed,
      final DataFixer fixerUpper
   ) {
      this.storageAccess = storageAccess;
      this.registryAccess = registryAccess;
      this.structureTemplateManager = structureTemplateManager;
      this.dimension = dimension;
      this.chunkGenerator = chunkGenerator;
      this.randomState = randomState;
      this.heightAccessor = heightAccessor;
      this.biomeSource = biomeSource;
      this.climateSampler = randomState.createClimateSampler(SamplerContext.builder().enableCaches().build());
      this.seed = seed;
      this.fixerUpper = fixerUpper;
   }

   public StructureCheckResult checkStart(final ChunkPos pos, final Structure structure, final StructurePlacement placement, final boolean requireUnreferenced) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.HashMap.resize(HashMap.java:711)
      //   at java.base/java.util.HashMap.putVal(HashMap.java:670)
      //   at java.base/java.util.HashMap.put(HashMap.java:619)
      //   at java.base/java.util.HashSet.add(HashSet.java:230)
      //   at java.base/java.util.stream.DistinctOps$1$2.accept(DistinctOps.java:173)
      //   at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1716)
      //   at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
      //   at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
      //   at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
      //   at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
      //   at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:723)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:1021)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:1065)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:932)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:937)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:937)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:937)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:937)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.setEffectivelyFinalVars(StackVarsProcessor.java:937)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:68)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:224)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/world/level/ChunkPos.pack ()J
      // 04: lstore 5
      // 06: aload 0
      // 07: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.loadedChunks Lit/unimi/dsi/fastutil/longs/Long2ObjectMap;
      // 0a: lload 5
      // 0c: invokeinterface it/unimi/dsi/fastutil/longs/Long2ObjectMap.get (J)Ljava/lang/Object; 3
      // 11: checkcast it/unimi/dsi/fastutil/objects/Object2IntMap
      // 14: astore 7
      // 16: aload 7
      // 18: ifnull 25
      // 1b: aload 0
      // 1c: aload 7
      // 1e: aload 2
      // 1f: iload 4
      // 21: invokevirtual net/minecraft/world/level/levelgen/structure/StructureCheck.checkStructureInfo (Lit/unimi/dsi/fastutil/objects/Object2IntMap;Lnet/minecraft/world/level/levelgen/structure/Structure;Z)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;
      // 24: areturn
      // 25: aload 0
      // 26: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.chunksWithoutStartsInStorage Lit/unimi/dsi/fastutil/longs/LongSet;
      // 29: lload 5
      // 2b: invokeinterface it/unimi/dsi/fastutil/longs/LongSet.contains (J)Z 3
      // 30: ifne 68
      // 33: aload 0
      // 34: aload 1
      // 35: aload 2
      // 36: iload 4
      // 38: invokevirtual net/minecraft/world/level/levelgen/structure/StructureCheck.tryLoadFromStorage (Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Z)Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;
      // 3b: astore 8
      // 3d: aload 8
      // 3f: ifnull 45
      // 42: aload 8
      // 44: areturn
      // 45: aload 0
      // 46: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.chunksWithoutStartsInStorage Lit/unimi/dsi/fastutil/longs/LongSet;
      // 49: invokeinterface it/unimi/dsi/fastutil/longs/LongSet.size ()I 1
      // 4e: ldc 131072
      // 50: if_icmplt 5c
      // 53: aload 0
      // 54: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.chunksWithoutStartsInStorage Lit/unimi/dsi/fastutil/longs/LongSet;
      // 57: invokeinterface it/unimi/dsi/fastutil/longs/LongSet.clear ()V 1
      // 5c: aload 0
      // 5d: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.chunksWithoutStartsInStorage Lit/unimi/dsi/fastutil/longs/LongSet;
      // 60: lload 5
      // 62: invokeinterface it/unimi/dsi/fastutil/longs/LongSet.add (J)Z 3
      // 67: pop
      // 68: aload 3
      // 69: aload 1
      // 6a: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 6d: aload 1
      // 6e: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 71: aload 0
      // 72: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.seed J
      // 75: invokeinterface net/minecraft/world/level/levelgen/structure/placement/StructurePlacement.applyAdditionalChunkRestrictions (IIJ)Z 5
      // 7a: ifne 81
      // 7d: getstatic net/minecraft/world/level/levelgen/structure/StructureCheckResult.START_NOT_PRESENT Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;
      // 80: areturn
      // 81: aload 0
      // 82: getfield net/minecraft/world/level/levelgen/structure/StructureCheck.featureChecks Ljava/util/Map;
      // 85: aload 2
      // 86: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/levelgen/structure/StructureCheck.lambda$checkStart$0 (Lnet/minecraft/world/level/levelgen/structure/Structure;)Lit/unimi/dsi/fastutil/longs/Long2BooleanMap;, (Lnet/minecraft/world/level/levelgen/structure/Structure;)Lit/unimi/dsi/fastutil/longs/Long2BooleanMap; ]
      // 8b: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 90: checkcast it/unimi/dsi/fastutil/longs/Long2BooleanMap
      // 93: lload 5
      // 95: aload 0
      // 96: aload 1
      // 97: aload 2
      // 98: invokedynamic get (Lnet/minecraft/world/level/levelgen/structure/StructureCheck;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Lit/unimi/dsi/fastutil/longs/Long2BooleanFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (J)Z, net/minecraft/world/level/levelgen/structure/StructureCheck.lambda$checkStart$1 (Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/Structure;J)Z, (J)Z ]
      // 9d: invokeinterface it/unimi/dsi/fastutil/longs/Long2BooleanMap.computeIfAbsent (JLit/unimi/dsi/fastutil/longs/Long2BooleanFunction;)Z 4
      // a2: istore 8
      // a4: iload 8
      // a6: ifne ad
      // a9: getstatic net/minecraft/world/level/levelgen/structure/StructureCheckResult.START_NOT_PRESENT Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;
      // ac: areturn
      // ad: getstatic net/minecraft/world/level/levelgen/structure/StructureCheckResult.CHUNK_LOAD_NEEDED Lnet/minecraft/world/level/levelgen/structure/StructureCheckResult;
      // b0: areturn
   }

   private boolean canCreateStructure(final ChunkPos pos, final Structure structure) {
      return structure.findValidGenerationPoint(
            new Structure.GenerationContext(
               this.registryAccess,
               this.chunkGenerator,
               this.biomeSource,
               this.climateSampler,
               this.randomState,
               this.structureTemplateManager,
               this.seed,
               pos,
               this.heightAccessor,
               structure.biomes()::contains
            )
         )
         .isPresent();
   }

   @Nullable
   private StructureCheckResult tryLoadFromStorage(final ChunkPos pos, final Structure structure, final boolean requireUnreferenced) {
      CollectFields collectFields = new CollectFields(
         new FieldSelector(IntTag.TYPE, "DataVersion"),
         new FieldSelector("Level", "Structures", CompoundTag.TYPE, "Starts"),
         new FieldSelector("structures", CompoundTag.TYPE, "starts")
      );

      try {
         this.storageAccess.scanChunk(pos, collectFields).join();
      } catch (Exception var11) {
         LOGGER.warn("Failed to read chunk {}", pos, var11);
         return StructureCheckResult.CHUNK_LOAD_NEEDED;
      }

      if (collectFields.getResult() instanceof CompoundTag chunkTag) {
         int version = NbtUtils.getDataVersion(chunkTag);
         SimpleRegionStorage.injectDatafixingContext(
            chunkTag, ChunkMap.getChunkDataFixContextTag(this.dimension, this.chunkGenerator.getTypeNameForDataFixer())
         );

         CompoundTag fixedChunkTag;
         try {
            fixedChunkTag = DataFixTypes.CHUNK.updateToCurrentVersion(this.fixerUpper, chunkTag, version);
         } catch (Exception var10) {
            LOGGER.warn("Failed to partially datafix chunk {}", pos, var10);
            return StructureCheckResult.CHUNK_LOAD_NEEDED;
         }

         Object2IntMap<Structure> knownStarts = this.loadStructures(fixedChunkTag);
         if (knownStarts == null) {
            return null;
         } else {
            this.storeFullResults(pos.pack(), knownStarts);
            return this.checkStructureInfo(knownStarts, structure, requireUnreferenced);
         }
      } else {
         return null;
      }
   }

   @Nullable
   private Object2IntMap<Structure> loadStructures(final CompoundTag chunkTag) {
      Optional<CompoundTag> maybeStartsTag = chunkTag.getCompound("structures").flatMap(tag -> tag.getCompound("starts"));
      if (maybeStartsTag.isEmpty()) {
         return null;
      } else {
         CompoundTag startsTag = maybeStartsTag.get();
         if (startsTag.isEmpty()) {
            return Object2IntMaps.emptyMap();
         } else {
            Object2IntMap<Structure> knownStarts = new Object2IntOpenHashMap();
            Registry<Structure> structuresRegistry = this.registryAccess.lookupOrThrow(Registries.STRUCTURE);
            startsTag.forEach((key, tag) -> {
               Identifier id = Identifier.tryParse(key);
               if (id != null) {
                  Structure foundFeature = structuresRegistry.getValue(id);
                  if (foundFeature != null) {
                     tag.asCompound().ifPresent(structureData -> {
                        String pieceId = structureData.getStringOr("id", "");
                        if (!"INVALID".equals(pieceId)) {
                           int referenceCount = structureData.getIntOr("references", 0);
                           knownStarts.put(foundFeature, referenceCount);
                        }
                     });
                  }
               }
            });
            return knownStarts;
         }
      }
   }

   private static Object2IntMap<Structure> deduplicateEmptyMap(final Object2IntMap<Structure> map) {
      return map.isEmpty() ? Object2IntMaps.emptyMap() : map;
   }

   private StructureCheckResult checkStructureInfo(final Object2IntMap<Structure> cachedResult, final Structure structure, final boolean requireUnreferenced) {
      int referenceCount = cachedResult.getOrDefault(structure, -1);
      return referenceCount == -1 || requireUnreferenced && referenceCount != 0 ? StructureCheckResult.START_NOT_PRESENT : StructureCheckResult.START_PRESENT;
   }

   public void onStructureLoad(final ChunkPos pos, final Map<Structure, StructureStart> starts) {
      long posKey = pos.pack();
      Object2IntMap<Structure> startsToReferences = new Object2IntOpenHashMap();
      starts.forEach((structure, structureStart) -> {
         if (structureStart.isValid()) {
            startsToReferences.put(structure, structureStart.getReferences());
         }
      });
      this.storeFullResults(posKey, startsToReferences);
   }

   private void storeFullResults(final long posKey, final Object2IntMap<Structure> starts) {
      this.loadedChunks.put(posKey, deduplicateEmptyMap(starts));
      this.featureChecks.values().forEach(m -> m.remove(posKey));
      this.chunksWithoutStartsInStorage.remove(posKey);
   }

   public void incrementReference(final ChunkPos chunkPos, final Structure structure) {
      long posKey = chunkPos.pack();
      this.loadedChunks.compute(posKey, (key, counts) -> {
         if (counts == null || counts.isEmpty()) {
            counts = new Object2IntOpenHashMap();
         }

         counts.computeInt(structure, (k, value) -> value == null ? 1 : value + 1);
         return counts;
      });
      this.chunksWithoutStartsInStorage.remove(posKey);
   }
}
