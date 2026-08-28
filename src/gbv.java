import com.mojang.blaze3d.systems.RenderSystem;

public interface gbv {
   gbv a = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpn.e);
         $$0.a(far.b.h, fak.l);
      }

      @Override
      public void a(fao $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbv b = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdw::t);
         RenderSystem.setShaderTexture(0, gpn.f);
         $$0.a(far.b.h, fak.l);
      }

      @Override
      public void a(fao $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbv c = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpn.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(far.b.h, fak.l);
      }

      @Override
      public void a(fao $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbv d = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpn.f);
         $$0.a(far.b.h, fak.l);
      }

      @Override
      public void a(fao $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbv e = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(fao $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbv f = new gbv() {
      @Override
      public void a(fah $$0, gpp $$1) {
      }

      @Override
      public void a(fao $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(fah var1, gpp var2);

   void a(fao var1);
}
