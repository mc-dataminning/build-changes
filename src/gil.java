public class gil<S extends hew> extends gge<S> implements gic {
   private final giu a = this.p.b("hat_rim");

   public gil(giu $$0) {
      super($$0);
   }

   public static gja a() {
      gjc $$0 = gge.a(giy.a, 0.0F);
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("head", new giz().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), giw.a);
      gje $$3 = $$2.a("hat", giz.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new giy(0.5F)), giw.a);
      $$3.a("hat_rim", giz.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), giw.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", giz.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new giy(0.05F)), giw.a);
      $$1.a("right_arm", giz.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", giz.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", giz.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", giz.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(2.0F, 12.0F, 0.0F));
      return gja.a($$0, 64, 64);
   }

   public static gja a(giy $$0) {
      gjc $$1 = gge.a($$0, 0.0F);
      gje $$2 = $$1.a();
      gje $$3 = $$2.a("head", giz.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), giw.a);
      $$2.a("body", giz.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), giw.a);
      $$2.a("right_leg", giz.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), giw.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", giz.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), giw.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", giz.c(), giw.a);
      return gja.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gef.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fjc $$0) {
      this.a(bwv.b, $$0);
   }
}
