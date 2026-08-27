import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gqq extends gqr {
   @Nullable
   private CompletableFuture<gqr.a> f;

   public gqq(aud $$0, akt $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gqr.a.a($$0, $$1), $$2);
   }

   @Override
   protected gqr.a b(aud $$0) {
      if (this.f != null) {
         gqr.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gqr.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gqz $$0, aud $$1, akt $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gqr.a.a($$1, this.e), ad.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
