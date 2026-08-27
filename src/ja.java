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

public interface ja<T> extends Iterable<iw<T>> {
   Stream<iw<T>> a();

   int b();

   Either<awg<T>, List<iw<T>>> c();

   Optional<iw<T>> a(ayg var1);

   iw<T> a(int var1);

   boolean a(iw<T> var1);

   boolean a(iz<T> var1);

   Optional<awg<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ja.c<T> a(iz<T> $$0, awg<T> $$1) {
      return new ja.c<T>($$0, $$1) {
         @Override
         protected List<iw<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> ja<T> e() {
      return (ja<T>)ja.a.a;
   }

   @SafeVarargs
   static <T> ja.a<T> a(iw<T>... $$0) {
      return new ja.a<>(List.of($$0));
   }

   static <T> ja.a<T> a(List<? extends iw<T>> $$0) {
      return new ja.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ja.a<T> a(Function<E, iw<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ja.a<T> a(Function<E, iw<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends ja.b<T> {
      static final ja.a<?> a = new ja.a(List.of());
      private final List<iw<T>> b;
      @Nullable
      private Set<iw<T>> c;

      a(List<iw<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<iw<T>> f() {
         return this.b;
      }

      @Override
      public Either<awg<T>, List<iw<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<awg<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(iw<T> $$0) {
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
            if ($$0 instanceof ja.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements ja<T> {
      protected abstract List<iw<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<iw<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<iw<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<iw<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<iw<T>> a(ayg $$0) {
         return ac.b(this.f(), $$0);
      }

      @Override
      public iw<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(iz<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ja.b<T> {
      private final iz<T> a;
      private final awg<T> b;
      private List<iw<T>> c = List.of();

      c(iz<T> $$0, awg<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<iw<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awg<T> g() {
         return this.b;
      }

      @Override
      protected List<iw<T>> f() {
         return this.c;
      }

      @Override
      public Either<awg<T>, List<iw<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awg<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(iw<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(iz<T> $$0) {
         return this.a.a($$0);
      }
   }
}
