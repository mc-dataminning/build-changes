import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class fz<T> implements ArgumentType<fz.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final alg<? extends kc<T>> b;

   public fz(alg<? extends kc<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fz<T> a(alg<? extends kc<T>> $$0) {
      return new fz<>($$0);
   }

   public static <T> fz.c<T> a(CommandContext<ev> $$0, String $$1, alg<kc<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fz.c<?> $$4 = (fz.c<?>)$$0.getArgument($$1, fz.c.class);
      Optional<fz.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fz.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alh $$2 = alh.a($$0);
            return new fz.d<>(axp.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         alh $$4 = alh.a($$0);
         return new fz.b<>(alg.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fa $$2 ? $$2.a(this.b, fa.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ir<fz<T>, fz.a<T>.a> {
      public void a(fz.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fz.a<T>.a a(we $$0) {
         return new fz.a.a($$0.r());
      }

      public void a(fz.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fz.a<T>.a a(fz<T> $$0) {
         return new fz.a.a($$0.b);
      }

      public final class a implements ir.a<fz<T>> {
         final alg<? extends kc<T>> b;

         a(final alg<? extends kc<T>> $$1) {
            this.b = $$1;
         }

         public fz<T> a(er $$0) {
            return new fz<>(this.b);
         }

         @Override
         public ir<fz<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(alg<T> a) implements fz.c<T> {
      @Override
      public Either<alg<T>, axp<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fz.c<E>> a(alg<? extends kc<E>> $$0) {
         return this.a.d($$0).map(fz.b::new);
      }

      public boolean a(jp<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public alg<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jp<T>> {
      Either<alg<T>, axp<T>> a();

      <E> Optional<fz.c<E>> a(alg<? extends kc<E>> var1);

      String b();
   }

   static record d<T>(axp<T> a) implements fz.c<T> {
      @Override
      public Either<alg<T>, axp<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fz.c<E>> a(alg<? extends kc<E>> $$0) {
         return this.a.d($$0).map(fz.d::new);
      }

      public boolean a(jp<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axp<T> c() {
         return this.a;
      }
   }
}
