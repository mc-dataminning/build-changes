import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface ggj {
   ggj a = new ggj() {
      @Override
      public fef a(fem $$0, gyu $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gih.c);
         RenderSystem.setShaderTexture(0, gys.d);
         return $$0.a(fep.c.h, fei.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   ggj b = new ggj() {
      @Override
      public fef a(fem $$0, gyu $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gih.c);
         RenderSystem.setShaderTexture(0, gys.e);
         return $$0.a(fep.c.h, fei.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   ggj c = new ggj() {
      @Override
      public fef a(fem $$0, gyu $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gih.c);
         RenderSystem.setShaderTexture(0, gys.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fep.c.h, fei.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   ggj d = new ggj() {
      @Override
      public fef a(fem $$0, gyu $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fep.c.h, fei.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   ggj e = new ggj() {
      @Nullable
      @Override
      public fef a(fem $$0, gyu $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fef a(fem var1, gyu var2);
}
