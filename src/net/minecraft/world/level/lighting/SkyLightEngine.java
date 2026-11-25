package net.minecraft.world.level.lighting;

import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.DataLayer;
import net.minecraft.world.level.chunk.LightChunk;
import net.minecraft.world.level.chunk.LightChunkGetter;
import org.jspecify.annotations.Nullable;

public final class SkyLightEngine extends LightEngine<SkyLightSectionStorage.SkyDataLayerStorageMap, SkyLightSectionStorage> {
   private static final long REMOVE_TOP_SKY_SOURCE_ENTRY = LightEngine.QueueEntry.decreaseAllDirections(15);
   private static final long REMOVE_SKY_SOURCE_ENTRY = LightEngine.QueueEntry.decreaseSkipOneDirection(15, Direction.UP);
   private static final long ADD_SKY_SOURCE_ENTRY = LightEngine.QueueEntry.increaseSkipOneDirection(15, false, Direction.UP);
   private final BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();
   private final ChunkSkyLightSources emptyChunkSources;

   public SkyLightEngine(final LightChunkGetter chunkSource) {
      this(chunkSource, new SkyLightSectionStorage(chunkSource));
   }

   @VisibleForTesting
   SkyLightEngine(final LightChunkGetter chunkSource, final SkyLightSectionStorage storage) {
      super(chunkSource, storage);
      this.emptyChunkSources = new ChunkSkyLightSources(chunkSource.getLevel());
   }

   private static boolean isSourceLevel(final int value) {
      return value == 15;
   }

   private int getLowestSourceY(final int x, final int z, final int defaultValue) {
      ChunkSkyLightSources sources = this.getChunkSources(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z));
      return sources == null ? defaultValue : sources.getLowestSourceY(SectionPos.sectionRelative(x), SectionPos.sectionRelative(z));
   }

   private @Nullable ChunkSkyLightSources getChunkSources(final int chunkX, final int chunkZ) {
      LightChunk chunk = this.chunkSource.getChunkForLighting(chunkX, chunkZ);
      return chunk != null ? chunk.getSkyLightSources() : null;
   }

   @Override
   protected void checkNode(final long blockNode) {
      int x = BlockPos.getX(blockNode);
      int y = BlockPos.getY(blockNode);
      int z = BlockPos.getZ(blockNode);
      long sectionNode = SectionPos.blockToSection(blockNode);
      int lowestSourceY = this.storage.lightOnInSection(sectionNode) ? this.getLowestSourceY(x, z, Integer.MAX_VALUE) : Integer.MAX_VALUE;
      if (lowestSourceY != Integer.MAX_VALUE) {
         this.updateSourcesInColumn(x, z, lowestSourceY);
      }

      if (this.storage.storingLightForSection(sectionNode)) {
         boolean isSource = y >= lowestSourceY;
         if (isSource) {
            this.enqueueDecrease(blockNode, REMOVE_SKY_SOURCE_ENTRY);
            this.enqueueIncrease(blockNode, ADD_SKY_SOURCE_ENTRY);
         } else {
            int oldLevel = this.storage.getStoredLevel(blockNode);
            if (oldLevel > 0) {
               this.storage.setStoredLevel(blockNode, 0);
               this.enqueueDecrease(blockNode, LightEngine.QueueEntry.decreaseAllDirections(oldLevel));
            } else {
               this.enqueueDecrease(blockNode, PULL_LIGHT_IN_ENTRY);
            }
         }
      }
   }

   private void updateSourcesInColumn(final int x, final int z, final int lowestSourceY) {
      int worldBottomY = SectionPos.sectionToBlockCoord(this.storage.getBottomSectionY());
      this.removeSourcesBelow(x, z, lowestSourceY, worldBottomY);
      this.addSourcesAbove(x, z, lowestSourceY, worldBottomY);
   }

   private void removeSourcesBelow(final int x, final int z, final int lowestSourceY, final int worldBottomY) {
      if (lowestSourceY > worldBottomY) {
         int sectionX = SectionPos.blockToSectionCoord(x);
         int sectionZ = SectionPos.blockToSectionCoord(z);
         int startY = lowestSourceY - 1;

         for (int sectionY = SectionPos.blockToSectionCoord(startY); this.storage.hasLightDataAtOrBelow(sectionY); sectionY--) {
            if (this.storage.storingLightForSection(SectionPos.asLong(sectionX, sectionY, sectionZ))) {
               int sectionBottomY = SectionPos.sectionToBlockCoord(sectionY);
               int sectionTopY = sectionBottomY + 15;

               for (int y = Math.min(sectionTopY, startY); y >= sectionBottomY; y--) {
                  long blockNode = BlockPos.asLong(x, y, z);
                  if (!isSourceLevel(this.storage.getStoredLevel(blockNode))) {
                     return;
                  }

                  this.storage.setStoredLevel(blockNode, 0);
                  this.enqueueDecrease(blockNode, y == lowestSourceY - 1 ? REMOVE_TOP_SKY_SOURCE_ENTRY : REMOVE_SKY_SOURCE_ENTRY);
               }
            }
         }
      }
   }

   private void addSourcesAbove(final int x, final int z, final int lowestSourceY, final int worldBottomY) {
      int sectionX = SectionPos.blockToSectionCoord(x);
      int sectionZ = SectionPos.blockToSectionCoord(z);
      int neighborLowestSourceY = Math.max(
         Math.max(this.getLowestSourceY(x - 1, z, Integer.MIN_VALUE), this.getLowestSourceY(x + 1, z, Integer.MIN_VALUE)),
         Math.max(this.getLowestSourceY(x, z - 1, Integer.MIN_VALUE), this.getLowestSourceY(x, z + 1, Integer.MIN_VALUE))
      );
      int startY = Math.max(lowestSourceY, worldBottomY);

      for (long sectionNode = SectionPos.asLong(sectionX, SectionPos.blockToSectionCoord(startY), sectionZ);
         !this.storage.isAboveData(sectionNode);
         sectionNode = SectionPos.offset(sectionNode, Direction.UP)
      ) {
         if (this.storage.storingLightForSection(sectionNode)) {
            int sectionBottomY = SectionPos.sectionToBlockCoord(SectionPos.y(sectionNode));
            int sectionTopY = sectionBottomY + 15;

            for (int y = Math.max(sectionBottomY, startY); y <= sectionTopY; y++) {
               long blockNode = BlockPos.asLong(x, y, z);
               if (isSourceLevel(this.storage.getStoredLevel(blockNode))) {
                  return;
               }

               this.storage.setStoredLevel(blockNode, 15);
               if (y < neighborLowestSourceY || y == lowestSourceY) {
                  this.enqueueIncrease(blockNode, ADD_SKY_SOURCE_ENTRY);
               }
            }
         }
      }
   }

   @Override
   protected void propagateIncrease(final long fromNode, final long increaseData, final int fromLevel) {
      BlockState fromState = null;
      int emptySectionsBelow = this.countEmptySectionsBelowIfAtBorder(fromNode);

      for (Direction propagationDirection : PROPAGATION_DIRECTIONS) {
         if (LightEngine.QueueEntry.shouldPropagateInDirection(increaseData, propagationDirection)) {
            long toNode = BlockPos.offset(fromNode, propagationDirection);
            if (this.storage.storingLightForSection(SectionPos.blockToSection(toNode))) {
               int toLevel = this.storage.getStoredLevel(toNode);
               int maxPossibleNewToLevel = fromLevel - 1;
               if (maxPossibleNewToLevel > toLevel) {
                  this.mutablePos.set(toNode);
                  BlockState toState = this.getState(this.mutablePos);
                  int newToLevel = fromLevel - this.getOpacity(toState);
                  if (newToLevel > toLevel) {
                     if (fromState == null) {
                        fromState = LightEngine.QueueEntry.isFromEmptyShape(increaseData)
                           ? Blocks.AIR.defaultBlockState()
                           : this.getState(this.mutablePos.set(fromNode));
                     }

                     if (!this.shapeOccludes(fromState, toState, propagationDirection)) {
                        this.storage.setStoredLevel(toNode, newToLevel);
                        if (newToLevel > 1) {
                           this.enqueueIncrease(
                              toNode, LightEngine.QueueEntry.increaseSkipOneDirection(newToLevel, isEmptyShape(toState), propagationDirection.getOpposite())
                           );
                        }

                        this.propagateFromEmptySections(toNode, propagationDirection, newToLevel, true, emptySectionsBelow);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void propagateDecrease(final long fromNode, final long decreaseData) {
      int emptySectionsBelow = this.countEmptySectionsBelowIfAtBorder(fromNode);
      int oldFromLevel = LightEngine.QueueEntry.getFromLevel(decreaseData);

      for (Direction propagationDirection : PROPAGATION_DIRECTIONS) {
         if (LightEngine.QueueEntry.shouldPropagateInDirection(decreaseData, propagationDirection)) {
            long toNode = BlockPos.offset(fromNode, propagationDirection);
            if (this.storage.storingLightForSection(SectionPos.blockToSection(toNode))) {
               int toLevel = this.storage.getStoredLevel(toNode);
               if (toLevel != 0) {
                  if (toLevel <= oldFromLevel - 1) {
                     this.storage.setStoredLevel(toNode, 0);
                     this.enqueueDecrease(toNode, LightEngine.QueueEntry.decreaseSkipOneDirection(toLevel, propagationDirection.getOpposite()));
                     this.propagateFromEmptySections(toNode, propagationDirection, toLevel, false, emptySectionsBelow);
                  } else {
                     this.enqueueIncrease(toNode, LightEngine.QueueEntry.increaseOnlyOneDirection(toLevel, false, propagationDirection.getOpposite()));
                  }
               }
            }
         }
      }
   }

   private int countEmptySectionsBelowIfAtBorder(final long blockNode) {
      int y = BlockPos.getY(blockNode);
      int localY = SectionPos.sectionRelative(y);
      if (localY != 0) {
         return 0;
      }

      int x = BlockPos.getX(blockNode);
      int z = BlockPos.getZ(blockNode);
      int localX = SectionPos.sectionRelative(x);
      int localZ = SectionPos.sectionRelative(z);
      if (localX != 0 && localX != 15 && localZ != 0 && localZ != 15) {
         return 0;
      }

      int sectionX = SectionPos.blockToSectionCoord(x);
      int sectionY = SectionPos.blockToSectionCoord(y);
      int sectionZ = SectionPos.blockToSectionCoord(z);
      int emptySectionsBelow = 0;

      while (
         !this.storage.storingLightForSection(SectionPos.asLong(sectionX, sectionY - emptySectionsBelow - 1, sectionZ))
            && this.storage.hasLightDataAtOrBelow(sectionY - emptySectionsBelow - 1)
      ) {
         emptySectionsBelow++;
      }

      return emptySectionsBelow;
   }

   private void propagateFromEmptySections(
      final long toNode, final Direction propagationDirection, final int toLevel, final boolean increase, final int emptySectionsBelow
   ) {
      if (emptySectionsBelow != 0) {
         int x = BlockPos.getX(toNode);
         int z = BlockPos.getZ(toNode);
         if (crossedSectionEdge(propagationDirection, SectionPos.sectionRelative(x), SectionPos.sectionRelative(z))) {
            int y = BlockPos.getY(toNode);
            int sectionX = SectionPos.blockToSectionCoord(x);
            int sectionZ = SectionPos.blockToSectionCoord(z);
            int sectionY = SectionPos.blockToSectionCoord(y) - 1;
            int bottomSectionY = sectionY - emptySectionsBelow + 1;

            while (sectionY >= bottomSectionY) {
               if (!this.storage.storingLightForSection(SectionPos.asLong(sectionX, sectionY, sectionZ))) {
                  sectionY--;
               } else {
                  int sectionMinY = SectionPos.sectionToBlockCoord(sectionY);

                  for (int localY = 15; localY >= 0; localY--) {
                     long blockNode = BlockPos.asLong(x, sectionMinY + localY, z);
                     if (increase) {
                        this.storage.setStoredLevel(blockNode, toLevel);
                        if (toLevel > 1) {
                           this.enqueueIncrease(blockNode, LightEngine.QueueEntry.increaseSkipOneDirection(toLevel, true, propagationDirection.getOpposite()));
                        }
                     } else {
                        this.storage.setStoredLevel(blockNode, 0);
                        this.enqueueDecrease(blockNode, LightEngine.QueueEntry.decreaseSkipOneDirection(toLevel, propagationDirection.getOpposite()));
                     }
                  }

                  sectionY--;
               }
            }
         }
      }
   }

   private static boolean crossedSectionEdge(final Direction propagationDirection, final int x, final int z) {
      return switch (propagationDirection) {
         case NORTH -> z == 15;
         case SOUTH -> z == 0;
         case WEST -> x == 15;
         case EAST -> x == 0;
         default -> false;
      };
   }

   @Override
   public void setLightEnabled(final ChunkPos pos, final boolean enable) {
      super.setLightEnabled(pos, enable);
      if (enable) {
         ChunkSkyLightSources sources = Objects.requireNonNullElse(this.getChunkSources(pos.x(), pos.z()), this.emptyChunkSources);
         int highestNonSourceY = sources.getHighestLowestSourceY() - 1;
         int lowestFullySourceSectionY = SectionPos.blockToSectionCoord(highestNonSourceY) + 1;
         long zeroNode = SectionPos.getZeroNode(pos.x(), pos.z());
         int topSectionY = this.storage.getTopSectionY(zeroNode);
         int bottomSectionY = Math.max(this.storage.getBottomSectionY(), lowestFullySourceSectionY);

         for (int sectionY = topSectionY - 1; sectionY >= bottomSectionY; sectionY--) {
            DataLayer dataLayer = this.storage.getDataLayerToWrite(SectionPos.asLong(pos.x(), sectionY, pos.z()));
            if (dataLayer != null && dataLayer.isEmpty()) {
               dataLayer.fill(15);
            }
         }
      }
   }

   @Override
   public void propagateLightSources(final ChunkPos pos) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 004: aload 1
      // 005: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 008: invokestatic net/minecraft/core/SectionPos.getZeroNode (II)J
      // 00b: lstore 2
      // 00c: aload 0
      // 00d: getfield net/minecraft/world/level/lighting/SkyLightEngine.storage Lnet/minecraft/world/level/lighting/LayerLightSectionStorage;
      // 010: checkcast net/minecraft/world/level/lighting/SkyLightSectionStorage
      // 013: lload 2
      // 014: bipush 1
      // 015: invokevirtual net/minecraft/world/level/lighting/SkyLightSectionStorage.setLightEnabled (JZ)V
      // 018: aload 0
      // 019: aload 1
      // 01a: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 01d: aload 1
      // 01e: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 021: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.getChunkSources (II)Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 024: aload 0
      // 025: getfield net/minecraft/world/level/lighting/SkyLightEngine.emptyChunkSources Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 028: invokestatic java/util/Objects.requireNonNullElse (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 02b: checkcast net/minecraft/world/level/lighting/ChunkSkyLightSources
      // 02e: astore 4
      // 030: aload 0
      // 031: aload 1
      // 032: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 035: aload 1
      // 036: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 039: bipush 1
      // 03a: isub
      // 03b: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.getChunkSources (II)Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 03e: aload 0
      // 03f: getfield net/minecraft/world/level/lighting/SkyLightEngine.emptyChunkSources Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 042: invokestatic java/util/Objects.requireNonNullElse (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 045: checkcast net/minecraft/world/level/lighting/ChunkSkyLightSources
      // 048: astore 5
      // 04a: aload 0
      // 04b: aload 1
      // 04c: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 04f: aload 1
      // 050: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 053: bipush 1
      // 054: iadd
      // 055: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.getChunkSources (II)Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 058: aload 0
      // 059: getfield net/minecraft/world/level/lighting/SkyLightEngine.emptyChunkSources Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 05c: invokestatic java/util/Objects.requireNonNullElse (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 05f: checkcast net/minecraft/world/level/lighting/ChunkSkyLightSources
      // 062: astore 6
      // 064: aload 0
      // 065: aload 1
      // 066: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 069: bipush 1
      // 06a: isub
      // 06b: aload 1
      // 06c: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 06f: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.getChunkSources (II)Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 072: aload 0
      // 073: getfield net/minecraft/world/level/lighting/SkyLightEngine.emptyChunkSources Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 076: invokestatic java/util/Objects.requireNonNullElse (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 079: checkcast net/minecraft/world/level/lighting/ChunkSkyLightSources
      // 07c: astore 7
      // 07e: aload 0
      // 07f: aload 1
      // 080: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 083: bipush 1
      // 084: iadd
      // 085: aload 1
      // 086: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 089: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.getChunkSources (II)Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 08c: aload 0
      // 08d: getfield net/minecraft/world/level/lighting/SkyLightEngine.emptyChunkSources Lnet/minecraft/world/level/lighting/ChunkSkyLightSources;
      // 090: invokestatic java/util/Objects.requireNonNullElse (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 093: checkcast net/minecraft/world/level/lighting/ChunkSkyLightSources
      // 096: astore 8
      // 098: aload 0
      // 099: getfield net/minecraft/world/level/lighting/SkyLightEngine.storage Lnet/minecraft/world/level/lighting/LayerLightSectionStorage;
      // 09c: checkcast net/minecraft/world/level/lighting/SkyLightSectionStorage
      // 09f: lload 2
      // 0a0: invokevirtual net/minecraft/world/level/lighting/SkyLightSectionStorage.getTopSectionY (J)I
      // 0a3: istore 9
      // 0a5: aload 0
      // 0a6: getfield net/minecraft/world/level/lighting/SkyLightEngine.storage Lnet/minecraft/world/level/lighting/LayerLightSectionStorage;
      // 0a9: checkcast net/minecraft/world/level/lighting/SkyLightSectionStorage
      // 0ac: invokevirtual net/minecraft/world/level/lighting/SkyLightSectionStorage.getBottomSectionY ()I
      // 0af: istore 10
      // 0b1: aload 1
      // 0b2: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 0b5: invokestatic net/minecraft/core/SectionPos.sectionToBlockCoord (I)I
      // 0b8: istore 11
      // 0ba: aload 1
      // 0bb: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 0be: invokestatic net/minecraft/core/SectionPos.sectionToBlockCoord (I)I
      // 0c1: istore 12
      // 0c3: iload 9
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: istore 13
      // 0c9: iload 13
      // 0cb: iload 10
      // 0cd: if_icmplt 26a
      // 0d0: aload 1
      // 0d1: invokevirtual net/minecraft/world/level/ChunkPos.x ()I
      // 0d4: iload 13
      // 0d6: aload 1
      // 0d7: invokevirtual net/minecraft/world/level/ChunkPos.z ()I
      // 0da: invokestatic net/minecraft/core/SectionPos.asLong (III)J
      // 0dd: lstore 14
      // 0df: aload 0
      // 0e0: getfield net/minecraft/world/level/lighting/SkyLightEngine.storage Lnet/minecraft/world/level/lighting/LayerLightSectionStorage;
      // 0e3: checkcast net/minecraft/world/level/lighting/SkyLightSectionStorage
      // 0e6: lload 14
      // 0e8: invokevirtual net/minecraft/world/level/lighting/SkyLightSectionStorage.getDataLayerToWrite (J)Lnet/minecraft/world/level/chunk/DataLayer;
      // 0eb: astore 16
      // 0ed: aload 16
      // 0ef: ifnonnull 0f5
      // 0f2: goto 264
      // 0f5: iload 13
      // 0f7: invokestatic net/minecraft/core/SectionPos.sectionToBlockCoord (I)I
      // 0fa: istore 17
      // 0fc: iload 17
      // 0fe: bipush 15
      // 100: iadd
      // 101: istore 18
      // 103: bipush 0
      // 104: istore 19
      // 106: bipush 0
      // 107: istore 20
      // 109: iload 20
      // 10b: bipush 16
      // 10d: if_icmpge 25c
      // 110: bipush 0
      // 111: istore 21
      // 113: iload 21
      // 115: bipush 16
      // 117: if_icmpge 256
      // 11a: aload 4
      // 11c: iload 21
      // 11e: iload 20
      // 120: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 123: istore 22
      // 125: iload 22
      // 127: iload 18
      // 129: if_icmple 12f
      // 12c: goto 250
      // 12f: iload 20
      // 131: ifne 140
      // 134: aload 5
      // 136: iload 21
      // 138: bipush 15
      // 13a: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 13d: goto 14b
      // 140: aload 4
      // 142: iload 21
      // 144: iload 20
      // 146: bipush 1
      // 147: isub
      // 148: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 14b: istore 23
      // 14d: iload 20
      // 14f: bipush 15
      // 151: if_icmpne 15f
      // 154: aload 6
      // 156: iload 21
      // 158: bipush 0
      // 159: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 15c: goto 16a
      // 15f: aload 4
      // 161: iload 21
      // 163: iload 20
      // 165: bipush 1
      // 166: iadd
      // 167: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 16a: istore 24
      // 16c: iload 21
      // 16e: ifne 17d
      // 171: aload 7
      // 173: bipush 15
      // 175: iload 20
      // 177: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 17a: goto 188
      // 17d: aload 4
      // 17f: iload 21
      // 181: bipush 1
      // 182: isub
      // 183: iload 20
      // 185: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 188: istore 25
      // 18a: iload 21
      // 18c: bipush 15
      // 18e: if_icmpne 19c
      // 191: aload 8
      // 193: bipush 0
      // 194: iload 20
      // 196: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 199: goto 1a7
      // 19c: aload 4
      // 19e: iload 21
      // 1a0: bipush 1
      // 1a1: iadd
      // 1a2: iload 20
      // 1a4: invokevirtual net/minecraft/world/level/lighting/ChunkSkyLightSources.getLowestSourceY (II)I
      // 1a7: istore 26
      // 1a9: iload 23
      // 1ab: iload 24
      // 1ad: invokestatic java/lang/Math.max (II)I
      // 1b0: iload 25
      // 1b2: iload 26
      // 1b4: invokestatic java/lang/Math.max (II)I
      // 1b7: invokestatic java/lang/Math.max (II)I
      // 1ba: istore 27
      // 1bc: iload 18
      // 1be: istore 28
      // 1c0: iload 28
      // 1c2: iload 17
      // 1c4: iload 22
      // 1c6: invokestatic java/lang/Math.max (II)I
      // 1c9: if_icmplt 246
      // 1cc: aload 16
      // 1ce: iload 21
      // 1d0: iload 28
      // 1d2: invokestatic net/minecraft/core/SectionPos.sectionRelative (I)I
      // 1d5: iload 20
      // 1d7: bipush 15
      // 1d9: invokevirtual net/minecraft/world/level/chunk/DataLayer.set (IIII)V
      // 1dc: iload 28
      // 1de: iload 22
      // 1e0: if_icmpeq 1ea
      // 1e3: iload 28
      // 1e5: iload 27
      // 1e7: if_icmpge 240
      // 1ea: iload 11
      // 1ec: iload 21
      // 1ee: iadd
      // 1ef: iload 28
      // 1f1: iload 12
      // 1f3: iload 20
      // 1f5: iadd
      // 1f6: invokestatic net/minecraft/core/BlockPos.asLong (III)J
      // 1f9: lstore 29
      // 1fb: aload 0
      // 1fc: lload 29
      // 1fe: iload 28
      // 200: iload 22
      // 202: if_icmpne 209
      // 205: bipush 1
      // 206: goto 20a
      // 209: bipush 0
      // 20a: iload 28
      // 20c: iload 23
      // 20e: if_icmpge 215
      // 211: bipush 1
      // 212: goto 216
      // 215: bipush 0
      // 216: iload 28
      // 218: iload 24
      // 21a: if_icmpge 221
      // 21d: bipush 1
      // 21e: goto 222
      // 221: bipush 0
      // 222: iload 28
      // 224: iload 25
      // 226: if_icmpge 22d
      // 229: bipush 1
      // 22a: goto 22e
      // 22d: bipush 0
      // 22e: iload 28
      // 230: iload 26
      // 232: if_icmpge 239
      // 235: bipush 1
      // 236: goto 23a
      // 239: bipush 0
      // 23a: invokestatic net/minecraft/world/level/lighting/LightEngine$QueueEntry.increaseSkySourceInDirections (ZZZZZ)J
      // 23d: invokevirtual net/minecraft/world/level/lighting/SkyLightEngine.enqueueIncrease (JJ)V
      // 240: iinc 28 -1
      // 243: goto 1c0
      // 246: iload 22
      // 248: iload 17
      // 24a: if_icmpge 250
      // 24d: bipush 1
      // 24e: istore 19
      // 250: iinc 21 1
      // 253: goto 113
      // 256: iinc 20 1
      // 259: goto 109
      // 25c: iload 19
      // 25e: ifne 264
      // 261: goto 26a
      // 264: iinc 13 -1
      // 267: goto 0c9
      // 26a: return
   }
}
