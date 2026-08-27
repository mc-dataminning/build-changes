import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ol<T> extends oq<T> {
   private final Function<T, ajg<T>> d;

   public ol(kr $$0, ajg<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, Function<T, ajg<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public ol(kr $$0, ajg<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<oq.c<T>> $$3, Function<T, ajg<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected ol.a<T> a(avd<T> $$0) {
      ava $$1 = this.c($$0);
      return new ol.a<>($$1, this.d);
   }

   protected static class a<T> extends oq.b<T> {
      private final Function<T, ajg<T>> a;

      a(ava $$0, Function<T, ajg<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public ol.a<T> a(avd<T> $$0) {
         super.b($$0);
         return this;
      }

      public final ol.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final ol.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
