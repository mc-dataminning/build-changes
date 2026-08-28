import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gyf implements aun, AutoCloseable {
   private final gxa a;
   private final alc b;
   private final Set<ats<?>> c;

   public gyf(gxc $$0, alc $$1, alc $$2) {
      this($$0, $$1, $$2, gww.a);
   }

   public gyf(gxc $$0, alc $$1, alc $$2, Set<ats<?>> $$3) {
      this.b = $$2;
      this.a = new gxa($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gxb a(alc $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aun.a $$0, aut $$1, bod $$2, bod $$3, Executor $$4, Executor $$5) {
      return gww.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gww.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gww.a $$0, bod $$1) {
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
