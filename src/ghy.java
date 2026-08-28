public class ghy extends gfy<hek> {
   public static final gjl a = gjl.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gjc d;

   public ghy(gjc $$0) {
      super($$0);
      this.d = $$0.b("bone").b("body").b("head");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("bone", gjh.c(), gje.a(0.0F, 5.0F, 0.0F));
      gjm $$3 = $$2.a(
         "body",
         gjh.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new gjg(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new gjg(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new gjg(0.0F)),
         gje.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", gjh.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", gjh.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", gjh.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", gjh.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", gjh.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", gjh.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gjg(0.0F)), gje.a(7.5F, 10.0F, 15.0F));
      gjm $$4 = $$3.a(
         "head",
         gjh.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new gjg(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new gjg(0.0F)),
         gje.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", gjh.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gjg(0.0F)), gje.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", gjh.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gjg(0.0F)), gje.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", gjh.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new gjg(0.0F)), gje.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", gjh.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new gjg(0.0F)), gje.a(0.0F, 2.5F, -12.5F));
      return gji.a($$0, 192, 192);
   }

   public void a(hek $$0) {
      super.a($$0);
      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a(fpw.e, $$0.ad, $$0.ae, 9.0F, 100.0F);
      } else {
         this.a(fpw.d, $$0.ad, $$0.ae, 9.0F, 100.0F);
      }

      this.a($$0.b, fpw.f, $$0.u);
      this.a($$0.c, fpw.c, $$0.u);
      this.a($$0.d, fpw.g, $$0.u);
      this.a($$0.e, fpw.i, $$0.u);
      this.a($$0.f, fpw.b, $$0.u);
      if ($$0.aj) {
         this.a(fpw.a);
      }
   }
}
