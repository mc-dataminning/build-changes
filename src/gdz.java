public class gdz extends gca<hag> {
   public static final gfl a = gfl.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gfc d;

   public gdz(gfc $$0) {
      super($$0);
      this.d = $$0.b("bone").b("body").b("head");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("bone", gfh.c(), gfe.a(0.0F, 5.0F, 0.0F));
      gfm $$3 = $$2.a(
         "body",
         gfh.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new gfg(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new gfg(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new gfg(0.0F)),
         gfe.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", gfh.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", gfh.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", gfh.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", gfh.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", gfh.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", gfh.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gfg(0.0F)), gfe.a(7.5F, 10.0F, 15.0F));
      gfm $$4 = $$3.a(
         "head",
         gfh.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new gfg(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new gfg(0.0F)),
         gfe.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", gfh.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gfg(0.0F)), gfe.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", gfh.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gfg(0.0F)), gfe.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", gfh.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new gfg(0.0F)), gfe.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", gfh.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new gfg(0.0F)), gfe.a(0.0F, 2.5F, -12.5F));
      return gfi.a($$0, 192, 192);
   }

   public void a(hag $$0) {
      super.a($$0);
      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a(fmg.e, $$0.ad, $$0.ae, 9.0F, 100.0F);
      } else {
         this.a(fmg.d, $$0.ad, $$0.ae, 9.0F, 100.0F);
      }

      this.a($$0.b, fmg.f, $$0.u);
      this.a($$0.c, fmg.c, $$0.u);
      this.a($$0.d, fmg.g, $$0.u);
      this.a($$0.e, fmg.i, $$0.u);
      this.a($$0.f, fmg.b, $$0.u);
      if ($$0.aj) {
         this.a(fmg.a);
      }
   }
}
