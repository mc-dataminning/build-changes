import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gh implements ArgumentType<gh.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jk<dfb> b;

   public gh(el $$0) {
      this.b = $$0.b(lq.f);
   }

   public static gh a(el $$0) {
      return new gh($$0);
   }

   public gh.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gh.b a(jk<dfb> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gh.b)gj.b($$0, $$1, true).map($$0x -> new gh.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gh.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dsi> a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dsi>)$$0.getArgument($$1, gh.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gj.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gh.b {
      private final dse a;
      private final Set<dth<?>> b;
      @Nullable
      private final us c;

      public a(dse $$0, Set<dth<?>> $$1, @Nullable us $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dsi $$0) {
         dse $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dth<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dpj $$3 = $$0.b();
               return $$3 != null && vh.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dsi> {
      boolean a();
   }

   static class c implements gh.b {
      private final jm<dfb> a;
      @Nullable
      private final us b;
      private final Map<String, String> c;

      c(jm<dfb> $$0, Map<String, String> $$1, @Nullable us $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dsi $$0) {
         dse $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dth<?> $$3 = $$1.b().l().a($$2.getKey());
               if ($$3 == null) {
                  return false;
               }

               Comparable<?> $$4 = (Comparable<?>)$$3.b($$2.getValue()).orElse(null);
               if ($$4 == null) {
                  return false;
               }

               if ($$1.c($$3) != $$4) {
                  return false;
               }
            }

            if (this.b == null) {
               return true;
            } else {
               dpj $$5 = $$0.b();
               return $$5 != null && vh.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
