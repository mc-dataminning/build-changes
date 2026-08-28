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

public class gq implements ArgumentType<gq.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ju<dku> b;

   public gq(et $$0) {
      this.b = $$0.e(me.f);
   }

   public static gq a(et $$0) {
      return new gq($$0);
   }

   public gq.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gq.b a(ju<dku> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gq.b)gs.b($$0, $$1, true).map($$0x -> new gq.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gq.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dyq> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dyq>)$$0.getArgument($$1, gq.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gs.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gq.b {
      private final dym a;
      private final Set<dzp<?>> b;
      @Nullable
      private final tw c;

      public a(dym $$0, Set<dzp<?>> $$1, @Nullable tw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dyq $$0) {
         dym $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dzp<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dvl $$3 = $$0.b();
               return $$3 != null && ul.a(this.c, $$3.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dyq> {
      boolean a();
   }

   static class c implements gq.b {
      private final jw<dku> a;
      @Nullable
      private final tw b;
      private final Map<String, String> c;

      c(jw<dku> $$0, Map<String, String> $$1, @Nullable tw $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dyq $$0) {
         dym $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dzp<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dvl $$5 = $$0.b();
               return $$5 != null && ul.a(this.b, $$5.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
