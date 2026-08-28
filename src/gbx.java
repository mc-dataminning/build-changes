import com.mojang.blaze3d.systems.RenderSystem;

public interface gbx {
   gbx a = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpp.e);
         $$0.a(fat.b.h, fam.l);
      }

      @Override
      public void a(faq $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbx b = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdy::t);
         RenderSystem.setShaderTexture(0, gpp.f);
         $$0.a(fat.b.h, fam.l);
      }

      @Override
      public void a(faq $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbx c = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpp.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fat.b.h, fam.l);
      }

      @Override
      public void a(faq $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbx d = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpp.f);
         $$0.a(fat.b.h, fam.l);
      }

      @Override
      public void a(faq $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbx e = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(faq $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbx f = new gbx() {
      @Override
      public void a(faj $$0, gpr $$1) {
      }

      @Override
      public void a(faq $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(faj var1, gpr var2);

   void a(faq var1);
}
