import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface je<T> {
   T a();

   boolean b();

   boolean a(alg var1);

   boolean a(alf<T> var1);

   boolean a(Predicate<alf<T>> var1);

   boolean a(axr<T> var1);

   @Deprecated
   boolean a(je<T> var1);

   Stream<axr<T>> c();

   Either<alf<T>, T> d();

   Optional<alf<T>> e();

   je.b f();

   boolean a(jh<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> je<T> a(T $$0) {
      return new je.a<>($$0);
   }

   public static record a<T>(T a) implements je<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(alg $$0) {
         return false;
      }

      @Override
      public boolean a(alf<T> $$0) {
         return false;
      }

      @Override
      public boolean a(axr<T> $$0) {
         return false;
      }

      @Override
      public boolean a(je<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<alf<T>> $$0) {
         return false;
      }

      @Override
      public Either<alf<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<alf<T>> e() {
         return Optional.empty();
      }

      @Override
      public je.b f() {
         return je.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jh<T> $$0) {
         return true;
      }

      @Override
      public Stream<axr<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements je<T> {
      private final jh<T> a;
      @Nullable
      private Set<axr<T>> b;
      private final je.c.a c;
      @Nullable
      private alf<T> d;
      @Nullable
      private T e;

      protected c(je.c.a $$0, jh<T> $$1, @Nullable alf<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> je.c<T> a(jh<T> $$0, alf<T> $$1) {
         return new je.c<>(je.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> je.c<T> a(jh<T> $$0, @Nullable T $$1) {
         return new je.c<>(je.c.a.b, $$0, null, $$1);
      }

      public alf<T> h() {
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
      public boolean a(alg $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(alf<T> $$0) {
         return this.h() == $$0;
      }

      private Set<axr<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(axr<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(je<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<alf<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jh<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<alf<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<alf<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public je.b f() {
         return je.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(alf<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == je.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<axr<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<axr<T>> c() {
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
