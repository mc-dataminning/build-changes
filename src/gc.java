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

public class gc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("argument.item.tag.disallowed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("argument.item.id.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("arguments.item.tag.unknown", $$0));
   private static final char d = '{';
   private static final char e = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> f = SuggestionsBuilder::buildFuture;
   private final il<cou> g;
   private final StringReader h;
   private final boolean i;
   private Either<ij<cou>, in<cou>> j;
   @Nullable
   private sw k;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = f;

   private gc(il<cou> $$0, StringReader $$1, boolean $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public static gc.a a(il<cou> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         gc $$3 = new gc($$0, $$1, false);
         $$3.d();
         ij<cou> $$4 = (ij<cou>)$$3.j.left().orElseThrow(() -> new IllegalStateException("Parser returned unexpected tag name"));
         return new gc.a($$4, $$3.k);
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$2);
         throw var5;
      }
   }

   public static Either<gc.a, gc.b> b(il<cou> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         gc $$3 = new gc($$0, $$1, true);
         $$3.d();
         return $$3.j.mapBoth($$1x -> new gc.a($$1x, $$3.k), $$1x -> new gc.b($$1x, $$3.k));
      } catch (CommandSyntaxException var4) {
         $$1.setCursor($$2);
         throw var4;
      }
   }

   public static CompletableFuture<Suggestions> a(il<cou> $$0, SuggestionsBuilder $$1, boolean $$2) {
      StringReader $$3 = new StringReader($$1.getInput());
      $$3.setCursor($$1.getStart());
      gc $$4 = new gc($$0, $$3, $$2);

      try {
         $$4.d();
      } catch (CommandSyntaxException var6) {
      }

      return $$4.l.apply($$1.createOffset($$3.getCursor()));
   }

   private void a() throws CommandSyntaxException {
      int $$0 = this.h.getCursor();
      aiy $$1 = aiy.a(this.h);
      Optional<? extends ij<cou>> $$2 = this.g.a(aix.a(kg.F, $$1));
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
         aiy $$1 = aiy.a(this.h);
         Optional<? extends in<cou>> $$2 = this.g.a(auo.a(kg.F, $$1));
         this.j = Either.right($$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return c.createWithContext(this.h, $$1);
         }));
      }
   }

   private void c() throws CommandSyntaxException {
      this.k = new tu(this.h).f();
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
      return dz.a(this.g.e().map(auo::b), $$0, String.valueOf('#'));
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
      return dz.a(this.g.c().map(aix::a), $$0);
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
      this.b($$0);
      return this.c($$0);
   }

   public static record a(ij<cou> a, @Nullable sw b) {
   }

   public static record b(in<cou> a, @Nullable sw b) {
   }
}
