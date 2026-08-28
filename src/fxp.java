public class fxp extends fxa<gtn> {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;

   public fxp(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.c = $$0.b("right_arm");
      this.d = $$0.b("left_arm");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F), gad.a(0.0F, -7.0F, -2.0F));
      $$1.a(
         "body",
         gag.c().a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new gaf(0.5F)),
         gad.a(0.0F, -7.0F, 0.0F)
      );
      $$1.a("right_arm", gag.c().a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gad.a(0.0F, -7.0F, 0.0F));
      $$1.a("left_arm", gag.c().a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gad.a(0.0F, -7.0F, 0.0F));
      $$1.a("right_leg", gag.c().a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gad.a(-4.0F, 11.0F, 0.0F));
      $$1.a("left_leg", gag.c().a(60, 0).a().a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gad.a(5.0F, 11.0F, 0.0F));
      return gah.a($$0, 128, 128);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gtn $$0) {
      float $$1 = $$0.a;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      if ($$1 > 0.0F) {
         this.c.e = -2.0F + 1.5F * azc.e($$1, 10.0F);
         this.d.e = -2.0F + 1.5F * azc.e($$1, 10.0F);
      } else {
         int $$4 = $$0.b;
         if ($$4 > 0) {
            this.c.e = -0.8F + 0.025F * azc.e((float)$$4, 70.0F);
            this.d.e = 0.0F;
         } else {
            this.c.e = (-0.2F + 1.5F * azc.e($$3, 13.0F)) * $$2;
            this.d.e = (-0.2F - 1.5F * azc.e($$3, 13.0F)) * $$2;
         }
      }

      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.e = -1.5F * azc.e($$3, 13.0F) * $$2;
      this.f.e = 1.5F * azc.e($$3, 13.0F) * $$2;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   public gab c() {
      return this.c;
   }
}
