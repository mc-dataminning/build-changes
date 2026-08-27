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

public interface hk<T> extends Iterable<hg<T>> {
   Stream<hg<T>> a();

   int b();

   Either<aqd<T>, List<hg<T>>> c();

   Optional<hg<T>> a(arx var1);

   hg<T> a(int var1);

   boolean a(hg<T> var1);

   boolean a(hj<T> var1);

   Optional<aqd<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> hk.c<T> a(hj<T> $$0, aqd<T> $$1) {
      return new hk.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> hk.a<T> a(hg<T>... $$0) {
      return new hk.a<>(List.of($$0));
   }

   static <T> hk.a<T> a(List<? extends hg<T>> $$0) {
      return new hk.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> hk.a<T> a(Function<E, hg<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> hk.a<T> a(Function<E, hg<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends hk.b<T> {
      private final List<hg<T>> a;
      @Nullable
      private Set<hg<T>> b;

      a(List<hg<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<hg<T>> e() {
         return this.a;
      }

      @Override
      public Either<aqd<T>, List<hg<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aqd<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(hg<T> $$0) {
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

   public abstract static class b<T> implements hk<T> {
      protected abstract List<hg<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<hg<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<hg<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<hg<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<hg<T>> a(arx $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public hg<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(hj<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends hk.b<T> {
      private final hj<T> a;
      private final aqd<T> b;
      private List<hg<T>> c = List.of();

      c(hj<T> $$0, aqd<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<hg<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public aqd<T> f() {
         return this.b;
      }

      @Override
      protected List<hg<T>> e() {
         return this.c;
      }

      @Override
      public Either<aqd<T>, List<hg<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<aqd<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(hg<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(hj<T> $$0) {
         return this.a.a($$0);
      }
   }
}
