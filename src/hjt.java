import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hjt implements auw, AutoCloseable {
   private final hio a;
   private final alg b;
   private final Set<auc<?>> c;

   public hjt(hir $$0, alg $$1, alg $$2) {
      this($$0, $$1, $$2, hik.a);
   }

   public hjt(hir $$0, alg $$1, alg $$2, Set<auc<?>> $$3) {
      this.b = $$2;
      this.a = new hio($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hip a(alg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return hik.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hik.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hik.a $$0) {
      try (bqr $$1 = bql.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
