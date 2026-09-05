package net.minecraft.world.level.levelgen.placement;

import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;

@Deprecated
public record CountOnEveryLayerPlacement(IntProvider count) implements PlacementModifier {
   public static final MapCodec<CountOnEveryLayerPlacement> CODEC = IntProviders.codec(0, 256)
      .fieldOf("count")
      .xmap(CountOnEveryLayerPlacement::new, CountOnEveryLayerPlacement::count);

   public static CountOnEveryLayerPlacement of(final IntProvider count) {
      return new CountOnEveryLayerPlacement(count);
   }

   public static CountOnEveryLayerPlacement of(final int count) {
      return of(ConstantInt.of(count));
   }

   @Override
   public void modify(final PlacementContext context, final RandomSource random, final BlockPos origin, final Consumer<BlockPos> output) {
      int layer = 0;

      boolean foundAny;
      do {
         foundAny = false;

         for (int i = 0; i < this.count.sample(random); i++) {
            int x = random.nextInt(16) + origin.getX();
            int z = random.nextInt(16) + origin.getZ();
            int startY = context.getHeight(Heightmap.Types.MOTION_BLOCKING, x, z);
            int y = findOnGroundYPosition(context, x, startY, z, layer);
            if (y != Integer.MAX_VALUE) {
               output.accept(new BlockPos(x, y, z));
               foundAny = true;
            }
         }

         layer++;
      } while (foundAny);
   }

   @Override
   public MapCodec<CountOnEveryLayerPlacement> codec() {
      return CODEC;
   }

   private static int findOnGroundYPosition(final PlacementContext context, final int xStart, final int yStart, final int zStart, final int layerToPlaceOn) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectNode.<init>(DirectNode.java:23)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectNode.forStat(DirectNode.java:39)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.createDirectNode(FlattenStatementsHelper.java:92)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.createDirectNode(FlattenStatementsHelper.java:104)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:445)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:478)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:257)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:478)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:474)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:86)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:224)
      //
      // Bytecode:
      // 00: new net/minecraft/core/BlockPos$MutableBlockPos
      // 03: dup
      // 04: iload 1
      // 05: iload 2
      // 06: iload 3
      // 07: invokespecial net/minecraft/core/BlockPos$MutableBlockPos.<init> (III)V
      // 0a: astore 5
      // 0c: bipush 0
      // 0d: istore 6
      // 0f: aload 0
      // 10: aload 5
      // 12: invokevirtual net/minecraft/world/level/levelgen/placement/PlacementContext.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 15: astore 7
      // 17: iload 2
      // 18: istore 8
      // 1a: iload 8
      // 1c: aload 0
      // 1d: invokevirtual net/minecraft/world/level/levelgen/placement/PlacementContext.getMinY ()I
      // 20: bipush 1
      // 21: iadd
      // 22: if_icmplt 6e
      // 25: aload 5
      // 27: iload 8
      // 29: bipush 1
      // 2a: isub
      // 2b: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.setY (I)Lnet/minecraft/core/BlockPos$MutableBlockPos;
      // 2e: pop
      // 2f: aload 0
      // 30: aload 5
      // 32: invokevirtual net/minecraft/world/level/levelgen/placement/PlacementContext.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 35: astore 9
      // 37: aload 9
      // 39: invokestatic net/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement.isEmpty (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 3c: ifne 64
      // 3f: aload 7
      // 41: invokestatic net/minecraft/world/level/levelgen/placement/CountOnEveryLayerPlacement.isEmpty (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 44: ifeq 64
      // 47: aload 9
      // 49: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 4c: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 4f: ifne 64
      // 52: iload 6
      // 54: iload 4
      // 56: if_icmpne 61
      // 59: aload 5
      // 5b: invokevirtual net/minecraft/core/BlockPos$MutableBlockPos.getY ()I
      // 5e: bipush 1
      // 5f: iadd
      // 60: ireturn
      // 61: iinc 6 1
      // 64: aload 9
      // 66: astore 7
      // 68: iinc 8 -1
      // 6b: goto 1a
      // 6e: ldc 2147483647
      // 70: ireturn
   }

   private static boolean isEmpty(final BlockState blockState) {
      return blockState.isAir() || blockState.is(Blocks.WATER) || blockState.is(Blocks.LAVA);
   }
}
