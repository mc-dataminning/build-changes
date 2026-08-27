import com.mojang.blaze3d.systems.RenderSystem;

public interface fvk {
   fvk a = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gjb.e);
         $$0.a(eug.b.h, etz.l);
      }

      @Override
      public void a(eud $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fvk b = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fxl::u);
         RenderSystem.setShaderTexture(0, gjb.f);
         $$0.a(eug.b.h, etz.l);
      }

      @Override
      public void a(eud $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fvk c = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gjb.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eug.b.h, etz.l);
      }

      @Override
      public void a(eud $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fvk d = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gjb.f);
         $$0.a(eug.b.h, etz.l);
      }

      @Override
      public void a(eud $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fvk e = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eud $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fvk f = new fvk() {
      @Override
      public void a(etw $$0, gjd $$1) {
      }

      @Override
      public void a(eud $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(etw var1, gjd var2);

   void a(eud var1);
}
