import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface ges {
   ges a = new ges() {
      @Override
      public fcz a(fdg $$0, gxc $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggq.c);
         RenderSystem.setShaderTexture(0, gxa.d);
         return $$0.a(fdj.c.h, fdc.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   ges b = new ges() {
      @Override
      public fcz a(fdg $$0, gxc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggq.c);
         RenderSystem.setShaderTexture(0, gxa.e);
         return $$0.a(fdj.c.h, fdc.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   ges c = new ges() {
      @Override
      public fcz a(fdg $$0, gxc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ggq.c);
         RenderSystem.setShaderTexture(0, gxa.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fdj.c.h, fdc.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   ges d = new ges() {
      @Override
      public fcz a(fdg $$0, gxc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fdj.c.h, fdc.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   ges e = new ges() {
      @Nullable
      @Override
      public fcz a(fdg $$0, gxc $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fcz a(fdg var1, gxc var2);
}
