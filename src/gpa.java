import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gpa extends gpb {
   @Nullable
   private CompletableFuture<gpb.a> f;

   public gpa(atu $$0, akk $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> gpb.a.a($$0, $$1), $$2);
   }

   @Override
   protected gpb.a b(atu $$0) {
      if (this.f != null) {
         gpb.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return gpb.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gpj $$0, atu $$1, akk $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> gpb.a.a($$1, this.e), ac.g());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
