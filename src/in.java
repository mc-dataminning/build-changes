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

public interface in<T> extends Iterable<ij<T>> {
   Stream<ij<T>> a();

   int b();

   Either<aup<T>, List<ij<T>>> c();

   Optional<ij<T>> a(awp var1);

   ij<T> a(int var1);

   boolean a(ij<T> var1);

   boolean a(im<T> var1);

   Optional<aup<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> in.c<T> a(im<T> $$0, aup<T> $$1) {
      return new in.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> in.a<T> a(ij<T>... $$0) {
      return new in.a<>(List.of($$0));
   }

   static <T> in.a<T> a(List<? extends ij<T>> $$0) {
      return new in.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> in.a<T> a(Function<E, ij<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> in.a<T> a(Function<E, ij<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends in.b<T> {
      private final List<ij<T>> a;
      @Nullable
      private Set<ij<T>> b;

      a(List<ij<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<ij<T>> e() {
         return this.a;
      }

      @Override
      public Either<aup<T>, List<ij<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aup<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ij<T> $$0) {
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

   public abstract static class b<T> implements in<T> {
      protected abstract List<ij<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<ij<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<ij<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<ij<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<ij<T>> a(awp $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public ij<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(im<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends in.b<T> {
      private final im<T> a;
      private final aup<T> b;
      private List<ij<T>> c = List.of();

      c(im<T> $$0, aup<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ij<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public aup<T> f() {
         return this.b;
      }

      @Override
      protected List<ij<T>> e() {
         return this.c;
      }

      @Override
      public Either<aup<T>, List<ij<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<aup<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ij<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(im<T> $$0) {
         return this.a.a($$0);
      }
   }
}
