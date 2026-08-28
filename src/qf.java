import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class qf<T> extends qk<T> {
   private final Function<T, alk<T>> d;

   public qf(mi $$0, alk<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, Function<T, alk<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public qf(mi $$0, alk<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qk.c<T>> $$3, Function<T, alk<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected qf.a<T> a(axt<T> $$0) {
      axq $$1 = this.c($$0);
      return new qf.a<>($$1, this.d);
   }

   protected static class a<T> extends qk.b<T> {
      private final Function<T, alk<T>> a;

      a(axq $$0, Function<T, alk<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public qf.a<T> a(axt<T> $$0) {
         super.b($$0);
         return this;
      }

      public final qf.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final qf.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
