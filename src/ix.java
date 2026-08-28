import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ix {
   private static final Map<aku, SuggestionProvider<fc>> d = Maps.newHashMap();
   private static final aku e = aku.b("ask_server");
   public static final SuggestionProvider<fc> a = a(e, ($$0, $$1) -> ((fc)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ex> b = a(aku.b("available_sounds"), ($$0, $$1) -> fc.a(((fc)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ex> c = a(
      aku.b("summonable_entities"),
      ($$0, $$1) -> fc.a(mb.f.s().filter($$1x -> $$1x.a(((fc)$$0.getSource()).v()) && $$1x.c()), $$1, bvi::a, $$0x -> wp.c(af.a("entity", bvi.a($$0x))))
   );

   public static <S extends fc> SuggestionProvider<S> a(aku $$0, SuggestionProvider<fc> $$1) {
      if (d.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         d.put($$0, $$1);
         return new ix.a($$0, $$1);
      }
   }

   public static SuggestionProvider<fc> a(aku $$0) {
      return d.getOrDefault($$0, a);
   }

   public static aku a(SuggestionProvider<fc> $$0) {
      return $$0 instanceof ix.a ? ((ix.a)$$0).b : e;
   }

   public static SuggestionProvider<fc> b(SuggestionProvider<fc> $$0) {
      return $$0 instanceof ix.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<fc> {
      private final SuggestionProvider<fc> a;
      final aku b;

      public a(aku $$0, SuggestionProvider<fc> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<fc> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
