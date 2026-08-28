package net.minecraft.world.level.levelgen.material.rule;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.function.Function;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.world.level.levelgen.material.MaterialRuleContext;

public interface MaterialRule {
   Codec<MaterialRule> DIRECT_CODEC = BuiltInRegistries.MATERIAL_RULE_TYPE.byNameCodec().dispatch(MaterialRule::codec, Function.identity());
   Codec<Holder<MaterialRule>> HOLDER_CODEC = RegistryCodecs.holder(Registries.MATERIAL_RULE, DIRECT_CODEC);
   Codec<MaterialRule> CODEC = HOLDER_CODEC.xmap(holder -> {
      Objects.requireNonNull(holder);

      return (MaterialRule)(switch (holder) {
         case Holder.Direct direct -> (MaterialRule)direct.value();
         case Holder.Reference reference -> new MaterialRule.HolderHolder(reference);
         default -> throw new MatchException(null, null);
      });
   }, value -> {
      Objects.requireNonNull(value);

      return switch (value) {
         case MaterialRule.HolderHolder $b$0 -> {
            MaterialRule.HolderHolder var7 = $b$0;

            try {
               var8 = var7.holder();
            } catch (Throwable var6) {
               throw new MatchException(var6.toString(), var6);
            }

            Holder patt3$temp = var8;
            yield patt3$temp;
         }
         default -> Holder.direct(value);
      };
   });

   RuleEvaluator compile(MaterialRuleContext context);

   MapCodec<? extends MaterialRule> codec();

   public static record HolderHolder(Holder<MaterialRule> holder) implements MaterialRule {
      @Override
      public RuleEvaluator compile(final MaterialRuleContext context) {
         return this.holder.value().compile(context);
      }

      @Override
      public MapCodec<MaterialRule.HolderHolder> codec() {
         throw new UnsupportedOperationException("HolderHolder cannot be serialized");
      }
   }
}
