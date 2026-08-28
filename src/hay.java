import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class hay extends haz {
   @Nullable
   private CompletableFuture<haz.a> e;

   public hay(avl $$0, alp $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> haz.a.a($$0, $$1), $$2);
   }

   @Override
   protected haz.a b(avl $$0) {
      if (this.e != null) {
         haz.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return haz.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(hbh $$0, avl $$1, alp $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> haz.a.a($$1, this.d), ae.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
