import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gef extends geg {
   @Nullable
   private CompletableFuture<geg.a> f;

   public gef(aqi $$0, ahg $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> geg.a.a($$0, $$1), $$2);
   }

   @Override
   protected geg.a b(aqi $$0) {
      if (this.f != null) {
         geg.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return geg.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(geo $$0, aqi $$1, ahg $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> geg.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
