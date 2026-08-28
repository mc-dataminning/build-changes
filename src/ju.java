import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public interface ju<T> extends Iterable<jq<T>> {
   Stream<jq<T>> a();

   int b();

   boolean c();

   Either<axt<T>, List<jq<T>>> d();

   Optional<jq<T>> a(azv var1);

   jq<T> a(int var1);

   boolean a(jq<T> var1);

   boolean a(jt<T> var1);

   Optional<axt<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> ju.c<T> a(jt<T> $$0, axt<T> $$1) {
      return new ju.c<T>($$0, $$1) {
         @Override
         protected List<jq<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> ju<T> f() {
      return (ju<T>)ju.a.a;
   }

   @SafeVarargs
   static <T> ju.a<T> a(jq<T>... $$0) {
      return new ju.a<>(List.of($$0));
   }

   static <T> ju.a<T> a(List<? extends jq<T>> $$0) {
      return new ju.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ju.a<T> a(Function<E, jq<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ju.a<T> a(Function<E, jq<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends ju.b<T> {
      static final ju.a<?> a = new ju.a(List.of());
      private final List<jq<T>> b;
      @Nullable
      private Set<jq<T>> c;

      a(List<jq<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jq<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axt<T>, List<jq<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axt<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jq<T> $$0) {
         if (this.c == null) {
            this.c = Set.copyOf(this.b);
         }

         return this.c.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.b + "]";
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ju.a<?> $$1 && this.b.equals($$1.b)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.b.hashCode();
      }
   }

   public abstract static class b<T> implements ju<T> {
      protected abstract List<jq<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jq<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jq<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jq<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jq<T>> a(azv $$0) {
         return ae.b(this.g(), $$0);
      }

      @Override
      public jq<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jt<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ju.b<T> {
      private final jt<T> a;
      private final axt<T> b;
      @Nullable
      private List<jq<T>> c;

      c(jt<T> $$0, axt<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jq<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axt<T> h() {
         return this.b;
      }

      @Override
      protected List<jq<T>> g() {
         if (this.c == null) {
            throw new IllegalStateException("Trying to access unbound tag '" + this.b + "' from registry " + this.a);
         } else {
            return this.c;
         }
      }

      @Override
      public boolean c() {
         return this.c != null;
      }

      @Override
      public Either<axt<T>, List<jq<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axt<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jq<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jt<T> $$0) {
         return this.a.a($$0);
      }
   }
}
