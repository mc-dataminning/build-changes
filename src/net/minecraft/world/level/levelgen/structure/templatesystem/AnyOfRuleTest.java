package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

public record AnyOfRuleTest(List<RuleTest> rules) implements RuleTest {
   public static final MapCodec<AnyOfRuleTest> CODEC = RuleTest.CODEC.listOf().fieldOf("rules").xmap(AnyOfRuleTest::new, t -> t.rules);

   @Override
   public boolean test(final BlockState blockState, final BlockPos pos, final RandomSource random) {
      for (RuleTest rule : this.rules) {
         if (rule.test(blockState, pos, random)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public MapCodec<AnyOfRuleTest> codec() {
      return CODEC;
   }
}
