import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface il<T> {
   T a();

   boolean b();

   boolean a(ajt var1);

   boolean a(ajs<T> var1);

   boolean a(Predicate<ajs<T>> var1);

   boolean a(avr<T> var1);

   @Deprecated
   boolean a(il<T> var1);

   Stream<avr<T>> c();

   Either<ajs<T>, T> d();

   Optional<ajs<T>> e();

   il.b f();

   boolean a(io<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> il<T> a(T $$0) {
      return new il.a<>($$0);
   }

   public static record a<T>(T a) implements il<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ajt $$0) {
         return false;
      }

      @Override
      public boolean a(ajs<T> $$0) {
         return false;
      }

      @Override
      public boolean a(avr<T> $$0) {
         return false;
      }

      @Override
      public boolean a(il<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<ajs<T>> $$0) {
         return false;
      }

      @Override
      public Either<ajs<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ajs<T>> e() {
         return Optional.empty();
      }

      @Override
      public il.b f() {
         return il.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(io<T> $$0) {
         return true;
      }

      @Override
      public Stream<avr<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements il<T> {
      private final io<T> a;
      private Set<avr<T>> b = Set.of();
      private final il.c.a c;
      @Nullable
      private ajs<T> d;
      @Nullable
      private T e;

      protected c(il.c.a $$0, io<T> $$1, @Nullable ajs<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> il.c<T> a(io<T> $$0, ajs<T> $$1) {
         return new il.c<>(il.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> il.c<T> a(io<T> $$0, @Nullable T $$1) {
         return new il.c<>(il.c.a.b, $$0, null, $$1);
      }

      public ajs<T> h() {
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
      public boolean a(ajt $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(ajs<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(avr<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(il<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<ajs<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(io<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ajs<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<ajs<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public il.b f() {
         return il.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ajs<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == il.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<avr<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<avr<T>> c() {
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
