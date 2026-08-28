import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface giv {
   giv a = new giv() {
      @Override
      public fgm a(fgt $$0, hbl $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gku.c);
         RenderSystem.setShaderTexture(0, hbj.d);
         return $$0.a(fgw.c.h, fgp.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   giv b = new giv() {
      @Override
      public fgm a(fgt $$0, hbl $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gku.c);
         RenderSystem.setShaderTexture(0, hbj.e);
         return $$0.a(fgw.c.h, fgp.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   giv c = new giv() {
      @Override
      public fgm a(fgt $$0, hbl $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gku.c);
         RenderSystem.setShaderTexture(0, hbj.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fgw.c.h, fgp.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   giv d = new giv() {
      @Override
      public fgm a(fgt $$0, hbl $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fgw.c.h, fgp.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   giv e = new giv() {
      @Nullable
      @Override
      public fgm a(fgt $$0, hbl $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fgm a(fgt var1, hbl var2);
}
