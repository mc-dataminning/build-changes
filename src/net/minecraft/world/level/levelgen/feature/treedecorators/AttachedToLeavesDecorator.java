package net.minecraft.world.level.levelgen.feature.treedecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class AttachedToLeavesDecorator extends TreeDecorator {
   public static final MapCodec<AttachedToLeavesDecorator> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(p -> p.probability),
            Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter(p -> p.exclusionRadiusXZ),
            Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter(p -> p.exclusionRadiusY),
            BlockStateProvider.CODEC.fieldOf("block_provider").forGetter(p -> p.blockProvider),
            Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter(p -> p.requiredEmptyBlocks),
            ExtraCodecs.nonEmptyList(Direction.CODEC.listOf()).fieldOf("directions").forGetter(p -> p.directions)
         )
         .apply(i, AttachedToLeavesDecorator::new)
   );
   protected final float probability;
   protected final int exclusionRadiusXZ;
   protected final int exclusionRadiusY;
   protected final Holder<BlockStateProvider> blockProvider;
   protected final int requiredEmptyBlocks;
   protected final List<Direction> directions;

   public AttachedToLeavesDecorator(
      final float probability,
      final int exclusionRadiusXZ,
      final int exclusionRadiusY,
      final Holder<BlockStateProvider> blockProvider,
      final int requiredEmptyBlocks,
      final List<Direction> directions
   ) {
      this.probability = probability;
      this.exclusionRadiusXZ = exclusionRadiusXZ;
      this.exclusionRadiusY = exclusionRadiusY;
      this.blockProvider = blockProvider;
      this.requiredEmptyBlocks = requiredEmptyBlocks;
      this.directions = directions;
   }

   @Override
   public void place(final TreeDecorator.Context context) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: new java/util/HashSet
      // 03: dup
      // 04: invokespecial java/util/HashSet.<init> ()V
      // 07: astore 2
      // 08: aload 1
      // 09: invokevirtual net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.random ()Lnet/minecraft/util/RandomSource;
      // 0c: astore 3
      // 0d: aload 1
      // 0e: invokevirtual net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.leaves ()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
      // 11: aload 3
      // 12: invokestatic net/minecraft/util/Util.shuffledCopy (Lit/unimi/dsi/fastutil/objects/ObjectArrayList;Lnet/minecraft/util/RandomSource;)Ljava/util/List;
      // 15: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 4
      // 1c: aload 4
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq ed
      // 26: aload 4
      // 28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d: checkcast net/minecraft/core/BlockPos
      // 30: astore 5
      // 32: aload 0
      // 33: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.directions Ljava/util/List;
      // 36: aload 3
      // 37: invokestatic net/minecraft/util/Util.getRandom (Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;
      // 3a: checkcast net/minecraft/core/Direction
      // 3d: astore 6
      // 3f: aload 5
      // 41: aload 6
      // 43: invokevirtual net/minecraft/core/BlockPos.relative (Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;
      // 46: astore 7
      // 48: aload 2
      // 49: aload 7
      // 4b: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 50: ifeq 56
      // 53: goto 1c
      // 56: aload 3
      // 57: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 5c: aload 0
      // 5d: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.probability F
      // 60: fcmpg
      // 61: ifge ea
      // 64: aload 0
      // 65: aload 1
      // 66: aload 5
      // 68: aload 6
      // 6a: invokevirtual net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.hasRequiredEmptyBlocks (Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z
      // 6d: ifeq ea
      // 70: aload 7
      // 72: aload 0
      // 73: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusXZ I
      // 76: ineg
      // 77: aload 0
      // 78: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusY I
      // 7b: ineg
      // 7c: aload 0
      // 7d: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusXZ I
      // 80: ineg
      // 81: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 84: astore 8
      // 86: aload 7
      // 88: aload 0
      // 89: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusXZ I
      // 8c: aload 0
      // 8d: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusY I
      // 90: aload 0
      // 91: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.exclusionRadiusXZ I
      // 94: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 97: astore 9
      // 99: aload 8
      // 9b: aload 9
      // 9d: invokestatic net/minecraft/core/BlockPos.betweenClosed (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Iterable;
      // a0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // a5: astore 10
      // a7: aload 10
      // a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // ae: ifeq cc
      // b1: aload 10
      // b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b8: checkcast net/minecraft/core/BlockPos
      // bb: astore 11
      // bd: aload 2
      // be: aload 11
      // c0: invokevirtual net/minecraft/core/BlockPos.immutable ()Lnet/minecraft/core/BlockPos;
      // c3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c8: pop
      // c9: goto a7
      // cc: aload 1
      // cd: aload 7
      // cf: aload 0
      // d0: getfield net/minecraft/world/level/levelgen/feature/treedecorators/AttachedToLeavesDecorator.blockProvider Lnet/minecraft/core/Holder;
      // d3: invokeinterface net/minecraft/core/Holder.value ()Ljava/lang/Object; 1
      // d8: checkcast net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider
      // db: aload 1
      // dc: invokevirtual net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.level ()Lnet/minecraft/world/level/WorldGenLevel;
      // df: aload 3
      // e0: aload 7
      // e2: invokeinterface net/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider.getState (Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState; 4
      // e7: invokevirtual net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.setBlock (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V
      // ea: goto 1c
      // ed: return
   }

   private boolean hasRequiredEmptyBlocks(final TreeDecorator.Context context, final BlockPos leafPos, final Direction direction) {
      for (int i = 1; i <= this.requiredEmptyBlocks; i++) {
         BlockPos offsetPos = leafPos.relative(direction, i);
         if (!context.isAir(offsetPos)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected TreeDecoratorType<?> type() {
      return TreeDecoratorType.ATTACHED_TO_LEAVES;
   }
}
