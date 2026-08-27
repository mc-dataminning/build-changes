import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class oz<T> extends pe<T> {
   private final Function<T, aju<T>> d;

   public oz(lc $$0, aju<? extends ja<T>> $$1, CompletableFuture<ip.a> $$2, Function<T, aju<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public oz(lc $$0, aju<? extends ja<T>> $$1, CompletableFuture<ip.a> $$2, CompletableFuture<pe.c<T>> $$3, Function<T, aju<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected oz.a<T> a(avt<T> $$0) {
      avq $$1 = this.c($$0);
      return new oz.a<>($$1, this.d);
   }

   protected static class a<T> extends pe.b<T> {
      private final Function<T, aju<T>> a;

      a(avq $$0, Function<T, aju<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public oz.a<T> a(avt<T> $$0) {
         super.b($$0);
         return this;
      }

      public final oz.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final oz.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
