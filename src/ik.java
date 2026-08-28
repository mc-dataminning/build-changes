import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ik {
   private static final Map<ali, SuggestionProvider<eo>> d = Maps.newHashMap();
   private static final ali e = ali.b("ask_server");
   public static final SuggestionProvider<eo> a = a(e, ($$0, $$1) -> ((eo)$$0.getSource()).a($$0));
   public static final SuggestionProvider<ej> b = a(ali.b("available_sounds"), ($$0, $$1) -> eo.a(((eo)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<ej> c = a(
      ali.b("summonable_entities"),
      ($$0, $$1) -> eo.a(mg.f.s().filter($$1x -> $$1x.a(((eo)$$0.getSource()).v()) && $$1x.c()), $$1, bxc::a, $$0x -> xa.c(ag.a("entity", bxc.a($$0x))))
   );

   public static <S extends eo> SuggestionProvider<S> a(ali $$0, SuggestionProvider<eo> $$1) {
      if (d.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         d.put($$0, $$1);
         return new ik.a($$0, $$1);
      }
   }

   public static SuggestionProvider<eo> a(ali $$0) {
      return d.getOrDefault($$0, a);
   }

   public static ali a(SuggestionProvider<eo> $$0) {
      return $$0 instanceof ik.a ? ((ik.a)$$0).b : e;
   }

   public static SuggestionProvider<eo> b(SuggestionProvider<eo> $$0) {
      return $$0 instanceof ik.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<eo> {
      private final SuggestionProvider<eo> a;
      final ali b;

      public a(ali $$0, SuggestionProvider<eo> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<eo> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
