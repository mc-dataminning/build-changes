public class fup extends fsk<cmp> {
   private static final int a = 16;
   private final fvb b;
   private final fvb f;
   private final fvb g;

   public fup(fvb $$0) {
      super(gbw::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      fvk $$2 = $$1.a("bone", fvg.c(), fvd.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fvg.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fvf(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fvf(0.0F)),
         fvd.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fvg.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fvf(0.0F)), fvd.a(0.0F, 0.0F, 0.0F));
      return fvh.a($$0, 64, 32);
   }

   public void a(cmp $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fvb a() {
      return this.b;
   }
}
