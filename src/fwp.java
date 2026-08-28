public class fwp extends fuk<cog> {
   private static final int a = 16;
   private final fxb b;
   private final fxb f;
   private final fxb g;

   public fwp(fxb $$0) {
      super(gdx::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxk $$2 = $$1.a("bone", fxg.c(), fxd.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxg.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxf(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxf(0.0F)),
         fxd.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxg.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxf(0.0F)), fxd.a(0.0F, 0.0F, 0.0F));
      return fxh.a($$0, 64, 32);
   }

   public void a(cog $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fxb a() {
      return this.b;
   }
}
