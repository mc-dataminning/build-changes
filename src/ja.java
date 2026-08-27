import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ja<T> {
   T a();

   boolean b();

   boolean a(akt var1);

   boolean a(aks<T> var1);

   boolean a(Predicate<aks<T>> var1);

   boolean a(awt<T> var1);

   @Deprecated
   boolean a(ja<T> var1);

   Stream<awt<T>> c();

   Either<aks<T>, T> d();

   Optional<aks<T>> e();

   ja.b f();

   boolean a(jd<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> ja<T> a(T $$0) {
      return new ja.a<>($$0);
   }

   public static record a<T>(T a) implements ja<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akt $$0) {
         return false;
      }

      @Override
      public boolean a(aks<T> $$0) {
         return false;
      }

      @Override
      public boolean a(awt<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ja<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<aks<T>> $$0) {
         return false;
      }

      @Override
      public Either<aks<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aks<T>> e() {
         return Optional.empty();
      }

      @Override
      public ja.b f() {
         return ja.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jd<T> $$0) {
         return true;
      }

      @Override
      public Stream<awt<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ja<T> {
      private final jd<T> a;
      private Set<awt<T>> b = Set.of();
      private final ja.c.a c;
      @Nullable
      private aks<T> d;
      @Nullable
      private T e;

      protected c(ja.c.a $$0, jd<T> $$1, @Nullable aks<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ja.c<T> a(jd<T> $$0, aks<T> $$1) {
         return new ja.c<>(ja.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ja.c<T> a(jd<T> $$0, @Nullable T $$1) {
         return new ja.c<>(ja.c.a.b, $$0, null, $$1);
      }

      public aks<T> h() {
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
      public boolean a(akt $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(aks<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(awt<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(ja<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<aks<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jd<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aks<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<aks<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public ja.b f() {
         return ja.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aks<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ja.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<awt<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<awt<T>> c() {
         return this.b.stream();
      }

      @Override
      public String toString() {
         return "Reference{" + this.d + "=" + this.e + "}";
      }

      protected static enum a {
         a,
         b;
      }
   }
}
