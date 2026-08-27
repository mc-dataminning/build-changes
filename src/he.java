import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface he<T> {
   T a();

   boolean b();

   boolean a(aer var1);

   boolean a(aeq<T> var1);

   boolean a(Predicate<aeq<T>> var1);

   boolean a(aqa<T> var1);

   Stream<aqa<T>> c();

   Either<aeq<T>, T> d();

   Optional<aeq<T>> e();

   he.b f();

   boolean a(hh<T> var1);

   static <T> he<T> a(T $$0) {
      return new he.a<>($$0);
   }

   public static record a<T>(T a) implements he<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(aer $$0) {
         return false;
      }

      @Override
      public boolean a(aeq<T> $$0) {
         return false;
      }

      @Override
      public boolean a(aqa<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<aeq<T>> $$0) {
         return false;
      }

      @Override
      public Either<aeq<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aeq<T>> e() {
         return Optional.empty();
      }

      @Override
      public he.b f() {
         return he.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(hh<T> $$0) {
         return true;
      }

      @Override
      public Stream<aqa<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements he<T> {
      private final hh<T> a;
      private Set<aqa<T>> b = Set.of();
      private final he.c.a c;
      @Nullable
      private aeq<T> d;
      @Nullable
      private T e;

      private c(he.c.a $$0, hh<T> $$1, @Nullable aeq<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> he.c<T> a(hh<T> $$0, aeq<T> $$1) {
         return new he.c<>(he.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> he.c<T> a(hh<T> $$0, @Nullable T $$1) {
         return new he.c<>(he.c.a.b, $$0, null, $$1);
      }

      public aeq<T> g() {
         if (this.d == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.e + "' from registry " + this.a);
         } else {
            return this.d;
         }
      }

      @Override
      public T a() {
         if (this.e == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.d + "' from registry " + this.a);
         } else {
            return this.e;
         }
      }

      @Override
      public boolean a(aer $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(aeq<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(aqa<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<aeq<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(hh<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aeq<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<aeq<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public he.b f() {
         return he.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aeq<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      void b(T $$0) {
         if (this.c == he.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<aqa<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<aqa<T>> c() {
         return this.b.stream();
      }

      @Override
      public String toString() {
         return "Reference{" + this.d + "=" + this.e + "}";
      }

      static enum a {
         a,
         b;
      }
   }
}
