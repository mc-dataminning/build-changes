import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jp<T> {
   T a();

   boolean b();

   boolean a(alh var1);

   boolean a(alg<T> var1);

   boolean a(Predicate<alg<T>> var1);

   boolean a(axp<T> var1);

   @Deprecated
   boolean a(jp<T> var1);

   Stream<axp<T>> c();

   Either<alg<T>, T> d();

   Optional<alg<T>> e();

   jp.b f();

   boolean a(js<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jp<T> a(T $$0) {
      return new jp.a<>($$0);
   }

   public static record a<T>(T a) implements jp<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(alh $$0) {
         return false;
      }

      @Override
      public boolean a(alg<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axp<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jp<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alg<T>> $$0) {
         return false;
      }

      @Override
      public Either<alg<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alg<T>> e() {
         return Optional.empty();
      }

      @Override
      public jp.b f() {
         return jp.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(js<T> $$0) {
         return true;
      }

      @Override
      public Stream<axp<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jp<T> {
      private final js<T> a;
      @Nullable
      private Set<axp<T>> b;
      private final jp.c.a c;
      @Nullable
      private alg<T> d;
      @Nullable
      private T e;

      protected c(jp.c.a $$0, js<T> $$1, @Nullable alg<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jp.c<T> a(js<T> $$0, alg<T> $$1) {
         return new jp.c<>(jp.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jp.c<T> a(js<T> $$0, @Nullable T $$1) {
         return new jp.c<>(jp.c.a.b, $$0, null, $$1);
      }

      public alg<T> h() {
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
      public boolean a(alh $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alg<T> $$0) {
         return this.h() == $$0;
      }

      private Set<axp<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(axp<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jp<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alg<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(js<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alg<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alg<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jp.b f() {
         return jp.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alg<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jp.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<axp<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<axp<T>> c() {
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
