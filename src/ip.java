import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ip {
   private static final Map<akk, SuggestionProvider<ev>> e = Maps.newHashMap();
   private static final akk f = new akk("ask_server");
   public static final SuggestionProvider<ev> a = a(f, ($$0, $$1) -> ((ev)$$0.getSource()).a($$0));
   public static final SuggestionProvider<eq> b = a(new akk("all_recipes"), ($$0, $$1) -> ev.a(((ev)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<eq> c = a(new akk("available_sounds"), ($$0, $$1) -> ev.a(((ev)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<eq> d = a(
      new akk("summonable_entities"),
      ($$0, $$1) -> ev.a(lq.f.t().filter($$1x -> $$1x.a(((ev)$$0.getSource()).w()) && $$1x.c()), $$1, bsm::a, $$0x -> wu.c(ac.a("entity", bsm.a($$0x))))
   );

   public static <S extends ev> SuggestionProvider<S> a(akk $$0, SuggestionProvider<ev> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new ip.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ev> a(akk $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akk a(SuggestionProvider<ev> $$0) {
      return $$0 instanceof ip.a ? ((ip.a)$$0).b : f;
   }

   public static SuggestionProvider<ev> b(SuggestionProvider<ev> $$0) {
      return $$0 instanceof ip.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ev> {
      private final SuggestionProvider<ev> a;
      final akk b;

      public a(akk $$0, SuggestionProvider<ev> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ev> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
