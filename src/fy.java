import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class fy<T> implements ArgumentType<fy.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jr<T> d;
   final alg<? extends kc<T>> e;

   public fy(er $$0, alg<? extends kc<T>> $$1) {
      this.e = $$1;
      this.d = $$0.d($$1);
   }

   public static <T> fy<T> a(er $$0, alg<? extends kc<T>> $$1) {
      return new fy<>($$0, $$1);
   }

   public static <T> fy.c<T> a(CommandContext<ev> $$0, String $$1, alg<kc<T>> $$2) throws CommandSyntaxException {
      fy.c<?> $$3 = (fy.c<?>)$$0.getArgument($$1, fy.c.class);
      Optional<fy.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            alg<?> $$2x = $$1xx.h();
            return fu.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axp<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fy.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alh $$2 = alh.a($$0);
            axp<T> $$3 = axp.a(this.e, $$2);
            jt.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fy.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         alh $$6 = alh.a($$0);
         alg<T> $$7 = alg.a(this.e, $$6);
         jp.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fu.a.createWithContext($$0, $$6, this.e.a()));
         return new fy.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      fa.a(this.d.f().map(axp::b), $$1, "#");
      return fa.a(this.d.c_().map(alg::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ir<fy<T>, fy.a<T>.a> {
      public void a(fy.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fy.a<T>.a a(we $$0) {
         return new fy.a.a($$0.r());
      }

      public void a(fy.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fy.a<T>.a a(fy<T> $$0) {
         return new fy.a.a($$0.e);
      }

      public final class a implements ir.a<fy<T>> {
         final alg<? extends kc<T>> b;

         a(final alg<? extends kc<T>> $$1) {
            this.b = $$1;
         }

         public fy<T> a(er $$0) {
            return new fy<>($$0, this.b);
         }

         @Override
         public ir<fy<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jp.c<T> a) implements fy.c<T> {
      @Override
      public Either<jp.c<T>, jt.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fy.c<E>> a(alg<? extends kc<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fy.c<E>)this) : Optional.empty();
      }

      public boolean a(jp<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jp.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jp<T>> {
      Either<jp.c<T>, jt.c<T>> a();

      <E> Optional<fy.c<E>> a(alg<? extends kc<E>> var1);

      String b();
   }

   static record d<T>(jt.c<T> a) implements fy.c<T> {
      @Override
      public Either<jp.c<T>, jt.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fy.c<E>> a(alg<? extends kc<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fy.c<E>)this) : Optional.empty();
      }

      public boolean a(jp<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jt.c<T> c() {
         return this.a;
      }
   }
}
