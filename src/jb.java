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

public interface jb<T> extends Iterable<ix<T>> {
   Stream<ix<T>> a();

   int b();

   Either<awl<T>, List<ix<T>>> c();

   Optional<ix<T>> a(ayk var1);

   ix<T> a(int var1);

   boolean a(ix<T> var1);

   boolean a(ja<T> var1);

   Optional<awl<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> jb.c<T> a(ja<T> $$0, awl<T> $$1) {
      return new jb.c<T>($$0, $$1) {
         @Override
         protected List<ix<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jb<T> e() {
      return (jb<T>)jb.a.a;
   }

   @SafeVarargs
   static <T> jb.a<T> a(ix<T>... $$0) {
      return new jb.a<>(List.of($$0));
   }

   static <T> jb.a<T> a(List<? extends ix<T>> $$0) {
      return new jb.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jb.a<T> a(Function<E, ix<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jb.a<T> a(Function<E, ix<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jb.b<T> {
      static final jb.a<?> a = new jb.a(List.of());
      private final List<ix<T>> b;
      @Nullable
      private Set<ix<T>> c;

      a(List<ix<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<ix<T>> f() {
         return this.b;
      }

      @Override
      public Either<awl<T>, List<ix<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<awl<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ix<T> $$0) {
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
            if ($$0 instanceof jb.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jb<T> {
      protected abstract List<ix<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<ix<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<ix<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<ix<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<ix<T>> a(ayk $$0) {
         return ac.b(this.f(), $$0);
      }

      @Override
      public ix<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(ja<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jb.b<T> {
      private final ja<T> a;
      private final awl<T> b;
      private List<ix<T>> c = List.of();

      c(ja<T> $$0, awl<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ix<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awl<T> g() {
         return this.b;
      }

      @Override
      protected List<ix<T>> f() {
         return this.c;
      }

      @Override
      public Either<awl<T>, List<ix<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awl<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ix<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ja<T> $$0) {
         return this.a.a($$0);
      }
   }
}
