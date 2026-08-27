import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pj<T> extends po<T> {
   private final Function<T, akg<T>> d;

   public pj(lm $$0, akg<? extends jj<T>> $$1, CompletableFuture<iy.a> $$2, Function<T, akg<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pj(lm $$0, akg<? extends jj<T>> $$1, CompletableFuture<iy.a> $$2, CompletableFuture<po.c<T>> $$3, Function<T, akg<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pj.a<T> a(awg<T> $$0) {
      awd $$1 = this.c($$0);
      return new pj.a<>($$1, this.d);
   }

   protected static class a<T> extends po.b<T> {
      private final Function<T, akg<T>> a;

      a(awd $$0, Function<T, akg<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pj.a<T> a(awg<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pj.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pj.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
