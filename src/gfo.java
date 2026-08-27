import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gfo implements aqb, AutoCloseable {
   private final gel a;
   private final ahg b;
   private final Set<aph<?>> c;

   public gfo(gen $$0, ahg $$1, ahg $$2) {
      this($$0, $$1, $$2, geh.a);
   }

   public gfo(gen $$0, ahg $$1, ahg $$2, Set<aph<?>> $$3) {
      this.b = $$2;
      this.a = new gel($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gem a(ahg $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      return geh.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(geh.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(geh.a $$0, bgr $$1) {
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
