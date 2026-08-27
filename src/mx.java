import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mx<T> extends nc<T> {
   private final Function<T, aev<T>> d;

   public mx(jk $$0, aev<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2, Function<T, aev<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mx(jk $$0, aev<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<nc.c<T>> $$3, Function<T, aev<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mx.a<T> a(aqh<T> $$0) {
      aqe $$1 = this.c($$0);
      return new mx.a<>($$1, this.d);
   }

   protected static class a<T> extends nc.b<T> {
      private final Function<T, aev<T>> a;

      a(aqe $$0, Function<T, aev<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mx.a<T> a(aqh<T> $$0) {
         super.b($$0);
         return this;
      }

      public final mx.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final mx.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
