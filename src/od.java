import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class od<T> extends oi<T> {
   private final Function<T, agl<T>> d;

   public od(kl $$0, agl<? extends is<T>> $$1, CompletableFuture<ii.b> $$2, Function<T, agl<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public od(kl $$0, agl<? extends is<T>> $$1, CompletableFuture<ii.b> $$2, CompletableFuture<oi.c<T>> $$3, Function<T, agl<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected od.a<T> a(arz<T> $$0) {
      arw $$1 = this.c($$0);
      return new od.a<>($$1, this.d);
   }

   protected static class a<T> extends oi.b<T> {
      private final Function<T, agl<T>> a;

      a(arw $$0, Function<T, agl<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public od.a<T> a(arz<T> $$0) {
         super.b($$0);
         return this;
      }

      public final od.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final od.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
