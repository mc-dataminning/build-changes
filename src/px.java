import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class px<T> extends qc<T> {
   private final Function<T, alb<T>> d;

   public px(md $$0, alb<? extends ka<T>> $$1, CompletableFuture<jp.a> $$2, Function<T, alb<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public px(md $$0, alb<? extends ka<T>> $$1, CompletableFuture<jp.a> $$2, CompletableFuture<qc.c<T>> $$3, Function<T, alb<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected px.a<T> a(axj<T> $$0) {
      axg $$1 = this.c($$0);
      return new px.a<>($$1, this.d);
   }

   protected static class a<T> extends qc.b<T> {
      private final Function<T, alb<T>> a;

      a(axg $$0, Function<T, alb<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public px.a<T> a(axj<T> $$0) {
         super.b($$0);
         return this;
      }

      public final px.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final px.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
