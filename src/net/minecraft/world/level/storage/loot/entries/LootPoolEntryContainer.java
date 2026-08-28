package net.minecraft.world.level.storage.loot.entries;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.Validatable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.functions.FunctionUserBuilder;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import net.minecraft.world.level.storage.loot.predicates.ConditionUserBuilder;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public abstract class LootPoolEntryContainer implements ComposableEntryContainer, Validatable {
   protected final Optional<Holder<LootItemCondition>> condition;
   protected final Optional<Holder<LootItemFunction>> modifier;

   protected LootPoolEntryContainer(final Optional<Holder<LootItemCondition>> condition, final Optional<Holder<LootItemFunction>> modifier) {
      this.condition = condition;
      this.modifier = modifier;
   }

   protected static <T extends LootPoolEntryContainer> P2<Mu<T>, Optional<Holder<LootItemCondition>>, Optional<Holder<LootItemFunction>>> commonFields(
      final Instance<T> i
   ) {
      return i.group(
         LootItemCondition.CODEC.optionalFieldOf("condition").forGetter(e -> e.condition),
         LootItemFunctions.CODEC.optionalFieldOf("modifier").forGetter(e -> e.modifier)
      );
   }

   @Override
   public void validate(final ValidationContext output) {
      Validatable.validateHolder(output, "condition", this.condition);
      Validatable.validateHolder(output, "modifier", this.modifier);
   }

   protected abstract boolean expandRaw(final LootContext context, final Consumer<LootPoolEntry> output);

   @Override
   public final boolean expand(final LootContext context, final Consumer<LootPoolEntry> output) {
      return !this.canRun(context) ? false : this.expandRaw(context, this.adjustOutput(output));
   }

   private Consumer<LootPoolEntry> adjustOutput(final Consumer<LootPoolEntry> output) {
      return this.modifier.isEmpty() ? output : rawEntry -> output.accept(new LootPoolEntry() {
            {
               Objects.requireNonNull(LootPoolEntryContainer.this);
            }

            @Override
            public int getWeight(final float luck) {
               return rawEntry.getWeight(luck);
            }

            @Override
            public void createItemStack(final Consumer<ItemStack> output, final LootContext context) {
               rawEntry.createItemStack(LootItemFunction.decorate(LootPoolEntryContainer.this.modifier, output, context), context);
            }
         });
   }

   private boolean canRun(final LootContext context) {
      return this.condition.isEmpty() || this.condition.get().value().test(context);
   }

   public abstract MapCodec<? extends LootPoolEntryContainer> codec();

   public abstract static class Builder<T extends LootPoolEntryContainer.Builder<T>> implements ConditionUserBuilder<T>, FunctionUserBuilder<T> {
      private final com.google.common.collect.ImmutableList.Builder<Holder<LootItemCondition>> conditions = ImmutableList.builder();
      private final com.google.common.collect.ImmutableList.Builder<Holder<LootItemFunction>> modifiers = ImmutableList.builder();

      protected abstract T getThis();

      public T when(final Holder<LootItemCondition> condition) {
         this.conditions.add(condition);
         return this.getThis();
      }

      public T apply(final Holder<LootItemFunction> function) {
         this.modifiers.add(function);
         return this.getThis();
      }

      public final T unwrap() {
         return this.getThis();
      }

      protected Optional<Holder<LootItemCondition>> getCondition() {
         return ConditionUserBuilder.buildCondition(this.conditions.build());
      }

      protected Optional<Holder<LootItemFunction>> getModifier() {
         return FunctionUserBuilder.buildFunction(this.modifiers.build());
      }

      public AlternativesEntry.Builder otherwise(final LootPoolEntryContainer.Builder<?> other) {
         return new AlternativesEntry.Builder(this, other);
      }

      public EntryGroup.Builder append(final LootPoolEntryContainer.Builder<?> other) {
         return new EntryGroup.Builder(this, other);
      }

      public SequentialEntry.Builder then(final LootPoolEntryContainer.Builder<?> other) {
         return new SequentialEntry.Builder(this, other);
      }

      public abstract LootPoolEntryContainer build();
   }
}
