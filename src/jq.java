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

public interface jq<T> extends Iterable<jm<T>> {
   Stream<jm<T>> a();

   int b();

   Either<awu<T>, List<jm<T>>> c();

   Optional<jm<T>> a(ayw var1);

   jm<T> a(int var1);

   boolean a(jm<T> var1);

   boolean a(jp<T> var1);

   Optional<awu<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> jq.c<T> a(jp<T> $$0, awu<T> $$1) {
      return new jq.c<T>($$0, $$1) {
         @Override
         protected List<jm<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jq<T> e() {
      return (jq<T>)jq.a.a;
   }

   @SafeVarargs
   static <T> jq.a<T> a(jm<T>... $$0) {
      return new jq.a<>(List.of($$0));
   }

   static <T> jq.a<T> a(List<? extends jm<T>> $$0) {
      return new jq.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jq.a<T> a(Function<E, jm<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jq.a<T> a(Function<E, jm<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jq.b<T> {
      static final jq.a<?> a = new jq.a(List.of());
      private final List<jm<T>> b;
      @Nullable
      private Set<jm<T>> c;

      a(List<jm<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jm<T>> f() {
         return this.b;
      }

      @Override
      public Either<awu<T>, List<jm<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<awu<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(jm<T> $$0) {
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
            if ($$0 instanceof jq.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jq<T> {
      protected abstract List<jm<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<jm<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<jm<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<jm<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<jm<T>> a(ayw $$0) {
         return ad.b(this.f(), $$0);
      }

      @Override
      public jm<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(jp<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jq.b<T> {
      private final jp<T> a;
      private final awu<T> b;
      private List<jm<T>> c = List.of();

      c(jp<T> $$0, awu<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jm<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awu<T> g() {
         return this.b;
      }

      @Override
      protected List<jm<T>> f() {
         return this.c;
      }

      @Override
      public Either<awu<T>, List<jm<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awu<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jm<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jp<T> $$0) {
         return this.a.a($$0);
      }
   }
}
