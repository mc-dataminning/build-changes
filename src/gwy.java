import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gwy extends gwz {
   @Nullable
   private CompletableFuture<gwz.a> e;

   public gwy(auv $$0, ale $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gwz.a.a($$0, $$1), $$2);
   }

   @Override
   protected gwz.a b(auv $$0) {
      if (this.e != null) {
         gwz.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gwz.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gxh $$0, auv $$1, ale $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gwz.a.a($$1, this.d), ad.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
