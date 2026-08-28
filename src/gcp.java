import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public interface gcp {
   gcp a = new gcp() {
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqi.e);
         return $$0.a(fbl.c.h, fbe.d);
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gcp b = new gcp() {
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(geq::s);
         RenderSystem.setShaderTexture(0, gqi.f);
         return $$0.a(fbl.c.h, fbe.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gcp c = new gcp() {
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqi.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         return $$0.a(fbl.c.h, fbe.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gcp d = new gcp() {
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqi.f);
         return $$0.a(fbl.c.h, fbe.d);
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gcp e = new gcp() {
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         return $$0.a(fbl.c.h, fbe.d);
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gcp f = new gcp() {
      @Nullable
      @Override
      public fbb a(fbi $$0, gqk $$1) {
         return null;
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   @Nullable
   fbb a(fbi var1, gqk var2);
}
