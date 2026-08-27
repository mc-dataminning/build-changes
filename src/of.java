import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class of<T> extends ok<T> {
   private final Function<T, ahg<T>> d;

   public of(km $$0, ahg<? extends it<T>> $$1, CompletableFuture<ij.b> $$2, Function<T, ahg<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public of(km $$0, ahg<? extends it<T>> $$1, CompletableFuture<ij.b> $$2, CompletableFuture<ok.c<T>> $$3, Function<T, ahg<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected of.a<T> a(asx<T> $$0) {
      asu $$1 = this.c($$0);
      return new of.a<>($$1, this.d);
   }

   protected static class a<T> extends ok.b<T> {
      private final Function<T, ahg<T>> a;

      a(asu $$0, Function<T, ahg<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public of.a<T> a(asx<T> $$0) {
         super.b($$0);
         return this;
      }

      public final of.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final of.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
