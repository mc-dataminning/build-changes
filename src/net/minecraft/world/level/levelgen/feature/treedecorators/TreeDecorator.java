package net.minecraft.world.level.levelgen.feature.treedecorators;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public abstract class TreeDecorator {
   public static final Codec<TreeDecorator> CODEC = BuiltInRegistries.TREE_DECORATOR_TYPE.byNameCodec().dispatch(TreeDecorator::type, TreeDecoratorType::codec);

   protected abstract TreeDecoratorType<?> type();

   public abstract void place(final TreeDecorator.Context context);

   public static final class Context {
      private final WorldGenLevel level;
      private final BiConsumer<BlockPos, BlockState> decorationSetter;
      private final RandomSource random;
      private final ObjectArrayList<BlockPos> logs;
      private final ObjectArrayList<BlockPos> leaves;
      private final ObjectArrayList<BlockPos> roots;

      public Context(
         final WorldGenLevel level,
         final BiConsumer<BlockPos, BlockState> decorationSetter,
         final RandomSource random,
         final Set<BlockPos> trunkSet,
         final Set<BlockPos> foliageSet,
         final Set<BlockPos> rootSet
      ) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.OutOfMemoryError: Java heap space
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.changeExprentType(VarTypeProcessor.java:193)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExpr(VarTypeProcessor.java:161)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExprent(VarTypeProcessor.java:137)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.lambda$processVarTypes$2(VarTypeProcessor.java:125)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor$$Lambda/0x00000000900ce410.processExprent(Unknown Source)
         //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectGraph.iterateExprents(DirectGraph.java:114)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.processVarTypes(VarTypeProcessor.java:125)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.calculateVarTypes(VarTypeProcessor.java:44)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarVersionsProcessor.setVarVersions(VarVersionsProcessor.java:68)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarVersions(VarProcessor.java:47)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:241)
         //
         // Bytecode:
         // 00: aload 0
         // 01: invokespecial java/lang/Object.<init> ()V
         // 04: aload 0
         // 05: aload 1
         // 06: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.level Lnet/minecraft/world/level/WorldGenLevel;
         // 09: aload 0
         // 0a: aload 2
         // 0b: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.decorationSetter Ljava/util/function/BiConsumer;
         // 0e: aload 0
         // 0f: aload 3
         // 10: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.random Lnet/minecraft/util/RandomSource;
         // 13: aload 0
         // 14: new it/unimi/dsi/fastutil/objects/ObjectArrayList
         // 17: dup
         // 18: aload 6
         // 1a: invokespecial it/unimi/dsi/fastutil/objects/ObjectArrayList.<init> (Ljava/util/Collection;)V
         // 1d: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.roots Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 20: aload 0
         // 21: new it/unimi/dsi/fastutil/objects/ObjectArrayList
         // 24: dup
         // 25: aload 4
         // 27: invokespecial it/unimi/dsi/fastutil/objects/ObjectArrayList.<init> (Ljava/util/Collection;)V
         // 2a: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.logs Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 2d: aload 0
         // 2e: new it/unimi/dsi/fastutil/objects/ObjectArrayList
         // 31: dup
         // 32: aload 5
         // 34: invokespecial it/unimi/dsi/fastutil/objects/ObjectArrayList.<init> (Ljava/util/Collection;)V
         // 37: putfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.leaves Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 3a: aload 0
         // 3b: getfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.logs Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 3e: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, net/minecraft/core/Vec3i.getY ()I, (Lnet/minecraft/core/BlockPos;)I ]
         // 43: invokestatic java/util/Comparator.comparingInt (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
         // 46: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.sort (Ljava/util/Comparator;)V
         // 49: aload 0
         // 4a: getfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.leaves Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 4d: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, net/minecraft/core/Vec3i.getY ()I, (Lnet/minecraft/core/BlockPos;)I ]
         // 52: invokestatic java/util/Comparator.comparingInt (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
         // 55: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.sort (Ljava/util/Comparator;)V
         // 58: aload 0
         // 59: getfield net/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context.roots Lit/unimi/dsi/fastutil/objects/ObjectArrayList;
         // 5c: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, net/minecraft/core/Vec3i.getY ()I, (Lnet/minecraft/core/BlockPos;)I ]
         // 61: invokestatic java/util/Comparator.comparingInt (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
         // 64: invokevirtual it/unimi/dsi/fastutil/objects/ObjectArrayList.sort (Ljava/util/Comparator;)V
         // 67: return
      }

      public void placeVine(final BlockPos pos, final BooleanProperty direction) {
         this.setBlock(pos, Blocks.VINE.defaultBlockState().setValue(direction, true));
      }

      public void setBlock(final BlockPos pos, final BlockState state) {
         this.decorationSetter.accept(pos, state);
      }

      public boolean isAir(final BlockPos pos) {
         return this.level.isStateAtPosition(pos, BlockBehaviour.BlockStateBase::isAir);
      }

      public boolean checkBlock(final BlockPos pos, final Predicate<BlockState> predicate) {
         return this.level.isStateAtPosition(pos, predicate);
      }

      public boolean isReplaceable(final BlockPos pos) {
         return this.checkBlock(pos, BlockBehaviour.BlockStateBase::canBeReplaced);
      }

      public boolean isWaterOrWaterNearby(final BlockPos pos) {
         return this.checkBlock(pos, state -> state.is(Blocks.WATER))
            || this.checkBlock(pos.east(), state -> state.is(Blocks.WATER))
            || this.checkBlock(pos.west(), state -> state.is(Blocks.WATER))
            || this.checkBlock(pos.north(), state -> state.is(Blocks.WATER))
            || this.checkBlock(pos.south(), state -> state.is(Blocks.WATER));
      }

      public WorldGenLevel level() {
         return this.level;
      }

      public RandomSource random() {
         return this.random;
      }

      public ObjectArrayList<BlockPos> logs() {
         return this.logs;
      }

      public ObjectArrayList<BlockPos> leaves() {
         return this.leaves;
      }

      public ObjectArrayList<BlockPos> roots() {
         return this.roots;
      }
   }
}
