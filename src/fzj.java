public class fzj extends fxk<gvi> {
   public static final gau a = gau.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gal d;
   private final gal e;

   public fzj(gal $$0) {
      this.d = $$0;
      this.e = $$0.b("bone").b("body").b("head");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("bone", gaq.c(), gan.a(0.0F, 5.0F, 0.0F));
      gav $$3 = $$2.a(
         "body",
         gaq.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new gap(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new gap(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new gap(0.0F)),
         gan.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", gaq.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", gaq.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", gaq.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", gaq.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", gaq.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", gaq.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gap(0.0F)), gan.a(7.5F, 10.0F, 15.0F));
      gav $$4 = $$3.a(
         "head",
         gaq.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new gap(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new gap(0.0F)),
         gan.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", gaq.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gap(0.0F)), gan.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", gaq.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gap(0.0F)), gan.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", gaq.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new gap(0.0F)), gan.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", gaq.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new gap(0.0F)), gan.a(0.0F, 2.5F, -12.5F));
      return gar.a($$0, 192, 192);
   }

   public void a(gvi $$0) {
      this.a().e().forEach(gal::c);
      this.e.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a(fji.e, $$0.X, $$0.Y, 9.0F, 100.0F);
      } else {
         this.a(fji.d, $$0.X, $$0.Y, 9.0F, 100.0F);
      }

      this.a($$0.b, fji.f, $$0.p);
      this.a($$0.c, fji.c, $$0.p);
      this.a($$0.d, fji.g, $$0.p);
      this.a($$0.e, fji.i, $$0.p);
      this.a($$0.f, fji.b, $$0.p);
      if ($$0.ae) {
         this.a(fji.a);
      }
   }

   @Override
   public gal a() {
      return this.d;
   }
}
