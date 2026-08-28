import com.mojang.blaze3d.systems.RenderSystem;

public interface gbh {
   gbh a = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goz.e);
         $$0.a(fae.b.h, ezx.l);
      }

      @Override
      public void a(fab $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbh b = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdi::t);
         RenderSystem.setShaderTexture(0, goz.f);
         $$0.a(fae.b.h, ezx.l);
      }

      @Override
      public void a(fab $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbh c = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goz.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fae.b.h, ezx.l);
      }

      @Override
      public void a(fab $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbh d = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goz.f);
         $$0.a(fae.b.h, ezx.l);
      }

      @Override
      public void a(fab $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbh e = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(fab $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbh f = new gbh() {
      @Override
      public void a(ezu $$0, gpb $$1) {
      }

      @Override
      public void a(fab $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezu var1, gpb var2);

   void a(fab var1);
}
