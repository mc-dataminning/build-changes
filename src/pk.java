import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pk<T> extends pp<T> {
   private final Function<T, alc<T>> d;

   public pk(mm $$0, alc<? extends kf<T>> $$1, CompletableFuture<ju.a> $$2, Function<T, alc<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pk(mm $$0, alc<? extends kf<T>> $$1, CompletableFuture<ju.a> $$2, CompletableFuture<pp.c<T>> $$3, Function<T, alc<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pk.a<T> a(axp<T> $$0) {
      axm $$1 = this.c($$0);
      return new pk.a<>($$1, this.d);
   }

   protected static class a<T> extends pp.b<T> {
      private final Function<T, alc<T>> a;

      a(axm $$0, Function<T, alc<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pk.a<T> a(axp<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pk.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pk.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
