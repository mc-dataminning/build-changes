import com.mojang.blaze3d.systems.RenderSystem;

public interface fui {
   fui a = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ghy.e);
         $$0.a(eti.b.h, etb.l);
      }

      @Override
      public void a(etf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fui b = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fwj::u);
         RenderSystem.setShaderTexture(0, ghy.f);
         $$0.a(eti.b.h, etb.l);
      }

      @Override
      public void a(etf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fui c = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ghy.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eti.b.h, etb.l);
      }

      @Override
      public void a(etf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fui d = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ghy.f);
         $$0.a(eti.b.h, etb.l);
      }

      @Override
      public void a(etf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fui e = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(etf $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fui f = new fui() {
      @Override
      public void a(esy $$0, gia $$1) {
      }

      @Override
      public void a(etf $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(esy var1, gia var2);

   void a(etf var1);
}
