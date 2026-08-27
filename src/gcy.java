import com.mojang.blaze3d.systems.RenderSystem;

public interface gcy {
   gcy a = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqx.e);
         $$0.a(fbh.b.h, fba.l);
      }

      @Override
      public void a(fbe $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gcy b = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gez::u);
         RenderSystem.setShaderTexture(0, gqx.f);
         $$0.a(fbh.b.h, fba.l);
      }

      @Override
      public void a(fbe $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gcy c = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqx.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fbh.b.h, fba.l);
      }

      @Override
      public void a(fbe $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gcy d = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gqx.f);
         $$0.a(fbh.b.h, fba.l);
      }

      @Override
      public void a(fbe $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gcy e = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(fbe $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gcy f = new gcy() {
      @Override
      public void a(fax $$0, gqz $$1) {
      }

      @Override
      public void a(fbe $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(fax var1, gqz var2);

   void a(fbe var1);
}
