import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gyw implements aut, AutoCloseable {
   private final gxr a;
   private final alh b;
   private final Set<aty<?>> c;

   public gyw(gxt $$0, alh $$1, alh $$2) {
      this($$0, $$1, $$2, gxn.a);
   }

   public gyw(gxt $$0, alh $$1, alh $$2, Set<aty<?>> $$3) {
      this.b = $$2;
      this.a = new gxr($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gxs a(alh $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      return gxn.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gxn.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gxn.a $$0, bok $$1) {
      $$1.a();
      $$1.a("upload");
      this.a.a($$0);
      $$1.c();
      $$1.b();
   }

   @Override
   public void close() {
      this.a.g();
   }
}
