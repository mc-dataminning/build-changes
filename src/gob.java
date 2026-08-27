import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gob implements atl, AutoCloseable {
   private final gmx a;
   private final akh b;
   private final Set<asq<?>> c;

   public gob(gmz $$0, akh $$1, akh $$2) {
      this($$0, $$1, $$2, gmt.a);
   }

   public gob(gmz $$0, akh $$1, akh $$2, Set<asq<?>> $$3) {
      this.b = $$2;
      this.a = new gmx($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gmy a(akh $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      return gmt.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gmt.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gmt.a $$0, bma $$1) {
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
