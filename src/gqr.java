import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqr implements atq, AutoCloseable {
   private final gpn a;
   private final akk b;
   private final Set<asv<?>> c;

   public gqr(gpp $$0, akk $$1, akk $$2) {
      this($$0, $$1, $$2, gpj.a);
   }

   public gqr(gpp $$0, akk $$1, akk $$2, Set<asv<?>> $$3) {
      this.b = $$2;
      this.a = new gpn($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gpo a(akk $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atq.a $$0, atw $$1, bmu $$2, bmu $$3, Executor $$4, Executor $$5) {
      return gpj.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gpj.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gpj.a $$0, bmu $$1) {
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
