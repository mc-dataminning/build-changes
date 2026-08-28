import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class gv {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wy.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wy.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.component.repeated", $$0));
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.malformed", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '!';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
   final jh.b<czj> m;
   final ale<Object> n;

   public gv(jh.a $$0) {
      this.m = $$0.e(mh.K);
      this.n = $$0.a(JavaOps.INSTANCE);
   }

   public gv.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<jf<czj>> $$1 = new MutableObject();
      final ki.a $$2 = ki.a();
      this.a($$0, new gv.d() {
         @Override
         public void a(jf<czj> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(kj<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public <T> void a(kj<T> $$0) {
            $$2.a($$0);
         }
      });
      jf<czj> $$3 = Objects.requireNonNull((jf<czj>)$$1.getValue(), "Parser gave no item");
      ki $$4 = $$2.a();
      a($$0, $$3, $$4);
      return new gv.a($$3, $$4);
   }

   private static void a(StringReader $$0, jf<czj> $$1, ki $$2) throws CommandSyntaxException {
      kh $$3 = kl.a($$1.a().f(), $$2);
      DataResult<bau> $$4 = czn.a($$3);
      $$4.getOrThrow($$1x -> k.createWithContext($$0, $$1x));
   }

   public void a(StringReader $$0, gv.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gv.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gv.c $$2 = new gv.c();
      gv.b $$3 = new gv.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(jf<czj> a, ki b) {
   }

   class b {
      private final StringReader b;
      private final gv.d c;

      b(final StringReader $$0, final gv.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(gv.l);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         alg $$1 = alg.a(this.b);
         this.c.a(gv.this.m.a(alf.a(mh.K, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gv.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<kj<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            if (this.b.canRead() && this.b.peek() == '!') {
               this.b.skip();
               this.c.a(this::f);
               kj<?> $$1 = a(this.b);
               if (!$$0.add($$1)) {
                  throw gv.j.create($$1);
               }

               this.c.a($$1);
               this.c.a(gv.l);
               this.b.skipWhitespace();
            } else {
               kj<?> $$2 = a(this.b);
               if (!$$0.add($$2)) {
                  throw gv.j.create($$2);
               }

               this.c.a(this::c);
               this.b.skipWhitespace();
               this.b.expect('=');
               this.c.a(gv.l);
               this.b.skipWhitespace();
               this.a(gv.this.n, $$2);
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
               throw gv.i.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gv.l);
      }

      public static kj<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gv.i.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            alg $$2 = alg.a($$0);
            kj<?> $$3 = mg.am.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gv.g.createWithContext($$0, $$2);
            }
         }
      }

      private <T, O> void a(ale<O> $$0, kj<T> $$1) throws CommandSyntaxException {
         int $$2 = this.b.getCursor();
         O $$3 = ux.b($$0, this.b);
         DataResult<T> $$4 = $$1.c().parse($$0, $$3);
         this.c.a($$1, (T)$$4.getOrThrow($$2x -> {
            this.b.setCursor($$2);
            return gv.h.createWithContext(this.b, $$1.toString(), $$2x);
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
         return eo.a(gv.this.m.c_().map(alf::a), $$0);
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
         eo.a(mg.am.k(), $$2, $$0x -> ((alf)$$0x.getKey()).a(), $$2x -> {
            kj<?> $$3 = (kj<?>)$$2x.getValue();
            if ($$3.b() != null) {
               alg $$4 = ((alf)$$2x.getKey()).a();
               $$0.suggest($$4 + $$1);
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements gv.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gv.l;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(jf<czj> $$0) {
      }

      default <T> void a(kj<T> $$0, T $$1) {
      }

      default <T> void a(kj<T> $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
