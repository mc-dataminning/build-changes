public class gde extends gda<gzt> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final ggc d = this.v.b("body");
   private final ggc e = this.d.b("head");
   private final ggc f = this.e.b("eyes");
   private final ggc g = this.d.b("tongue");
   private final ggc i = this.d.b("left_arm");
   private final ggc j = this.d.b("right_arm");
   private final ggc k = this.v.b("left_leg");
   private final ggc l = this.v.b("right_leg");
   private final ggc m = this.d.b("croaking_body");

   public gde(ggc $$0) {
      super($$0.b("root"));
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      ggm $$2 = $$1.a("root", ggh.c(), gge.a(0.0F, 24.0F, 0.0F));
      ggm $$3 = $$2.a(
         "body", ggh.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gge.a(0.0F, -2.0F, 4.0F)
      );
      ggm $$4 = $$3.a(
         "head", ggh.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gge.a(0.0F, -2.0F, -1.0F)
      );
      ggm $$5 = $$4.a("eyes", ggh.c(), gge.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", ggh.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gge.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", ggh.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gge.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", ggh.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ggg(-0.1F)), gge.a(0.0F, -1.0F, -5.0F));
      ggm $$6 = $$3.a("tongue", ggh.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gge.a(0.0F, -1.01F, 1.0F));
      ggm $$7 = $$3.a("left_arm", ggh.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gge.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", ggh.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gge.a(0.0F, 3.0F, -1.0F));
      ggm $$8 = $$3.a("right_arm", ggh.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gge.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", ggh.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gge.a(0.0F, 3.0F, 0.0F));
      ggm $$9 = $$2.a("left_leg", ggh.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gge.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", ggh.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gge.a(2.0F, 3.0F, 0.0F));
      ggm $$10 = $$2.a("right_leg", ggh.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gge.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", ggh.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gge.a(-2.0F, 3.0F, 0.0F));
      return ggi.a($$0, 48, 48);
   }

   public void a(gzt $$0) {
      super.a($$0);
      this.a($$0.b, fnc.c, $$0.u);
      this.a($$0.c, fnc.a, $$0.u);
      this.a($$0.d, fnc.d, $$0.u);
      if ($$0.a) {
         this.a(fnc.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fnc.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fnc.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
