public class fxs extends fvn<cod> {
   private static final int a = 16;
   private final fye b;
   private final fye f;
   private final fye g;

   public fxs(fye $$0) {
      super(gfb::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      fyn $$2 = $$1.a("bone", fyj.c(), fyg.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fyj.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fyi(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fyi(0.0F)),
         fyg.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fyj.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fyi(0.0F)), fyg.a(0.0F, 0.0F, 0.0F));
      return fyk.a($$0, 64, 32);
   }

   public void a(cod $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fye a() {
      return this.b;
   }
}
