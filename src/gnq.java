import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gnq implements ati, AutoCloseable {
   private final gmn a;
   private final akf b;
   private final Set<asn<?>> c;

   public gnq(gmp $$0, akf $$1, akf $$2) {
      this($$0, $$1, $$2, gmj.a);
   }

   public gnq(gmp $$0, akf $$1, akf $$2, Set<asn<?>> $$3) {
      this.b = $$2;
      this.a = new gmn($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gmo a(akf $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      return gmj.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gmj.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gmj.a $$0, ble $$1) {
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
