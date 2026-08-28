import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface giu {
   giu a = new giu() {
      @Override
      public fgl a(fgs $$0, hbk $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkt.c);
         RenderSystem.setShaderTexture(0, hbi.d);
         return $$0.a(fgv.c.h, fgo.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   giu b = new giu() {
      @Override
      public fgl a(fgs $$0, hbk $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkt.c);
         RenderSystem.setShaderTexture(0, hbi.e);
         return $$0.a(fgv.c.h, fgo.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   giu c = new giu() {
      @Override
      public fgl a(fgs $$0, hbk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gkt.c);
         RenderSystem.setShaderTexture(0, hbi.e);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fgv.c.h, fgo.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   giu d = new giu() {
      @Override
      public fgl a(fgs $$0, hbk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fgv.c.h, fgo.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   giu e = new giu() {
      @Nullable
      @Override
      public fgl a(fgs $$0, hbk $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fgl a(fgs var1, hbk var2);
}
