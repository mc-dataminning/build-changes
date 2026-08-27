import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class oh<T> extends om<T> {
   private final Function<T, aix<T>> d;

   public oh(ko $$0, aix<? extends iv<T>> $$1, CompletableFuture<il.b> $$2, Function<T, aix<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public oh(ko $$0, aix<? extends iv<T>> $$1, CompletableFuture<il.b> $$2, CompletableFuture<om.c<T>> $$3, Function<T, aix<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected oh.a<T> a(auo<T> $$0) {
      aul $$1 = this.c($$0);
      return new oh.a<>($$1, this.d);
   }

   protected static class a<T> extends om.b<T> {
      private final Function<T, aix<T>> a;

      a(aul $$0, Function<T, aix<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public oh.a<T> a(auo<T> $$0) {
         super.b($$0);
         return this;
      }

      public final oh.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final oh.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
