import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gip {
   gip a = new gip() {
      @Override
      public fgg a(fgn $$0, hbf $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gko.c);
         RenderSystem.setShaderTexture(0, hbd.d);
         return $$0.a(fgq.c.h, fgj.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gip b = new gip() {
      @Override
      public fgg a(fgn $$0, hbf $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gko.c);
         RenderSystem.setShaderTexture(0, hbd.e);
         return $$0.a(fgq.c.h, fgj.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gip c = new gip() {
      @Override
      public fgg a(fgn $$0, hbf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gko.c);
         RenderSystem.setShaderTexture(0, hbd.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fgq.c.h, fgj.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gip d = new gip() {
      @Override
      public fgg a(fgn $$0, hbf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fgq.c.h, fgj.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gip e = new gip() {
      @Nullable
      @Override
      public fgg a(fgn $$0, hbf $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fgg a(fgn var1, hbf var2);
}
