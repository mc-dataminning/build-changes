import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface hg<T> {
   T a();

   boolean b();

   boolean a(aeu var1);

   boolean a(aet<T> var1);

   boolean a(Predicate<aet<T>> var1);

   boolean a(aqd<T> var1);

   Stream<aqd<T>> c();

   Either<aet<T>, T> d();

   Optional<aet<T>> e();

   hg.b f();

   boolean a(hj<T> var1);

   static <T> hg<T> a(T $$0) {
      return new hg.a<>($$0);
   }

   public static record a<T>(T a) implements hg<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(aeu $$0) {
         return false;
      }

      @Override
      public boolean a(aet<T> $$0) {
         return false;
      }

      @Override
      public boolean a(aqd<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<aet<T>> $$0) {
         return false;
      }

      @Override
      public Either<aet<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aet<T>> e() {
         return Optional.empty();
      }

      @Override
      public hg.b f() {
         return hg.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(hj<T> $$0) {
         return true;
      }

      @Override
      public Stream<aqd<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements hg<T> {
      private final hj<T> a;
      private Set<aqd<T>> b = Set.of();
      private final hg.c.a c;
      @Nullable
      private aet<T> d;
      @Nullable
      private T e;

      private c(hg.c.a $$0, hj<T> $$1, @Nullable aet<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> hg.c<T> a(hj<T> $$0, aet<T> $$1) {
         return new hg.c<>(hg.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> hg.c<T> a(hj<T> $$0, @Nullable T $$1) {
         return new hg.c<>(hg.c.a.b, $$0, null, $$1);
      }

      public aet<T> g() {
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
      public boolean a(aeu $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(aet<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(aqd<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<aet<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(hj<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aet<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<aet<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public hg.b f() {
         return hg.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aet<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      void b(T $$0) {
         if (this.c == hg.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<aqd<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<aqd<T>> c() {
         return this.b.stream();
      }

      @Override
      public String toString() {
         return "Reference{" + this.d + "=" + this.e + "}";
      }

      static enum a {
         a,
         b;
      }
   }
}
