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

public class fy<T> implements ArgumentType<fy.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final ald<? extends kb<T>> b;

   public fy(ald<? extends kb<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fy<T> a(ald<? extends kb<T>> $$0) {
      return new fy<>($$0);
   }

   public static <T> fy.c<T> a(CommandContext<eu> $$0, String $$1, ald<kb<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fy.c<?> $$4 = (fy.c<?>)$$0.getArgument($$1, fy.c.class);
      Optional<fy.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fy.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ale $$2 = ale.a($$0);
            return new fy.d<>(axl.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ale $$4 = ale.a($$0);
         return new fy.b<>(ald.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ez $$2 ? $$2.a(this.b, ez.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements iq<fy<T>, fy.a<T>.a> {
      public void a(fy.a<T>.a $$0, wb $$1) {
         $$1.b($$0.b);
      }

      public fy.a<T>.a a(wb $$0) {
         return new fy.a.a($$0.r());
      }

      public void a(fy.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fy.a<T>.a a(fy<T> $$0) {
         return new fy.a.a($$0.b);
      }

      public final class a implements iq.a<fy<T>> {
         final ald<? extends kb<T>> b;

         a(final ald<? extends kb<T>> $$1) {
            this.b = $$1;
         }

         public fy<T> a(eq $$0) {
            return new fy<>(this.b);
         }

         @Override
         public iq<fy<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(ald<T> a) implements fy.c<T> {
      @Override
      public Either<ald<T>, axl<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fy.c<E>> a(ald<? extends kb<E>> $$0) {
         return this.a.d($$0).map(fy.b::new);
      }

      public boolean a(jo<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public ald<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jo<T>> {
      Either<ald<T>, axl<T>> a();

      <E> Optional<fy.c<E>> a(ald<? extends kb<E>> var1);

      String b();
   }

   static record d<T>(axl<T> a) implements fy.c<T> {
      @Override
      public Either<ald<T>, axl<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fy.c<E>> a(ald<? extends kb<E>> $$0) {
         return this.a.d($$0).map(fy.d::new);
      }

      public boolean a(jo<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axl<T> c() {
         return this.a;
      }
   }
}
