import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ny<T> extends od<T> {
   private final Function<T, agf<T>> d;

   public ny(kh $$0, agf<? extends io<T>> $$1, CompletableFuture<id.b> $$2, Function<T, agf<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public ny(kh $$0, agf<? extends io<T>> $$1, CompletableFuture<id.b> $$2, CompletableFuture<od.c<T>> $$3, Function<T, agf<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected ny.a<T> a(arr<T> $$0) {
      aro $$1 = this.c($$0);
      return new ny.a<>($$1, this.d);
   }

   protected static class a<T> extends od.b<T> {
      private final Function<T, agf<T>> a;

      a(aro $$0, Function<T, agf<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public ny.a<T> a(arr<T> $$0) {
         super.b($$0);
         return this;
      }

      public final ny.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final ny.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
