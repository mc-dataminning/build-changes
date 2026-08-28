import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hcn implements avp, AutoCloseable {
   private final hbi a;
   private final alz b;
   private final Set<aut<?>> c;

   public hcn(hbk $$0, alz $$1, alz $$2) {
      this($$0, $$1, $$2, hbe.a);
   }

   public hcn(hbk $$0, alz $$1, alz $$2, Set<aut<?>> $$3) {
      this.b = $$2;
      this.a = new hbi($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected hbj a(alz $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return hbe.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hbe.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hbe.a $$0) {
      try (bpx $$1 = bpr.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
