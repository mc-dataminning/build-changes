public class fwj extends fue<coa> {
   private static final int a = 16;
   private final fwv b;
   private final fwv f;
   private final fwv g;

   public fwj(fwv $$0) {
      super(gdr::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a("bone", fxa.c(), fwx.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxa.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fwz(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fwz(0.0F)),
         fwx.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxa.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fwz(0.0F)), fwx.a(0.0F, 0.0F, 0.0F));
      return fxb.a($$0, 64, 32);
   }

   public void a(coa $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fwv a() {
      return this.b;
   }
}
