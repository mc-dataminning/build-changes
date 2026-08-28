import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gxk extends gxl {
   @Nullable
   private CompletableFuture<gxl.a> e;

   public gxk(ava $$0, alh $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gxl.a.a($$0, $$1), $$2);
   }

   @Override
   protected gxl.a b(ava $$0) {
      if (this.e != null) {
         gxl.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gxl.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gxt $$0, ava $$1, alh $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gxl.a.a($$1, this.d), ad.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
