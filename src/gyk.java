import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gyk implements aup, AutoCloseable {
   private final gxf a;
   private final ale b;
   private final Set<atu<?>> c;

   public gyk(gxh $$0, ale $$1, ale $$2) {
      this($$0, $$1, $$2, gxb.a);
   }

   public gyk(gxh $$0, ale $$1, ale $$2, Set<atu<?>> $$3) {
      this.b = $$2;
      this.a = new gxf($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gxg a(ale $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      return gxb.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gxb.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gxb.a $$0, bog $$1) {
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
