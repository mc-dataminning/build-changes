package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;

public record AlwaysTrueTest() implements RuleTest {
   public static final MapCodec<AlwaysTrueTest> CODEC = MapCodec.unit(() -> AlwaysTrueTest.INSTANCE);
   public static final AlwaysTrueTest INSTANCE = new AlwaysTrueTest();

   @Override
   public boolean testAgainstWorldState(final LevelReader level, final BlockPos pos, final RandomSource random) {
      return true;
   }

   @Override
   public boolean test(final BlockState blockState, final BlockPos pos, final RandomSource random) {
      return true;
   }

   @Override
   public MapCodec<AlwaysTrueTest> codec() {
      return CODEC;
   }
}
