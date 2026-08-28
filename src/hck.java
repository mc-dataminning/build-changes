import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hck implements avf, AutoCloseable {
   private final hbf a;
   private final alp b;
   private final Set<auj<?>> c;

   public hck(hbh $$0, alp $$1, alp $$2) {
      this($$0, $$1, $$2, hbb.a);
   }

   public hck(hbh $$0, alp $$1, alp $$2, Set<auj<?>> $$3) {
      this.b = $$2;
      this.a = new hbf($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected hbg a(alp $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(avf.a $$0, avl $$1, Executor $$2, Executor $$3) {
      return hbb.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hbb.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hbb.a $$0) {
      try (bpo $$1 = bpi.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
