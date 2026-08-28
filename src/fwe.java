public class fwe extends fwf {
   private final fxi b;
   protected final fxi a;

   public fwe(fxi $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxq a() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("head", fxn.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxk.a);
      return $$0;
   }

   public static fxo b() {
      fxq $$0 = a();
      fxr $$1 = $$0.a();
      $$1.a("head").a("hat", fxn.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxm(0.25F)), fxk.a);
      return fxo.a($$0, 64, 64);
   }

   public static fxo c() {
      fxq $$0 = a();
      return fxo.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
