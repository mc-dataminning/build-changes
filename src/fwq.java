public class fwq extends ful<coh> {
   private static final int a = 16;
   private final fxc b;
   private final fxc f;
   private final fxc g;

   public fwq(fxc $$0) {
      super(gdy::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("bone", fxh.c(), fxe.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxh.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxg(0.0F)),
         fxe.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxh.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxg(0.0F)), fxe.a(0.0F, 0.0F, 0.0F));
      return fxi.a($$0, 64, 32);
   }

   public void a(coh $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fxc a() {
      return this.b;
   }
}
