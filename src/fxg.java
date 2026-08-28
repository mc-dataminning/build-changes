public class fxg extends fxh {
   private final fyk b;
   protected final fyk a;

   public fxg(fyk $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fys a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("head", fyp.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fym.a);
      return $$0;
   }

   public static fyq b() {
      fys $$0 = a();
      fyt $$1 = $$0.a();
      $$1.a("head").a("hat", fyp.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyo(0.25F)), fym.a);
      return fyq.a($$0, 64, 64);
   }

   public static fyq c() {
      fys $$0 = a();
      return fyq.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
