import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public interface hj<T> extends Iterable<hf<T>> {
   Stream<hf<T>> a();

   int b();

   Either<apy<T>, List<hf<T>>> c();

   Optional<hf<T>> a(art var1);

   hf<T> a(int var1);

   boolean a(hf<T> var1);

   boolean a(hi<T> var1);

   Optional<apy<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> hj.c<T> a(hi<T> $$0, apy<T> $$1) {
      return new hj.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> hj.a<T> a(hf<T>... $$0) {
      return new hj.a<>(List.of($$0));
   }

   static <T> hj.a<T> a(List<? extends hf<T>> $$0) {
      return new hj.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> hj.a<T> a(Function<E, hf<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> hj.a<T> a(Function<E, hf<T>> $$0, List<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends hj.b<T> {
      private final List<hf<T>> a;
      @Nullable
      private Set<hf<T>> b;

      a(List<hf<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<hf<T>> e() {
         return this.a;
      }

      @Override
      public Either<apy<T>, List<hf<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<apy<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(hf<T> $$0) {
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

   public abstract static class b<T> implements hj<T> {
      protected abstract List<hf<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<hf<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<hf<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<hf<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<hf<T>> a(art $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public hf<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(hi<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends hj.b<T> {
      private final hi<T> a;
      private final apy<T> b;
      private List<hf<T>> c = List.of();

      c(hi<T> $$0, apy<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<hf<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public apy<T> f() {
         return this.b;
      }

      @Override
      protected List<hf<T>> e() {
         return this.c;
      }

      @Override
      public Either<apy<T>, List<hf<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<apy<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(hf<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(hi<T> $$0) {
         return this.a.a($$0);
      }
   }
}
