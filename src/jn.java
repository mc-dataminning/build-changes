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

public interface jn<T> extends Iterable<jj<T>> {
   Stream<jj<T>> a();

   int b();

   Either<awk<T>, List<jj<T>>> c();

   Optional<jj<T>> a(aym var1);

   jj<T> a(int var1);

   boolean a(jj<T> var1);

   boolean a(jm<T> var1);

   Optional<awk<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> jn.c<T> a(jm<T> $$0, awk<T> $$1) {
      return new jn.c<T>($$0, $$1) {
         @Override
         protected List<jj<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jn<T> e() {
      return (jn<T>)jn.a.a;
   }

   @SafeVarargs
   static <T> jn.a<T> a(jj<T>... $$0) {
      return new jn.a<>(List.of($$0));
   }

   static <T> jn.a<T> a(List<? extends jj<T>> $$0) {
      return new jn.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jn.a<T> a(Function<E, jj<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jn.a<T> a(Function<E, jj<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jn.b<T> {
      static final jn.a<?> a = new jn.a(List.of());
      private final List<jj<T>> b;
      @Nullable
      private Set<jj<T>> c;

      a(List<jj<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jj<T>> f() {
         return this.b;
      }

      @Override
      public Either<awk<T>, List<jj<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<awk<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(jj<T> $$0) {
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
            if ($$0 instanceof jn.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jn<T> {
      protected abstract List<jj<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<jj<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<jj<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<jj<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<jj<T>> a(aym $$0) {
         return ac.b(this.f(), $$0);
      }

      @Override
      public jj<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(jm<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jn.b<T> {
      private final jm<T> a;
      private final awk<T> b;
      private List<jj<T>> c = List.of();

      c(jm<T> $$0, awk<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jj<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awk<T> g() {
         return this.b;
      }

      @Override
      protected List<jj<T>> f() {
         return this.c;
      }

      @Override
      public Either<awk<T>, List<jj<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awk<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jj<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jm<T> $$0) {
         return this.a.a($$0);
      }
   }
}
