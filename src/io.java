import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class io {
   private static final Map<alf, SuggestionProvider<eu>> e = Maps.newHashMap();
   private static final alf f = new alf("ask_server");
   public static final SuggestionProvider<eu> a = a(f, ($$0, $$1) -> ((eu)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ep> b = a(new alf("all_recipes"), ($$0, $$1) -> eu.a(((eu)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ep> c = a(new alf("available_sounds"), ($$0, $$1) -> eu.a(((eu)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ep> d = a(
      new alf("summonable_entities"),
      ($$0, $$1) -> eu.a(lp.g.s().filter($$1x -> $$1x.a(((eu)$$0.getSource()).w()) && $$1x.c()), $$1, btc::a, $$0x -> xp.c(ac.a("entity", btc.a($$0x))))
   );

   public static <S extends eu> SuggestionProvider<S> a(alf $$0, SuggestionProvider<eu> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new io.a($$0, $$1);
      }
   }

   public static SuggestionProvider<eu> a(alf $$0) {
      return e.getOrDefault($$0, a);
   }

   public static alf a(SuggestionProvider<eu> $$0) {
      return $$0 instanceof io.a ? ((io.a)$$0).b : f;
   }

   public static SuggestionProvider<eu> b(SuggestionProvider<eu> $$0) {
      return $$0 instanceof io.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<eu> {
      private final SuggestionProvider<eu> a;
      final alf b;

      public a(alf $$0, SuggestionProvider<eu> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<eu> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
