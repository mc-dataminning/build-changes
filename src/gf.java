import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class gf {
   static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vs.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("arguments.item.tag.unknown", $$0));
   private static final char c = '#';
   private static final char d = '{';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> e = SuggestionsBuilder::buildFuture;
   final in.b<cpl> f;
   final boolean g;

   public gf(in.a $$0, boolean $$1) {
      this.f = $$0.b(ki.F);
      this.g = $$1;
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

      a(StringReader $$0, gf.c $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(gf.this.g ? this::d : this::b);
         if (gf.this.g && this.b.canRead() && this.b.peek() == '#') {
            this.c();
         } else {
            this.b();
         }

         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '{') {
            this.c.a(gf.e);
            this.d();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         ajc $$1 = ajc.a(this.b);
         this.c.a(gf.this.f.a(ajb.a(ki.F, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gf.a.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         this.b.expect('#');
         this.c.a(this::c);
         ajc $$1 = ajc.a(this.b);
         ip<cpl> $$2 = gf.this.f.a(aut.a(ki.F, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gf.b.createWithContext(this.b, $$1);
         });
         this.c.a($$2);
      }

      private void d() throws CommandSyntaxException {
         this.c.a(gf.e);
         this.c.a(new tw(this.b).f());
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('{'));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
         return dz.a(gf.this.f.c().map(ajb::a), $$0);
      }

      private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
         return dz.a(gf.this.f.e().map(aut::b), $$0, String.valueOf('#'));
      }

      private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
         this.c($$0);
         return this.b($$0);
      }
   }

   static class b implements gf.c {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gf.e;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface c {
      default void a(il<cpl> $$0) {
      }

      default void a(ip<cpl> $$0) {
      }

      default void a(sy $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
