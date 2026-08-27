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

public class gh {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wi.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> wi.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType h = new DynamicCommandExceptionType($$0 -> wi.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType i = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wi.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> wi.b("arguments.item.component.repeated", $$0));
   private static final char l = '#';
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '{';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> m = SuggestionsBuilder::buildFuture;
   final ip.b<crn> n;
   final DynamicOps<ul> o;
   final boolean p;

   public gh(ip.a $$0, boolean $$1) {
      this.n = $$0.b(ku.G);
      this.o = $$0.a(uc.a);
      this.p = $$1;
   }

   public void a(StringReader $$0, gh.c $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gh.a($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gh.b $$2 = new gh.b();
      gh.a $$3 = new gh.a($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   class a {
      private final StringReader b;
      private final gh.c c;
      private boolean d;

      a(StringReader $$0, gh.c $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(gh.this.p ? this::f : this::d);
         if (gh.this.p && this.b.canRead() && this.b.peek() == '#') {
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
         ajv $$1 = ajv.a(this.b);
         this.c.a(gh.this.n.a(aju.a(ku.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gh.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         this.b.expect('#');
         this.c.a(this::e);
         ajv $$1 = ajv.a(this.b);
         ir<crn> $$2 = gh.this.n.a(avt.a(ku.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gh.g.createWithContext(this.b, $$1);
         });
         this.c.a($$2);
      }

      private void d() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::g);
         Set<jq<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            jq<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw gh.k.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(gh.m);
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
               throw gh.j.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gh.m);
      }

      public static jq<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gh.j.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            ajv $$2 = ajv.a($$0);
            jq<?> $$3 = kt.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gh.h.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(jq<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         ul $$2 = new um(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(gh.this.o, $$2);
         this.c.a($$0, ac.a($$3, $$2x -> {
            this.b.setCursor($$1);
            return gh.i.createWithContext(this.b, $$0.toString(), $$2x);
         }));
      }

      private void e() throws CommandSyntaxException {
         this.c.a(gh.m);
         this.c.a(new um(this.b).f());
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
         return ea.a(gh.this.n.c().map(aju::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         return ea.a(gh.this.n.e().map(avt::b), $$0, String.valueOf('#'));
      }

      private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
         this.e($$0);
         return this.d($$0);
      }

      private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         ea.a(kt.as.g(), $$1, $$0x -> ((aju)$$0x.getKey()).a(), $$1x -> {
            jq<?> $$2 = (jq<?>)$$1x.getValue();
            if ($$2.b() != null) {
               ajv $$3 = ((aju)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class b implements gh.c {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gh.m;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface c {
      default void a(in<crn> $$0) {
      }

      default void a(ir<crn> $$0) {
      }

      default <T> void a(jq<T> $$0, T $$1) {
      }

      default void a(to $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
