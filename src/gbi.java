import com.mojang.blaze3d.systems.RenderSystem;

public interface gbi {
   gbi a = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpa.e);
         $$0.a(faf.b.h, ezy.l);
      }

      @Override
      public void a(fac $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbi b = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdj::t);
         RenderSystem.setShaderTexture(0, gpa.f);
         $$0.a(faf.b.h, ezy.l);
      }

      @Override
      public void a(fac $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbi c = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpa.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(faf.b.h, ezy.l);
      }

      @Override
      public void a(fac $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbi d = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gpa.f);
         $$0.a(faf.b.h, ezy.l);
      }

      @Override
      public void a(fac $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbi e = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(fac $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbi f = new gbi() {
      @Override
      public void a(ezv $$0, gpc $$1) {
      }

      @Override
      public void a(fac $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezv var1, gpc var2);

   void a(fac var1);
}
