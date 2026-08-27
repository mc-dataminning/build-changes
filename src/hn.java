import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class hn {
   private static final Map<ahg, SuggestionProvider<dx>> e = Maps.newHashMap();
   private static final ahg f = new ahg("ask_server");
   public static final SuggestionProvider<dx> a = a(f, ($$0, $$1) -> ((dx)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ds> b = a(new ahg("all_recipes"), ($$0, $$1) -> dx.a(((dx)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ds> c = a(new ahg("available_sounds"), ($$0, $$1) -> dx.a(((dx)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ds> d = a(
      new ahg("summonable_entities"),
      ($$0, $$1) -> dx.a(kd.g.s().filter($$1x -> $$1x.a(((dx)$$0.getSource()).w()) && $$1x.c()), $$1, blz::a, $$0x -> vf.c(ac.a("entity", blz.a($$0x))))
   );

   public static <S extends dx> SuggestionProvider<S> a(ahg $$0, SuggestionProvider<dx> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new hn.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dx> a(ahg $$0) {
      return e.getOrDefault($$0, a);
   }

   public static ahg a(SuggestionProvider<dx> $$0) {
      return $$0 instanceof hn.a ? ((hn.a)$$0).b : f;
   }

   public static SuggestionProvider<dx> b(SuggestionProvider<dx> $$0) {
      return $$0 instanceof hn.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dx> {
      private final SuggestionProvider<dx> a;
      final ahg b;

      public a(ahg $$0, SuggestionProvider<dx> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dx> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
