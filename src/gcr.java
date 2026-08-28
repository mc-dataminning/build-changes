import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gcr {
   gcr a = new gcr() {
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqk.e);
         return $$0.a(fbn.c.h, fbg.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gcr b = new gcr() {
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ges::s);
         RenderSystem.setShaderTexture(0, gqk.f);
         return $$0.a(fbn.c.h, fbg.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gcr c = new gcr() {
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqk.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fbn.c.h, fbg.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gcr d = new gcr() {
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqk.f);
         return $$0.a(fbn.c.h, fbg.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gcr e = new gcr() {
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fbn.c.h, fbg.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gcr f = new gcr() {
      @Nullable
      @Override
      public fbd a(fbk $$0, gqm $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fbd a(fbk var1, gqm var2);
}
