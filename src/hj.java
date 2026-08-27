import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class hj {
   private static final Map<agi, SuggestionProvider<dy>> e = Maps.newHashMap();
   private static final agi f = new agi("ask_server");
   public static final SuggestionProvider<dy> a = a(f, ($$0, $$1) -> ((dy)$$0.getSource()).a($$0));
   public static final SuggestionProvider<du> b = a(new agi("all_recipes"), ($$0, $$1) -> dy.a(((dy)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<du> c = a(new agi("available_sounds"), ($$0, $$1) -> dy.a(((dy)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<du> d = a(
      new agi("summonable_entities"),
      ($$0, $$1) -> dy.a(jy.h.s().filter($$1x -> $$1x.a(((dy)$$0.getSource()).w()) && $$1x.c()), $$1, bku::a, $$0x -> ur.c(ac.a("entity", bku.a($$0x))))
   );

   public static <S extends dy> SuggestionProvider<S> a(agi $$0, SuggestionProvider<dy> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new hj.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dy> a(agi $$0) {
      return e.getOrDefault($$0, a);
   }

   public static agi a(SuggestionProvider<dy> $$0) {
      return $$0 instanceof hj.a ? ((hj.a)$$0).b : f;
   }

   public static SuggestionProvider<dy> b(SuggestionProvider<dy> $$0) {
      return $$0 instanceof hj.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dy> {
      private final SuggestionProvider<dy> a;
      final agi b;

      public a(agi $$0, SuggestionProvider<dy> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dy> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
