public class fwm extends fwn {
   private final fxq b;
   protected final fxq a;

   public fwm(fxq $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxy a() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("head", fxv.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxs.a);
      return $$0;
   }

   public static fxw b() {
      fxy $$0 = a();
      fxz $$1 = $$0.a();
      $$1.a("head").a("hat", fxv.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxu(0.25F)), fxs.a);
      return fxw.a($$0, 64, 64);
   }

   public static fxw c() {
      fxy $$0 = a();
      return fxw.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
