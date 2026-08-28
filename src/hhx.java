import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hhx implements aut, AutoCloseable {
   private final hgr a;
   private final ald b;
   private final Set<atz<?>> c;

   public hhx(hgu $$0, ald $$1, ald $$2) {
      this($$0, $$1, $$2, hgn.a);
   }

   public hhx(hgu $$0, ald $$1, ald $$2, Set<atz<?>> $$3) {
      this.b = $$2;
      this.a = new hgr($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hgs a(ald $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      return hgn.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hgn.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hgn.a $$0) {
      try (bqg $$1 = bqa.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
