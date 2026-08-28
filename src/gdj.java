public class gdj extends gbk<gzq> {
   public static final gev a = gev.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gem d;

   public gdj(gem $$0) {
      super($$0);
      this.d = $$0.b("bone").b("body").b("head");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("bone", ger.c(), geo.a(0.0F, 5.0F, 0.0F));
      gew $$3 = $$2.a(
         "body",
         ger.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new geq(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new geq(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new geq(0.0F)),
         geo.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", ger.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", ger.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", ger.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", ger.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", ger.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", ger.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new geq(0.0F)), geo.a(7.5F, 10.0F, 15.0F));
      gew $$4 = $$3.a(
         "head",
         ger.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new geq(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new geq(0.0F)),
         geo.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", ger.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new geq(0.0F)), geo.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", ger.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new geq(0.0F)), geo.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", ger.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new geq(0.0F)), geo.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", ger.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new geq(0.0F)), geo.a(0.0F, 2.5F, -12.5F));
      return ges.a($$0, 192, 192);
   }

   public void a(gzq $$0) {
      super.a($$0);
      this.d.e = $$0.V * (float) (Math.PI / 180.0);
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a(fnb.e, $$0.X, $$0.Y, 9.0F, 100.0F);
      } else {
         this.a(fnb.d, $$0.X, $$0.Y, 9.0F, 100.0F);
      }

      this.a($$0.b, fnb.f, $$0.p);
      this.a($$0.c, fnb.c, $$0.p);
      this.a($$0.d, fnb.g, $$0.p);
      this.a($$0.e, fnb.i, $$0.p);
      this.a($$0.f, fnb.b, $$0.p);
      if ($$0.ae) {
         this.a(fnb.a);
      }
   }
}
