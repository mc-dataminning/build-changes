package net.minecraft.world.level.storage.loot.predicates;

import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.codec.RegistryCodecs;
import net.minecraft.util.ProblemReporter;
import net.minecraft.util.context.ContextKey;
import net.minecraft.util.context.ContextKeySet;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.Validatable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import org.jspecify.annotations.Nullable;

public interface LootItemCondition extends Validatable, Predicate<LootContext> {
   Codec<LootItemCondition> DIRECT_CODEC = BuiltInRegistries.LOOT_CONDITION_TYPE.byNameCodec().dispatch(LootItemCondition::codec, c -> c);
   Codec<Holder<LootItemCondition>> CODEC = RegistryCodecs.holder(Registries.PREDICATE, DIRECT_CODEC);
   Codec<HolderSet<LootItemCondition>> LIST_CODEC = RegistryCodecs.holderSet(Registries.PREDICATE, DIRECT_CODEC);

   MapCodec<? extends LootItemCondition> codec();

   @Nullable Boolean constantValue(LootItemCondition.ConstantConditionEvaluationContext context);

   default @Nullable Boolean validateConstantConditions(final ValidationContext context) {
      LootItemCondition.ConstantConditionEvaluationContext evaluationContext = LootItemCondition.ConstantConditionEvaluationContext.create(context);
      evaluationContext.push(this);
      Boolean value = this.constantValue(evaluationContext);
      evaluationContext.pop(this);
      if (!evaluationContext.visitedObjects.isEmpty()) {
         throw new IllegalStateException("Leftover values after evaluation:" + evaluationContext.visitedObjects);
      }

      if (value == Boolean.FALSE) {
         context.reportProblem(new LootItemCondition.AlwaysFalseWarning(context.contextKeySet()));
      } else if (value == Boolean.TRUE) {
         context.reportProblem(new LootItemCondition.AlwaysTrueWarning(context.contextKeySet()));
      }

      return value;
   }

   default boolean canPass(final ValidationContext context) {
      Boolean constantValue = this.validateConstantConditions(context);
      return constantValue != Boolean.FALSE;
   }

   class AlwaysFalseWarning implements ProblemReporter.Warning {
      private final ContextKeySet contextKeySet;

      public AlwaysFalseWarning(final ContextKeySet contextKeySet) {
         this.contextKeySet = contextKeySet;
      }

      @Override
      public String description() {
         return "Condition is always false in context " + this.contextKeySet;
      }
   }

   class AlwaysTrueWarning implements ProblemReporter.Warning {
      private final ContextKeySet contextKeySet;

      public AlwaysTrueWarning(final ContextKeySet contextKeySet) {
         this.contextKeySet = contextKeySet;
      }

      @Override
      public String description() {
         return "Condition is always true in context " + this.contextKeySet;
      }
   }

   @FunctionalInterface
   interface Builder {
      LootItemCondition build();

      default LootItemCondition.Builder invert() {
         return InvertedLootItemCondition.invert(this);
      }

      default AnyOfCondition.Builder or(final LootItemCondition.Builder other) {
         return AnyOfCondition.anyOf(this, other);
      }

      default AllOfCondition.Builder and(final LootItemCondition.Builder other) {
         return AllOfCondition.allOf(this, other);
      }
   }

   record ConstantConditionEvaluationContext(Set<LootItemCondition> visitedObjects, ContextKeySet contextKeySet) {
      public static LootItemCondition.ConstantConditionEvaluationContext create(final ValidationContext validationContext) {
         return new LootItemCondition.ConstantConditionEvaluationContext(Sets.newIdentityHashSet(), validationContext.contextKeySet());
      }

      public boolean push(final LootItemCondition condition) {
         return this.visitedObjects.add(condition);
      }

      public void pop(final LootItemCondition condition) {
         if (!this.visitedObjects.remove(condition)) {
            throw new IllegalStateException("Failed to remove " + condition + " from " + this.visitedObjects);
         }
      }
   }

   interface ContextUser extends LootItemCondition {
      @Override
      MapCodec<? extends LootItemCondition.ContextUser> codec();

      Set<ContextKey<?>> requiredContextParams();

      @Override
      default @Nullable Boolean constantValue(final LootItemCondition.ConstantConditionEvaluationContext context) {
         ContextKeySet contextKeySet = context.contextKeySet();
         Set<ContextKey<?>> required = this.requiredContextParams();
         return !contextKeySet.allowed().containsAll(required) ? false : null;
      }
   }
}
