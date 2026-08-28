import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class is {
   private static final Map<akr, SuggestionProvider<ey>> e = Maps.newHashMap();
   private static final akr f = akr.b("ask_server");
   public static final SuggestionProvider<ey> a = a(f, ($$0, $$1) -> ((ey)$$0.getSource()).a($$0));
   public static final SuggestionProvider<et> b = a(akr.b("all_recipes"), ($$0, $$1) -> ey.a(((ey)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<et> c = a(akr.b("available_sounds"), ($$0, $$1) -> ey.a(((ey)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<et> d = a(
      akr.b("summonable_entities"),
      ($$0, $$1) -> ey.a(lt.f.t().filter($$1x -> $$1x.a(((ey)$$0.getSource()).w()) && $$1x.c()), $$1, bsx::a, $$0x -> wz.c(ad.a("entity", bsx.a($$0x))))
   );

   public static <S extends ey> SuggestionProvider<S> a(akr $$0, SuggestionProvider<ey> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new is.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ey> a(akr $$0) {
      return e.getOrDefault($$0, a);
   }

   public static akr a(SuggestionProvider<ey> $$0) {
      return $$0 instanceof is.a ? ((is.a)$$0).b : f;
   }

   public static SuggestionProvider<ey> b(SuggestionProvider<ey> $$0) {
      return $$0 instanceof is.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ey> {
      private final SuggestionProvider<ey> a;
      final akr b;

      public a(akr $$0, SuggestionProvider<ey> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ey> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
