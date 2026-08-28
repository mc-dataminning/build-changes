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

public class fx<T> implements ArgumentType<fx.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jq<T> d;
   final ald<? extends kb<T>> e;

   public fx(eq $$0, ald<? extends kb<T>> $$1) {
      this.e = $$1;
      this.d = $$0.d($$1);
   }

   public static <T> fx<T> a(eq $$0, ald<? extends kb<T>> $$1) {
      return new fx<>($$0, $$1);
   }

   public static <T> fx.c<T> a(CommandContext<eu> $$0, String $$1, ald<kb<T>> $$2) throws CommandSyntaxException {
      fx.c<?> $$3 = (fx.c<?>)$$0.getArgument($$1, fx.c.class);
      Optional<fx.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ald<?> $$2x = $$1xx.h();
            return ft.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axl<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fx.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ale $$2 = ale.a($$0);
            axl<T> $$3 = axl.a(this.e, $$2);
            js.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fx.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ale $$6 = ale.a($$0);
         ald<T> $$7 = ald.a(this.e, $$6);
         jo.c<T> $$8 = this.d.a($$7).orElseThrow(() -> ft.a.createWithContext($$0, $$6, this.e.a()));
         return new fx.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ez.a(this.d.f().map(axl::b), $$1, "#");
      return ez.a(this.d.c_().map(ald::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements iq<fx<T>, fx.a<T>.a> {
      public void a(fx.a<T>.a $$0, wb $$1) {
         $$1.b($$0.b);
      }

      public fx.a<T>.a a(wb $$0) {
         return new fx.a.a($$0.r());
      }

      public void a(fx.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fx.a<T>.a a(fx<T> $$0) {
         return new fx.a.a($$0.e);
      }

      public final class a implements iq.a<fx<T>> {
         final ald<? extends kb<T>> b;

         a(final ald<? extends kb<T>> $$1) {
            this.b = $$1;
         }

         public fx<T> a(eq $$0) {
            return new fx<>($$0, this.b);
         }

         @Override
         public iq<fx<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jo.c<T> a) implements fx.c<T> {
      @Override
      public Either<jo.c<T>, js.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fx.c<E>> a(ald<? extends kb<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fx.c<E>)this) : Optional.empty();
      }

      public boolean a(jo<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jo.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jo<T>> {
      Either<jo.c<T>, js.c<T>> a();

      <E> Optional<fx.c<E>> a(ald<? extends kb<E>> var1);

      String b();
   }

   static record d<T>(js.c<T> a) implements fx.c<T> {
      @Override
      public Either<jo.c<T>, js.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fx.c<E>> a(ald<? extends kb<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fx.c<E>)this) : Optional.empty();
      }

      public boolean a(jo<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public js.c<T> c() {
         return this.a;
      }
   }
}
