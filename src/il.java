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

public interface il<T> extends Iterable<ih<T>> {
   Stream<ih<T>> a();

   int b();

   Either<asq<T>, List<ih<T>>> c();

   Optional<ih<T>> a(aup var1);

   ih<T> a(int var1);

   boolean a(ih<T> var1);

   boolean a(ik<T> var1);

   Optional<asq<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> il.c<T> a(ik<T> $$0, asq<T> $$1) {
      return new il.c<>($$0, $$1);
   }

   @SafeVarargs
   static <T> il.a<T> a(ih<T>... $$0) {
      return new il.a<>(List.of($$0));
   }

   static <T> il.a<T> a(List<? extends ih<T>> $$0) {
      return new il.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> il.a<T> a(Function<E, ih<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> il.a<T> a(Function<E, ih<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends il.b<T> {
      private final List<ih<T>> a;
      @Nullable
      private Set<ih<T>> b;

      a(List<ih<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<ih<T>> e() {
         return this.a;
      }

      @Override
      public Either<asq<T>, List<ih<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public Optional<asq<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ih<T> $$0) {
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

   public abstract static class b<T> implements il<T> {
      protected abstract List<ih<T>> e();

      @Override
      public int b() {
         return this.e().size();
      }

      @Override
      public Spliterator<ih<T>> spliterator() {
         return this.e().spliterator();
      }

      @Override
      public Iterator<ih<T>> iterator() {
         return this.e().iterator();
      }

      @Override
      public Stream<ih<T>> a() {
         return this.e().stream();
      }

      @Override
      public Optional<ih<T>> a(aup $$0) {
         return ac.b(this.e(), $$0);
      }

      @Override
      public ih<T> a(int $$0) {
         return this.e().get($$0);
      }

      @Override
      public boolean a(ik<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends il.b<T> {
      private final ik<T> a;
      private final asq<T> b;
      private List<ih<T>> c = List.of();

      c(ik<T> $$0, asq<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ih<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public asq<T> f() {
         return this.b;
      }

      @Override
      protected List<ih<T>> e() {
         return this.c;
      }

      @Override
      public Either<asq<T>, List<ih<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<asq<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ih<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(ik<T> $$0) {
         return this.a.a($$0);
      }
   }
}
