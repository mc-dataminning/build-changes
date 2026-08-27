import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class gl {
   private static final Map<aep, SuggestionProvider<dv>> e = Maps.newHashMap();
   private static final aep f = new aep("ask_server");
   public static final SuggestionProvider<dv> a = a(f, ($$0, $$1) -> ((dv)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ds> b = a(new aep("all_recipes"), ($$0, $$1) -> dv.a(((dv)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ds> c = a(new aep("available_sounds"), ($$0, $$1) -> dv.a(((dv)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ds> d = a(
      new aep("summonable_entities"),
      ($$0, $$1) -> dv.a(jc.h.s().filter($$1x -> $$1x.a(((dv)$$0.getSource()).w()) && $$1x.c()), $$1, bik::a, $$0x -> te.c(ac.a("entity", bik.a($$0x))))
   );

   public static <S extends dv> SuggestionProvider<S> a(aep $$0, SuggestionProvider<dv> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new gl.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dv> a(aep $$0) {
      return e.getOrDefault($$0, a);
   }

   public static aep a(SuggestionProvider<dv> $$0) {
      return $$0 instanceof gl.a ? ((gl.a)$$0).b : f;
   }

   public static SuggestionProvider<dv> b(SuggestionProvider<dv> $$0) {
      return $$0 instanceof gl.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dv> {
      private final SuggestionProvider<dv> a;
      final aep b;

      public a(aep $$0, SuggestionProvider<dv> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dv> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
