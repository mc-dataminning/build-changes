import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class iu {
   private static final Map<ale, SuggestionProvider<ez>> e = Maps.newHashMap();
   private static final ale f = ale.b("ask_server");
   public static final SuggestionProvider<ez> a = a(f, ($$0, $$1) -> ((ez)$$0.getSource()).a($$0));
   public static final SuggestionProvider<eu> b = a(ale.b("all_recipes"), ($$0, $$1) -> ez.a(((ez)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<eu> c = a(ale.b("available_sounds"), ($$0, $$1) -> ez.a(((ez)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<eu> d = a(
      ale.b("summonable_entities"),
      ($$0, $$1) -> ez.a(lv.f.s().filter($$1x -> $$1x.a(((ez)$$0.getSource()).w()) && $$1x.c()), $$1, bty::a, $$0x -> xe.c(ad.a("entity", bty.a($$0x))))
   );

   public static <S extends ez> SuggestionProvider<S> a(ale $$0, SuggestionProvider<ez> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new iu.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ez> a(ale $$0) {
      return e.getOrDefault($$0, a);
   }

   public static ale a(SuggestionProvider<ez> $$0) {
      return $$0 instanceof iu.a ? ((iu.a)$$0).b : f;
   }

   public static SuggestionProvider<ez> b(SuggestionProvider<ez> $$0) {
      return $$0 instanceof iu.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ez> {
      private final SuggestionProvider<ez> a;
      final ale b;

      public a(ale $$0, SuggestionProvider<ez> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ez> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
