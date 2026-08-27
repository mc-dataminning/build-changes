import com.mojang.blaze3d.systems.RenderSystem;

public interface fxr {
   fxr a = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gli.e);
         $$0.a(ewn.b.h, ewg.l);
      }

      @Override
      public void a(ewk $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fxr b = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fzs::v);
         RenderSystem.setShaderTexture(0, gli.f);
         $$0.a(ewn.b.h, ewg.l);
      }

      @Override
      public void a(ewk $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fxr c = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gli.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(ewn.b.h, ewg.l);
      }

      @Override
      public void a(ewk $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fxr d = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gli.f);
         $$0.a(ewn.b.h, ewg.l);
      }

      @Override
      public void a(ewk $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fxr e = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ewk $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fxr f = new fxr() {
      @Override
      public void a(ewd $$0, glk $$1) {
      }

      @Override
      public void a(ewk $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ewd var1, glk var2);

   void a(ewk var1);
}
