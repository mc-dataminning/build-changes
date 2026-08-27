import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mt<T> extends my<T> {
   private final Function<T, acp<T>> d;

   public mt(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, Function<T, acp<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mt(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<my.c<T>> $$3, Function<T, acp<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mt.a<T> a(anl<T> $$0) {
      ani $$1 = this.c($$0);
      return new mt.a<>($$1, this.d);
   }

   protected static class a<T> extends my.b<T> {
      private final Function<T, acp<T>> a;

      a(ani $$0, Function<T, acp<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mt.a<T> a(anl<T> $$0) {
         super.b($$0);
         return this;
      }

      public final mt.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final mt.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
