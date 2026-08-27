import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class mw<T> extends nb<T> {
   private final Function<T, aet<T>> d;

   public mw(jm $$0, aet<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, Function<T, aet<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public mw(jm $$0, aet<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, CompletableFuture<nb.c<T>> $$3, Function<T, aet<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected mw.a<T> a(aqd<T> $$0) {
      aqa $$1 = this.c($$0);
      return new mw.a<>($$1, this.d);
   }

   protected static class a<T> extends nb.b<T> {
      private final Function<T, aet<T>> a;

      a(aqa $$0, Function<T, aet<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public mw.a<T> a(aqd<T> $$0) {
         super.b($$0);
         return this;
      }

      public final mw.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final mw.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
