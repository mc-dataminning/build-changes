public class gda extends gea<gzt> {
   private final ghd a;
   private final ghd b;
   private final ghd c;
   private final ghd d;
   private final ghd e;
   private final ghd f;
   private final ghd g;

   public gda(ghd $$0) {
      super($$0, goi::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("body", ghi.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), ghf.a(0.0F, 17.0F, 0.0F));
      ghn $$3 = $$1.a("head", ghi.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), ghf.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", ghi.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), ghf.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", ghi.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), ghf.a(1.1F, -3.0F, 0.0F));
      ghn $$4 = $$2.a("right_wing", ghi.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), ghf.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", ghi.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), ghf.a(-2.0F, 0.0F, 0.0F));
      ghn $$5 = $$2.a("left_wing", ghi.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), ghf.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", ghi.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), ghf.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", ghi.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), ghf.a(0.0F, 5.0F, 0.0F));
      return ghj.a($$0, 32, 32);
   }

   public void a(gzt $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fnv.b, $$0.u, 1.0F);
      this.a($$0.c, fnv.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
