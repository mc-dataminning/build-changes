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

public class ga<T> implements ArgumentType<ga.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final alh<? extends kd<T>> b;

   public ga(alh<? extends kd<T>> $$0) {
      this.b = $$0;
   }

   public static <T> ga<T> a(alh<? extends kd<T>> $$0) {
      return new ga<>($$0);
   }

   public static <T> ga.c<T> a(CommandContext<ew> $$0, String $$1, alh<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ga.c<?> $$4 = (ga.c<?>)$$0.getArgument($$1, ga.c.class);
      Optional<ga.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public ga.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ali $$2 = ali.a($$0);
            return new ga.d<>(axq.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ali $$4 = ali.a($$0);
         return new ga.b<>(alh.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb $$2 ? $$2.a(this.b, fb.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements is<ga<T>, ga.a<T>.a> {
      public void a(ga.a<T>.a $$0, wf $$1) {
         $$1.b($$0.b);
      }

      public ga.a<T>.a a(wf $$0) {
         return new ga.a.a($$0.r());
      }

      public void a(ga.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ga.a<T>.a a(ga<T> $$0) {
         return new ga.a.a($$0.b);
      }

      public final class a implements is.a<ga<T>> {
         final alh<? extends kd<T>> b;

         a(final alh<? extends kd<T>> $$1) {
            this.b = $$1;
         }

         public ga<T> a(es $$0) {
            return new ga<>(this.b);
         }

         @Override
         public is<ga<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(alh<T> a) implements ga.c<T> {
      @Override
      public Either<alh<T>, axq<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<ga.c<E>> a(alh<? extends kd<E>> $$0) {
         return this.a.d($$0).map(ga.b::new);
      }

      public boolean a(jq<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public alh<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jq<T>> {
      Either<alh<T>, axq<T>> a();

      <E> Optional<ga.c<E>> a(alh<? extends kd<E>> var1);

      String b();
   }

   static record d<T>(axq<T> a) implements ga.c<T> {
      @Override
      public Either<alh<T>, axq<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<ga.c<E>> a(alh<? extends kd<E>> $$0) {
         return this.a.e($$0).map(ga.d::new);
      }

      public boolean a(jq<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public axq<T> c() {
         return this.a;
      }
   }
}
