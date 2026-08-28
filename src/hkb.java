import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hkb implements auw, AutoCloseable {
   private final hiw a;
   private final alg b;
   private final Set<auc<?>> c;

   public hkb(hiz $$0, alg $$1, alg $$2) {
      this($$0, $$1, $$2, his.a);
   }

   public hkb(hiz $$0, alg $$1, alg $$2, Set<auc<?>> $$3) {
      this.b = $$2;
      this.a = new hiw($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hix a(alg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return his.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(his.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(his.a $$0) {
      try (bqt $$1 = bqn.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
