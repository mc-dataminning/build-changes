public class gbc extends gca<gxs> {
   private final gfc a;
   private final gfc b;
   private final gfc c;
   private final gfc d;
   private final gfc e;
   private final gfc f;
   private final gfc g;

   public gbc(gfc $$0) {
      super($$0, gmh::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("body", gfh.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gfe.a(0.0F, 17.0F, 0.0F));
      gfm $$3 = $$1.a("head", gfh.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gfe.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gfh.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gfe.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gfh.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gfe.a(1.1F, -3.0F, 0.0F));
      gfm $$4 = $$2.a("right_wing", gfh.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gfe.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gfh.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gfe.a(-2.0F, 0.0F, 0.0F));
      gfm $$5 = $$2.a("left_wing", gfh.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gfe.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gfh.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gfe.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gfh.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gfe.a(0.0F, 5.0F, 0.0F));
      return gfi.a($$0, 32, 32);
   }

   public void a(gxs $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fma.b, $$0.u, 1.0F);
      this.a($$0.c, fma.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
