import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qd<T> extends qi<T> {
   private final Function<T, ali<T>> d;

   public qd(mi $$0, ali<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, Function<T, ali<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qd(mi $$0, ali<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qi.c<T>> $$3, Function<T, ali<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qd.a<T> a(axs<T> $$0) {
      axp $$1 = this.c($$0);
      return new qd.a<>($$1, this.d);
   }

   protected static class a<T> extends qi.b<T> {
      private final Function<T, ali<T>> a;

      a(axp $$0, Function<T, ali<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qd.a<T> a(axs<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qd.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qd.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
