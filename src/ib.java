import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ib<T> {
   T a();

   boolean b();

   boolean a(afw var1);

   boolean a(afv<T> var1);

   boolean a(Predicate<afv<T>> var1);

   boolean a(arh<T> var1);

   Stream<arh<T>> c();

   Either<afv<T>, T> d();

   Optional<afv<T>> e();

   ib.b f();

   boolean a(ie<T> var1);

   static <T> ib<T> a(T $$0) {
      return new ib.a<>($$0);
   }

   public static record a<T>(T a) implements ib<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(afw $$0) {
         return false;
      }

      @Override
      public boolean a(afv<T> $$0) {
         return false;
      }

      @Override
      public boolean a(arh<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<afv<T>> $$0) {
         return false;
      }

      @Override
      public Either<afv<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<afv<T>> e() {
         return Optional.empty();
      }

      @Override
      public ib.b f() {
         return ib.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ie<T> $$0) {
         return true;
      }

      @Override
      public Stream<arh<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ib<T> {
      private final ie<T> a;
      private Set<arh<T>> b = Set.of();
      private final ib.c.a c;
      @Nullable
      private afv<T> d;
      @Nullable
      private T e;

      private c(ib.c.a $$0, ie<T> $$1, @Nullable afv<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ib.c<T> a(ie<T> $$0, afv<T> $$1) {
         return new ib.c<>(ib.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ib.c<T> a(ie<T> $$0, @Nullable T $$1) {
         return new ib.c<>(ib.c.a.b, $$0, null, $$1);
      }

      public afv<T> g() {
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
      public boolean a(afw $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(afv<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(arh<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<afv<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(ie<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<afv<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<afv<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public ib.b f() {
         return ib.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(afv<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      void b(T $$0) {
         if (this.c == ib.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<arh<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<arh<T>> c() {
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
