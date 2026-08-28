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

public class fx<T> implements ArgumentType<fx.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final akp<? extends jz<T>> b;

   public fx(akp<? extends jz<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fx<T> a(akp<? extends jz<T>> $$0) {
      return new fx<>($$0);
   }

   public static <T> fx.c<T> a(CommandContext<et> $$0, String $$1, akp<jz<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fx.c<?> $$4 = (fx.c<?>)$$0.getArgument($$1, fx.c.class);
      Optional<fx.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fx.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akq $$2 = akq.a($$0);
            return new fx.d<>(awt.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         akq $$4 = akq.a($$0);
         return new fx.b<>(akp.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey $$2 ? $$2.a(this.b, ey.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements io<fx<T>, fx.a<T>.a> {
      public void a(fx.a<T>.a $$0, vv $$1) {
         $$1.b($$0.b);
      }

      public fx.a<T>.a a(vv $$0) {
         return new fx.a.a($$0.r());
      }

      public void a(fx.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fx.a<T>.a a(fx<T> $$0) {
         return new fx.a.a($$0.b);
      }

      public final class a implements io.a<fx<T>> {
         final akp<? extends jz<T>> b;

         a(final akp<? extends jz<T>> $$1) {
            this.b = $$1;
         }

         public fx<T> a(ep $$0) {
            return new fx<>(this.b);
         }

         @Override
         public io<fx<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(akp<T> a) implements fx.c<T> {
      @Override
      public Either<akp<T>, awt<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fx.c<E>> a(akp<? extends jz<E>> $$0) {
         return this.a.d($$0).map(fx.b::new);
      }

      public boolean a(jm<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public akp<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jm<T>> {
      Either<akp<T>, awt<T>> a();

      <E> Optional<fx.c<E>> a(akp<? extends jz<E>> var1);

      String b();
   }

   static record d<T>(awt<T> a) implements fx.c<T> {
      @Override
      public Either<akp<T>, awt<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fx.c<E>> a(akp<? extends jz<E>> $$0) {
         return this.a.d($$0).map(fx.d::new);
      }

      public boolean a(jm<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public awt<T> c() {
         return this.a;
      }
   }
}
