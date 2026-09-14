package net.minecraft.world.level.levelgen.structure.structures;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.ScatteredFeaturePiece;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

public class JungleTemplePiece extends ScatteredFeaturePiece {
   public static final int WIDTH = 12;
   public static final int DEPTH = 15;
   private boolean placedMainChest;
   private boolean placedHiddenChest;
   private boolean placedTrap1;
   private boolean placedTrap2;
   private static final JungleTemplePiece.MossStoneSelector STONE_SELECTOR = new JungleTemplePiece.MossStoneSelector();

   public JungleTemplePiece(final RandomSource random, final int west, final int north) {
      super(StructurePieceType.JUNGLE_PYRAMID_PIECE, west, 64, north, 12, 10, 15, getRandomHorizontalDirection(random));
   }

   public JungleTemplePiece(final CompoundTag tag) {
      super(StructurePieceType.JUNGLE_PYRAMID_PIECE, tag);
      this.placedMainChest = tag.getBooleanOr("placedMainChest", false);
      this.placedHiddenChest = tag.getBooleanOr("placedHiddenChest", false);
      this.placedTrap1 = tag.getBooleanOr("placedTrap1", false);
      this.placedTrap2 = tag.getBooleanOr("placedTrap2", false);
   }

   @Override
   protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
      super.addAdditionalSaveData(context, tag);
      tag.putBoolean("placedMainChest", this.placedMainChest);
      tag.putBoolean("placedHiddenChest", this.placedHiddenChest);
      tag.putBoolean("placedTrap1", this.placedTrap1);
      tag.putBoolean("placedTrap2", this.placedTrap2);
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
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.ensureCapacity(SFormsFastMapDirect.java:387)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.putInternal(SFormsFastMapDirect.java:142)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.put(SFormsFastMapDirect.java:91)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.setCurrentVar(SFormsFastMapDirect.java:399)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.fieldRead(SFormsConstructor.java:483)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FieldExprent.processSforms(FieldExprent.java:310)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1894)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1894)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.processSforms(FunctionExprent.java:969)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1894)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.processSforms(FunctionExprent.java:969)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1894)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.processSforms(FunctionExprent.java:969)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.processSforms(Exprent.java:317)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processSforms(InvocationExprent.java:1894)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:127)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:95)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:88)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 5
      // 004: bipush 0
      // 005: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.updateAverageGroundHeight (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;I)Z
      // 008: ifne 00c
      // 00b: return
      // 00c: aload 0
      // 00d: aload 1
      // 00e: aload 5
      // 010: bipush 0
      // 011: bipush -4
      // 013: bipush 0
      // 014: aload 0
      // 015: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.width I
      // 018: bipush 1
      // 019: isub
      // 01a: bipush 0
      // 01b: aload 0
      // 01c: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.depth I
      // 01f: bipush 1
      // 020: isub
      // 021: bipush 0
      // 022: aload 4
      // 024: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 027: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 02a: aload 0
      // 02b: aload 1
      // 02c: aload 5
      // 02e: bipush 2
      // 02f: bipush 1
      // 030: bipush 2
      // 031: bipush 9
      // 033: bipush 2
      // 034: bipush 2
      // 035: bipush 0
      // 036: aload 4
      // 038: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 03b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 03e: aload 0
      // 03f: aload 1
      // 040: aload 5
      // 042: bipush 2
      // 043: bipush 1
      // 044: bipush 12
      // 046: bipush 9
      // 048: bipush 2
      // 049: bipush 12
      // 04b: bipush 0
      // 04c: aload 4
      // 04e: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 051: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 054: aload 0
      // 055: aload 1
      // 056: aload 5
      // 058: bipush 2
      // 059: bipush 1
      // 05a: bipush 3
      // 05b: bipush 2
      // 05c: bipush 2
      // 05d: bipush 11
      // 05f: bipush 0
      // 060: aload 4
      // 062: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 065: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 068: aload 0
      // 069: aload 1
      // 06a: aload 5
      // 06c: bipush 9
      // 06e: bipush 1
      // 06f: bipush 3
      // 070: bipush 9
      // 072: bipush 2
      // 073: bipush 11
      // 075: bipush 0
      // 076: aload 4
      // 078: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 07b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 07e: aload 0
      // 07f: aload 1
      // 080: aload 5
      // 082: bipush 1
      // 083: bipush 3
      // 084: bipush 1
      // 085: bipush 10
      // 087: bipush 6
      // 089: bipush 1
      // 08a: bipush 0
      // 08b: aload 4
      // 08d: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 090: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 093: aload 0
      // 094: aload 1
      // 095: aload 5
      // 097: bipush 1
      // 098: bipush 3
      // 099: bipush 13
      // 09b: bipush 10
      // 09d: bipush 6
      // 09f: bipush 13
      // 0a1: bipush 0
      // 0a2: aload 4
      // 0a4: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 0a7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 5
      // 0ae: bipush 1
      // 0af: bipush 3
      // 0b0: bipush 2
      // 0b1: bipush 1
      // 0b2: bipush 6
      // 0b4: bipush 12
      // 0b6: bipush 0
      // 0b7: aload 4
      // 0b9: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 0bc: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 0bf: aload 0
      // 0c0: aload 1
      // 0c1: aload 5
      // 0c3: bipush 10
      // 0c5: bipush 3
      // 0c6: bipush 2
      // 0c7: bipush 10
      // 0c9: bipush 6
      // 0cb: bipush 12
      // 0cd: bipush 0
      // 0ce: aload 4
      // 0d0: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 0d3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 0d6: aload 0
      // 0d7: aload 1
      // 0d8: aload 5
      // 0da: bipush 2
      // 0db: bipush 3
      // 0dc: bipush 2
      // 0dd: bipush 9
      // 0df: bipush 3
      // 0e0: bipush 12
      // 0e2: bipush 0
      // 0e3: aload 4
      // 0e5: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 0e8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 0eb: aload 0
      // 0ec: aload 1
      // 0ed: aload 5
      // 0ef: bipush 2
      // 0f0: bipush 6
      // 0f2: bipush 2
      // 0f3: bipush 9
      // 0f5: bipush 6
      // 0f7: bipush 12
      // 0f9: bipush 0
      // 0fa: aload 4
      // 0fc: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 0ff: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 102: aload 0
      // 103: aload 1
      // 104: aload 5
      // 106: bipush 3
      // 107: bipush 7
      // 109: bipush 3
      // 10a: bipush 8
      // 10c: bipush 7
      // 10e: bipush 11
      // 110: bipush 0
      // 111: aload 4
      // 113: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 116: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 119: aload 0
      // 11a: aload 1
      // 11b: aload 5
      // 11d: bipush 4
      // 11e: bipush 8
      // 120: bipush 4
      // 121: bipush 7
      // 123: bipush 8
      // 125: bipush 10
      // 127: bipush 0
      // 128: aload 4
      // 12a: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 12d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 130: aload 0
      // 131: aload 1
      // 132: aload 5
      // 134: bipush 3
      // 135: bipush 1
      // 136: bipush 3
      // 137: bipush 8
      // 139: bipush 2
      // 13a: bipush 11
      // 13c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 13f: aload 0
      // 140: aload 1
      // 141: aload 5
      // 143: bipush 4
      // 144: bipush 3
      // 145: bipush 6
      // 147: bipush 7
      // 149: bipush 3
      // 14a: bipush 9
      // 14c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 14f: aload 0
      // 150: aload 1
      // 151: aload 5
      // 153: bipush 2
      // 154: bipush 4
      // 155: bipush 2
      // 156: bipush 9
      // 158: bipush 5
      // 159: bipush 12
      // 15b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 15e: aload 0
      // 15f: aload 1
      // 160: aload 5
      // 162: bipush 4
      // 163: bipush 6
      // 165: bipush 5
      // 166: bipush 7
      // 168: bipush 6
      // 16a: bipush 9
      // 16c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 16f: aload 0
      // 170: aload 1
      // 171: aload 5
      // 173: bipush 5
      // 174: bipush 7
      // 176: bipush 6
      // 178: bipush 6
      // 17a: bipush 7
      // 17c: bipush 8
      // 17e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 181: aload 0
      // 182: aload 1
      // 183: aload 5
      // 185: bipush 5
      // 186: bipush 1
      // 187: bipush 2
      // 188: bipush 6
      // 18a: bipush 2
      // 18b: bipush 2
      // 18c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 18f: aload 0
      // 190: aload 1
      // 191: aload 5
      // 193: bipush 5
      // 194: bipush 2
      // 195: bipush 12
      // 197: bipush 6
      // 199: bipush 2
      // 19a: bipush 12
      // 19c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 19f: aload 0
      // 1a0: aload 1
      // 1a1: aload 5
      // 1a3: bipush 5
      // 1a4: bipush 5
      // 1a5: bipush 1
      // 1a6: bipush 6
      // 1a8: bipush 5
      // 1a9: bipush 1
      // 1aa: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 1ad: aload 0
      // 1ae: aload 1
      // 1af: aload 5
      // 1b1: bipush 5
      // 1b2: bipush 5
      // 1b3: bipush 13
      // 1b5: bipush 6
      // 1b7: bipush 5
      // 1b8: bipush 13
      // 1ba: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 1c2: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1c5: bipush 1
      // 1c6: bipush 5
      // 1c7: bipush 5
      // 1c8: aload 5
      // 1ca: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 1cd: aload 0
      // 1ce: aload 1
      // 1cf: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 1d2: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1d5: bipush 10
      // 1d7: bipush 5
      // 1d8: bipush 5
      // 1d9: aload 5
      // 1db: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 1de: aload 0
      // 1df: aload 1
      // 1e0: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 1e3: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1e6: bipush 1
      // 1e7: bipush 5
      // 1e8: bipush 9
      // 1ea: aload 5
      // 1ec: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 1ef: aload 0
      // 1f0: aload 1
      // 1f1: getstatic net/minecraft/world/level/block/Blocks.AIR Lnet/minecraft/world/level/block/Block;
      // 1f4: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 1f7: bipush 10
      // 1f9: bipush 5
      // 1fa: bipush 9
      // 1fc: aload 5
      // 1fe: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 201: bipush 0
      // 202: istore 8
      // 204: iload 8
      // 206: bipush 14
      // 208: if_icmpgt 269
      // 20b: aload 0
      // 20c: aload 1
      // 20d: aload 5
      // 20f: bipush 2
      // 210: bipush 4
      // 211: iload 8
      // 213: bipush 2
      // 214: bipush 5
      // 215: iload 8
      // 217: bipush 0
      // 218: aload 4
      // 21a: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 21d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 220: aload 0
      // 221: aload 1
      // 222: aload 5
      // 224: bipush 4
      // 225: bipush 4
      // 226: iload 8
      // 228: bipush 4
      // 229: bipush 5
      // 22a: iload 8
      // 22c: bipush 0
      // 22d: aload 4
      // 22f: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 232: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 235: aload 0
      // 236: aload 1
      // 237: aload 5
      // 239: bipush 7
      // 23b: bipush 4
      // 23c: iload 8
      // 23e: bipush 7
      // 240: bipush 5
      // 241: iload 8
      // 243: bipush 0
      // 244: aload 4
      // 246: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 249: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 24c: aload 0
      // 24d: aload 1
      // 24e: aload 5
      // 250: bipush 9
      // 252: bipush 4
      // 253: iload 8
      // 255: bipush 9
      // 257: bipush 5
      // 258: iload 8
      // 25a: bipush 0
      // 25b: aload 4
      // 25d: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 260: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 263: iinc 8 14
      // 266: goto 204
      // 269: aload 0
      // 26a: aload 1
      // 26b: aload 5
      // 26d: bipush 5
      // 26e: bipush 6
      // 270: bipush 0
      // 271: bipush 6
      // 273: bipush 6
      // 275: bipush 0
      // 276: bipush 0
      // 277: aload 4
      // 279: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 27c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 27f: bipush 0
      // 280: istore 8
      // 282: iload 8
      // 284: bipush 11
      // 286: if_icmpgt 2e6
      // 289: bipush 2
      // 28a: istore 9
      // 28c: iload 9
      // 28e: bipush 12
      // 290: if_icmpgt 2b0
      // 293: aload 0
      // 294: aload 1
      // 295: aload 5
      // 297: iload 8
      // 299: bipush 4
      // 29a: iload 9
      // 29c: iload 8
      // 29e: bipush 5
      // 29f: iload 9
      // 2a1: bipush 0
      // 2a2: aload 4
      // 2a4: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 2a7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 2aa: iinc 9 2
      // 2ad: goto 28c
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: aload 5
      // 2b4: iload 8
      // 2b6: bipush 6
      // 2b8: bipush 5
      // 2b9: iload 8
      // 2bb: bipush 6
      // 2bd: bipush 5
      // 2be: bipush 0
      // 2bf: aload 4
      // 2c1: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 2c4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 2c7: aload 0
      // 2c8: aload 1
      // 2c9: aload 5
      // 2cb: iload 8
      // 2cd: bipush 6
      // 2cf: bipush 9
      // 2d1: iload 8
      // 2d3: bipush 6
      // 2d5: bipush 9
      // 2d7: bipush 0
      // 2d8: aload 4
      // 2da: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 2dd: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 2e0: iinc 8 11
      // 2e3: goto 282
      // 2e6: aload 0
      // 2e7: aload 1
      // 2e8: aload 5
      // 2ea: bipush 2
      // 2eb: bipush 7
      // 2ed: bipush 2
      // 2ee: bipush 2
      // 2ef: bipush 9
      // 2f1: bipush 2
      // 2f2: bipush 0
      // 2f3: aload 4
      // 2f5: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 2f8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 2fb: aload 0
      // 2fc: aload 1
      // 2fd: aload 5
      // 2ff: bipush 9
      // 301: bipush 7
      // 303: bipush 2
      // 304: bipush 9
      // 306: bipush 9
      // 308: bipush 2
      // 309: bipush 0
      // 30a: aload 4
      // 30c: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 30f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 312: aload 0
      // 313: aload 1
      // 314: aload 5
      // 316: bipush 2
      // 317: bipush 7
      // 319: bipush 12
      // 31b: bipush 2
      // 31c: bipush 9
      // 31e: bipush 12
      // 320: bipush 0
      // 321: aload 4
      // 323: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 326: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 329: aload 0
      // 32a: aload 1
      // 32b: aload 5
      // 32d: bipush 9
      // 32f: bipush 7
      // 331: bipush 12
      // 333: bipush 9
      // 335: bipush 9
      // 337: bipush 12
      // 339: bipush 0
      // 33a: aload 4
      // 33c: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 33f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 342: aload 0
      // 343: aload 1
      // 344: aload 5
      // 346: bipush 4
      // 347: bipush 9
      // 349: bipush 4
      // 34a: bipush 4
      // 34b: bipush 9
      // 34d: bipush 4
      // 34e: bipush 0
      // 34f: aload 4
      // 351: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 354: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 357: aload 0
      // 358: aload 1
      // 359: aload 5
      // 35b: bipush 7
      // 35d: bipush 9
      // 35f: bipush 4
      // 360: bipush 7
      // 362: bipush 9
      // 364: bipush 4
      // 365: bipush 0
      // 366: aload 4
      // 368: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 36b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 36e: aload 0
      // 36f: aload 1
      // 370: aload 5
      // 372: bipush 4
      // 373: bipush 9
      // 375: bipush 10
      // 377: bipush 4
      // 378: bipush 9
      // 37a: bipush 10
      // 37c: bipush 0
      // 37d: aload 4
      // 37f: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 382: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 385: aload 0
      // 386: aload 1
      // 387: aload 5
      // 389: bipush 7
      // 38b: bipush 9
      // 38d: bipush 10
      // 38f: bipush 7
      // 391: bipush 9
      // 393: bipush 10
      // 395: bipush 0
      // 396: aload 4
      // 398: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 39b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 39e: aload 0
      // 39f: aload 1
      // 3a0: aload 5
      // 3a2: bipush 5
      // 3a3: bipush 9
      // 3a5: bipush 7
      // 3a7: bipush 6
      // 3a9: bipush 9
      // 3ab: bipush 7
      // 3ad: bipush 0
      // 3ae: aload 4
      // 3b0: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 3b3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 3b6: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
      // 3b9: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 3bc: getstatic net/minecraft/world/level/block/StairBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 3bf: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
      // 3c2: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 3c5: checkcast net/minecraft/world/level/block/state/BlockState
      // 3c8: astore 8
      // 3ca: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
      // 3cd: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 3d0: getstatic net/minecraft/world/level/block/StairBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 3d3: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
      // 3d6: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 3d9: checkcast net/minecraft/world/level/block/state/BlockState
      // 3dc: astore 9
      // 3de: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
      // 3e1: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 3e4: getstatic net/minecraft/world/level/block/StairBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 3e7: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
      // 3ea: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 3ed: checkcast net/minecraft/world/level/block/state/BlockState
      // 3f0: astore 10
      // 3f2: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
      // 3f5: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 3f8: getstatic net/minecraft/world/level/block/StairBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 3fb: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
      // 3fe: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 401: checkcast net/minecraft/world/level/block/state/BlockState
      // 404: astore 11
      // 406: aload 0
      // 407: aload 1
      // 408: aload 11
      // 40a: bipush 5
      // 40b: bipush 9
      // 40d: bipush 6
      // 40f: aload 5
      // 411: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 414: aload 0
      // 415: aload 1
      // 416: aload 11
      // 418: bipush 6
      // 41a: bipush 9
      // 41c: bipush 6
      // 41e: aload 5
      // 420: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 423: aload 0
      // 424: aload 1
      // 425: aload 10
      // 427: bipush 5
      // 428: bipush 9
      // 42a: bipush 8
      // 42c: aload 5
      // 42e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 431: aload 0
      // 432: aload 1
      // 433: aload 10
      // 435: bipush 6
      // 437: bipush 9
      // 439: bipush 8
      // 43b: aload 5
      // 43d: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 440: aload 0
      // 441: aload 1
      // 442: aload 11
      // 444: bipush 4
      // 445: bipush 0
      // 446: bipush 0
      // 447: aload 5
      // 449: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 44c: aload 0
      // 44d: aload 1
      // 44e: aload 11
      // 450: bipush 5
      // 451: bipush 0
      // 452: bipush 0
      // 453: aload 5
      // 455: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 458: aload 0
      // 459: aload 1
      // 45a: aload 11
      // 45c: bipush 6
      // 45e: bipush 0
      // 45f: bipush 0
      // 460: aload 5
      // 462: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 465: aload 0
      // 466: aload 1
      // 467: aload 11
      // 469: bipush 7
      // 46b: bipush 0
      // 46c: bipush 0
      // 46d: aload 5
      // 46f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 472: aload 0
      // 473: aload 1
      // 474: aload 11
      // 476: bipush 4
      // 477: bipush 1
      // 478: bipush 8
      // 47a: aload 5
      // 47c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 47f: aload 0
      // 480: aload 1
      // 481: aload 11
      // 483: bipush 4
      // 484: bipush 2
      // 485: bipush 9
      // 487: aload 5
      // 489: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 48c: aload 0
      // 48d: aload 1
      // 48e: aload 11
      // 490: bipush 4
      // 491: bipush 3
      // 492: bipush 10
      // 494: aload 5
      // 496: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 499: aload 0
      // 49a: aload 1
      // 49b: aload 11
      // 49d: bipush 7
      // 49f: bipush 1
      // 4a0: bipush 8
      // 4a2: aload 5
      // 4a4: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 4a7: aload 0
      // 4a8: aload 1
      // 4a9: aload 11
      // 4ab: bipush 7
      // 4ad: bipush 2
      // 4ae: bipush 9
      // 4b0: aload 5
      // 4b2: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 4b5: aload 0
      // 4b6: aload 1
      // 4b7: aload 11
      // 4b9: bipush 7
      // 4bb: bipush 3
      // 4bc: bipush 10
      // 4be: aload 5
      // 4c0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 4c3: aload 0
      // 4c4: aload 1
      // 4c5: aload 5
      // 4c7: bipush 4
      // 4c8: bipush 1
      // 4c9: bipush 9
      // 4cb: bipush 4
      // 4cc: bipush 1
      // 4cd: bipush 9
      // 4cf: bipush 0
      // 4d0: aload 4
      // 4d2: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 4d5: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 4d8: aload 0
      // 4d9: aload 1
      // 4da: aload 5
      // 4dc: bipush 7
      // 4de: bipush 1
      // 4df: bipush 9
      // 4e1: bipush 7
      // 4e3: bipush 1
      // 4e4: bipush 9
      // 4e6: bipush 0
      // 4e7: aload 4
      // 4e9: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 4ec: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 4ef: aload 0
      // 4f0: aload 1
      // 4f1: aload 5
      // 4f3: bipush 4
      // 4f4: bipush 1
      // 4f5: bipush 10
      // 4f7: bipush 7
      // 4f9: bipush 2
      // 4fa: bipush 10
      // 4fc: bipush 0
      // 4fd: aload 4
      // 4ff: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 502: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 505: aload 0
      // 506: aload 1
      // 507: aload 5
      // 509: bipush 5
      // 50a: bipush 4
      // 50b: bipush 5
      // 50c: bipush 6
      // 50e: bipush 4
      // 50f: bipush 5
      // 510: bipush 0
      // 511: aload 4
      // 513: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 516: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 519: aload 0
      // 51a: aload 1
      // 51b: aload 8
      // 51d: bipush 4
      // 51e: bipush 4
      // 51f: bipush 5
      // 520: aload 5
      // 522: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 525: aload 0
      // 526: aload 1
      // 527: aload 9
      // 529: bipush 7
      // 52b: bipush 4
      // 52c: bipush 5
      // 52d: aload 5
      // 52f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 532: bipush 0
      // 533: istore 12
      // 535: iload 12
      // 537: bipush 4
      // 538: if_icmpge 584
      // 53b: aload 0
      // 53c: aload 1
      // 53d: aload 10
      // 53f: bipush 5
      // 540: bipush 0
      // 541: iload 12
      // 543: isub
      // 544: bipush 6
      // 546: iload 12
      // 548: iadd
      // 549: aload 5
      // 54b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 54e: aload 0
      // 54f: aload 1
      // 550: aload 10
      // 552: bipush 6
      // 554: bipush 0
      // 555: iload 12
      // 557: isub
      // 558: bipush 6
      // 55a: iload 12
      // 55c: iadd
      // 55d: aload 5
      // 55f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 562: aload 0
      // 563: aload 1
      // 564: aload 5
      // 566: bipush 5
      // 567: bipush 0
      // 568: iload 12
      // 56a: isub
      // 56b: bipush 7
      // 56d: iload 12
      // 56f: iadd
      // 570: bipush 6
      // 572: bipush 0
      // 573: iload 12
      // 575: isub
      // 576: bipush 9
      // 578: iload 12
      // 57a: iadd
      // 57b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 57e: iinc 12 1
      // 581: goto 535
      // 584: aload 0
      // 585: aload 1
      // 586: aload 5
      // 588: bipush 1
      // 589: bipush -3
      // 58b: bipush 12
      // 58d: bipush 10
      // 58f: bipush -1
      // 590: bipush 13
      // 592: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 595: aload 0
      // 596: aload 1
      // 597: aload 5
      // 599: bipush 1
      // 59a: bipush -3
      // 59c: bipush 1
      // 59d: bipush 3
      // 59e: bipush -1
      // 59f: bipush 13
      // 5a1: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 5a4: aload 0
      // 5a5: aload 1
      // 5a6: aload 5
      // 5a8: bipush 1
      // 5a9: bipush -3
      // 5ab: bipush 1
      // 5ac: bipush 9
      // 5ae: bipush -1
      // 5af: bipush 5
      // 5b0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // 5b3: bipush 1
      // 5b4: istore 12
      // 5b6: iload 12
      // 5b8: bipush 13
      // 5ba: if_icmpgt 5da
      // 5bd: aload 0
      // 5be: aload 1
      // 5bf: aload 5
      // 5c1: bipush 1
      // 5c2: bipush -3
      // 5c4: iload 12
      // 5c6: bipush 1
      // 5c7: bipush -2
      // 5c9: iload 12
      // 5cb: bipush 0
      // 5cc: aload 4
      // 5ce: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 5d1: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 5d4: iinc 12 2
      // 5d7: goto 5b6
      // 5da: bipush 2
      // 5db: istore 12
      // 5dd: iload 12
      // 5df: bipush 12
      // 5e1: if_icmpgt 5ff
      // 5e4: aload 0
      // 5e5: aload 1
      // 5e6: aload 5
      // 5e8: bipush 1
      // 5e9: bipush -1
      // 5ea: iload 12
      // 5ec: bipush 3
      // 5ed: bipush -1
      // 5ee: iload 12
      // 5f0: bipush 0
      // 5f1: aload 4
      // 5f3: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 5f6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 5f9: iinc 12 2
      // 5fc: goto 5dd
      // 5ff: aload 0
      // 600: aload 1
      // 601: aload 5
      // 603: bipush 2
      // 604: bipush -2
      // 606: bipush 1
      // 607: bipush 5
      // 608: bipush -2
      // 60a: bipush 1
      // 60b: bipush 0
      // 60c: aload 4
      // 60e: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 611: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 614: aload 0
      // 615: aload 1
      // 616: aload 5
      // 618: bipush 7
      // 61a: bipush -2
      // 61c: bipush 1
      // 61d: bipush 9
      // 61f: bipush -2
      // 621: bipush 1
      // 622: bipush 0
      // 623: aload 4
      // 625: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 628: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 62b: aload 0
      // 62c: aload 1
      // 62d: aload 5
      // 62f: bipush 6
      // 631: bipush -3
      // 633: bipush 1
      // 634: bipush 6
      // 636: bipush -3
      // 638: bipush 1
      // 639: bipush 0
      // 63a: aload 4
      // 63c: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 63f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 642: aload 0
      // 643: aload 1
      // 644: aload 5
      // 646: bipush 6
      // 648: bipush -1
      // 649: bipush 1
      // 64a: bipush 6
      // 64c: bipush -1
      // 64d: bipush 1
      // 64e: bipush 0
      // 64f: aload 4
      // 651: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // 654: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // 657: aload 0
      // 658: aload 1
      // 659: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE_HOOK Lnet/minecraft/world/level/block/Block;
      // 65c: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 65f: getstatic net/minecraft/world/level/block/TripWireHookBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 662: getstatic net/minecraft/core/Direction.EAST Lnet/minecraft/core/Direction;
      // 665: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 668: checkcast net/minecraft/world/level/block/state/BlockState
      // 66b: getstatic net/minecraft/world/level/block/TripWireHookBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 66e: bipush 1
      // 66f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 672: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 675: checkcast net/minecraft/world/level/block/state/BlockState
      // 678: bipush 1
      // 679: bipush -3
      // 67b: bipush 8
      // 67d: aload 5
      // 67f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 682: aload 0
      // 683: aload 1
      // 684: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE_HOOK Lnet/minecraft/world/level/block/Block;
      // 687: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 68a: getstatic net/minecraft/world/level/block/TripWireHookBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 68d: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
      // 690: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 693: checkcast net/minecraft/world/level/block/state/BlockState
      // 696: getstatic net/minecraft/world/level/block/TripWireHookBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 699: bipush 1
      // 69a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 69d: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 6a0: checkcast net/minecraft/world/level/block/state/BlockState
      // 6a3: bipush 4
      // 6a4: bipush -3
      // 6a6: bipush 8
      // 6a8: aload 5
      // 6aa: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 6ad: aload 0
      // 6ae: aload 1
      // 6af: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE Lnet/minecraft/world/level/block/Block;
      // 6b2: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 6b5: getstatic net/minecraft/world/level/block/TripWireBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 6b8: bipush 1
      // 6b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6bc: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 6bf: checkcast net/minecraft/world/level/block/state/BlockState
      // 6c2: getstatic net/minecraft/world/level/block/TripWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 6c5: bipush 1
      // 6c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6c9: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 6cc: checkcast net/minecraft/world/level/block/state/BlockState
      // 6cf: getstatic net/minecraft/world/level/block/TripWireBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 6d2: bipush 1
      // 6d3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6d6: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 6d9: checkcast net/minecraft/world/level/block/state/BlockState
      // 6dc: bipush 2
      // 6dd: bipush -3
      // 6df: bipush 8
      // 6e1: aload 5
      // 6e3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 6e6: aload 0
      // 6e7: aload 1
      // 6e8: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE Lnet/minecraft/world/level/block/Block;
      // 6eb: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 6ee: getstatic net/minecraft/world/level/block/TripWireBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 6f1: bipush 1
      // 6f2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6f5: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 6f8: checkcast net/minecraft/world/level/block/state/BlockState
      // 6fb: getstatic net/minecraft/world/level/block/TripWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 6fe: bipush 1
      // 6ff: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 702: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 705: checkcast net/minecraft/world/level/block/state/BlockState
      // 708: getstatic net/minecraft/world/level/block/TripWireBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 70b: bipush 1
      // 70c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 70f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 712: checkcast net/minecraft/world/level/block/state/BlockState
      // 715: bipush 3
      // 716: bipush -3
      // 718: bipush 8
      // 71a: aload 5
      // 71c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 71f: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 722: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 725: getstatic net/minecraft/world/level/block/RedstoneWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 728: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 72b: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 72e: checkcast net/minecraft/world/level/block/state/BlockState
      // 731: getstatic net/minecraft/world/level/block/RedstoneWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 734: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 737: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 73a: checkcast net/minecraft/world/level/block/state/BlockState
      // 73d: astore 12
      // 73f: aload 0
      // 740: aload 1
      // 741: aload 12
      // 743: bipush 5
      // 744: bipush -3
      // 746: bipush 7
      // 748: aload 5
      // 74a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 74d: aload 0
      // 74e: aload 1
      // 74f: aload 12
      // 751: bipush 5
      // 752: bipush -3
      // 754: bipush 6
      // 756: aload 5
      // 758: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 75b: aload 0
      // 75c: aload 1
      // 75d: aload 12
      // 75f: bipush 5
      // 760: bipush -3
      // 762: bipush 5
      // 763: aload 5
      // 765: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 768: aload 0
      // 769: aload 1
      // 76a: aload 12
      // 76c: bipush 5
      // 76d: bipush -3
      // 76f: bipush 4
      // 770: aload 5
      // 772: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 775: aload 0
      // 776: aload 1
      // 777: aload 12
      // 779: bipush 5
      // 77a: bipush -3
      // 77c: bipush 3
      // 77d: aload 5
      // 77f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 782: aload 0
      // 783: aload 1
      // 784: aload 12
      // 786: bipush 5
      // 787: bipush -3
      // 789: bipush 2
      // 78a: aload 5
      // 78c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 78f: aload 0
      // 790: aload 1
      // 791: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 794: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 797: getstatic net/minecraft/world/level/block/RedstoneWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 79a: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 79d: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 7a0: checkcast net/minecraft/world/level/block/state/BlockState
      // 7a3: getstatic net/minecraft/world/level/block/RedstoneWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 7a6: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 7a9: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 7ac: checkcast net/minecraft/world/level/block/state/BlockState
      // 7af: bipush 5
      // 7b0: bipush -3
      // 7b2: bipush 1
      // 7b3: aload 5
      // 7b5: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 7b8: aload 0
      // 7b9: aload 1
      // 7ba: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 7bd: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 7c0: getstatic net/minecraft/world/level/block/RedstoneWireBlock.EAST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 7c3: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 7c6: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 7c9: checkcast net/minecraft/world/level/block/state/BlockState
      // 7cc: getstatic net/minecraft/world/level/block/RedstoneWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 7cf: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 7d2: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 7d5: checkcast net/minecraft/world/level/block/state/BlockState
      // 7d8: bipush 4
      // 7d9: bipush -3
      // 7db: bipush 1
      // 7dc: aload 5
      // 7de: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 7e1: aload 0
      // 7e2: aload 1
      // 7e3: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // 7e6: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 7e9: bipush 3
      // 7ea: bipush -3
      // 7ec: bipush 1
      // 7ed: aload 5
      // 7ef: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 7f2: aload 0
      // 7f3: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedTrap1 Z
      // 7f6: ifne 810
      // 7f9: aload 0
      // 7fa: aload 0
      // 7fb: aload 1
      // 7fc: aload 5
      // 7fe: aload 4
      // 800: bipush 3
      // 801: bipush -2
      // 803: bipush 1
      // 804: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
      // 807: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.JUNGLE_TEMPLE_DISPENSER Lnet/minecraft/resources/ResourceKey;
      // 80a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.createDispenser (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;Lnet/minecraft/resources/ResourceKey;)Z
      // 80d: putfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedTrap1 Z
      // 810: aload 0
      // 811: aload 1
      // 812: getstatic net/minecraft/world/level/block/Blocks.VINE Lnet/minecraft/world/level/block/Block;
      // 815: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 818: getstatic net/minecraft/world/level/block/VineBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 81b: bipush 1
      // 81c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 81f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 822: checkcast net/minecraft/world/level/block/state/BlockState
      // 825: bipush 3
      // 826: bipush -2
      // 828: bipush 2
      // 829: aload 5
      // 82b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 82e: aload 0
      // 82f: aload 1
      // 830: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE_HOOK Lnet/minecraft/world/level/block/Block;
      // 833: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 836: getstatic net/minecraft/world/level/block/TripWireHookBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 839: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
      // 83c: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 83f: checkcast net/minecraft/world/level/block/state/BlockState
      // 842: getstatic net/minecraft/world/level/block/TripWireHookBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 845: bipush 1
      // 846: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 849: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 84c: checkcast net/minecraft/world/level/block/state/BlockState
      // 84f: bipush 7
      // 851: bipush -3
      // 853: bipush 1
      // 854: aload 5
      // 856: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 859: aload 0
      // 85a: aload 1
      // 85b: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE_HOOK Lnet/minecraft/world/level/block/Block;
      // 85e: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 861: getstatic net/minecraft/world/level/block/TripWireHookBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 864: getstatic net/minecraft/core/Direction.SOUTH Lnet/minecraft/core/Direction;
      // 867: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 86a: checkcast net/minecraft/world/level/block/state/BlockState
      // 86d: getstatic net/minecraft/world/level/block/TripWireHookBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 870: bipush 1
      // 871: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 874: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 877: checkcast net/minecraft/world/level/block/state/BlockState
      // 87a: bipush 7
      // 87c: bipush -3
      // 87e: bipush 5
      // 87f: aload 5
      // 881: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 884: aload 0
      // 885: aload 1
      // 886: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE Lnet/minecraft/world/level/block/Block;
      // 889: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 88c: getstatic net/minecraft/world/level/block/TripWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 88f: bipush 1
      // 890: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 893: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 896: checkcast net/minecraft/world/level/block/state/BlockState
      // 899: getstatic net/minecraft/world/level/block/TripWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 89c: bipush 1
      // 89d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8a0: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 8a3: checkcast net/minecraft/world/level/block/state/BlockState
      // 8a6: getstatic net/minecraft/world/level/block/TripWireBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 8a9: bipush 1
      // 8aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8ad: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 8b0: checkcast net/minecraft/world/level/block/state/BlockState
      // 8b3: bipush 7
      // 8b5: bipush -3
      // 8b7: bipush 2
      // 8b8: aload 5
      // 8ba: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 8bd: aload 0
      // 8be: aload 1
      // 8bf: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE Lnet/minecraft/world/level/block/Block;
      // 8c2: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 8c5: getstatic net/minecraft/world/level/block/TripWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 8c8: bipush 1
      // 8c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8cc: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 8cf: checkcast net/minecraft/world/level/block/state/BlockState
      // 8d2: getstatic net/minecraft/world/level/block/TripWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 8d5: bipush 1
      // 8d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d9: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 8dc: checkcast net/minecraft/world/level/block/state/BlockState
      // 8df: getstatic net/minecraft/world/level/block/TripWireBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 8e2: bipush 1
      // 8e3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8e6: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 8e9: checkcast net/minecraft/world/level/block/state/BlockState
      // 8ec: bipush 7
      // 8ee: bipush -3
      // 8f0: bipush 3
      // 8f1: aload 5
      // 8f3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 8f6: aload 0
      // 8f7: aload 1
      // 8f8: getstatic net/minecraft/world/level/block/Blocks.TRIPWIRE Lnet/minecraft/world/level/block/Block;
      // 8fb: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 8fe: getstatic net/minecraft/world/level/block/TripWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 901: bipush 1
      // 902: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 905: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 908: checkcast net/minecraft/world/level/block/state/BlockState
      // 90b: getstatic net/minecraft/world/level/block/TripWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 90e: bipush 1
      // 90f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 912: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 915: checkcast net/minecraft/world/level/block/state/BlockState
      // 918: getstatic net/minecraft/world/level/block/TripWireBlock.ATTACHED Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 91b: bipush 1
      // 91c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 91f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 922: checkcast net/minecraft/world/level/block/state/BlockState
      // 925: bipush 7
      // 927: bipush -3
      // 929: bipush 4
      // 92a: aload 5
      // 92c: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 92f: aload 0
      // 930: aload 1
      // 931: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 934: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 937: getstatic net/minecraft/world/level/block/RedstoneWireBlock.EAST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 93a: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 93d: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 940: checkcast net/minecraft/world/level/block/state/BlockState
      // 943: getstatic net/minecraft/world/level/block/RedstoneWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 946: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 949: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 94c: checkcast net/minecraft/world/level/block/state/BlockState
      // 94f: bipush 8
      // 951: bipush -3
      // 953: bipush 6
      // 955: aload 5
      // 957: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 95a: aload 0
      // 95b: aload 1
      // 95c: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 95f: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 962: getstatic net/minecraft/world/level/block/RedstoneWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 965: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 968: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 96b: checkcast net/minecraft/world/level/block/state/BlockState
      // 96e: getstatic net/minecraft/world/level/block/RedstoneWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 971: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 974: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 977: checkcast net/minecraft/world/level/block/state/BlockState
      // 97a: bipush 9
      // 97c: bipush -3
      // 97e: bipush 6
      // 980: aload 5
      // 982: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 985: aload 0
      // 986: aload 1
      // 987: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // 98a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 98d: getstatic net/minecraft/world/level/block/RedstoneWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 990: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 993: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 996: checkcast net/minecraft/world/level/block/state/BlockState
      // 999: getstatic net/minecraft/world/level/block/RedstoneWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // 99c: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.UP Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // 99f: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 9a2: checkcast net/minecraft/world/level/block/state/BlockState
      // 9a5: bipush 9
      // 9a7: bipush -3
      // 9a9: bipush 5
      // 9aa: aload 5
      // 9ac: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 9af: aload 0
      // 9b0: aload 1
      // 9b1: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // 9b4: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 9b7: bipush 9
      // 9b9: bipush -3
      // 9bb: bipush 4
      // 9bc: aload 5
      // 9be: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 9c1: aload 0
      // 9c2: aload 1
      // 9c3: aload 12
      // 9c5: bipush 9
      // 9c7: bipush -2
      // 9c9: bipush 4
      // 9ca: aload 5
      // 9cc: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // 9cf: aload 0
      // 9d0: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedTrap2 Z
      // 9d3: ifne 9ee
      // 9d6: aload 0
      // 9d7: aload 0
      // 9d8: aload 1
      // 9d9: aload 5
      // 9db: aload 4
      // 9dd: bipush 9
      // 9df: bipush -2
      // 9e1: bipush 3
      // 9e2: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
      // 9e5: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.JUNGLE_TEMPLE_DISPENSER Lnet/minecraft/resources/ResourceKey;
      // 9e8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.createDispenser (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;Lnet/minecraft/resources/ResourceKey;)Z
      // 9eb: putfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedTrap2 Z
      // 9ee: aload 0
      // 9ef: aload 1
      // 9f0: getstatic net/minecraft/world/level/block/Blocks.VINE Lnet/minecraft/world/level/block/Block;
      // 9f3: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 9f6: getstatic net/minecraft/world/level/block/VineBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // 9f9: bipush 1
      // 9fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 9fd: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // a00: checkcast net/minecraft/world/level/block/state/BlockState
      // a03: bipush 8
      // a05: bipush -1
      // a06: bipush 3
      // a07: aload 5
      // a09: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a0c: aload 0
      // a0d: aload 1
      // a0e: getstatic net/minecraft/world/level/block/Blocks.VINE Lnet/minecraft/world/level/block/Block;
      // a11: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a14: getstatic net/minecraft/world/level/block/VineBlock.EAST Lnet/minecraft/world/level/block/state/properties/BooleanProperty;
      // a17: bipush 1
      // a18: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a1b: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // a1e: checkcast net/minecraft/world/level/block/state/BlockState
      // a21: bipush 8
      // a23: bipush -2
      // a25: bipush 3
      // a26: aload 5
      // a28: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a2b: aload 0
      // a2c: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedMainChest Z
      // a2f: ifne a47
      // a32: aload 0
      // a33: aload 0
      // a34: aload 1
      // a35: aload 5
      // a37: aload 4
      // a39: bipush 8
      // a3b: bipush -3
      // a3d: bipush 3
      // a3e: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.JUNGLE_TEMPLE Lnet/minecraft/resources/ResourceKey;
      // a41: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.createChest (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/resources/ResourceKey;)Z
      // a44: putfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedMainChest Z
      // a47: aload 0
      // a48: aload 1
      // a49: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // a4c: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a4f: bipush 9
      // a51: bipush -3
      // a53: bipush 2
      // a54: aload 5
      // a56: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a59: aload 0
      // a5a: aload 1
      // a5b: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // a5e: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a61: bipush 8
      // a63: bipush -3
      // a65: bipush 1
      // a66: aload 5
      // a68: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a6b: aload 0
      // a6c: aload 1
      // a6d: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // a70: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a73: bipush 4
      // a74: bipush -3
      // a76: bipush 5
      // a77: aload 5
      // a79: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a7c: aload 0
      // a7d: aload 1
      // a7e: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // a81: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a84: bipush 5
      // a85: bipush -2
      // a87: bipush 5
      // a88: aload 5
      // a8a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a8d: aload 0
      // a8e: aload 1
      // a8f: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // a92: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // a95: bipush 5
      // a96: bipush -1
      // a97: bipush 5
      // a98: aload 5
      // a9a: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // a9d: aload 0
      // a9e: aload 1
      // a9f: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // aa2: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // aa5: bipush 6
      // aa7: bipush -3
      // aa9: bipush 5
      // aaa: aload 5
      // aac: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // aaf: aload 0
      // ab0: aload 1
      // ab1: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // ab4: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // ab7: bipush 7
      // ab9: bipush -2
      // abb: bipush 5
      // abc: aload 5
      // abe: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // ac1: aload 0
      // ac2: aload 1
      // ac3: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // ac6: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // ac9: bipush 7
      // acb: bipush -1
      // acc: bipush 5
      // acd: aload 5
      // acf: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // ad2: aload 0
      // ad3: aload 1
      // ad4: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // ad7: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // ada: bipush 8
      // adc: bipush -3
      // ade: bipush 5
      // adf: aload 5
      // ae1: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // ae4: aload 0
      // ae5: aload 1
      // ae6: aload 5
      // ae8: bipush 9
      // aea: bipush -1
      // aeb: bipush 1
      // aec: bipush 9
      // aee: bipush -1
      // aef: bipush 5
      // af0: bipush 0
      // af1: aload 4
      // af3: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // af6: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // af9: aload 0
      // afa: aload 1
      // afb: aload 5
      // afd: bipush 8
      // aff: bipush -3
      // b01: bipush 8
      // b03: bipush 10
      // b05: bipush -1
      // b06: bipush 10
      // b08: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateAirBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIII)V
      // b0b: aload 0
      // b0c: aload 1
      // b0d: getstatic net/minecraft/world/level/block/Blocks.CHISELED_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
      // b10: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // b13: bipush 8
      // b15: bipush -2
      // b17: bipush 11
      // b19: aload 5
      // b1b: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b1e: aload 0
      // b1f: aload 1
      // b20: getstatic net/minecraft/world/level/block/Blocks.CHISELED_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
      // b23: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // b26: bipush 9
      // b28: bipush -2
      // b2a: bipush 11
      // b2c: aload 5
      // b2e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b31: aload 0
      // b32: aload 1
      // b33: getstatic net/minecraft/world/level/block/Blocks.CHISELED_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
      // b36: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // b39: bipush 10
      // b3b: bipush -2
      // b3d: bipush 11
      // b3f: aload 5
      // b41: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b44: getstatic net/minecraft/world/level/block/Blocks.LEVER Lnet/minecraft/world/level/block/Block;
      // b47: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // b4a: getstatic net/minecraft/world/level/block/LeverBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // b4d: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
      // b50: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // b53: checkcast net/minecraft/world/level/block/state/BlockState
      // b56: getstatic net/minecraft/world/level/block/LeverBlock.FACE Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // b59: getstatic net/minecraft/world/level/block/state/properties/AttachFace.WALL Lnet/minecraft/world/level/block/state/properties/AttachFace;
      // b5c: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // b5f: checkcast net/minecraft/world/level/block/state/BlockState
      // b62: astore 13
      // b64: aload 0
      // b65: aload 1
      // b66: aload 13
      // b68: bipush 8
      // b6a: bipush -2
      // b6c: bipush 12
      // b6e: aload 5
      // b70: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b73: aload 0
      // b74: aload 1
      // b75: aload 13
      // b77: bipush 9
      // b79: bipush -2
      // b7b: bipush 12
      // b7d: aload 5
      // b7f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b82: aload 0
      // b83: aload 1
      // b84: aload 13
      // b86: bipush 10
      // b88: bipush -2
      // b8a: bipush 12
      // b8c: aload 5
      // b8e: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // b91: aload 0
      // b92: aload 1
      // b93: aload 5
      // b95: bipush 8
      // b97: bipush -3
      // b99: bipush 8
      // b9b: bipush 8
      // b9d: bipush -3
      // b9f: bipush 10
      // ba1: bipush 0
      // ba2: aload 4
      // ba4: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // ba7: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // baa: aload 0
      // bab: aload 1
      // bac: aload 5
      // bae: bipush 10
      // bb0: bipush -3
      // bb2: bipush 8
      // bb4: bipush 10
      // bb6: bipush -3
      // bb8: bipush 10
      // bba: bipush 0
      // bbb: aload 4
      // bbd: getstatic net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.STONE_SELECTOR Lnet/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece$MossStoneSelector;
      // bc0: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.generateBox (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;IIIIIIZLnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/StructurePiece$BlockSelector;)V
      // bc3: aload 0
      // bc4: aload 1
      // bc5: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
      // bc8: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // bcb: bipush 10
      // bcd: bipush -2
      // bcf: bipush 9
      // bd1: aload 5
      // bd3: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // bd6: aload 0
      // bd7: aload 1
      // bd8: aload 12
      // bda: bipush 8
      // bdc: bipush -2
      // bde: bipush 9
      // be0: aload 5
      // be2: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // be5: aload 0
      // be6: aload 1
      // be7: aload 12
      // be9: bipush 8
      // beb: bipush -2
      // bed: bipush 10
      // bef: aload 5
      // bf1: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // bf4: aload 0
      // bf5: aload 1
      // bf6: getstatic net/minecraft/world/level/block/Blocks.REDSTONE_WIRE Lnet/minecraft/world/level/block/Block;
      // bf9: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // bfc: getstatic net/minecraft/world/level/block/RedstoneWireBlock.NORTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // bff: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // c02: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c05: checkcast net/minecraft/world/level/block/state/BlockState
      // c08: getstatic net/minecraft/world/level/block/RedstoneWireBlock.SOUTH Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c0b: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // c0e: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c11: checkcast net/minecraft/world/level/block/state/BlockState
      // c14: getstatic net/minecraft/world/level/block/RedstoneWireBlock.EAST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c17: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // c1a: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c1d: checkcast net/minecraft/world/level/block/state/BlockState
      // c20: getstatic net/minecraft/world/level/block/RedstoneWireBlock.WEST Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c23: getstatic net/minecraft/world/level/block/state/properties/RedstoneSide.SIDE Lnet/minecraft/world/level/block/state/properties/RedstoneSide;
      // c26: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c29: checkcast net/minecraft/world/level/block/state/BlockState
      // c2c: bipush 10
      // c2e: bipush -1
      // c2f: bipush 9
      // c31: aload 5
      // c33: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // c36: aload 0
      // c37: aload 1
      // c38: getstatic net/minecraft/world/level/block/Blocks.STICKY_PISTON Lnet/minecraft/world/level/block/Block;
      // c3b: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // c3e: getstatic net/minecraft/world/level/block/piston/PistonBaseBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c41: getstatic net/minecraft/core/Direction.UP Lnet/minecraft/core/Direction;
      // c44: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c47: checkcast net/minecraft/world/level/block/state/BlockState
      // c4a: bipush 9
      // c4c: bipush -2
      // c4e: bipush 8
      // c50: aload 5
      // c52: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // c55: aload 0
      // c56: aload 1
      // c57: getstatic net/minecraft/world/level/block/Blocks.STICKY_PISTON Lnet/minecraft/world/level/block/Block;
      // c5a: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // c5d: getstatic net/minecraft/world/level/block/piston/PistonBaseBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c60: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
      // c63: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c66: checkcast net/minecraft/world/level/block/state/BlockState
      // c69: bipush 10
      // c6b: bipush -2
      // c6d: bipush 8
      // c6f: aload 5
      // c71: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // c74: aload 0
      // c75: aload 1
      // c76: getstatic net/minecraft/world/level/block/Blocks.STICKY_PISTON Lnet/minecraft/world/level/block/Block;
      // c79: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // c7c: getstatic net/minecraft/world/level/block/piston/PistonBaseBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c7f: getstatic net/minecraft/core/Direction.WEST Lnet/minecraft/core/Direction;
      // c82: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // c85: checkcast net/minecraft/world/level/block/state/BlockState
      // c88: bipush 10
      // c8a: bipush -1
      // c8b: bipush 8
      // c8d: aload 5
      // c8f: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // c92: aload 0
      // c93: aload 1
      // c94: getstatic net/minecraft/world/level/block/Blocks.REPEATER Lnet/minecraft/world/level/block/Block;
      // c97: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // c9a: getstatic net/minecraft/world/level/block/RepeaterBlock.FACING Lnet/minecraft/world/level/block/state/properties/EnumProperty;
      // c9d: getstatic net/minecraft/core/Direction.NORTH Lnet/minecraft/core/Direction;
      // ca0: invokevirtual net/minecraft/world/level/block/state/BlockState.setValue (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
      // ca3: checkcast net/minecraft/world/level/block/state/BlockState
      // ca6: bipush 10
      // ca8: bipush -2
      // caa: bipush 10
      // cac: aload 5
      // cae: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placeBlock (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/block/state/BlockState;IIILnet/minecraft/world/level/levelgen/structure/BoundingBox;)V
      // cb1: aload 0
      // cb2: getfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedHiddenChest Z
      // cb5: ifne cce
      // cb8: aload 0
      // cb9: aload 0
      // cba: aload 1
      // cbb: aload 5
      // cbd: aload 4
      // cbf: bipush 9
      // cc1: bipush -3
      // cc3: bipush 10
      // cc5: getstatic net/minecraft/world/level/storage/loot/BuiltInLootTables.JUNGLE_TEMPLE Lnet/minecraft/resources/ResourceKey;
      // cc8: invokevirtual net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.createChest (Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/resources/ResourceKey;)Z
      // ccb: putfield net/minecraft/world/level/levelgen/structure/structures/JungleTemplePiece.placedHiddenChest Z
      // cce: return
   }

   private static class MossStoneSelector extends StructurePiece.BlockSelector {
      @Override
      public void next(final RandomSource random, final int worldX, final int worldY, final int worldZ, final boolean isEdge) {
         if (random.nextFloat() < 0.4F) {
            this.next = Blocks.COBBLESTONE.defaultBlockState();
         } else {
            this.next = Blocks.MOSSY_COBBLESTONE.defaultBlockState();
         }
      }
   }
}
