import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qb<T> extends qg<T> {
   private final Function<T, alg<T>> d;

   public qb(mg $$0, alg<? extends kc<T>> $$1, CompletableFuture<jr.a> $$2, Function<T, alg<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qb(mg $$0, alg<? extends kc<T>> $$1, CompletableFuture<jr.a> $$2, CompletableFuture<qg.c<T>> $$3, Function<T, alg<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qb.a<T> a(axp<T> $$0) {
      axm $$1 = this.c($$0);
      return new qb.a<>($$1, this.d);
   }

   protected static class a<T> extends qg.b<T> {
      private final Function<T, alg<T>> a;

      a(axm $$0, Function<T, alg<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qb.a<T> a(axp<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qb.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qb.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
