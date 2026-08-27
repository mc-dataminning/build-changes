import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class po<T> extends pt<T> {
   private final Function<T, aks<T>> d;

   public po(lq $$0, aks<? extends jn<T>> $$1, CompletableFuture<jc.a> $$2, Function<T, aks<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public po(lq $$0, aks<? extends jn<T>> $$1, CompletableFuture<jc.a> $$2, CompletableFuture<pt.c<T>> $$3, Function<T, aks<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected po.a<T> a(awt<T> $$0) {
      awq $$1 = this.c($$0);
      return new po.a<>($$1, this.d);
   }

   protected static class a<T> extends pt.b<T> {
      private final Function<T, aks<T>> a;

      a(awq $$0, Function<T, aks<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public po.a<T> a(awt<T> $$0) {
         super.b($$0);
         return this;
      }

      public final po.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final po.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
