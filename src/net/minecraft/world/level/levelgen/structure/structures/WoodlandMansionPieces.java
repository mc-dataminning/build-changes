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
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.OutOfMemoryError: Java heap space
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateChildExprent(StackVarsProcessor.java:760)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateChildExprent(StackVarsProcessor.java:763)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateExprent(StackVarsProcessor.java:321)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateStatements(StackVarsProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:74)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
         //
         // Bytecode:
         // 000: new java/util/ArrayList
         // 003: dup
         // 004: invokespecial java/util/ArrayList.<init> ()V
         // 007: astore 1
         // 008: aload 0
         // 009: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.floorRooms [Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 00c: bipush 1
         // 00d: aaload
         // 00e: astore 2
         // 00f: bipush 0
         // 010: istore 3
         // 011: iload 3
         // 012: aload 0
         // 013: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 016: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 019: if_icmpge 069
         // 01c: bipush 0
         // 01d: istore 4
         // 01f: iload 4
         // 021: aload 0
         // 022: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 025: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 028: if_icmpge 063
         // 02b: aload 2
         // 02c: iload 4
         // 02e: iload 3
         // 02f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 032: istore 5
         // 034: iload 5
         // 036: ldc 983040
         // 038: iand
         // 039: istore 6
         // 03b: iload 6
         // 03d: ldc 131072
         // 03f: if_icmpne 05d
         // 042: iload 5
         // 044: ldc 2097152
         // 046: iand
         // 047: ldc 2097152
         // 049: if_icmpne 05d
         // 04c: aload 1
         // 04d: new net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos
         // 050: dup
         // 051: iload 4
         // 053: iload 3
         // 054: invokespecial net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.<init> (II)V
         // 057: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 05c: pop
         // 05d: iinc 4 1
         // 060: goto 01f
         // 063: iinc 3 1
         // 066: goto 011
         // 069: aload 1
         // 06a: invokeinterface java/util/List.isEmpty ()Z 1
         // 06f: ifeq 08b
         // 072: aload 0
         // 073: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 076: bipush 0
         // 077: bipush 0
         // 078: aload 0
         // 079: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 07c: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 07f: aload 0
         // 080: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 083: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 086: bipush 5
         // 087: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (IIIII)V
         // 08a: return
         // 08b: aload 1
         // 08c: aload 0
         // 08d: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.random Lnet/minecraft/util/RandomSource;
         // 090: aload 1
         // 091: invokeinterface java/util/List.size ()I 1
         // 096: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 09b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 0a0: checkcast net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos
         // 0a3: astore 3
         // 0a4: aload 2
         // 0a5: aload 3
         // 0a6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 0a9: aload 3
         // 0aa: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 0ad: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 0b0: istore 4
         // 0b2: aload 2
         // 0b3: aload 3
         // 0b4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 0b7: aload 3
         // 0b8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 0bb: iload 4
         // 0bd: ldc 4194304
         // 0bf: ior
         // 0c0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 0c3: aload 0
         // 0c4: aload 0
         // 0c5: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.baseGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 0c8: aload 3
         // 0c9: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 0cc: aload 3
         // 0cd: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 0d0: bipush 1
         // 0d1: iload 4
         // 0d3: ldc 65535
         // 0d5: iand
         // 0d6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.get1x2RoomDirection (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IIII)Lnet/minecraft/core/Direction;
         // 0d9: astore 5
         // 0db: aload 3
         // 0dc: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 0df: aload 5
         // 0e1: invokevirtual net/minecraft/core/Direction.getStepX ()I
         // 0e4: iadd
         // 0e5: istore 6
         // 0e7: aload 3
         // 0e8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 0eb: aload 5
         // 0ed: invokevirtual net/minecraft/core/Direction.getStepZ ()I
         // 0f0: iadd
         // 0f1: istore 7
         // 0f3: bipush 0
         // 0f4: istore 8
         // 0f6: iload 8
         // 0f8: aload 0
         // 0f9: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 0fc: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 0ff: if_icmpge 184
         // 102: bipush 0
         // 103: istore 9
         // 105: iload 9
         // 107: aload 0
         // 108: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 10b: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 10e: if_icmpge 17e
         // 111: aload 0
         // 112: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.baseGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 115: iload 9
         // 117: iload 8
         // 119: invokestatic net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.isHouse (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;II)Z
         // 11c: ifne 12e
         // 11f: aload 0
         // 120: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 123: iload 9
         // 125: iload 8
         // 127: bipush 5
         // 128: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 12b: goto 178
         // 12e: iload 9
         // 130: aload 3
         // 131: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 134: if_icmpne 14f
         // 137: iload 8
         // 139: aload 3
         // 13a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 13d: if_icmpne 14f
         // 140: aload 0
         // 141: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 144: iload 9
         // 146: iload 8
         // 148: bipush 3
         // 149: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 14c: goto 178
         // 14f: iload 9
         // 151: iload 6
         // 153: if_icmpne 178
         // 156: iload 8
         // 158: iload 7
         // 15a: if_icmpne 178
         // 15d: aload 0
         // 15e: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 161: iload 9
         // 163: iload 8
         // 165: bipush 3
         // 166: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 169: aload 0
         // 16a: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.floorRooms [Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 16d: bipush 2
         // 16e: aaload
         // 16f: iload 9
         // 171: iload 8
         // 173: ldc 8388608
         // 175: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 178: iinc 9 1
         // 17b: goto 105
         // 17e: iinc 8 1
         // 181: goto 0f6
         // 184: new java/util/ArrayList
         // 187: dup
         // 188: invokespecial java/util/ArrayList.<init> ()V
         // 18b: astore 8
         // 18d: getstatic net/minecraft/core/Direction$Plane.HORIZONTAL Lnet/minecraft/core/Direction$Plane;
         // 190: invokevirtual net/minecraft/core/Direction$Plane.iterator ()Ljava/util/Iterator;
         // 193: astore 9
         // 195: aload 9
         // 197: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 19c: ifeq 1d2
         // 19f: aload 9
         // 1a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 1a6: checkcast net/minecraft/core/Direction
         // 1a9: astore 10
         // 1ab: aload 0
         // 1ac: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 1af: iload 6
         // 1b1: aload 10
         // 1b3: invokevirtual net/minecraft/core/Direction.getStepX ()I
         // 1b6: iadd
         // 1b7: iload 7
         // 1b9: aload 10
         // 1bb: invokevirtual net/minecraft/core/Direction.getStepZ ()I
         // 1be: iadd
         // 1bf: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.get (II)I
         // 1c2: ifne 1cf
         // 1c5: aload 8
         // 1c7: aload 10
         // 1c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
         // 1ce: pop
         // 1cf: goto 195
         // 1d2: aload 8
         // 1d4: invokeinterface java/util/List.isEmpty ()Z 1
         // 1d9: ifeq 203
         // 1dc: aload 0
         // 1dd: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 1e0: bipush 0
         // 1e1: bipush 0
         // 1e2: aload 0
         // 1e3: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 1e6: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.width I
         // 1e9: aload 0
         // 1ea: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 1ed: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.height I
         // 1f0: bipush 5
         // 1f1: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (IIIII)V
         // 1f4: aload 2
         // 1f5: aload 3
         // 1f6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.x ()I
         // 1f9: aload 3
         // 1fa: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid$GridPos.y ()I
         // 1fd: iload 4
         // 1ff: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid.set (III)V
         // 202: return
         // 203: aload 8
         // 205: aload 0
         // 206: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.random Lnet/minecraft/util/RandomSource;
         // 209: aload 8
         // 20b: invokeinterface java/util/List.size ()I 1
         // 210: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 215: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 21a: checkcast net/minecraft/core/Direction
         // 21d: astore 9
         // 21f: aload 0
         // 220: aload 0
         // 221: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 224: iload 6
         // 226: aload 9
         // 228: invokevirtual net/minecraft/core/Direction.getStepX ()I
         // 22b: iadd
         // 22c: iload 7
         // 22e: aload 9
         // 230: invokevirtual net/minecraft/core/Direction.getStepZ ()I
         // 233: iadd
         // 234: aload 9
         // 236: bipush 4
         // 237: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.recursiveCorridor (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/core/Direction;I)V
         // 23a: aload 0
         // 23b: aload 0
         // 23c: getfield net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.thirdFloorGrid Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;
         // 23f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$MansionGrid.cleanEdges (Lnet/minecraft/world/level/levelgen/structure/structures/WoodlandMansionPieces$SimpleGrid;)Z
         // 242: ifeq 248
         // 245: goto 23a
         // 248: return
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
         WoodlandMansionPieces.PlacementData data = new WoodlandMansionPieces.PlacementData();
         data.position = origin;
         data.rotation = rotation;
         data.wallType = "wall_flat";
         WoodlandMansionPieces.PlacementData secondData = new WoodlandMansionPieces.PlacementData();
         this.entrance(pieces, data);
         secondData.position = data.position.above(8);
         secondData.rotation = data.rotation;
         secondData.wallType = "wall_window";
         if (!pieces.isEmpty()) {
         }

         WoodlandMansionPieces.SimpleGrid baseGrid = mansion.baseGrid;
         WoodlandMansionPieces.SimpleGrid thirdGrid = mansion.thirdFloorGrid;
         this.startX = mansion.entranceX + 1;
         this.startY = mansion.entranceY + 1;
         int endX = mansion.entranceX + 1;
         int endY = mansion.entranceY;
         this.traverseOuterWalls(pieces, data, baseGrid, Direction.SOUTH, this.startX, this.startY, endX, endY);
         this.traverseOuterWalls(pieces, secondData, baseGrid, Direction.SOUTH, this.startX, this.startY, endX, endY);
         WoodlandMansionPieces.PlacementData thirdData = new WoodlandMansionPieces.PlacementData();
         thirdData.position = data.position.above(19);
         thirdData.rotation = data.rotation;
         thirdData.wallType = "wall_window";
         boolean done = false;

         for (int y = 0; y < thirdGrid.height && !done; y++) {
            for (int x = thirdGrid.width - 1; x >= 0 && !done; x--) {
               if (WoodlandMansionPieces.MansionGrid.isHouse(thirdGrid, x, y)) {
                  thirdData.position = thirdData.position.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
                  thirdData.position = thirdData.position.relative(rotation.rotate(Direction.EAST), (x - this.startX) * 8);
                  this.traverseWallPiece(pieces, thirdData);
                  this.traverseOuterWalls(pieces, thirdData, thirdGrid, Direction.SOUTH, x, y, x, y);
                  done = true;
               }
            }
         }

         this.createRoof(pieces, origin.above(16), rotation, baseGrid, thirdGrid);
         this.createRoof(pieces, origin.above(27), rotation, thirdGrid, null);
         if (!pieces.isEmpty()) {
         }

         WoodlandMansionPieces.FloorRoomCollection[] roomCollections = new WoodlandMansionPieces.FloorRoomCollection[]{
            new WoodlandMansionPieces.FirstFloorRoomCollection(),
            new WoodlandMansionPieces.SecondFloorRoomCollection(),
            new WoodlandMansionPieces.ThirdFloorRoomCollection()
         };

         for (int floorNum = 0; floorNum < 3; floorNum++) {
            BlockPos floorOrigin = origin.above(8 * floorNum + (floorNum == 2 ? 3 : 0));
            WoodlandMansionPieces.SimpleGrid rooms = mansion.floorRooms[floorNum];
            WoodlandMansionPieces.SimpleGrid grid = floorNum == 2 ? thirdGrid : baseGrid;
            String southPiece = floorNum == 0 ? "carpet_south_1" : "carpet_south_2";
            String westPiece = floorNum == 0 ? "carpet_west_1" : "carpet_west_2";

            for (int y = 0; y < grid.height; y++) {
               for (int x = 0; x < grid.width; x++) {
                  if (grid.get(x, y) == 1) {
                     BlockPos pos = floorOrigin.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
                     pos = pos.relative(rotation.rotate(Direction.EAST), (x - this.startX) * 8);
                     pieces.add(new WoodlandMansionPieces.WoodlandMansionPiece(this.structureTemplateManager, "corridor_floor", pos, rotation));
                     if (grid.get(x, y - 1) == 1 || (rooms.get(x, y - 1) & 8388608) == 8388608) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, "carpet_north", pos.relative(rotation.rotate(Direction.EAST), 1).above(), rotation
                           )
                        );
                     }

                     if (grid.get(x + 1, y) == 1 || (rooms.get(x + 1, y) & 8388608) == 8388608) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager,
                              "carpet_east",
                              pos.relative(rotation.rotate(Direction.SOUTH), 1).relative(rotation.rotate(Direction.EAST), 5).above(),
                              rotation
                           )
                        );
                     }

                     if (grid.get(x, y + 1) == 1 || (rooms.get(x, y + 1) & 8388608) == 8388608) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager,
                              southPiece,
                              pos.relative(rotation.rotate(Direction.SOUTH), 5).relative(rotation.rotate(Direction.WEST), 1),
                              rotation
                           )
                        );
                     }

                     if (grid.get(x - 1, y) == 1 || (rooms.get(x - 1, y) & 8388608) == 8388608) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager,
                              westPiece,
                              pos.relative(rotation.rotate(Direction.WEST), 1).relative(rotation.rotate(Direction.NORTH), 1),
                              rotation
                           )
                        );
                     }
                  }
               }
            }

            String wallPiece = floorNum == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String doorPiece = floorNum == 0 ? "indoors_door_1" : "indoors_door_2";
            List<Direction> doorDirs = new ArrayList<>();

            for (int y = 0; y < grid.height; y++) {
               for (int x = 0; x < grid.width; x++) {
                  boolean thirdFloorStartRoom = floorNum == 2 && grid.get(x, y) == 3;
                  if (grid.get(x, y) == 2 || thirdFloorStartRoom) {
                     int roomData = rooms.get(x, y);
                     int roomType = roomData & 983040;
                     int roomId = roomData & 65535;
                     thirdFloorStartRoom = thirdFloorStartRoom && (roomData & 8388608) == 8388608;
                     doorDirs.clear();
                     if ((roomData & 2097152) == 2097152) {
                        for (Direction direction : Direction.Plane.HORIZONTAL) {
                           if (grid.get(x + direction.getStepX(), y + direction.getStepZ()) == 1) {
                              doorDirs.add(direction);
                           }
                        }
                     }

                     Direction doorDir = null;
                     if (!doorDirs.isEmpty()) {
                        doorDir = doorDirs.get(this.random.nextInt(doorDirs.size()));
                     } else if ((roomData & 1048576) == 1048576) {
                        doorDir = Direction.UP;
                     }

                     BlockPos roomPos = floorOrigin.relative(rotation.rotate(Direction.SOUTH), 8 + (y - this.startY) * 8);
                     roomPos = roomPos.relative(rotation.rotate(Direction.EAST), -1 + (x - this.startX) * 8);
                     if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x - 1, y) && !mansion.isRoomId(grid, x - 1, y, floorNum, roomId)) {
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, doorDir == Direction.WEST ? doorPiece : wallPiece, roomPos, rotation
                           )
                        );
                     }

                     if (grid.get(x + 1, y) == 1 && !thirdFloorStartRoom) {
                        BlockPos pos = roomPos.relative(rotation.rotate(Direction.EAST), 8);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager, doorDir == Direction.EAST ? doorPiece : wallPiece, pos, rotation
                           )
                        );
                     }

                     if (WoodlandMansionPieces.MansionGrid.isHouse(grid, x, y + 1) && !mansion.isRoomId(grid, x, y + 1, floorNum, roomId)) {
                        BlockPos pos = roomPos.relative(rotation.rotate(Direction.SOUTH), 7);
                        pos = pos.relative(rotation.rotate(Direction.EAST), 7);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager,
                              doorDir == Direction.SOUTH ? doorPiece : wallPiece,
                              pos,
                              rotation.getRotated(Rotation.CLOCKWISE_90)
                           )
                        );
                     }

                     if (grid.get(x, y - 1) == 1 && !thirdFloorStartRoom) {
                        BlockPos pos = roomPos.relative(rotation.rotate(Direction.NORTH), 1);
                        pos = pos.relative(rotation.rotate(Direction.EAST), 7);
                        pieces.add(
                           new WoodlandMansionPieces.WoodlandMansionPiece(
                              this.structureTemplateManager,
                              doorDir == Direction.NORTH ? doorPiece : wallPiece,
                              pos,
                              rotation.getRotated(Rotation.CLOCKWISE_90)
                           )
                        );
                     }

                     if (roomType == 65536) {
                        this.addRoom1x1(pieces, roomPos, rotation, doorDir, roomCollections[floorNum]);
                     } else if (roomType == 131072 && doorDir != null) {
                        Direction roomDir = mansion.get1x2RoomDirection(grid, x, y, floorNum, roomId);
                        boolean isStairsRoom = (roomData & 4194304) == 4194304;
                        this.addRoom1x2(pieces, roomPos, rotation, roomDir, doorDir, roomCollections[floorNum], isStairsRoom);
                     } else if (roomType == 262144 && doorDir != null && doorDir != Direction.UP) {
                        Direction roomDir = doorDir.getClockWise();
                        if (!mansion.isRoomId(grid, x + roomDir.getStepX(), y + roomDir.getStepZ(), floorNum, roomId)) {
                           roomDir = roomDir.getOpposite();
                        }

                        this.addRoom2x2(pieces, roomPos, rotation, roomDir, doorDir, roomCollections[floorNum]);
                     } else if (roomType == 262144 && doorDir == Direction.UP) {
                        this.addRoom2x2Secret(pieces, roomPos, rotation, roomCollections[floorNum]);
                     }
                  }
               }
            }
         }
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
