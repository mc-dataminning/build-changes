import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class iw {
   private static final Map<alz, SuggestionProvider<fb>> d = Maps.newHashMap();
   private static final alz e = alz.b("ask_server");
   public static final SuggestionProvider<fb> a = a(e, ($$0, $$1) -> ((fb)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ew> b = a(alz.b("available_sounds"), ($$0, $$1) -> fb.a(((fb)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ew> c = a(
      alz.b("summonable_entities"),
      ($$0, $$1) -> fb.a(ma.f.s().filter($$1x -> $$1x.a(((fb)$$0.getSource()).v()) && $$1x.c()), $$1, bvr::a, $$0x -> xv.c(ae.a("entity", bvr.a($$0x))))
   );

   public static <S extends fb> SuggestionProvider<S> a(alz $$0, SuggestionProvider<fb> $$1) {
      if (d.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         d.put($$0, $$1);
         return new iw.a($$0, $$1);
      }
   }

   public static SuggestionProvider<fb> a(alz $$0) {
      return d.getOrDefault($$0, a);
   }

   public static alz a(SuggestionProvider<fb> $$0) {
      return $$0 instanceof iw.a ? ((iw.a)$$0).b : e;
   }

   public static SuggestionProvider<fb> b(SuggestionProvider<fb> $$0) {
      return $$0 instanceof iw.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<fb> {
      private final SuggestionProvider<fb> a;
      final alz b;

      public a(alz $$0, SuggestionProvider<fb> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<fb> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
