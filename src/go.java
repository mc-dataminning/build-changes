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

public class go implements ArgumentType<go.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final js<dkd> b;

   public go(es $$0) {
      this.b = $$0.d(mb.f);
   }

   public static go a(es $$0) {
      return new go($$0);
   }

   public go.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static go.b a(js<dkd> $$0, StringReader $$1) throws CommandSyntaxException {
      return (go.b)gq.b($$0, $$1, true).map($$0x -> new go.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new go.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<dxs> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<dxs>)$$0.getArgument($$1, go.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gq.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements go.b {
      private final dxo a;
      private final Set<dyq<?>> b;
      @Nullable
      private final um c;

      public a(dxo $$0, Set<dyq<?>> $$1, @Nullable um $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(dxs $$0) {
         dxo $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (dyq<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               duq $$3 = $$0.b();
               return $$3 != null && vb.a(this.c, $$3.b($$0.c().K_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<dxs> {
      boolean a();
   }

   static class c implements go.b {
      private final ju<dkd> a;
      @Nullable
      private final um b;
      private final Map<String, String> c;

      c(ju<dkd> $$0, Map<String, String> $$1, @Nullable um $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(dxs $$0) {
         dxo $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               dyq<?> $$3 = $$1.b().l().a($$2.getKey());
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
               duq $$5 = $$0.b();
               return $$5 != null && vb.a(this.b, $$5.b($$0.c().K_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
