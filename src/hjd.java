import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hjd implements auu, AutoCloseable {
   private final hhy a;
   private final ale b;
   private final Set<aua<?>> c;

   public hjd(hib $$0, ale $$1, ale $$2) {
      this($$0, $$1, $$2, hhu.a);
   }

   public hjd(hib $$0, ale $$1, ale $$2, Set<aua<?>> $$3) {
      this.b = $$2;
      this.a = new hhy($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hhz a(ale $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return hhu.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hhu.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hhu.a $$0) {
      try (bqo $$1 = bqi.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
