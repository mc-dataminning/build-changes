import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class gwt extends gwu {
   @Nullable
   private CompletableFuture<gwu.a> e;

   public gwt(aut $$0, alc $$1, Executor $$2) {
      super($$1);
      this.e = CompletableFuture.supplyAsync(() -> gwu.a.a($$0, $$1), $$2);
   }

   @Override
   protected gwu.a b(aut $$0) {
      if (this.e != null) {
         gwu.a $$1 = this.e.join();
         this.e = null;
         return $$1;
      } else {
         return gwu.a.a($$0, this.d);
      }
   }

   public CompletableFuture<Void> e() {
      return this.e == null ? CompletableFuture.completedFuture(null) : this.e.thenApply($$0 -> null);
   }

   @Override
   public void a(gxc $$0, aut $$1, alc $$2, Executor $$3) {
      this.e = CompletableFuture.supplyAsync(() -> gwu.a.a($$1, this.d), ad.g());
      this.e.thenRunAsync(() -> $$0.a(this.d, this), a($$3));
   }

   private static Executor a(Executor $$0) {
      return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
   }
}
