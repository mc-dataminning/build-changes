import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gyl extends gym {
   @Nullable
   private CompletableFuture<gym.a> e;

   public gyl(ave $$0, all $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gym.a.a($$0, $$1), $$2);
   }

   @Override
   protected gym.a b(ave $$0) {
      if (this.e != null) {
         gym.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gym.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gyu $$0, ave $$1, all $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gym.a.a($$1, this.d), ae.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
