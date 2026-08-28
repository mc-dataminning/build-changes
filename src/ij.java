import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ij {
   private static final Map<alg, SuggestionProvider<en>> d = Maps.newHashMap();
   private static final alg e = alg.b("ask_server");
   public static final SuggestionProvider<en> a = a(e, ($$0, $$1) -> ((en)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ei> b = a(alg.b("available_sounds"), ($$0, $$1) -> en.a(((en)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ei> c = a(
      alg.b("summonable_entities"),
      ($$0, $$1) -> en.a(mf.f.s().filter($$1x -> $$1x.a(((en)$$0.getSource()).v()) && $$1x.c()), $$1, bwo::a, $$0x -> wy.c(af.a("entity", bwo.a($$0x))))
   );

   public static <S extends en> SuggestionProvider<S> a(alg $$0, SuggestionProvider<en> $$1) {
      if (d.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         d.put($$0, $$1);
         return new ij.a($$0, $$1);
      }
   }

   public static SuggestionProvider<en> a(alg $$0) {
      return d.getOrDefault($$0, a);
   }

   public static alg a(SuggestionProvider<en> $$0) {
      return $$0 instanceof ij.a ? ((ij.a)$$0).b : e;
   }

   public static SuggestionProvider<en> b(SuggestionProvider<en> $$0) {
      return $$0 instanceof ij.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<en> {
      private final SuggestionProvider<en> a;
      final alg b;

      public a(alg $$0, SuggestionProvider<en> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<en> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
