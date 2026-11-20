package net.minecraft.commands.arguments;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.suggestions.SuggestionContext;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.SnbtGrammar;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.parsing.packrat.Atom;
import net.minecraft.util.parsing.packrat.Dictionary;
import net.minecraft.util.parsing.packrat.NamedRule;
import net.minecraft.util.parsing.packrat.Term;
import net.minecraft.util.parsing.packrat.commands.CommandParserState;
import net.minecraft.util.parsing.packrat.commands.Grammar;
import net.minecraft.util.parsing.packrat.commands.IdentifierParseRule;

public abstract class ResourceOrIdArgument<Raw, Value> implements SerializableArgument<Value> {
   static final Collection<String> EXAMPLES = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType ERROR_FAILED_TO_PARSE = new DynamicCommandExceptionType(
      error -> Component.translatableEscape("argument.resource_or_id.failed_to_parse", error)
   );
   public static final Dynamic2CommandExceptionType ERROR_NO_SUCH_ELEMENT = new Dynamic2CommandExceptionType(
      (id, registry) -> Component.translatableEscape("argument.resource_or_id.no_such_element", id, registry)
   );
   public static final DynamicOps<Tag> OPS = NbtOps.INSTANCE;
   private final ResourceKey<? extends Registry<Raw>> registryKey;
   private final Codec<Raw> codec;
   private final Grammar<CommandParserState, ResourceOrIdArgument.Result<Raw, Tag>> grammar;

   protected ResourceOrIdArgument(final ResourceKey<? extends Registry<Raw>> registryKey, final Codec<Raw> codec) {
      this.registryKey = registryKey;
      this.codec = codec;
      this.grammar = createGrammar(registryKey, OPS);
   }

   @Override
   public abstract SerializableArgument.Type<? extends ResourceOrIdArgument<Raw, Value>> type();

   public static <T, O> Grammar<CommandParserState, ResourceOrIdArgument.Result<T, O>> createGrammar(
      final ResourceKey<? extends Registry<T>> registryKey, final DynamicOps<O> ops
   ) {
      Grammar<CommandParserState, O> inlineValueGrammar = SnbtGrammar.createParser((DynamicOps<T>)ops);
      Dictionary<CommandParserState> rules = new Dictionary<>();
      Atom<ResourceOrIdArgument.Result<T, O>> result = Atom.of("result");
      Atom<Identifier> id = Atom.of("id");
      Atom<O> value = Atom.of("value");
      rules.put(id, IdentifierParseRule.INSTANCE);
      rules.put(value, inlineValueGrammar.top().value());
      NamedRule<CommandParserState, ResourceOrIdArgument.Result<T, O>> topRule = rules.put(
         result, Term.alternative(rules.named(id), rules.named(value)), scope -> {
            Identifier parsedId = scope.get(id);
            if (parsedId != null) {
               return new ResourceOrIdArgument.ReferenceResult<>(ResourceKey.create(registryKey, parsedId));
            }

            O parsedInline = scope.getOrThrow(value);
            return new ResourceOrIdArgument.InlineResult<>(parsedInline);
         }
      );
      return new Grammar<>(rules, topRule);
   }

   @Override
   public Value parse(final StringReader reader, final ParseContext context) throws CommandSyntaxException {
      Holder<Raw> result = this.parse(reader, context.holderGetters(), this.grammar, OPS);
      return this.convert(context, result);
   }

   protected abstract Value convert(ParseContext context, Holder<Raw> raw) throws CommandSyntaxException;

   private <O> Holder<Raw> parse(
      final StringReader reader,
      final HolderGetter.Provider registries,
      final Grammar<CommandParserState, ResourceOrIdArgument.Result<Raw, O>> grammar,
      final DynamicOps<O> ops
   ) throws CommandSyntaxException {
      CommandParserState state = CommandParserState.simple(reader);
      ResourceOrIdArgument.Result<Raw, O> contents = grammar.parseForCommands(state);
      return contents.parse(state, registries, ops, this.codec, registries.lookupOrThrow(this.registryKey));
   }

   @Override
   public CompletableFuture<Suggestions> listSuggestions(final CommandContext<? extends SuggestionContext> context, final SuggestionsBuilder builder) {
      return ((SuggestionContext)context.getSource())
         .suggestRegistryElements(context, this.registryKey, SuggestionContext.ElementSuggestionType.ELEMENTS, builder);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }

   public record InlineResult<T, O>(O value) implements ResourceOrIdArgument.Result<T, O> {
      @Override
      public Holder<T> parse(
         final CommandParserState reader,
         final HolderGetter.Provider registries,
         final DynamicOps<O> ops,
         final Codec<T> codec,
         final HolderGetter<T> elementLookup
      ) throws CommandSyntaxException {
         return Holder.direct(
            (T)codec.parse(registries.createSerializationContext(ops), this.value)
               .getOrThrow(msg -> ResourceOrIdArgument.ERROR_FAILED_TO_PARSE.createWithContext(reader.reader(), msg))
         );
      }
   }

   public record ReferenceResult<T, O>(ResourceKey<T> key) implements ResourceOrIdArgument.Result<T, O> {
      @Override
      public Holder<T> parse(
         final CommandParserState reader,
         final HolderGetter.Provider registries,
         final DynamicOps<O> ops,
         final Codec<T> codec,
         final HolderGetter<T> elementLookup
      ) throws CommandSyntaxException {
         return elementLookup.get(this.key)
            .orElseThrow(() -> ResourceOrIdArgument.ERROR_NO_SUCH_ELEMENT.createWithContext(reader.reader(), this.key.identifier(), this.key.registry()));
      }
   }

   public sealed interface Result<T, O> permits ResourceOrIdArgument.InlineResult, ResourceOrIdArgument.ReferenceResult {
      Holder<T> parse(CommandParserState reader, HolderGetter.Provider registries, DynamicOps<O> ops, Codec<T> codec, HolderGetter<T> elementLookup) throws CommandSyntaxException;
   }

   public abstract static class Simple<Value> extends ResourceOrIdArgument<Value, Holder<Value>> {
      public Simple(final ResourceKey<? extends Registry<Value>> registryKey, final Codec<Value> codec) {
         super(registryKey, codec);
      }

      protected Holder<Value> convert(final ParseContext context, final Holder<Value> raw) {
         return raw;
      }

      protected static <T> Holder<T> getResource(final CommandContext<?> context, final String name) {
         return (Holder<T>)context.getArgument(name, Holder.class);
      }

      @Override
      public abstract SerializableArgument.Type<? extends ResourceOrIdArgument.Simple<Value>> type();
   }
}
