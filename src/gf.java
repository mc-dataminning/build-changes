import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class gf {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wg.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> wg.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wg.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType i = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wg.c("arguments.item.component.expected"));
   private static final char k = '#';
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '{';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
   final in.b<cre> m;
   final DynamicOps<uj> n;
   final boolean o;

   public gf(in.a $$0, boolean $$1) {
      this.m = $$0.b(ks.F);
      this.n = $$0.a(ua.a);
      this.o = $$1;
   }

   public void a(StringReader $$0, gf.c $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gf.a($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gf.b $$2 = new gf.b();
      gf.a $$3 = new gf.a($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   class a {
      private final StringReader b;
      private final gf.c c;
      private boolean d;

      a(StringReader $$0, gf.c $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(gf.this.o ? this::f : this::d);
         if (gf.this.o && this.b.canRead() && this.b.peek() == '#') {
            this.c();
         } else {
            this.b();
         }

         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.d();
            this.d = true;
         }

         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '{') {
            this.e();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         ajt $$1 = ajt.a(this.b);
         this.c.a(gf.this.m.a(ajs.a(ks.F, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gf.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         this.b.expect('#');
         this.c.a(this::e);
         ajt $$1 = ajt.a(this.b);
         ip<cre> $$2 = gf.this.m.a(avr.a(ks.F, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gf.g.createWithContext(this.b, $$1);
         });
         this.c.a($$2);
      }

      private void d() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::g);

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            jo<?> $$0 = a(this.b);
            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(gf.l);
            this.b.skipWhitespace();
            this.a($$0);
            this.b.skipWhitespace();
            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::g);
            if (!this.b.canRead()) {
               throw gf.j.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gf.l);
      }

      public static jo<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gf.j.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            ajt $$2 = ajt.a($$0);
            jo<?> $$3 = kr.at.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gf.h.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(jo<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         uj $$2 = new uk(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(gf.this.n, $$2);
         this.c.a($$0, ac.a($$3, $$2x -> {
            this.b.setCursor($$1);
            return gf.i.createWithContext(this.b, $$0.toString(), $$2x);
         }));
      }

      private void e() throws CommandSyntaxException {
         this.c.a(gf.l);
         this.c.a(new uk(this.b).f());
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            if (!this.d) {
               $$0.suggest(String.valueOf('['));
            }

            $$0.suggest(String.valueOf('{'));
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
         return dz.a(gf.this.m.c().map(ajs::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         return dz.a(gf.this.m.e().map(avr::b), $$0, String.valueOf('#'));
      }

      private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
         this.e($$0);
         return this.d($$0);
      }

      private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         dz.a(kr.at.g(), $$1, $$0x -> ((ajs)$$0x.getKey()).a(), $$1x -> {
            jo<?> $$2 = (jo<?>)$$1x.getValue();
            if ($$2.b() != null) {
               ajt $$3 = ((ajs)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class b implements gf.c {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gf.l;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface c {
      default void a(il<cre> $$0) {
      }

      default void a(ip<cre> $$0) {
      }

      default <T> void a(jo<T> $$0, T $$1) {
      }

      default void a(tm $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
