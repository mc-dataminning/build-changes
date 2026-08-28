import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface ggs {
   ggs a = new ggs() {
      @Override
      public fem a(fet $$0, gzf $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(giq.c);
         RenderSystem.setShaderTexture(0, gzd.d);
         return $$0.a(few.c.h, fep.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   ggs b = new ggs() {
      @Override
      public fem a(fet $$0, gzf $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(giq.c);
         RenderSystem.setShaderTexture(0, gzd.e);
         return $$0.a(few.c.h, fep.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   ggs c = new ggs() {
      @Override
      public fem a(fet $$0, gzf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(giq.c);
         RenderSystem.setShaderTexture(0, gzd.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(few.c.h, fep.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   ggs d = new ggs() {
      @Override
      public fem a(fet $$0, gzf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(few.c.h, fep.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   ggs e = new ggs() {
      @Nullable
      @Override
      public fem a(fet $$0, gzf $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fem a(fet var1, gzf var2);
}
