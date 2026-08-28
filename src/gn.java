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

public class gn implements ArgumentType<gn.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jr<dhy> b;

   public gn(er $$0) {
      this.b = $$0.d(ly.f);
   }

   public static gn a(er $$0) {
      return new gn($$0);
   }

   public gn.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gn.b a(jr<dhy> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gn.b)gp.b($$0, $$1, true).map($$0x -> new gn.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gn.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dvh> a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dvh>)$$0.getArgument($$1, gn.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gp.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gn.b {
      private final dvd a;
      private final Set<dwg<?>> b;
      @Nullable
      private final uj c;

      public a(dvd $$0, Set<dwg<?>> $$1, @Nullable uj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dvh $$0) {
         dvd $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dwg<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dsg $$3 = $$0.b();
               return $$3 != null && uy.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dvh> {
      boolean a();
   }

   static class c implements gn.b {
      private final jt<dhy> a;
      @Nullable
      private final uj b;
      private final Map<String, String> c;

      c(jt<dhy> $$0, Map<String, String> $$1, @Nullable uj $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dvh $$0) {
         dvd $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dwg<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dsg $$5 = $$0.b();
               return $$5 != null && uy.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
