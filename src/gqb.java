import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqb implements aui, AutoCloseable {
   private final gox a;
   private final ale b;
   private final Set<atn<?>> c;

   public gqb(goz $$0, ale $$1, ale $$2) {
      this($$0, $$1, $$2, got.a);
   }

   public gqb(goz $$0, ale $$1, ale $$2, Set<atn<?>> $$3) {
      this.b = $$2;
      this.a = new gox($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected goy a(ale $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      return got.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(got.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(got.a $$0, bnh $$1) {
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
