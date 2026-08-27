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

public interface ir<T> extends Iterable<in<T>> {
   Stream<in<T>> a();

   int b();

   Either<avt<T>, List<in<T>>> c();

   Optional<in<T>> a(axt var1);

   in<T> a(int var1);

   boolean a(in<T> var1);

   boolean a(iq<T> var1);

   Optional<avt<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ir.c<T> a(iq<T> $$0, avt<T> $$1) {
      return new ir.c<T>($$0, $$1) {
         @Override
         protected List<in<T>> e() {
            throw new UnsupportedOperationException("Tag " + this.f() + " can't be dereferenced during construction");
         }
      };
   }

   @SafeVarargs
   static <T> ir.a<T> a(in<T>... $$0) {
      return new ir.a<>(List.of($$0));
   }

   static <T> ir.a<T> a(List<? extends in<T>> $$0) {
      return new ir.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ir.a<T> a(Function<E, in<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ir.a<T> a(Function<E, in<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends ir.b<T> {
      private final List<in<T>> a;
      @Nullable
      private Set<in<T>> b;

      a(List<in<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<in<T>> e() {
         return this.a;
      }

      @Override
      public Either<avt<T>, List<in<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<avt<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(in<T> $$0) {
         if (this.b == null) {
            this.b = Set.copyOf(this.a);
         }

         return this.b.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.a + "]";
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ir.a<?> $$1 && this.a.equals($$1.a)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.a.hashCode();
      }
   }

   public abstract static class b<T> implements ir<T> {
      protected abstract List<in<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<in<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<in<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<in<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<in<T>> a(axt $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public in<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(iq<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ir.b<T> {
      private final iq<T> a;
      private final avt<T> b;
      private List<in<T>> c = List.of();

      c(iq<T> $$0, avt<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<in<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public avt<T> f() {
         return this.b;
      }

      @Override
      protected List<in<T>> e() {
         return this.c;
      }

      @Override
      public Either<avt<T>, List<in<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<avt<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(in<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(iq<T> $$0) {
         return this.a.a($$0);
      }
   }
}
