import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pn<T> extends ps<T> {
   private final Function<T, alj<T>> d;

   public pn(mq $$0, alj<? extends jt<T>> $$1, CompletableFuture<ji.a> $$2, Function<T, alj<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pn(mq $$0, alj<? extends jt<T>> $$1, CompletableFuture<ji.a> $$2, CompletableFuture<ps.c<T>> $$3, Function<T, alj<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pn.a<T> a(axv<T> $$0) {
      axs $$1 = this.c($$0);
      return new pn.a<>($$1, this.d);
   }

   protected static class a<T> extends ps.b<T> {
      private final Function<T, alj<T>> a;

      a(axs $$0, Function<T, alj<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pn.a<T> a(axv<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pn.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pn.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
