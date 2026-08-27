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

public interface ij<T> extends Iterable<ie<T>> {
   Stream<ie<T>> a();

   int b();

   Either<asg<T>, List<ie<T>>> c();

   Optional<ie<T>> a(auf var1);

   ie<T> a(int var1);

   boolean a(ie<T> var1);

   boolean a(ii<T> var1);

   Optional<asg<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ij.c<T> a(ii<T> $$0, asg<T> $$1) {
      return new ij.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> ij.a<T> a(ie<T>... $$0) {
      return new ij.a<>(List.of($$0));
   }

   static <T> ij.a<T> a(List<? extends ie<T>> $$0) {
      return new ij.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ij.a<T> a(Function<E, ie<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ij.a<T> a(Function<E, ie<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends ij.b<T> {
      private final List<ie<T>> a;
      @Nullable
      private Set<ie<T>> b;

      a(List<ie<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<ie<T>> e() {
         return this.a;
      }

      @Override
      public Either<asg<T>, List<ie<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<asg<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ie<T> $$0) {
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

   public abstract static class b<T> implements ij<T> {
      protected abstract List<ie<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<ie<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<ie<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<ie<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<ie<T>> a(auf $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public ie<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(ii<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ij.b<T> {
      private final ii<T> a;
      private final asg<T> b;
      private List<ie<T>> c = List.of();

      c(ii<T> $$0, asg<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ie<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public asg<T> f() {
         return this.b;
      }

      @Override
      protected List<ie<T>> e() {
         return this.c;
      }

      @Override
      public Either<asg<T>, List<ie<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<asg<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ie<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ii<T> $$0) {
         return this.a.a($$0);
      }
   }
}
