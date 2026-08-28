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

public interface js<T> extends Iterable<jo<T>> {
   Stream<jo<T>> a();

   int b();

   boolean c();

   Either<axl<T>, List<jo<T>>> d();

   Optional<jo<T>> a(azn var1);

   jo<T> a(int var1);

   boolean a(jo<T> var1);

   boolean a(jr<T> var1);

   Optional<axl<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> js.c<T> a(jr<T> $$0, axl<T> $$1) {
      return new js.c<T>($$0, $$1) {
         @Override
         protected List<jo<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> js<T> f() {
      return (js<T>)js.a.a;
   }

   @SafeVarargs
   static <T> js.a<T> a(jo<T>... $$0) {
      return new js.a<>(List.of($$0));
   }

   static <T> js.a<T> a(List<? extends jo<T>> $$0) {
      return new js.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> js.a<T> a(Function<E, jo<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> js.a<T> a(Function<E, jo<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends js.b<T> {
      static final js.a<?> a = new js.a(List.of());
      private final List<jo<T>> b;
      @Nullable
      private Set<jo<T>> c;

      a(List<jo<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jo<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<axl<T>, List<jo<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<axl<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jo<T> $$0) {
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
            if ($$0 instanceof js.a<?> $$1 && this.b.equals($$1.b)) {
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

   public abstract static class b<T> implements js<T> {
      protected abstract List<jo<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jo<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jo<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jo<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jo<T>> a(azn $$0) {
         return ad.b(this.g(), $$0);
      }

      @Override
      public jo<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jr<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends js.b<T> {
      private final jr<T> a;
      private final axl<T> b;
      @Nullable
      private List<jo<T>> c;

      c(jr<T> $$0, axl<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jo<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public axl<T> h() {
         return this.b;
      }

      @Override
      protected List<jo<T>> g() {
         if (this.c == null) {
            throw new IllegalStateException("Trying to access unbound tag '" + this.b + "' from registry " + this.a);
         } else {
            return this.c;
         }
      }

      @Override
      public boolean c() {
         return this.c != null;
      }

      @Override
      public Either<axl<T>, List<jo<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<axl<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jo<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jr<T> $$0) {
         return this.a.a($$0);
      }
   }
}
