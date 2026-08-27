import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class fzj implements ane, AutoCloseable {
   private final fyf a;
   private final aep b;
   private final Set<amk<?>> c;

   public fzj(fyh $$0, aep $$1, aep $$2) {
      this($$0, $$1, $$2, fyb.a);
   }

   public fzj(fyh $$0, aep $$1, aep $$2, Set<amk<?>> $$3) {
      this.b = $$2;
      this.a = new fyf($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected fyg a(aep $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      return fyb.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fyb.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fyb.a $$0, bde $$1) {
      $$1.a();
      $$1.a("upload");
      this.a.a($$0);
      $$1.c();
      $$1.b();
   }

   @Override
   public void close() {
      this.a.f();
   }
}
