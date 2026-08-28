import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class il {
   private static final Map<alr, SuggestionProvider<ep>> d = Maps.newHashMap();
   private static final alr e = alr.b("ask_server");
   public static final SuggestionProvider<ep> a = a(e, ($$0, $$1) -> ((ep)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ek> b = a(alr.b("available_sounds"), ($$0, $$1) -> ep.a(((ep)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ek> c = a(
      alr.b("summonable_entities"),
      ($$0, $$1) -> ep.a(mh.f.s().filter($$1x -> $$1x.a(((ep)$$0.getSource()).v()) && $$1x.c()), $$1, bxn::a, $$0x -> xg.c(ag.a("entity", bxn.a($$0x))))
   );

   public static <S extends ep> SuggestionProvider<S> a(alr $$0, SuggestionProvider<ep> $$1) {
      if (d.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         d.put($$0, $$1);
         return new il.a($$0, $$1);
      }
   }

   public static SuggestionProvider<ep> a(alr $$0) {
      return d.getOrDefault($$0, a);
   }

   public static alr a(SuggestionProvider<ep> $$0) {
      return $$0 instanceof il.a ? ((il.a)$$0).b : e;
   }

   public static SuggestionProvider<ep> b(SuggestionProvider<ep> $$0) {
      return $$0 instanceof il.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<ep> {
      private final SuggestionProvider<ep> a;
      final alr b;

      public a(alr $$0, SuggestionProvider<ep> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<ep> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
