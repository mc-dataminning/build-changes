import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class fym extends fyn {
   @Nullable
   private CompletableFuture<fyn.a> f;

   public fym(anm $$0, aer $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> fyn.a.a($$0, $$1), $$2);
   }

   @Override
   protected fyn.a b(anm $$0) {
      if (this.f != null) {
         fyn.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return fyn.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(fyv $$0, anm $$1, aer $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> fyn.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
