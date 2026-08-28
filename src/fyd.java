public class fyd extends fxo<guj> {
   private final gaq a;
   private final gaq b;
   private final gaq c;
   private final gaq d;
   private final gaq e;

   public fyd(gaq $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = $$0.b("right_arm");
      this.c = $$0.b("left_arm");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("head", gav.c().a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F), gas.a(0.0F, -7.0F, -2.0F));
      $$1.a(
         "body",
         gav.c().a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new gau(0.5F)),
         gas.a(0.0F, -7.0F, 0.0F)
      );
      $$1.a("right_arm", gav.c().a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gas.a(0.0F, -7.0F, 0.0F));
      $$1.a("left_arm", gav.c().a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), gas.a(0.0F, -7.0F, 0.0F));
      $$1.a("right_leg", gav.c().a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gas.a(-4.0F, 11.0F, 0.0F));
      $$1.a("left_leg", gav.c().a(60, 0).a().a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), gas.a(5.0F, 11.0F, 0.0F));
      return gaw.a($$0, 128, 128);
   }

   public void a(guj $$0) {
      super.a($$0);
      float $$1 = $$0.a;
      float $$2 = $$0.Y;
      float $$3 = $$0.X;
      if ($$1 > 0.0F) {
         this.b.e = -2.0F + 1.5F * azf.e($$1, 10.0F);
         this.c.e = -2.0F + 1.5F * azf.e($$1, 10.0F);
      } else {
         int $$4 = $$0.b;
         if ($$4 > 0) {
            this.b.e = -0.8F + 0.025F * azf.e((float)$$4, 70.0F);
            this.c.e = 0.0F;
         } else {
            this.b.e = (-0.2F + 1.5F * azf.e($$3, 13.0F)) * $$2;
            this.c.e = (-0.2F - 1.5F * azf.e($$3, 13.0F)) * $$2;
         }
      }

      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      this.d.e = -1.5F * azf.e($$3, 13.0F) * $$2;
      this.e.e = 1.5F * azf.e($$3, 13.0F) * $$2;
      this.d.f = 0.0F;
      this.e.f = 0.0F;
   }

   public gaq b() {
      return this.b;
   }
}
