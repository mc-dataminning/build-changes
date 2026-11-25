package net.minecraft.world.level.levelgen.structure.structures;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import org.jspecify.annotations.Nullable;

public class WoodlandMansionPieces {
   public static void generateMansion(
      final StructureTemplateManager structureTemplateManager,
      final BlockPos origin,
      final Rotation rotation,
      final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
      final RandomSource random
   ) {
      WoodlandMansionPieces.MansionGrid grid = new WoodlandMansionPieces.MansionGrid(random);
      WoodlandMansionPieces.MansionPiecePlacer placer = new WoodlandMansionPieces.MansionPiecePlacer(structureTemplateManager, random);
      placer.createMansion(origin, rotation, pieces, grid);
   }

   private static class FirstFloorRoomCollection extends WoodlandMansionPieces.FloorRoomCollection {
      @Override
      public String get1x1(final RandomSource random) {
         return "1x1_a" + (random.nextInt(5) + 1);
      }

      @Override
      public String get1x1Secret(final RandomSource random) {
         return "1x1_as" + (random.nextInt(4) + 1);
      }

      @Override
      public String get1x2SideEntrance(final RandomSource random, final boolean isStairsRoom) {
         return "1x2_a" + (random.nextInt(9) + 1);
      }

      @Override
      public String get1x2FrontEntrance(final RandomSource random, final boolean isStairsRoom) {
         return "1x2_b" + (random.nextInt(5) + 1);
      }

      @Override
      public String get1x2Secret(final RandomSource random) {
         return "1x2_s" + (random.nextInt(2) + 1);
      }

      @Override
      public String get2x2(final RandomSource random) {
         return "2x2_a" + (random.nextInt(4) + 1);
      }

      @Override
      public String get2x2Secret(final RandomSource random) {
         return "2x2_s1";
      }
   }

   private abstract static class FloorRoomCollection {
      public abstract String get1x1(RandomSource random);

      public abstract String get1x1Secret(RandomSource random);

      public abstract String get1x2SideEntrance(RandomSource random, boolean isStairsRoom);

      public abstract String get1x2FrontEntrance(RandomSource random, boolean isStairsRoom);

      public abstract String get1x2Secret(RandomSource random);

      public abstract String get2x2(RandomSource random);

      public abstract String get2x2Secret(RandomSource random);
   }

   private static class MansionGrid {
      private static final int DEFAULT_SIZE = 11;
      private static final int CLEAR = 0;
      private static final int CORRIDOR = 1;
      private static final int ROOM = 2;
      private static final int START_ROOM = 3;
      private static final int TEST_ROOM = 4;
      private static final int BLOCKED = 5;
      private static final int ROOM_1x1 = 65536;
      private static final int ROOM_1x2 = 131072;
      private static final int ROOM_2x2 = 262144;
      private static final int ROOM_ORIGIN_FLAG = 1048576;
      private static final int ROOM_DOOR_FLAG = 2097152;
      private static final int ROOM_STAIRS_FLAG = 4194304;
      private static final int ROOM_CORRIDOR_FLAG = 8388608;
      private static final int ROOM_TYPE_MASK = 983040;
      private static final int ROOM_ID_MASK = 65535;
      private final RandomSource random;
      private final WoodlandMansionPieces.SimpleGrid baseGrid;
      private final WoodlandMansionPieces.SimpleGrid thirdFloorGrid;
      private final WoodlandMansionPieces.SimpleGrid[] floorRooms;
      private final int entranceX;
      private final int entranceY;

      public MansionGrid(final RandomSource random) {
         this.random = random;
         int houseSize = 11;
         this.entranceX = 7;
         this.entranceY = 4;
         this.baseGrid = new WoodlandMansionPieces.SimpleGrid(11, 11, 5);
         this.baseGrid.set(this.entranceX, this.entranceY, this.entranceX + 1, this.entranceY + 1, 3);
         this.baseGrid.set(this.entranceX - 1, this.entranceY, this.entranceX - 1, this.entranceY + 1, 2);
         this.baseGrid.set(this.entranceX + 2, this.entranceY - 2, this.entranceX + 3, this.entranceY + 3, 5);
         this.baseGrid.set(this.entranceX + 1, this.entranceY - 2, this.entranceX + 1, this.entranceY - 1, 1);
         this.baseGrid.set(this.entranceX + 1, this.entranceY + 2, this.entranceX + 1, this.entranceY + 3, 1);
         this.baseGrid.set(this.entranceX - 1, this.entranceY - 1, 1);
         this.baseGrid.set(this.entranceX - 1, this.entranceY + 2, 1);
         this.baseGrid.set(0, 0, 11, 1, 5);
         this.baseGrid.set(0, 9, 11, 11, 5);
         this.recursiveCorridor(this.baseGrid, this.entranceX, this.entranceY - 2, Direction.WEST, 6);
         this.recursiveCorridor(this.baseGrid, this.entranceX, this.entranceY + 3, Direction.WEST, 6);
         this.recursiveCorridor(this.baseGrid, this.entranceX - 2, this.entranceY - 1, Direction.WEST, 3);
         this.recursiveCorridor(this.baseGrid, this.entranceX - 2, this.entranceY + 2, Direction.WEST, 3);

         while (this.cleanEdges(this.baseGrid)) {
         }

         this.floorRooms = new WoodlandMansionPieces.SimpleGrid[3];
         this.floorRooms[0] = new WoodlandMansionPieces.SimpleGrid(11, 11, 5);
         this.floorRooms[1] = new WoodlandMansionPieces.SimpleGrid(11, 11, 5);
         this.floorRooms[2] = new WoodlandMansionPieces.SimpleGrid(11, 11, 5);
         this.identifyRooms(this.baseGrid, this.floorRooms[0]);
         this.identifyRooms(this.baseGrid, this.floorRooms[1]);
         this.floorRooms[0].set(this.entranceX + 1, this.entranceY, this.entranceX + 1, this.entranceY + 1, 8388608);
         this.floorRooms[1].set(this.entranceX + 1, this.entranceY, this.entranceX + 1, this.entranceY + 1, 8388608);
         this.thirdFloorGrid = new WoodlandMansionPieces.SimpleGrid(this.baseGrid.width, this.baseGrid.height, 5);
         this.setupThirdFloor();
         this.identifyRooms(this.thirdFloorGrid, this.floorRooms[2]);
      }

      public static boolean isHouse(final WoodlandMansionPieces.SimpleGrid grid, final int x, final int y) {
         int value = grid.get(x, y);
         return value == 1 || value == 2 || value == 3 || value == 4;
      }

      public boolean isRoomId(final WoodlandMansionPieces.SimpleGrid grid, final int x, final int y, final int floor, final int roomId) {
         return (this.floorRooms[floor].get(x, y) & 65535) == roomId;
      }

      public @Nullable Direction get1x2RoomDirection(
         final WoodlandMansionPieces.SimpleGrid grid, final int x, final int y, final int floorNum, final int roomId
      ) {
         for (Direction direction : Direction.Plane.HORIZONTAL) {
            if (this.isRoomId(grid, x + direction.getStepX(), y + direction.getStepZ(), floorNum, roomId)) {
               return direction;
            }
         }

         return null;
      }

      private void recursiveCorridor(final WoodlandMansionPieces.SimpleGrid grid, final int x, final int y, final Direction heading, final int depth) {
         if (depth > 0) {
            grid.set(x, y, 1);
            grid.setif(x + heading.getStepX(), y + heading.getStepZ(), 0, 1);

            for (int attempts = 0; attempts < 8; attempts++) {
               Direction nextDir = Direction.from2DDataValue(this.random.nextInt(4));
               if (nextDir != heading.getOpposite() && (nextDir != Direction.EAST || !this.random.nextBoolean())) {
                  int nx = x + heading.getStepX();
                  int ny = y + heading.getStepZ();
                  if (grid.get(nx + nextDir.getStepX(), ny + nextDir.getStepZ()) == 0
                     && grid.get(nx + nextDir.getStepX() * 2, ny + nextDir.getStepZ() * 2) == 0) {
                     this.recursiveCorridor(grid, x + heading.getStepX() + nextDir.getStepX(), y + heading.getStepZ() + nextDir.getStepZ(), nextDir, depth - 1);
                     break;
                  }
               }
            }

            Direction cw = heading.getClockWise();
            Direction ccw = heading.getCounterClockWise();
            grid.setif(x + cw.getStepX(), y + cw.getStepZ(), 0, 2);
            grid.setif(x + ccw.getStepX(), y + ccw.getStepZ(), 0, 2);
            grid.setif(x + heading.getStepX() + cw.getStepX(), y + heading.getStepZ() + cw.getStepZ(), 0, 2);
            grid.setif(x + heading.getStepX() + ccw.getStepX(), y + heading.getStepZ() + ccw.getStepZ(), 0, 2);
            grid.setif(x + heading.getStepX() * 2, y + heading.getStepZ() * 2, 0, 2);
            grid.setif(x + cw.getStepX() * 2, y + cw.getStepZ() * 2, 0, 2);
            grid.setif(x + ccw.getStepX() * 2, y + ccw.getStepZ() * 2, 0, 2);
         }
      }

      private boolean cleanEdges(final WoodlandMansionPieces.SimpleGrid grid) {
         boolean touched = false;

         for (int y = 0; y < grid.height; y++) {
            for (int x = 0; x < grid.width; x++) {
               if (grid.get(x, y) == 0) {
                  int directNeighbors = 0;
                  directNeighbors += isHouse(grid, x + 1, y) ? 1 : 0;
                  directNeighbors += isHouse(grid, x - 1, y) ? 1 : 0;
                  directNeighbors += isHouse(grid, x, y + 1) ? 1 : 0;
                  directNeighbors += isHouse(grid, x, y - 1) ? 1 : 0;
                  if (directNeighbors >= 3) {
                     grid.set(x, y, 2);
                     touched = true;
                  } else if (directNeighbors == 2) {
                     int diagonalNeighbors = 0;
                     diagonalNeighbors += isHouse(grid, x + 1, y + 1) ? 1 : 0;
                     diagonalNeighbors += isHouse(grid, x - 1, y + 1) ? 1 : 0;
                     diagonalNeighbors += isHouse(grid, x + 1, y - 1) ? 1 : 0;
                     diagonalNeighbors += isHouse(grid, x - 1, y - 1) ? 1 : 0;
                     if (diagonalNeighbors <= 1) {
                        grid.set(x, y, 2);
                        touched = true;
                     }
                  }
               }
            }
         }

         return touched;
      }

      private void setupThirdFloor() {
         List<WoodlandMansionPieces.MansionGrid.GridPos> potentialRooms = new ArrayList<>();
         WoodlandMansionPieces.SimpleGrid floor = this.floorRooms[1];

         for (int y = 0; y < this.thirdFloorGrid.height; y++) {
            for (int x = 0; x < this.thirdFloorGrid.width; x++) {
               int roomData = floor.get(x, y);
               int roomType = roomData & 983040;
               if (roomType == 131072 && (roomData & 2097152) == 2097152) {
                  potentialRooms.add(new WoodlandMansionPieces.MansionGrid.GridPos(x, y));
               }
            }
         }

         if (potentialRooms.isEmpty()) {
            this.thirdFloorGrid.set(0, 0, this.thirdFloorGrid.width, this.thirdFloorGrid.height, 5);
         } else {
            WoodlandMansionPieces.MansionGrid.GridPos roomPos = potentialRooms.get(this.random.nextInt(potentialRooms.size()));
            int roomData = floor.get(roomPos.x(), roomPos.y());
            floor.set(roomPos.x(), roomPos.y(), roomData | 4194304);
            Direction roomDir = this.get1x2RoomDirection(this.baseGrid, roomPos.x(), roomPos.y(), 1, roomData & 65535);
            int roomEndX = roomPos.x() + roomDir.getStepX();
            int roomEndY = roomPos.y() + roomDir.getStepZ();

            for (int y = 0; y < this.thirdFloorGrid.height; y++) {
               for (int x = 0; x < this.thirdFloorGrid.width; x++) {
                  if (!isHouse(this.baseGrid, x, y)) {
                     this.thirdFloorGrid.set(x, y, 5);
                  } else if (x == roomPos.x() && y == roomPos.y()) {
                     this.thirdFloorGrid.set(x, y, 3);
                  } else if (x == roomEndX && y == roomEndY) {
                     this.thirdFloorGrid.set(x, y, 3);
                     this.floorRooms[2].set(x, y, 8388608);
                  }
               }
            }

            List<Direction> potentialCorridors = new ArrayList<>();

            for (Direction direction : Direction.Plane.HORIZONTAL) {
               if (this.thirdFloorGrid.get(roomEndX + direction.getStepX(), roomEndY + direction.getStepZ()) == 0) {
                  potentialCorridors.add(direction);
               }
            }

            if (potentialCorridors.isEmpty()) {
               this.thirdFloorGrid.set(0, 0, this.thirdFloorGrid.width, this.thirdFloorGrid.height, 5);
               floor.set(roomPos.x(), roomPos.y(), roomData);
            } else {
               Direction corridorDir = potentialCorridors.get(this.random.nextInt(potentialCorridors.size()));
               this.recursiveCorridor(this.thirdFloorGrid, roomEndX + corridorDir.getStepX(), roomEndY + corridorDir.getStepZ(), corridorDir, 4);

               while (this.cleanEdges(this.thirdFloorGrid)) {
               }
            }
         }
      }

      private void identifyRooms(final WoodlandMansionPieces.SimpleGrid fromGrid, final WoodlandMansionPieces.SimpleGrid roomGrid) {
         List<WoodlandMansionPieces.MansionGrid.GridPos> roomPos = new ArrayList<>();

         for (int y = 0; y < fromGrid.height; y++) {
            for (int x = 0; x < fromGrid.width; x++) {
               if (fromGrid.get(x, y) == 2) {
                  roomPos.add(new WoodlandMansionPieces.MansionGrid.GridPos(x, y));
               }
            }
         }

         Util.shuffle(roomPos, this.random);
         int roomId = 10;

         for (WoodlandMansionPieces.MansionGrid.GridPos pos : roomPos) {
            int x = pos.x();
            int y = pos.y();
            if (roomGrid.get(x, y) == 0) {
               int x0 = x;
               int x1 = x;
               int y0 = y;
               int y1 = y;
               int type = 65536;
               if (roomGrid.get(x + 1, y) == 0
                  && roomGrid.get(x, y + 1) == 0
                  && roomGrid.get(x + 1, y + 1) == 0
                  && fromGrid.get(x + 1, y) == 2
                  && fromGrid.get(x, y + 1) == 2
                  && fromGrid.get(x + 1, y + 1) == 2) {
                  x1++;
                  y1++;
                  type = 262144;
               } else if (roomGrid.get(x - 1, y) == 0
                  && roomGrid.get(x, y + 1) == 0
                  && roomGrid.get(x - 1, y + 1) == 0
                  && fromGrid.get(x - 1, y) == 2
                  && fromGrid.get(x, y + 1) == 2
                  && fromGrid.get(x - 1, y + 1) == 2) {
                  x0--;
                  y1++;
                  type = 262144;
               } else if (roomGrid.get(x - 1, y) == 0
                  && roomGrid.get(x, y - 1) == 0
                  && roomGrid.get(x - 1, y - 1) == 0
                  && fromGrid.get(x - 1, y) == 2
                  && fromGrid.get(x, y - 1) == 2
                  && fromGrid.get(x - 1, y - 1) == 2) {
                  x0--;
                  y0--;
                  type = 262144;
               } else if (roomGrid.get(x + 1, y) == 0 && fromGrid.get(x + 1, y) == 2) {
                  x1++;
                  type = 131072;
               } else if (roomGrid.get(x, y + 1) == 0 && fromGrid.get(x, y + 1) == 2) {
                  y1++;
                  type = 131072;
               } else if (roomGrid.get(x - 1, y) == 0 && fromGrid.get(x - 1, y) == 2) {
                  x0--;
                  type = 131072;
               } else if (roomGrid.get(x, y - 1) == 0 && fromGrid.get(x, y - 1) == 2) {
                  y0--;
                  type = 131072;
               }

               int doorX = this.random.nextBoolean() ? x0 : x1;
               int doorY = this.random.nextBoolean() ? y0 : y1;
               int doorFlag = 2097152;
               if (!fromGrid.edgesTo(doorX, doorY, 1)) {
                  doorX = doorX == x0 ? x1 : x0;
                  doorY = doorY == y0 ? y1 : y0;
                  if (!fromGrid.edgesTo(doorX, doorY, 1)) {
                     doorY = doorY == y0 ? y1 : y0;
                     if (!fromGrid.edgesTo(doorX, doorY, 1)) {
                        doorX = doorX == x0 ? x1 : x0;
                        doorY = doorY == y0 ? y1 : y0;
                        if (!fromGrid.edgesTo(doorX, doorY, 1)) {
                           doorFlag = 0;
                           doorX = x0;
                           doorY = y0;
                        }
                     }
                  }
               }

               for (int ry = y0; ry <= y1; ry++) {
                  for (int rx = x0; rx <= x1; rx++) {
                     if (rx == doorX && ry == doorY) {
                        roomGrid.set(rx, ry, 1048576 | doorFlag | type | roomId);
                     } else {
                        roomGrid.set(rx, ry, type | roomId);
                     }
                  }
               }

               roomId++;
            }
         }
      }

      private record GridPos(int x, int y) {
      }
   }

   private static class MansionPiecePlacer {
      private final StructureTemplateManager structureTemplateManager;
      private final RandomSource random;
      private int startX;
      private int startY;

      public MansionPiecePlacer(final StructureTemplateManager structureTemplateManager, final RandomSource random) {
         this.structureTemplateManager = structureTemplateManager;
         this.random = random;
      }

      public void createMansion(
         final BlockPos origin,
         final Rotation rotation,
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final WoodlandMansionPieces.MansionGrid mansion
      ) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 000: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData
         // 003: dup
         // 004: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.<init> ()V
         // 007: astore 5
         // 009: aload 5
         // 00b: aload 1
         // 00c: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 00f: aload 5
         // 011: aload 2
         // 012: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.rotation Lnet/minecraft/world/level/block/Rotation;
         // 015: aload 5
         // 017: ldc "wall_flat"
         // 019: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.wallType Ljava/lang/String;
         // 01c: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData
         // 01f: dup
         // 020: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.<init> ()V
         // 023: astore 6
         // 025: aload 0
         // 026: aload 3
         // 027: aload 5
         // 029: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.entrance (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData;)V
         // 02c: aload 6
         // 02e: aload 5
         // 030: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 033: bipush 8
         // 035: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
         // 038: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 03b: aload 6
         // 03d: aload 5
         // 03f: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.rotation Lnet/minecraft/world/level/block/Rotation;
         // 042: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.rotation Lnet/minecraft/world/level/block/Rotation;
         // 045: aload 6
         // 047: ldc "wall_window"
         // 049: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.wallType Ljava/lang/String;
         // 04c: aload 3
         // 04d: invokeinterface java/util/List.isEmpty ()Z 1
         // 052: ifne 055
         // 055: aload 4
         // 057: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.baseGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 05a: astore 7
         // 05c: aload 4
         // 05e: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 061: astore 8
         // 063: aload 0
         // 064: aload 4
         // 066: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.entranceX I
         // 069: bipush 1
         // 06a: iadd
         // 06b: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 06e: aload 0
         // 06f: aload 4
         // 071: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.entranceY I
         // 074: bipush 1
         // 075: iadd
         // 076: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 079: aload 4
         // 07b: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.entranceX I
         // 07e: bipush 1
         // 07f: iadd
         // 080: istore 9
         // 082: aload 4
         // 084: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.entranceY I
         // 087: istore 10
         // 089: aload 0
         // 08a: aload 3
         // 08b: aload 5
         // 08d: aload 7
         // 08f: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 092: aload 0
         // 093: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 096: aload 0
         // 097: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 09a: iload 9
         // 09c: iload 10
         // 09e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.traverseOuterWalls (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/core/Direction;IIII)V
         // 0a1: aload 0
         // 0a2: aload 3
         // 0a3: aload 6
         // 0a5: aload 7
         // 0a7: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 0aa: aload 0
         // 0ab: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 0ae: aload 0
         // 0af: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 0b2: iload 9
         // 0b4: iload 10
         // 0b6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.traverseOuterWalls (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/core/Direction;IIII)V
         // 0b9: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData
         // 0bc: dup
         // 0bd: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.<init> ()V
         // 0c0: astore 11
         // 0c2: aload 11
         // 0c4: aload 5
         // 0c6: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 0c9: bipush 19
         // 0cb: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
         // 0ce: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 0d1: aload 11
         // 0d3: aload 5
         // 0d5: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.rotation Lnet/minecraft/world/level/block/Rotation;
         // 0d8: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.rotation Lnet/minecraft/world/level/block/Rotation;
         // 0db: aload 11
         // 0dd: ldc "wall_window"
         // 0df: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.wallType Ljava/lang/String;
         // 0e2: bipush 0
         // 0e3: istore 12
         // 0e5: bipush 0
         // 0e6: istore 13
         // 0e8: iload 13
         // 0ea: aload 8
         // 0ec: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 0ef: if_icmpge 17f
         // 0f2: iload 12
         // 0f4: ifne 17f
         // 0f7: aload 8
         // 0f9: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 0fc: bipush 1
         // 0fd: isub
         // 0fe: istore 14
         // 100: iload 14
         // 102: iflt 179
         // 105: iload 12
         // 107: ifne 179
         // 10a: aload 8
         // 10c: iload 14
         // 10e: iload 13
         // 110: invokestatic net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isHouse (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;II)Z
         // 113: ifeq 173
         // 116: aload 11
         // 118: aload 11
         // 11a: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 11d: aload 2
         // 11e: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 121: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 124: bipush 8
         // 126: iload 13
         // 128: aload 0
         // 129: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 12c: isub
         // 12d: bipush 8
         // 12f: imul
         // 130: iadd
         // 131: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 134: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 137: aload 11
         // 139: aload 11
         // 13b: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 13e: aload 2
         // 13f: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 142: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 145: iload 14
         // 147: aload 0
         // 148: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 14b: isub
         // 14c: bipush 8
         // 14e: imul
         // 14f: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 152: putfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData.position Lnet/minecraft/core/BlockPos;
         // 155: aload 0
         // 156: aload 3
         // 157: aload 11
         // 159: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.traverseWallPiece (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData;)V
         // 15c: aload 0
         // 15d: aload 3
         // 15e: aload 11
         // 160: aload 8
         // 162: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 165: iload 14
         // 167: iload 13
         // 169: iload 14
         // 16b: iload 13
         // 16d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.traverseOuterWalls (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$PlacementData;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/core/Direction;IIII)V
         // 170: bipush 1
         // 171: istore 12
         // 173: iinc 14 -1
         // 176: goto 100
         // 179: iinc 13 1
         // 17c: goto 0e8
         // 17f: aload 0
         // 180: aload 3
         // 181: aload 1
         // 182: bipush 16
         // 184: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
         // 187: aload 2
         // 188: aload 7
         // 18a: aload 8
         // 18c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.createRoof (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;)V
         // 18f: aload 0
         // 190: aload 3
         // 191: aload 1
         // 192: bipush 27
         // 194: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
         // 197: aload 2
         // 198: aload 8
         // 19a: aconst_null
         // 19b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.createRoof (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;)V
         // 19e: aload 3
         // 19f: invokeinterface java/util/List.isEmpty ()Z 1
         // 1a4: ifne 1a7
         // 1a7: bipush 3
         // 1a8: anewarray 116
         // 1ab: astore 13
         // 1ad: aload 13
         // 1af: bipush 0
         // 1b0: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FirstFloorRoomCollection
         // 1b3: dup
         // 1b4: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FirstFloorRoomCollection.<init> ()V
         // 1b7: aastore
         // 1b8: aload 13
         // 1ba: bipush 1
         // 1bb: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SecondFloorRoomCollection
         // 1be: dup
         // 1bf: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SecondFloorRoomCollection.<init> ()V
         // 1c2: aastore
         // 1c3: aload 13
         // 1c5: bipush 2
         // 1c6: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$ThirdFloorRoomCollection
         // 1c9: dup
         // 1ca: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$ThirdFloorRoomCollection.<init> ()V
         // 1cd: aastore
         // 1ce: bipush 0
         // 1cf: istore 14
         // 1d1: iload 14
         // 1d3: bipush 3
         // 1d4: if_icmpge 76c
         // 1d7: aload 1
         // 1d8: bipush 8
         // 1da: iload 14
         // 1dc: imul
         // 1dd: iload 14
         // 1df: bipush 2
         // 1e0: if_icmpne 1e7
         // 1e3: bipush 3
         // 1e4: goto 1e8
         // 1e7: bipush 0
         // 1e8: iadd
         // 1e9: invokevirtual net/minecraft/core/BlockPos.above (I)Lnet/minecraft/core/BlockPos;
         // 1ec: astore 15
         // 1ee: aload 4
         // 1f0: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.floorRooms [Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 1f3: iload 14
         // 1f5: aaload
         // 1f6: astore 16
         // 1f8: iload 14
         // 1fa: bipush 2
         // 1fb: if_icmpne 203
         // 1fe: aload 8
         // 200: goto 205
         // 203: aload 7
         // 205: astore 17
         // 207: iload 14
         // 209: ifne 211
         // 20c: ldc "carpet_south_1"
         // 20e: goto 213
         // 211: ldc "carpet_south_2"
         // 213: astore 18
         // 215: iload 14
         // 217: ifne 21f
         // 21a: ldc "carpet_west_1"
         // 21c: goto 221
         // 21f: ldc "carpet_west_2"
         // 221: astore 19
         // 223: bipush 0
         // 224: istore 20
         // 226: iload 20
         // 228: aload 17
         // 22a: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 22d: if_icmpge 3d7
         // 230: bipush 0
         // 231: istore 21
         // 233: iload 21
         // 235: aload 17
         // 237: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 23a: if_icmpge 3d1
         // 23d: aload 17
         // 23f: iload 21
         // 241: iload 20
         // 243: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 246: bipush 1
         // 247: if_icmpne 3cb
         // 24a: aload 15
         // 24c: aload 2
         // 24d: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 250: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 253: bipush 8
         // 255: iload 20
         // 257: aload 0
         // 258: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 25b: isub
         // 25c: bipush 8
         // 25e: imul
         // 25f: iadd
         // 260: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 263: astore 22
         // 265: aload 22
         // 267: aload 2
         // 268: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 26b: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 26e: iload 21
         // 270: aload 0
         // 271: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 274: isub
         // 275: bipush 8
         // 277: imul
         // 278: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 27b: astore 22
         // 27d: aload 3
         // 27e: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 281: dup
         // 282: aload 0
         // 283: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 286: ldc "corridor_floor"
         // 288: aload 22
         // 28a: aload 2
         // 28b: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 28e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 293: pop
         // 294: aload 17
         // 296: iload 21
         // 298: iload 20
         // 29a: bipush 1
         // 29b: isub
         // 29c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 29f: bipush 1
         // 2a0: if_icmpeq 2b6
         // 2a3: aload 16
         // 2a5: iload 21
         // 2a7: iload 20
         // 2a9: bipush 1
         // 2aa: isub
         // 2ab: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 2ae: ldc 8388608
         // 2b0: iand
         // 2b1: ldc 8388608
         // 2b3: if_icmpne 2db
         // 2b6: aload 3
         // 2b7: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 2ba: dup
         // 2bb: aload 0
         // 2bc: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 2bf: ldc "carpet_north"
         // 2c1: aload 22
         // 2c3: aload 2
         // 2c4: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 2c7: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 2ca: bipush 1
         // 2cb: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 2ce: invokevirtual net/minecraft/core/BlockPos.above ()Lnet/minecraft/core/BlockPos;
         // 2d1: aload 2
         // 2d2: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 2d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 2da: pop
         // 2db: aload 17
         // 2dd: iload 21
         // 2df: bipush 1
         // 2e0: iadd
         // 2e1: iload 20
         // 2e3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 2e6: bipush 1
         // 2e7: if_icmpeq 2fd
         // 2ea: aload 16
         // 2ec: iload 21
         // 2ee: bipush 1
         // 2ef: iadd
         // 2f0: iload 20
         // 2f2: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 2f5: ldc 8388608
         // 2f7: iand
         // 2f8: ldc 8388608
         // 2fa: if_icmpne 32d
         // 2fd: aload 3
         // 2fe: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 301: dup
         // 302: aload 0
         // 303: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 306: ldc "carpet_east"
         // 308: aload 22
         // 30a: aload 2
         // 30b: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 30e: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 311: bipush 1
         // 312: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 315: aload 2
         // 316: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 319: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 31c: bipush 5
         // 31d: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 320: invokevirtual net/minecraft/core/BlockPos.above ()Lnet/minecraft/core/BlockPos;
         // 323: aload 2
         // 324: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 327: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 32c: pop
         // 32d: aload 17
         // 32f: iload 21
         // 331: iload 20
         // 333: bipush 1
         // 334: iadd
         // 335: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 338: bipush 1
         // 339: if_icmpeq 34f
         // 33c: aload 16
         // 33e: iload 21
         // 340: iload 20
         // 342: bipush 1
         // 343: iadd
         // 344: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 347: ldc 8388608
         // 349: iand
         // 34a: ldc 8388608
         // 34c: if_icmpne 37c
         // 34f: aload 3
         // 350: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 353: dup
         // 354: aload 0
         // 355: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 358: aload 18
         // 35a: aload 22
         // 35c: aload 2
         // 35d: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 360: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 363: bipush 5
         // 364: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 367: aload 2
         // 368: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
         // 36b: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 36e: bipush 1
         // 36f: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 372: aload 2
         // 373: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 376: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 37b: pop
         // 37c: aload 17
         // 37e: iload 21
         // 380: bipush 1
         // 381: isub
         // 382: iload 20
         // 384: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 387: bipush 1
         // 388: if_icmpeq 39e
         // 38b: aload 16
         // 38d: iload 21
         // 38f: bipush 1
         // 390: isub
         // 391: iload 20
         // 393: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 396: ldc 8388608
         // 398: iand
         // 399: ldc 8388608
         // 39b: if_icmpne 3cb
         // 39e: aload 3
         // 39f: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 3a2: dup
         // 3a3: aload 0
         // 3a4: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 3a7: aload 19
         // 3a9: aload 22
         // 3ab: aload 2
         // 3ac: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
         // 3af: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 3b2: bipush 1
         // 3b3: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 3b6: aload 2
         // 3b7: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
         // 3ba: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 3bd: bipush 1
         // 3be: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 3c1: aload 2
         // 3c2: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 3c5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 3ca: pop
         // 3cb: iinc 21 1
         // 3ce: goto 233
         // 3d1: iinc 20 1
         // 3d4: goto 226
         // 3d7: iload 14
         // 3d9: ifne 3e1
         // 3dc: ldc "indoors_wall_1"
         // 3de: goto 3e3
         // 3e1: ldc "indoors_wall_2"
         // 3e3: astore 20
         // 3e5: iload 14
         // 3e7: ifne 3ef
         // 3ea: ldc "indoors_door_1"
         // 3ec: goto 3f1
         // 3ef: ldc "indoors_door_2"
         // 3f1: astore 21
         // 3f3: new java/util/ArrayList
         // 3f6: dup
         // 3f7: invokespecial java/util/ArrayList.<init> ()V
         // 3fa: astore 22
         // 3fc: bipush 0
         // 3fd: istore 23
         // 3ff: iload 23
         // 401: aload 17
         // 403: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 406: if_icmpge 766
         // 409: bipush 0
         // 40a: istore 24
         // 40c: iload 24
         // 40e: aload 17
         // 410: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 413: if_icmpge 760
         // 416: iload 14
         // 418: bipush 2
         // 419: if_icmpne 42d
         // 41c: aload 17
         // 41e: iload 24
         // 420: iload 23
         // 422: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 425: bipush 3
         // 426: if_icmpne 42d
         // 429: bipush 1
         // 42a: goto 42e
         // 42d: bipush 0
         // 42e: istore 25
         // 430: aload 17
         // 432: iload 24
         // 434: iload 23
         // 436: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 439: bipush 2
         // 43a: if_icmpeq 442
         // 43d: iload 25
         // 43f: ifeq 75a
         // 442: aload 16
         // 444: iload 24
         // 446: iload 23
         // 448: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 44b: istore 26
         // 44d: iload 26
         // 44f: ldc 983040
         // 451: iand
         // 452: istore 27
         // 454: iload 26
         // 456: ldc 65535
         // 458: iand
         // 459: istore 28
         // 45b: iload 25
         // 45d: ifeq 46e
         // 460: iload 26
         // 462: ldc 8388608
         // 464: iand
         // 465: ldc 8388608
         // 467: if_icmpne 46e
         // 46a: bipush 1
         // 46b: goto 46f
         // 46e: bipush 0
         // 46f: istore 25
         // 471: aload 22
         // 473: invokeinterface java/util/List.clear ()V 1
         // 478: iload 26
         // 47a: ldc 2097152
         // 47c: iand
         // 47d: ldc 2097152
         // 47f: if_icmpne 4c6
         // 482: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
         // 485: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
         // 488: astore 29
         // 48a: aload 29
         // 48c: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 491: ifeq 4c6
         // 494: aload 29
         // 496: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 49b: checkcast net/minecraft/core/Direction
         // 49e: astore 30
         // 4a0: aload 17
         // 4a2: iload 24
         // 4a4: aload 30
         // 4a6: invokevirtual net/minecraft/core/Direction.getStepX ()I
         // 4a9: iadd
         // 4aa: iload 23
         // 4ac: aload 30
         // 4ae: invokevirtual net/minecraft/core/Direction.getStepZ ()I
         // 4b1: iadd
         // 4b2: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 4b5: bipush 1
         // 4b6: if_icmpne 4c3
         // 4b9: aload 22
         // 4bb: aload 30
         // 4bd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 4c2: pop
         // 4c3: goto 48a
         // 4c6: aconst_null
         // 4c7: astore 29
         // 4c9: aload 22
         // 4cb: invokeinterface java/util/List.isEmpty ()Z 1
         // 4d0: ifne 4f2
         // 4d3: aload 22
         // 4d5: aload 0
         // 4d6: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.random Lnet/minecraft/util/RandomSource;
         // 4d9: aload 22
         // 4db: invokeinterface java/util/List.size ()I 1
         // 4e0: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 4e5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 4ea: checkcast net/minecraft/core/Direction
         // 4ed: astore 29
         // 4ef: goto 501
         // 4f2: iload 26
         // 4f4: ldc 1048576
         // 4f6: iand
         // 4f7: ldc 1048576
         // 4f9: if_icmpne 501
         // 4fc: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
         // 4ff: astore 29
         // 501: aload 15
         // 503: aload 2
         // 504: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 507: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 50a: bipush 8
         // 50c: iload 23
         // 50e: aload 0
         // 50f: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startY I
         // 512: isub
         // 513: bipush 8
         // 515: imul
         // 516: iadd
         // 517: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 51a: astore 30
         // 51c: aload 30
         // 51e: aload 2
         // 51f: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 522: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 525: bipush -1
         // 526: iload 24
         // 528: aload 0
         // 529: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.startX I
         // 52c: isub
         // 52d: bipush 8
         // 52f: imul
         // 530: iadd
         // 531: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 534: astore 30
         // 536: aload 17
         // 538: iload 24
         // 53a: bipush 1
         // 53b: isub
         // 53c: iload 23
         // 53e: invokestatic net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isHouse (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;II)Z
         // 541: ifeq 57c
         // 544: aload 4
         // 546: aload 17
         // 548: iload 24
         // 54a: bipush 1
         // 54b: isub
         // 54c: iload 23
         // 54e: iload 14
         // 550: iload 28
         // 552: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isRoomId (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IIII)Z
         // 555: ifne 57c
         // 558: aload 3
         // 559: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 55c: dup
         // 55d: aload 0
         // 55e: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 561: aload 29
         // 563: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
         // 566: if_acmpne 56e
         // 569: aload 21
         // 56b: goto 570
         // 56e: aload 20
         // 570: aload 30
         // 572: aload 2
         // 573: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 576: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 57b: pop
         // 57c: aload 17
         // 57e: iload 24
         // 580: bipush 1
         // 581: iadd
         // 582: iload 23
         // 584: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 587: bipush 1
         // 588: if_icmpne 5c4
         // 58b: iload 25
         // 58d: ifne 5c4
         // 590: aload 30
         // 592: aload 2
         // 593: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 596: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 599: bipush 8
         // 59b: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 59e: astore 31
         // 5a0: aload 3
         // 5a1: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 5a4: dup
         // 5a5: aload 0
         // 5a6: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 5a9: aload 29
         // 5ab: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 5ae: if_acmpne 5b6
         // 5b1: aload 21
         // 5b3: goto 5b8
         // 5b6: aload 20
         // 5b8: aload 31
         // 5ba: aload 2
         // 5bb: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 5be: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 5c3: pop
         // 5c4: aload 17
         // 5c6: iload 24
         // 5c8: iload 23
         // 5ca: bipush 1
         // 5cb: iadd
         // 5cc: invokestatic net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isHouse (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;II)Z
         // 5cf: ifeq 630
         // 5d2: aload 4
         // 5d4: aload 17
         // 5d6: iload 24
         // 5d8: iload 23
         // 5da: bipush 1
         // 5db: iadd
         // 5dc: iload 14
         // 5de: iload 28
         // 5e0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isRoomId (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IIII)Z
         // 5e3: ifne 630
         // 5e6: aload 30
         // 5e8: aload 2
         // 5e9: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 5ec: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 5ef: bipush 7
         // 5f1: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 5f4: astore 31
         // 5f6: aload 31
         // 5f8: aload 2
         // 5f9: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 5fc: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 5ff: bipush 7
         // 601: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 604: astore 31
         // 606: aload 3
         // 607: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 60a: dup
         // 60b: aload 0
         // 60c: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 60f: aload 29
         // 611: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
         // 614: if_acmpne 61c
         // 617: aload 21
         // 619: goto 61e
         // 61c: aload 20
         // 61e: aload 31
         // 620: aload 2
         // 621: getstatic net/minecraft/world/level/block/Rotation.CLOCKWISE_90 Lnet/minecraft/world/level/block/Rotation;
         // 624: invokevirtual net/minecraft/world/level/block/Rotation.getRotated (Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/Rotation;
         // 627: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 62a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 62f: pop
         // 630: aload 17
         // 632: iload 24
         // 634: iload 23
         // 636: bipush 1
         // 637: isub
         // 638: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 63b: bipush 1
         // 63c: if_icmpne 68d
         // 63f: iload 25
         // 641: ifne 68d
         // 644: aload 30
         // 646: aload 2
         // 647: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
         // 64a: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 64d: bipush 1
         // 64e: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 651: astore 31
         // 653: aload 31
         // 655: aload 2
         // 656: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
         // 659: invokevirtual net/minecraft/world/level/block/Rotation.rotate (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;
         // 65c: bipush 7
         // 65e: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;
         // 661: astore 31
         // 663: aload 3
         // 664: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece
         // 667: dup
         // 668: aload 0
         // 669: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.structureTemplateManager Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
         // 66c: aload 29
         // 66e: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
         // 671: if_acmpne 679
         // 674: aload 21
         // 676: goto 67b
         // 679: aload 20
         // 67b: aload 31
         // 67d: aload 2
         // 67e: getstatic net/minecraft/world/level/block/Rotation.CLOCKWISE_90 Lnet/minecraft/world/level/block/Rotation;
         // 681: invokevirtual net/minecraft/world/level/block/Rotation.getRotated (Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/Rotation;
         // 684: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$WoodlandMansionPiece.<init> (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)V
         // 687: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 68c: pop
         // 68d: iload 27
         // 68f: ldc 65536
         // 691: if_icmpne 6a6
         // 694: aload 0
         // 695: aload 3
         // 696: aload 30
         // 698: aload 2
         // 699: aload 29
         // 69b: aload 13
         // 69d: iload 14
         // 69f: aaload
         // 6a0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.addRoom1x1 (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FloorRoomCollection;)V
         // 6a3: goto 75a
         // 6a6: iload 27
         // 6a8: ldc 131072
         // 6aa: if_icmpne 6ea
         // 6ad: aload 29
         // 6af: ifnull 6ea
         // 6b2: aload 4
         // 6b4: aload 17
         // 6b6: iload 24
         // 6b8: iload 23
         // 6ba: iload 14
         // 6bc: iload 28
         // 6be: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.get1x2RoomDirection (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IIII)Lnet/minecraft/core/Direction;
         // 6c1: astore 31
         // 6c3: iload 26
         // 6c5: ldc 4194304
         // 6c7: iand
         // 6c8: ldc 4194304
         // 6ca: if_icmpne 6d1
         // 6cd: bipush 1
         // 6ce: goto 6d2
         // 6d1: bipush 0
         // 6d2: istore 32
         // 6d4: aload 0
         // 6d5: aload 3
         // 6d6: aload 30
         // 6d8: aload 2
         // 6d9: aload 31
         // 6db: aload 29
         // 6dd: aload 13
         // 6df: iload 14
         // 6e1: aaload
         // 6e2: iload 32
         // 6e4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.addRoom1x2 (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FloorRoomCollection;Z)V
         // 6e7: goto 75a
         // 6ea: iload 27
         // 6ec: ldc 262144
         // 6ee: if_icmpne 73e
         // 6f1: aload 29
         // 6f3: ifnull 73e
         // 6f6: aload 29
         // 6f8: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
         // 6fb: if_acmpeq 73e
         // 6fe: aload 29
         // 700: invokevirtual net/minecraft/core/Direction.getClockWise ()Lnet/minecraft/core/Direction;
         // 703: astore 31
         // 705: aload 4
         // 707: aload 17
         // 709: iload 24
         // 70b: aload 31
         // 70d: invokevirtual net/minecraft/core/Direction.getStepX ()I
         // 710: iadd
         // 711: iload 23
         // 713: aload 31
         // 715: invokevirtual net/minecraft/core/Direction.getStepZ ()I
         // 718: iadd
         // 719: iload 14
         // 71b: iload 28
         // 71d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isRoomId (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IIII)Z
         // 720: ifne 72a
         // 723: aload 31
         // 725: invokevirtual net/minecraft/core/Direction.getOpposite ()Lnet/minecraft/core/Direction;
         // 728: astore 31
         // 72a: aload 0
         // 72b: aload 3
         // 72c: aload 30
         // 72e: aload 2
         // 72f: aload 31
         // 731: aload 29
         // 733: aload 13
         // 735: iload 14
         // 737: aaload
         // 738: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.addRoom2x2 (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FloorRoomCollection;)V
         // 73b: goto 75a
         // 73e: iload 27
         // 740: ldc 262144
         // 742: if_icmpne 75a
         // 745: aload 29
         // 747: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
         // 74a: if_acmpne 75a
         // 74d: aload 0
         // 74e: aload 3
         // 74f: aload 30
         // 751: aload 2
         // 752: aload 13
         // 754: iload 14
         // 756: aaload
         // 757: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionPiecePlacer.addRoom2x2Secret (Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$FloorRoomCollection;)V
         // 75a: iinc 24 1
         // 75d: goto 40c
         // 760: iinc 23 1
         // 763: goto 3ff
         // 766: iinc 14 1
         // 769: goto 1d1
         // 76c: return
      }

      private void traverseOuterWalls(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final WoodlandMansionPieces.PlacementData data,
         final WoodlandMansionPieces.SimpleGrid grid,
         Direction gridDirection,
         final int startX,
         final int startY,
         final int endX,
         final int endY
      ) {
         int gridX = startX;
         int gridY = startY;
         Direction startDirection = gridDirection;

         do {
            if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, gridX + gridDirection.getStepX(), gridY + gridDirection.getStepZ())) {
               this.traverseTurn(pieces, data);
               gridDirection = gridDirection.getClockWise();
               if (gridX != endX || gridY != endY || startDirection != gridDirection) {
                  this.traverseWallPiece(pieces, data);
               }
            } else if (WoodlandMansionPieces.MansionGrid.isHouse(grid, gridX + gridDirection.getStepX(), gridY + gridDirection.getStepZ())
               && WoodlandMansionPieces.MansionGrid.isHouse(
                  grid,
                  gridX + gridDirection.getStepX() + gridDirection.getCounterClockWise().getStepX(),
                  gridY + gridDirection.getStepZ() + gridDirection.getCounterClockWise().getStepZ()
               )) {
               this.traverseInnerTurn(pieces, data);
               gridX += gridDirection.getStepX();
               gridY += gridDirection.getStepZ();
               gridDirection = gridDirection.getCounterClockWise();
            } else {
               gridX += gridDirection.getStepX();
               gridY += gridDirection.getStepZ();
               if (gridX != endX || gridY != endY || startDirection != gridDirection) {
                  this.traverseWallPiece(pieces, data);
               }
            }
         } while (gridX != endX || gridY != endY || startDirection != gridDirection);
      }

      private void createRoof(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final BlockPos roofOrigin,
         final Rotation rotation,
         final WoodlandMansionPieces.SimpleGrid grid,
         final WoodlandMansionPieces.@Nullable SimpleGrid aboveGrid
      ) {
         for (int y = 0; y < grid.height; y++) {
            for (int x = 0; x < grid.width; x++) {
               BlockPos position = roofOrigin;
               position = position.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
               position = position.relative(rotation.rotate(Direction.EAST), (x - this.startX) * 8);
               boolean isAbove = aboveGrid != null && WoodlandMansionPieces.MansionGrid.isHouse(aboveGrid, x, y);
               if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y) && !isAbove) {
                  pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "roof", position.above(3), rotation));
                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 6);
                     pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "roof_front", p2, rotation));
                  }

                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 0);
                     p2 = p2.relative(rotation.rotate(Direction.SOUTH), 7);
                     pieces.add(
                        new WoodlandMansionPieces.WoodlandMansionPiece(
                           this.structureTemplateManager, "roof_front", p2, rotation.getRotated(Rotation.CLOCKWISE_180)
                        )
                     );
                  }

                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.WEST), 1);
                     pieces.add(
                        new WoodlandMansionPieces.WoodlandMansionPiece(
                           this.structureTemplateManager, "roof_front", p2, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
                        )
                     );
                  }

                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 6);
                     p2 = p2.relative(rotation.rotate(Direction.SOUTH), 6);
                     pieces.add(
                        new WoodlandMansionPieces.WoodlandMansionPiece(
                           this.structureTemplateManager, "roof_front", p2, rotation.getRotated(Rotation.CLOCKWISE_90)
                        )
                     );
                  }
               }
            }
         }

         if (aboveGrid != null) {
            for (int y = 0; y < grid.height; y++) {
               for (int x = 0; x < grid.width; x++) {
                  BlockPos position = roofOrigin;
                  position = position.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
                  position = position.relative(rotation.rotate(Direction.EAST), (x - this.startX) * 8);
                  boolean isAbove = WoodlandMansionPieces.MansionGrid.isHouse(aboveGrid, x, y);
                  if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y) && isAbove) {
                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y)) {
                        BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 7);
                        pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "small_wall", p2, rotation));
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y)) {
                        BlockPos p2 = position.relative(rotation.rotate(Direction.WEST), 1);
                        p2 = p2.relative(rotation.rotate(Direction.SOUTH), 6);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "small_wall", p2, rotation.getRotated(Rotation.CLOCKWISE_180)
                           )
                        );
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                        BlockPos p2 = position.relative(rotation.rotate(Direction.WEST), 0);
                        p2 = p2.relative(rotation.rotate(Direction.NORTH), 1);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "small_wall", p2, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
                           )
                        );
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                        BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 6);
                        p2 = p2.relative(rotation.rotate(Direction.SOUTH), 7);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "small_wall", p2, rotation.getRotated(Rotation.CLOCKWISE_90)
                           )
                        );
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y)) {
                        if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                           BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 7);
                           p2 = p2.relative(rotation.rotate(Direction.NORTH), 2);
                           pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "small_wall_corner", p2, rotation));
                        }

                        if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                           BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 8);
                           p2 = p2.relative(rotation.rotate(Direction.SOUTH), 7);
                           pieces.add(
                              new WoodlandMansionPieces.WoodlandMansionPiece(
                                 this.structureTemplateManager, "small_wall_corner", p2, rotation.getRotated(Rotation.CLOCKWISE_90)
                              )
                           );
                        }
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y)) {
                        if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                           BlockPos p2 = position.relative(rotation.rotate(Direction.WEST), 2);
                           p2 = p2.relative(rotation.rotate(Direction.NORTH), 1);
                           pieces.add(
                              new WoodlandMansionPieces.WoodlandMansionPiece(
                                 this.structureTemplateManager, "small_wall_corner", p2, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
                              )
                           );
                        }

                        if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                           BlockPos p2 = position.relative(rotation.rotate(Direction.WEST), 1);
                           p2 = p2.relative(rotation.rotate(Direction.SOUTH), 8);
                           pieces.add(
                              new WoodlandMansionPieces.WoodlandMansionPiece(
                                 this.structureTemplateManager, "small_wall_corner", p2, rotation.getRotated(Rotation.CLOCKWISE_180)
                              )
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int y = 0; y < grid.height; y++) {
            for (int x = 0; x < grid.width; x++) {
               BlockPos position = roofOrigin;
               position = position.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
               position = position.relative(rotation.rotate(Direction.EAST), (x - this.startX) * 8);
               boolean isAbove = aboveGrid != null && WoodlandMansionPieces.MansionGrid.isHouse(aboveGrid, x, y);
               if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y) && !isAbove) {
                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 6);
                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                        BlockPos p3 = p2.relative(rotation.rotate(Direction.SOUTH), 6);
                        pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "roof_corner", p3, rotation));
                     } else if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y + 1)) {
                        BlockPos p3 = p2.relative(rotation.rotate(Direction.SOUTH), 5);
                        pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "roof_inner_corner", p3, rotation));
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_corner", p2, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
                           )
                        );
                     } else if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x + 1, y - 1)) {
                        BlockPos p3 = position.relative(rotation.rotate(Direction.EAST), 9);
                        p3 = p3.relative(rotation.rotate(Direction.NORTH), 2);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_inner_corner", p3, rotation.getRotated(Rotation.CLOCKWISE_90)
                           )
                        );
                     }
                  }

                  if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y)) {
                     BlockPos p2 = position.relative(rotation.rotate(Direction.EAST), 0);
                     p2 = p2.relative(rotation.rotate(Direction.SOUTH), 0);
                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1)) {
                        BlockPos p3 = p2.relative(rotation.rotate(Direction.SOUTH), 6);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_corner", p3, rotation.getRotated(Rotation.CLOCKWISE_90)
                           )
                        );
                     } else if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y + 1)) {
                        BlockPos p3 = p2.relative(rotation.rotate(Direction.SOUTH), 8);
                        p3 = p3.relative(rotation.rotate(Direction.WEST), 3);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_inner_corner", p3, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
                           )
                        );
                     }

                     if (!WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y - 1)) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_corner", p2, rotation.getRotated(Rotation.CLOCKWISE_180)
                           )
                        );
                     } else if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y - 1)) {
                        BlockPos p3 = p2.relative(rotation.rotate(Direction.SOUTH), 1);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "roof_inner_corner", p3, rotation.getRotated(Rotation.CLOCKWISE_180)
                           )
                        );
                     }
                  }
               }
            }
         }
      }

      private void entrance(final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces, final WoodlandMansionPieces.PlacementData data) {
         Direction west = data.rotation.rotate(Direction.WEST);
         pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "entrance", data.position.relative(west, 9), data.rotation));
         data.position = data.position.relative(data.rotation.rotate(Direction.SOUTH), 16);
      }

      private void traverseWallPiece(final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces, final WoodlandMansionPieces.PlacementData data) {
         pieces.add(
            new WoodlandMansionPieces.WoodlandMansionPiece(
               this.structureTemplateManager, data.wallType, data.position.relative(data.rotation.rotate(Direction.EAST), 7), data.rotation
            )
         );
         data.position = data.position.relative(data.rotation.rotate(Direction.SOUTH), 8);
      }

      private void traverseTurn(final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces, final WoodlandMansionPieces.PlacementData data) {
         data.position = data.position.relative(data.rotation.rotate(Direction.SOUTH), -1);
         pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "wall_corner", data.position, data.rotation));
         data.position = data.position.relative(data.rotation.rotate(Direction.SOUTH), -7);
         data.position = data.position.relative(data.rotation.rotate(Direction.WEST), -6);
         data.rotation = data.rotation.getRotated(Rotation.CLOCKWISE_90);
      }

      private void traverseInnerTurn(final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces, final WoodlandMansionPieces.PlacementData data) {
         data.position = data.position.relative(data.rotation.rotate(Direction.SOUTH), 6);
         data.position = data.position.relative(data.rotation.rotate(Direction.EAST), 8);
         data.rotation = data.rotation.getRotated(Rotation.COUNTERCLOCKWISE_90);
      }

      private void addRoom1x1(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final BlockPos roomPos,
         final Rotation rotation,
         final Direction doorDir,
         final WoodlandMansionPieces.FloorRoomCollection rooms
      ) {
         Rotation pieceRot = Rotation.NONE;
         String roomType = rooms.get1x1(this.random);
         if (doorDir != Direction.EAST) {
            if (doorDir == Direction.NORTH) {
               pieceRot = pieceRot.getRotated(Rotation.COUNTERCLOCKWISE_90);
            } else if (doorDir == Direction.WEST) {
               pieceRot = pieceRot.getRotated(Rotation.CLOCKWISE_180);
            } else if (doorDir == Direction.SOUTH) {
               pieceRot = pieceRot.getRotated(Rotation.CLOCKWISE_90);
            } else {
               roomType = rooms.get1x1Secret(this.random);
            }
         }

         BlockPos orientation = StructureTemplate.getZeroPositionWithTransform(new BlockPos(1, 0, 0), Mirror.NONE, pieceRot, 7, 7);
         pieceRot = pieceRot.getRotated(rotation);
         orientation = orientation.rotate(rotation);
         BlockPos pos = roomPos.offset(orientation.getX(), 0, orientation.getZ());
         pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, roomType, pos, pieceRot));
      }

      private void addRoom1x2(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final BlockPos roomPos,
         final Rotation rotation,
         final Direction roomDir,
         final Direction doorDir,
         final WoodlandMansionPieces.FloorRoomCollection rooms,
         final boolean isStairsRoom
      ) {
         if (doorDir == Direction.EAST && roomDir == Direction.SOUTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation)
            );
         } else if (doorDir == Direction.EAST && roomDir == Direction.NORTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 6);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation, Mirror.LEFT_RIGHT
               )
            );
         } else if (doorDir == Direction.WEST && roomDir == Direction.NORTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 7);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 6);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.CLOCKWISE_180)
               )
            );
         } else if (doorDir == Direction.WEST && roomDir == Direction.SOUTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 7);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation, Mirror.FRONT_BACK
               )
            );
         } else if (doorDir == Direction.SOUTH && roomDir == Direction.EAST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager,
                  rooms.get1x2SideEntrance(this.random, isStairsRoom),
                  pos,
                  rotation.getRotated(Rotation.CLOCKWISE_90),
                  Mirror.LEFT_RIGHT
               )
            );
         } else if (doorDir == Direction.SOUTH && roomDir == Direction.WEST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 7);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.CLOCKWISE_90)
               )
            );
         } else if (doorDir == Direction.NORTH && roomDir == Direction.WEST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 7);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 6);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager,
                  rooms.get1x2SideEntrance(this.random, isStairsRoom),
                  pos,
                  rotation.getRotated(Rotation.CLOCKWISE_90),
                  Mirror.FRONT_BACK
               )
            );
         } else if (doorDir == Direction.NORTH && roomDir == Direction.EAST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 6);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2SideEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
               )
            );
         } else if (doorDir == Direction.SOUTH && roomDir == Direction.NORTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pos = pos.relative(rotation.rotate(Direction.NORTH), 8);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2FrontEntrance(this.random, isStairsRoom), pos, rotation
               )
            );
         } else if (doorDir == Direction.NORTH && roomDir == Direction.SOUTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 7);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 14);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2FrontEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.CLOCKWISE_180)
               )
            );
         } else if (doorDir == Direction.WEST && roomDir == Direction.EAST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 15);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2FrontEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.CLOCKWISE_90)
               )
            );
         } else if (doorDir == Direction.EAST && roomDir == Direction.WEST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.WEST), 7);
            pos = pos.relative(rotation.rotate(Direction.SOUTH), 6);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2FrontEntrance(this.random, isStairsRoom), pos, rotation.getRotated(Rotation.COUNTERCLOCKWISE_90)
               )
            );
         } else if (doorDir == Direction.UP && roomDir == Direction.EAST) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 15);
            pieces.add(
               new WoodlandMansionPieces.WoodlandMansionPiece(
                  this.structureTemplateManager, rooms.get1x2Secret(this.random), pos, rotation.getRotated(Rotation.CLOCKWISE_90)
               )
            );
         } else if (doorDir == Direction.UP && roomDir == Direction.SOUTH) {
            BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
            pos = pos.relative(rotation.rotate(Direction.NORTH), 0);
            pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, rooms.get1x2Secret(this.random), pos, rotation));
         }
      }

      private void addRoom2x2(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final BlockPos roomPos,
         final Rotation rotation,
         final Direction roomDir,
         final Direction doorDir,
         final WoodlandMansionPieces.FloorRoomCollection rooms
      ) {
         int east = 0;
         int south = 0;
         Rotation rot = rotation;
         Mirror mirror = Mirror.NONE;
         if (doorDir == Direction.EAST && roomDir == Direction.SOUTH) {
            east = -7;
         } else if (doorDir == Direction.EAST && roomDir == Direction.NORTH) {
            east = -7;
            south = 6;
            mirror = Mirror.LEFT_RIGHT;
         } else if (doorDir == Direction.NORTH && roomDir == Direction.EAST) {
            east = 1;
            south = 14;
            rot = rotation.getRotated(Rotation.COUNTERCLOCKWISE_90);
         } else if (doorDir == Direction.NORTH && roomDir == Direction.WEST) {
            east = 7;
            south = 14;
            rot = rotation.getRotated(Rotation.COUNTERCLOCKWISE_90);
            mirror = Mirror.LEFT_RIGHT;
         } else if (doorDir == Direction.SOUTH && roomDir == Direction.WEST) {
            east = 7;
            south = -8;
            rot = rotation.getRotated(Rotation.CLOCKWISE_90);
         } else if (doorDir == Direction.SOUTH && roomDir == Direction.EAST) {
            east = 1;
            south = -8;
            rot = rotation.getRotated(Rotation.CLOCKWISE_90);
            mirror = Mirror.LEFT_RIGHT;
         } else if (doorDir == Direction.WEST && roomDir == Direction.NORTH) {
            east = 15;
            south = 6;
            rot = rotation.getRotated(Rotation.CLOCKWISE_180);
         } else if (doorDir == Direction.WEST && roomDir == Direction.SOUTH) {
            east = 15;
            mirror = Mirror.FRONT_BACK;
         }

         BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), east);
         pos = pos.relative(rotation.rotate(Direction.SOUTH), south);
         pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, rooms.get2x2(this.random), pos, rot, mirror));
      }

      private void addRoom2x2Secret(
         final List<WoodlandMansionPieces.WoodlandMansionPiece> pieces,
         final BlockPos roomPos,
         final Rotation rotation,
         final WoodlandMansionPieces.FloorRoomCollection rooms
      ) {
         BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 1);
         pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, rooms.get2x2Secret(this.random), pos, rotation, Mirror.NONE));
      }
   }

   private static class PlacementData {
      public Rotation rotation;
      public BlockPos position;
      public String wallType;
   }

   private static class SecondFloorRoomCollection extends WoodlandMansionPieces.FloorRoomCollection {
      @Override
      public String get1x1(final RandomSource random) {
         return "1x1_b" + (random.nextInt(5) + 1);
      }

      @Override
      public String get1x1Secret(final RandomSource random) {
         return "1x1_as" + (random.nextInt(4) + 1);
      }

      @Override
      public String get1x2SideEntrance(final RandomSource random, final boolean isStairsRoom) {
         return isStairsRoom ? "1x2_c_stairs" : "1x2_c" + (random.nextInt(4) + 1);
      }

      @Override
      public String get1x2FrontEntrance(final RandomSource random, final boolean isStairsRoom) {
         return isStairsRoom ? "1x2_d_stairs" : "1x2_d" + (random.nextInt(5) + 1);
      }

      @Override
      public String get1x2Secret(final RandomSource random) {
         return "1x2_se" + (random.nextInt(1) + 1);
      }

      @Override
      public String get2x2(final RandomSource random) {
         return "2x2_b" + (random.nextInt(5) + 1);
      }

      @Override
      public String get2x2Secret(final RandomSource random) {
         return "2x2_s1";
      }
   }

   private static class SimpleGrid {
      private final int[][] grid;
      private final int width;
      private final int height;
      private final int valueIfOutside;

      public SimpleGrid(final int width, final int height, final int valueIfOutside) {
         this.width = width;
         this.height = height;
         this.valueIfOutside = valueIfOutside;
         this.grid = new int[width][height];
      }

      public void set(final int x, final int y, final int value) {
         if (x >= 0 && x < this.width && y >= 0 && y < this.height) {
            this.grid[x][y] = value;
         }
      }

      public void set(final int x0, final int y0, final int x1, final int y1, final int value) {
         for (int y = y0; y <= y1; y++) {
            for (int x = x0; x <= x1; x++) {
               this.set(x, y, value);
            }
         }
      }

      public int get(final int x, final int y) {
         return x >= 0 && x < this.width && y >= 0 && y < this.height ? this.grid[x][y] : this.valueIfOutside;
      }

      public void setif(final int x, final int y, final int ifValue, final int value) {
         if (this.get(x, y) == ifValue) {
            this.set(x, y, value);
         }
      }

      public boolean edgesTo(final int x, final int y, final int ifValue) {
         return this.get(x - 1, y) == ifValue || this.get(x + 1, y) == ifValue || this.get(x, y + 1) == ifValue || this.get(x, y - 1) == ifValue;
      }
   }

   private static class ThirdFloorRoomCollection extends WoodlandMansionPieces.SecondFloorRoomCollection {
   }

   public static class WoodlandMansionPiece extends TemplateStructurePiece {
      public WoodlandMansionPiece(
         final StructureTemplateManager structureTemplateManager, final String templateName, final BlockPos position, final Rotation rotation
      ) {
         this(structureTemplateManager, templateName, position, rotation, Mirror.NONE);
      }

      public WoodlandMansionPiece(
         final StructureTemplateManager structureTemplateManager,
         final String templateName,
         final BlockPos position,
         final Rotation rotation,
         final Mirror mirror
      ) {
         super(
            StructurePieceType.WOODLAND_MANSION_PIECE,
            0,
            structureTemplateManager,
            makeLocation(templateName),
            templateName,
            makeSettings(mirror, rotation),
            position
         );
      }

      public WoodlandMansionPiece(final StructureTemplateManager structureTemplateManager, final CompoundTag tag) {
         super(
            StructurePieceType.WOODLAND_MANSION_PIECE,
            tag,
            structureTemplateManager,
            location -> makeSettings(tag.<Mirror>read("Mi", Mirror.LEGACY_CODEC).orElseThrow(), tag.<Rotation>read("Rot", Rotation.LEGACY_CODEC).orElseThrow())
         );
      }

      @Override
      protected Identifier makeTemplateLocation() {
         return makeLocation(this.templateName);
      }

      private static Identifier makeLocation(final String templateName) {
         return Identifier.withDefaultNamespace("woodland_mansion/" + templateName);
      }

      private static StructurePlaceSettings makeSettings(final Mirror mirror, final Rotation rotation) {
         return new StructurePlaceSettings().setIgnoreEntities(true).setRotation(rotation).setMirror(mirror).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.store("Rot", Rotation.LEGACY_CODEC, this.placeSettings.getRotation());
         tag.store("Mi", Mirror.LEGACY_CODEC, this.placeSettings.getMirror());
      }

      @Override
      protected void handleDataMarker(
         final String markerId, final BlockPos position, final ServerLevelAccessor level, final RandomSource random, final BoundingBox chunkBB
      ) {
         if (markerId.startsWith("Chest")) {
            Rotation rot = this.placeSettings.getRotation();
            BlockState chestState = Blocks.CHEST.defaultBlockState();
            if ("ChestWest".equals(markerId)) {
               chestState = chestState.setValue(ChestBlock.FACING, rot.rotate(Direction.WEST));
            } else if ("ChestEast".equals(markerId)) {
               chestState = chestState.setValue(ChestBlock.FACING, rot.rotate(Direction.EAST));
            } else if ("ChestSouth".equals(markerId)) {
               chestState = chestState.setValue(ChestBlock.FACING, rot.rotate(Direction.SOUTH));
            } else if ("ChestNorth".equals(markerId)) {
               chestState = chestState.setValue(ChestBlock.FACING, rot.rotate(Direction.NORTH));
            }

            this.createChest(level, chunkBB, random, position, BuiltInLootTables.WOODLAND_MANSION, chestState);
         } else {
            List<Mob> mobs = new ArrayList<>();
            switch (markerId) {
               case "Mage":
                  mobs.add(EntityTypes.EVOKER.create(level.getLevel(), EntitySpawnReason.STRUCTURE));
                  break;
               case "Warrior":
                  mobs.add(EntityTypes.VINDICATOR.create(level.getLevel(), EntitySpawnReason.STRUCTURE));
                  break;
               case "Group of Allays":
                  int numberOfAllays = level.getRandom().nextInt(3) + 1;

                  for (int i = 0; i < numberOfAllays; i++) {
                     mobs.add(EntityTypes.ALLAY.create(level.getLevel(), EntitySpawnReason.STRUCTURE));
                  }
                  break;
               default:
                  return;
            }

            for (Mob mob : mobs) {
               if (mob != null) {
                  mob.setPersistenceRequired();
                  mob.snapTo(position, 0.0F, 0.0F);
                  mob.finalizeSpawn(level, level.getCurrentDifficultyAt(mob.blockPosition()), EntitySpawnReason.STRUCTURE, null);
                  level.addFreshEntityWithPassengers(mob);
                  level.setBlock(position, Blocks.AIR.defaultBlockState(), 2);
               }
            }
         }
      }
   }
}
