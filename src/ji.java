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

public interface ji<T> extends Iterable<je<T>> {
   Stream<je<T>> a();

   int b();

   boolean c();

   Either<axr<T>, List<je<T>>> d();

   Optional<je<T>> a(azv var1);

   je<T> a(int var1);

   boolean a(je<T> var1);

   boolean a(jh<T> var1);

   Optional<axr<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> ji.c<T> a(jh<T> $$0, axr<T> $$1) {
      return new ji.c<T>($$0, $$1) {
         @Override
         protected List<je<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> ji<T> f() {
      return (ji<T>)ji.a.a;
   }

   @SafeVarargs
   static <T> ji.a<T> a(je<T>... $$0) {
      return new ji.a<>(List.of($$0));
   }

   static <T> ji.a<T> a(List<? extends je<T>> $$0) {
      return new ji.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ji.a<T> a(Function<E, je<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ji.a<T> a(Function<E, je<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends ji.b<T> {
      static final ji.a<?> a = new ji.a(List.of());
      private final List<je<T>> b;
      @Nullable
      private Set<je<T>> c;

      a(List<je<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<je<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axr<T>, List<je<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axr<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(je<T> $$0) {
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
            if ($$0 instanceof ji.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements ji<T> {
      protected abstract List<je<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<je<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<je<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<je<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<je<T>> a(azv $$0) {
         return af.b(this.g(), $$0);
      }

      @Override
      public je<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jh<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ji.b<T> {
      private final jh<T> a;
      private final axr<T> b;
      @Nullable
      private List<je<T>> c;

      c(jh<T> $$0, axr<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<je<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axr<T> h() {
         return this.b;
      }

      @Override
      protected List<je<T>> g() {
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
      public Either<axr<T>, List<je<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axr<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(je<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jh<T> $$0) {
         return this.a.a($$0);
      }
   }
}
