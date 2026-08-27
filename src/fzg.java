import com.mojang.blaze3d.systems.RenderSystem;

public interface fzg {
   fzg a = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmx.e);
         $$0.a(eyc.b.h, exv.l);
      }

      @Override
      public void a(exz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fzg b = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(gbh::u);
         RenderSystem.setShaderTexture(0, gmx.f);
         $$0.a(eyc.b.h, exv.l);
      }

      @Override
      public void a(exz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fzg c = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmx.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eyc.b.h, exv.l);
      }

      @Override
      public void a(exz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fzg d = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gmx.f);
         $$0.a(eyc.b.h, exv.l);
      }

      @Override
      public void a(exz $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fzg e = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(exz $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fzg f = new fzg() {
      @Override
      public void a(exs $$0, gmz $$1) {
      }

      @Override
      public void a(exz $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(exs var1, gmz var2);

   void a(exz var1);
}
