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

public class fz<T> implements ArgumentType<fz.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xj.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final js<T> d;
   final ali<? extends kd<T>> e;

   public fz(es $$0, ali<? extends kd<T>> $$1) {
      this.e = $$1;
      this.d = $$0.d($$1);
   }

   public static <T> fz<T> a(es $$0, ali<? extends kd<T>> $$1) {
      return new fz<>($$0, $$1);
   }

   public static <T> fz.c<T> a(CommandContext<ew> $$0, String $$1, ali<kd<T>> $$2) throws CommandSyntaxException {
      fz.c<?> $$3 = (fz.c<?>)$$0.getArgument($$1, fz.c.class);
      Optional<fz.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ali<?> $$2x = $$1xx.h();
            return fv.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axs<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fz.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alj $$2 = alj.a($$0);
            axs<T> $$3 = axs.a(this.e, $$2);
            ju.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fz.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         alj $$6 = alj.a($$0);
         ali<T> $$7 = ali.a(this.e, $$6);
         jq.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fv.a.createWithContext($$0, $$6, this.e.a()));
         return new fz.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      fb.a(this.d.f().map(axs::b), $$1, "#");
      return fb.a(this.d.c_().map(ali::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements is<fz<T>, fz.a<T>.a> {
      public void a(fz.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fz.a<T>.a a(wg $$0) {
         return new fz.a.a($$0.r());
      }

      public void a(fz.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fz.a<T>.a a(fz<T> $$0) {
         return new fz.a.a($$0.e);
      }

      public final class a implements is.a<fz<T>> {
         final ali<? extends kd<T>> b;

         a(final ali<? extends kd<T>> $$1) {
            this.b = $$1;
         }

         public fz<T> a(es $$0) {
            return new fz<>($$0, this.b);
         }

         @Override
         public is<fz<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jq.c<T> a) implements fz.c<T> {
      @Override
      public Either<jq.c<T>, ju.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fz.c<E>> a(ali<? extends kd<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fz.c<E>)this) : Optional.empty();
      }

      public boolean a(jq<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jq.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jq<T>> {
      Either<jq.c<T>, ju.c<T>> a();

      <E> Optional<fz.c<E>> a(ali<? extends kd<E>> var1);

      String b();
   }

   static record d<T>(ju.c<T> a) implements fz.c<T> {
      @Override
      public Either<jq.c<T>, ju.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fz.c<E>> a(ali<? extends kd<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((fz.c<E>)this) : Optional.empty();
      }

      public boolean a(jq<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public ju.c<T> c() {
         return this.a;
      }
   }
}
