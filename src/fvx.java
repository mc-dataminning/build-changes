public class fvx extends fvy {
   private final fxb b;
   protected final fxb a;

   public fvx(fxb $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxj a() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("head", fxg.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxd.a);
      return $$0;
   }

   public static fxh b() {
      fxj $$0 = a();
      fxk $$1 = $$0.a();
      $$1.a("head").a("hat", fxg.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxf(0.25F)), fxd.a);
      return fxh.a($$0, 64, 64);
   }

   public static fxh c() {
      fxj $$0 = a();
      return fxh.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ezz $$0, fad $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
