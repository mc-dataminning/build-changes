import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ia {
   private static final Map<akf, SuggestionProvider<eh>> e = Maps.newHashMap();
   private static final akf f = new akf("ask_server");
   public static final SuggestionProvider<eh> a = a(f, ($$0, $$1) -> ((eh)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ec> b = a(new akf("all_recipes"), ($$0, $$1) -> eh.a(((eh)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ec> c = a(new akf("available_sounds"), ($$0, $$1) -> eh.a(((eh)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ec> d = a(
      new akf("summonable_entities"),
      ($$0, $$1) -> eh.a(lc.g.s().filter($$1x -> $$1x.a(((eh)$$0.getSource()).w()) && $$1x.c()), $$1, bqr::a, $$0x -> ws.c(ac.a("entity", bqr.a($$0x))))
   );

   public static <S extends eh> SuggestionProvider<S> a(akf $$0, SuggestionProvider<eh> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ia.a($$0, $$1);
      }
   }

   public static SuggestionProvider<eh> a(akf $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akf a(SuggestionProvider<eh> $$0) {
      return $$0 instanceof ia.a ? ((ia.a)$$0).b : f;
   }

   public static SuggestionProvider<eh> b(SuggestionProvider<eh> $$0) {
      return $$0 instanceof ia.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<eh> {
      private final SuggestionProvider<eh> a;
      final akf b;

      public a(akf $$0, SuggestionProvider<eh> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<eh> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
