import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;

public abstract class hed extends hdx {
   private final aku d;

   public hed(aku $$0) {
      this.d = $$0;
   }

   public aku e() {
      return this.d;
   }

   public void a(hen $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.c = $$2;
      fes $$3 = $$0.d();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$3, $$2, $$1));
      } else {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fes $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   public abstract hen a(auo var1) throws IOException;
}
