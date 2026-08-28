import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jg<T> {
   T a();

   boolean b();

   boolean a(alr var1);

   boolean a(alq<T> var1);

   boolean a(Predicate<alq<T>> var1);

   boolean a(ayc<T> var1);

   @Deprecated
   boolean a(jg<T> var1);

   Stream<ayc<T>> c();

   Either<alq<T>, T> d();

   Optional<alq<T>> e();

   jg.b f();

   boolean a(jj<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jg<T> a(T $$0) {
      return new jg.a<>($$0);
   }

   public static record a<T>(T a) implements jg<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(alr $$0) {
         return false;
      }

      @Override
      public boolean a(alq<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ayc<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jg<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alq<T>> $$0) {
         return false;
      }

      @Override
      public Either<alq<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alq<T>> e() {
         return Optional.empty();
      }

      @Override
      public jg.b f() {
         return jg.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jj<T> $$0) {
         return true;
      }

      @Override
      public Stream<ayc<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jg<T> {
      private final jj<T> a;
      @Nullable
      private Set<ayc<T>> b;
      private final jg.c.a c;
      @Nullable
      private alq<T> d;
      @Nullable
      private T e;

      protected c(jg.c.a $$0, jj<T> $$1, @Nullable alq<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jg.c<T> a(jj<T> $$0, alq<T> $$1) {
         return new jg.c<>(jg.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jg.c<T> a(jj<T> $$0, @Nullable T $$1) {
         return new jg.c<>(jg.c.a.b, $$0, null, $$1);
      }

      public alq<T> h() {
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
      public boolean a(alr $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alq<T> $$0) {
         return this.h() == $$0;
      }

      private Set<ayc<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(ayc<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jg<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alq<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jj<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alq<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alq<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jg.b f() {
         return jg.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alq<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jg.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<ayc<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<ayc<T>> c() {
         return this.i().stream();
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
