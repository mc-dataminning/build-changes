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

public interface jv<T> extends Iterable<jr<T>> {
   Stream<jr<T>> a();

   int b();

   boolean c();

   Either<axe<T>, List<jr<T>>> d();

   Optional<jr<T>> a(azg var1);

   jr<T> a(int var1);

   boolean a(jr<T> var1);

   boolean a(ju<T> var1);

   Optional<axe<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jv.c<T> a(ju<T> $$0, axe<T> $$1) {
      return new jv.c<T>($$0, $$1) {
         @Override
         protected List<jr<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jv<T> f() {
      return (jv<T>)jv.a.a;
   }

   @SafeVarargs
   static <T> jv.a<T> a(jr<T>... $$0) {
      return new jv.a<>(List.of($$0));
   }

   static <T> jv.a<T> a(List<? extends jr<T>> $$0) {
      return new jv.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jv.a<T> a(Function<E, jr<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jv.a<T> a(Function<E, jr<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jv.b<T> {
      static final jv.a<?> a = new jv.a(List.of());
      private final List<jr<T>> b;
      @Nullable
      private Set<jr<T>> c;

      a(List<jr<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jr<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axe<T>, List<jr<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axe<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jr<T> $$0) {
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
            if ($$0 instanceof jv.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jv<T> {
      protected abstract List<jr<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jr<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jr<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jr<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jr<T>> a(azg $$0) {
         return af.b(this.g(), $$0);
      }

      @Override
      public jr<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(ju<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jv.b<T> {
      private final ju<T> a;
      private final axe<T> b;
      @Nullable
      private List<jr<T>> c;

      c(ju<T> $$0, axe<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jr<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axe<T> h() {
         return this.b;
      }

      @Override
      protected List<jr<T>> g() {
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
      public Either<axe<T>, List<jr<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axe<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jr<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ju<T> $$0) {
         return this.a.a($$0);
      }
   }
}
