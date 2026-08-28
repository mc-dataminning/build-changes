public class fvu extends fvv {
   private final fwy b;
   protected final fwy a;

   public fvu(fwy $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxg a() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("head", fxd.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxa.a);
      return $$0;
   }

   public static fxe b() {
      fxg $$0 = a();
      fxh $$1 = $$0.a();
      $$1.a("head").a("hat", fxd.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxc(0.25F)), fxa.a);
      return fxe.a($$0, 64, 64);
   }

   public static fxe c() {
      fxg $$0 = a();
      return fxe.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ezw $$0, faa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
