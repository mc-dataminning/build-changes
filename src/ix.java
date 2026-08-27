import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ix<T> {
   T a();

   boolean b();

   boolean a(akn var1);

   boolean a(akm<T> var1);

   boolean a(Predicate<akm<T>> var1);

   boolean a(awm<T> var1);

   @Deprecated
   boolean a(ix<T> var1);

   Stream<awm<T>> c();

   Either<akm<T>, T> d();

   Optional<akm<T>> e();

   ix.b f();

   boolean a(ja<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> ix<T> a(T $$0) {
      return new ix.a<>($$0);
   }

   public static record a<T>(T a) implements ix<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akn $$0) {
         return false;
      }

      @Override
      public boolean a(akm<T> $$0) {
         return false;
      }

      @Override
      public boolean a(awm<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ix<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<akm<T>> $$0) {
         return false;
      }

      @Override
      public Either<akm<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<akm<T>> e() {
         return Optional.empty();
      }

      @Override
      public ix.b f() {
         return ix.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ja<T> $$0) {
         return true;
      }

      @Override
      public Stream<awm<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ix<T> {
      private final ja<T> a;
      private Set<awm<T>> b = Set.of();
      private final ix.c.a c;
      @Nullable
      private akm<T> d;
      @Nullable
      private T e;

      protected c(ix.c.a $$0, ja<T> $$1, @Nullable akm<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ix.c<T> a(ja<T> $$0, akm<T> $$1) {
         return new ix.c<>(ix.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ix.c<T> a(ja<T> $$0, @Nullable T $$1) {
         return new ix.c<>(ix.c.a.b, $$0, null, $$1);
      }

      public akm<T> h() {
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
      public boolean a(akn $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(akm<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(awm<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(ix<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<akm<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(ja<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<akm<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<akm<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public ix.b f() {
         return ix.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(akm<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ix.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<awm<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<awm<T>> c() {
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
