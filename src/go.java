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
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class go {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> ws.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> ws.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> ws.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType i = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(ws.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> ws.b("arguments.item.component.repeated", $$0));
   private static final char l = '#';
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '{';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> m = SuggestionsBuilder::buildFuture;
   final ix.b<cry> n;
   final DynamicOps<uv> o;
   final boolean p;

   public go(ix.a $$0, boolean $$1) {
      this.n = $$0.b(ld.G);
      this.o = $$0.a(um.a);
      this.p = $$1;
   }

   public void a(StringReader $$0, go.c $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new go.a($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      go.b $$2 = new go.b();
      go.a $$3 = new go.a($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   class a {
      private final StringReader b;
      private final go.c c;
      private boolean d;

      a(StringReader $$0, go.c $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(go.this.p ? this::f : this::d);
         if (go.this.p && this.b.canRead() && this.b.peek() == '#') {
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
         akf $$1 = akf.a(this.b);
         this.c.a(go.this.n.a(ake.a(ld.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return go.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         this.b.expect('#');
         this.c.a(this::e);
         akf $$1 = akf.a(this.b);
         iz<cry> $$2 = go.this.n.a(awd.a(ld.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return go.g.createWithContext(this.b, $$1);
         });
         this.c.a($$2);
      }

      private void d() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::g);
         Set<jy<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            jy<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw go.k.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(go.m);
            this.b.skipWhitespace();
            this.a($$1);
            this.b.skipWhitespace();
            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::g);
            if (!this.b.canRead()) {
               throw go.j.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(go.m);
      }

      public static jy<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw go.j.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            akf $$2 = akf.a($$0);
            jy<?> $$3 = lc.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw go.h.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(jy<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         uv $$2 = new uw(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(go.this.o, $$2);
         this.c.a($$0, ac.a($$3, $$2x -> {
            this.b.setCursor($$1);
            return go.i.createWithContext(this.b, $$0.toString(), $$2x);
         }));
      }

      private void e() throws CommandSyntaxException {
         this.c.a(go.m);
         this.c.a(new uw(this.b).f());
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
         return eh.a(go.this.n.c().map(ake::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         return eh.a(go.this.n.e().map(awd::b), $$0, String.valueOf('#'));
      }

      private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
         this.e($$0);
         return this.d($$0);
      }

      private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         eh.a(lc.as.g(), $$1, $$0x -> ((ake)$$0x.getKey()).a(), $$1x -> {
            jy<?> $$2 = (jy<?>)$$1x.getValue();
            if ($$2.b() != null) {
               akf $$3 = ((ake)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class b implements go.c {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = go.m;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface c {
      default void a(iv<cry> $$0) {
      }

      default void a(iz<cry> $$0) {
      }

      default <T> void a(jy<T> $$0, T $$1) {
      }

      default void a(ty $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
