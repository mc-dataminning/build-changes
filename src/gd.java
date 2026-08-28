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

public class gd implements ArgumentType<gd.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final ji<dno> b;

   public gd(eg $$0) {
      this.b = $$0.e(mi.i);
   }

   public static gd a(eg $$0) {
      return new gd($$0);
   }

   public gd.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gd.b a(ji<dno> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gd.b)gf.b($$0, $$1, true).map($$0x -> new gd.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gd.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<ebu> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<ebu>)$$0.getArgument($$1, gd.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gf.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gd.b {
      private final ebq a;
      private final Set<ect<?>> b;
      @Nullable
      private final ua c;

      public a(ebq $$0, Set<ect<?>> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(ebu $$0) {
         ebq $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (ect<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dyo $$3 = $$0.b();
               return $$3 != null && up.a(this.c, $$3.b($$0.c().J_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<ebu> {
      boolean a();
   }

   static class c implements gd.b {
      private final jk<dno> a;
      @Nullable
      private final ua b;
      private final Map<String, String> c;

      c(jk<dno> $$0, Map<String, String> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(ebu $$0) {
         ebq $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               ect<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dyo $$5 = $$0.b();
               return $$5 != null && up.a(this.b, $$5.b($$0.c().J_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
