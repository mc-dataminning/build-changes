import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class gk {
   private static final Map<aer, SuggestionProvider<du>> e = Maps.newHashMap();
   private static final aer f = new aer("ask_server");
   public static final SuggestionProvider<du> a = a(f, ($$0, $$1) -> ((du)$$0.getSource()).a($$0));
   public static final SuggestionProvider<dr> b = a(new aer("all_recipes"), ($$0, $$1) -> du.a(((du)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<dr> c = a(new aer("available_sounds"), ($$0, $$1) -> du.a(((du)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<dr> d = a(
      new aer("summonable_entities"),
      ($$0, $$1) -> du.a(jb.h.s().filter($$1x -> $$1x.a(((du)$$0.getSource()).w()) && $$1x.c()), $$1, bim::a, $$0x -> tf.c(ac.a("entity", bim.a($$0x))))
   );

   public static <S extends du> SuggestionProvider<S> a(aer $$0, SuggestionProvider<du> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new gk.a($$0, $$1);
      }
   }

   public static SuggestionProvider<du> a(aer $$0) {
      return e.getOrDefault($$0, a);
   }

   public static aer a(SuggestionProvider<du> $$0) {
      return $$0 instanceof gk.a ? ((gk.a)$$0).b : f;
   }

   public static SuggestionProvider<du> b(SuggestionProvider<du> $$0) {
      return $$0 instanceof gk.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<du> {
      private final SuggestionProvider<du> a;
      final aer b;

      public a(aer $$0, SuggestionProvider<du> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<du> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
