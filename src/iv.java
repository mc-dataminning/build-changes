import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class iv {
   private static final Map<alh, SuggestionProvider<fa>> e = Maps.newHashMap();
   private static final alh f = alh.b("ask_server");
   public static final SuggestionProvider<fa> a = a(f, ($$0, $$1) -> ((fa)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ev> b = a(alh.b("all_recipes"), ($$0, $$1) -> fa.a(((fa)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ev> c = a(alh.b("available_sounds"), ($$0, $$1) -> fa.a(((fa)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ev> d = a(
      alh.b("summonable_entities"),
      ($$0, $$1) -> fa.a(lx.f.s().filter($$1x -> $$1x.a(((fa)$$0.getSource()).w()) && $$1x.c()), $$1, bug::a, $$0x -> xh.c(ad.a("entity", bug.a($$0x))))
   );

   public static <S extends fa> SuggestionProvider<S> a(alh $$0, SuggestionProvider<fa> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new iv.a($$0, $$1);
      }
   }

   public static SuggestionProvider<fa> a(alh $$0) {
      return e.getOrDefault($$0, a);
   }

   public static alh a(SuggestionProvider<fa> $$0) {
      return $$0 instanceof iv.a ? ((iv.a)$$0).b : f;
   }

   public static SuggestionProvider<fa> b(SuggestionProvider<fa> $$0) {
      return $$0 instanceof iv.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<fa> {
      private final SuggestionProvider<fa> a;
      final alh b;

      public a(alh $$0, SuggestionProvider<fa> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<fa> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
