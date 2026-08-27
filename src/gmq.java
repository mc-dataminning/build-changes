import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gmq extends gmr {
   @Nullable
   private CompletableFuture<gmr.a> f;

   public gmq(atr $$0, akh $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gmr.a.a($$0, $$1), $$2);
   }

   @Override
   protected gmr.a b(atr $$0) {
      if (this.f != null) {
         gmr.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gmr.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gmz $$0, atr $$1, akh $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gmr.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
