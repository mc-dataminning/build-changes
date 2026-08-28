public class gcg extends gcc<gyv> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gfe d = this.v.b("body");
   private final gfe e = this.d.b("head");
   private final gfe f = this.e.b("eyes");
   private final gfe g = this.d.b("tongue");
   private final gfe i = this.d.b("left_arm");
   private final gfe j = this.d.b("right_arm");
   private final gfe k = this.v.b("left_leg");
   private final gfe l = this.v.b("right_leg");
   private final gfe m = this.d.b("croaking_body");

   public gcg(gfe $$0) {
      super($$0.b("root"));
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("root", gfj.c(), gfg.a(0.0F, 24.0F, 0.0F));
      gfo $$3 = $$2.a(
         "body", gfj.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gfg.a(0.0F, -2.0F, 4.0F)
      );
      gfo $$4 = $$3.a(
         "head", gfj.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gfg.a(0.0F, -2.0F, -1.0F)
      );
      gfo $$5 = $$4.a("eyes", gfj.c(), gfg.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gfj.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfg.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gfj.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfg.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gfj.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gfi(-0.1F)), gfg.a(0.0F, -1.0F, -5.0F));
      gfo $$6 = $$3.a("tongue", gfj.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gfg.a(0.0F, -1.01F, 1.0F));
      gfo $$7 = $$3.a("left_arm", gfj.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfg.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gfj.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfg.a(0.0F, 3.0F, -1.0F));
      gfo $$8 = $$3.a("right_arm", gfj.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gfg.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gfj.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gfg.a(0.0F, 3.0F, 0.0F));
      gfo $$9 = $$2.a("left_leg", gfj.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfg.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gfj.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfg.a(2.0F, 3.0F, 0.0F));
      gfo $$10 = $$2.a("right_leg", gfj.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gfg.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gfj.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gfg.a(-2.0F, 3.0F, 0.0F));
      return gfk.a($$0, 48, 48);
   }

   public void a(gyv $$0) {
      super.a($$0);
      this.a($$0.b, fmg.c, $$0.u);
      this.a($$0.c, fmg.a, $$0.u);
      this.a($$0.d, fmg.d, $$0.u);
      if ($$0.a) {
         this.a(fmg.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fmg.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fmg.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
