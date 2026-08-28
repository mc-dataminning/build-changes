import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qe<T> extends qj<T> {
   private final Function<T, alo<T>> d;

   public qe(mj $$0, alo<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, Function<T, alo<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qe(mj $$0, alo<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qj.c<T>> $$3, Function<T, alo<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qe.a<T> a(aya<T> $$0) {
      axx $$1 = this.c($$0);
      return new qe.a<>($$1, this.d);
   }

   protected static class a<T> extends qj.b<T> {
      private final Function<T, alo<T>> a;

      a(axx $$0, Function<T, alo<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qe.a<T> a(aya<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qe.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qe.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
