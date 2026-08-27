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

public interface je<T> extends Iterable<ja<T>> {
   Stream<ja<T>> a();

   int b();

   Either<awt<T>, List<ja<T>>> c();

   Optional<ja<T>> a(ayt var1);

   ja<T> a(int var1);

   boolean a(ja<T> var1);

   boolean a(jd<T> var1);

   Optional<awt<T>> d();

   @Deprecated
   @VisibleForTesting
   static <T> je.c<T> a(jd<T> $$0, awt<T> $$1) {
      return new je.c<T>($$0, $$1) {
         @Override
         protected List<ja<T>> f() {
            throw new UnsupportedOperationException("Tag " + this.g() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> je<T> e() {
      return (je<T>)je.a.a;
   }

   @SafeVarargs
   static <T> je.a<T> a(ja<T>... $$0) {
      return new je.a<>(List.of($$0));
   }

   static <T> je.a<T> a(List<? extends ja<T>> $$0) {
      return new je.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> je.a<T> a(Function<E, ja<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> je.a<T> a(Function<E, ja<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends je.b<T> {
      static final je.a<?> a = new je.a(List.of());
      private final List<ja<T>> b;
      @Nullable
      private Set<ja<T>> c;

      a(List<ja<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<ja<T>> f() {
         return this.b;
      }

      @Override
      public Either<awt<T>, List<ja<T>>> c() {
         return Either.right(this.b);
      }

      @Override
      public Optional<awt<T>> d() {
         return Optional.empty();
      }

      @Override
      public boolean a(ja<T> $$0) {
         if (this.c == null) {
            this.c = Set.copyOf(this.b);
         }

         return this.c.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.b + "]";
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof je.a<?> $$1 && this.b.equals($$1.b)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.b.hashCode();
      }
   }

   public abstract static class b<T> implements je<T> {
      protected abstract List<ja<T>> f();

      @Override
      public int b() {
         return this.f().size();
      }

      @Override
      public Spliterator<ja<T>> spliterator() {
         return this.f().spliterator();
      }

      @Override
      public Iterator<ja<T>> iterator() {
         return this.f().iterator();
      }

      @Override
      public Stream<ja<T>> a() {
         return this.f().stream();
      }

      @Override
      public Optional<ja<T>> a(ayt $$0) {
         return ad.b(this.f(), $$0);
      }

      @Override
      public ja<T> a(int $$0) {
         return this.f().get($$0);
      }

      @Override
      public boolean a(jd<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends je.b<T> {
      private final jd<T> a;
      private final awt<T> b;
      private List<ja<T>> c = List.of();

      c(jd<T> $$0, awt<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<ja<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public awt<T> g() {
         return this.b;
      }

      @Override
      protected List<ja<T>> f() {
         return this.c;
      }

      @Override
      public Either<awt<T>, List<ja<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public Optional<awt<T>> d() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(ja<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jd<T> $$0) {
         return this.a.a($$0);
      }
   }
}
