public class fxn extends fyk<gtx> {
   private final gbm a;
   private final gbm b;
   private final gbm c;
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;

   public fxn(gbm $$0) {
      super($$0, gir::e);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("body", gbr.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gbo.a(0.0F, 17.0F, 0.0F));
      gbw $$3 = $$1.a("head", gbr.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gbo.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gbr.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gbo.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gbr.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gbo.a(1.1F, -3.0F, 0.0F));
      gbw $$4 = $$2.a("right_wing", gbr.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gbo.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gbr.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gbo.a(-2.0F, 0.0F, 0.0F));
      gbw $$5 = $$2.a("left_wing", gbr.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gbo.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gbr.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gbo.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gbr.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gbo.a(0.0F, 5.0F, 0.0F));
      return gbs.a($$0, 32, 32);
   }

   public void a(gtx $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fkb.b, $$0.p, 1.0F);
      this.a($$0.c, fkb.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
