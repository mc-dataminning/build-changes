import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class fyd extends fye {
   @Nullable
   private CompletableFuture<fye.a> f;

   public fyd(anm $$0, aer $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> fye.a.a($$0, $$1), $$2);
   }

   @Override
   protected fye.a b(anm $$0) {
      if (this.f != null) {
         fye.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return fye.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(fym $$0, anm $$1, aer $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> fye.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
