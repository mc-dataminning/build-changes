import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;

public abstract class hfi extends hfc {
   private final aku d;

   public hfi(aku $$0) {
      this.d = $$0;
   }

   public aku d() {
      return this.d;
   }

   public void a(hfs $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.c = $$2;
      ffr $$3 = $$0.d();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$3, $$2, $$1));
      } else {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(ffr $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      this.a($$1, false);
      this.a($$2);
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), true);
   }

   public abstract hfs a(aup var1) throws IOException;
}
