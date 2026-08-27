import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gcx implements apb, AutoCloseable {
   private final gbt a;
   private final agi b;
   private final Set<aoh<?>> c;

   public gcx(gbv $$0, agi $$1, agi $$2) {
      this($$0, $$1, $$2, gbp.a);
   }

   public gcx(gbv $$0, agi $$1, agi $$2, Set<aoh<?>> $$3) {
      this.b = $$2;
      this.a = new gbt($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gbu a(agi $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      return gbp.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gbp.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gbp.a $$0, bfo $$1) {
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
