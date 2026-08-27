import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ggl extends ggm {
   @Nullable
   private CompletableFuture<ggm.a> f;

   public ggl(asa $$0, aiy $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> ggm.a.a($$0, $$1), $$2);
   }

   @Override
   protected ggm.a b(asa $$0) {
      if (this.f != null) {
         ggm.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return ggm.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(ggu $$0, asa $$1, aiy $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> ggm.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
