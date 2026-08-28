import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gcl {
   gcl a = new gcl() {
      @Override
      public fax a(fbe $$0, gqg $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqe.e);
         return $$0.a(fbh.c.h, fba.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gcl b = new gcl() {
      @Override
      public fax a(fbe $$0, gqg $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gem::s);
         RenderSystem.setShaderTexture(0, gqe.f);
         return $$0.a(fbh.c.h, fba.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gcl c = new gcl() {
      @Override
      public fax a(fbe $$0, gqg $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqe.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fbh.c.h, fba.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gcl d = new gcl() {
      @Override
      public fax a(fbe $$0, gqg $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqe.f);
         return $$0.a(fbh.c.h, fba.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gcl e = new gcl() {
      @Override
      public fax a(fbe $$0, gqg $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fbh.c.h, fba.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gcl f = new gcl() {
      @Nullable
      @Override
      public fax a(fbe $$0, gqg $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fax a(fbe var1, gqg var2);
}
