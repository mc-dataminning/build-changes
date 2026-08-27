import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mx<T> extends nc<T> {
   private final Function<T, aey<T>> d;

   public mx(jk $$0, aey<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2, Function<T, aey<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mx(jk $$0, aey<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<nc.c<T>> $$3, Function<T, aey<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mx.a<T> a(aqk<T> $$0) {
      aqh $$1 = this.c($$0);
      return new mx.a<>($$1, this.d);
   }

   protected static class a<T> extends nc.b<T> {
      private final Function<T, aey<T>> a;

      a(aqh $$0, Function<T, aey<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mx.a<T> a(aqk<T> $$0) {
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
