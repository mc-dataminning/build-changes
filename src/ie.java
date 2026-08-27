import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ie<T> {
   T a();

   boolean b();

   boolean a(agt var1);

   boolean a(ags<T> var1);

   boolean a(Predicate<ags<T>> var1);

   boolean a(asg<T> var1);

   Stream<asg<T>> c();

   Either<ags<T>, T> d();

   Optional<ags<T>> e();

   ie.b f();

   boolean a(ii<T> var1);

   static <T> ie<T> a(T $$0) {
      return new ie.a<>($$0);
   }

   public static record a<T>(T a) implements ie<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(agt $$0) {
         return false;
      }

      @Override
      public boolean a(ags<T> $$0) {
         return false;
      }

      @Override
      public boolean a(asg<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<ags<T>> $$0) {
         return false;
      }

      @Override
      public Either<ags<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<ags<T>> e() {
         return Optional.empty();
      }

      @Override
      public ie.b f() {
         return ie.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ii<T> $$0) {
         return true;
      }

      @Override
      public Stream<asg<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ie<T> {
      private final ii<T> a;
      private Set<asg<T>> b = Set.of();
      private final ie.c.a c;
      @Nullable
      private ags<T> d;
      @Nullable
      private T e;

      protected c(ie.c.a $$0, ii<T> $$1, @Nullable ags<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ie.c<T> a(ii<T> $$0, ags<T> $$1) {
         return new ie.c<>(ie.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ie.c<T> a(ii<T> $$0, @Nullable T $$1) {
         return new ie.c<>(ie.c.a.b, $$0, null, $$1);
      }

      public ags<T> g() {
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
      public boolean a(agt $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(ags<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(asg<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<ags<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(ii<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<ags<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<ags<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public ie.b f() {
         return ie.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(ags<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == ie.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<asg<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<asg<T>> c() {
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
