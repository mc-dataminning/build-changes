import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class nu<T> extends nz<T> {
   private final Function<T, afv<T>> d;

   public nu(kh $$0, afv<? extends io<T>> $$1, CompletableFuture<id.b> $$2, Function<T, afv<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public nu(kh $$0, afv<? extends io<T>> $$1, CompletableFuture<id.b> $$2, CompletableFuture<nz.c<T>> $$3, Function<T, afv<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected nu.a<T> a(arh<T> $$0) {
      are $$1 = this.c($$0);
      return new nu.a<>($$1, this.d);
   }

   protected static class a<T> extends nz.b<T> {
      private final Function<T, afv<T>> a;

      a(are $$0, Function<T, afv<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public nu.a<T> a(arh<T> $$0) {
         super.b($$0);
         return this;
      }

      public final nu.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final nu.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
