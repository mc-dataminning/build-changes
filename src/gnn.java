import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gnn extends gno {
   @Nullable
   private CompletableFuture<gno.a> f;

   public gnn(atw $$0, akm $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gno.a.a($$0, $$1), $$2);
   }

   @Override
   protected gno.a b(atw $$0) {
      if (this.f != null) {
         gno.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gno.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gnw $$0, atw $$1, akm $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gno.a.a($$1, this.e), ac.g());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
