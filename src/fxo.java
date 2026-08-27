public class fxo extends fxp {
   private final fys b;
   protected final fys a;

   public fxo(fys $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fza a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("head", fyx.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyu.a);
      return $$0;
   }

   public static fyy b() {
      fza $$0 = a();
      fzb $$1 = $$0.a();
      $$1.a("head").a("hat", fyx.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyw(0.25F)), fyu.a);
      return fyy.a($$0, 64, 64);
   }

   public static fyy c() {
      fza $$0 = a();
      return fyy.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
