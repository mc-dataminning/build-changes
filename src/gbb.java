import com.mojang.blaze3d.systems.RenderSystem;

public interface gbb {
   gbb a = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, got.e);
         $$0.a(ezy.b.h, ezr.l);
      }

      @Override
      public void a(ezv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbb b = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdc::u);
         RenderSystem.setShaderTexture(0, got.f);
         $$0.a(ezy.b.h, ezr.l);
      }

      @Override
      public void a(ezv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbb c = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, got.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(ezy.b.h, ezr.l);
      }

      @Override
      public void a(ezv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbb d = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, got.f);
         $$0.a(ezy.b.h, ezr.l);
      }

      @Override
      public void a(ezv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbb e = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ezv $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbb f = new gbb() {
      @Override
      public void a(ezo $$0, gov $$1) {
      }

      @Override
      public void a(ezv $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezo var1, gov var2);

   void a(ezv var1);
}
