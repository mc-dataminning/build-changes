import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gyw extends gyx {
   @Nullable
   private CompletableFuture<gyx.a> e;

   public gyw(avd $$0, alj $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gyx.a.a($$0, $$1), $$2);
   }

   @Override
   protected gyx.a b(avd $$0) {
      if (this.e != null) {
         gyx.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gyx.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gzf $$0, avd $$1, alj $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gyx.a.a($$1, this.d), ae.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
