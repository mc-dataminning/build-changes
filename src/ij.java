import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ij<T> {
   T a();

   boolean b();

   boolean a(aiy var1);

   boolean a(aix<T> var1);

   boolean a(Predicate<aix<T>> var1);

   boolean a(auo<T> var1);

   @Deprecated
   boolean a(ij<T> var1);

   Stream<auo<T>> c();

   Either<aix<T>, T> d();

   Optional<aix<T>> e();

   ij.b f();

   boolean a(im<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> ij<T> a(T $$0) {
      return new ij.a<>($$0);
   }

   public static record a<T>(T a) implements ij<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(aiy $$0) {
         return false;
      }

      @Override
      public boolean a(aix<T> $$0) {
         return false;
      }

      @Override
      public boolean a(auo<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ij<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<aix<T>> $$0) {
         return false;
      }

      @Override
      public Either<aix<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aix<T>> e() {
         return Optional.empty();
      }

      @Override
      public ij.b f() {
         return ij.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(im<T> $$0) {
         return true;
      }

      @Override
      public Stream<auo<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ij<T> {
      private final im<T> a;
      private Set<auo<T>> b = Set.of();
      private final ij.c.a c;
      @Nullable
      private aix<T> d;
      @Nullable
      private T e;

      protected c(ij.c.a $$0, im<T> $$1, @Nullable aix<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ij.c<T> a(im<T> $$0, aix<T> $$1) {
         return new ij.c<>(ij.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ij.c<T> a(im<T> $$0, @Nullable T $$1) {
         return new ij.c<>(ij.c.a.b, $$0, null, $$1);
      }

      public aix<T> h() {
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
      public boolean a(aiy $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(aix<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(auo<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(ij<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<aix<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(im<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aix<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<aix<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public ij.b f() {
         return ij.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aix<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ij.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<auo<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<auo<T>> c() {
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
