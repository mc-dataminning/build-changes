public class gka extends gia<hgm> {
   public static final gln a = gln.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gle d;

   public gka(gle $$0) {
      super($$0);
      this.d = $$0.b("bone").b("body").b("head");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glo $$2 = $$1.a("bone", glj.c(), glg.a(0.0F, 5.0F, 0.0F));
      glo $$3 = $$2.a(
         "body",
         glj.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new gli(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new gli(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new gli(0.0F)),
         glg.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", glj.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", glj.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", glj.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", glj.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", glj.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", glj.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gli(0.0F)), glg.a(7.5F, 10.0F, 15.0F));
      glo $$4 = $$3.a(
         "head",
         glj.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new gli(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new gli(0.0F)),
         glg.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", glj.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gli(0.0F)), glg.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", glj.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gli(0.0F)), glg.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", glj.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new gli(0.0F)), glg.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", glj.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new gli(0.0F)), glg.a(0.0F, 2.5F, -12.5F));
      return glk.a($$0, 192, 192);
   }

   public void a(hgm $$0) {
      super.a($$0);
      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a(fsa.e, $$0.ad, $$0.ae, 9.0F, 100.0F);
      } else {
         this.a(fsa.d, $$0.ad, $$0.ae, 9.0F, 100.0F);
      }

      this.a($$0.b, fsa.f, $$0.u);
      this.a($$0.c, fsa.c, $$0.u);
      this.a($$0.d, fsa.g, $$0.u);
      this.a($$0.e, fsa.i, $$0.u);
      this.a($$0.f, fsa.b, $$0.u);
      if ($$0.aj) {
         this.a(fsa.a);
      }
   }
}
