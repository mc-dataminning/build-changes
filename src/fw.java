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

public class fw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("argument.item.tag.disallowed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("argument.item.id.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tf.a("arguments.item.tag.unknown", $$0));
   private static final char d = '{';
   private static final char e = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> f = SuggestionsBuilder::buildFuture;
   private final hg<cit> g;
   private final StringReader h;
   private final boolean i;
   private Either<he<cit>, hi<cit>> j;
   @Nullable
   private qr k;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = f;

   private fw(hg<cit> $$0, StringReader $$1, boolean $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public static fw.a a(hg<cit> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fw $$3 = new fw($$0, $$1, false);
         $$3.d();
         he<cit> $$4 = (he<cit>)$$3.j.left().orElseThrow(() -> new IllegalStateException("Parser returned unexpected tag name"));
         return new fw.a($$4, $$3.k);
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$2);
         throw var5;
      }
   }

   public static Either<fw.a, fw.b> b(hg<cit> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fw $$3 = new fw($$0, $$1, true);
         $$3.d();
         return $$3.j.mapBoth($$1x -> new fw.a($$1x, $$3.k), $$1x -> new fw.b($$1x, $$3.k));
      } catch (CommandSyntaxException var4) {
         $$1.setCursor($$2);
         throw var4;
      }
   }

   public static CompletableFuture<Suggestions> a(hg<cit> $$0, SuggestionsBuilder $$1, boolean $$2) {
      StringReader $$3 = new StringReader($$1.getInput());
      $$3.setCursor($$1.getStart());
      fw $$4 = new fw($$0, $$3, $$2);

      try {
         $$4.d();
      } catch (CommandSyntaxException var6) {
      }

      return $$4.l.apply($$1.createOffset($$3.getCursor()));
   }

   private void a() throws CommandSyntaxException {
      int $$0 = this.h.getCursor();
      aer $$1 = aer.a(this.h);
      Optional<? extends he<cit>> $$2 = this.g.a(aeq.a(jc.D, $$1));
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
         aer $$1 = aer.a(this.h);
         Optional<? extends hi<cit>> $$2 = this.g.a(aqa.a(jc.D, $$1));
         this.j = Either.right($$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return c.createWithContext(this.h, $$1);
         }));
      }
   }

   private void c() throws CommandSyntaxException {
      this.k = new rl(this.h).f();
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
      return du.a(this.g.e().map(aqa::b), $$0, String.valueOf('#'));
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
      return du.a(this.g.c().map(aeq::a), $$0);
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
      this.b($$0);
      return this.c($$0);
   }

   public static record a(he<cit> a, @Nullable qr b) {
   }

   public static record b(hi<cit> a, @Nullable qr b) {
   }
}
