package net.minecraft.world.level.levelgen.structure.structures;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.EndPortalFrameBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import org.jspecify.annotations.Nullable;

public class StrongholdPieces {
   private static final int SMALL_DOOR_WIDTH = 3;
   private static final int SMALL_DOOR_HEIGHT = 3;
   private static final int MAX_DEPTH = 50;
   private static final int LOWEST_Y_POSITION = 10;
   private static final boolean CHECK_AIR = true;
   public static final int MAGIC_START_Y = 64;
   private static final StrongholdPieces.PieceWeight[] STRONGHOLD_PIECE_WEIGHTS = new StrongholdPieces.PieceWeight[]{
      new StrongholdPieces.PieceWeight(StrongholdPieces.Straight.class, 40, 0),
      new StrongholdPieces.PieceWeight(StrongholdPieces.PrisonHall.class, 5, 5),
      new StrongholdPieces.PieceWeight(StrongholdPieces.LeftTurn.class, 20, 0),
      new StrongholdPieces.PieceWeight(StrongholdPieces.RightTurn.class, 20, 0),
      new StrongholdPieces.PieceWeight(StrongholdPieces.RoomCrossing.class, 10, 6),
      new StrongholdPieces.PieceWeight(StrongholdPieces.StraightStairsDown.class, 5, 5),
      new StrongholdPieces.PieceWeight(StrongholdPieces.StairsDown.class, 5, 5),
      new StrongholdPieces.PieceWeight(StrongholdPieces.FiveCrossing.class, 5, 4),
      new StrongholdPieces.PieceWeight(StrongholdPieces.ChestCorridor.class, 5, 4),
      new StrongholdPieces.PieceWeight(StrongholdPieces.Library.class, 10, 2) {
         @Override
         public boolean doPlace(final int depth) {
            return super.doPlace(depth) && depth > 4;
         }
      },
      new StrongholdPieces.PieceWeight(StrongholdPieces.PortalRoom.class, 20, 1) {
         @Override
         public boolean doPlace(final int depth) {
            return super.doPlace(depth) && depth > 5;
         }
      }
   };
   private static List<StrongholdPieces.PieceWeight> currentPieces;
   private static @Nullable Class<? extends StrongholdPieces.StrongholdPiece> imposedPiece;
   private static int totalWeight;
   private static final StrongholdPieces.SmoothStoneSelector SMOOTH_STONE_SELECTOR = new StrongholdPieces.SmoothStoneSelector();

   public static void resetPieces() {
      currentPieces = Lists.newArrayList();

      for (StrongholdPieces.PieceWeight piece : STRONGHOLD_PIECE_WEIGHTS) {
         piece.placeCount = 0;
         currentPieces.add(piece);
      }

      imposedPiece = null;
   }

   private static boolean updatePieceWeight() {
      boolean hasAnyPieces = false;
      totalWeight = 0;

      for (StrongholdPieces.PieceWeight piece : currentPieces) {
         if (piece.maxPlaceCount > 0 && piece.placeCount < piece.maxPlaceCount) {
            hasAnyPieces = true;
         }

         totalWeight = totalWeight + piece.weight;
      }

      return hasAnyPieces;
   }

   private static StrongholdPieces.@Nullable StrongholdPiece findAndCreatePieceFactory(
      final Class<? extends StrongholdPieces.StrongholdPiece> pieceClass,
      final StructurePiecesBuilder builder,
      final RandomSource random,
      final int footX,
      final int footY,
      final int footZ,
      final Direction direction,
      final int depth
   ) {
      StrongholdPieces.StrongholdPiece strongholdPiece = null;
      if (pieceClass == StrongholdPieces.Straight.class) {
         strongholdPiece = StrongholdPieces.Straight.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.PrisonHall.class) {
         strongholdPiece = StrongholdPieces.PrisonHall.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.LeftTurn.class) {
         strongholdPiece = StrongholdPieces.LeftTurn.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.RightTurn.class) {
         strongholdPiece = StrongholdPieces.RightTurn.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.RoomCrossing.class) {
         strongholdPiece = StrongholdPieces.RoomCrossing.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.StraightStairsDown.class) {
         strongholdPiece = StrongholdPieces.StraightStairsDown.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.StairsDown.class) {
         strongholdPiece = StrongholdPieces.StairsDown.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.FiveCrossing.class) {
         strongholdPiece = StrongholdPieces.FiveCrossing.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.ChestCorridor.class) {
         strongholdPiece = StrongholdPieces.ChestCorridor.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.Library.class) {
         strongholdPiece = StrongholdPieces.Library.createPiece(builder, random, footX, footY, footZ, direction, depth);
      } else if (pieceClass == StrongholdPieces.PortalRoom.class) {
         strongholdPiece = StrongholdPieces.PortalRoom.createPiece(builder, footX, footY, footZ, direction, depth);
      }

      return strongholdPiece;
   }

   private static StrongholdPieces.@Nullable StrongholdPiece generatePieceFromSmallDoor(
      final StrongholdPieces.StartPiece startPiece,
      final StructurePiecesBuilder builder,
      final RandomSource random,
      final int footX,
      final int footY,
      final int footZ,
      final Direction direction,
      final int depth
   ) {
      if (!updatePieceWeight()) {
         return null;
      }

      if (imposedPiece != null) {
         StrongholdPieces.StrongholdPiece strongholdPiece = findAndCreatePieceFactory(imposedPiece, builder, random, footX, footY, footZ, direction, depth);
         imposedPiece = null;
         if (strongholdPiece != null) {
            return strongholdPiece;
         }
      }

      int numAttempts = 0;

      while (numAttempts < 5) {
         numAttempts++;
         int weightSelection = random.nextInt(totalWeight);

         for (StrongholdPieces.PieceWeight piece : currentPieces) {
            weightSelection -= piece.weight;
            if (weightSelection < 0) {
               if (!piece.doPlace(depth) || piece == startPiece.previousPiece) {
                  break;
               }

               StrongholdPieces.StrongholdPiece strongholdPiece = findAndCreatePieceFactory(
                  piece.pieceClass, builder, random, footX, footY, footZ, direction, depth
               );
               if (strongholdPiece != null) {
                  piece.placeCount++;
                  startPiece.previousPiece = piece;
                  if (!piece.isValid()) {
                     currentPieces.remove(piece);
                  }

                  return strongholdPiece;
               }
            }
         }
      }

      BoundingBox box = StrongholdPieces.FillerCorridor.findPieceBox(builder, random, footX, footY, footZ, direction);
      return box != null && box.minY() > 1 ? new StrongholdPieces.FillerCorridor(depth, box, direction) : null;
   }

   private static @Nullable StructurePiece generateAndAddPiece(
      final StrongholdPieces.StartPiece startPiece,
      final StructurePiecesBuilder builder,
      final RandomSource random,
      final int footX,
      final int footY,
      final int footZ,
      final Direction direction,
      final int depth
   ) {
      if (depth > 50) {
         return null;
      }

      if (Math.abs(footX - startPiece.getBoundingBox().minX()) <= 112 && Math.abs(footZ - startPiece.getBoundingBox().minZ()) <= 112) {
         StructurePiece newPiece = generatePieceFromSmallDoor(startPiece, builder, random, footX, footY, footZ, direction, depth + 1);
         if (newPiece != null) {
            builder.addPiece(newPiece);
            startPiece.pendingChildren.add(newPiece);
         }

         return newPiece;
      } else {
         return null;
      }
   }

   public static class ChestCorridor extends StrongholdPieces.StrongholdPiece {
      private static final int WIDTH = 5;
      private static final int HEIGHT = 5;
      private static final int DEPTH = 7;
      private boolean hasPlacedChest;

      public ChestCorridor(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_CHEST_CORRIDOR, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public ChestCorridor(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_CHEST_CORRIDOR, tag);
         this.hasPlacedChest = tag.getBooleanOr("Chest", false);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("Chest", this.hasPlacedChest);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
      }

      public static StrongholdPieces.@Nullable ChestCorridor createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, 7, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.ChestCorridor(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 4, 6, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 1, 0);
         this.generateSmallDoor(level, random, chunkBB, StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING, 1, 1, 6);
         this.generateBox(level, chunkBB, 3, 1, 2, 3, 1, 4, Blocks.STONE_BRICKS.defaultBlockState(), Blocks.STONE_BRICKS.defaultBlockState(), false);
         this.placeBlock(level, Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3, 1, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3, 1, 5, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3, 2, 2, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3, 2, 4, chunkBB);

         for (int z = 2; z <= 4; z++) {
            this.placeBlock(level, Blocks.STONE_BRICK_SLAB.defaultBlockState(), 2, 1, z, chunkBB);
         }

         if (!this.hasPlacedChest && chunkBB.isInside(this.getWorldPos(3, 2, 3))) {
            this.hasPlacedChest = true;
            this.createChest(level, chunkBB, random, 3, 2, 3, BuiltInLootTables.STRONGHOLD_CORRIDOR);
         }
      }
   }

   public static class FillerCorridor extends StrongholdPieces.StrongholdPiece {
      private final int steps;

      public FillerCorridor(final int genDepth, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_FILLER_CORRIDOR, genDepth, boundingBox);
         this.setOrientation(direction);
         this.steps = direction != Direction.NORTH && direction != Direction.SOUTH ? boundingBox.getXSpan() : boundingBox.getZSpan();
      }

      public FillerCorridor(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_FILLER_CORRIDOR, tag);
         this.steps = tag.getIntOr("Steps", 0);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putInt("Steps", this.steps);
      }

      public static @Nullable BoundingBox findPieceBox(
         final StructurePiecesBuilder builder, final RandomSource random, final int footX, final int footY, final int footZ, final Direction direction
      ) {
         int maxLength = 3;
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, 4, direction);
         StructurePiece collisionPiece = builder.findCollisionPiece(box);
         if (collisionPiece == null) {
            return null;
         }

         if (collisionPiece.getBoundingBox().minY() == box.minY()) {
            for (int depth = 2; depth >= 1; depth--) {
               box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, depth, direction);
               if (!collisionPiece.getBoundingBox().intersects(box)) {
                  return BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, depth + 1, direction);
               }
            }
         }

         return null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         for (int i = 0; i < this.steps; i++) {
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 0, 0, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 0, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 0, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 0, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 4, 0, i, chunkBB);

            for (int y = 1; y <= 3; y++) {
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 0, y, i, chunkBB);
               this.placeBlock(level, Blocks.CAVE_AIR.defaultBlockState(), 1, y, i, chunkBB);
               this.placeBlock(level, Blocks.CAVE_AIR.defaultBlockState(), 2, y, i, chunkBB);
               this.placeBlock(level, Blocks.CAVE_AIR.defaultBlockState(), 3, y, i, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 4, y, i, chunkBB);
            }

            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 0, 4, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 4, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 4, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 4, i, chunkBB);
            this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 4, 4, i, chunkBB);
         }
      }
   }

   public static class FiveCrossing extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 10;
      protected static final int HEIGHT = 9;
      protected static final int DEPTH = 11;
      private final boolean leftLow;
      private final boolean leftHigh;
      private final boolean rightLow;
      private final boolean rightHigh;

      public FiveCrossing(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_FIVE_CROSSING, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
         this.leftLow = random.nextBoolean();
         this.leftHigh = random.nextBoolean();
         this.rightLow = random.nextBoolean();
         this.rightHigh = random.nextInt(3) > 0;
      }

      public FiveCrossing(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_FIVE_CROSSING, tag);
         this.leftLow = tag.getBooleanOr("leftLow", false);
         this.leftHigh = tag.getBooleanOr("leftHigh", false);
         this.rightLow = tag.getBooleanOr("rightLow", false);
         this.rightHigh = tag.getBooleanOr("rightHigh", false);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("leftLow", this.leftLow);
         tag.putBoolean("leftHigh", this.leftHigh);
         tag.putBoolean("rightLow", this.rightLow);
         tag.putBoolean("rightHigh", this.rightHigh);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         int zOffA = 3;
         int zOffB = 5;
         Direction orientation = this.getOrientation();
         if (orientation == Direction.WEST || orientation == Direction.NORTH) {
            zOffA = 8 - zOffA;
            zOffB = 8 - zOffB;
         }

         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 5, 1);
         if (this.leftLow) {
            this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, zOffA, 1);
         }

         if (this.leftHigh) {
            this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, zOffB, 7);
         }

         if (this.rightLow) {
            this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, zOffA, 1);
         }

         if (this.rightHigh) {
            this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, zOffB, 7);
         }
      }

      public static StrongholdPieces.@Nullable FiveCrossing createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -4, -3, 0, 10, 9, 11, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.FiveCrossing(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 9, 8, 10, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 4, 3, 0);
         if (this.leftLow) {
            this.generateBox(level, chunkBB, 0, 3, 1, 0, 5, 3, CAVE_AIR, CAVE_AIR, false);
         }

         if (this.rightLow) {
            this.generateBox(level, chunkBB, 9, 3, 1, 9, 5, 3, CAVE_AIR, CAVE_AIR, false);
         }

         if (this.leftHigh) {
            this.generateBox(level, chunkBB, 0, 5, 7, 0, 7, 9, CAVE_AIR, CAVE_AIR, false);
         }

         if (this.rightHigh) {
            this.generateBox(level, chunkBB, 9, 5, 7, 9, 7, 9, CAVE_AIR, CAVE_AIR, false);
         }

         this.generateBox(level, chunkBB, 5, 1, 10, 7, 3, 10, CAVE_AIR, CAVE_AIR, false);
         this.generateBox(level, chunkBB, 1, 2, 1, 8, 2, 6, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 1, 5, 4, 4, 9, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 8, 1, 5, 8, 4, 9, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 1, 4, 7, 3, 4, 9, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 1, 3, 5, 3, 3, 6, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 1, 3, 4, 3, 3, 4, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 1, 4, 6, 3, 4, 6, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 5, 1, 7, 7, 1, 8, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 5, 1, 9, 7, 1, 9, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 5, 2, 7, 7, 2, 7, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 4, 5, 7, 4, 5, 9, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 8, 5, 7, 8, 5, 9, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), false);
         this.generateBox(
            level,
            chunkBB,
            5,
            5,
            7,
            7,
            5,
            9,
            Blocks.SMOOTH_STONE_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, SlabType.DOUBLE),
            Blocks.SMOOTH_STONE_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, SlabType.DOUBLE),
            false
         );
         this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.SOUTH), 6, 5, 6, chunkBB);
      }
   }

   public static class LeftTurn extends StrongholdPieces.Turn {
      public LeftTurn(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_LEFT_TURN, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public LeftTurn(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_LEFT_TURN, tag);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         Direction orientation = this.getOrientation();
         if (orientation != Direction.NORTH && orientation != Direction.EAST) {
            this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
         } else {
            this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
         }
      }

      public static StrongholdPieces.@Nullable LeftTurn createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, 5, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.LeftTurn(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 4, 4, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 1, 0);
         Direction orientation = this.getOrientation();
         if (orientation != Direction.NORTH && orientation != Direction.EAST) {
            this.generateBox(level, chunkBB, 4, 1, 1, 4, 3, 3, CAVE_AIR, CAVE_AIR, false);
         } else {
            this.generateBox(level, chunkBB, 0, 1, 1, 0, 3, 3, CAVE_AIR, CAVE_AIR, false);
         }
      }
   }

   public static class Library extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 14;
      protected static final int HEIGHT = 6;
      protected static final int TALL_HEIGHT = 11;
      protected static final int DEPTH = 15;
      private final boolean isTall;

      public Library(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_LIBRARY, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
         this.isTall = boundingBox.getYSpan() > 6;
      }

      public Library(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_LIBRARY, tag);
         this.isTall = tag.getBooleanOr("Tall", false);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("Tall", this.isTall);
      }

      public static StrongholdPieces.@Nullable Library createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -4, -1, 0, 14, 11, 15, direction);
         if (!isOkBox(box) || builder.findCollisionPiece(box) != null) {
            box = BoundingBox.orientBox(footX, footY, footZ, -4, -1, 0, 14, 6, 15, direction);
            if (!isOkBox(box) || builder.findCollisionPiece(box) != null) {
               return null;
            }
         }

         return new StrongholdPieces.Library(genDepth, random, box, direction);
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.OutOfMemoryError: Java heap space
         //   at java.base/jdk.internal.misc.Unsafe.allocateUninitializedArray(Unsafe.java:1396)
         //   at java.base/java.lang.StringConcatHelper.newArray(StringConcatHelper.java:578)
         //   at java.base/java.lang.StringConcatHelper.newArrayWithSuffix(StringConcatHelper.java:611)
         //   at java.base/java.lang.String$$StringConcat/0x00000000850ac400.concat(Unknown Source)
         //   at java.base/java.lang.invoke.DirectMethodHandle$Holder.invokeSpecial(DirectMethodHandle$Holder)
         //   at java.base/java.lang.invoke.LambdaForm$MH/0x00000000850acc00.invoke(LambdaForm$MH)
         //   at java.base/java.lang.invoke.Invokers$Holder.linkToTargetMethod(Invokers$Holder)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:133)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:137)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:137)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:120)
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:115)
         //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.getImplicitlyDefinedVars(BasicBlockStatement.java:115)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.<init>(VarDefinitionHelper.java:135)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.<init>(VarDefinitionHelper.java:52)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarDefinitions(VarProcessor.java:52)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:458)
         //
         // Bytecode:
         // 000: bipush 11
         // 002: istore 8
         // 004: aload 0
         // 005: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.isTall Z
         // 008: ifne 00f
         // 00b: bipush 6
         // 00d: istore 8
         // 00f: aload 0
         // 010: aload 1
         // 011: aload 5
         // 013: bipush 0
         // 014: bipush 0
         // 015: bipush 0
         // 016: bipush 13
         // 018: iload 8
         // 01a: bipush 1
         // 01b: isub
         // 01c: bipush 14
         // 01e: bipush 1
         // 01f: aload 4
         // 021: getstatic net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces.SMOOTH_STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$SmoothStoneSelector;
         // 024: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
         // 027: aload 0
         // 028: aload 1
         // 029: aload 4
         // 02b: aload 5
         // 02d: aload 0
         // 02e: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.entryDoor Lnet/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$StrongholdPiece$SmallDoorType;
         // 031: bipush 4
         // 032: bipush 1
         // 033: bipush 0
         // 034: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateSmallDoor (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$StrongholdPiece$SmallDoorType;III)V
         // 037: aload 0
         // 038: aload 1
         // 039: aload 5
         // 03b: aload 4
         // 03d: ldc 0.07
         // 03f: bipush 2
         // 040: bipush 1
         // 041: bipush 1
         // 042: bipush 11
         // 044: bipush 4
         // 045: bipush 13
         // 047: getstatic net/minecraft/world/level/block/Blocks.COBWEB Lnet/minecraft/world/level/block/Block;
         // 04a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 04d: getstatic net/minecraft/world/level/block/Blocks.COBWEB Lnet/minecraft/world/level/block/Block;
         // 050: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 053: bipush 0
         // 054: bipush 0
         // 055: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateMaybeBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;FIIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;ZZ)V
         // 058: bipush 1
         // 059: istore 9
         // 05b: bipush 12
         // 05d: istore 10
         // 05f: bipush 1
         // 060: istore 11
         // 062: iload 11
         // 064: bipush 13
         // 066: if_icmpgt 1b4
         // 069: iload 11
         // 06b: bipush 1
         // 06c: isub
         // 06d: bipush 4
         // 06e: irem
         // 06f: ifne 12f
         // 072: aload 0
         // 073: aload 1
         // 074: aload 5
         // 076: bipush 1
         // 077: bipush 1
         // 078: iload 11
         // 07a: bipush 1
         // 07b: bipush 4
         // 07c: iload 11
         // 07e: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 081: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 084: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 087: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 08a: bipush 0
         // 08b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 08e: aload 0
         // 08f: aload 1
         // 090: aload 5
         // 092: bipush 12
         // 094: bipush 1
         // 095: iload 11
         // 097: bipush 12
         // 099: bipush 4
         // 09a: iload 11
         // 09c: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 09f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 0a2: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 0a5: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 0a8: bipush 0
         // 0a9: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 0ac: aload 0
         // 0ad: aload 1
         // 0ae: getstatic net/minecraft/world/level/block/Blocks.WALL_TORCH Lnet/minecraft/world/level/block/Block;
         // 0b1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 0b4: getstatic net/minecraft/world/level/block/WallTorchBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
         // 0b7: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 0ba: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 0bd: checkcast net/minecraft/world/level/block/state/BlockState
         // 0c0: bipush 2
         // 0c1: bipush 3
         // 0c2: iload 11
         // 0c4: aload 5
         // 0c6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 0c9: aload 0
         // 0ca: aload 1
         // 0cb: getstatic net/minecraft/world/level/block/Blocks.WALL_TORCH Lnet/minecraft/world/level/block/Block;
         // 0ce: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 0d1: getstatic net/minecraft/world/level/block/WallTorchBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
         // 0d4: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
         // 0d7: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 0da: checkcast net/minecraft/world/level/block/state/BlockState
         // 0dd: bipush 11
         // 0df: bipush 3
         // 0e0: iload 11
         // 0e2: aload 5
         // 0e4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 0e7: aload 0
         // 0e8: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.isTall Z
         // 0eb: ifeq 1ae
         // 0ee: aload 0
         // 0ef: aload 1
         // 0f0: aload 5
         // 0f2: bipush 1
         // 0f3: bipush 6
         // 0f5: iload 11
         // 0f7: bipush 1
         // 0f8: bipush 9
         // 0fa: iload 11
         // 0fc: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 0ff: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 102: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 105: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 108: bipush 0
         // 109: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 10c: aload 0
         // 10d: aload 1
         // 10e: aload 5
         // 110: bipush 12
         // 112: bipush 6
         // 114: iload 11
         // 116: bipush 12
         // 118: bipush 9
         // 11a: iload 11
         // 11c: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 11f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 122: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 125: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 128: bipush 0
         // 129: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 12c: goto 1ae
         // 12f: aload 0
         // 130: aload 1
         // 131: aload 5
         // 133: bipush 1
         // 134: bipush 1
         // 135: iload 11
         // 137: bipush 1
         // 138: bipush 4
         // 139: iload 11
         // 13b: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 13e: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 141: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 144: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 147: bipush 0
         // 148: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 14b: aload 0
         // 14c: aload 1
         // 14d: aload 5
         // 14f: bipush 12
         // 151: bipush 1
         // 152: iload 11
         // 154: bipush 12
         // 156: bipush 4
         // 157: iload 11
         // 159: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 15c: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 15f: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 162: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 165: bipush 0
         // 166: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 169: aload 0
         // 16a: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.isTall Z
         // 16d: ifeq 1ae
         // 170: aload 0
         // 171: aload 1
         // 172: aload 5
         // 174: bipush 1
         // 175: bipush 6
         // 177: iload 11
         // 179: bipush 1
         // 17a: bipush 9
         // 17c: iload 11
         // 17e: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 181: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 184: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 187: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 18a: bipush 0
         // 18b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 18e: aload 0
         // 18f: aload 1
         // 190: aload 5
         // 192: bipush 12
         // 194: bipush 6
         // 196: iload 11
         // 198: bipush 12
         // 19a: bipush 9
         // 19c: iload 11
         // 19e: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1a1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1a4: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1a7: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1aa: bipush 0
         // 1ab: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 1ae: iinc 11 1
         // 1b1: goto 062
         // 1b4: bipush 3
         // 1b5: istore 11
         // 1b7: iload 11
         // 1b9: bipush 12
         // 1bb: if_icmpge 21c
         // 1be: aload 0
         // 1bf: aload 1
         // 1c0: aload 5
         // 1c2: bipush 3
         // 1c3: bipush 1
         // 1c4: iload 11
         // 1c6: bipush 4
         // 1c7: bipush 3
         // 1c8: iload 11
         // 1ca: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1cd: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1d0: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1d3: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1d6: bipush 0
         // 1d7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 1da: aload 0
         // 1db: aload 1
         // 1dc: aload 5
         // 1de: bipush 6
         // 1e0: bipush 1
         // 1e1: iload 11
         // 1e3: bipush 7
         // 1e5: bipush 3
         // 1e6: iload 11
         // 1e8: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1eb: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1ee: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 1f1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 1f4: bipush 0
         // 1f5: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 1f8: aload 0
         // 1f9: aload 1
         // 1fa: aload 5
         // 1fc: bipush 9
         // 1fe: bipush 1
         // 1ff: iload 11
         // 201: bipush 10
         // 203: bipush 3
         // 204: iload 11
         // 206: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 209: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 20c: getstatic net/minecraft/world/level/block/Blocks.BOOKSHELF Lnet/minecraft/world/level/block/Block;
         // 20f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 212: bipush 0
         // 213: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 216: iinc 11 2
         // 219: goto 1b7
         // 21c: aload 0
         // 21d: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.isTall Z
         // 220: ifeq 673
         // 223: aload 0
         // 224: aload 1
         // 225: aload 5
         // 227: bipush 1
         // 228: bipush 5
         // 229: bipush 1
         // 22a: bipush 3
         // 22b: bipush 5
         // 22c: bipush 13
         // 22e: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 231: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 234: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 237: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 23a: bipush 0
         // 23b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 23e: aload 0
         // 23f: aload 1
         // 240: aload 5
         // 242: bipush 10
         // 244: bipush 5
         // 245: bipush 1
         // 246: bipush 12
         // 248: bipush 5
         // 249: bipush 13
         // 24b: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 24e: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 251: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 254: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 257: bipush 0
         // 258: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 25b: aload 0
         // 25c: aload 1
         // 25d: aload 5
         // 25f: bipush 4
         // 260: bipush 5
         // 261: bipush 1
         // 262: bipush 9
         // 264: bipush 5
         // 265: bipush 2
         // 266: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 269: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 26c: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 26f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 272: bipush 0
         // 273: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 276: aload 0
         // 277: aload 1
         // 278: aload 5
         // 27a: bipush 4
         // 27b: bipush 5
         // 27c: bipush 12
         // 27e: bipush 9
         // 280: bipush 5
         // 281: bipush 13
         // 283: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 286: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 289: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 28c: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 28f: bipush 0
         // 290: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 293: aload 0
         // 294: aload 1
         // 295: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 298: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 29b: bipush 9
         // 29d: bipush 5
         // 29e: bipush 11
         // 2a0: aload 5
         // 2a2: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 2a5: aload 0
         // 2a6: aload 1
         // 2a7: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 2aa: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 2ad: bipush 8
         // 2af: bipush 5
         // 2b0: bipush 11
         // 2b2: aload 5
         // 2b4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 2b7: aload 0
         // 2b8: aload 1
         // 2b9: getstatic net/minecraft/world/level/block/Blocks.OAK_PLANKS Lnet/minecraft/world/level/block/Block;
         // 2bc: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 2bf: bipush 9
         // 2c1: bipush 5
         // 2c2: bipush 10
         // 2c4: aload 5
         // 2c6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 2c9: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 2cc: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 2cf: getstatic net/minecraft/world/level/block/FenceBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 2d2: bipush 1
         // 2d3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 2d6: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 2d9: checkcast net/minecraft/world/level/block/state/BlockState
         // 2dc: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 2df: bipush 1
         // 2e0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 2e3: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 2e6: checkcast net/minecraft/world/level/block/state/BlockState
         // 2e9: astore 11
         // 2eb: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 2ee: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 2f1: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 2f4: bipush 1
         // 2f5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 2f8: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 2fb: checkcast net/minecraft/world/level/block/state/BlockState
         // 2fe: getstatic net/minecraft/world/level/block/FenceBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 301: bipush 1
         // 302: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 305: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 308: checkcast net/minecraft/world/level/block/state/BlockState
         // 30b: astore 12
         // 30d: aload 0
         // 30e: aload 1
         // 30f: aload 5
         // 311: bipush 3
         // 312: bipush 6
         // 314: bipush 3
         // 315: bipush 3
         // 316: bipush 6
         // 318: bipush 11
         // 31a: aload 12
         // 31c: aload 12
         // 31e: bipush 0
         // 31f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 322: aload 0
         // 323: aload 1
         // 324: aload 5
         // 326: bipush 10
         // 328: bipush 6
         // 32a: bipush 3
         // 32b: bipush 10
         // 32d: bipush 6
         // 32f: bipush 9
         // 331: aload 12
         // 333: aload 12
         // 335: bipush 0
         // 336: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 339: aload 0
         // 33a: aload 1
         // 33b: aload 5
         // 33d: bipush 4
         // 33e: bipush 6
         // 340: bipush 2
         // 341: bipush 9
         // 343: bipush 6
         // 345: bipush 2
         // 346: aload 11
         // 348: aload 11
         // 34a: bipush 0
         // 34b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 34e: aload 0
         // 34f: aload 1
         // 350: aload 5
         // 352: bipush 4
         // 353: bipush 6
         // 355: bipush 12
         // 357: bipush 7
         // 359: bipush 6
         // 35b: bipush 12
         // 35d: aload 11
         // 35f: aload 11
         // 361: bipush 0
         // 362: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIILnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Z)V
         // 365: aload 0
         // 366: aload 1
         // 367: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 36a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 36d: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 370: bipush 1
         // 371: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 374: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 377: checkcast net/minecraft/world/level/block/state/BlockState
         // 37a: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 37d: bipush 1
         // 37e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 381: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 384: checkcast net/minecraft/world/level/block/state/BlockState
         // 387: bipush 3
         // 388: bipush 6
         // 38a: bipush 2
         // 38b: aload 5
         // 38d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 390: aload 0
         // 391: aload 1
         // 392: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 395: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 398: getstatic net/minecraft/world/level/block/FenceBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 39b: bipush 1
         // 39c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 39f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 3a2: checkcast net/minecraft/world/level/block/state/BlockState
         // 3a5: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 3a8: bipush 1
         // 3a9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 3ac: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 3af: checkcast net/minecraft/world/level/block/state/BlockState
         // 3b2: bipush 3
         // 3b3: bipush 6
         // 3b5: bipush 12
         // 3b7: aload 5
         // 3b9: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 3bc: aload 0
         // 3bd: aload 1
         // 3be: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 3c1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 3c4: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 3c7: bipush 1
         // 3c8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 3cb: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 3ce: checkcast net/minecraft/world/level/block/state/BlockState
         // 3d1: getstatic net/minecraft/world/level/block/FenceBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 3d4: bipush 1
         // 3d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 3d8: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 3db: checkcast net/minecraft/world/level/block/state/BlockState
         // 3de: bipush 10
         // 3e0: bipush 6
         // 3e2: bipush 2
         // 3e3: aload 5
         // 3e5: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 3e8: bipush 0
         // 3e9: istore 13
         // 3eb: iload 13
         // 3ed: bipush 2
         // 3ee: if_icmpgt 463
         // 3f1: aload 0
         // 3f2: aload 1
         // 3f3: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 3f6: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 3f9: getstatic net/minecraft/world/level/block/FenceBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 3fc: bipush 1
         // 3fd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 400: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 403: checkcast net/minecraft/world/level/block/state/BlockState
         // 406: getstatic net/minecraft/world/level/block/FenceBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 409: bipush 1
         // 40a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 40d: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 410: checkcast net/minecraft/world/level/block/state/BlockState
         // 413: bipush 8
         // 415: iload 13
         // 417: iadd
         // 418: bipush 6
         // 41a: bipush 12
         // 41c: iload 13
         // 41e: isub
         // 41f: aload 5
         // 421: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 424: iload 13
         // 426: bipush 2
         // 427: if_icmpeq 45d
         // 42a: aload 0
         // 42b: aload 1
         // 42c: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 42f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 432: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 435: bipush 1
         // 436: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 439: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 43c: checkcast net/minecraft/world/level/block/state/BlockState
         // 43f: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 442: bipush 1
         // 443: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 446: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 449: checkcast net/minecraft/world/level/block/state/BlockState
         // 44c: bipush 8
         // 44e: iload 13
         // 450: iadd
         // 451: bipush 6
         // 453: bipush 11
         // 455: iload 13
         // 457: isub
         // 458: aload 5
         // 45a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 45d: iinc 13 1
         // 460: goto 3eb
         // 463: getstatic net/minecraft/world/level/block/Blocks.LADDER Lnet/minecraft/world/level/block/Block;
         // 466: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 469: getstatic net/minecraft/world/level/block/LadderBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
         // 46c: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 46f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 472: checkcast net/minecraft/world/level/block/state/BlockState
         // 475: astore 13
         // 477: aload 0
         // 478: aload 1
         // 479: aload 13
         // 47b: bipush 10
         // 47d: bipush 1
         // 47e: bipush 13
         // 480: aload 5
         // 482: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 485: aload 0
         // 486: aload 1
         // 487: aload 13
         // 489: bipush 10
         // 48b: bipush 2
         // 48c: bipush 13
         // 48e: aload 5
         // 490: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 493: aload 0
         // 494: aload 1
         // 495: aload 13
         // 497: bipush 10
         // 499: bipush 3
         // 49a: bipush 13
         // 49c: aload 5
         // 49e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 4a1: aload 0
         // 4a2: aload 1
         // 4a3: aload 13
         // 4a5: bipush 10
         // 4a7: bipush 4
         // 4a8: bipush 13
         // 4aa: aload 5
         // 4ac: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 4af: aload 0
         // 4b0: aload 1
         // 4b1: aload 13
         // 4b3: bipush 10
         // 4b5: bipush 5
         // 4b6: bipush 13
         // 4b8: aload 5
         // 4ba: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 4bd: aload 0
         // 4be: aload 1
         // 4bf: aload 13
         // 4c1: bipush 10
         // 4c3: bipush 6
         // 4c5: bipush 13
         // 4c7: aload 5
         // 4c9: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 4cc: aload 0
         // 4cd: aload 1
         // 4ce: aload 13
         // 4d0: bipush 10
         // 4d2: bipush 7
         // 4d4: bipush 13
         // 4d6: aload 5
         // 4d8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 4db: bipush 7
         // 4dd: istore 14
         // 4df: bipush 7
         // 4e1: istore 15
         // 4e3: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 4e6: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 4e9: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 4ec: bipush 1
         // 4ed: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 4f0: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 4f3: checkcast net/minecraft/world/level/block/state/BlockState
         // 4f6: astore 16
         // 4f8: aload 0
         // 4f9: aload 1
         // 4fa: aload 16
         // 4fc: bipush 6
         // 4fe: bipush 9
         // 500: bipush 7
         // 502: aload 5
         // 504: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 507: getstatic net/minecraft/world/level/block/Blocks.OAK_FENCE Lnet/minecraft/world/level/block/Block;
         // 50a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 50d: getstatic net/minecraft/world/level/block/FenceBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 510: bipush 1
         // 511: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 514: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 517: checkcast net/minecraft/world/level/block/state/BlockState
         // 51a: astore 17
         // 51c: aload 0
         // 51d: aload 1
         // 51e: aload 17
         // 520: bipush 7
         // 522: bipush 9
         // 524: bipush 7
         // 526: aload 5
         // 528: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 52b: aload 0
         // 52c: aload 1
         // 52d: aload 16
         // 52f: bipush 6
         // 531: bipush 8
         // 533: bipush 7
         // 535: aload 5
         // 537: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 53a: aload 0
         // 53b: aload 1
         // 53c: aload 17
         // 53e: bipush 7
         // 540: bipush 8
         // 542: bipush 7
         // 544: aload 5
         // 546: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 549: aload 12
         // 54b: getstatic net/minecraft/world/level/block/FenceBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 54e: bipush 1
         // 54f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 552: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 555: checkcast net/minecraft/world/level/block/state/BlockState
         // 558: getstatic net/minecraft/world/level/block/FenceBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 55b: bipush 1
         // 55c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 55f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 562: checkcast net/minecraft/world/level/block/state/BlockState
         // 565: astore 18
         // 567: aload 0
         // 568: aload 1
         // 569: aload 18
         // 56b: bipush 6
         // 56d: bipush 7
         // 56f: bipush 7
         // 571: aload 5
         // 573: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 576: aload 0
         // 577: aload 1
         // 578: aload 18
         // 57a: bipush 7
         // 57c: bipush 7
         // 57e: bipush 7
         // 580: aload 5
         // 582: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 585: aload 0
         // 586: aload 1
         // 587: aload 16
         // 589: bipush 5
         // 58a: bipush 7
         // 58c: bipush 7
         // 58e: aload 5
         // 590: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 593: aload 0
         // 594: aload 1
         // 595: aload 17
         // 597: bipush 8
         // 599: bipush 7
         // 59b: bipush 7
         // 59d: aload 5
         // 59f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 5a2: aload 0
         // 5a3: aload 1
         // 5a4: aload 16
         // 5a6: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 5a9: bipush 1
         // 5aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 5ad: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 5b0: checkcast net/minecraft/world/level/block/state/BlockState
         // 5b3: bipush 6
         // 5b5: bipush 7
         // 5b7: bipush 6
         // 5b9: aload 5
         // 5bb: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 5be: aload 0
         // 5bf: aload 1
         // 5c0: aload 16
         // 5c2: getstatic net/minecraft/world/level/block/FenceBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 5c5: bipush 1
         // 5c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 5c9: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 5cc: checkcast net/minecraft/world/level/block/state/BlockState
         // 5cf: bipush 6
         // 5d1: bipush 7
         // 5d3: bipush 8
         // 5d5: aload 5
         // 5d7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 5da: aload 0
         // 5db: aload 1
         // 5dc: aload 17
         // 5de: getstatic net/minecraft/world/level/block/FenceBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 5e1: bipush 1
         // 5e2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 5e5: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 5e8: checkcast net/minecraft/world/level/block/state/BlockState
         // 5eb: bipush 7
         // 5ed: bipush 7
         // 5ef: bipush 6
         // 5f1: aload 5
         // 5f3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 5f6: aload 0
         // 5f7: aload 1
         // 5f8: aload 17
         // 5fa: getstatic net/minecraft/world/level/block/FenceBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
         // 5fd: bipush 1
         // 5fe: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
         // 601: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
         // 604: checkcast net/minecraft/world/level/block/state/BlockState
         // 607: bipush 7
         // 609: bipush 7
         // 60b: bipush 8
         // 60d: aload 5
         // 60f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 612: getstatic net/minecraft/world/level/block/Blocks.TORCH Lnet/minecraft/world/level/block/Block;
         // 615: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
         // 618: astore 19
         // 61a: aload 0
         // 61b: aload 1
         // 61c: aload 19
         // 61e: bipush 5
         // 61f: bipush 8
         // 621: bipush 7
         // 623: aload 5
         // 625: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 628: aload 0
         // 629: aload 1
         // 62a: aload 19
         // 62c: bipush 8
         // 62e: bipush 8
         // 630: bipush 7
         // 632: aload 5
         // 634: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 637: aload 0
         // 638: aload 1
         // 639: aload 19
         // 63b: bipush 6
         // 63d: bipush 8
         // 63f: bipush 6
         // 641: aload 5
         // 643: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 646: aload 0
         // 647: aload 1
         // 648: aload 19
         // 64a: bipush 6
         // 64c: bipush 8
         // 64e: bipush 8
         // 650: aload 5
         // 652: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 655: aload 0
         // 656: aload 1
         // 657: aload 19
         // 659: bipush 7
         // 65b: bipush 8
         // 65d: bipush 6
         // 65f: aload 5
         // 661: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 664: aload 0
         // 665: aload 1
         // 666: aload 19
         // 668: bipush 7
         // 66a: bipush 8
         // 66c: bipush 8
         // 66e: aload 5
         // 670: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 673: aload 0
         // 674: aload 1
         // 675: aload 5
         // 677: aload 4
         // 679: bipush 3
         // 67a: bipush 3
         // 67b: bipush 5
         // 67c: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.STRONGHOLD_LIBRARY Lnet/minecraft/resources/ResourceKey;
         // 67f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.createChest (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/resources/ResourceKey;)Z
         // 682: pop
         // 683: aload 0
         // 684: getfield net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.isTall Z
         // 687: ifeq 6ab
         // 68a: aload 0
         // 68b: aload 1
         // 68c: getstatic net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.CAVE_AIR Lnet/minecraft/world/level/block/state/BlockState;
         // 68f: bipush 12
         // 691: bipush 9
         // 693: bipush 1
         // 694: aload 5
         // 696: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
         // 699: aload 0
         // 69a: aload 1
         // 69b: aload 5
         // 69d: aload 4
         // 69f: bipush 12
         // 6a1: bipush 8
         // 6a3: bipush 1
         // 6a4: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.STRONGHOLD_LIBRARY Lnet/minecraft/resources/ResourceKey;
         // 6a7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$Library.createChest (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/resources/ResourceKey;)Z
         // 6aa: pop
         // 6ab: return
      }
   }

   private static class PieceWeight {
      public final Class<? extends StrongholdPieces.StrongholdPiece> pieceClass;
      public final int weight;
      public int placeCount;
      public final int maxPlaceCount;

      public PieceWeight(final Class<? extends StrongholdPieces.StrongholdPiece> pieceClass, final int weight, final int maxPlaceCount) {
         this.pieceClass = pieceClass;
         this.weight = weight;
         this.maxPlaceCount = maxPlaceCount;
      }

      public boolean doPlace(final int depth) {
         return this.maxPlaceCount == 0 || this.placeCount < this.maxPlaceCount;
      }

      public boolean isValid() {
         return this.maxPlaceCount == 0 || this.placeCount < this.maxPlaceCount;
      }
   }

   public static class PortalRoom extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 11;
      protected static final int HEIGHT = 8;
      protected static final int DEPTH = 16;
      private boolean hasPlacedSpawner;

      public PortalRoom(final int genDepth, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_PORTAL_ROOM, genDepth, boundingBox);
         this.setOrientation(direction);
      }

      public PortalRoom(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_PORTAL_ROOM, tag);
         this.hasPlacedSpawner = tag.getBooleanOr("Mob", false);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("Mob", this.hasPlacedSpawner);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         if (startPiece != null) {
            ((StrongholdPieces.StartPiece)startPiece).portalRoomPiece = this;
         }
      }

      public static StrongholdPieces.@Nullable PortalRoom createPiece(
         final StructurePiecesBuilder builder, final int footX, final int footY, final int footZ, final Direction direction, final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -4, -1, 0, 11, 8, 16, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.PortalRoom(genDepth, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 10, 7, 15, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, StrongholdPieces.StrongholdPiece.SmallDoorType.GRATES, 4, 1, 0);
         int y = 6;
         this.generateBox(level, chunkBB, 1, 6, 1, 1, 6, 14, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 9, 6, 1, 9, 6, 14, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 2, 6, 1, 8, 6, 2, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 2, 6, 14, 8, 6, 14, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 1, 1, 1, 2, 1, 4, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 8, 1, 1, 9, 1, 4, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 1, 1, 1, 1, 1, 3, Blocks.LAVA.defaultBlockState(), Blocks.LAVA.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 9, 1, 1, 9, 1, 3, Blocks.LAVA.defaultBlockState(), Blocks.LAVA.defaultBlockState(), false);
         this.generateBox(level, chunkBB, 3, 1, 8, 7, 1, 12, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 1, 9, 6, 1, 11, Blocks.LAVA.defaultBlockState(), Blocks.LAVA.defaultBlockState(), false);
         BlockState nsBars = Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true);
         BlockState weBars = Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true).setValue(IronBarsBlock.EAST, true);

         for (int z = 3; z < 14; z += 2) {
            this.generateBox(level, chunkBB, 0, 3, z, 0, 4, z, nsBars, nsBars, false);
            this.generateBox(level, chunkBB, 10, 3, z, 10, 4, z, nsBars, nsBars, false);
         }

         for (int x = 2; x < 9; x += 2) {
            this.generateBox(level, chunkBB, x, 3, 15, x, 4, 15, weBars, weBars, false);
         }

         BlockState blockState = Blocks.STONE_BRICK_STAIRS.defaultBlockState().setValue(StairBlock.FACING, Direction.NORTH);
         this.generateBox(level, chunkBB, 4, 1, 5, 6, 1, 7, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 2, 6, 6, 2, 7, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 3, 7, 6, 3, 7, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);

         for (int x = 4; x <= 6; x++) {
            this.placeBlock(level, blockState, x, 1, 4, chunkBB);
            this.placeBlock(level, blockState, x, 2, 5, chunkBB);
            this.placeBlock(level, blockState, x, 3, 6, chunkBB);
         }

         BlockState northFrame = Blocks.END_PORTAL_FRAME.defaultBlockState().setValue(EndPortalFrameBlock.FACING, Direction.NORTH);
         BlockState southFrame = Blocks.END_PORTAL_FRAME.defaultBlockState().setValue(EndPortalFrameBlock.FACING, Direction.SOUTH);
         BlockState eastFrame = Blocks.END_PORTAL_FRAME.defaultBlockState().setValue(EndPortalFrameBlock.FACING, Direction.EAST);
         BlockState westFrame = Blocks.END_PORTAL_FRAME.defaultBlockState().setValue(EndPortalFrameBlock.FACING, Direction.WEST);
         boolean allEyes = true;
         boolean[] eyes = new boolean[12];

         for (int i = 0; i < eyes.length; i++) {
            eyes[i] = random.nextFloat() > 0.9F;
            allEyes &= eyes[i];
         }

         this.placeBlock(level, northFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[0]), 4, 3, 8, chunkBB);
         this.placeBlock(level, northFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[1]), 5, 3, 8, chunkBB);
         this.placeBlock(level, northFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[2]), 6, 3, 8, chunkBB);
         this.placeBlock(level, southFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[3]), 4, 3, 12, chunkBB);
         this.placeBlock(level, southFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[4]), 5, 3, 12, chunkBB);
         this.placeBlock(level, southFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[5]), 6, 3, 12, chunkBB);
         this.placeBlock(level, eastFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[6]), 3, 3, 9, chunkBB);
         this.placeBlock(level, eastFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[7]), 3, 3, 10, chunkBB);
         this.placeBlock(level, eastFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[8]), 3, 3, 11, chunkBB);
         this.placeBlock(level, westFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[9]), 7, 3, 9, chunkBB);
         this.placeBlock(level, westFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[10]), 7, 3, 10, chunkBB);
         this.placeBlock(level, westFrame.setValue(EndPortalFrameBlock.HAS_EYE, eyes[11]), 7, 3, 11, chunkBB);
         if (allEyes) {
            BlockState portal = Blocks.END_PORTAL.defaultBlockState();
            this.placeBlock(level, portal, 4, 3, 9, chunkBB);
            this.placeBlock(level, portal, 5, 3, 9, chunkBB);
            this.placeBlock(level, portal, 6, 3, 9, chunkBB);
            this.placeBlock(level, portal, 4, 3, 10, chunkBB);
            this.placeBlock(level, portal, 5, 3, 10, chunkBB);
            this.placeBlock(level, portal, 6, 3, 10, chunkBB);
            this.placeBlock(level, portal, 4, 3, 11, chunkBB);
            this.placeBlock(level, portal, 5, 3, 11, chunkBB);
            this.placeBlock(level, portal, 6, 3, 11, chunkBB);
         }

         if (!this.hasPlacedSpawner) {
            BlockPos pos = this.getWorldPos(5, 3, 6);
            if (chunkBB.isInside(pos)) {
               this.hasPlacedSpawner = true;
               level.setBlock(pos, Blocks.SPAWNER.defaultBlockState(), 2);
               if (level.getBlockEntity(pos) instanceof SpawnerBlockEntity spawner) {
                  spawner.setEntityId(EntityTypes.SILVERFISH, random);
               }
            }
         }
      }
   }

   public static class PrisonHall extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 9;
      protected static final int HEIGHT = 5;
      protected static final int DEPTH = 11;

      public PrisonHall(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_PRISON_HALL, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public PrisonHall(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_PRISON_HALL, tag);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
      }

      public static StrongholdPieces.@Nullable PrisonHall createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 9, 5, 11, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.PrisonHall(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 8, 4, 10, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 1, 0);
         this.generateBox(level, chunkBB, 1, 1, 10, 3, 3, 10, CAVE_AIR, CAVE_AIR, false);
         this.generateBox(level, chunkBB, 4, 1, 1, 4, 3, 1, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 1, 3, 4, 3, 3, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 1, 7, 4, 3, 7, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateBox(level, chunkBB, 4, 1, 9, 4, 3, 9, false, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);

         for (int y = 1; y <= 3; y++) {
            this.placeBlock(
               level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true), 4, y, 4, chunkBB
            );
            this.placeBlock(
               level,
               Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true).setValue(IronBarsBlock.EAST, true),
               4,
               y,
               5,
               chunkBB
            );
            this.placeBlock(
               level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true), 4, y, 6, chunkBB
            );
            this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true).setValue(IronBarsBlock.EAST, true), 5, y, 5, chunkBB);
            this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true).setValue(IronBarsBlock.EAST, true), 6, y, 5, chunkBB);
            this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true).setValue(IronBarsBlock.EAST, true), 7, y, 5, chunkBB);
         }

         this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true), 4, 3, 2, chunkBB);
         this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.NORTH, true).setValue(IronBarsBlock.SOUTH, true), 4, 3, 8, chunkBB);
         BlockState doorBottom = Blocks.IRON_DOOR.defaultBlockState().setValue(DoorBlock.FACING, Direction.WEST);
         BlockState doorTop = Blocks.IRON_DOOR.defaultBlockState().setValue(DoorBlock.FACING, Direction.WEST).setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER);
         this.placeBlock(level, doorBottom, 4, 1, 2, chunkBB);
         this.placeBlock(level, doorTop, 4, 2, 2, chunkBB);
         this.placeBlock(level, doorBottom, 4, 1, 8, chunkBB);
         this.placeBlock(level, doorTop, 4, 2, 8, chunkBB);
      }
   }

   public static class RightTurn extends StrongholdPieces.Turn {
      public RightTurn(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_RIGHT_TURN, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public RightTurn(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_RIGHT_TURN, tag);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         Direction orientation = this.getOrientation();
         if (orientation != Direction.NORTH && orientation != Direction.EAST) {
            this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
         } else {
            this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
         }
      }

      public static StrongholdPieces.@Nullable RightTurn createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, 5, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.RightTurn(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 4, 4, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 1, 0);
         Direction orientation = this.getOrientation();
         if (orientation != Direction.NORTH && orientation != Direction.EAST) {
            this.generateBox(level, chunkBB, 0, 1, 1, 0, 3, 3, CAVE_AIR, CAVE_AIR, false);
         } else {
            this.generateBox(level, chunkBB, 4, 1, 1, 4, 3, 3, CAVE_AIR, CAVE_AIR, false);
         }
      }
   }

   public static class RoomCrossing extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 11;
      protected static final int HEIGHT = 7;
      protected static final int DEPTH = 11;
      protected final int type;

      public RoomCrossing(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_ROOM_CROSSING, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
         this.type = random.nextInt(5);
      }

      public RoomCrossing(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_ROOM_CROSSING, tag);
         this.type = tag.getIntOr("Type", 0);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putInt("Type", this.type);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 4, 1);
         this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 4);
         this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 4);
      }

      public static StrongholdPieces.@Nullable RoomCrossing createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -4, -1, 0, 11, 7, 11, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.RoomCrossing(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 10, 6, 10, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 4, 1, 0);
         this.generateBox(level, chunkBB, 4, 1, 10, 6, 3, 10, CAVE_AIR, CAVE_AIR, false);
         this.generateBox(level, chunkBB, 0, 1, 4, 0, 3, 6, CAVE_AIR, CAVE_AIR, false);
         this.generateBox(level, chunkBB, 10, 1, 4, 10, 3, 6, CAVE_AIR, CAVE_AIR, false);
         switch (this.type) {
            case 0:
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 2, 5, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 3, 5, chunkBB);
               this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.WEST), 4, 3, 5, chunkBB);
               this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.EAST), 6, 3, 5, chunkBB);
               this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.SOUTH), 5, 3, 4, chunkBB);
               this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.NORTH), 5, 3, 6, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 4, 1, 4, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 4, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 4, 1, 6, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 6, 1, 4, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 6, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 6, 1, 6, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 5, 1, 4, chunkBB);
               this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 5, 1, 6, chunkBB);
               break;
            case 1:
               for (int i = 0; i < 5; i++) {
                  this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 1, 3 + i, chunkBB);
                  this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 7, 1, 3 + i, chunkBB);
                  this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3 + i, 1, 3, chunkBB);
                  this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3 + i, 1, 7, chunkBB);
               }

               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 2, 5, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 5, 3, 5, chunkBB);
               this.placeBlock(level, Blocks.WATER.defaultBlockState(), 5, 4, 5, chunkBB);
               break;
            case 2:
               for (int z = 1; z <= 9; z++) {
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 1, 3, z, chunkBB);
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 9, 3, z, chunkBB);
               }

               for (int x = 1; x <= 9; x++) {
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), x, 3, 1, chunkBB);
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), x, 3, 9, chunkBB);
               }

               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 5, 1, 4, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 5, 1, 6, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 5, 3, 4, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 5, 3, 6, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 4, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 6, 1, 5, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 4, 3, 5, chunkBB);
               this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 6, 3, 5, chunkBB);

               for (int y = 1; y <= 3; y++) {
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 4, y, 4, chunkBB);
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 6, y, 4, chunkBB);
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 4, y, 6, chunkBB);
                  this.placeBlock(level, Blocks.COBBLESTONE.defaultBlockState(), 6, y, 6, chunkBB);
               }

               this.placeBlock(level, Blocks.WALL_TORCH.defaultBlockState(), 5, 3, 5, chunkBB);

               for (int z = 2; z <= 8; z++) {
                  this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 2, 3, z, chunkBB);
                  this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 3, 3, z, chunkBB);
                  if (z <= 3 || z >= 7) {
                     this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 4, 3, z, chunkBB);
                     this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 5, 3, z, chunkBB);
                     this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 6, 3, z, chunkBB);
                  }

                  this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 7, 3, z, chunkBB);
                  this.placeBlock(level, Blocks.OAK_PLANKS.defaultBlockState(), 8, 3, z, chunkBB);
               }

               BlockState ladder = Blocks.LADDER.defaultBlockState().setValue(LadderBlock.FACING, Direction.WEST);
               this.placeBlock(level, ladder, 9, 1, 3, chunkBB);
               this.placeBlock(level, ladder, 9, 2, 3, chunkBB);
               this.placeBlock(level, ladder, 9, 3, 3, chunkBB);
               this.createChest(level, chunkBB, random, 3, 4, 8, BuiltInLootTables.STRONGHOLD_CROSSING);
         }
      }
   }

   private static class SmoothStoneSelector extends StructurePiece.BlockSelector {
      @Override
      public void next(final RandomSource random, final int worldX, final int worldY, final int worldZ, final boolean isEdge) {
         if (isEdge) {
            float selection = random.nextFloat();
            if (selection < 0.2F) {
               this.next = Blocks.CRACKED_STONE_BRICKS.defaultBlockState();
            } else if (selection < 0.5F) {
               this.next = Blocks.MOSSY_STONE_BRICKS.defaultBlockState();
            } else if (selection < 0.55F) {
               this.next = Blocks.INFESTED_STONE_BRICKS.defaultBlockState();
            } else {
               this.next = Blocks.STONE_BRICKS.defaultBlockState();
            }
         } else {
            this.next = Blocks.CAVE_AIR.defaultBlockState();
         }
      }
   }

   public static class StairsDown extends StrongholdPieces.StrongholdPiece {
      private static final int WIDTH = 5;
      private static final int HEIGHT = 11;
      private static final int DEPTH = 5;
      private final boolean isSource;

      public StairsDown(final StructurePieceType type, final int genDepth, final int west, final int north, final Direction direction) {
         super(type, genDepth, makeBoundingBox(west, 64, north, direction, 5, 11, 5));
         this.isSource = true;
         this.setOrientation(direction);
         this.entryDoor = StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING;
      }

      public StairsDown(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_STAIRS_DOWN, genDepth, boundingBox);
         this.isSource = false;
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public StairsDown(final StructurePieceType type, final CompoundTag tag) {
         super(type, tag);
         this.isSource = tag.getBooleanOr("Source", false);
      }

      public StairsDown(final CompoundTag tag) {
         this(StructurePieceType.STRONGHOLD_STAIRS_DOWN, tag);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("Source", this.isSource);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         if (this.isSource) {
            StrongholdPieces.imposedPiece = StrongholdPieces.FiveCrossing.class;
         }

         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
      }

      public static StrongholdPieces.@Nullable StairsDown createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -7, 0, 5, 11, 5, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.StairsDown(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 10, 4, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 7, 0);
         this.generateSmallDoor(level, random, chunkBB, StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING, 1, 1, 4);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 6, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 5, 1, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 1, 6, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 5, 2, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 4, 3, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 1, 5, 3, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 4, 3, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 3, 3, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 3, 4, 3, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 3, 2, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 2, 1, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 3, 3, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 2, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 1, 1, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 1, 2, 1, chunkBB);
         this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 1, 2, chunkBB);
         this.placeBlock(level, Blocks.SMOOTH_STONE_SLAB.defaultBlockState(), 1, 1, 3, chunkBB);
      }
   }

   public static class StartPiece extends StrongholdPieces.StairsDown {
      public StrongholdPieces.@Nullable PieceWeight previousPiece;
      public StrongholdPieces.@Nullable PortalRoom portalRoomPiece;
      public final List<StructurePiece> pendingChildren = Lists.newArrayList();

      public StartPiece(final RandomSource random, final int west, final int north) {
         super(StructurePieceType.STRONGHOLD_START, 0, west, north, getRandomHorizontalDirection(random));
      }

      public StartPiece(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_START, tag);
      }

      @Override
      public BlockPos getLocatorPosition() {
         return this.portalRoomPiece != null ? this.portalRoomPiece.getLocatorPosition() : super.getLocatorPosition();
      }
   }

   public static class Straight extends StrongholdPieces.StrongholdPiece {
      private static final int WIDTH = 5;
      private static final int HEIGHT = 5;
      private static final int DEPTH = 7;
      private final boolean leftChild;
      private final boolean rightChild;

      public Straight(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_STRAIGHT, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
         this.leftChild = random.nextInt(2) == 0;
         this.rightChild = random.nextInt(2) == 0;
      }

      public Straight(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_STRAIGHT, tag);
         this.leftChild = tag.getBooleanOr("Left", false);
         this.rightChild = tag.getBooleanOr("Right", false);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.putBoolean("Left", this.leftChild);
         tag.putBoolean("Right", this.rightChild);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
         if (this.leftChild) {
            this.generateSmallDoorChildLeft((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 2);
         }

         if (this.rightChild) {
            this.generateSmallDoorChildRight((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 2);
         }
      }

      public static StrongholdPieces.@Nullable Straight createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -1, 0, 5, 5, 7, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.Straight(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 4, 6, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 1, 0);
         this.generateSmallDoor(level, random, chunkBB, StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING, 1, 1, 6);
         BlockState eastTorch = Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.EAST);
         BlockState westTorch = Blocks.WALL_TORCH.defaultBlockState().setValue(WallTorchBlock.FACING, Direction.WEST);
         this.maybeGenerateBlock(level, chunkBB, random, 0.1F, 1, 2, 1, eastTorch);
         this.maybeGenerateBlock(level, chunkBB, random, 0.1F, 3, 2, 1, westTorch);
         this.maybeGenerateBlock(level, chunkBB, random, 0.1F, 1, 2, 5, eastTorch);
         this.maybeGenerateBlock(level, chunkBB, random, 0.1F, 3, 2, 5, westTorch);
         if (this.leftChild) {
            this.generateBox(level, chunkBB, 0, 1, 2, 0, 3, 4, CAVE_AIR, CAVE_AIR, false);
         }

         if (this.rightChild) {
            this.generateBox(level, chunkBB, 4, 1, 2, 4, 3, 4, CAVE_AIR, CAVE_AIR, false);
         }
      }
   }

   public static class StraightStairsDown extends StrongholdPieces.StrongholdPiece {
      private static final int WIDTH = 5;
      private static final int HEIGHT = 11;
      private static final int DEPTH = 8;

      public StraightStairsDown(final int genDepth, final RandomSource random, final BoundingBox boundingBox, final Direction direction) {
         super(StructurePieceType.STRONGHOLD_STRAIGHT_STAIRS_DOWN, genDepth, boundingBox);
         this.setOrientation(direction);
         this.entryDoor = this.randomSmallDoor(random);
      }

      public StraightStairsDown(final CompoundTag tag) {
         super(StructurePieceType.STRONGHOLD_STRAIGHT_STAIRS_DOWN, tag);
      }

      @Override
      public void addChildren(final StructurePiece startPiece, final StructurePiecesBuilder builder, final RandomSource random) {
         this.generateSmallDoorChildForward((StrongholdPieces.StartPiece)startPiece, builder, random, 1, 1);
      }

      public static StrongholdPieces.@Nullable StraightStairsDown createPiece(
         final StructurePiecesBuilder builder,
         final RandomSource random,
         final int footX,
         final int footY,
         final int footZ,
         final Direction direction,
         final int genDepth
      ) {
         BoundingBox box = BoundingBox.orientBox(footX, footY, footZ, -1, -7, 0, 5, 11, 8, direction);
         return isOkBox(box) && builder.findCollisionPiece(box) == null ? new StrongholdPieces.StraightStairsDown(genDepth, random, box, direction) : null;
      }

      @Override
      public void postProcess(
         final WorldGenLevel level,
         final StructureManager structureManager,
         final ChunkGenerator generator,
         final RandomSource random,
         final BoundingBox chunkBB,
         final ChunkPos chunkPos,
         final BlockPos referencePos
      ) {
         this.generateBox(level, chunkBB, 0, 0, 0, 4, 10, 7, true, random, StrongholdPieces.SMOOTH_STONE_SELECTOR);
         this.generateSmallDoor(level, random, chunkBB, this.entryDoor, 1, 7, 0);
         this.generateSmallDoor(level, random, chunkBB, StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING, 1, 1, 7);
         BlockState stairs = Blocks.COBBLESTONE_STAIRS.defaultBlockState().setValue(StairBlock.FACING, Direction.SOUTH);

         for (int i = 0; i < 6; i++) {
            this.placeBlock(level, stairs, 1, 6 - i, 1 + i, chunkBB);
            this.placeBlock(level, stairs, 2, 6 - i, 1 + i, chunkBB);
            this.placeBlock(level, stairs, 3, 6 - i, 1 + i, chunkBB);
            if (i < 5) {
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 1, 5 - i, 1 + i, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 2, 5 - i, 1 + i, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), 3, 5 - i, 1 + i, chunkBB);
            }
         }
      }
   }

   private abstract static class StrongholdPiece extends StructurePiece {
      protected StrongholdPieces.StrongholdPiece.SmallDoorType entryDoor = StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING;

      protected StrongholdPiece(final StructurePieceType type, final int genDepth, final BoundingBox boundingBox) {
         super(type, genDepth, boundingBox);
      }

      public StrongholdPiece(final StructurePieceType type, final CompoundTag tag) {
         super(type, tag);
         this.entryDoor = tag.<StrongholdPieces.StrongholdPiece.SmallDoorType>read("EntryDoor", StrongholdPieces.StrongholdPiece.SmallDoorType.LEGACY_CODEC)
            .orElseThrow();
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         tag.store("EntryDoor", StrongholdPieces.StrongholdPiece.SmallDoorType.LEGACY_CODEC, this.entryDoor);
      }

      protected void generateSmallDoor(
         final WorldGenLevel level,
         final RandomSource random,
         final BoundingBox chunkBB,
         final StrongholdPieces.StrongholdPiece.SmallDoorType doorType,
         final int footX,
         final int footY,
         final int footZ
      ) {
         switch (doorType) {
            case OPENING:
               this.generateBox(level, chunkBB, footX, footY, footZ, footX + 3 - 1, footY + 3 - 1, footZ, CAVE_AIR, CAVE_AIR, false);
               break;
            case WOOD_DOOR:
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 1, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.OAK_DOOR.defaultBlockState(), footX + 1, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.OAK_DOOR.defaultBlockState().setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER), footX + 1, footY + 1, footZ, chunkBB);
               break;
            case GRATES:
               this.placeBlock(level, Blocks.CAVE_AIR.defaultBlockState(), footX + 1, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.CAVE_AIR.defaultBlockState(), footX + 1, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true), footX, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.WEST, true), footX, footY + 1, footZ, chunkBB);
               this.placeBlock(
                  level,
                  Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.EAST, true).setValue(IronBarsBlock.WEST, true),
                  footX,
                  footY + 2,
                  footZ,
                  chunkBB
               );
               this.placeBlock(
                  level,
                  Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.EAST, true).setValue(IronBarsBlock.WEST, true),
                  footX + 1,
                  footY + 2,
                  footZ,
                  chunkBB
               );
               this.placeBlock(
                  level,
                  Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.EAST, true).setValue(IronBarsBlock.WEST, true),
                  footX + 2,
                  footY + 2,
                  footZ,
                  chunkBB
               );
               this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.EAST, true), footX + 2, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.IRON_BARS.defaultBlockState().setValue(IronBarsBlock.EAST, true), footX + 2, footY, footZ, chunkBB);
               break;
            case IRON_DOOR:
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 1, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY + 2, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY + 1, footZ, chunkBB);
               this.placeBlock(level, Blocks.STONE_BRICKS.defaultBlockState(), footX + 2, footY, footZ, chunkBB);
               this.placeBlock(level, Blocks.IRON_DOOR.defaultBlockState(), footX + 1, footY, footZ, chunkBB);
               this.placeBlock(
                  level, Blocks.IRON_DOOR.defaultBlockState().setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER), footX + 1, footY + 1, footZ, chunkBB
               );
               this.placeBlock(
                  level, Blocks.STONE_BUTTON.defaultBlockState().setValue(ButtonBlock.FACING, Direction.NORTH), footX + 2, footY + 1, footZ + 1, chunkBB
               );
               this.placeBlock(
                  level, Blocks.STONE_BUTTON.defaultBlockState().setValue(ButtonBlock.FACING, Direction.SOUTH), footX + 2, footY + 1, footZ - 1, chunkBB
               );
         }
      }

      protected StrongholdPieces.StrongholdPiece.SmallDoorType randomSmallDoor(final RandomSource random) {
         int selection = random.nextInt(5);
         switch (selection) {
            case 0:
            case 1:
            default:
               return StrongholdPieces.StrongholdPiece.SmallDoorType.OPENING;
            case 2:
               return StrongholdPieces.StrongholdPiece.SmallDoorType.WOOD_DOOR;
            case 3:
               return StrongholdPieces.StrongholdPiece.SmallDoorType.GRATES;
            case 4:
               return StrongholdPieces.StrongholdPiece.SmallDoorType.IRON_DOOR;
         }
      }

      protected @Nullable StructurePiece generateSmallDoorChildForward(
         final StrongholdPieces.StartPiece startPiece, final StructurePiecesBuilder builder, final RandomSource random, final int xOff, final int yOff
      ) {
         Direction orientation = this.getOrientation();
         if (orientation != null) {
            switch (orientation) {
               case NORTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + xOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() - 1,
                     orientation,
                     this.getGenDepth()
                  );
               case SOUTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + xOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.maxZ() + 1,
                     orientation,
                     this.getGenDepth()
                  );
               case WEST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() - 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + xOff,
                     orientation,
                     this.getGenDepth()
                  );
               case EAST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.maxX() + 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + xOff,
                     orientation,
                     this.getGenDepth()
                  );
            }
         }

         return null;
      }

      protected @Nullable StructurePiece generateSmallDoorChildLeft(
         final StrongholdPieces.StartPiece startPiece, final StructurePiecesBuilder builder, final RandomSource random, final int yOff, final int zOff
      ) {
         Direction orientation = this.getOrientation();
         if (orientation != null) {
            switch (orientation) {
               case NORTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() - 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + zOff,
                     Direction.WEST,
                     this.getGenDepth()
                  );
               case SOUTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() - 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + zOff,
                     Direction.WEST,
                     this.getGenDepth()
                  );
               case WEST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + zOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() - 1,
                     Direction.NORTH,
                     this.getGenDepth()
                  );
               case EAST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + zOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() - 1,
                     Direction.NORTH,
                     this.getGenDepth()
                  );
            }
         }

         return null;
      }

      protected @Nullable StructurePiece generateSmallDoorChildRight(
         final StrongholdPieces.StartPiece startPiece, final StructurePiecesBuilder builder, final RandomSource random, final int yOff, final int zOff
      ) {
         Direction orientation = this.getOrientation();
         if (orientation != null) {
            switch (orientation) {
               case NORTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.maxX() + 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + zOff,
                     Direction.EAST,
                     this.getGenDepth()
                  );
               case SOUTH:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.maxX() + 1,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.minZ() + zOff,
                     Direction.EAST,
                     this.getGenDepth()
                  );
               case WEST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + zOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.maxZ() + 1,
                     Direction.SOUTH,
                     this.getGenDepth()
                  );
               case EAST:
                  return StrongholdPieces.generateAndAddPiece(
                     startPiece,
                     builder,
                     random,
                     this.boundingBox.minX() + zOff,
                     this.boundingBox.minY() + yOff,
                     this.boundingBox.maxZ() + 1,
                     Direction.SOUTH,
                     this.getGenDepth()
                  );
            }
         }

         return null;
      }

      protected static boolean isOkBox(final BoundingBox box) {
         return box.minY() > 10;
      }

      protected enum SmallDoorType {
         OPENING,
         WOOD_DOOR,
         GRATES,
         IRON_DOOR;

         @Deprecated
         public static final Codec<StrongholdPieces.StrongholdPiece.SmallDoorType> LEGACY_CODEC = ExtraCodecs.legacyEnum(
            StrongholdPieces.StrongholdPiece.SmallDoorType::valueOf
         );
      }
   }

   public abstract static class Turn extends StrongholdPieces.StrongholdPiece {
      protected static final int WIDTH = 5;
      protected static final int HEIGHT = 5;
      protected static final int DEPTH = 5;

      protected Turn(final StructurePieceType type, final int genDepth, final BoundingBox boundingBox) {
         super(type, genDepth, boundingBox);
      }

      public Turn(final StructurePieceType type, final CompoundTag tag) {
         super(type, tag);
      }
   }
}
