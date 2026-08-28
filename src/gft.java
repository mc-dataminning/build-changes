import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gft {
   gft a = new gft() {
      @Override
      public fdw a(fed $$0, gye $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghr.c);
         RenderSystem.setShaderTexture(0, gyc.d);
         return $$0.a(feg.c.h, fdz.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gft b = new gft() {
      @Override
      public fdw a(fed $$0, gye $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghr.c);
         RenderSystem.setShaderTexture(0, gyc.e);
         return $$0.a(feg.c.h, fdz.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gft c = new gft() {
      @Override
      public fdw a(fed $$0, gye $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ghr.c);
         RenderSystem.setShaderTexture(0, gyc.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(feg.c.h, fdz.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gft d = new gft() {
      @Override
      public fdw a(fed $$0, gye $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(feg.c.h, fdz.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gft e = new gft() {
      @Nullable
      @Override
      public fdw a(fed $$0, gye $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fdw a(fed var1, gye var2);
}
