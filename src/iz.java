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

public interface iz<T> extends Iterable<iv<T>> {
   Stream<iv<T>> a();

   int b();

   Either<awd<T>, List<iv<T>>> c();

   Optional<iv<T>> a(ayd var1);

   iv<T> a(int var1);

   boolean a(iv<T> var1);

   boolean a(iy<T> var1);

   Optional<awd<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> iz.c<T> a(iy<T> $$0, awd<T> $$1) {
      return new iz.c<T>($$0, $$1) {
         @Override
         protected List<iv<T>> e() {
            throw new UnsupportedOperationException("Tag " + this.f() + " can't be dereferenced during construction");
         }
      };
   }

   @SafeVarargs
   static <T> iz.a<T> a(iv<T>... $$0) {
      return new iz.a<>(List.of($$0));
   }

   static <T> iz.a<T> a(List<? extends iv<T>> $$0) {
      return new iz.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> iz.a<T> a(Function<E, iv<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> iz.a<T> a(Function<E, iv<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends iz.b<T> {
      private final List<iv<T>> a;
      @Nullable
      private Set<iv<T>> b;

      a(List<iv<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<iv<T>> e() {
         return this.a;
      }

      @Override
      public Either<awd<T>, List<iv<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<awd<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(iv<T> $$0) {
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
            if ($$0 instanceof iz.a<?> $$1 && this.a.equals($$1.a)) {
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

   public abstract static class b<T> implements iz<T> {
      protected abstract List<iv<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<iv<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<iv<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<iv<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<iv<T>> a(ayd $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public iv<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(iy<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends iz.b<T> {
      private final iy<T> a;
      private final awd<T> b;
      private List<iv<T>> c = List.of();

      c(iy<T> $$0, awd<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<iv<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awd<T> f() {
         return this.b;
      }

      @Override
      protected List<iv<T>> e() {
         return this.c;
      }

      @Override
      public Either<awd<T>, List<iv<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awd<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(iv<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(iy<T> $$0) {
         return this.a.a($$0);
      }
   }
}
