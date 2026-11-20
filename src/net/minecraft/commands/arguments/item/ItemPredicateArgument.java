package net.minecraft.commands.arguments.item;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.commands.arguments.SerializableArgument;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.predicates.DataComponentPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Unit;
import net.minecraft.util.Util;
import net.minecraft.util.parsing.packrat.Suggestion;
import net.minecraft.util.parsing.packrat.commands.Grammar;
import net.minecraft.util.parsing.packrat.commands.ParserBasedArgument;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemPredicateArgument extends ParserBasedArgument<ItemPredicateArgument.Context, ItemPredicateArgument.Result> {
   private static final ItemPredicateArgument INSTANCE = new ItemPredicateArgument();
   public static final SerializableArgument.Type<ItemPredicateArgument> TYPE = SerializableArgument.singletonType(INSTANCE);
   private static final Collection<String> EXAMPLES = List.of("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   private static final DynamicCommandExceptionType ERROR_UNKNOWN_ITEM = new DynamicCommandExceptionType(
      id -> Component.translatableEscape("argument.item.id.invalid", id)
   );
   private static final DynamicCommandExceptionType ERROR_UNKNOWN_TAG = new DynamicCommandExceptionType(
      tag -> Component.translatableEscape("arguments.item.tag.unknown", tag)
   );
   private static final DynamicCommandExceptionType ERROR_UNKNOWN_COMPONENT = new DynamicCommandExceptionType(
      id -> Component.translatableEscape("arguments.item.component.unknown", id)
   );
   private static final Dynamic2CommandExceptionType ERROR_MALFORMED_COMPONENT = new Dynamic2CommandExceptionType(
      (type, message) -> Component.translatableEscape("arguments.item.component.malformed", type, message)
   );
   private static final DynamicCommandExceptionType ERROR_UNKNOWN_PREDICATE = new DynamicCommandExceptionType(
      id -> Component.translatableEscape("arguments.item.predicate.unknown", id)
   );
   private static final Dynamic2CommandExceptionType ERROR_MALFORMED_PREDICATE = new Dynamic2CommandExceptionType(
      (type, message) -> Component.translatableEscape("arguments.item.predicate.malformed", type, message)
   );
   private static final Identifier COUNT_ID = Identifier.withDefaultNamespace("count");
   private static final Map<Identifier, ItemPredicateArgument.ComponentWrapper> PSEUDO_COMPONENTS = Stream.of(
         new ItemPredicateArgument.ComponentWrapper(
            COUNT_ID, var0 -> true, MinMaxBounds.Ints.CODEC.map(range -> itemStack -> range.matches(itemStack.getCount()))
         )
      )
      .collect(Collectors.toUnmodifiableMap(ItemPredicateArgument.ComponentWrapper::id, e -> (ItemPredicateArgument.ComponentWrapper)e));
   private static final Map<Identifier, ItemPredicateArgument.PredicateWrapper> PSEUDO_PREDICATES = Stream.of(
         new ItemPredicateArgument.PredicateWrapper(COUNT_ID, MinMaxBounds.Ints.CODEC.map(range -> itemStack -> range.matches(itemStack.getCount())))
      )
      .collect(Collectors.toUnmodifiableMap(ItemPredicateArgument.PredicateWrapper::id, e -> (ItemPredicateArgument.PredicateWrapper)e));

   private static ItemPredicateArgument.PredicateWrapper createComponentExistencePredicate(final Holder.Reference<DataComponentType<?>> componentId) {
      Predicate<ItemStack> componentExists = itemStack -> itemStack.has(componentId.value());
      return new ItemPredicateArgument.PredicateWrapper(componentId.key().identifier(), Unit.CODEC.map(var1x -> componentExists));
   }

   private ItemPredicateArgument() {
      Grammar<ItemPredicateArgument.Context, List<Predicate<ItemStack>>> grammar = ComponentPredicateParser.createGrammar();
      super(
         (context, reader) -> new ItemPredicateArgument.Context(reader, context.holderGetters()), grammar.mapResult(predicates -> Util.allOf(predicates)::test)
      );
   }

   @Override
   public SerializableArgument.Type<ItemPredicateArgument> type() {
      return TYPE;
   }

   public static ArgumentType<ItemPredicateArgument.Result> itemPredicate() {
      return INSTANCE.toBrigadier();
   }

   public static ItemPredicateArgument.Result getItemPredicate(final CommandContext<?> context, final String name) {
      return (ItemPredicateArgument.Result)context.getArgument(name, ItemPredicateArgument.Result.class);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   public record ComponentWrapper(Identifier id, Predicate<ItemStack> presenceChecker, Decoder<? extends Predicate<ItemStack>> valueChecker) {
      public static <T> ItemPredicateArgument.ComponentWrapper create(final ImmutableStringReader reader, final Identifier id, final DataComponentType<T> type) throws CommandSyntaxException {
         Codec<T> codec = type.codec();
         if (codec == null) {
            throw ItemPredicateArgument.ERROR_UNKNOWN_COMPONENT.createWithContext(reader, id);
         } else {
            return new ItemPredicateArgument.ComponentWrapper(id, itemStack -> itemStack.has(type), codec.map(expected -> itemStack -> {
               T actual = itemStack.get(type);
               return Objects.equals(expected, actual);
            }));
         }
      }

      public Predicate<ItemStack> decode(final ImmutableStringReader reader, final Dynamic<?> value) throws CommandSyntaxException {
         DataResult<? extends Predicate<ItemStack>> result = this.valueChecker.parse(value);
         return (Predicate<ItemStack>)result.getOrThrow(
            message -> ItemPredicateArgument.ERROR_MALFORMED_COMPONENT.createWithContext(reader, this.id.toString(), message)
         );
      }
   }

   public static class Context
      implements ComponentPredicateParser.Context<Predicate<ItemStack>, ItemPredicateArgument.ComponentWrapper, ItemPredicateArgument.PredicateWrapper> {
      private static final Suggestion ITEM_ID_SUGGESTION = new Suggestion.RegistryElements<>(Registries.ITEM);
      private static final Suggestion ITEM_TAG_SUGGESTIONS = new Suggestion.RegistryTags<>(Registries.ITEM);
      private static final Suggestion.Composite COMPONENT_ID_SUGGESTION = new Suggestion.Composite(
         new Suggestion.Identifiers(ItemPredicateArgument.PSEUDO_PREDICATES.keySet()),
         new Suggestion.RegistryElements<>(Registries.DATA_COMPONENT_PREDICATE_TYPE)
      );
      private static final Suggestion.Composite PREDICATE_ID_SUGGESTION = new Suggestion.Composite(
         new Suggestion.Identifiers(ItemPredicateArgument.PSEUDO_PREDICATES.keySet()),
         new Suggestion.RegistryElements<>(Registries.DATA_COMPONENT_TYPE, e -> !e.isTransient())
      );
      private final StringReader reader;
      private final HolderGetter.Provider registries;
      private final HolderGetter<Item> items;
      private final HolderGetter<DataComponentType<?>> components;
      private final HolderGetter<DataComponentPredicate.Type<?>> predicates;

      private Context(final StringReader reader, final HolderGetter.Provider registries) {
         this.reader = reader;
         this.registries = registries;
         this.items = registries.lookupOrThrow(Registries.ITEM);
         this.components = registries.lookupOrThrow(Registries.DATA_COMPONENT_TYPE);
         this.predicates = registries.lookupOrThrow(Registries.DATA_COMPONENT_PREDICATE_TYPE);
      }

      @Override
      public StringReader reader() {
         return this.reader;
      }

      public Predicate<ItemStack> forElementType(final Identifier id) throws CommandSyntaxException {
         Holder.Reference<Item> item = this.items
            .get(ResourceKey.create(Registries.ITEM, id))
            .orElseThrow(() -> ItemPredicateArgument.ERROR_UNKNOWN_ITEM.createWithContext(this.reader, id));
         return itemStack -> itemStack.is(item);
      }

      public Predicate<ItemStack> forTagType(final Identifier id) throws CommandSyntaxException {
         HolderSet<Item> tag = this.items
            .get(TagKey.create(Registries.ITEM, id))
            .orElseThrow(() -> ItemPredicateArgument.ERROR_UNKNOWN_TAG.createWithContext(this.reader, id));
         return itemStack -> itemStack.is(tag);
      }

      public ItemPredicateArgument.ComponentWrapper lookupComponentType(final Identifier componentId) throws CommandSyntaxException {
         ItemPredicateArgument.ComponentWrapper wrapper = ItemPredicateArgument.PSEUDO_COMPONENTS.get(componentId);
         if (wrapper != null) {
            return wrapper;
         }

         DataComponentType<?> componentType = this.components
            .get(ResourceKey.create(Registries.DATA_COMPONENT_TYPE, componentId))
            .map(Holder::value)
            .orElseThrow(() -> ItemPredicateArgument.ERROR_UNKNOWN_COMPONENT.createWithContext(this.reader, componentId));
         return ItemPredicateArgument.ComponentWrapper.create(this.reader, componentId, componentType);
      }

      public Predicate<ItemStack> createComponentTest(final ItemPredicateArgument.ComponentWrapper componentType, final Dynamic<?> value) throws CommandSyntaxException {
         return componentType.decode(this.reader, RegistryOps.injectRegistryContext(value, this.registries));
      }

      public Predicate<ItemStack> createComponentTest(final ItemPredicateArgument.ComponentWrapper componentType) {
         return componentType.presenceChecker;
      }

      public ItemPredicateArgument.PredicateWrapper lookupPredicateType(final Identifier componentId) throws CommandSyntaxException {
         ItemPredicateArgument.PredicateWrapper wrapper = ItemPredicateArgument.PSEUDO_PREDICATES.get(componentId);
         return wrapper != null
            ? wrapper
            : this.predicates
               .get(ResourceKey.create(Registries.DATA_COMPONENT_PREDICATE_TYPE, componentId))
               .map(ItemPredicateArgument.PredicateWrapper::new)
               .or(
                  () -> this.components
                     .get(ResourceKey.create(Registries.DATA_COMPONENT_TYPE, componentId))
                     .map(ItemPredicateArgument::createComponentExistencePredicate)
               )
               .orElseThrow(() -> ItemPredicateArgument.ERROR_UNKNOWN_PREDICATE.createWithContext(this.reader, componentId));
      }

      public Predicate<ItemStack> createPredicateTest(final ItemPredicateArgument.PredicateWrapper predicateType, final Dynamic<?> value) throws CommandSyntaxException {
         return predicateType.decode(this.reader, RegistryOps.injectRegistryContext(value, this.registries));
      }

      @Override
      public Suggestion elementTypeSuggestion() {
         return ITEM_ID_SUGGESTION;
      }

      @Override
      public Suggestion tagTypeSuggestion() {
         return ITEM_TAG_SUGGESTIONS;
      }

      @Override
      public Suggestion componentTypeSuggestion() {
         return COMPONENT_ID_SUGGESTION;
      }

      @Override
      public Suggestion predicateTypeSuggestion() {
         return PREDICATE_ID_SUGGESTION;
      }

      public Predicate<ItemStack> negate(final Predicate<ItemStack> value) {
         return value.negate();
      }

      public Predicate<ItemStack> anyOf(final List<Predicate<ItemStack>> alternatives) {
         return Util.anyOf(alternatives);
      }
   }

   public record PredicateWrapper(Identifier id, Decoder<? extends Predicate<ItemStack>> type) {
      public PredicateWrapper(final Holder.Reference<DataComponentPredicate.Type<?>> holder) {
         this(holder.key().identifier(), holder.value().codec().map(v -> v::matches));
      }

      public Predicate<ItemStack> decode(final ImmutableStringReader reader, final Dynamic<?> value) throws CommandSyntaxException {
         DataResult<? extends Predicate<ItemStack>> result = this.type.parse(value);
         return (Predicate<ItemStack>)result.getOrThrow(
            message -> ItemPredicateArgument.ERROR_MALFORMED_PREDICATE.createWithContext(reader, this.id.toString(), message)
         );
      }
   }

   public interface Result extends Predicate<ItemStack> {
   }
}
