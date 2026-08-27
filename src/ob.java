import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ob<T> extends og<T> {
   private final Function<T, ags<T>> d;

   public ob(kk $$0, ags<? extends ir<T>> $$1, CompletableFuture<ih.b> $$2, Function<T, ags<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public ob(kk $$0, ags<? extends ir<T>> $$1, CompletableFuture<ih.b> $$2, CompletableFuture<og.c<T>> $$3, Function<T, ags<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected ob.a<T> a(asg<T> $$0) {
      asd $$1 = this.c($$0);
      return new ob.a<>($$1, this.d);
   }

   protected static class a<T> extends og.b<T> {
      private final Function<T, ags<T>> a;

      a(asd $$0, Function<T, ags<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public ob.a<T> a(asg<T> $$0) {
         super.b($$0);
         return this;
      }

      public final ob.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final ob.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
