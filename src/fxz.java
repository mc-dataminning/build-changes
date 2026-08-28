public class fxz extends fxk<gue> {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;

   public fxz(gal $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.c = $$0.b("right_arm");
      this.d = $$0.b("left_arm");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F), gan.a(0.0F, -7.0F, -2.0F));
      $$1.a(
         "body",
         gaq.c().a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new gap(0.5F)),
         gan.a(0.0F, -7.0F, 0.0F)
      );
      $$1.a("right_arm", gaq.c().a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gan.a(0.0F, -7.0F, 0.0F));
      $$1.a("left_arm", gaq.c().a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gan.a(0.0F, -7.0F, 0.0F));
      $$1.a("right_leg", gaq.c().a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gan.a(-4.0F, 11.0F, 0.0F));
      $$1.a("left_leg", gaq.c().a(60, 0).a().a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gan.a(5.0F, 11.0F, 0.0F));
      return gar.a($$0, 128, 128);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gue $$0) {
      float $$1 = $$0.a;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      if ($$1 > 0.0F) {
         this.c.e = -2.0F + 1.5F * azd.e($$1, 10.0F);
         this.d.e = -2.0F + 1.5F * azd.e($$1, 10.0F);
      } else {
         int $$4 = $$0.b;
         if ($$4 > 0) {
            this.c.e = -0.8F + 0.025F * azd.e((float)$$4, 70.0F);
            this.d.e = 0.0F;
         } else {
            this.c.e = (-0.2F + 1.5F * azd.e($$3, 13.0F)) * $$2;
            this.d.e = (-0.2F - 1.5F * azd.e($$3, 13.0F)) * $$2;
         }
      }

      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.e = -1.5F * azd.e($$3, 13.0F) * $$2;
      this.f.e = 1.5F * azd.e($$3, 13.0F) * $$2;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   public gal c() {
      return this.c;
   }
}
