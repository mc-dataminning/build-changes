import com.mojang.blaze3d.systems.RenderSystem;

public interface gbf {
   gbf a = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gox.e);
         $$0.a(fac.b.h, ezv.l);
      }

      @Override
      public void a(ezz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   gbf b = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gdg::t);
         RenderSystem.setShaderTexture(0, gox.f);
         $$0.a(fac.b.h, ezv.l);
      }

      @Override
      public void a(ezz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   gbf c = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gox.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(fac.b.h, ezv.l);
      }

      @Override
      public void a(ezz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   gbf d = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gox.f);
         $$0.a(fac.b.h, ezv.l);
      }

      @Override
      public void a(ezz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   gbf e = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ezz $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   gbf f = new gbf() {
      @Override
      public void a(ezs $$0, goz $$1) {
      }

      @Override
      public void a(ezz $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ezs var1, goz var2);

   void a(ezz var1);
}
