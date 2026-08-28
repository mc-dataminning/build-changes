import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pl<T> extends pq<T> {
   private final Function<T, alf<T>> d;

   public pl(mo $$0, alf<? extends jr<T>> $$1, CompletableFuture<jg.a> $$2, Function<T, alf<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pl(mo $$0, alf<? extends jr<T>> $$1, CompletableFuture<jg.a> $$2, CompletableFuture<pq.c<T>> $$3, Function<T, alf<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pl.a<T> a(axr<T> $$0) {
      axo $$1 = this.c($$0);
      return new pl.a<>($$1, this.d);
   }

   protected static class a<T> extends pq.b<T> {
      private final Function<T, alf<T>> a;

      a(axo $$0, Function<T, alf<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pl.a<T> a(axr<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pl.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pl.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
