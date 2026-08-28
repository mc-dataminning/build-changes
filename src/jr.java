import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public interface jr<T> extends Iterable<jn<T>> {
   Stream<jn<T>> a();

   int b();

   boolean c();

   Either<axj<T>, List<jn<T>>> d();

   Optional<jn<T>> a(azl var1);

   jn<T> a(int var1);

   boolean a(jn<T> var1);

   boolean a(jq<T> var1);

   Optional<axj<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jr.c<T> a(jq<T> $$0, axj<T> $$1) {
      return new jr.c<T>($$0, $$1) {
         @Override
         protected List<jn<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jr<T> f() {
      return (jr<T>)jr.a.a;
   }

   @SafeVarargs
   static <T> jr.a<T> a(jn<T>... $$0) {
      return new jr.a<>(List.of($$0));
   }

   static <T> jr.a<T> a(List<? extends jn<T>> $$0) {
      return new jr.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jr.a<T> a(Function<E, jn<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jr.a<T> a(Function<E, jn<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jr.b<T> {
      static final jr.a<?> a = new jr.a(List.of());
      private final List<jn<T>> b;
      @Nullable
      private Set<jn<T>> c;

      a(List<jn<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jn<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axj<T>, List<jn<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axj<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jn<T> $$0) {
         if (this.c == null) {
            this.c = Set.copyOf(this.b);
         }

         return this.c.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.b + "]";
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof jr.a<?> $$1 && this.b.equals($$1.b)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.b.hashCode();
      }
   }

   public abstract static class b<T> implements jr<T> {
      protected abstract List<jn<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jn<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jn<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jn<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jn<T>> a(azl $$0) {
         return ad.b(this.g(), $$0);
      }

      @Override
      public jn<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jq<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jr.b<T> {
      private final jq<T> a;
      private final axj<T> b;
      @Nullable
      private List<jn<T>> c;

      c(jq<T> $$0, axj<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jn<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axj<T> h() {
         return this.b;
      }

      @Override
      protected List<jn<T>> g() {
         if (this.c == null) {
            throw new IllegalStateException("Trying to access unbound tag '" + this.b + "' from registry " + this.a);
         } else {
            return this.c;
         }
      }

      @Override
      public boolean c() {
         return this.c != null;
      }

      @Override
      public Either<axj<T>, List<jn<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axj<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jn<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jq<T> $$0) {
         return this.a.a($$0);
      }
   }
}
