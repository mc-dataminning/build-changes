import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gac implements anj, AutoCloseable {
   private final fyy a;
   private final aeu b;
   private final Set<amp<?>> c;

   public gac(fza $$0, aeu $$1, aeu $$2) {
      this($$0, $$1, $$2, fyu.a);
   }

   public gac(fza $$0, aeu $$1, aeu $$2, Set<amp<?>> $$3) {
      this.b = $$2;
      this.a = new fyy($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected fyz a(aeu $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      return fyu.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fyu.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fyu.a $$0, bdk $$1) {
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
