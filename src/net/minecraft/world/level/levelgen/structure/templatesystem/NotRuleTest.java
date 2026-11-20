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

   @Override
   public final boolean equals(Object o) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 0: aload 0
      // 1: aload 1
      // 2: invokedynamic equals (Lnet/minecraft/world/level/levelgen/structure/templatesystem/NotRuleTest;Ljava/lang/Object;)Z bsm=java/lang/runtime/ObjectMethods.bootstrap (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object; args=[ net/minecraft/world/level/levelgen/structure/templatesystem/NotRuleTest, "rule", net/minecraft/world/level/levelgen/structure/templatesystem/NotRuleTest.rule Lnet/minecraft/world/level/levelgen/structure/templatesystem/RuleTest; ]
      // 7: ireturn
   }
}
