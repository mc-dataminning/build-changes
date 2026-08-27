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

public interface ik<T> extends Iterable<ig<T>> {
   Stream<ig<T>> a();

   int b();

   Either<arz<T>, List<ig<T>>> c();

   Optional<ig<T>> a(atw var1);

   ig<T> a(int var1);

   boolean a(ig<T> var1);

   boolean a(ij<T> var1);

   Optional<arz<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ik.c<T> a(ij<T> $$0, arz<T> $$1) {
      return new ik.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> ik.a<T> a(ig<T>... $$0) {
      return new ik.a<>(List.of($$0));
   }

   static <T> ik.a<T> a(List<? extends ig<T>> $$0) {
      return new ik.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ik.a<T> a(Function<E, ig<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ik.a<T> a(Function<E, ig<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends ik.b<T> {
      private final List<ig<T>> a;
      @Nullable
      private Set<ig<T>> b;

      a(List<ig<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<ig<T>> e() {
         return this.a;
      }

      @Override
      public Either<arz<T>, List<ig<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<arz<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ig<T> $$0) {
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

   public abstract static class b<T> implements ik<T> {
      protected abstract List<ig<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<ig<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<ig<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<ig<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<ig<T>> a(atw $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public ig<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(ij<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ik.b<T> {
      private final ij<T> a;
      private final arz<T> b;
      private List<ig<T>> c = List.of();

      c(ij<T> $$0, arz<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ig<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public arz<T> f() {
         return this.b;
      }

      @Override
      protected List<ig<T>> e() {
         return this.c;
      }

      @Override
      public Either<arz<T>, List<ig<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<arz<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ig<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ij<T> $$0) {
         return this.a.a($$0);
      }
   }
}
