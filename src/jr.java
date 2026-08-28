import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jr<T> {
   T a();

   boolean b();

   boolean a(akv var1);

   boolean a(aku<T> var1);

   boolean a(Predicate<aku<T>> var1);

   boolean a(axf<T> var1);

   @Deprecated
   boolean a(jr<T> var1);

   Stream<axf<T>> c();

   Either<aku<T>, T> d();

   Optional<aku<T>> e();

   jr.b f();

   boolean a(ju<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jr<T> a(T $$0) {
      return new jr.a<>($$0);
   }

   public static record a<T>(T a) implements jr<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akv $$0) {
         return false;
      }

      @Override
      public boolean a(aku<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axf<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jr<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<aku<T>> $$0) {
         return false;
      }

      @Override
      public Either<aku<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aku<T>> e() {
         return Optional.empty();
      }

      @Override
      public jr.b f() {
         return jr.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ju<T> $$0) {
         return true;
      }

      @Override
      public Stream<axf<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jr<T> {
      private final ju<T> a;
      @Nullable
      private Set<axf<T>> b;
      private final jr.c.a c;
      @Nullable
      private aku<T> d;
      @Nullable
      private T e;

      protected c(jr.c.a $$0, ju<T> $$1, @Nullable aku<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jr.c<T> a(ju<T> $$0, aku<T> $$1) {
         return new jr.c<>(jr.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jr.c<T> a(ju<T> $$0, @Nullable T $$1) {
         return new jr.c<>(jr.c.a.b, $$0, null, $$1);
      }

      public aku<T> h() {
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
      public boolean a(akv $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(aku<T> $$0) {
         return this.h() == $$0;
      }

      private Set<axf<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(axf<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jr<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<aku<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(ju<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aku<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<aku<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jr.b f() {
         return jr.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aku<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jr.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<axf<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<axf<T>> c() {
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
