public class fzj extends fyk<gvv> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gbm c;
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;
   private final gbm i;

   public fzj(gbm $$0) {
      super($$0);
      gbm $$1 = $$0.b("body");
      this.g = $$1.b("tail_base");
      this.i = this.g.b("tail_tip");
      this.c = $$1.b("left_wing_base");
      this.d = this.c.b("left_wing_tip");
      this.e = $$1.b("right_wing_base");
      this.f = this.e.b("right_wing_tip");
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("body", gbr.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gbo.b(-0.1F, 0.0F, 0.0F));
      gbw $$3 = $$2.a("tail_base", gbr.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gbo.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", gbr.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gbo.a(0.0F, 0.5F, 6.0F));
      gbw $$4 = $$2.a("left_wing_base", gbr.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gbo.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", gbr.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gbo.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      gbw $$5 = $$2.a("right_wing_base", gbr.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gbo.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", gbr.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gbo.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", gbr.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gbo.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return gbs.a($$0, 64, 64);
   }

   public void a(gvv $$0) {
      super.a($$0);
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.c.g = azk.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.d.g = azk.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = -this.c.g;
      this.f.g = -this.d.g;
      this.g.e = -(5.0F + azk.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.i.e = -(5.0F + azk.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
