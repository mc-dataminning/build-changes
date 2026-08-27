import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gbm extends gbn {
   @Nullable
   private CompletableFuture<gbn.a> f;

   public gbm(aph $$0, agi $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gbn.a.a($$0, $$1), $$2);
   }

   @Override
   protected gbn.a b(aph $$0) {
      if (this.f != null) {
         gbn.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gbn.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gbv $$0, aph $$1, agi $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gbn.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
