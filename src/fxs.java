public class fxs extends fxo<gua> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gaq d = this.v.b("body");
   private final gaq e = this.d.b("head");
   private final gaq f = this.e.b("eyes");
   private final gaq g = this.d.b("tongue");
   private final gaq i = this.d.b("left_arm");
   private final gaq j = this.d.b("right_arm");
   private final gaq k = this.v.b("left_leg");
   private final gaq l = this.v.b("right_leg");
   private final gaq m = this.d.b("croaking_body");

   public fxs(gaq $$0) {
      super($$0.b("root"));
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("root", gav.c(), gas.a(0.0F, 24.0F, 0.0F));
      gba $$3 = $$2.a(
         "body", gav.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gas.a(0.0F, -2.0F, 4.0F)
      );
      gba $$4 = $$3.a(
         "head", gav.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gas.a(0.0F, -2.0F, -1.0F)
      );
      gba $$5 = $$4.a("eyes", gav.c(), gas.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gav.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gas.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gav.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gas.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gav.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gau(-0.1F)), gas.a(0.0F, -1.0F, -5.0F));
      gba $$6 = $$3.a("tongue", gav.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gas.a(0.0F, -1.01F, 1.0F));
      gba $$7 = $$3.a("left_arm", gav.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gas.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gav.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gas.a(0.0F, 3.0F, -1.0F));
      gba $$8 = $$3.a("right_arm", gav.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gas.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gav.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gas.a(0.0F, 3.0F, 0.0F));
      gba $$9 = $$2.a("left_leg", gav.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gas.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gav.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gas.a(2.0F, 3.0F, 0.0F));
      gba $$10 = $$2.a("right_leg", gav.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gas.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gav.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gas.a(-2.0F, 3.0F, 0.0F));
      return gaw.a($$0, 48, 48);
   }

   public void a(gua $$0) {
      super.a($$0);
      this.a($$0.b, fjl.c, $$0.p);
      this.a($$0.c, fjl.a, $$0.p);
      this.a($$0.d, fjl.d, $$0.p);
      if ($$0.a) {
         this.a(fjl.e, $$0.X, $$0.Y, 1.0F, 2.5F);
      } else {
         this.a(fjl.b, $$0.X, $$0.Y, 1.5F, 2.5F);
      }

      this.a($$0.e, fjl.f, $$0.p);
      this.m.k = $$0.c.b();
   }
}
