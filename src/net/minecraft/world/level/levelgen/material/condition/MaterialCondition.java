package net.minecraft.world.level.levelgen.material.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.function.Function;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.world.level.levelgen.material.MaterialRuleContext;

public interface MaterialCondition {
   Codec<MaterialCondition> DIRECT_CODEC = BuiltInRegistries.MATERIAL_CONDITION_TYPE.byNameCodec().dispatch(MaterialCondition::codec, Function.identity());
   Codec<MaterialCondition> CODEC = RegistryCodecs.holder(Registries.MATERIAL_CONDITION, DIRECT_CODEC).xmap(holder -> {
      Objects.requireNonNull(holder);

      return (MaterialCondition)(switch (holder) {
         case Holder.Direct direct -> (MaterialCondition)direct.value();
         case Holder.Reference reference -> new MaterialCondition.HolderHolder(reference);
         default -> throw new MatchException(null, null);
      });
   }, value -> {
      Objects.requireNonNull(value);

      return switch (value) {
         case MaterialCondition.HolderHolder $b$0 -> {
            MaterialCondition.HolderHolder var7 = $b$0;

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

   ConditionEvaluator compile(MaterialRuleContext context);

   MapCodec<? extends MaterialCondition> codec();

   public static record HolderHolder(Holder<MaterialCondition> holder) implements MaterialCondition {
      @Override
      public ConditionEvaluator compile(final MaterialRuleContext context) {
         return this.holder.value().compile(context);
      }

      @Override
      public MapCodec<MaterialCondition.HolderHolder> codec() {
         throw new UnsupportedOperationException("HolderHolder cannot be serialized");
      }
   }
}
