package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

public record NotRuleTest(RuleTest rule) implements RuleTest {
   public static final MapCodec<NotRuleTest> CODEC = RuleTest.CODEC.fieldOf("rule").xmap(NotRuleTest::new, t -> t.rule);

   @Override
   public boolean test(final BlockState blockState, final BlockPos pos, final RandomSource random) {
      return !this.rule.test(blockState, pos, random);
   }

   @Override
   public MapCodec<NotRuleTest> codec() {
      return CODEC;
   }
}
