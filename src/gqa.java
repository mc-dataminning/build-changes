import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqa implements aui, AutoCloseable {
   private final gow a;
   private final ale b;
   private final Set<atn<?>> c;

   public gqa(goy $$0, ale $$1, ale $$2) {
      this($$0, $$1, $$2, gos.a);
   }

   public gqa(goy $$0, ale $$1, ale $$2, Set<atn<?>> $$3) {
      this.b = $$2;
      this.a = new gow($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gox a(ale $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, bng $$2, bng $$3, Executor $$4, Executor $$5) {
      return gos.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gos.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gos.a $$0, bng $$1) {
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
