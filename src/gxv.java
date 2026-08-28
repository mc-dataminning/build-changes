import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gxv extends gxw {
   @Nullable
   private CompletableFuture<gxw.a> e;

   public gxv(avb $$0, ali $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gxw.a.a($$0, $$1), $$2);
   }

   @Override
   protected gxw.a b(avb $$0) {
      if (this.e != null) {
         gxw.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gxw.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gye $$0, avb $$1, ali $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gxw.a.a($$1, this.d), ae.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
