public class fvk extends ftf<cng> {
   private static final int a = 16;
   private final fvw b;
   private final fvw f;
   private final fvw g;

   public fvk(fvw $$0) {
      super(gcs::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      fwf $$2 = $$1.a("bone", fwb.c(), fvy.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fwb.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fwa(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fwa(0.0F)),
         fvy.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fwb.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fwa(0.0F)), fvy.a(0.0F, 0.0F, 0.0F));
      return fwc.a($$0, 64, 32);
   }

   public void a(cng $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fvw a() {
      return this.b;
   }
}
