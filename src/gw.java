import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class gw {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xg.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> xg.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xg.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> xg.b("arguments.item.component.repeated", $$0));
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> xg.b("arguments.item.malformed", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '!';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
   final ji.b<dag> m;
   final alp<va> n;
   final vb<va> o;

   public gw(ji.a $$0) {
      this.m = $$0.e(mi.K);
      this.n = $$0.a(uo.a);
      this.o = vb.a(this.n);
   }

   public gw.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<jg<dag>> $$1 = new MutableObject();
      final kj.a $$2 = kj.a();
      this.a($$0, new gw.d() {
         @Override
         public void a(jg<dag> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(kk<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public <T> void a(kk<T> $$0) {
            $$2.a($$0);
         }
      });
      jg<dag> $$3 = Objects.requireNonNull((jg<dag>)$$1.getValue(), "Parser gave no item");
      kj $$4 = $$2.a();
      a($$0, $$3, $$4);
      return new gw.a($$3, $$4);
   }

   private static void a(StringReader $$0, jg<dag> $$1, kj $$2) throws CommandSyntaxException {
      ki $$3 = km.a($$1.a().f(), $$2);
      DataResult<bbh> $$4 = dak.a($$3);
      $$4.getOrThrow($$1x -> k.createWithContext($$0, $$1x));
   }

   public void a(StringReader $$0, gw.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gw.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gw.c $$2 = new gw.c();
      gw.b $$3 = new gw.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(jg<dag> a, kj b) {
   }

   class b {
      private final StringReader b;
      private final gw.d c;

      b(final StringReader $$0, final gw.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(gw.l);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         alr $$1 = alr.a(this.b);
         this.c.a(gw.this.m.a(alq.a(mi.K, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gw.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<kk<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            if (this.b.canRead() && this.b.peek() == '!') {
               this.b.skip();
               this.c.a(this::f);
               kk<?> $$1 = a(this.b);
               if (!$$0.add($$1)) {
                  throw gw.j.create($$1);
               }

               this.c.a($$1);
               this.c.a(gw.l);
               this.b.skipWhitespace();
            } else {
               kk<?> $$2 = a(this.b);
               if (!$$0.add($$2)) {
                  throw gw.j.create($$2);
               }

               this.c.a(this::c);
               this.b.skipWhitespace();
               this.b.expect('=');
               this.c.a(gw.l);
               this.b.skipWhitespace();
               this.a(gw.this.o, gw.this.n, $$2);
               this.b.skipWhitespace();
            }

            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::e);
            if (!this.b.canRead()) {
               throw gw.i.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gw.l);
      }

      public static kk<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gw.i.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            alr $$2 = alr.a($$0);
            kk<?> $$3 = mh.am.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gw.g.createWithContext($$0, $$2);
            }
         }
      }

      private <T, O> void a(vb<O> $$0, alp<O> $$1, kk<T> $$2) throws CommandSyntaxException {
         int $$3 = this.b.getCursor();
         O $$4 = $$0.b(this.b);
         DataResult<T> $$5 = $$2.c().parse($$1, $$4);
         this.c.a($$2, (T)$$5.getOrThrow($$2x -> {
            this.b.setCursor($$3);
            return gw.h.createWithContext(this.b, $$2.toString(), $$2x);
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
         return ep.a(gw.this.m.c_().map(alq::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         $$0.suggest(String.valueOf('!'));
         return this.a($$0, String.valueOf('='));
      }

      private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
         return this.a($$0, "");
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, String $$1) {
         String $$2 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         ep.a(mh.am.k(), $$2, $$0x -> ((alq)$$0x.getKey()).a(), $$2x -> {
            kk<?> $$3 = (kk<?>)$$2x.getValue();
            if ($$3.b() != null) {
               alr $$4 = ((alq)$$2x.getKey()).a();
               $$0.suggest($$4 + $$1);
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements gw.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gw.l;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(jg<dag> $$0) {
      }

      default <T> void a(kk<T> $$0, T $$1) {
      }

      default <T> void a(kk<T> $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
