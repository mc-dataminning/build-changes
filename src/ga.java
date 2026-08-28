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

public class ga<T> implements ArgumentType<ga.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wv.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final ju<T> d;
   final alc<? extends kf<T>> e;

   public ga(et $$0, alc<? extends kf<T>> $$1) {
      this.e = $$1;
      this.d = $$0.e($$1);
   }

   public static <T> ga<T> a(et $$0, alc<? extends kf<T>> $$1) {
      return new ga<>($$0, $$1);
   }

   public static <T> ga.c<T> a(CommandContext<ex> $$0, String $$1, alc<kf<T>> $$2) throws CommandSyntaxException {
      ga.c<?> $$3 = (ga.c<?>)$$0.getArgument($$1, ga.c.class);
      Optional<ga.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            alc<?> $$2x = $$1xx.h();
            return fw.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axp<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public ga.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ald $$2 = ald.a($$0);
            axp<T> $$3 = axp.a(this.e, $$2);
            jw.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new ga.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ald $$6 = ald.a($$0);
         alc<T> $$7 = alc.a(this.e, $$6);
         js.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fw.a.createWithContext($$0, $$6, this.e.a()));
         return new ga.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      fc.a(this.d.f().map(axp::b), $$1, "#");
      return fc.a(this.d.c_().map(alc::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements iu<ga<T>, ga.a<T>.a> {
      public void a(ga.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public ga.a<T>.a a(vr $$0) {
         return new ga.a.a($$0.r());
      }

      public void a(ga.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ga.a<T>.a a(ga<T> $$0) {
         return new ga.a.a($$0.e);
      }

      public final class a implements iu.a<ga<T>> {
         final alc<? extends kf<T>> b;

         a(final alc<? extends kf<T>> $$1) {
            this.b = $$1;
         }

         public ga<T> a(et $$0) {
            return new ga<>($$0, this.b);
         }

         @Override
         public iu<ga<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(js.c<T> a) implements ga.c<T> {
      @Override
      public Either<js.c<T>, jw.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ga.c<E>> a(alc<? extends kf<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((ga.c<E>)this) : Optional.empty();
      }

      public boolean a(js<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public js.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<js<T>> {
      Either<js.c<T>, jw.c<T>> a();

      <E> Optional<ga.c<E>> a(alc<? extends kf<E>> var1);

      String b();
   }

   static record d<T>(jw.c<T> a) implements ga.c<T> {
      @Override
      public Either<js.c<T>, jw.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ga.c<E>> a(alc<? extends kf<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((ga.c<E>)this) : Optional.empty();
      }

      public boolean a(js<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jw.c<T> c() {
         return this.a;
      }
   }
}
