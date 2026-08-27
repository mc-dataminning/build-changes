import com.mojang.blaze3d.systems.RenderSystem;

public interface fyw {
   fyw a = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmn.e);
         $$0.a(exs.b.h, exl.l);
      }

      @Override
      public void a(exp $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fyw b = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gax::u);
         RenderSystem.setShaderTexture(0, gmn.f);
         $$0.a(exs.b.h, exl.l);
      }

      @Override
      public void a(exp $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fyw c = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmn.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(exs.b.h, exl.l);
      }

      @Override
      public void a(exp $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fyw d = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmn.f);
         $$0.a(exs.b.h, exl.l);
      }

      @Override
      public void a(exp $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fyw e = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(exp $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fyw f = new fyw() {
      @Override
      public void a(exi $$0, gmp $$1) {
      }

      @Override
      public void a(exp $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(exi var1, gmp var2);

   void a(exp var1);
}
