import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gri implements atx, AutoCloseable {
   private final gqe a;
   private final akq b;
   private final Set<atc<?>> c;

   public gri(gqg $$0, akq $$1, akq $$2) {
      this($$0, $$1, $$2, gqa.a);
   }

   public gri(gqg $$0, akq $$1, akq $$2, Set<atc<?>> $$3) {
      this.b = $$2;
      this.a = new gqe($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gqf a(akq $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      return gqa.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gqa.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gqa.a $$0, bne $$1) {
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
