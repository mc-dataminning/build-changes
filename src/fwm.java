public class fwm extends fuh<cod> {
   private static final int a = 16;
   private final fwy b;
   private final fwy f;
   private final fwy g;

   public fwm(fwy $$0) {
      super(gdu::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      fxh $$2 = $$1.a("bone", fxd.c(), fxa.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxd.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxc(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxc(0.0F)),
         fxa.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxd.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxc(0.0F)), fxa.a(0.0F, 0.0F, 0.0F));
      return fxe.a($$0, 64, 32);
   }

   public void a(cod $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fwy a() {
      return this.b;
   }
}
