import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class oj<T> extends oo<T> {
   private final Function<T, ajb<T>> d;

   public oj(kq $$0, ajb<? extends ix<T>> $$1, CompletableFuture<in.a> $$2, Function<T, ajb<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public oj(kq $$0, ajb<? extends ix<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<oo.c<T>> $$3, Function<T, ajb<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected oj.a<T> a(aut<T> $$0) {
      auq $$1 = this.c($$0);
      return new oj.a<>($$1, this.d);
   }

   protected static class a<T> extends oo.b<T> {
      private final Function<T, ajb<T>> a;

      a(auq $$0, Function<T, ajb<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public oj.a<T> a(aut<T> $$0) {
         super.b($$0);
         return this;
      }

      public final oj.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final oj.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
