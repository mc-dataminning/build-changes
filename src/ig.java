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

public interface ig<T> extends Iterable<ib<T>> {
   Stream<ib<T>> a();

   int b();

   Either<arr<T>, List<ib<T>>> c();

   Optional<ib<T>> a(ato var1);

   ib<T> a(int var1);

   boolean a(ib<T> var1);

   boolean a(ie<T> var1);

   Optional<arr<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ig.c<T> a(ie<T> $$0, arr<T> $$1) {
      return new ig.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> ig.a<T> a(ib<T>... $$0) {
      return new ig.a<>(List.of($$0));
   }

   static <T> ig.a<T> a(List<? extends ib<T>> $$0) {
      return new ig.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ig.a<T> a(Function<E, ib<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ig.a<T> a(Function<E, ib<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends ig.b<T> {
      private final List<ib<T>> a;
      @Nullable
      private Set<ib<T>> b;

      a(List<ib<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<ib<T>> e() {
         return this.a;
      }

      @Override
      public Either<arr<T>, List<ib<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<arr<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ib<T> $$0) {
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

   public abstract static class b<T> implements ig<T> {
      protected abstract List<ib<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<ib<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<ib<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<ib<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<ib<T>> a(ato $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public ib<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(ie<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ig.b<T> {
      private final ie<T> a;
      private final arr<T> b;
      private List<ib<T>> c = List.of();

      c(ie<T> $$0, arr<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ib<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public arr<T> f() {
         return this.b;
      }

      @Override
      protected List<ib<T>> e() {
         return this.c;
      }

      @Override
      public Either<arr<T>, List<ib<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<arr<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ib<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ie<T> $$0) {
         return this.a.a($$0);
      }
   }
}
