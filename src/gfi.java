import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gfi {
   gfi a = new gfi() {
      @Override
      public fdo a(fdv $$0, gxt $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghg.c);
         RenderSystem.setShaderTexture(0, gxr.d);
         return $$0.a(fdy.c.h, fdr.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gfi b = new gfi() {
      @Override
      public fdo a(fdv $$0, gxt $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghg.c);
         RenderSystem.setShaderTexture(0, gxr.e);
         return $$0.a(fdy.c.h, fdr.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gfi c = new gfi() {
      @Override
      public fdo a(fdv $$0, gxt $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghg.c);
         RenderSystem.setShaderTexture(0, gxr.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fdy.c.h, fdr.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gfi d = new gfi() {
      @Override
      public fdo a(fdv $$0, gxt $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fdy.c.h, fdr.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gfi e = new gfi() {
      @Nullable
      @Override
      public fdo a(fdv $$0, gxt $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fdo a(fdv var1, gxt var2);
}
