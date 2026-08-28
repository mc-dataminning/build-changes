import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class gye implements AutoCloseable {
   public static final int a = -1;
   protected int b = -1;
   protected boolean c;

   public void a(boolean $$0, boolean $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      int $$2;
      int $$3;
      if ($$0) {
         $$2 = $$1 ? 9987 : 9729;
         $$3 = 9729;
      } else {
         $$2 = $$1 ? 9986 : 9728;
         $$3 = 9728;
      }

      this.d();
      GlStateManager._texParameter(3553, 10241, $$2);
      GlStateManager._texParameter(3553, 10240, $$3);
   }

   public int a() {
      RenderSystem.assertOnRenderThreadOrInit();
      if (this.b == -1) {
         this.b = TextureUtil.generateTextureId();
      }

      return this.b;
   }

   public void b() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            if (this.b != -1) {
               TextureUtil.releaseTextureId(this.b);
               this.b = -1;
            }
         });
      } else if (this.b != -1) {
         TextureUtil.releaseTextureId(this.b);
         this.b = -1;
      }
   }

   public boolean c() {
      return this.c;
   }

   public abstract void a(ave var1) throws IOException;

   public void d() {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> GlStateManager._bindTexture(this.a()));
      } else {
         GlStateManager._bindTexture(this.a());
      }
   }

   public void a(gyu $$0, ave $$1, all $$2, Executor $$3) {
      $$0.a($$2, this);
   }

   @Override
   public void close() {
   }
}
