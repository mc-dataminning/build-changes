import com.mojang.blaze3d.systems.RenderSystem;

public interface fya {
   fya a = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, glr.e);
         $$0.a(eww.b.h, ewp.l);
      }

      @Override
      public void a(ewt $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fya b = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gab::v);
         RenderSystem.setShaderTexture(0, glr.f);
         $$0.a(eww.b.h, ewp.l);
      }

      @Override
      public void a(ewt $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fya c = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, glr.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eww.b.h, ewp.l);
      }

      @Override
      public void a(ewt $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fya d = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, glr.f);
         $$0.a(eww.b.h, ewp.l);
      }

      @Override
      public void a(ewt $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fya e = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ewt $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fya f = new fya() {
      @Override
      public void a(ewm $$0, glt $$1) {
      }

      @Override
      public void a(ewt $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ewm var1, glt var2);

   void a(ewt var1);
}
