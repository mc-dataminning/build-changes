import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface iv<T> {
   T a();

   boolean b();

   boolean a(akf var1);

   boolean a(ake<T> var1);

   boolean a(Predicate<ake<T>> var1);

   boolean a(awd<T> var1);

   @Deprecated
   boolean a(iv<T> var1);

   Stream<awd<T>> c();

   Either<ake<T>, T> d();

   Optional<ake<T>> e();

   iv.b f();

   boolean a(iy<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> iv<T> a(T $$0) {
      return new iv.a<>($$0);
   }

   public static record a<T>(T a) implements iv<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(akf $$0) {
         return false;
      }

      @Override
      public boolean a(ake<T> $$0) {
         return false;
      }

      @Override
      public boolean a(awd<T> $$0) {
         return false;
      }

      @Override
      public boolean a(iv<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<ake<T>> $$0) {
         return false;
      }

      @Override
      public Either<ake<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ake<T>> e() {
         return Optional.empty();
      }

      @Override
      public iv.b f() {
         return iv.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(iy<T> $$0) {
         return true;
      }

      @Override
      public Stream<awd<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements iv<T> {
      private final iy<T> a;
      private Set<awd<T>> b = Set.of();
      private final iv.c.a c;
      @Nullable
      private ake<T> d;
      @Nullable
      private T e;

      protected c(iv.c.a $$0, iy<T> $$1, @Nullable ake<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> iv.c<T> a(iy<T> $$0, ake<T> $$1) {
         return new iv.c<>(iv.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> iv.c<T> a(iy<T> $$0, @Nullable T $$1) {
         return new iv.c<>(iv.c.a.b, $$0, null, $$1);
      }

      public ake<T> h() {
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
      public boolean a(akf $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(ake<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(awd<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(iv<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<ake<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(iy<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ake<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<ake<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public iv.b f() {
         return iv.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ake<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == iv.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<awd<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<awd<T>> c() {
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
