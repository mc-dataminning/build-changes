import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hkv implements auw, AutoCloseable {
   private final hjp a;
   private final alg b;
   private final Set<auc<?>> c;

   public hkv(hjs $$0, alg $$1, alg $$2) {
      this($$0, $$1, $$2, hjl.a);
   }

   public hkv(hjs $$0, alg $$1, alg $$2, Set<auc<?>> $$3) {
      this.b = $$2;
      this.a = new hjp($$1);
      $$0.a(this.a.f(), this.a);
      this.c = $$3;
   }

   protected hjq a(alg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return hjl.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hjl.a::a).thenCompose($$0::wait).thenAcceptAsync(this::a, $$3);
   }

   private void a(hjl.a $$0) {
      try (bqv $$1 = bqp.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.e();
   }
}
