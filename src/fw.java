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
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jp<T> d;
   final ala<? extends ka<T>> e;

   public fw(ep $$0, ala<? extends ka<T>> $$1) {
      this.e = $$1;
      this.d = $$0.b($$1);
   }

   public static <T> fw<T> a(ep $$0, ala<? extends ka<T>> $$1) {
      return new fw<>($$0, $$1);
   }

   public static <T> fw.c<T> a(CommandContext<et> $$0, String $$1, ala<ka<T>> $$2) throws CommandSyntaxException {
      fw.c<?> $$3 = (fw.c<?>)$$0.getArgument($$1, fw.c.class);
      Optional<fw.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
            ala<?> $$2x = $$1xx.h();
            return fs.b.create($$2x.a(), $$2x.b(), $$2.a());
         }, $$1xx -> {
            axi<?> $$2x = $$1xx.h();
            return c.create($$2x.b(), $$2x.a(), $$2.a());
         }));
   }

   public fw.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            alb $$2 = alb.a($$0);
            axi<T> $$3 = axi.a(this.e, $$2);
            jr.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fw.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         alb $$6 = alb.a($$0);
         ala<T> $$7 = ala.a(this.e, $$6);
         jn.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fs.a.createWithContext($$0, $$6, this.e.a()));
         return new fw.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ey.a(this.d.e().map(axi::b), $$1, "#");
      return ey.a(this.d.c().map(ala::a), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ip<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, wa $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(wa $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements ip.a<fw<T>> {
         final ala<? extends ka<T>> b;

         a(final ala<? extends ka<T>> $$1) {
            this.b = $$1;
         }

         public fw<T> a(ep $$0) {
            return new fw<>($$0, this.b);
         }

         @Override
         public ip<fw<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(jn.c<T> a) implements fw.c<T> {
      @Override
      public Either<jn.c<T>, jr.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fw.c<E>> a(ala<? extends ka<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fw.c<E>)this) : Optional.empty();
      }

      public boolean a(jn<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jn.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jn<T>> {
      Either<jn.c<T>, jr.c<T>> a();

      <E> Optional<fw.c<E>> a(ala<? extends ka<E>> var1);

      String b();
   }

   static record d<T>(jr.c<T> a) implements fw.c<T> {
      @Override
      public Either<jn.c<T>, jr.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fw.c<E>> a(ala<? extends ka<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fw.c<E>)this) : Optional.empty();
      }

      public boolean a(jn<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jr.c<T> c() {
         return this.a;
      }
   }
}
