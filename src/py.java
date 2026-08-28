import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class py<T> extends qd<T> {
   private final Function<T, ala<T>> d;

   public py(ly $$0, ala<? extends jv<T>> $$1, CompletableFuture<jk.a> $$2, Function<T, ala<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public py(ly $$0, ala<? extends jv<T>> $$1, CompletableFuture<jk.a> $$2, CompletableFuture<qd.c<T>> $$3, Function<T, ala<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected py.a<T> a(axb<T> $$0) {
      awy $$1 = this.c($$0);
      return new py.a<>($$1, this.d);
   }

   protected static class a<T> extends qd.b<T> {
      private final Function<T, ala<T>> a;

      a(awy $$0, Function<T, ala<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public py.a<T> a(axb<T> $$0) {
         super.b($$0);
         return this;
      }

      public final py.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final py.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
