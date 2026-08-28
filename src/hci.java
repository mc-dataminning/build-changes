import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hci implements avp, AutoCloseable {
   private final hbd a;
   private final alz b;
   private final Set<aut<?>> c;

   public hci(hbf $$0, alz $$1, alz $$2) {
      this($$0, $$1, $$2, haz.a);
   }

   public hci(hbf $$0, alz $$1, alz $$2, Set<aut<?>> $$3) {
      this.b = $$2;
      this.a = new hbd($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected hbe a(alz $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return haz.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(haz.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(haz.a $$0) {
      try (bpt $$1 = bpn.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
