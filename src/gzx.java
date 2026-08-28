import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gzx implements auy, AutoCloseable {
   private final gys a;
   private final all b;
   private final Set<auc<?>> c;

   public gzx(gyu $$0, all $$1, all $$2) {
      this($$0, $$1, $$2, gyo.a);
   }

   public gzx(gyu $$0, all $$1, all $$2, Set<auc<?>> $$3) {
      this.b = $$2;
      this.a = new gys($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gyt a(all $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      return gyo.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(gyo.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(gyo.a $$0) {
      try (bow $$1 = boq.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
