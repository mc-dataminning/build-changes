import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class heb extends hec {
   @Nullable
   private CompletableFuture<hec.a> e;

   public heb(aup $$0, aku $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> hec.a.a($$0, $$1), $$2);
   }

   @Override
   protected hec.a b(aup $$0) {
      if (this.e != null) {
         hec.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return hec.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(hek $$0, aup $$1, aku $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> hec.a.a($$1, this.d), af.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
