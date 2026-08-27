import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface in<T> {
   T a();

   boolean b();

   boolean a(ajv var1);

   boolean a(aju<T> var1);

   boolean a(Predicate<aju<T>> var1);

   boolean a(avt<T> var1);

   @Deprecated
   boolean a(in<T> var1);

   Stream<avt<T>> c();

   Either<aju<T>, T> d();

   Optional<aju<T>> e();

   in.b f();

   boolean a(iq<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> in<T> a(T $$0) {
      return new in.a<>($$0);
   }

   public static record a<T>(T a) implements in<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ajv $$0) {
         return false;
      }

      @Override
      public boolean a(aju<T> $$0) {
         return false;
      }

      @Override
      public boolean a(avt<T> $$0) {
         return false;
      }

      @Override
      public boolean a(in<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<aju<T>> $$0) {
         return false;
      }

      @Override
      public Either<aju<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aju<T>> e() {
         return Optional.empty();
      }

      @Override
      public in.b f() {
         return in.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(iq<T> $$0) {
         return true;
      }

      @Override
      public Stream<avt<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements in<T> {
      private final iq<T> a;
      private Set<avt<T>> b = Set.of();
      private final in.c.a c;
      @Nullable
      private aju<T> d;
      @Nullable
      private T e;

      protected c(in.c.a $$0, iq<T> $$1, @Nullable aju<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> in.c<T> a(iq<T> $$0, aju<T> $$1) {
         return new in.c<>(in.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> in.c<T> a(iq<T> $$0, @Nullable T $$1) {
         return new in.c<>(in.c.a.b, $$0, null, $$1);
      }

      public aju<T> h() {
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
      public boolean a(ajv $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(aju<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(avt<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(in<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<aju<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(iq<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<aju<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<aju<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public in.b f() {
         return in.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(aju<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == in.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<avt<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<avt<T>> c() {
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
