import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ic {
   private static final Map<akn, SuggestionProvider<ej>> e = Maps.newHashMap();
   private static final akn f = new akn("ask_server");
   public static final SuggestionProvider<ej> a = a(f, ($$0, $$1) -> ((ej)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ee> b = a(new akn("all_recipes"), ($$0, $$1) -> ej.a(((ej)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ee> c = a(new akn("available_sounds"), ($$0, $$1) -> ej.a(((ej)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ee> d = a(
      new akn("summonable_entities"),
      ($$0, $$1) -> ej.a(le.g.s().filter($$1x -> $$1x.a(((ej)$$0.getSource()).w()) && $$1x.c()), $$1, bsc::a, $$0x -> wx.c(ac.a("entity", bsc.a($$0x))))
   );

   public static <S extends ej> SuggestionProvider<S> a(akn $$0, SuggestionProvider<ej> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ic.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ej> a(akn $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akn a(SuggestionProvider<ej> $$0) {
      return $$0 instanceof ic.a ? ((ic.a)$$0).b : f;
   }

   public static SuggestionProvider<ej> b(SuggestionProvider<ej> $$0) {
      return $$0 instanceof ic.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ej> {
      private final SuggestionProvider<ej> a;
      final akn b;

      public a(akn $$0, SuggestionProvider<ej> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ej> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
