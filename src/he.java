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

public class he {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xd.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xd.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.component.repeated", $$0));
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.malformed", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '!';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
   final jp.b<cvk> m;
   final DynamicOps<vc> n;

   public he(jp.a $$0) {
      this.m = $$0.b(lv.K);
      this.n = $$0.a(ut.a);
   }

   public he.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<jn<cvk>> $$1 = new MutableObject();
      final ko.a $$2 = ko.a();
      this.a($$0, new he.d() {
         @Override
         public void a(jn<cvk> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(kq<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public <T> void a(kq<T> $$0) {
            $$2.a($$0);
         }
      });
      jn<cvk> $$3 = Objects.requireNonNull((jn<cvk>)$$1.getValue(), "Parser gave no item");
      ko $$4 = $$2.a();
      a($$0, $$3, $$4);
      return new he.a($$3, $$4);
   }

   private static void a(StringReader $$0, jn<cvk> $$1, ko $$2) throws CommandSyntaxException {
      kn $$3 = ks.a($$1.a().o(), $$2);
      DataResult<bai> $$4 = cvp.a($$3);
      $$4.getOrThrow($$1x -> k.createWithContext($$0, $$1x));
   }

   public void a(StringReader $$0, he.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new he.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      he.c $$2 = new he.c();
      he.b $$3 = new he.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(jn<cvk> a, ko b) {
   }

   class b {
      private final StringReader b;
      private final he.d c;

      b(final StringReader $$0, final he.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(he.l);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         alc $$1 = alc.a(this.b);
         this.c.a(he.this.m.a(alb.a(lv.K, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return he.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<kq<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            if (this.b.canRead() && this.b.peek() == '!') {
               this.b.skip();
               this.c.a(this::f);
               kq<?> $$1 = a(this.b);
               if (!$$0.add($$1)) {
                  throw he.j.create($$1);
               }

               this.c.a($$1);
               this.c.a(he.l);
               this.b.skipWhitespace();
            } else {
               kq<?> $$2 = a(this.b);
               if (!$$0.add($$2)) {
                  throw he.j.create($$2);
               }

               this.c.a(this::c);
               this.b.skipWhitespace();
               this.b.expect('=');
               this.c.a(he.l);
               this.b.skipWhitespace();
               this.a($$2);
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
               throw he.i.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(he.l);
      }

      public static kq<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw he.i.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            alc $$2 = alc.a($$0);
            kq<?> $$3 = lu.ap.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw he.g.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(kq<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         vc $$2 = new vd(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(he.this.n, $$2);
         this.c.a($$0, (T)$$3.getOrThrow($$2x -> {
            this.b.setCursor($$1);
            return he.h.createWithContext(this.b, $$0.toString(), $$2x);
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
         return ey.a(he.this.m.c().map(alb::a), $$0);
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
         ey.a(lu.ap.h(), $$2, $$0x -> ((alb)$$0x.getKey()).a(), $$2x -> {
            kq<?> $$3 = (kq<?>)$$2x.getValue();
            if ($$3.b() != null) {
               alc $$4 = ((alb)$$2x.getKey()).a();
               $$0.suggest($$4 + $$1);
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements he.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = he.l;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(jn<cvk> $$0) {
      }

      default <T> void a(kq<T> $$0, T $$1) {
      }

      default <T> void a(kq<T> $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
