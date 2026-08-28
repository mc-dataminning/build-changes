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

public interface jj<T> extends Iterable<jf<T>> {
   Stream<jf<T>> a();

   int b();

   boolean c();

   Either<axr<T>, List<jf<T>>> d();

   Optional<jf<T>> a(azv var1);

   jf<T> a(int var1);

   boolean a(jf<T> var1);

   boolean a(ji<T> var1);

   Optional<axr<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jj.c<T> a(ji<T> $$0, axr<T> $$1) {
      return new jj.c<T>($$0, $$1) {
         @Override
         protected List<jf<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jj<T> f() {
      return (jj<T>)jj.a.a;
   }

   @SafeVarargs
   static <T> jj.a<T> a(jf<T>... $$0) {
      return new jj.a<>(List.of($$0));
   }

   static <T> jj.a<T> a(List<? extends jf<T>> $$0) {
      return new jj.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jj.a<T> a(Function<E, jf<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jj.a<T> a(Function<E, jf<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jj.b<T> {
      static final jj.a<?> a = new jj.a(List.of());
      private final List<jf<T>> b;
      @Nullable
      private Set<jf<T>> c;

      a(List<jf<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jf<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axr<T>, List<jf<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axr<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jf<T> $$0) {
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
            if ($$0 instanceof jj.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jj<T> {
      protected abstract List<jf<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jf<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jf<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jf<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jf<T>> a(azv $$0) {
         return ag.b(this.g(), $$0);
      }

      @Override
      public jf<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(ji<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jj.b<T> {
      private final ji<T> a;
      private final axr<T> b;
      @Nullable
      private List<jf<T>> c;

      c(ji<T> $$0, axr<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jf<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axr<T> h() {
         return this.b;
      }

      @Override
      protected List<jf<T>> g() {
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
      public Either<axr<T>, List<jf<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axr<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jf<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ji<T> $$0) {
         return this.a.a($$0);
      }
   }
}
