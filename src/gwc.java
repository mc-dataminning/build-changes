import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gwc extends gwd {
   @Nullable
   private CompletableFuture<gwd.a> e;

   public gwc(aus $$0, alb $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gwd.a.a($$0, $$1), $$2);
   }

   @Override
   protected gwd.a b(aus $$0) {
      if (this.e != null) {
         gwd.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gwd.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gwl $$0, aus $$1, alb $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gwd.a.a($$1, this.d), ad.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
