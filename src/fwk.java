public class fwk extends fwl {
   private final fxo b;
   protected final fxo a;

   public fwk(fxo $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxw a() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("head", fxt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxq.a);
      return $$0;
   }

   public static fxu b() {
      fxw $$0 = a();
      fxx $$1 = $$0.a();
      $$1.a("head").a("hat", fxt.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxs(0.25F)), fxq.a);
      return fxu.a($$0, 64, 64);
   }

   public static fxu c() {
      fxw $$0 = a();
      return fxu.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fam $$0, faq $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
