package net.minecraft.world.level.levelgen.structure.structures;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.RandomizableContainer;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;

public class EndCityPieces {
   private static final int MAX_GEN_DEPTH = 8;
   private static final EndCityPieces.SectionGenerator HOUSE_TOWER_GENERATOR = new EndCityPieces.SectionGenerator() {
      @Override
      public void init() {
      }

      @Override
      public boolean generate(
         final StructureTemplateManager structureTemplateManager,
         final int genDepth,
         final EndCityPieces.EndCityPiece parent,
         final BlockPos offset,
         final List<StructurePiece> pieces,
         final RandomSource random
      ) {
         if (genDepth > 8) {
            return false;
         }

         Rotation rotation = parent.placeSettings().getRotation();
         EndCityPieces.EndCityPiece lastPiece = EndCityPieces.addHelper(
            pieces, EndCityPieces.addPiece(structureTemplateManager, parent, offset, "base_floor", rotation, true)
         );
         int numFloors = random.nextInt(3);
         if (numFloors == 0) {
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 4, -1), "base_roof", rotation, true)
            );
         } else if (numFloors == 1) {
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 0, -1), "second_floor_2", rotation, false)
            );
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 8, -1), "second_roof", rotation, false)
            );
            EndCityPieces.recursiveChildren(structureTemplateManager, EndCityPieces.TOWER_GENERATOR, genDepth + 1, lastPiece, null, pieces, random);
         } else if (numFloors == 2) {
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 0, -1), "second_floor_2", rotation, false)
            );
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 4, -1), "third_floor_2", rotation, false)
            );
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 8, -1), "third_roof", rotation, true)
            );
            EndCityPieces.recursiveChildren(structureTemplateManager, EndCityPieces.TOWER_GENERATOR, genDepth + 1, lastPiece, null, pieces, random);
         }

         return true;
      }
   };
   private static final List<Pair<Rotation, BlockPos>> TOWER_BRIDGES = List.of(
      Pair.of(Rotation.NONE, new BlockPos(1, -1, 0)),
      Pair.of(Rotation.CLOCKWISE_90, new BlockPos(6, -1, 1)),
      Pair.of(Rotation.COUNTERCLOCKWISE_90, new BlockPos(0, -1, 5)),
      Pair.of(Rotation.CLOCKWISE_180, new BlockPos(5, -1, 6))
   );
   private static final EndCityPieces.SectionGenerator TOWER_GENERATOR = new EndCityPieces.SectionGenerator() {
      @Override
      public void init() {
      }

      @Override
      public boolean generate(
         final StructureTemplateManager structureTemplateManager,
         final int genDepth,
         final EndCityPieces.EndCityPiece parent,
         final BlockPos offset,
         final List<StructurePiece> pieces,
         final RandomSource random
      ) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         //
         // Bytecode:
         // 000: aload 3
         // 001: invokevirtual net/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece.placeSettings ()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;
         // 004: invokevirtual net/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings.getRotation ()Lnet/minecraft/world/level/block/Rotation;
         // 007: astore 7
         // 009: aload 3
         // 00a: astore 8
         // 00c: aload 5
         // 00e: aload 1
         // 00f: aload 8
         // 011: new net/minecraft/core/BlockPos
         // 014: dup
         // 015: bipush 3
         // 016: aload 6
         // 018: bipush 2
         // 019: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 01e: iadd
         // 01f: bipush -3
         // 021: bipush 3
         // 022: aload 6
         // 024: bipush 2
         // 025: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 02a: iadd
         // 02b: invokespecial net/minecraft/core/BlockPos.<init> (III)V
         // 02e: ldc "tower_base"
         // 030: aload 7
         // 032: bipush 1
         // 033: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 036: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 039: astore 8
         // 03b: aload 5
         // 03d: aload 1
         // 03e: aload 8
         // 040: new net/minecraft/core/BlockPos
         // 043: dup
         // 044: bipush 0
         // 045: bipush 7
         // 047: bipush 0
         // 048: invokespecial net/minecraft/core/BlockPos.<init> (III)V
         // 04b: ldc "tower_piece"
         // 04d: aload 7
         // 04f: bipush 1
         // 050: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 053: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 056: astore 8
         // 058: aload 6
         // 05a: bipush 3
         // 05b: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 060: ifne 068
         // 063: aload 8
         // 065: goto 069
         // 068: aconst_null
         // 069: astore 9
         // 06b: bipush 1
         // 06c: aload 6
         // 06e: bipush 3
         // 06f: invokeinterface net/minecraft/util/RandomSource.nextInt (I)I 2
         // 074: iadd
         // 075: istore 10
         // 077: bipush 0
         // 078: istore 11
         // 07a: iload 11
         // 07c: iload 10
         // 07e: if_icmpge 0ba
         // 081: aload 5
         // 083: aload 1
         // 084: aload 8
         // 086: new net/minecraft/core/BlockPos
         // 089: dup
         // 08a: bipush 0
         // 08b: bipush 4
         // 08c: bipush 0
         // 08d: invokespecial net/minecraft/core/BlockPos.<init> (III)V
         // 090: ldc "tower_piece"
         // 092: aload 7
         // 094: bipush 1
         // 095: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 098: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 09b: astore 8
         // 09d: iload 11
         // 09f: iload 10
         // 0a1: bipush 1
         // 0a2: isub
         // 0a3: if_icmpge 0b4
         // 0a6: aload 6
         // 0a8: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
         // 0ad: ifeq 0b4
         // 0b0: aload 8
         // 0b2: astore 9
         // 0b4: iinc 11 1
         // 0b7: goto 07a
         // 0ba: aload 9
         // 0bc: ifnull 142
         // 0bf: getstatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.TOWER_BRIDGES Ljava/util/List;
         // 0c2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
         // 0c7: astore 11
         // 0c9: aload 11
         // 0cb: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 0d0: ifeq 123
         // 0d3: aload 11
         // 0d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 0da: checkcast com/mojang/datafixers/util/Pair
         // 0dd: astore 12
         // 0df: aload 6
         // 0e1: invokeinterface net/minecraft/util/RandomSource.nextBoolean ()Z 1
         // 0e6: ifeq 120
         // 0e9: aload 5
         // 0eb: aload 1
         // 0ec: aload 9
         // 0ee: aload 12
         // 0f0: invokevirtual com/mojang/datafixers/util/Pair.getSecond ()Ljava/lang/Object;
         // 0f3: checkcast net/minecraft/core/BlockPos
         // 0f6: ldc "bridge_end"
         // 0f8: aload 7
         // 0fa: aload 12
         // 0fc: invokevirtual com/mojang/datafixers/util/Pair.getFirst ()Ljava/lang/Object;
         // 0ff: checkcast net/minecraft/world/level/block/Rotation
         // 102: invokevirtual net/minecraft/world/level/block/Rotation.getRotated (Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/Rotation;
         // 105: bipush 1
         // 106: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 109: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 10c: astore 13
         // 10e: aload 1
         // 10f: getstatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.TOWER_BRIDGE_GENERATOR Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$SectionGenerator;
         // 112: iload 2
         // 113: bipush 1
         // 114: iadd
         // 115: aload 13
         // 117: aconst_null
         // 118: aload 5
         // 11a: aload 6
         // 11c: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.recursiveChildren (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$SectionGenerator;ILnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/util/List;Lnet/minecraft/util/RandomSource;)Z
         // 11f: pop
         // 120: goto 0c9
         // 123: aload 5
         // 125: aload 1
         // 126: aload 8
         // 128: new net/minecraft/core/BlockPos
         // 12b: dup
         // 12c: bipush -1
         // 12d: bipush 4
         // 12e: bipush -1
         // 12f: invokespecial net/minecraft/core/BlockPos.<init> (III)V
         // 132: ldc "tower_top"
         // 134: aload 7
         // 136: bipush 1
         // 137: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 13a: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 13d: astore 8
         // 13f: goto 179
         // 142: iload 2
         // 143: bipush 7
         // 145: if_icmpne 167
         // 148: aload 5
         // 14a: aload 1
         // 14b: aload 8
         // 14d: new net/minecraft/core/BlockPos
         // 150: dup
         // 151: bipush -1
         // 152: bipush 4
         // 153: bipush -1
         // 154: invokespecial net/minecraft/core/BlockPos.<init> (III)V
         // 157: ldc "tower_top"
         // 159: aload 7
         // 15b: bipush 1
         // 15c: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addPiece (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/lang/String;Lnet/minecraft/world/level/block/Rotation;Z)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 15f: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.addHelper (Ljava/util/List;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;)Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;
         // 162: astore 8
         // 164: goto 179
         // 167: aload 1
         // 168: getstatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.FAT_TOWER_GENERATOR Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$SectionGenerator;
         // 16b: iload 2
         // 16c: bipush 1
         // 16d: iadd
         // 16e: aload 8
         // 170: aconst_null
         // 171: aload 5
         // 173: aload 6
         // 175: invokestatic net/minecraft/world/level/levelgen/structure/structures/EndCityPieces.recursiveChildren (Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$SectionGenerator;ILnet/minecraft/world/level/levelgen/structure/structures/EndCityPieces$EndCityPiece;Lnet/minecraft/core/BlockPos;Ljava/util/List;Lnet/minecraft/util/RandomSource;)Z
         // 178: ireturn
         // 179: bipush 1
         // 17a: ireturn
      }
   };
   private static final EndCityPieces.SectionGenerator TOWER_BRIDGE_GENERATOR = new EndCityPieces.SectionGenerator() {
      public boolean shipCreated;

      @Override
      public void init() {
         this.shipCreated = false;
      }

      @Override
      public boolean generate(
         final StructureTemplateManager structureTemplateManager,
         final int genDepth,
         final EndCityPieces.EndCityPiece parent,
         final BlockPos offset,
         final List<StructurePiece> pieces,
         final RandomSource random
      ) {
         Rotation rotation = parent.placeSettings().getRotation();
         int bridgeLength = random.nextInt(4) + 1;
         EndCityPieces.EndCityPiece lastPiece = EndCityPieces.addHelper(
            pieces, EndCityPieces.addPiece(structureTemplateManager, parent, new BlockPos(0, 0, -4), "bridge_piece", rotation, true)
         );
         lastPiece.setGenDepth(-1);
         int nextY = 0;

         for (int i = 0; i < bridgeLength; i++) {
            if (random.nextBoolean()) {
               lastPiece = EndCityPieces.addHelper(
                  pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(0, nextY, -4), "bridge_piece", rotation, true)
               );
               nextY = 0;
            } else {
               if (random.nextBoolean()) {
                  lastPiece = EndCityPieces.addHelper(
                     pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(0, nextY, -4), "bridge_steep_stairs", rotation, true)
                  );
               } else {
                  lastPiece = EndCityPieces.addHelper(
                     pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(0, nextY, -8), "bridge_gentle_stairs", rotation, true)
                  );
               }

               nextY = 4;
            }
         }

         if (!this.shipCreated && random.nextInt(10 - genDepth) == 0) {
            EndCityPieces.addHelper(
               pieces,
               EndCityPieces.addPiece(
                  structureTemplateManager, lastPiece, new BlockPos(-8 + random.nextInt(8), nextY, -70 + random.nextInt(10)), "ship", rotation, true
               )
            );
            this.shipCreated = true;
         } else if (!EndCityPieces.recursiveChildren(
            structureTemplateManager, EndCityPieces.HOUSE_TOWER_GENERATOR, genDepth + 1, lastPiece, new BlockPos(-3, nextY + 1, -11), pieces, random
         )) {
            return false;
         }

         lastPiece = EndCityPieces.addHelper(
            pieces,
            EndCityPieces.addPiece(
               structureTemplateManager, lastPiece, new BlockPos(4, nextY, 0), "bridge_end", rotation.getRotated(Rotation.CLOCKWISE_180), true
            )
         );
         lastPiece.setGenDepth(-1);
         return true;
      }
   };
   private static final List<Pair<Rotation, BlockPos>> FAT_TOWER_BRIDGES = List.of(
      Pair.of(Rotation.NONE, new BlockPos(4, -1, 0)),
      Pair.of(Rotation.CLOCKWISE_90, new BlockPos(12, -1, 4)),
      Pair.of(Rotation.COUNTERCLOCKWISE_90, new BlockPos(0, -1, 8)),
      Pair.of(Rotation.CLOCKWISE_180, new BlockPos(8, -1, 12))
   );
   private static final EndCityPieces.SectionGenerator FAT_TOWER_GENERATOR = new EndCityPieces.SectionGenerator() {
      @Override
      public void init() {
      }

      @Override
      public boolean generate(
         final StructureTemplateManager structureTemplateManager,
         final int genDepth,
         final EndCityPieces.EndCityPiece parent,
         final BlockPos offset,
         final List<StructurePiece> pieces,
         final RandomSource random
      ) {
         Rotation rotation = parent.placeSettings().getRotation();
         EndCityPieces.EndCityPiece lastPiece = EndCityPieces.addHelper(
            pieces, EndCityPieces.addPiece(structureTemplateManager, parent, new BlockPos(-3, 4, -3), "fat_tower_base", rotation, true)
         );
         lastPiece = EndCityPieces.addHelper(
            pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(0, 4, 0), "fat_tower_middle", rotation, true)
         );

         for (int i = 0; i < 2 && random.nextInt(3) != 0; i++) {
            lastPiece = EndCityPieces.addHelper(
               pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(0, 8, 0), "fat_tower_middle", rotation, true)
            );

            for (Pair<Rotation, BlockPos> bridge : EndCityPieces.FAT_TOWER_BRIDGES) {
               if (random.nextBoolean()) {
                  EndCityPieces.EndCityPiece bridgeStart = EndCityPieces.addHelper(
                     pieces,
                     EndCityPieces.addPiece(
                        structureTemplateManager, lastPiece, (BlockPos)bridge.getSecond(), "bridge_end", rotation.getRotated((Rotation)bridge.getFirst()), true
                     )
                  );
                  EndCityPieces.recursiveChildren(
                     structureTemplateManager, EndCityPieces.TOWER_BRIDGE_GENERATOR, genDepth + 1, bridgeStart, null, pieces, random
                  );
               }
            }
         }

         lastPiece = EndCityPieces.addHelper(
            pieces, EndCityPieces.addPiece(structureTemplateManager, lastPiece, new BlockPos(-2, 8, -2), "fat_tower_top", rotation, true)
         );
         return true;
      }
   };

   private static EndCityPieces.EndCityPiece addPiece(
      final StructureTemplateManager structureTemplateManager,
      final EndCityPieces.EndCityPiece parent,
      final BlockPos offset,
      final String templateName,
      final Rotation rotation,
      final boolean overwrite
   ) {
      EndCityPieces.EndCityPiece child = new EndCityPieces.EndCityPiece(structureTemplateManager, templateName, parent.templatePosition(), rotation, overwrite);
      BlockPos origin = parent.template().calculateConnectedPosition(parent.placeSettings(), offset, child.placeSettings(), BlockPos.ZERO);
      child.move(origin.getX(), origin.getY(), origin.getZ());
      return child;
   }

   public static void startHouseTower(
      final StructureTemplateManager structureTemplateManager,
      final BlockPos origin,
      final Rotation rotation,
      final List<StructurePiece> pieces,
      final RandomSource random
   ) {
      FAT_TOWER_GENERATOR.init();
      HOUSE_TOWER_GENERATOR.init();
      TOWER_BRIDGE_GENERATOR.init();
      TOWER_GENERATOR.init();
      EndCityPieces.EndCityPiece lastPiece = addHelper(pieces, new EndCityPieces.EndCityPiece(structureTemplateManager, "base_floor", origin, rotation, true));
      lastPiece = addHelper(pieces, addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 0, -1), "second_floor_1", rotation, false));
      lastPiece = addHelper(pieces, addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 4, -1), "third_floor_1", rotation, false));
      lastPiece = addHelper(pieces, addPiece(structureTemplateManager, lastPiece, new BlockPos(-1, 8, -1), "third_roof", rotation, true));
      recursiveChildren(structureTemplateManager, TOWER_GENERATOR, 1, lastPiece, null, pieces, random);
   }

   private static EndCityPieces.EndCityPiece addHelper(final List<StructurePiece> pieces, final EndCityPieces.EndCityPiece piece) {
      pieces.add(piece);
      return piece;
   }

   private static boolean recursiveChildren(
      final StructureTemplateManager structureTemplateManager,
      final EndCityPieces.SectionGenerator generator,
      final int genDepth,
      final EndCityPieces.EndCityPiece parent,
      final BlockPos offset,
      final List<StructurePiece> pieces,
      final RandomSource random
   ) {
      if (genDepth > 8) {
         return false;
      }

      List<StructurePiece> childPieces = new ArrayList<>();
      if (generator.generate(structureTemplateManager, genDepth, parent, offset, childPieces, random)) {
         boolean collision = false;
         int childTag = random.nextInt();

         for (StructurePiece child : childPieces) {
            child.setGenDepth(childTag);
            StructurePiece collisionPiece = StructurePiece.findCollisionPiece(pieces, child.getBoundingBox());
            if (collisionPiece != null && collisionPiece.getGenDepth() != parent.getGenDepth()) {
               collision = true;
               break;
            }
         }

         if (!collision) {
            pieces.addAll(childPieces);
            return true;
         }
      }

      return false;
   }

   public static class EndCityPiece extends TemplateStructurePiece {
      public EndCityPiece(
         final StructureTemplateManager structureTemplateManager,
         final String templateName,
         final BlockPos position,
         final Rotation rotation,
         final boolean overwrite
      ) {
         super(
            StructurePieceType.END_CITY_PIECE,
            0,
            structureTemplateManager,
            makeIdentifier(templateName),
            templateName,
            makeSettings(overwrite, rotation),
            position
         );
      }

      public EndCityPiece(final StructureTemplateManager structureTemplateManager, final CompoundTag tag) {
         super(
            StructurePieceType.END_CITY_PIECE,
            tag,
            structureTemplateManager,
            location -> makeSettings(tag.getBooleanOr("OW", false), tag.<Rotation>read("Rot", Rotation.LEGACY_CODEC).orElseThrow())
         );
      }

      private static StructurePlaceSettings makeSettings(final boolean overwrite, final Rotation rotation) {
         BlockIgnoreProcessor processor = overwrite ? BlockIgnoreProcessor.STRUCTURE_BLOCK : BlockIgnoreProcessor.STRUCTURE_AND_AIR;
         return new StructurePlaceSettings().setIgnoreEntities(true).addProcessor(processor).setRotation(rotation);
      }

      @Override
      protected Identifier makeTemplateLocation() {
         return makeIdentifier(this.templateName);
      }

      private static Identifier makeIdentifier(final String templateName) {
         return Identifier.withDefaultNamespace("end_city/" + templateName);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.store("Rot", Rotation.LEGACY_CODEC, this.placeSettings.getRotation());
         tag.putBoolean("OW", this.placeSettings.getProcessors().get(0) == BlockIgnoreProcessor.STRUCTURE_BLOCK);
      }

      @Override
      protected void handleDataMarker(
         final String markerId, final BlockPos position, final ServerLevelAccessor level, final RandomSource random, final BoundingBox chunkBB
      ) {
         if (markerId.startsWith("Chest")) {
            BlockPos chestPosition = position.below();
            if (chunkBB.isInside(chestPosition)) {
               RandomizableContainer.setBlockEntityLootTable(level, random, chestPosition, BuiltInLootTables.END_CITY_TREASURE);
            }
         } else if (chunkBB.isInside(position) && Level.isInSpawnableBounds(position)) {
            if (markerId.startsWith("Sentry")) {
               Shulker sentry = EntityTypes.SHULKER.create(level.getLevel(), EntitySpawnReason.STRUCTURE);
               if (sentry != null) {
                  sentry.setPos(position.getX() + 0.5, position.getY(), position.getZ() + 0.5);
                  level.addFreshEntity(sentry);
               }
            } else if (markerId.startsWith("Elytra")) {
               ItemFrame itemFrame = new ItemFrame(level.getLevel(), position, this.placeSettings.getRotation().rotate(Direction.SOUTH));
               itemFrame.setItem(new ItemStack(Items.ELYTRA), false);
               level.addFreshEntity(itemFrame);
            }
         }
      }
   }

   private interface SectionGenerator {
      void init();

      boolean generate(
         StructureTemplateManager structureTemplateManager,
         int genDepth,
         EndCityPieces.EndCityPiece parent,
         BlockPos offset,
         List<StructurePiece> pieces,
         RandomSource random
      );
   }
}
