package net.minecraft.world.level.levelgen.structure.templatesystem;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public class RuleTestTypes {
   public static void bootstrap(final WritableRegistry<MapCodec<? extends RuleTest>> registry) {
      Registry.register(registry, "all_of", AllOfRuleTest.CODEC);
      Registry.register(registry, "always_true", AlwaysTrueTest.CODEC);
      Registry.register(registry, "any_of", AnyOfRuleTest.CODEC);
      Registry.register(registry, "block_match", BlockMatchTest.CODEC);
      Registry.register(registry, "blockstate_match", BlockStateMatchTest.CODEC);
      Registry.register(registry, "height_match", HeightMatchTest.CODEC);
      Registry.register(registry, "not", NotRuleTest.CODEC);
      Registry.register(registry, "random_block_match", RandomBlockMatchTest.CODEC);
      Registry.register(registry, "random_blockstate_match", RandomBlockStateMatchTest.CODEC);
      Registry.register(registry, "tag_match", TagMatchTest.CODEC);
   }
}
