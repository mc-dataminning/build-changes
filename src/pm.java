import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class pm<T> extends pr<T> {
   private final Function<T, akl<T>> d;

   public pm(ln $$0, akl<? extends jk<T>> $$1, CompletableFuture<iz.a> $$2, Function<T, akl<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pm(ln $$0, akl<? extends jk<T>> $$1, CompletableFuture<iz.a> $$2, CompletableFuture<pr.c<T>> $$3, Function<T, akl<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pm.a<T> a(awl<T> $$0) {
      awi $$1 = this.c($$0);
      return new pm.a<>($$1, this.d);
   }

   protected static class a<T> extends pr.b<T> {
      private final Function<T, akl<T>> a;

      a(awi $$0, Function<T, akl<T>> $$1) {
         super($$0);
         this.a = $$1;
      }

      public pm.a<T> a(awl<T> $$0) {
         super.b($$0);
         return this;
      }

      public final pm.a<T> a(T $$0) {
         this.a(this.a.apply($$0));
         return this;
      }

      @SafeVarargs
      public final pm.a<T> a(T... $$0) {
         Stream.<T>of($$0).map(this.a).forEach(this::a);
         return this;
      }
   }
}
