import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ig<T> {
   T a();

   boolean b();

   boolean a(agm var1);

   boolean a(agl<T> var1);

   boolean a(Predicate<agl<T>> var1);

   boolean a(arz<T> var1);

   Stream<arz<T>> c();

   Either<agl<T>, T> d();

   Optional<agl<T>> e();

   ig.b f();

   boolean a(ij<T> var1);

   static <T> ig<T> a(T $$0) {
      return new ig.a<>($$0);
   }

   public static record a<T>(T a) implements ig<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(agm $$0) {
         return false;
      }

      @Override
      public boolean a(agl<T> $$0) {
         return false;
      }

      @Override
      public boolean a(arz<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<agl<T>> $$0) {
         return false;
      }

      @Override
      public Either<agl<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<agl<T>> e() {
         return Optional.empty();
      }

      @Override
      public ig.b f() {
         return ig.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(ij<T> $$0) {
         return true;
      }

      @Override
      public Stream<arz<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements ig<T> {
      private final ij<T> a;
      private Set<arz<T>> b = Set.of();
      private final ig.c.a c;
      @Nullable
      private agl<T> d;
      @Nullable
      private T e;

      private c(ig.c.a $$0, ij<T> $$1, @Nullable agl<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> ig.c<T> a(ij<T> $$0, agl<T> $$1) {
         return new ig.c<>(ig.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> ig.c<T> a(ij<T> $$0, @Nullable T $$1) {
         return new ig.c<>(ig.c.a.b, $$0, null, $$1);
      }

      public agl<T> g() {
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
      public boolean a(agm $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(agl<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(arz<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<agl<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(ij<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<agl<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<agl<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public ig.b f() {
         return ig.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(agl<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      void b(T $$0) {
         if (this.c == ig.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<arz<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<arz<T>> c() {
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
