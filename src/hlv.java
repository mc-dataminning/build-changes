import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hlv implements avi, AutoCloseable {
   private final hkp a;
   private final alr b;
   private final Set<aun<?>> c;

   public hlv(hks $$0, alr $$1, alr $$2) {
      this($$0, $$1, $$2, hkl.a);
   }

   public hlv(hks $$0, alr $$1, alr $$2, Set<aun<?>> $$3) {
      this.b = $$2;
      this.a = new hkp($$1);
      $$0.a(this.a.e(), this.a);
      this.c = $$3;
   }

   protected hkq a(alr $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      return hkl.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hkl.a::a).thenCompose($$0::wait).thenAcceptAsync(this::a, $$3);
   }

   private void a(hkl.a $$0) {
      try (brr $$1 = brl.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.d();
   }
}
