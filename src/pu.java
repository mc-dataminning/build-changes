import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pu<T> extends pz<T> {
   private final Function<T, akq<T>> d;

   public pu(mc $$0, akq<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2, Function<T, akq<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pu(mc $$0, akq<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2, CompletableFuture<pz.c<T>> $$3, Function<T, akq<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pu.a<T> a(awu<T> $$0) {
      awr $$1 = this.c($$0);
      return new pu.a<>($$1, this.d);
   }

   protected static class a<T> extends pz.b<T> {
      private final Function<T, akq<T>> a;

      a(awr $$0, Function<T, akq<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pu.a<T> a(awu<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pu.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pu.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
