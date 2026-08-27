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

public class fv implements ArgumentType<fv.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final iy<dde> b;

   public fv(dz $$0) {
      this.b = $$0.b(le.f);
   }

   public static fv a(dz $$0) {
      return new fv($$0);
   }

   public fv.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fv.b a(iy<dde> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fv.b)fx.b($$0, $$1, true).map($$0x -> new fv.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fv.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dql> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dql>)$$0.getArgument($$1, fv.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fx.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fv.b {
      private final dqh a;
      private final Set<drk<?>> b;
      @Nullable
      private final ua c;

      public a(dqh $$0, Set<drk<?>> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dql $$0) {
         dqh $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (drk<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dnm $$3 = $$0.b();
               return $$3 != null && up.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dql> {
      boolean a();
   }

   static class c implements fv.b {
      private final ja<dde> a;
      @Nullable
      private final ua b;
      private final Map<String, String> c;

      c(ja<dde> $$0, Map<String, String> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dql $$0) {
         dqh $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               drk<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dnm $$5 = $$0.b();
               return $$5 != null && up.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
