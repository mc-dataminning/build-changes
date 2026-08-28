import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qk<T> extends qp<T> {
   private final Function<T, aly<T>> d;

   public qk(mj $$0, aly<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, Function<T, aly<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qk(mj $$0, aly<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qp.c<T>> $$3, Function<T, aly<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qk.a<T> a(ayk<T> $$0) {
      ayh $$1 = this.c($$0);
      return new qk.a<>($$1, this.d);
   }

   protected static class a<T> extends qp.b<T> {
      private final Function<T, aly<T>> a;

      a(ayh $$0, Function<T, aly<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qk.a<T> a(ayk<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qk.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qk.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
