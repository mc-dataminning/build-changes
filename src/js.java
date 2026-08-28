import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface js<T> {
   T a();

   boolean b();

   boolean a(ald var1);

   boolean a(alc<T> var1);

   boolean a(Predicate<alc<T>> var1);

   boolean a(axp<T> var1);

   @Deprecated
   boolean a(js<T> var1);

   Stream<axp<T>> c();

   Either<alc<T>, T> d();

   Optional<alc<T>> e();

   js.b f();

   boolean a(jv<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> js<T> a(T $$0) {
      return new js.a<>($$0);
   }

   public static record a<T>(T a) implements js<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ald $$0) {
         return false;
      }

      @Override
      public boolean a(alc<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axp<T> $$0) {
         return false;
      }

      @Override
      public boolean a(js<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alc<T>> $$0) {
         return false;
      }

      @Override
      public Either<alc<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alc<T>> e() {
         return Optional.empty();
      }

      @Override
      public js.b f() {
         return js.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jv<T> $$0) {
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

   public static class c<T> implements js<T> {
      private final jv<T> a;
      @Nullable
      private Set<axp<T>> b;
      private final js.c.a c;
      @Nullable
      private alc<T> d;
      @Nullable
      private T e;

      protected c(js.c.a $$0, jv<T> $$1, @Nullable alc<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> js.c<T> a(jv<T> $$0, alc<T> $$1) {
         return new js.c<>(js.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> js.c<T> a(jv<T> $$0, @Nullable T $$1) {
         return new js.c<>(js.c.a.b, $$0, null, $$1);
      }

      public alc<T> h() {
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
      public boolean a(ald $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alc<T> $$0) {
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
      public boolean a(js<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alc<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jv<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alc<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alc<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public js.b f() {
         return js.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alc<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == js.c.a.b && this.e != $$0) {
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
