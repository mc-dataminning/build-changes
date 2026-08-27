import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ht {
   private static final Map<ajv, SuggestionProvider<ea>> e = Maps.newHashMap();
   private static final ajv f = new ajv("ask_server");
   public static final SuggestionProvider<ea> a = a(f, ($$0, $$1) -> ((ea)$$0.getSource()).a($$0));
   public static final SuggestionProvider<dv> b = a(new ajv("all_recipes"), ($$0, $$1) -> ea.a(((ea)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<dv> c = a(new ajv("available_sounds"), ($$0, $$1) -> ea.a(((ea)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<dv> d = a(
      new ajv("summonable_entities"),
      ($$0, $$1) -> ea.a(kt.g.s().filter($$1x -> $$1x.a(((ea)$$0.getSource()).w()) && $$1x.c()), $$1, bqg::a, $$0x -> wi.c(ac.a("entity", bqg.a($$0x))))
   );

   public static <S extends ea> SuggestionProvider<S> a(ajv $$0, SuggestionProvider<ea> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ht.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ea> a(ajv $$0) {
      return e.getOrDefault($$0, a);
   }

   public static ajv a(SuggestionProvider<ea> $$0) {
      return $$0 instanceof ht.a ? ((ht.a)$$0).b : f;
   }

   public static SuggestionProvider<ea> b(SuggestionProvider<ea> $$0) {
      return $$0 instanceof ht.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ea> {
      private final SuggestionProvider<ea> a;
      final ajv b;

      public a(ajv $$0, SuggestionProvider<ea> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ea> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
