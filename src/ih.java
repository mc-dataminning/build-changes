import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ih<T> {
   T a();

   boolean b();

   boolean a(ahh var1);

   boolean a(ahg<T> var1);

   boolean a(Predicate<ahg<T>> var1);

   boolean a(asx<T> var1);

   @Deprecated
   boolean a(ih<T> var1);

   Stream<asx<T>> c();

   Either<ahg<T>, T> d();

   Optional<ahg<T>> e();

   ih.b f();

   boolean a(ik<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> ih<T> a(T $$0) {
      return new ih.a<>($$0);
   }

   public static record a<T>(T a) implements ih<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ahh $$0) {
         return false;
      }

      @Override
      public boolean a(ahg<T> $$0) {
         return false;
      }

      @Override
      public boolean a(asx<T> $$0) {
         return false;
      }

      @Override
      public boolean a(ih<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<ahg<T>> $$0) {
         return false;
      }

      @Override
      public Either<ahg<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ahg<T>> e() {
         return Optional.empty();
      }

      @Override
      public ih.b f() {
         return ih.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ik<T> $$0) {
         return true;
      }

      @Override
      public Stream<asx<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ih<T> {
      private final ik<T> a;
      private Set<asx<T>> b = Set.of();
      private final ih.c.a c;
      @Nullable
      private ahg<T> d;
      @Nullable
      private T e;

      protected c(ih.c.a $$0, ik<T> $$1, @Nullable ahg<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ih.c<T> a(ik<T> $$0, ahg<T> $$1) {
         return new ih.c<>(ih.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ih.c<T> a(ik<T> $$0, @Nullable T $$1) {
         return new ih.c<>(ih.c.a.b, $$0, null, $$1);
      }

      public ahg<T> h() {
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
      public boolean a(ahh $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(ahg<T> $$0) {
         return this.h() == $$0;
      }

      @Override
      public boolean a(asx<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(ih<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<ahg<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(ik<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ahg<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<ahg<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public ih.b f() {
         return ih.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ahg<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ih.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<asx<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<asx<T>> c() {
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
