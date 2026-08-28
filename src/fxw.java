public class fxw extends fvr<cof> {
   private static final int a = 16;
   private final fyi b;
   private final fyi f;
   private final fyi g;

   public fxw(fyi $$0) {
      super(gff::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      fyr $$2 = $$1.a("bone", fyn.c(), fyk.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fyn.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fym(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fym(0.0F)),
         fyk.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fyn.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fym(0.0F)), fyk.a(0.0F, 0.0F, 0.0F));
      return fyo.a($$0, 64, 32);
   }

   public void a(cof $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fyi a() {
      return this.b;
   }
}
