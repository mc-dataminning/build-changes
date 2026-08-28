public class fvw extends fvx {
   private final fxa b;
   protected final fxa a;

   public fvw(fxa $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxi a() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("head", fxf.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxc.a);
      return $$0;
   }

   public static fxg b() {
      fxi $$0 = a();
      fxj $$1 = $$0.a();
      $$1.a("head").a("hat", fxf.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxe(0.25F)), fxc.a);
      return fxg.a($$0, 64, 64);
   }

   public static fxg c() {
      fxi $$0 = a();
      return fxg.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ezy $$0, fac $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
