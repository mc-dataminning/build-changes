public class fvr extends fvs {
   private final fwv b;
   protected final fwv a;

   public fvr(fwv $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxd a() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("head", fxa.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fwx.a);
      return $$0;
   }

   public static fxb b() {
      fxd $$0 = a();
      fxe $$1 = $$0.a();
      $$1.a("head").a("hat", fxa.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwz(0.25F)), fwx.a);
      return fxb.a($$0, 64, 64);
   }

   public static fxb c() {
      fxd $$0 = a();
      return fxb.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
