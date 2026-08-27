import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class fzo implements ang, AutoCloseable {
   private final fyk a;
   private final aer b;
   private final Set<amm<?>> c;

   public fzo(fym $$0, aer $$1, aer $$2) {
      this($$0, $$1, $$2, fyg.a);
   }

   public fzo(fym $$0, aer $$1, aer $$2, Set<amm<?>> $$3) {
      this.b = $$2;
      this.a = new fyk($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected fyl a(aer $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      return fyg.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fyg.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fyg.a $$0, bdh $$1) {
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
