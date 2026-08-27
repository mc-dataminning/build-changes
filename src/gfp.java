import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gfp implements aqc, AutoCloseable {
   private final gem a;
   private final ahg b;
   private final Set<api<?>> c;

   public gfp(geo $$0, ahg $$1, ahg $$2) {
      this($$0, $$1, $$2, gei.a);
   }

   public gfp(geo $$0, ahg $$1, ahg $$2, Set<api<?>> $$3) {
      this.b = $$2;
      this.a = new gem($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gen a(ahg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      return gei.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gei.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gei.a $$0, bgs $$1) {
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
