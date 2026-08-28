import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pi<T> extends pn<T> {
   private final Function<T, akt<T>> d;

   public pi(mk $$0, akt<? extends ke<T>> $$1, CompletableFuture<jt.a> $$2, Function<T, akt<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pi(mk $$0, akt<? extends ke<T>> $$1, CompletableFuture<jt.a> $$2, CompletableFuture<pn.c<T>> $$3, Function<T, akt<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pi.a<T> a(axe<T> $$0) {
      axb $$1 = this.c($$0);
      return new pi.a<>($$1, this.d);
   }

   protected static class a<T> extends pn.b<T> {
      private final Function<T, akt<T>> a;

      a(axb $$0, Function<T, akt<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pi.a<T> a(axe<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pi.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pi.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
