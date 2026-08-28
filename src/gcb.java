public class gcb extends gda<gys> {
   private final ggc a;
   private final ggc b;
   private final ggc c;
   private final ggc d;
   private final ggc e;
   private final ggc f;
   private final ggc g;

   public gcb(ggc $$0) {
      super($$0, gnh::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      ggm $$2 = $$1.a("body", ggh.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gge.a(0.0F, 17.0F, 0.0F));
      ggm $$3 = $$1.a("head", ggh.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gge.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", ggh.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gge.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", ggh.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gge.a(1.1F, -3.0F, 0.0F));
      ggm $$4 = $$2.a("right_wing", ggh.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gge.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", ggh.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gge.a(-2.0F, 0.0F, 0.0F));
      ggm $$5 = $$2.a("left_wing", ggh.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gge.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", ggh.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gge.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", ggh.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gge.a(0.0F, 5.0F, 0.0F));
      return ggi.a($$0, 32, 32);
   }

   public void a(gys $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fmy.b, $$0.u, 1.0F);
      this.a($$0.c, fmy.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
