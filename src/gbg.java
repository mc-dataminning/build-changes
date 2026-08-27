import com.mojang.blaze3d.systems.RenderSystem;

public class gbg {
   public static final akf a = new akf("textures/gui/title/background/panorama_overlay.png");
   private final fcu b;
   private final gas c;
   private float d;
   private float e;

   public gbg(gas $$0) {
      this.c = $$0;
      this.b = fcu.Q();
   }

   public void a(feh $$0, int $$1, int $$2, float $$3, float $$4) {
      float $$5 = (float)((double)$$4 * this.b.m.s().c());
      this.d = a(this.d + $$5 * 0.1F, 360.0F);
      this.e = a(this.e + $$5 * 0.001F, (float) (Math.PI * 2));
      this.c.a(this.b, 10.0F, -this.d, $$3);
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, $$3);
      $$0.a(a, 0, 0, $$1, $$2, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static float a(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }
}
