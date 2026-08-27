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

public class fz implements ArgumentType<fz.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jc<dfc> b;

   public fz(ed $$0) {
      this.b = $$0.b(li.f);
   }

   public static fz a(ed $$0) {
      return new fz($$0);
   }

   public fz.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fz.b a(jc<dfc> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fz.b)gb.b($$0, $$1, true).map($$0x -> new fz.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fz.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dtg> a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dtg>)$$0.getArgument($$1, fz.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gb.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fz.b {
      private final dtc a;
      private final Set<duf<?>> b;
      @Nullable
      private final uk c;

      public a(dtc $$0, Set<duf<?>> $$1, @Nullable uk $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dtg $$0) {
         dtc $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (duf<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dqc $$3 = $$0.b();
               return $$3 != null && uz.a(this.c, $$3.b($$0.c().I_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dtg> {
      boolean a();
   }

   static class c implements fz.b {
      private final je<dfc> a;
      @Nullable
      private final uk b;
      private final Map<String, String> c;

      c(je<dfc> $$0, Map<String, String> $$1, @Nullable uk $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dtg $$0) {
         dtc $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               duf<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dqc $$5 = $$0.b();
               return $$5 != null && uz.a(this.b, $$5.b($$0.c().I_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
