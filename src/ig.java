import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ig {
   private static final Map<akt, SuggestionProvider<em>> e = Maps.newHashMap();
   private static final akt f = new akt("ask_server");
   public static final SuggestionProvider<em> a = a(f, ($$0, $$1) -> ((em)$$0.getSource()).a($$0));
   public static final SuggestionProvider<eh> b = a(new akt("all_recipes"), ($$0, $$1) -> em.a(((em)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<eh> c = a(new akt("available_sounds"), ($$0, $$1) -> em.a(((em)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<eh> d = a(
      new akt("summonable_entities"),
      ($$0, $$1) -> em.a(lh.g.s().filter($$1x -> $$1x.a(((em)$$0.getSource()).w()) && $$1x.c()), $$1, bsb::a, $$0x -> xe.c(ad.a("entity", bsb.a($$0x))))
   );

   public static <S extends em> SuggestionProvider<S> a(akt $$0, SuggestionProvider<em> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ig.a($$0, $$1);
      }
   }

   public static SuggestionProvider<em> a(akt $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akt a(SuggestionProvider<em> $$0) {
      return $$0 instanceof ig.a ? ((ig.a)$$0).b : f;
   }

   public static SuggestionProvider<em> b(SuggestionProvider<em> $$0) {
      return $$0 instanceof ig.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<em> {
      private final SuggestionProvider<em> a;
      final akt b;

      public a(akt $$0, SuggestionProvider<em> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<em> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
