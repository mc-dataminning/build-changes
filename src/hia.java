import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;

public abstract class hia implements AutoCloseable {
   public static final int a = -1;
   protected int b = -1;
   protected boolean c;
   private int d = 10497;
   private int e = 10497;
   private int f = 9986;
   private int g = 9729;

   public void a(boolean $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      int $$1;
      int $$2;
      if ($$0) {
         $$1 = 33071;
         $$2 = 33071;
      } else {
         $$1 = 10497;
         $$2 = 10497;
      }

      boolean $$5 = this.d != $$1;
      boolean $$6 = this.e != $$2;
      if ($$5 || $$6) {
         this.c();
         if ($$5) {
            GlStateManager._texParameter(3553, 10242, $$1);
            this.d = $$1;
         }

         if ($$6) {
            GlStateManager._texParameter(3553, 10243, $$2);
            this.e = $$2;
         }
      }
   }

   public void a(bas $$0, boolean $$1) {
      this.a($$0.a(this.c), $$1);
   }

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

      boolean $$6 = this.f != $$2;
      boolean $$7 = this.g != $$3;
      if ($$7 || $$6) {
         this.c();
         if ($$6) {
            GlStateManager._texParameter(3553, 10241, $$2);
            this.f = $$2;
         }

         if ($$7) {
            GlStateManager._texParameter(3553, 10240, $$3);
            this.g = $$3;
         }
      }
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

   public void c() {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> GlStateManager._bindTexture(this.a()));
      } else {
         GlStateManager._bindTexture(this.a());
      }
   }

   @Override
   public void close() {
   }
}
