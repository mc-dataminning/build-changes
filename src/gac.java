import com.mojang.blaze3d.systems.RenderSystem;

public interface gac {
   gac a = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gnu.e);
         $$0.a(eyx.b.h, eyq.l);
      }

      @Override
      public void a(eyu $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gac b = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gcd::u);
         RenderSystem.setShaderTexture(0, gnu.f);
         $$0.a(eyx.b.h, eyq.l);
      }

      @Override
      public void a(eyu $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gac c = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gnu.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eyx.b.h, eyq.l);
      }

      @Override
      public void a(eyu $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gac d = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gnu.f);
         $$0.a(eyx.b.h, eyq.l);
      }

      @Override
      public void a(eyu $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gac e = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eyu $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gac f = new gac() {
      @Override
      public void a(eyn $$0, gnw $$1) {
      }

      @Override
      public void a(eyu $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(eyn var1, gnw var2);

   void a(eyu var1);
}
