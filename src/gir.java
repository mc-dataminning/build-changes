import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gir extends gis {
   @Nullable
   private CompletableFuture<gis.a> f;

   public gir(aso $$0, ajh $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gis.a.a($$0, $$1), $$2);
   }

   @Override
   protected gis.a b(aso $$0) {
      if (this.f != null) {
         gis.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gis.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gja $$0, aso $$1, ajh $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gis.a.a($$1, this.e), ac.f());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
