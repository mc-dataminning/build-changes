import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jn<T> {
   T a();

   boolean b();

   boolean a(alc var1);

   boolean a(alb<T> var1);

   boolean a(Predicate<alb<T>> var1);

   boolean a(axj<T> var1);

   @Deprecated
   boolean a(jn<T> var1);

   Stream<axj<T>> c();

   Either<alb<T>, T> d();

   Optional<alb<T>> e();

   jn.b f();

   boolean a(jq<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jn<T> a(T $$0) {
      return new jn.a<>($$0);
   }

   public static record a<T>(T a) implements jn<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(alc $$0) {
         return false;
      }

      @Override
      public boolean a(alb<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axj<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jn<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alb<T>> $$0) {
         return false;
      }

      @Override
      public Either<alb<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alb<T>> e() {
         return Optional.empty();
      }

      @Override
      public jn.b f() {
         return jn.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jq<T> $$0) {
         return true;
      }

      @Override
      public Stream<axj<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jn<T> {
      private final jq<T> a;
      @Nullable
      private Set<axj<T>> b;
      private final jn.c.a c;
      @Nullable
      private alb<T> d;
      @Nullable
      private T e;

      protected c(jn.c.a $$0, jq<T> $$1, @Nullable alb<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jn.c<T> a(jq<T> $$0, alb<T> $$1) {
         return new jn.c<>(jn.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jn.c<T> a(jq<T> $$0, @Nullable T $$1) {
         return new jn.c<>(jn.c.a.b, $$0, null, $$1);
      }

      public alb<T> h() {
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
      public boolean a(alc $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alb<T> $$0) {
         return this.h() == $$0;
      }

      private Set<axj<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(axj<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jn<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alb<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jq<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alb<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alb<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jn.b f() {
         return jn.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alb<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jn.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<axj<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<axj<T>> c() {
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
