import com.mojang.blaze3d.systems.RenderSystem;

public interface gbg {
   gbg a = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goy.e);
         $$0.a(fad.b.h, ezw.l);
      }

      @Override
      public void a(faa $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbg b = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdh::t);
         RenderSystem.setShaderTexture(0, goy.f);
         $$0.a(fad.b.h, ezw.l);
      }

      @Override
      public void a(faa $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbg c = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goy.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fad.b.h, ezw.l);
      }

      @Override
      public void a(faa $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbg d = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, goy.f);
         $$0.a(fad.b.h, ezw.l);
      }

      @Override
      public void a(faa $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbg e = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(faa $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbg f = new gbg() {
      @Override
      public void a(ezt $$0, gpa $$1) {
      }

      @Override
      public void a(faa $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezt var1, gpa var2);

   void a(faa var1);
}
