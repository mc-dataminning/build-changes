import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gxo implements aum, AutoCloseable {
   private final gwj a;
   private final alb b;
   private final Set<atr<?>> c;

   public gxo(gwl $$0, alb $$1, alb $$2) {
      this($$0, $$1, $$2, gwf.a);
   }

   public gxo(gwl $$0, alb $$1, alb $$2, Set<atr<?>> $$3) {
      this.b = $$2;
      this.a = new gwj($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gwk a(alb $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      return gwf.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gwf.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gwf.a $$0, bny $$1) {
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
