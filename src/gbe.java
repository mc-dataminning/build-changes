import com.mojang.blaze3d.systems.RenderSystem;

public interface gbe {
   gbe a = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gow.e);
         $$0.a(fab.b.h, ezu.l);
      }

      @Override
      public void a(ezy $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbe b = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdf::t);
         RenderSystem.setShaderTexture(0, gow.f);
         $$0.a(fab.b.h, ezu.l);
      }

      @Override
      public void a(ezy $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbe c = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gow.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fab.b.h, ezu.l);
      }

      @Override
      public void a(ezy $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbe d = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gow.f);
         $$0.a(fab.b.h, ezu.l);
      }

      @Override
      public void a(ezy $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbe e = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ezy $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbe f = new gbe() {
      @Override
      public void a(ezr $$0, goy $$1) {
      }

      @Override
      public void a(ezy $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezr var1, goy var2);

   void a(ezy var1);
}
