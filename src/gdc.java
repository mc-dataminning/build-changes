import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gdc implements apf, AutoCloseable {
   private final gby a;
   private final agm b;
   private final Set<aol<?>> c;

   public gdc(gca $$0, agm $$1, agm $$2) {
      this($$0, $$1, $$2, gbu.a);
   }

   public gdc(gca $$0, agm $$1, agm $$2, Set<aol<?>> $$3) {
      this.b = $$2;
      this.a = new gby($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gbz a(agm $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      return gbu.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gbu.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gbu.a $$0, bfs $$1) {
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
