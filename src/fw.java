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

public class fw implements ArgumentType<fw.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final iz<ddy> b;

   public fw(ea $$0) {
      this.b = $$0.b(lf.f);
   }

   public static fw a(ea $$0) {
      return new fw($$0);
   }

   public fw.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fw.b a(iz<ddy> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fw.b)fy.b($$0, $$1, true).map($$0x -> new fw.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fw.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<drf> a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<drf>)$$0.getArgument($$1, fw.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fy.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fw.b {
      private final drb a;
      private final Set<dse<?>> b;
      @Nullable
      private final ud c;

      public a(drb $$0, Set<dse<?>> $$1, @Nullable ud $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(drf $$0) {
         drb $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dse<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dog $$3 = $$0.b();
               return $$3 != null && us.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<drf> {
      boolean a();
   }

   static class c implements fw.b {
      private final jb<ddy> a;
      @Nullable
      private final ud b;
      private final Map<String, String> c;

      c(jb<ddy> $$0, Map<String, String> $$1, @Nullable ud $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(drf $$0) {
         drb $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dse<?> $$3 = $$1.b().m().a($$2.getKey());
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
               dog $$5 = $$0.b();
               return $$5 != null && us.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
