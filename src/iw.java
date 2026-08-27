import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface iw<T> {
   T a();

   boolean b();

   boolean a(akh var1);

   boolean a(akg<T> var1);

   boolean a(Predicate<akg<T>> var1);

   boolean a(awg<T> var1);

   @Deprecated
   boolean a(iw<T> var1);

   Stream<awg<T>> c();

   Either<akg<T>, T> d();

   Optional<akg<T>> e();

   iw.b f();

   boolean a(iz<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> iw<T> a(T $$0) {
      return new iw.a<>($$0);
   }

   public static record a<T>(T a) implements iw<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akh $$0) {
         return false;
      }

      @Override
      public boolean a(akg<T> $$0) {
         return false;
      }

      @Override
      public boolean a(awg<T> $$0) {
         return false;
      }

      @Override
      public boolean a(iw<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<akg<T>> $$0) {
         return false;
      }

      @Override
      public Either<akg<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<akg<T>> e() {
         return Optional.empty();
      }

      @Override
      public iw.b f() {
         return iw.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(iz<T> $$0) {
         return true;
      }

      @Override
      public Stream<awg<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements iw<T> {
      private final iz<T> a;
      private Set<awg<T>> b = Set.of();
      private final iw.c.a c;
      @Nullable
      private akg<T> d;
      @Nullable
      private T e;

      protected c(iw.c.a $$0, iz<T> $$1, @Nullable akg<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> iw.c<T> a(iz<T> $$0, akg<T> $$1) {
         return new iw.c<>(iw.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> iw.c<T> a(iz<T> $$0, @Nullable T $$1) {
         return new iw.c<>(iw.c.a.b, $$0, null, $$1);
      }

      public akg<T> h() {
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
      public boolean a(akh $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(akg<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(awg<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(iw<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<akg<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(iz<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<akg<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<akg<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public iw.b f() {
         return iw.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(akg<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == iw.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<awg<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<awg<T>> c() {
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
