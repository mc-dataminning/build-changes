import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gck implements aox, AutoCloseable {
   private final gbg a;
   private final agg b;
   private final Set<aod<?>> c;

   public gck(gbi $$0, agg $$1, agg $$2) {
      this($$0, $$1, $$2, gbc.a);
   }

   public gck(gbi $$0, agg $$1, agg $$2, Set<aod<?>> $$3) {
      this.b = $$2;
      this.a = new gbg($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gbh a(agg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      return gbc.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gbc.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gbc.a $$0, bfh $$1) {
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
