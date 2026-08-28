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

public class fw<T> implements ArgumentType<fw.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jo<T> d;
   final akp<? extends jz<T>> e;

   public fw(ep $$0, akp<? extends jz<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fw<T> a(ep $$0, akp<? extends jz<T>> $$1) {
      return new fw<>($$0, $$1);
   }

   public static <T> fw.c<T> a(CommandContext<et> $$0, String $$1, akp<jz<T>> $$2) throws CommandSyntaxException {
      fw.c<?> $$3 = (fw.c<?>)$$0.getArgument($$1, fw.c.class);
      Optional<fw.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            akp<?> $$2x = $$1xx.h();
            return fs.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            awt<?> $$2x = $$1xx.g();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fw.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            akq $$2 = akq.a($$0);
            awt<T> $$3 = awt.a(this.e, $$2);
            jq.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fw.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         akq $$6 = akq.a($$0);
         akp<T> $$7 = akp.a(this.e, $$6);
         jm.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fs.a.createWithContext($$0, $$6, this.e.a()));
         return new fw.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ey.a(this.d.e().map(awt::b), $$1, "#");
      return ey.a(this.d.c().map(akp::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements io<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, vv $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(vv $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements io.a<fw<T>> {
         final akp<? extends jz<T>> b;

         a(final akp<? extends jz<T>> $$1) {
            this.b = $$1;
         }

         public fw<T> a(ep $$0) {
            return new fw<>($$0, this.b);
         }

         @Override
         public io<fw<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jm.c<T> a) implements fw.c<T> {
      @Override
      public Either<jm.c<T>, jq.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fw.c<E>> a(akp<? extends jz<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fw.c<E>)this) : Optional.empty();
      }

      public boolean a(jm<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jm.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jm<T>> {
      Either<jm.c<T>, jq.c<T>> a();

      <E> Optional<fw.c<E>> a(akp<? extends jz<E>> var1);

      String b();
   }

   static record d<T>(jq.c<T> a) implements fw.c<T> {
      @Override
      public Either<jm.c<T>, jq.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fw.c<E>> a(akp<? extends jz<E>> $$0) {
         return this.a.g().c($$0) ? Optional.of((fw.c<E>)this) : Optional.empty();
      }

      public boolean a(jm<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.g().b();
      }

      public jq.c<T> c() {
         return this.a;
      }
   }
}
