public class fzz extends fzu<gwf> {
   public fzz(gbm $$0) {
      super($$0);
   }

   public static gbs a() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("head", gbr.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new gbq(0.6F)), gbo.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gbr.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new gbq(1.75F)), gbo.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gbr $$2 = gbr.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new gbq(0.5F));
      $$1.a("right_hind_leg", $$2, gbo.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gbo.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, gbo.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gbo.a(3.0F, 12.0F, -5.0F));
      return gbs.a($$0, 64, 32);
   }

   public void a(gwf $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ab;
      this.b.e = $$0.b;
   }
}
