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

public interface ip<T> extends Iterable<il<T>> {
   Stream<il<T>> a();

   int b();

   Either<avd<T>, List<il<T>>> c();

   Optional<il<T>> a(axd var1);

   il<T> a(int var1);

   boolean a(il<T> var1);

   boolean a(io<T> var1);

   Optional<avd<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> ip.c<T> a(io<T> $$0, avd<T> $$1) {
      return new ip.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> ip.a<T> a(il<T>... $$0) {
      return new ip.a<>(List.of($$0));
   }

   static <T> ip.a<T> a(List<? extends il<T>> $$0) {
      return new ip.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> ip.a<T> a(Function<E, il<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> ip.a<T> a(Function<E, il<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends ip.b<T> {
      private final List<il<T>> a;
      @Nullable
      private Set<il<T>> b;

      a(List<il<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<il<T>> e() {
         return this.a;
      }

      @Override
      public Either<avd<T>, List<il<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<avd<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(il<T> $$0) {
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

   public abstract static class b<T> implements ip<T> {
      protected abstract List<il<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<il<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<il<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<il<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<il<T>> a(axd $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public il<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(io<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends ip.b<T> {
      private final io<T> a;
      private final avd<T> b;
      private List<il<T>> c = List.of();

      c(io<T> $$0, avd<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<il<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public avd<T> f() {
         return this.b;
      }

      @Override
      protected List<il<T>> e() {
         return this.c;
      }

      @Override
      public Either<avd<T>, List<il<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<avd<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(il<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(io<T> $$0) {
         return this.a.a($$0);
      }
   }
}
