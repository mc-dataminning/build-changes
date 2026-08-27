import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gke implements asi, AutoCloseable {
   private final gjb a;
   private final ajh b;
   private final Set<arn<?>> c;

   public gke(gjd $$0, ajh $$1, ajh $$2) {
      this($$0, $$1, $$2, gix.a);
   }

   public gke(gjd $$0, ajh $$1, ajh $$2, Set<arn<?>> $$3) {
      this.b = $$2;
      this.a = new gjb($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gjc a(ajh $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      return gix.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gix.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gix.a $$0, bjr $$1) {
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
