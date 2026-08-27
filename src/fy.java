import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("argument.item.tag.disallowed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("argument.item.id.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("arguments.item.tag.unknown", $$0));
   private static final char d = '{';
   private static final char e = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> f = SuggestionsBuilder::buildFuture;
   private final ih<cmc> g;
   private final StringReader h;
   private final boolean i;
   private Either<ie<cmc>, ij<cmc>> j;
   @Nullable
   private sj k;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = f;

   private fy(ih<cmc> $$0, StringReader $$1, boolean $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public static fy.a a(ih<cmc> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fy $$3 = new fy($$0, $$1, false);
         $$3.d();
         ie<cmc> $$4 = (ie<cmc>)$$3.j.left().orElseThrow(() -> new IllegalStateException("Parser returned unexpected tag name"));
         return new fy.a($$4, $$3.k);
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$2);
         throw var5;
      }
   }

   public static Either<fy.a, fy.b> b(ih<cmc> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fy $$3 = new fy($$0, $$1, true);
         $$3.d();
         return $$3.j.mapBoth($$1x -> new fy.a($$1x, $$3.k), $$1x -> new fy.b($$1x, $$3.k));
      } catch (CommandSyntaxException var4) {
         $$1.setCursor($$2);
         throw var4;
      }
   }

   public static CompletableFuture<Suggestions> a(ih<cmc> $$0, SuggestionsBuilder $$1, boolean $$2) {
      StringReader $$3 = new StringReader($$1.getInput());
      $$3.setCursor($$1.getStart());
      fy $$4 = new fy($$0, $$3, $$2);

      try {
         $$4.d();
      } catch (CommandSyntaxException var6) {
      }

      return $$4.l.apply($$1.createOffset($$3.getCursor()));
   }

   private void a() throws CommandSyntaxException {
      int $$0 = this.h.getCursor();
      agt $$1 = agt.a(this.h);
      Optional<? extends ie<cmc>> $$2 = this.g.a(ags.a(kc.F, $$1));
      this.j = Either.left($$2.orElseThrow(() -> {
         this.h.setCursor($$0);
         return b.createWithContext(this.h, $$1);
      }));
   }

   private void b() throws CommandSyntaxException {
      if (!this.i) {
         throw a.createWithContext(this.h);
      } else {
         int $$0 = this.h.getCursor();
         this.h.expect('#');
         this.l = this::b;
         agt $$1 = agt.a(this.h);
         Optional<? extends ij<cmc>> $$2 = this.g.a(asg.a(kc.F, $$1));
         this.j = Either.right($$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return c.createWithContext(this.h, $$1);
         }));
      }
   }

   private void c() throws CommandSyntaxException {
      this.k = new th(this.h).f();
   }

   private void d() throws CommandSyntaxException {
      if (this.i) {
         this.l = this::d;
      } else {
         this.l = this::c;
      }

      if (this.h.canRead() && this.h.peek() == '#') {
         this.b();
      } else {
         this.a();
      }

      this.l = this::a;
      if (this.h.canRead() && this.h.peek() == '{') {
         this.l = f;
         this.c();
      }
   }

   private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf('{'));
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
      return dw.a(this.g.e().map(asg::b), $$0, String.valueOf('#'));
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
      return dw.a(this.g.c().map(ags::a), $$0);
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
      this.b($$0);
      return this.c($$0);
   }

   public static record a(ie<cmc> a, @Nullable sj b) {
   }

   public static record b(ij<cmc> a, @Nullable sj b) {
   }
}
