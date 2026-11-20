package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.dimension.DimensionType;

public record HeightMatchTest(int minInclusive, int maxInclusive) implements RuleTest {
   public static final MapCodec<HeightMatchTest> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(Codec.INT.fieldOf("min_inclusive").forGetter(c -> c.minInclusive), Codec.INT.fieldOf("max_inclusive").forGetter(c -> c.maxInclusive))
         .apply(i, HeightMatchTest::new)
   );

   public static RuleTest min(final int minInclusive) {
      return new HeightMatchTest(minInclusive, DimensionType.MAX_Y);
   }

   public static RuleTest max(final int maxInclusive) {
      return new HeightMatchTest(DimensionType.MIN_Y, maxInclusive);
   }

   @Override
   public boolean test(final BlockState blockState, final BlockPos pos, final RandomSource random) {
      return this.minInclusive <= pos.getY() && pos.getY() <= this.maxInclusive;
   }

   @Override
   public MapCodec<HeightMatchTest> codec() {
      return CODEC;
   }

   @Override
   public final String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 0: aload 0
      // 1: invokedynamic toString (Lnet/minecraft/world/level/levelgen/structure/templatesystem/HeightMatchTest;)Ljava/lang/String; bsm=java/lang/runtime/ObjectMethods.bootstrap (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object; args=[ net/minecraft/world/level/levelgen/structure/templatesystem/HeightMatchTest, "minInclusive;maxInclusive", net/minecraft/world/level/levelgen/structure/templatesystem/HeightMatchTest.minInclusive I, net/minecraft/world/level/levelgen/structure/templatesystem/HeightMatchTest.maxInclusive I ]
      // 6: areturn
   }
}
