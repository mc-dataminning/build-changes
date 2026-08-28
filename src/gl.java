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

public class gl implements ArgumentType<gl.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jo<dfw> b;

   public gl(ep $$0) {
      this.b = $$0.b(lu.f);
   }

   public static gl a(ep $$0) {
      return new gl($$0);
   }

   public gl.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gl.b a(jo<dfw> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gl.b)gn.b($$0, $$1, true).map($$0x -> new gl.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gl.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dte> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dte>)$$0.getArgument($$1, gl.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gn.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gl.b {
      private final dta a;
      private final Set<dud<?>> b;
      @Nullable
      private final ua c;

      public a(dta $$0, Set<dud<?>> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dte $$0) {
         dta $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dud<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dqf $$3 = $$0.b();
               return $$3 != null && up.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dte> {
      boolean a();
   }

   static class c implements gl.b {
      private final jq<dfw> a;
      @Nullable
      private final ua b;
      private final Map<String, String> c;

      c(jq<dfw> $$0, Map<String, String> $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dte $$0) {
         dta $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dud<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dqf $$5 = $$0.b();
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
