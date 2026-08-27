import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class hr {
   private static final Map<ajc, SuggestionProvider<dz>> e = Maps.newHashMap();
   private static final ajc f = new ajc("ask_server");
   public static final SuggestionProvider<dz> a = a(f, ($$0, $$1) -> ((dz)$$0.getSource()).a($$0));
   public static final SuggestionProvider<du> b = a(new ajc("all_recipes"), ($$0, $$1) -> dz.a(((dz)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<du> c = a(new ajc("available_sounds"), ($$0, $$1) -> dz.a(((dz)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<du> d = a(
      new ajc("summonable_entities"),
      ($$0, $$1) -> dz.a(kh.g.s().filter($$1x -> $$1x.a(((dz)$$0.getSource()).w()) && $$1x.c()), $$1, bol::a, $$0x -> vs.c(ac.a("entity", bol.a($$0x))))
   );

   public static <S extends dz> SuggestionProvider<S> a(ajc $$0, SuggestionProvider<dz> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new hr.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dz> a(ajc $$0) {
      return e.getOrDefault($$0, a);
   }

   public static ajc a(SuggestionProvider<dz> $$0) {
      return $$0 instanceof hr.a ? ((hr.a)$$0).b : f;
   }

   public static SuggestionProvider<dz> b(SuggestionProvider<dz> $$0) {
      return $$0 instanceof hr.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dz> {
      private final SuggestionProvider<dz> a;
      final ajc b;

      public a(ajc $$0, SuggestionProvider<dz> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dz> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
