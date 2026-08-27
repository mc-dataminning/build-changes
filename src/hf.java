import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface hf<T> {
   T a();

   boolean b();

   boolean a(aep var1);

   boolean a(aeo<T> var1);

   boolean a(Predicate<aeo<T>> var1);

   boolean a(apy<T> var1);

   Stream<apy<T>> c();

   Either<aeo<T>, T> d();

   Optional<aeo<T>> e();

   hf.b f();

   boolean a(hi<T> var1);

   static <T> hf<T> a(T $$0) {
      return new hf.a<>($$0);
   }

   public static record a<T>(T a) implements hf<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(aep $$0) {
         return false;
      }

      @Override
      public boolean a(aeo<T> $$0) {
         return false;
      }

      @Override
      public boolean a(apy<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<aeo<T>> $$0) {
         return false;
      }

      @Override
      public Either<aeo<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aeo<T>> e() {
         return Optional.empty();
      }

      @Override
      public hf.b f() {
         return hf.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(hi<T> $$0) {
         return true;
      }

      @Override
      public Stream<apy<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements hf<T> {
      private final hi<T> a;
      private Set<apy<T>> b = Set.of();
      private final hf.c.a c;
      @Nullable
      private aeo<T> d;
      @Nullable
      private T e;

      private c(hf.c.a $$0, hi<T> $$1, @Nullable aeo<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> hf.c<T> a(hi<T> $$0, aeo<T> $$1) {
         return new hf.c<>(hf.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> hf.c<T> a(hi<T> $$0, @Nullable T $$1) {
         return new hf.c<>(hf.c.a.b, $$0, null, $$1);
      }

      public aeo<T> g() {
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
      public boolean a(aep $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(aeo<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(apy<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<aeo<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(hi<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aeo<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<aeo<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public hf.b f() {
         return hf.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aeo<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      void b(T $$0) {
         if (this.c == hf.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<apy<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<apy<T>> c() {
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
