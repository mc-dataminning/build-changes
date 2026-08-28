public class gpg {
   public static final ale a = ale.b("textures/gui/title/background/panorama_overlay.png");
   private final fof b;
   private final goo c;
   private float d;

   public gpg(goo $$0) {
      this.c = $$0;
      this.b = fof.Q();
   }

   public void a(frc $$0, int $$1, int $$2, float $$3, float $$4) {
      float $$5 = this.b.av().b();
      float $$6 = (float)((double)$$5 * this.b.n.t().c());
      this.d = a(this.d + $$6 * 0.1F, 360.0F);
      $$0.d();
      this.c.a(this.b, 10.0F, -this.d, $$3);
      $$0.d();
      $$0.a(gpn::H, a, 0, 0, 0.0F, 0.0F, $$1, $$2, 16, 128, 16, 128, axu.a($$3));
   }

   private static float a(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }
}
