import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class hbd extends hbe {
   @Nullable
   private CompletableFuture<hbe.a> e;

   public hbd(avv $$0, alz $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> hbe.a.a($$0, $$1), $$2);
   }

   @Override
   protected hbe.a b(avv $$0) {
      if (this.e != null) {
         hbe.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return hbe.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(hbm $$0, avv $$1, alz $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> hbe.a.a($$1, this.d), ae.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
