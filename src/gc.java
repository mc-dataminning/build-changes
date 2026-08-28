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

public class gc implements ArgumentType<gc.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jh<dmm> b;

   public gc(ef $$0) {
      this.b = $$0.e(mh.i);
   }

   public static gc a(ef $$0) {
      return new gc($$0);
   }

   public gc.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gc.b a(jh<dmm> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gc.b)ge.b($$0, $$1, true).map($$0x -> new gc.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gc.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<eas> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<eas>)$$0.getArgument($$1, gc.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ge.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gc.b {
      private final eao a;
      private final Set<ebr<?>> b;
      @Nullable
      private final tz c;

      public a(eao $$0, Set<ebr<?>> $$1, @Nullable tz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(eas $$0) {
         eao $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (ebr<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dxm $$3 = $$0.b();
               return $$3 != null && uo.a(this.c, $$3.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<eas> {
      boolean a();
   }

   static class c implements gc.b {
      private final jj<dmm> a;
      @Nullable
      private final tz b;
      private final Map<String, String> c;

      c(jj<dmm> $$0, Map<String, String> $$1, @Nullable tz $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(eas $$0) {
         eao $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               ebr<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dxm $$5 = $$0.b();
               return $$5 != null && uo.a(this.b, $$5.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
