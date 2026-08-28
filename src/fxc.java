public class fxc extends fux<cns> {
   private static final int a = 16;
   private final fxo b;
   private final fxo f;
   private final fxo g;

   public fxc(fxo $$0) {
      super(gel::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      fxx $$2 = $$1.a("bone", fxt.c(), fxq.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fxt.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new fxs(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new fxs(0.0F)),
         fxq.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fxt.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new fxs(0.0F)), fxq.a(0.0F, 0.0F, 0.0F));
      return fxu.a($$0, 64, 32);
   }

   public void a(cns $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public fxo a() {
      return this.b;
   }
}
