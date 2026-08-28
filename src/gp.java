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

public class gp implements ArgumentType<gp.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jt<dke> b;

   public gp(et $$0) {
      this.b = $$0.d(mc.f);
   }

   public static gp a(et $$0) {
      return new gp($$0);
   }

   public gp.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gp.b a(jt<dke> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gp.b)gr.b($$0, $$1, true).map($$0x -> new gp.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gp.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dxu> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dxu>)$$0.getArgument($$1, gp.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gr.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gp.b {
      private final dxq a;
      private final Set<dyt<?>> b;
      @Nullable
      private final tq c;

      public a(dxq $$0, Set<dyt<?>> $$1, @Nullable tq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dxu $$0) {
         dxq $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dyt<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               dus $$3 = $$0.b();
               return $$3 != null && uf.a(this.c, $$3.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dxu> {
      boolean a();
   }

   static class c implements gp.b {
      private final jv<dke> a;
      @Nullable
      private final tq b;
      private final Map<String, String> c;

      c(jv<dke> $$0, Map<String, String> $$1, @Nullable tq $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dxu $$0) {
         dxq $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dyt<?> $$3 = $$1.b().l().a($$2.getKey());
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
               dus $$5 = $$0.b();
               return $$5 != null && uf.a(this.b, $$5.b($$0.c().F_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
