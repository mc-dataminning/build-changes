import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qc<T> extends qh<T> {
   private final Function<T, alh<T>> d;

   public qc(mh $$0, alh<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, Function<T, alh<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qc(mh $$0, alh<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qh.c<T>> $$3, Function<T, alh<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qc.a<T> a(axq<T> $$0) {
      axn $$1 = this.c($$0);
      return new qc.a<>($$1, this.d);
   }

   protected static class a<T> extends qh.b<T> {
      private final Function<T, alh<T>> a;

      a(axn $$0, Function<T, alh<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qc.a<T> a(axq<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qc.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qc.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
