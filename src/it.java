import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class it {
   private static final Map<alc, SuggestionProvider<ey>> e = Maps.newHashMap();
   private static final alc f = alc.b("ask_server");
   public static final SuggestionProvider<ey> a = a(f, ($$0, $$1) -> ((ey)$$0.getSource()).a($$0));
   public static final SuggestionProvider<et> b = a(alc.b("all_recipes"), ($$0, $$1) -> ey.a(((ey)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<et> c = a(alc.b("available_sounds"), ($$0, $$1) -> ey.a(((ey)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<et> d = a(
      alc.b("summonable_entities"),
      ($$0, $$1) -> ey.a(lu.f.s().filter($$1x -> $$1x.a(((ey)$$0.getSource()).w()) && $$1x.c()), $$1, btv::a, $$0x -> xd.c(ad.a("entity", btv.a($$0x))))
   );

   public static <S extends ey> SuggestionProvider<S> a(alc $$0, SuggestionProvider<ey> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new it.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ey> a(alc $$0) {
      return e.getOrDefault($$0, a);
   }

   public static alc a(SuggestionProvider<ey> $$0) {
      return $$0 instanceof it.a ? ((it.a)$$0).b : f;
   }

   public static SuggestionProvider<ey> b(SuggestionProvider<ey> $$0) {
      return $$0 instanceof it.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ey> {
      private final SuggestionProvider<ey> a;
      final alc b;

      public a(alc $$0, SuggestionProvider<ey> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ey> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
