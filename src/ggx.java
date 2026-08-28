public class ggx {
   public static final alb a = alb.b("textures/gui/title/background/panorama_overlay.png");
   private final fib b;
   private final ggf c;
   private float d;

   public ggx(ggf $$0) {
      this.c = $$0;
      this.b = fib.Q();
   }

   public void a(fjn $$0, int $$1, int $$2, float $$3, float $$4) {
      float $$5 = this.b.au().b();
      float $$6 = (float)((double)$$5 * this.b.n.t().c());
      this.d = a(this.d + $$6 * 0.1F, 360.0F);
      $$0.e();
      this.c.a(this.b, 10.0F, -this.d, $$3);
      $$0.e();
      $$0.a(ghe::C, a, 0, 0, 0.0F, 0.0F, $$1, $$2, 16, 128, 16, 128, axn.a($$3));
   }

   private static float a(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }
}
