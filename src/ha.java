import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class ha {
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xp.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xp.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xp.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xp.b("arguments.item.component.repeated", $$0));
   private static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> xp.b("arguments.item.malformed", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> k = SuggestionsBuilder::buildFuture;
   final jk.b<cum> l;
   final DynamicOps<vp> m;

   public ha(jk.a $$0) {
      this.l = $$0.b(lq.G);
      this.m = $$0.a(vg.a);
   }

   public ha.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<ji<cum>> $$1 = new MutableObject();
      final ki.a $$2 = ki.a();
      this.a($$0, new ha.d() {
         @Override
         public void a(ji<cum> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(kl<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }
      });
      ji<cum> $$3 = Objects.requireNonNull((ji<cum>)$$1.getValue(), "Parser gave no item");
      ki $$4 = $$2.a();
      a($$0, $$3, $$4);
      return new ha.a($$3, $$4);
   }

   private static void a(StringReader $$0, ji<cum> $$1, ki $$2) throws CommandSyntaxException {
      ki $$3 = ki.a($$1.a().p(), $$2);
      DataResult<bac> $$4 = cur.a($$3);
      $$4.getOrThrow($$1x -> j.createWithContext($$0, $$1x));
   }

   public void a(StringReader $$0, ha.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new ha.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      ha.c $$2 = new ha.c();
      ha.b $$3 = new ha.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(ji<cum> a, ki b) {
   }

   class b {
      private final StringReader b;
      private final ha.d c;

      b(final StringReader $$0, final ha.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(ha.k);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         alf $$1 = alf.a(this.b);
         this.c.a(ha.this.l.a(ale.a(lq.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return ha.e.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<kl<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            kl<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw ha.i.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(ha.k);
            this.b.skipWhitespace();
            this.a($$1);
            this.b.skipWhitespace();
            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::e);
            if (!this.b.canRead()) {
               throw ha.h.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(ha.k);
      }

      public static kl<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw ha.h.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            alf $$2 = alf.a($$0);
            kl<?> $$3 = lp.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw ha.f.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(kl<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         vp $$2 = new vq(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(ha.this.m, $$2);
         this.c.a($$0, (T)$$3.getOrThrow($$2x -> {
            this.b.setCursor($$1);
            return ha.g.createWithContext(this.b, $$0.toString(), $$2x);
         }));
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('['));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf(','));
            $$0.suggest(String.valueOf(']'));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('='));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
         return eu.a(ha.this.l.c().map(ale::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         eu.a(lp.as.g(), $$1, $$0x -> ((ale)$$0x.getKey()).a(), $$1x -> {
            kl<?> $$2 = (kl<?>)$$1x.getValue();
            if ($$2.b() != null) {
               alf $$3 = ((ale)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements ha.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = ha.k;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(ji<cum> $$0) {
      }

      default <T> void a(kl<T> $$0, T $$1) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
