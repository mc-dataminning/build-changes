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

public interface hi<T> extends Iterable<he<T>> {
   Stream<he<T>> a();

   int b();

   Either<aqh<T>, List<he<T>>> c();

   Optional<he<T>> a(asc var1);

   he<T> a(int var1);

   boolean a(he<T> var1);

   boolean a(hh<T> var1);

   Optional<aqh<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> hi.c<T> a(hh<T> $$0, aqh<T> $$1) {
      return new hi.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> hi.a<T> a(he<T>... $$0) {
      return new hi.a<>(List.of($$0));
   }

   static <T> hi.a<T> a(List<? extends he<T>> $$0) {
      return new hi.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> hi.a<T> a(Function<E, he<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> hi.a<T> a(Function<E, he<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends hi.b<T> {
      private final List<he<T>> a;
      @Nullable
      private Set<he<T>> b;

      a(List<he<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<he<T>> e() {
         return this.a;
      }

      @Override
      public Either<aqh<T>, List<he<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aqh<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(he<T> $$0) {
         if (this.b == null) {
            this.b = Set.copyOf(this.a);
         }

         return this.b.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.a + "]";
      }
   }

   public abstract static class b<T> implements hi<T> {
      protected abstract List<he<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<he<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<he<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<he<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<he<T>> a(asc $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public he<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(hh<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends hi.b<T> {
      private final hh<T> a;
      private final aqh<T> b;
      private List<he<T>> c = List.of();

      c(hh<T> $$0, aqh<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<he<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public aqh<T> f() {
         return this.b;
      }

      @Override
      protected List<he<T>> e() {
         return this.c;
      }

      @Override
      public Either<aqh<T>, List<he<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<aqh<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(he<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(hh<T> $$0) {
         return this.a.a($$0);
      }
   }
}
