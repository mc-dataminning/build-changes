import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class nz<T> extends oe<T> {
   private final Function<T, agh<T>> d;

   public nz(kh $$0, agh<? extends io<T>> $$1, CompletableFuture<id.b> $$2, Function<T, agh<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public nz(kh $$0, agh<? extends io<T>> $$1, CompletableFuture<id.b> $$2, CompletableFuture<oe.c<T>> $$3, Function<T, agh<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected nz.a<T> a(arv<T> $$0) {
      ars $$1 = this.c($$0);
      return new nz.a<>($$1, this.d);
   }

   protected static class a<T> extends oe.b<T> {
      private final Function<T, agh<T>> a;

      a(ars $$0, Function<T, agh<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public nz.a<T> a(arv<T> $$0) {
         super.b($$0);
         return this;
      }

      public final nz.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final nz.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
