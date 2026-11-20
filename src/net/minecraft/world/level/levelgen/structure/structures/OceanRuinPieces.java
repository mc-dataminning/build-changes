package net.minecraft.world.level.levelgen.structure.structures;

import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.monster.zombie.Drowned;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockRotProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.CappedProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.PosAlwaysTrueTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity.AppendLoot;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;

public class OceanRuinPieces {
   private static final StructureProcessor WARM_SUSPICIOUS_BLOCK_PROCESSOR = archyRuleProcessor(
      Blocks.SAND, Blocks.SUSPICIOUS_SAND, BuiltInLootTables.OCEAN_RUIN_WARM_ARCHAEOLOGY
   );
   private static final StructureProcessor COLD_SUSPICIOUS_BLOCK_PROCESSOR = archyRuleProcessor(
      Blocks.GRAVEL, Blocks.SUSPICIOUS_GRAVEL, BuiltInLootTables.OCEAN_RUIN_COLD_ARCHAEOLOGY
   );
   private static final Identifier[] WARM_RUINS = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/warm_1"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_2"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_3"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_4"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_5"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_6"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_7"),
      Identifier.withDefaultNamespace("underwater_ruin/warm_8")
   };
   private static final Identifier[] RUINS_BRICK = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/brick_1"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_2"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_3"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_4"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_5"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_6"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_7"),
      Identifier.withDefaultNamespace("underwater_ruin/brick_8")
   };
   private static final Identifier[] RUINS_CRACKED = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/cracked_1"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_2"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_3"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_4"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_5"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_6"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_7"),
      Identifier.withDefaultNamespace("underwater_ruin/cracked_8")
   };
   private static final Identifier[] RUINS_MOSSY = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/mossy_1"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_2"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_3"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_4"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_5"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_6"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_7"),
      Identifier.withDefaultNamespace("underwater_ruin/mossy_8")
   };
   private static final Identifier[] BIG_RUINS_BRICK = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/big_brick_1"),
      Identifier.withDefaultNamespace("underwater_ruin/big_brick_2"),
      Identifier.withDefaultNamespace("underwater_ruin/big_brick_3"),
      Identifier.withDefaultNamespace("underwater_ruin/big_brick_8")
   };
   private static final Identifier[] BIG_RUINS_MOSSY = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/big_mossy_1"),
      Identifier.withDefaultNamespace("underwater_ruin/big_mossy_2"),
      Identifier.withDefaultNamespace("underwater_ruin/big_mossy_3"),
      Identifier.withDefaultNamespace("underwater_ruin/big_mossy_8")
   };
   private static final Identifier[] BIG_RUINS_CRACKED = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/big_cracked_1"),
      Identifier.withDefaultNamespace("underwater_ruin/big_cracked_2"),
      Identifier.withDefaultNamespace("underwater_ruin/big_cracked_3"),
      Identifier.withDefaultNamespace("underwater_ruin/big_cracked_8")
   };
   private static final Identifier[] BIG_WARM_RUINS = new Identifier[]{
      Identifier.withDefaultNamespace("underwater_ruin/big_warm_4"),
      Identifier.withDefaultNamespace("underwater_ruin/big_warm_5"),
      Identifier.withDefaultNamespace("underwater_ruin/big_warm_6"),
      Identifier.withDefaultNamespace("underwater_ruin/big_warm_7")
   };

   private static StructureProcessor archyRuleProcessor(final Block candidateBlock, final Block replacementBlock, final ResourceKey<LootTable> lootTable) {
      return new CappedProcessor(
         new RuleProcessor(
            List.of(
               new ProcessorRule(
                  new BlockMatchTest(candidateBlock),
                  AlwaysTrueTest.INSTANCE,
                  PosAlwaysTrueTest.INSTANCE,
                  replacementBlock.defaultBlockState(),
                  new AppendLoot(lootTable)
               )
            )
         ),
         ConstantInt.of(5)
      );
   }

   private static Identifier getSmallWarmRuin(final RandomSource random) {
      return Util.getRandom(WARM_RUINS, random);
   }

   private static Identifier getBigWarmRuin(final RandomSource random) {
      return Util.getRandom(BIG_WARM_RUINS, random);
   }

   public static void addPieces(
      final StructureTemplateManager structureTemplateManager,
      final BlockPos position,
      final Rotation rotation,
      final StructurePiecesBuilder builder,
      final RandomSource random,
      final OceanRuinStructure structure
   ) {
      boolean isLarge = random.nextFloat() <= structure.largeProbability;
      float baseIntegrity = isLarge ? 0.9F : 0.8F;
      addPiece(structureTemplateManager, position, rotation, builder, random, structure, isLarge, baseIntegrity);
      if (isLarge && random.nextFloat() <= structure.clusterProbability) {
         addClusterRuins(structureTemplateManager, random, rotation, position, structure, builder);
      }
   }

   private static void addClusterRuins(
      final StructureTemplateManager structureTemplateManager,
      final RandomSource random,
      final Rotation rotation,
      final BlockPos p,
      final OceanRuinStructure structure,
      final StructurePiecesBuilder builder
   ) {
      BlockPos parentPos = new BlockPos(p.getX(), 90, p.getZ());
      BlockPos parentCorner = StructureTemplate.transform(new BlockPos(15, 0, 15), Mirror.NONE, rotation, BlockPos.ZERO).offset(parentPos);
      BoundingBox parentBB = BoundingBox.fromCorners(parentPos, parentCorner);
      BlockPos parentBottomLeft = new BlockPos(
         Math.min(parentPos.getX(), parentCorner.getX()), parentPos.getY(), Math.min(parentPos.getZ(), parentCorner.getZ())
      );
      List<BlockPos> allPositions = allPositions(random, parentBottomLeft);
      int ruins = Mth.nextInt(random, 4, 8);

      for (int i = 0; i < ruins; i++) {
         if (!allPositions.isEmpty()) {
            int idx = random.nextInt(allPositions.size());
            BlockPos pos = allPositions.remove(idx);
            Rotation nextRotation = Rotation.getRandom(random);
            BlockPos nextCorner = StructureTemplate.transform(new BlockPos(5, 0, 6), Mirror.NONE, nextRotation, BlockPos.ZERO).offset(pos);
            BoundingBox nextBB = BoundingBox.fromCorners(pos, nextCorner);
            if (!nextBB.intersects(parentBB)) {
               addPiece(structureTemplateManager, pos, nextRotation, builder, random, structure, false, 0.8F);
            }
         }
      }
   }

   private static List<BlockPos> allPositions(final RandomSource random, final BlockPos origin) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at java.base/java.util.Arrays.copyOf(Arrays.java:3478)
      //   at java.base/java.util.ArrayList.toArray(ArrayList.java:370)
      //   at java.base/java.util.ArrayList.addAll(ArrayList.java:753)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.getAllExprents(InvocationExprent.java:678)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:159)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateChildExprent(StackVarsProcessor.java:761)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateExprent(StackVarsProcessor.java:321)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.iterateStatements(StackVarsProcessor.java:192)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:91)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 2
      // 04: aload 2
      // 05: aload 1
      // 06: bipush -16
      // 08: aload 0
      // 09: bipush 1
      // 0a: bipush 8
      // 0c: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 0f: iadd
      // 10: bipush 0
      // 11: bipush 16
      // 13: aload 0
      // 14: bipush 1
      // 15: bipush 7
      // 17: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 1a: iadd
      // 1b: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 1e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 23: pop
      // 24: aload 2
      // 25: aload 1
      // 26: bipush -16
      // 28: aload 0
      // 29: bipush 1
      // 2a: bipush 8
      // 2c: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 2f: iadd
      // 30: bipush 0
      // 31: aload 0
      // 32: bipush 1
      // 33: bipush 7
      // 35: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 38: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 3b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 40: pop
      // 41: aload 2
      // 42: aload 1
      // 43: bipush -16
      // 45: aload 0
      // 46: bipush 1
      // 47: bipush 8
      // 49: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 4c: iadd
      // 4d: bipush 0
      // 4e: bipush -16
      // 50: aload 0
      // 51: bipush 4
      // 52: bipush 8
      // 54: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 57: iadd
      // 58: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 2
      // 62: aload 1
      // 63: aload 0
      // 64: bipush 1
      // 65: bipush 7
      // 67: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 6a: bipush 0
      // 6b: bipush 16
      // 6d: aload 0
      // 6e: bipush 1
      // 6f: bipush 7
      // 71: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 74: iadd
      // 75: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 78: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7d: pop
      // 7e: aload 2
      // 7f: aload 1
      // 80: aload 0
      // 81: bipush 1
      // 82: bipush 7
      // 84: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 87: bipush 0
      // 88: bipush -16
      // 8a: aload 0
      // 8b: bipush 4
      // 8c: bipush 6
      // 8e: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // 91: iadd
      // 92: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 95: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9a: pop
      // 9b: aload 2
      // 9c: aload 1
      // 9d: bipush 16
      // 9f: aload 0
      // a0: bipush 1
      // a1: bipush 7
      // a3: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // a6: iadd
      // a7: bipush 0
      // a8: bipush 16
      // aa: aload 0
      // ab: bipush 3
      // ac: bipush 8
      // ae: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // b1: iadd
      // b2: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // b5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ba: pop
      // bb: aload 2
      // bc: aload 1
      // bd: bipush 16
      // bf: aload 0
      // c0: bipush 1
      // c1: bipush 7
      // c3: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // c6: iadd
      // c7: bipush 0
      // c8: aload 0
      // c9: bipush 1
      // ca: bipush 7
      // cc: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // cf: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // d2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d7: pop
      // d8: aload 2
      // d9: aload 1
      // da: bipush 16
      // dc: aload 0
      // dd: bipush 1
      // de: bipush 7
      // e0: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // e3: iadd
      // e4: bipush 0
      // e5: bipush -16
      // e7: aload 0
      // e8: bipush 4
      // e9: bipush 8
      // eb: invokestatic net/minecraft/util/Mth.nextInt (Lnet/minecraft/util/RandomSource;II)I
      // ee: iadd
      // ef: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // f2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // f7: pop
      // f8: aload 2
      // f9: areturn
   }

   private static void addPiece(
      final StructureTemplateManager structureTemplateManager,
      final BlockPos position,
      final Rotation rotation,
      final StructurePiecesBuilder builder,
      final RandomSource random,
      final OceanRuinStructure structure,
      final boolean isLarge,
      final float baseIntegrity
   ) {
      switch (structure.biomeTemp) {
         case WARM:
         default:
            Identifier startPieceLocation = isLarge ? getBigWarmRuin(random) : getSmallWarmRuin(random);
            builder.addPiece(
               new OceanRuinPieces.OceanRuinPiece(structureTemplateManager, startPieceLocation, position, rotation, baseIntegrity, structure.biomeTemp, isLarge)
            );
            break;
         case COLD:
            Identifier[] bricks = isLarge ? BIG_RUINS_BRICK : RUINS_BRICK;
            Identifier[] cracked = isLarge ? BIG_RUINS_CRACKED : RUINS_CRACKED;
            Identifier[] mossy = isLarge ? BIG_RUINS_MOSSY : RUINS_MOSSY;
            int idx = random.nextInt(bricks.length);
            builder.addPiece(
               new OceanRuinPieces.OceanRuinPiece(structureTemplateManager, bricks[idx], position, rotation, baseIntegrity, structure.biomeTemp, isLarge)
            );
            builder.addPiece(new OceanRuinPieces.OceanRuinPiece(structureTemplateManager, cracked[idx], position, rotation, 0.7F, structure.biomeTemp, isLarge));
            builder.addPiece(new OceanRuinPieces.OceanRuinPiece(structureTemplateManager, mossy[idx], position, rotation, 0.5F, structure.biomeTemp, isLarge));
      }
   }

   public static class OceanRuinPiece extends TemplateStructurePiece {
      private final OceanRuinStructure.Type biomeType;
      private final float integrity;
      private final boolean isLarge;

      public OceanRuinPiece(
         final StructureTemplateManager structureTemplateManager,
         final Identifier templateLocation,
         final BlockPos position,
         final Rotation rotation,
         final float integrity,
         final OceanRuinStructure.Type biomeType,
         final boolean isLarge
      ) {
         super(
            StructurePieceType.OCEAN_RUIN,
            0,
            structureTemplateManager,
            templateLocation,
            templateLocation.toString(),
            makeSettings(rotation, integrity, biomeType),
            position
         );
         this.integrity = integrity;
         this.biomeType = biomeType;
         this.isLarge = isLarge;
      }

      private OceanRuinPiece(
         final StructureTemplateManager structureTemplateManager,
         final CompoundTag tag,
         final Rotation rotation,
         final float integrity,
         final OceanRuinStructure.Type biomeType,
         final boolean isLarge
      ) {
         super(StructurePieceType.OCEAN_RUIN, tag, structureTemplateManager, location -> makeSettings(rotation, integrity, biomeType));
         this.integrity = integrity;
         this.biomeType = biomeType;
         this.isLarge = isLarge;
      }

      private static StructurePlaceSettings makeSettings(final Rotation rotation, final float integrity, final OceanRuinStructure.Type biomeType) {
         StructureProcessor suspiciousBlockProcessor = biomeType == OceanRuinStructure.Type.COLD
            ? OceanRuinPieces.COLD_SUSPICIOUS_BLOCK_PROCESSOR
            : OceanRuinPieces.WARM_SUSPICIOUS_BLOCK_PROCESSOR;
         return new StructurePlaceSettings()
            .setRotation(rotation)
            .setMirror(Mirror.NONE)
            .addProcessor(new BlockRotProcessor(integrity))
            .addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR)
            .addProcessor(suspiciousBlockProcessor);
      }

      public static OceanRuinPieces.OceanRuinPiece create(final StructureTemplateManager structureTemplateManager, final CompoundTag tag) {
         Rotation rotation = tag.<Rotation>read("Rot", Rotation.LEGACY_CODEC).orElseThrow();
         float integrity = tag.getFloatOr("Integrity", 0.0F);
         OceanRuinStructure.Type biomeType = tag.<OceanRuinStructure.Type>read("BiomeType", OceanRuinStructure.Type.LEGACY_CODEC).orElseThrow();
         boolean isLarge = tag.getBooleanOr("IsLarge", false);
         return new OceanRuinPieces.OceanRuinPiece(structureTemplateManager, tag, rotation, integrity, biomeType, isLarge);
      }

      @Override
      protected void addAdditionalSaveData(final StructurePieceSerializationContext context, final CompoundTag tag) {
         super.addAdditionalSaveData(context, tag);
         tag.store("Rot", Rotation.LEGACY_CODEC, this.placeSettings.getRotation());
         tag.putFloat("Integrity", this.integrity);
         tag.store("BiomeType", OceanRuinStructure.Type.LEGACY_CODEC, this.biomeType);
         tag.putBoolean("IsLarge", this.isLarge);
      }

      @Override
      protected void handleDataMarker(
         final String markerId, final BlockPos position, final ServerLevelAccessor level, final RandomSource random, final BoundingBox chunkBB
      ) {
         if ("chest".equals(markerId)) {
            level.setBlock(position, Blocks.CHEST.defaultBlockState().setValue(ChestBlock.WATERLOGGED, level.getFluidState(position).is(FluidTags.WATER)), 2);
            if (level.getBlockEntity(position) instanceof ChestBlockEntity chestBlockEntity) {
               chestBlockEntity.setLootTable(this.isLarge ? BuiltInLootTables.UNDERWATER_RUIN_BIG : BuiltInLootTables.UNDERWATER_RUIN_SMALL, random.nextLong());
            }
         } else if ("drowned".equals(markerId)) {
            Drowned drowned = EntityTypes.DROWNED.create(level.getLevel(), EntitySpawnReason.STRUCTURE);
            if (drowned != null) {
               drowned.setPersistenceRequired();
               drowned.snapTo(position, 0.0F, 0.0F);
               drowned.finalizeSpawn(level, level.getCurrentDifficultyAt(position), EntitySpawnReason.STRUCTURE, null);
               level.addFreshEntityWithPassengers(drowned);
               if (position.getY() > level.getSeaLevel()) {
                  level.setBlock(position, Blocks.AIR.defaultBlockState(), 2);
               } else {
                  level.setBlock(position, Blocks.WATER.defaultBlockState(), 2);
               }
            }
         }
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
         int height = level.getHeight(Heightmap.Types.OCEAN_FLOOR_WG, this.templatePosition.getX(), this.templatePosition.getZ());
         this.templatePosition = new BlockPos(this.templatePosition.getX(), height, this.templatePosition.getZ());
         BlockPos corner = StructureTemplate.transform(
               new BlockPos(this.template.getSize().getX() - 1, 0, this.template.getSize().getZ() - 1),
               Mirror.NONE,
               this.placeSettings.getRotation(),
               BlockPos.ZERO
            )
            .offset(this.templatePosition);
         this.templatePosition = new BlockPos(this.templatePosition.getX(), this.getHeight(this.templatePosition, level, corner), this.templatePosition.getZ());
         super.postProcess(level, structureManager, generator, random, chunkBB, chunkPos, referencePos);
      }

      private int getHeight(final BlockPos pos, final BlockGetter level, final BlockPos corner) {
         int newY = pos.getY();
         int minY = 512;
         int topY = newY - 1;
         int area = 0;

         for (BlockPos p : BlockPos.betweenClosed(pos, corner)) {
            int x = p.getX();
            int z = p.getZ();
            int floorY = pos.getY() - 1;
            BlockPos.MutableBlockPos tempPos = new BlockPos.MutableBlockPos(x, floorY, z);
            BlockState tempState = level.getBlockState(tempPos);

            for (FluidState tempFluid = level.getFluidState(tempPos);
               (tempState.isAir() || tempFluid.is(FluidTags.WATER) || tempState.is(BlockTags.ICE)) && floorY > level.getMinY() + 1;
               tempFluid = level.getFluidState(tempPos)
            ) {
               tempPos.set(x, --floorY, z);
               tempState = level.getBlockState(tempPos);
            }

            minY = Math.min(minY, floorY);
            if (floorY < topY - 2) {
               area++;
            }
         }

         int width = Math.abs(pos.getX() - corner.getX());
         if (topY - minY > 2 && area > width - 2) {
            newY = minY + 1;
         }

         return newY;
      }
   }
}
