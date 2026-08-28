import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pt<T> extends py<T> {
   private final Function<T, akp<T>> d;

   public pt(mc $$0, akp<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2, Function<T, akp<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pt(mc $$0, akp<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2, CompletableFuture<py.c<T>> $$3, Function<T, akp<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pt.a<T> a(awt<T> $$0) {
      awq $$1 = this.c($$0);
      return new pt.a<>($$1, this.d);
   }

   protected static class a<T> extends py.b<T> {
      private final Function<T, akp<T>> a;

      a(awq $$0, Function<T, akp<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pt.a<T> a(awt<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pt.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pt.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
