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

public class gi implements ArgumentType<gi.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jl<dff> b;

   public gi(em $$0) {
      this.b = $$0.b(lr.f);
   }

   public static gi a(em $$0) {
      return new gi($$0);
   }

   public gi.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gi.b a(jl<dff> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gi.b)gk.b($$0, $$1, true).map($$0x -> new gi.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gi.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dsl> a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dsl>)$$0.getArgument($$1, gi.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gk.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gi.b {
      private final dsh a;
      private final Set<dtk<?>> b;
      @Nullable
      private final tx c;

      public a(dsh $$0, Set<dtk<?>> $$1, @Nullable tx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dsl $$0) {
         dsh $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dtk<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dpn $$3 = $$0.b();
               return $$3 != null && um.a(this.c, $$3.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dsl> {
      boolean a();
   }

   static class c implements gi.b {
      private final jn<dff> a;
      @Nullable
      private final tx b;
      private final Map<String, String> c;

      c(jn<dff> $$0, Map<String, String> $$1, @Nullable tx $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dsl $$0) {
         dsh $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dtk<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dpn $$5 = $$0.b();
               return $$5 != null && um.a(this.b, $$5.b($$0.c().H_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
