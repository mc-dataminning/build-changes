package net.minecraft.commands.arguments.item;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;
import net.minecraft.util.Util;
import net.minecraft.util.parsing.packrat.Atom;
import net.minecraft.util.parsing.packrat.Dictionary;
import net.minecraft.util.parsing.packrat.NamedRule;
import net.minecraft.util.parsing.packrat.Scope;
import net.minecraft.util.parsing.packrat.Suggestion;
import net.minecraft.util.parsing.packrat.Term;
import net.minecraft.util.parsing.packrat.commands.CommandParserState;
import net.minecraft.util.parsing.packrat.commands.Grammar;
import net.minecraft.util.parsing.packrat.commands.IdentifierParseRule;
import net.minecraft.util.parsing.packrat.commands.ResourceLookupRule;
import net.minecraft.util.parsing.packrat.commands.StringReaderTerms;
import net.minecraft.util.parsing.packrat.commands.TagParseRule;

public class ComponentPredicateParser {
   public static <T, C, P, S extends ComponentPredicateParser.Context<T, C, P>> Grammar<S, List<T>> createGrammar() {
      Atom<List<T>> top = Atom.of("top");
      Atom<Optional<T>> type = Atom.of("type");
      Atom<Unit> anyType = Atom.of("any_type");
      Atom<T> elementType = Atom.of("element_type");
      Atom<T> tagType = Atom.of("tag_type");
      Atom<List<T>> conditions = Atom.of("conditions");
      Atom<List<T>> alternatives = Atom.of("alternatives");
      Atom<T> term = Atom.of("term");
      Atom<T> negation = Atom.of("negation");
      Atom<T> test = Atom.of("test");
      Atom<C> componentType = Atom.of("component_type");
      Atom<P> predicateType = Atom.of("predicate_type");
      Atom<Identifier> id = Atom.of("id");
      Atom<Dynamic<?>> tag = Atom.of("tag");
      Dictionary<S> rules = new Dictionary<>();
      NamedRule<S, Identifier> idRule = rules.put(id, IdentifierParseRule.instance());
      NamedRule<S, List<T>> topRule = rules.put(
         top,
         Term.alternative(
            Term.sequence(
               rules.named(type), StringReaderTerms.character('['), Term.cut(), Term.optional(rules.named(conditions)), StringReaderTerms.character(']')
            ),
            rules.named(type)
         ),
         scope -> {
            Builder<T> builder = ImmutableList.builder();
            scope.getOrThrow(type).ifPresent(builder::add);
            List<T> parsedConditions = scope.get(conditions);
            if (parsedConditions != null) {
               builder.addAll(parsedConditions);
            }

            return builder.build();
         }
      );
      rules.put(
         type,
         Term.alternative(rules.named(elementType), Term.sequence(StringReaderTerms.character('#'), Term.cut(), rules.named(tagType)), rules.named(anyType)),
         scope -> Optional.ofNullable(scope.getAny(elementType, tagType))
      );
      rules.put(anyType, StringReaderTerms.character('*'), var0x -> Unit.INSTANCE);
      rules.put(elementType, new ComponentPredicateParser.ElementLookupRule<>(idRule));
      rules.put(tagType, new ComponentPredicateParser.TagLookupRule<>(idRule));
      rules.putStateful(
         conditions,
         Term.sequence(rules.named(alternatives), Term.optional(Term.sequence(StringReaderTerms.character(','), rules.named(conditions)))),
         (scope, context) -> {
            T parsedCondition = context.anyOf(scope.getOrThrow(alternatives));
            return Optional.ofNullable(scope.get(conditions)).map(rest -> Util.copyAndAdd(parsedCondition, (List<T>)rest)).orElse(List.of(parsedCondition));
         }
      );
      rules.put(
         alternatives, Term.sequence(rules.named(term), Term.optional(Term.sequence(StringReaderTerms.character('|'), rules.named(alternatives)))), scope -> {
            T alternative = scope.getOrThrow(term);
            return Optional.ofNullable(scope.get(alternatives)).map(rest -> Util.copyAndAdd(alternative, (List<T>)rest)).orElse(List.of(alternative));
         }
      );
      rules.put(
         term,
         Term.alternative(rules.named(test), Term.sequence(StringReaderTerms.character('!'), rules.named(negation))),
         scope -> scope.getAnyOrThrow(test, negation)
      );
      rules.putStateful(negation, rules.named(test), (scope, context) -> context.negate(scope.getOrThrow(test)));
      rules.putComplex(
         test,
         Term.alternative(
            Term.sequence(rules.named(componentType), StringReaderTerms.character('='), Term.cut(), rules.named(tag)),
            Term.sequence(rules.named(predicateType), StringReaderTerms.character('~'), Term.cut(), rules.named(tag)),
            rules.named(componentType)
         ),
         state -> {
            Scope scope = state.scope();
            P predicate = scope.get(predicateType);

            try {
               if (predicate != null) {
                  Dynamic<?> value = scope.getOrThrow(tag);
                  return state.input().createPredicateTest(predicate, value);
               } else {
                  C component = scope.getOrThrow(componentType);
                  Dynamic<?> value = scope.get(tag);
                  return value != null ? state.input().createComponentTest(component, value) : state.input().createComponentTest(component);
               }
            } catch (CommandSyntaxException e) {
               state.errorCollector().store(state.mark(), e);
               return null;
            }
         }
      );
      rules.put(componentType, new ComponentPredicateParser.ComponentLookupRule<>(idRule));
      rules.put(predicateType, new ComponentPredicateParser.PredicateLookupRule<>(idRule));
      rules.put(tag, new TagParseRule<>(NbtOps.INSTANCE));
      return new Grammar<>(rules, topRule);
   }

   private static class ComponentLookupRule<C, S extends ComponentPredicateParser.Context<?, C, ?>> extends ResourceLookupRule<S, C> {
      private ComponentLookupRule(final NamedRule<S, Identifier> idParser) {
         super(idParser);
      }

      protected C validateElement(final S context, final Identifier id) throws Exception {
         return context.lookupComponentType(id);
      }

      protected Suggestion suggestion(final S context) {
         return context.componentTypeSuggestion();
      }
   }

   public interface Context<T, C, P> extends CommandParserState {
      T forElementType(Identifier id) throws CommandSyntaxException;

      Suggestion elementTypeSuggestion();

      T forTagType(Identifier id) throws CommandSyntaxException;

      Suggestion tagTypeSuggestion();

      C lookupComponentType(Identifier id) throws CommandSyntaxException;

      Suggestion componentTypeSuggestion();

      T createComponentTest(C componentType, Dynamic<?> value) throws CommandSyntaxException;

      T createComponentTest(C componentType);

      P lookupPredicateType(Identifier id) throws CommandSyntaxException;

      Suggestion predicateTypeSuggestion();

      T createPredicateTest(P predicateType, Dynamic<?> value) throws CommandSyntaxException;

      T negate(T value);

      T anyOf(List<T> alternatives);
   }

   private static class ElementLookupRule<T, S extends ComponentPredicateParser.Context<T, ?, ?>> extends ResourceLookupRule<S, T> {
      private ElementLookupRule(final NamedRule<S, Identifier> idParser) {
         super(idParser);
      }

      protected T validateElement(final S context, final Identifier id) throws Exception {
         return context.forElementType(id);
      }

      protected Suggestion suggestion(final S context) {
         return context.elementTypeSuggestion();
      }
   }

   private static class PredicateLookupRule<P, S extends ComponentPredicateParser.Context<?, ?, P>> extends ResourceLookupRule<S, P> {
      private PredicateLookupRule(final NamedRule<S, Identifier> idParser) {
         super(idParser);
      }

      protected P validateElement(final S context, final Identifier id) throws Exception {
         return context.lookupPredicateType(id);
      }

      protected Suggestion suggestion(final S context) {
         return context.predicateTypeSuggestion();
      }
   }

   private static class TagLookupRule<T, S extends ComponentPredicateParser.Context<T, ?, ?>> extends ResourceLookupRule<S, T> {
      private TagLookupRule(final NamedRule<S, Identifier> idParser) {
         super(idParser);
      }

      protected T validateElement(final S context, final Identifier id) throws Exception {
         return context.forTagType(id);
      }

      protected Suggestion suggestion(final S context) {
         return context.tagTypeSuggestion();
      }
   }
}
