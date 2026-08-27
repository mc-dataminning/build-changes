import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class gm {
   private static final Map<aeu, SuggestionProvider<dw>> e = Maps.newHashMap();
   private static final aeu f = new aeu("ask_server");
   public static final SuggestionProvider<dw> a = a(f, ($$0, $$1) -> ((dw)$$0.getSource()).a($$0));
   public static final SuggestionProvider<dt> b = a(new aeu("all_recipes"), ($$0, $$1) -> dw.a(((dw)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<dt> c = a(new aeu("available_sounds"), ($$0, $$1) -> dw.a(((dw)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<dt> d = a(
      new aeu("summonable_entities"),
      ($$0, $$1) -> dw.a(jd.h.s().filter($$1x -> $$1x.a(((dw)$$0.getSource()).w()) && $$1x.c()), $$1, bip::a, $$0x -> ti.c(ac.a("entity", bip.a($$0x))))
   );

   public static <S extends dw> SuggestionProvider<S> a(aeu $$0, SuggestionProvider<dw> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new gm.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dw> a(aeu $$0) {
      return e.getOrDefault($$0, a);
   }

   public static aeu a(SuggestionProvider<dw> $$0) {
      return $$0 instanceof gm.a ? ((gm.a)$$0).b : f;
   }

   public static SuggestionProvider<dw> b(SuggestionProvider<dw> $$0) {
      return $$0 instanceof gm.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dw> {
      private final SuggestionProvider<dw> a;
      final aeu b;

      public a(aeu $$0, SuggestionProvider<dw> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dw> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
