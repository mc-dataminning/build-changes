import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface giw {
   giw a = new giw() {
      @Override
      public fgn a(fgu $$0, hbm $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkv.c);
         RenderSystem.setShaderTexture(0, hbk.d);
         return $$0.a(fgx.c.h, fgq.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   giw b = new giw() {
      @Override
      public fgn a(fgu $$0, hbm $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkv.c);
         RenderSystem.setShaderTexture(0, hbk.e);
         return $$0.a(fgx.c.h, fgq.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   giw c = new giw() {
      @Override
      public fgn a(fgu $$0, hbm $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkv.c);
         RenderSystem.setShaderTexture(0, hbk.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fgx.c.h, fgq.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   giw d = new giw() {
      @Override
      public fgn a(fgu $$0, hbm $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fgx.c.h, fgq.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   giw e = new giw() {
      @Nullable
      @Override
      public fgn a(fgu $$0, hbm $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fgn a(fgu var1, hbm var2);
}
