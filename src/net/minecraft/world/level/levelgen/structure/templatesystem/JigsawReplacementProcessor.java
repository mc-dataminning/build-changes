package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class JigsawReplacementProcessor implements StructureProcessor {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final MapCodec<JigsawReplacementProcessor> MAP_CODEC = MapCodec.unit(() -> JigsawReplacementProcessor.INSTANCE);
   public static final JigsawReplacementProcessor INSTANCE = new JigsawReplacementProcessor();

   private JigsawReplacementProcessor() {
   }

   @Override
   public StructureTemplate.@Nullable StructureBlockInfo processBlock(
      final LevelReader level,
      final BlockPos targetPosition,
      final BlockPos referencePos,
      final BlockPos templateRelativePos,
      final StructureTemplate.StructureBlockInfo processedBlockInfo,
      final StructurePlaceSettings settings
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 5
      // 02: invokevirtual net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo.state ()Lnet/minecraft/world/level/block/state/BlockState;
      // 05: astore 7
      // 07: aload 7
      // 09: getstatic net/minecraft/world/level/block/Blocks.JIGSAW Lnet/minecraft/world/level/block/Block;
      // 0c: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 0f: ifeq 18
      // 12: getstatic net/minecraft/SharedConstants.DEBUG_KEEP_JIGSAW_BLOCKS_DURING_STRUCTURE_GEN Z
      // 15: ifeq 1b
      // 18: aload 5
      // 1a: areturn
      // 1b: aload 5
      // 1d: invokevirtual net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo.nbt ()Lnet/minecraft/nbt/CompoundTag;
      // 20: ifnonnull 31
      // 23: getstatic net/minecraft/world/level/levelgen/structure/templatesystem/JigsawReplacementProcessor.LOGGER Lorg/slf4j/Logger;
      // 26: ldc "Jigsaw block at {} is missing nbt, will not replace"
      // 28: aload 2
      // 29: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 2e: aload 5
      // 30: areturn
      // 31: aload 5
      // 33: invokevirtual net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo.nbt ()Lnet/minecraft/nbt/CompoundTag;
      // 36: ldc "final_state"
      // 38: ldc "minecraft:air"
      // 3a: invokevirtual net/minecraft/nbt/CompoundTag.getStringOr (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 3d: astore 8
      // 3f: aload 1
      // 40: getstatic net/minecraft/core/registries/Registries.BLOCK Lnet/minecraft/resources/ResourceKey;
      // 43: invokeinterface net/minecraft/world/level/LevelReader.holderLookup (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/HolderLookup; 2
      // 48: aload 8
      // 4a: bipush 1
      // 4b: invokestatic net/minecraft/commands/arguments/blocks/BlockStateParser.parseForBlock (Lnet/minecraft/core/HolderLookup;Ljava/lang/String;Z)Lnet/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult;
      // 4e: astore 10
      // 50: aload 10
      // 52: invokevirtual net/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult.blockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 55: astore 9
      // 57: goto 7d
      // 5a: astore 10
      // 5c: getstatic net/minecraft/world/level/levelgen/structure/templatesystem/JigsawReplacementProcessor.LOGGER Lorg/slf4j/Logger;
      // 5f: ldc "Failed to parse jigsaw replacement state '{}' at {}: {}"
      // 61: bipush 3
      // 62: anewarray 2
      // 65: dup
      // 66: bipush 0
      // 67: aload 8
      // 69: aastore
      // 6a: dup
      // 6b: bipush 1
      // 6c: aload 2
      // 6d: aastore
      // 6e: dup
      // 6f: bipush 2
      // 70: aload 10
      // 72: invokevirtual com/mojang/brigadier/exceptions/CommandSyntaxException.getMessage ()Ljava/lang/String;
      // 75: aastore
      // 76: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 7b: aconst_null
      // 7c: areturn
      // 7d: aload 9
      // 7f: getstatic net/minecraft/world/level/block/Blocks.STRUCTURE_VOID Lnet/minecraft/world/level/block/Block;
      // 82: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 85: ifeq 8a
      // 88: aconst_null
      // 89: areturn
      // 8a: new net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo
      // 8d: dup
      // 8e: aload 5
      // 90: invokevirtual net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo.pos ()Lnet/minecraft/core/BlockPos;
      // 93: aload 9
      // 95: aconst_null
      // 96: invokespecial net/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate$StructureBlockInfo.<init> (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/nbt/CompoundTag;)V
      // 99: areturn
      // try (26 -> 36): 37 com/mojang/brigadier/exceptions/CommandSyntaxException
   }

   @Override
   public MapCodec<JigsawReplacementProcessor> codec() {
      return MAP_CODEC;
   }
}
