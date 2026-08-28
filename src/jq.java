import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jq<T> {
   T a();

   boolean b();

   boolean a(all var1);

   boolean a(alk<T> var1);

   boolean a(Predicate<alk<T>> var1);

   boolean a(axt<T> var1);

   @Deprecated
   boolean a(jq<T> var1);

   Stream<axt<T>> c();

   Either<alk<T>, T> d();

   Optional<alk<T>> e();

   jq.b f();

   boolean a(jt<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jq<T> a(T $$0) {
      return new jq.a<>($$0);
   }

   public static record a<T>(T a) implements jq<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(all $$0) {
         return false;
      }

      @Override
      public boolean a(alk<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axt<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jq<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alk<T>> $$0) {
         return false;
      }

      @Override
      public Either<alk<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alk<T>> e() {
         return Optional.empty();
      }

      @Override
      public jq.b f() {
         return jq.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jt<T> $$0) {
         return true;
      }

      @Override
      public Stream<axt<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jq<T> {
      private final jt<T> a;
      @Nullable
      private Set<axt<T>> b;
      private final jq.c.a c;
      @Nullable
      private alk<T> d;
      @Nullable
      private T e;

      protected c(jq.c.a $$0, jt<T> $$1, @Nullable alk<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jq.c<T> a(jt<T> $$0, alk<T> $$1) {
         return new jq.c<>(jq.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jq.c<T> a(jt<T> $$0, @Nullable T $$1) {
         return new jq.c<>(jq.c.a.b, $$0, null, $$1);
      }

      public alk<T> h() {
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
      public boolean a(all $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alk<T> $$0) {
         return this.h() == $$0;
      }

      private Set<axt<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(axt<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jq<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alk<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jt<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alk<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alk<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jq.b f() {
         return jq.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alk<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jq.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<axt<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<axt<T>> c() {
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
