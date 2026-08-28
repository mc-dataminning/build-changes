public class fwn extends fui<coe> {
   private static final int a = 16;
   private final fwz b;
   private final fwz f;
   private final fwz g;

   public fwn(fwz $$0) {
      super(gdv::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxi $$2 = $$1.a("bone", fxe.c(), fxb.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxe.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxd(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxd(0.0F)),
         fxb.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxe.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxd(0.0F)), fxb.a(0.0F, 0.0F, 0.0F));
      return fxf.a($$0, 64, 32);
   }

   public void a(coe $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fwz a() {
      return this.b;
   }
}
