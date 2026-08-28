import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;

public abstract class hek extends hee {
   private final akv d;

   public hek(akv $$0) {
      this.d = $$0;
   }

   public akv d() {
      return this.d;
   }

   public void a(heu $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.c = $$2;
      fev $$3 = $$0.d();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$3, $$2, $$1));
      } else {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fev $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      this.a($$1, false);
      this.a($$2);
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), true);
   }

   public abstract heu a(aup var1) throws IOException;
}
