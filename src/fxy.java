public class fxy extends fvt<cof> {
   private static final int a = 16;
   private final fyk b;
   private final fyk f;
   private final fyk g;

   public fxy(fyk $$0) {
      super(gfh::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("bone", fyp.c(), fym.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fyp.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fyo(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fyo(0.0F)),
         fym.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fyp.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fyo(0.0F)), fym.a(0.0F, 0.0F, 0.0F));
      return fyq.a($$0, 64, 32);
   }

   public void a(cof $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fyk a() {
      return this.b;
   }
}
