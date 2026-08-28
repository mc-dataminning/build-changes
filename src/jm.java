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

public interface jm<T> extends Iterable<ji<T>> {
   Stream<ji<T>> a();

   int b();

   Either<axb<T>, List<ji<T>>> c();

   Optional<ji<T>> a(azc var1);

   ji<T> a(int var1);

   boolean a(ji<T> var1);

   boolean a(jl<T> var1);

   Optional<axb<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> jm.c<T> a(jl<T> $$0, axb<T> $$1) {
      return new jm.c<T>($$0, $$1) {
         @Override
         protected List<ji<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jm<T> e() {
      return (jm<T>)jm.a.a;
   }

   @SafeVarargs
   static <T> jm.a<T> a(ji<T>... $$0) {
      return new jm.a<>(List.of($$0));
   }

   static <T> jm.a<T> a(List<? extends ji<T>> $$0) {
      return new jm.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jm.a<T> a(Function<E, ji<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jm.a<T> a(Function<E, ji<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jm.b<T> {
      static final jm.a<?> a = new jm.a(List.of());
      private final List<ji<T>> b;
      @Nullable
      private Set<ji<T>> c;

      a(List<ji<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<ji<T>> f() {
         return this.b;
      }

      @Override
      public Either<axb<T>, List<ji<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axb<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ji<T> $$0) {
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
            if ($$0 instanceof jm.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jm<T> {
      protected abstract List<ji<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<ji<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<ji<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<ji<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<ji<T>> a(azc $$0) {
         return ac.b(this.f(), $$0);
      }

      @Override
      public ji<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(jl<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jm.b<T> {
      private final jl<T> a;
      private final axb<T> b;
      private List<ji<T>> c = List.of();

      c(jl<T> $$0, axb<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ji<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axb<T> g() {
         return this.b;
      }

      @Override
      protected List<ji<T>> f() {
         return this.c;
      }

      @Override
      public Either<axb<T>, List<ji<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axb<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ji<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jl<T> $$0) {
         return this.a.a($$0);
      }
   }
}
