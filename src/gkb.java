import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gkb implements asi, AutoCloseable {
   private final giy a;
   private final ajh b;
   private final Set<arn<?>> c;

   public gkb(gja $$0, ajh $$1, ajh $$2) {
      this($$0, $$1, $$2, giu.a);
   }

   public gkb(gja $$0, ajh $$1, ajh $$2, Set<arn<?>> $$3) {
      this.b = $$2;
      this.a = new giy($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected giz a(ajh $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      return giu.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(giu.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(giu.a $$0, bjq $$1) {
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
