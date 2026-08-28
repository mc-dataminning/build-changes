import com.mojang.blaze3d.systems.RenderSystem;

public interface gbp {
   gbp a = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gph.e);
         $$0.a(fal.b.h, fae.l);
      }

      @Override
      public void a(fai $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbp b = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdq::t);
         RenderSystem.setShaderTexture(0, gph.f);
         $$0.a(fal.b.h, fae.l);
      }

      @Override
      public void a(fai $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbp c = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gph.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fal.b.h, fae.l);
      }

      @Override
      public void a(fai $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbp d = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gph.f);
         $$0.a(fal.b.h, fae.l);
      }

      @Override
      public void a(fai $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbp e = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(fai $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbp f = new gbp() {
      @Override
      public void a(fab $$0, gpj $$1) {
      }

      @Override
      public void a(fai $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(fab var1, gpj var2);

   void a(fai var1);
}
