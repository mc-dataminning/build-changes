import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mu<T> extends mz<T> {
   private final Function<T, aeo<T>> d;

   public mu(jl $$0, aeo<? extends hs<T>> $$1, CompletableFuture<hh.b> $$2, Function<T, aeo<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mu(jl $$0, aeo<? extends hs<T>> $$1, CompletableFuture<hh.b> $$2, CompletableFuture<mz.c<T>> $$3, Function<T, aeo<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mu.a<T> a(apy<T> $$0) {
      apv $$1 = this.c($$0);
      return new mu.a<>($$1, this.d);
   }

   protected static class a<T> extends mz.b<T> {
      private final Function<T, aeo<T>> a;

      a(apv $$0, Function<T, aeo<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mu.a<T> a(apy<T> $$0) {
         super.b($$0);
         return this;
      }

      public final mu.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final mu.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
