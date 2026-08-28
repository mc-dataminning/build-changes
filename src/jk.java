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

public interface jk<T> extends Iterable<jg<T>> {
   Stream<jg<T>> a();

   int b();

   boolean c();

   Either<ayc<T>, List<jg<T>>> d();

   Optional<jg<T>> a(bai var1);

   jg<T> a(int var1);

   boolean a(jg<T> var1);

   boolean a(jj<T> var1);

   Optional<ayc<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jk.c<T> a(jj<T> $$0, ayc<T> $$1) {
      return new jk.c<T>($$0, $$1) {
         @Override
         protected List<jg<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jk<T> f() {
      return (jk<T>)jk.a.a;
   }

   @SafeVarargs
   static <T> jk.a<T> a(jg<T>... $$0) {
      return new jk.a<>(List.of($$0));
   }

   static <T> jk.a<T> a(List<? extends jg<T>> $$0) {
      return new jk.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jk.a<T> a(Function<E, jg<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jk.a<T> a(Function<E, jg<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jk.b<T> {
      static final jk.a<?> a = new jk.a(List.of());
      private final List<jg<T>> b;
      @Nullable
      private Set<jg<T>> c;

      a(List<jg<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jg<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<ayc<T>, List<jg<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<ayc<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jg<T> $$0) {
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
            if ($$0 instanceof jk.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jk<T> {
      protected abstract List<jg<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jg<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jg<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jg<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jg<T>> a(bai $$0) {
         return ag.b(this.g(), $$0);
      }

      @Override
      public jg<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jj<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jk.b<T> {
      private final jj<T> a;
      private final ayc<T> b;
      @Nullable
      private List<jg<T>> c;

      c(jj<T> $$0, ayc<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jg<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public ayc<T> h() {
         return this.b;
      }

      @Override
      protected List<jg<T>> g() {
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
      public Either<ayc<T>, List<jg<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<ayc<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jg<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jj<T> $$0) {
         return this.a.a($$0);
      }
   }
}
