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

public interface jw<T> extends Iterable<js<T>> {
   Stream<js<T>> a();

   int b();

   boolean c();

   Either<axp<T>, List<js<T>>> d();

   Optional<js<T>> a(azs var1);

   js<T> a(int var1);

   boolean a(js<T> var1);

   boolean a(jv<T> var1);

   Optional<axp<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jw.c<T> a(jv<T> $$0, axp<T> $$1) {
      return new jw.c<T>($$0, $$1) {
         @Override
         protected List<js<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jw<T> f() {
      return (jw<T>)jw.a.a;
   }

   @SafeVarargs
   static <T> jw.a<T> a(js<T>... $$0) {
      return new jw.a<>(List.of($$0));
   }

   static <T> jw.a<T> a(List<? extends js<T>> $$0) {
      return new jw.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jw.a<T> a(Function<E, js<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jw.a<T> a(Function<E, js<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jw.b<T> {
      static final jw.a<?> a = new jw.a(List.of());
      private final List<js<T>> b;
      @Nullable
      private Set<js<T>> c;

      a(List<js<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<js<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axp<T>, List<js<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axp<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(js<T> $$0) {
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
            if ($$0 instanceof jw.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements jw<T> {
      protected abstract List<js<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<js<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<js<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<js<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<js<T>> a(azs $$0) {
         return af.b(this.g(), $$0);
      }

      @Override
      public js<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jv<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jw.b<T> {
      private final jv<T> a;
      private final axp<T> b;
      @Nullable
      private List<js<T>> c;

      c(jv<T> $$0, axp<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<js<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axp<T> h() {
         return this.b;
      }

      @Override
      protected List<js<T>> g() {
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
      public Either<axp<T>, List<js<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axp<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(js<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jv<T> $$0) {
         return this.a.a($$0);
      }
   }
}
