import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ib {
   private static final Map<akh, SuggestionProvider<ei>> e = Maps.newHashMap();
   private static final akh f = new akh("ask_server");
   public static final SuggestionProvider<ei> a = a(f, ($$0, $$1) -> ((ei)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ed> b = a(new akh("all_recipes"), ($$0, $$1) -> ei.a(((ei)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ed> c = a(new akh("available_sounds"), ($$0, $$1) -> ei.a(((ei)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ed> d = a(
      new akh("summonable_entities"),
      ($$0, $$1) -> ei.a(ld.g.s().filter($$1x -> $$1x.a(((ei)$$0.getSource()).w()) && $$1x.c()), $$1, brn::a, $$0x -> wu.c(ac.a("entity", brn.a($$0x))))
   );

   public static <S extends ei> SuggestionProvider<S> a(akh $$0, SuggestionProvider<ei> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ib.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ei> a(akh $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akh a(SuggestionProvider<ei> $$0) {
      return $$0 instanceof ib.a ? ((ib.a)$$0).b : f;
   }

   public static SuggestionProvider<ei> b(SuggestionProvider<ei> $$0) {
      return $$0 instanceof ib.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ei> {
      private final SuggestionProvider<ei> a;
      final akh b;

      public a(akh $$0, SuggestionProvider<ei> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ei> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
