import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ih<T> {
   T a();

   boolean b();

   boolean a(ahd var1);

   boolean a(ahc<T> var1);

   boolean a(Predicate<ahc<T>> var1);

   boolean a(asq<T> var1);

   Stream<asq<T>> c();

   Either<ahc<T>, T> d();

   Optional<ahc<T>> e();

   ih.b f();

   boolean a(ik<T> var1);

   static <T> ih<T> a(T $$0) {
      return new ih.a<>($$0);
   }

   public static record a<T>(T a) implements ih<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ahd $$0) {
         return false;
      }

      @Override
      public boolean a(ahc<T> $$0) {
         return false;
      }

      @Override
      public boolean a(asq<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<ahc<T>> $$0) {
         return false;
      }

      @Override
      public Either<ahc<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ahc<T>> e() {
         return Optional.empty();
      }

      @Override
      public ih.b f() {
         return ih.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ik<T> $$0) {
         return true;
      }

      @Override
      public Stream<asq<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ih<T> {
      private final ik<T> a;
      private Set<asq<T>> b = Set.of();
      private final ih.c.a c;
      @Nullable
      private ahc<T> d;
      @Nullable
      private T e;

      protected c(ih.c.a $$0, ik<T> $$1, @Nullable ahc<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ih.c<T> a(ik<T> $$0, ahc<T> $$1) {
         return new ih.c<>(ih.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ih.c<T> a(ik<T> $$0, @Nullable T $$1) {
         return new ih.c<>(ih.c.a.b, $$0, null, $$1);
      }

      public ahc<T> g() {
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
      public boolean a(ahd $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(ahc<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(asq<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<ahc<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(ik<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ahc<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<ahc<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public ih.b f() {
         return ih.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ahc<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ih.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<asq<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<asq<T>> c() {
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
