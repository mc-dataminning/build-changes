import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gos extends got {
   @Nullable
   private CompletableFuture<got.a> f;

   public gos(aup $$0, alf $$1, Executor $$2) {
      super($$1);
      this.f = CompletableFuture.supplyAsync(() -> got.a.a($$0, $$1), $$2);
   }

   @Override
   protected got.a b(aup $$0) {
      if (this.f != null) {
         got.a $$1 = this.f.join();
         this.f = null;
         return $$1;
      } else {
         return got.a.a($$0, this.e);
      }
   }

   public CompletableFuture<Void> d() {
      return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
   }

   @Override
   public void a(gpb $$0, aup $$1, alf $$2, Executor $$3) {
      this.f = CompletableFuture.supplyAsync(() -> got.a.a($$1, this.e), ac.g());
      this.f.thenRunAsync(() -> $$0.a(this.e, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
