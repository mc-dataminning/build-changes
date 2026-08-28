public class fxa extends fxb {
   private final fye b;
   protected final fye a;

   public fxa(fye $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fym a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("head", fyj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyg.a);
      return $$0;
   }

   public static fyk b() {
      fym $$0 = a();
      fyn $$1 = $$0.a();
      $$1.a("head").a("hat", fyj.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyi(0.25F)), fyg.a);
      return fyk.a($$0, 64, 64);
   }

   public static fyk c() {
      fym $$0 = a();
      return fyk.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
