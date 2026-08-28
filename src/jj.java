import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jj<T> {
   T a();

   boolean b();

   boolean a(akk var1);

   boolean a(akj<T> var1);

   boolean a(Predicate<akj<T>> var1);

   boolean a(awk<T> var1);

   @Deprecated
   boolean a(jj<T> var1);

   Stream<awk<T>> c();

   Either<akj<T>, T> d();

   Optional<akj<T>> e();

   jj.b f();

   boolean a(jm<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jj<T> a(T $$0) {
      return new jj.a<>($$0);
   }

   public static record a<T>(T a) implements jj<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akk $$0) {
         return false;
      }

      @Override
      public boolean a(akj<T> $$0) {
         return false;
      }

      @Override
      public boolean a(awk<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jj<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<akj<T>> $$0) {
         return false;
      }

      @Override
      public Either<akj<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<akj<T>> e() {
         return Optional.empty();
      }

      @Override
      public jj.b f() {
         return jj.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jm<T> $$0) {
         return true;
      }

      @Override
      public Stream<awk<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jj<T> {
      private final jm<T> a;
      private Set<awk<T>> b = Set.of();
      private final jj.c.a c;
      @Nullable
      private akj<T> d;
      @Nullable
      private T e;

      protected c(jj.c.a $$0, jm<T> $$1, @Nullable akj<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jj.c<T> a(jm<T> $$0, akj<T> $$1) {
         return new jj.c<>(jj.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jj.c<T> a(jm<T> $$0, @Nullable T $$1) {
         return new jj.c<>(jj.c.a.b, $$0, null, $$1);
      }

      public akj<T> h() {
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
      public boolean a(akk $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(akj<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(awk<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(jj<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<akj<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jm<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<akj<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<akj<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jj.b f() {
         return jj.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(akj<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jj.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<awk<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<awk<T>> c() {
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
