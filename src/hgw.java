import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hgw implements auj, AutoCloseable {
   private final hfq a;
   private final aku b;
   private final Set<atp<?>> c;

   public hgw(hft $$0, aku $$1, aku $$2) {
      this($$0, $$1, $$2, hfm.a);
   }

   public hgw(hft $$0, aku $$1, aku $$2, Set<atp<?>> $$3) {
      this.b = $$2;
      this.a = new hfq($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hfr a(aku $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return hfm.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hfm.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hfm.a $$0) {
      try (bpo $$1 = bpi.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
