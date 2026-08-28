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

public class gb<T> implements ArgumentType<gb.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final alc<? extends kf<T>> b;

   public gb(alc<? extends kf<T>> $$0) {
      this.b = $$0;
   }

   public static <T> gb<T> a(alc<? extends kf<T>> $$0) {
      return new gb<>($$0);
   }

   public static <T> gb.c<T> a(CommandContext<ex> $$0, String $$1, alc<kf<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      gb.c<?> $$4 = (gb.c<?>)$$0.getArgument($$1, gb.c.class);
      Optional<gb.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public gb.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ald $$2 = ald.a($$0);
            return new gb.d<>(axp.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ald $$4 = ald.a($$0);
         return new gb.b<>(alc.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc $$2 ? $$2.a(this.b, fc.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements iu<gb<T>, gb.a<T>.a> {
      public void a(gb.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public gb.a<T>.a a(vr $$0) {
         return new gb.a.a($$0.r());
      }

      public void a(gb.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public gb.a<T>.a a(gb<T> $$0) {
         return new gb.a.a($$0.b);
      }

      public final class a implements iu.a<gb<T>> {
         final alc<? extends kf<T>> b;

         a(final alc<? extends kf<T>> $$1) {
            this.b = $$1;
         }

         public gb<T> a(et $$0) {
            return new gb<>(this.b);
         }

         @Override
         public iu<gb<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(alc<T> a) implements gb.c<T> {
      @Override
      public Either<alc<T>, axp<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<gb.c<E>> a(alc<? extends kf<E>> $$0) {
         return this.a.d($$0).map(gb.b::new);
      }

      public boolean a(js<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public alc<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<js<T>> {
      Either<alc<T>, axp<T>> a();

      <E> Optional<gb.c<E>> a(alc<? extends kf<E>> var1);

      String b();
   }

   static record d<T>(axp<T> a) implements gb.c<T> {
      @Override
      public Either<alc<T>, axp<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<gb.c<E>> a(alc<? extends kf<E>> $$0) {
         return this.a.e($$0).map(gb.d::new);
      }

      public boolean a(js<T> $$0) {
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
