import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mz<T> extends ne<T> {
   private final Function<T, aew<T>> d;

   public mz(jm $$0, aew<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, Function<T, aew<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mz(jm $$0, aew<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, CompletableFuture<ne.c<T>> $$3, Function<T, aew<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mz.a<T> a(aqi<T> $$0) {
      aqf $$1 = this.c($$0);
      return new mz.a<>($$1, this.d);
   }

   protected static class a<T> extends ne.b<T> {
      private final Function<T, aew<T>> a;

      a(aqf $$0, Function<T, aew<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mz.a<T> a(aqi<T> $$0) {
         super.b($$0);
         return this;
      }

      public final mz.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final mz.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
