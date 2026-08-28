import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gei {
   gei a = new gei() {
      @Override
      public fcp a(fcw $$0, gwl $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggl::s);
         RenderSystem.setShaderTexture(0, gwj.d);
         return $$0.a(fcz.c.h, fcs.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gei b = new gei() {
      @Override
      public fcp a(fcw $$0, gwl $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggl::s);
         RenderSystem.setShaderTexture(0, gwj.e);
         return $$0.a(fcz.c.h, fcs.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gei c = new gei() {
      @Override
      public fcp a(fcw $$0, gwl $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggl::s);
         RenderSystem.setShaderTexture(0, gwj.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fcz.c.h, fcs.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gei d = new gei() {
      @Override
      public fcp a(fcw $$0, gwl $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fcz.c.h, fcs.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gei e = new gei() {
      @Nullable
      @Override
      public fcp a(fcw $$0, gwl $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fcp a(fcw var1, gwl var2);
}
