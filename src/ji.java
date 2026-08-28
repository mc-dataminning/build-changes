import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ji<T> {
   T a();

   boolean b();

   boolean a(alf var1);

   boolean a(ale<T> var1);

   boolean a(Predicate<ale<T>> var1);

   boolean a(axf<T> var1);

   @Deprecated
   boolean a(ji<T> var1);

   Stream<axf<T>> c();

   Either<ale<T>, T> d();

   Optional<ale<T>> e();

   ji.b f();

   boolean a(jl<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> ji<T> a(T $$0) {
      return new ji.a<>($$0);
   }

   public static record a<T>(T a) implements ji<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(alf $$0) {
         return false;
      }

      @Override
      public boolean a(ale<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axf<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ji<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<ale<T>> $$0) {
         return false;
      }

      @Override
      public Either<ale<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ale<T>> e() {
         return Optional.empty();
      }

      @Override
      public ji.b f() {
         return ji.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jl<T> $$0) {
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

   public static class c<T> implements ji<T> {
      private final jl<T> a;
      private Set<axf<T>> b = Set.of();
      private final ji.c.a c;
      @Nullable
      private ale<T> d;
      @Nullable
      private T e;

      protected c(ji.c.a $$0, jl<T> $$1, @Nullable ale<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ji.c<T> a(jl<T> $$0, ale<T> $$1) {
         return new ji.c<>(ji.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ji.c<T> a(jl<T> $$0, @Nullable T $$1) {
         return new ji.c<>(ji.c.a.b, $$0, null, $$1);
      }

      public ale<T> h() {
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
      public boolean a(alf $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(ale<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(axf<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(ji<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<ale<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jl<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ale<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<ale<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public ji.b f() {
         return ji.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ale<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ji.c.a.b && this.e != $$0) {
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
