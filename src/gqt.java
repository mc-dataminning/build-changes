import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqt implements atq, AutoCloseable {
   private final gpp a;
   private final akk b;
   private final Set<asv<?>> c;

   public gqt(gpr $$0, akk $$1, akk $$2) {
      this($$0, $$1, $$2, gpl.a);
   }

   public gqt(gpr $$0, akk $$1, akk $$2, Set<asv<?>> $$3) {
      this.b = $$2;
      this.a = new gpp($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gpq a(akk $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atq.a $$0, atw $$1, bmv $$2, bmv $$3, Executor $$4, Executor $$5) {
      return gpl.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gpl.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gpl.a $$0, bmv $$1) {
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
