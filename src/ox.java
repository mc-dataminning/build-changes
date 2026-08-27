import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ox<T> extends pc<T> {
   private final Function<T, ajs<T>> d;

   public ox(la $$0, ajs<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, Function<T, ajs<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public ox(la $$0, ajs<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<pc.c<T>> $$3, Function<T, ajs<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected ox.a<T> a(avr<T> $$0) {
      avo $$1 = this.c($$0);
      return new ox.a<>($$1, this.d);
   }

   protected static class a<T> extends pc.b<T> {
      private final Function<T, ajs<T>> a;

      a(avo $$0, Function<T, ajs<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public ox.a<T> a(avr<T> $$0) {
         super.b($$0);
         return this;
      }

      public final ox.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final ox.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
