import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hfn implements auj, AutoCloseable {
   private final hei a;
   private final aku b;
   private final Set<ato<?>> c;

   public hfn(hek $$0, aku $$1, aku $$2) {
      this($$0, $$1, $$2, hee.a);
   }

   public hfn(hek $$0, aku $$1, aku $$2, Set<ato<?>> $$3) {
      this.b = $$2;
      this.a = new hei($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected hej a(aku $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return hee.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hee.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hee.a $$0) {
      try (box $$1 = bor.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
