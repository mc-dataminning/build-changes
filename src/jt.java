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

public interface jt<T> extends Iterable<jp<T>> {
   Stream<jp<T>> a();

   int b();

   boolean c();

   Either<axp<T>, List<jp<T>>> d();

   Optional<jp<T>> a(azr var1);

   jp<T> a(int var1);

   boolean a(jp<T> var1);

   boolean a(js<T> var1);

   Optional<axp<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jt.c<T> a(js<T> $$0, axp<T> $$1) {
      return new jt.c<T>($$0, $$1) {
         @Override
         protected List<jp<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jt<T> f() {
      return (jt<T>)jt.a.a;
   }

   @SafeVarargs
   static <T> jt.a<T> a(jp<T>... $$0) {
      return new jt.a<>(List.of($$0));
   }

   static <T> jt.a<T> a(List<? extends jp<T>> $$0) {
      return new jt.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jt.a<T> a(Function<E, jp<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jt.a<T> a(Function<E, jp<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jt.b<T> {
      static final jt.a<?> a = new jt.a(List.of());
      private final List<jp<T>> b;
      @Nullable
      private Set<jp<T>> c;

      a(List<jp<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jp<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axp<T>, List<jp<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axp<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jp<T> $$0) {
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
            if ($$0 instanceof jt.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jt<T> {
      protected abstract List<jp<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jp<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jp<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jp<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jp<T>> a(azr $$0) {
         return ad.b(this.g(), $$0);
      }

      @Override
      public jp<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(js<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jt.b<T> {
      private final js<T> a;
      private final axp<T> b;
      @Nullable
      private List<jp<T>> c;

      c(js<T> $$0, axp<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jp<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axp<T> h() {
         return this.b;
      }

      @Override
      protected List<jp<T>> g() {
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
      public Either<axp<T>, List<jp<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axp<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jp<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(js<T> $$0) {
         return this.a.a($$0);
      }
   }
}
