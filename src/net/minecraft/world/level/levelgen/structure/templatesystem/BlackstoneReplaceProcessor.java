package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public class BlackstoneReplaceProcessor implements StructureProcessor {
   public static final MapCodec<BlackstoneReplaceProcessor> MAP_CODEC = MapCodec.unit(() -> BlackstoneReplaceProcessor.INSTANCE);
   public static final BlackstoneReplaceProcessor INSTANCE = new BlackstoneReplaceProcessor();
   private final Map<Block, Block> replacements = Util.make(
      Maps.newHashMap(),
      param0 -> {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.OutOfMemoryError: Java heap space
         //   at java.base/java.util.HashMap.resize(HashMap.java:711)
         //   at java.base/java.util.HashMap.putVal(HashMap.java:670)
         //   at java.base/java.util.HashMap.put(HashMap.java:619)
         //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:41)
         //   at org.jetbrains.java.decompiler.util.collections.PackedMap.putWithKey(PackedMap.java:22)
         //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory.<init>(FastSparseSetFactory.java:30)
         //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:85)
         //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:67)
         //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:238)
         //
         // Bytecode:
         // 00: aload 0
         // 01: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE Lnet/minecraft/world/level/block/Block;
         // 04: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE Lnet/minecraft/world/level/block/Block;
         // 07: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 0a: pop
         // 0b: aload 0
         // 0c: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE Lnet/minecraft/world/level/block/Block;
         // 0f: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE Lnet/minecraft/world/level/block/Block;
         // 12: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 15: pop
         // 16: aload 0
         // 17: getstatic net/minecraft/world/level/block/Blocks.STONE Lnet/minecraft/world/level/block/Block;
         // 1a: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE Lnet/minecraft/world/level/block/Block;
         // 1d: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 20: pop
         // 21: aload 0
         // 22: getstatic net/minecraft/world/level/block/Blocks.STONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // 25: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // 28: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 2b: pop
         // 2c: aload 0
         // 2d: getstatic net/minecraft/world/level/block/Blocks.MOSSY_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // 30: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // 33: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 36: pop
         // 37: aload 0
         // 38: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 3b: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 3e: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 41: pop
         // 42: aload 0
         // 43: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 46: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 49: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 4c: pop
         // 4d: aload 0
         // 4e: getstatic net/minecraft/world/level/block/Blocks.STONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 51: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_STAIRS Lnet/minecraft/world/level/block/Block;
         // 54: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 57: pop
         // 58: aload 0
         // 59: getstatic net/minecraft/world/level/block/Blocks.STONE_BRICK_STAIRS Lnet/minecraft/world/level/block/Block;
         // 5c: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS Lnet/minecraft/world/level/block/Block;
         // 5f: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 62: pop
         // 63: aload 0
         // 64: getstatic net/minecraft/world/level/block/Blocks.MOSSY_STONE_BRICK_STAIRS Lnet/minecraft/world/level/block/Block;
         // 67: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS Lnet/minecraft/world/level/block/Block;
         // 6a: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 6d: pop
         // 6e: aload 0
         // 6f: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 72: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 75: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 78: pop
         // 79: aload 0
         // 7a: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 7d: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 80: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 83: pop
         // 84: aload 0
         // 85: getstatic net/minecraft/world/level/block/Blocks.SMOOTH_STONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 88: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 8b: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 8e: pop
         // 8f: aload 0
         // 90: getstatic net/minecraft/world/level/block/Blocks.STONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 93: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_SLAB Lnet/minecraft/world/level/block/Block;
         // 96: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // 99: pop
         // 9a: aload 0
         // 9b: getstatic net/minecraft/world/level/block/Blocks.STONE_BRICK_SLAB Lnet/minecraft/world/level/block/Block;
         // 9e: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_SLAB Lnet/minecraft/world/level/block/Block;
         // a1: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // a4: pop
         // a5: aload 0
         // a6: getstatic net/minecraft/world/level/block/Blocks.MOSSY_STONE_BRICK_SLAB Lnet/minecraft/world/level/block/Block;
         // a9: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_SLAB Lnet/minecraft/world/level/block/Block;
         // ac: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // af: pop
         // b0: aload 0
         // b1: getstatic net/minecraft/world/level/block/Blocks.STONE_BRICK_WALL Lnet/minecraft/world/level/block/Block;
         // b4: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_WALL Lnet/minecraft/world/level/block/Block;
         // b7: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // ba: pop
         // bb: aload 0
         // bc: getstatic net/minecraft/world/level/block/Blocks.MOSSY_STONE_BRICK_WALL Lnet/minecraft/world/level/block/Block;
         // bf: getstatic net/minecraft/world/level/block/Blocks.POLISHED_BLACKSTONE_BRICK_WALL Lnet/minecraft/world/level/block/Block;
         // c2: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // c5: pop
         // c6: aload 0
         // c7: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE_WALL Lnet/minecraft/world/level/block/Block;
         // ca: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_WALL Lnet/minecraft/world/level/block/Block;
         // cd: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // d0: pop
         // d1: aload 0
         // d2: getstatic net/minecraft/world/level/block/Blocks.MOSSY_COBBLESTONE_WALL Lnet/minecraft/world/level/block/Block;
         // d5: getstatic net/minecraft/world/level/block/Blocks.BLACKSTONE_WALL Lnet/minecraft/world/level/block/Block;
         // d8: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // db: pop
         // dc: aload 0
         // dd: getstatic net/minecraft/world/level/block/Blocks.CHISELED_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // e0: getstatic net/minecraft/world/level/block/Blocks.CHISELED_POLISHED_BLACKSTONE Lnet/minecraft/world/level/block/Block;
         // e3: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // e6: pop
         // e7: aload 0
         // e8: getstatic net/minecraft/world/level/block/Blocks.CRACKED_STONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // eb: getstatic net/minecraft/world/level/block/Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS Lnet/minecraft/world/level/block/Block;
         // ee: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // f1: pop
         // f2: aload 0
         // f3: getstatic net/minecraft/world/level/block/Blocks.IRON_BARS Lnet/minecraft/world/level/block/Block;
         // f6: getstatic net/minecraft/world/level/block/Blocks.IRON_CHAIN Lnet/minecraft/world/level/block/Block;
         // f9: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         // fc: pop
         // fd: return
      }
   );

   private BlackstoneReplaceProcessor() {
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
      Block newBlock = this.replacements.get(processedBlockInfo.state().getBlock());
      if (newBlock == null) {
         return processedBlockInfo;
      }

      BlockState oldState = processedBlockInfo.state();
      BlockState newState = newBlock.defaultBlockState();
      if (oldState.hasProperty(StairBlock.FACING)) {
         newState = newState.setValue(StairBlock.FACING, oldState.getValue(StairBlock.FACING));
      }

      if (oldState.hasProperty(StairBlock.HALF)) {
         newState = newState.setValue(StairBlock.HALF, oldState.getValue(StairBlock.HALF));
      }

      if (oldState.hasProperty(SlabBlock.TYPE)) {
         newState = newState.setValue(SlabBlock.TYPE, oldState.getValue(SlabBlock.TYPE));
      }

      return new StructureTemplate.StructureBlockInfo(processedBlockInfo.pos(), newState, processedBlockInfo.nbt());
   }

   @Override
   public MapCodec<BlackstoneReplaceProcessor> codec() {
      return MAP_CODEC;
   }
}
