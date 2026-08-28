public class fww extends fur<cnp> {
   private static final int a = 16;
   private final fxi b;
   private final fxi f;
   private final fxi g;

   public fww(fxi $$0) {
      super(gef::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("bone", fxn.c(), fxk.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxn.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxm(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxm(0.0F)),
         fxk.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxn.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxm(0.0F)), fxk.a(0.0F, 0.0F, 0.0F));
      return fxo.a($$0, 64, 32);
   }

   public void a(cnp $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fxi a() {
      return this.b;
   }
}
