import com.mojang.blaze3d.systems.RenderSystem;

public interface fvi {
   fvi a = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, giy.e);
         $$0.a(eue.b.h, etx.l);
      }

      @Override
      public void a(eub $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fvi b = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fxj::u);
         RenderSystem.setShaderTexture(0, giy.f);
         $$0.a(eue.b.h, etx.l);
      }

      @Override
      public void a(eub $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fvi c = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, giy.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eue.b.h, etx.l);
      }

      @Override
      public void a(eub $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fvi d = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, giy.f);
         $$0.a(eue.b.h, etx.l);
      }

      @Override
      public void a(eub $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fvi e = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eub $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fvi f = new fvi() {
      @Override
      public void a(etu $$0, gja $$1) {
      }

      @Override
      public void a(eub $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(etu var1, gja var2);

   void a(eub var1);
}
