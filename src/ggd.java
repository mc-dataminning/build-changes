import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ggd implements aqd, AutoCloseable {
   private final gfa a;
   private final ahh b;
   private final Set<apj<?>> c;

   public ggd(gfc $$0, ahh $$1, ahh $$2) {
      this($$0, $$1, $$2, gew.a);
   }

   public ggd(gfc $$0, ahh $$1, ahh $$2, Set<apj<?>> $$3) {
      this.b = $$2;
      this.a = new gfa($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gfb a(ahh $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      return gew.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gew.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gew.a $$0, bgt $$1) {
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
