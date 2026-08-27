public class fus extends fut {
   private final fvw b;
   protected final fvw a;

   public fus(fvw $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fwe a() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("head", fwb.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fvy.a);
      return $$0;
   }

   public static fwc b() {
      fwe $$0 = a();
      fwf $$1 = $$0.a();
      $$1.a("head").a("hat", fwb.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwa(0.25F)), fvy.a);
      return fwc.a($$0, 64, 64);
   }

   public static fwc c() {
      fwe $$0 = a();
      return fwc.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(eys $$0, eyw $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
