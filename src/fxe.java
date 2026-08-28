public class fxe extends fxf {
   private final fyi b;
   protected final fyi a;

   public fxe(fyi $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fyq a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("head", fyn.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyk.a);
      return $$0;
   }

   public static fyo b() {
      fyq $$0 = a();
      fyr $$1 = $$0.a();
      $$1.a("head").a("hat", fyn.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fym(0.25F)), fyk.a);
      return fyo.a($$0, 64, 64);
   }

   public static fyo c() {
      fyq $$0 = a();
      return fyo.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
