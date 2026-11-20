package net.minecraft.commands.suggestions;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.commands.ParseContext;
import net.minecraft.commands.arguments.ValidationWrapper;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tags.TagKey;
import net.minecraft.util.context.ContextKeySet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.Validatable;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public interface SuggestionContext extends ParseContext {
   CharMatcher MATCH_SPLITTER = CharMatcher.anyOf("._/");

   Collection<String> onlinePlayerNames();

   default Collection<String> customTabSuggestions() {
      return this.onlinePlayerNames();
   }

   default Collection<String> selectedEntities() {
      return Collections.emptyList();
   }

   Collection<String> allTeams();

   Stream<Identifier> availableSounds();

   Stream<Identifier> availablePostEffects();

   default Collection<SuggestionContext.TextCoordinates> relevantCoordinates() {
      return Collections.singleton(SuggestionContext.TextCoordinates.DEFAULT_GLOBAL);
   }

   default Collection<SuggestionContext.TextCoordinates> absoluteCoordinates() {
      return Collections.singleton(SuggestionContext.TextCoordinates.DEFAULT_GLOBAL);
   }

   @Nullable MinecraftServer server();

   @Nullable Level level();

   Set<ResourceKey<Level>> levels();

   @Nullable Entity entity();

   Vec3 position();

   HolderLookup.Provider holderLookups();

   @Override
   default HolderGetter.Provider holderGetters() {
      return this.holderLookups();
   }

   @Override
   default <T extends Validatable> ValidationWrapper<T> getOrCreateValidationWrapper(final Holder<T> element, final ContextKeySet contextKeySet) throws CommandSyntaxException {
      return ValidationWrapper.Provider.LAZY.getOrCreate(element, contextKeySet);
   }

   CompletableFuture<Suggestions> suggestObjectiveNames(CommandContext<?> context, SuggestionsBuilder builder);

   CompletableFuture<Suggestions> customSuggestion(CommandContext<?> context);

   default <E> void suggestRegistryElements(
      final HolderLookup<E> registry, final SuggestionContext.ElementSuggestionType elements, final SuggestionsBuilder builder, final Predicate<E> filter
   ) {
      if (elements.shouldSuggestTags()) {
         if (elements.shouldPrefixTags()) {
            suggestResource(registry.listTagIds().map(TagKey::location), builder, "#");
         } else {
            suggestResource(registry.listTagIds().map(TagKey::location), builder);
         }
      }

      if (elements.shouldSuggestElements()) {
         suggestResource(registry.listElements().filter(holder -> filter.test(holder.value())).map(Holder.Reference::key).map(ResourceKey::identifier), builder);
      }
   }

   default <E> CompletableFuture<Suggestions> suggestRegistryElements(
      final CommandContext<?> context,
      final ResourceKey<? extends Registry<? extends E>> key,
      final SuggestionContext.ElementSuggestionType elements,
      final SuggestionsBuilder builder
   ) {
      return this.suggestRegistryElements(context, key, elements, builder, var0 -> true);
   }

   <E> CompletableFuture<Suggestions> suggestRegistryElements(
      CommandContext<?> context,
      ResourceKey<? extends Registry<? extends E>> key,
      SuggestionContext.ElementSuggestionType elements,
      SuggestionsBuilder builder,
      Predicate<E> filter
   );

   static <T> void filterResources(final Iterable<T> values, final String contents, final Function<T, Identifier> converter, final Consumer<T> consumer) {
      boolean hasNamespace = contents.indexOf(58) > -1;

      for (T value : values) {
         Identifier id = converter.apply(value);
         if (hasNamespace) {
            String name = id.toString();
            if (matchesSubStr(contents, name)) {
               consumer.accept(value);
            }
         } else if (matchesSubStr(contents, id.getNamespace()) || matchesSubStr(contents, id.getPath())) {
            consumer.accept(value);
         }
      }
   }

   static <T> void filterResources(
      final Iterable<T> values, final String contents, final String prefix, final Function<T, Identifier> converter, final Consumer<T> consumer
   ) {
      if (contents.isEmpty()) {
         values.forEach(consumer);
      } else {
         String commonPrefix = Strings.commonPrefix(contents, prefix);
         if (!commonPrefix.isEmpty()) {
            String strippedContents = contents.substring(commonPrefix.length());
            filterResources(values, strippedContents, converter, consumer);
         }
      }
   }

   static CompletableFuture<Suggestions> suggestResource(final Iterable<Identifier> values, final SuggestionsBuilder builder, final String prefix) {
      String contents = builder.getRemaining().toLowerCase(Locale.ROOT);
      filterResources(values, contents, prefix, t -> t, v -> builder.suggest(prefix + v));
      return builder.buildFuture();
   }

   static CompletableFuture<Suggestions> suggestResource(final Stream<Identifier> values, final SuggestionsBuilder builder, final String prefix) {
      return suggestResource(values::iterator, builder, prefix);
   }

   static CompletableFuture<Suggestions> suggestResource(final Iterable<Identifier> values, final SuggestionsBuilder builder) {
      String contents = builder.getRemaining().toLowerCase(Locale.ROOT);
      filterResources(values, contents, t -> t, v -> builder.suggest(v.toString()));
      return builder.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> suggestResource(
      final Iterable<T> values, final SuggestionsBuilder builder, final Function<T, Identifier> id, final Function<T, Message> tooltip
   ) {
      String contents = builder.getRemaining().toLowerCase(Locale.ROOT);
      filterResources(values, contents, id, v -> builder.suggest(id.apply(v).toString(), tooltip.apply(v)));
      return builder.buildFuture();
   }

   static CompletableFuture<Suggestions> suggestResource(final Stream<Identifier> values, final SuggestionsBuilder builder) {
      return suggestResource(values::iterator, builder);
   }

   static <T> CompletableFuture<Suggestions> suggestResource(
      final Stream<T> values, final SuggestionsBuilder builder, final Function<T, Identifier> id, final Function<T, Message> tooltip
   ) {
      return suggestResource(values::iterator, builder, id, tooltip);
   }

   static CompletableFuture<Suggestions> suggestCoordinates(
      final String currentInput,
      final Collection<SuggestionContext.TextCoordinates> allSuggestions,
      final SuggestionsBuilder builder,
      final Predicate<String> validator
   ) {
      List<String> result = new ArrayList<>();
      if (Strings.isNullOrEmpty(currentInput)) {
         for (SuggestionContext.TextCoordinates coordinate : allSuggestions) {
            String fullValue = coordinate.x + " " + coordinate.y + " " + coordinate.z;
            if (validator.test(fullValue)) {
               result.add(coordinate.x);
               result.add(coordinate.x + " " + coordinate.y);
               result.add(fullValue);
            }
         }
      } else {
         String[] fields = currentInput.split(" ");
         if (fields.length == 1) {
            for (SuggestionContext.TextCoordinates coordinate : allSuggestions) {
               String fullValue = fields[0] + " " + coordinate.y + " " + coordinate.z;
               if (validator.test(fullValue)) {
                  result.add(fields[0] + " " + coordinate.y);
                  result.add(fullValue);
               }
            }
         } else if (fields.length == 2) {
            for (SuggestionContext.TextCoordinates coordinate : allSuggestions) {
               String fullValue = fields[0] + " " + fields[1] + " " + coordinate.z;
               if (validator.test(fullValue)) {
                  result.add(fullValue);
               }
            }
         }
      }

      return suggest(result, builder);
   }

   static CompletableFuture<Suggestions> suggest2DCoordinates(
      final String currentInput,
      final Collection<SuggestionContext.TextCoordinates> allSuggestions,
      final SuggestionsBuilder builder,
      final Predicate<String> validator
   ) {
      List<String> result = new ArrayList<>();
      if (Strings.isNullOrEmpty(currentInput)) {
         for (SuggestionContext.TextCoordinates coordinate : allSuggestions) {
            String fullValue = coordinate.x + " " + coordinate.z;
            if (validator.test(fullValue)) {
               result.add(coordinate.x);
               result.add(fullValue);
            }
         }
      } else {
         String[] fields = currentInput.split(" ");
         if (fields.length == 1) {
            for (SuggestionContext.TextCoordinates coordinate : allSuggestions) {
               String fullValue = fields[0] + " " + coordinate.z;
               if (validator.test(fullValue)) {
                  result.add(fullValue);
               }
            }
         }
      }

      return suggest(result, builder);
   }

   static CompletableFuture<Suggestions> suggest(final Iterable<String> values, final SuggestionsBuilder builder) {
      String lowerPrefix = builder.getRemaining().toLowerCase(Locale.ROOT);

      for (String name : values) {
         if (matchesSubStr(lowerPrefix, name.toLowerCase(Locale.ROOT))) {
            builder.suggest(name);
         }
      }

      return builder.buildFuture();
   }

   static CompletableFuture<Suggestions> suggest(final Stream<String> values, final SuggestionsBuilder builder) {
      String lowerPrefix = builder.getRemaining().toLowerCase(Locale.ROOT);
      values.filter(v -> matchesSubStr(lowerPrefix, v.toLowerCase(Locale.ROOT))).forEach(builder::suggest);
      return builder.buildFuture();
   }

   static CompletableFuture<Suggestions> suggest(final String[] values, final SuggestionsBuilder builder) {
      String lowerPrefix = builder.getRemaining().toLowerCase(Locale.ROOT);

      for (String name : values) {
         if (matchesSubStr(lowerPrefix, name.toLowerCase(Locale.ROOT))) {
            builder.suggest(name);
         }
      }

      return builder.buildFuture();
   }

   static <T> CompletableFuture<Suggestions> suggest(
      final Iterable<T> values, final SuggestionsBuilder builder, final Function<T, String> toString, final Function<T, Message> tooltip
   ) {
      String lowerPrefix = builder.getRemaining().toLowerCase(Locale.ROOT);

      for (T value : values) {
         String name = toString.apply(value);
         if (matchesSubStr(lowerPrefix, name.toLowerCase(Locale.ROOT))) {
            builder.suggest(name, tooltip.apply(value));
         }
      }

      return builder.buildFuture();
   }

   static boolean matchesSubStr(final String pattern, final String input) {
      int index = 0;

      while (!input.startsWith(pattern, index)) {
         int indexOfSplitter = MATCH_SPLITTER.indexIn(input, index);
         if (indexOfSplitter < 0) {
            return false;
         }

         index = indexOfSplitter + 1;
      }

      return true;
   }

   enum ElementSuggestionType {
      TAGS_WITH_PREFIX,
      TAGS_WITHOUT_PREFIX,
      ELEMENTS,
      ALL;

      public boolean shouldPrefixTags() {
         return this != TAGS_WITHOUT_PREFIX;
      }

      public boolean shouldSuggestTags() {
         return this == TAGS_WITH_PREFIX || this == TAGS_WITHOUT_PREFIX || this == ALL;
      }

      public boolean shouldSuggestElements() {
         return this == ELEMENTS || this == ALL;
      }
   }

   @FunctionalInterface
   interface Provider {
      static SuggestionContext.Provider suggestNothing() {
         return (var0, builder) -> builder.buildFuture();
      }

      CompletableFuture<Suggestions> getSuggestions(CommandContext<? extends SuggestionContext> context, SuggestionsBuilder builder) throws CommandSyntaxException;
   }

   record TextCoordinates(String x, String y, String z) {
      public static final SuggestionContext.TextCoordinates DEFAULT_LOCAL = new SuggestionContext.TextCoordinates("^", "^", "^");
      public static final SuggestionContext.TextCoordinates DEFAULT_GLOBAL = new SuggestionContext.TextCoordinates("~", "~", "~");
   }
}
