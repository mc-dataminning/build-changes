import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gsb implements atx, AutoCloseable {
   private final gqx a;
   private final akt b;
   private final Set<atc<?>> c;

   public gsb(gqz $$0, akt $$1, akt $$2) {
      this($$0, $$1, $$2, gqt.a);
   }

   public gsb(gqz $$0, akt $$1, akt $$2, Set<atc<?>> $$3) {
      this.b = $$2;
      this.a = new gqx($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gqy a(akt $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      return gqt.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gqt.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gqt.a $$0, bmo $$1) {
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
