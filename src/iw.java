import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class iw {
   private static final Map<all, SuggestionProvider<fb>> e = Maps.newHashMap();
   private static final all f = all.b("ask_server");
   public static final SuggestionProvider<fb> a = a(f, ($$0, $$1) -> ((fb)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ew> b = a(all.b("all_recipes"), ($$0, $$1) -> fb.a(((fb)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<ew> c = a(all.b("available_sounds"), ($$0, $$1) -> fb.a(((fb)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ew> d = a(
      all.b("summonable_entities"),
      ($$0, $$1) -> fb.a(lz.f.s().filter($$1x -> $$1x.a(((fb)$$0.getSource()).w()) && $$1x.c()), $$1, bup::a, $$0x -> xl.c(ae.a("entity", bup.a($$0x))))
   );

   public static <S extends fb> SuggestionProvider<S> a(all $$0, SuggestionProvider<fb> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new iw.a($$0, $$1);
      }
   }

   public static SuggestionProvider<fb> a(all $$0) {
      return e.getOrDefault($$0, a);
   }

   public static all a(SuggestionProvider<fb> $$0) {
      return $$0 instanceof iw.a ? ((iw.a)$$0).b : f;
   }

   public static SuggestionProvider<fb> b(SuggestionProvider<fb> $$0) {
      return $$0 instanceof iw.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<fb> {
      private final SuggestionProvider<fb> a;
      final all b;

      public a(all $$0, SuggestionProvider<fb> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<fb> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
