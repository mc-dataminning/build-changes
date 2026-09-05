package net.minecraft.world.level.levelgen.structure;

import com.mojang.logging.LogUtils;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.pieces.PiecesContainer;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class StructureStart {
   public static final String INVALID_START_ID = "INVALID";
   public static final StructureStart INVALID_START = new StructureStart(null, new ChunkPos(0, 0), 0, new PiecesContainer(List.of()));
   private static final Logger LOGGER = LogUtils.getLogger();
   private final Structure structure;
   private final PiecesContainer pieceContainer;
   private final ChunkPos chunkPos;
   private int references;
   @Nullable
   private volatile BoundingBox cachedBoundingBox;

   public StructureStart(final Structure structure, final ChunkPos chunkPos, final int references, final PiecesContainer pieceContainer) {
      this.structure = structure;
      this.chunkPos = chunkPos;
      this.references = references;
      this.pieceContainer = pieceContainer;
   }

   @Nullable
   public static StructureStart loadStaticStart(final StructurePieceSerializationContext context, final CompoundTag tag, final long seed) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc "id"
      // 03: ldc ""
      // 05: invokevirtual net/minecraft/nbt/CompoundTag.getStringOr (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 08: astore 4
      // 0a: ldc "INVALID"
      // 0c: aload 4
      // 0e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11: ifeq 18
      // 14: getstatic net/minecraft/world/level/levelgen/structure/StructureStart.INVALID_START Lnet/minecraft/world/level/levelgen/structure/StructureStart;
      // 17: areturn
      // 18: aload 0
      // 19: invokevirtual net/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext.registryAccess ()Lnet/minecraft/core/RegistryAccess;
      // 1c: getstatic net/minecraft/core/registries/Registries.STRUCTURE Lnet/minecraft/resources/ResourceKey;
      // 1f: invokeinterface net/minecraft/core/RegistryAccess.lookupOrThrow (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Registry; 2
      // 24: astore 5
      // 26: aload 5
      // 28: aload 4
      // 2a: invokestatic net/minecraft/resources/Identifier.parse (Ljava/lang/String;)Lnet/minecraft/resources/Identifier;
      // 2d: invokeinterface net/minecraft/core/Registry.getValue (Lnet/minecraft/resources/Identifier;)Ljava/lang/Object; 2
      // 32: checkcast net/minecraft/world/level/levelgen/structure/Structure
      // 35: astore 6
      // 37: aload 6
      // 39: ifnonnull 4a
      // 3c: getstatic net/minecraft/world/level/levelgen/structure/StructureStart.LOGGER Lorg/slf4j/Logger;
      // 3f: ldc "Unknown stucture id: {}"
      // 41: aload 4
      // 43: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 48: aconst_null
      // 49: areturn
      // 4a: new net/minecraft/world/level/ChunkPos
      // 4d: dup
      // 4e: aload 1
      // 4f: ldc "ChunkX"
      // 51: bipush 0
      // 52: invokevirtual net/minecraft/nbt/CompoundTag.getIntOr (Ljava/lang/String;I)I
      // 55: aload 1
      // 56: ldc "ChunkZ"
      // 58: bipush 0
      // 59: invokevirtual net/minecraft/nbt/CompoundTag.getIntOr (Ljava/lang/String;I)I
      // 5c: invokespecial net/minecraft/world/level/ChunkPos.<init> (II)V
      // 5f: astore 7
      // 61: aload 1
      // 62: ldc "references"
      // 64: bipush 0
      // 65: invokevirtual net/minecraft/nbt/CompoundTag.getIntOr (Ljava/lang/String;I)I
      // 68: istore 8
      // 6a: aload 1
      // 6b: ldc "Children"
      // 6d: invokevirtual net/minecraft/nbt/CompoundTag.getListOrEmpty (Ljava/lang/String;)Lnet/minecraft/nbt/ListTag;
      // 70: astore 9
      // 72: aload 9
      // 74: aload 0
      // 75: invokestatic net/minecraft/world/level/levelgen/structure/pieces/PiecesContainer.load (Lnet/minecraft/nbt/ListTag;Lnet/minecraft/world/level/levelgen/structure/pieces/StructurePieceSerializationContext;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;
      // 78: astore 10
      // 7a: aload 6
      // 7c: instanceof net/minecraft/world/level/levelgen/structure/structures/OceanMonumentStructure
      // 7f: ifeq 8c
      // 82: aload 7
      // 84: lload 2
      // 85: aload 10
      // 87: invokestatic net/minecraft/world/level/levelgen/structure/structures/OceanMonumentStructure.regeneratePiecesAfterLoad (Lnet/minecraft/world/level/ChunkPos;JLnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;
      // 8a: astore 10
      // 8c: new net/minecraft/world/level/levelgen/structure/StructureStart
      // 8f: dup
      // 90: aload 6
      // 92: aload 7
      // 94: iload 8
      // 96: aload 10
      // 98: invokespecial net/minecraft/world/level/levelgen/structure/StructureStart.<init> (Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/ChunkPos;ILnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)V
      // 9b: areturn
      // 9c: astore 10
      // 9e: getstatic net/minecraft/world/level/levelgen/structure/StructureStart.LOGGER Lorg/slf4j/Logger;
      // a1: ldc "Failed Start with id {}"
      // a3: aload 4
      // a5: aload 10
      // a7: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V 4
      // ac: aconst_null
      // ad: areturn
   }

   public BoundingBox getBoundingBox() {
      BoundingBox boundingBox = this.cachedBoundingBox;
      if (boundingBox == null) {
         boundingBox = this.structure.adjustBoundingBox(this.pieceContainer.calculateBoundingBox());
         this.cachedBoundingBox = boundingBox;
      }

      return boundingBox;
   }

   public void placeInChunk(
      final WorldGenLevel level,
      final StructureManager structureManager,
      final ChunkGenerator generator,
      final RandomSource random,
      final BoundingBox chunkBB,
      final ChunkPos chunkPos
   ) {
      List<StructurePiece> pieces = this.pieceContainer.pieces();
      if (!pieces.isEmpty()) {
         BoundingBox centerBB = pieces.get(0).boundingBox;
         BlockPos centerPos = centerBB.getCenter();
         BlockPos referencePos = new BlockPos(centerPos.getX(), centerBB.minY(), centerPos.getZ());

         for (StructurePiece next : pieces) {
            if (next.getBoundingBox().intersects(chunkBB)) {
               next.postProcess(level, structureManager, generator, random, chunkBB, chunkPos, referencePos);
            }
         }

         this.structure.afterPlace(level, structureManager, generator, random, chunkBB, chunkPos, this.pieceContainer);
      }
   }

   public CompoundTag createTag(final StructurePieceSerializationContext context, final ChunkPos chunkPos) {
      CompoundTag tag = new CompoundTag();
      if (this.isValid()) {
         tag.putString("id", context.registryAccess().lookupOrThrow(Registries.STRUCTURE).getKey(this.structure).toString());
         tag.putInt("ChunkX", chunkPos.x());
         tag.putInt("ChunkZ", chunkPos.z());
         tag.putInt("references", this.references);
         tag.put("Children", this.pieceContainer.save(context));
         return tag;
      } else {
         tag.putString("id", "INVALID");
         return tag;
      }
   }

   public boolean isValid() {
      return !this.pieceContainer.isEmpty();
   }

   public ChunkPos getChunkPos() {
      return this.chunkPos;
   }

   public boolean canBeReferenced() {
      return this.references < this.getMaxReferences();
   }

   public void addReference() {
      this.references++;
   }

   public int getReferences() {
      return this.references;
   }

   protected int getMaxReferences() {
      return 1;
   }

   public Structure getStructure() {
      return this.structure;
   }

   public List<StructurePiece> getPieces() {
      return this.pieceContainer.pieces();
   }
}
