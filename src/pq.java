import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pq<T> extends pv<T> {
   private final Function<T, akj<T>> d;

   public pq(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2, Function<T, akj<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pq(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2, CompletableFuture<pv.c<T>> $$3, Function<T, akj<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pq.a<T> a(awk<T> $$0) {
      awh $$1 = this.c($$0);
      return new pq.a<>($$1, this.d);
   }

   protected static class a<T> extends pv.b<T> {
      private final Function<T, akj<T>> a;

      a(awh $$0, Function<T, akj<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pq.a<T> a(awk<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pq.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pq.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
