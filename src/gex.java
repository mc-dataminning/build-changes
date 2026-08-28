import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gex {
   gex a = new gex() {
      @Override
      public fdd a(fdk $$0, gxh $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggv.c);
         RenderSystem.setShaderTexture(0, gxf.d);
         return $$0.a(fdn.c.h, fdg.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gex b = new gex() {
      @Override
      public fdd a(fdk $$0, gxh $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggv.c);
         RenderSystem.setShaderTexture(0, gxf.e);
         return $$0.a(fdn.c.h, fdg.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gex c = new gex() {
      @Override
      public fdd a(fdk $$0, gxh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggv.c);
         RenderSystem.setShaderTexture(0, gxf.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fdn.c.h, fdg.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gex d = new gex() {
      @Override
      public fdd a(fdk $$0, gxh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fdn.c.h, fdg.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gex e = new gex() {
      @Nullable
      @Override
      public fdd a(fdk $$0, gxh $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fdd a(fdk var1, gxh var2);
}
