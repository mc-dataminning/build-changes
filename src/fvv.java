public class fvv extends fvw {
   private final fwz b;
   protected final fwz a;

   public fvv(fwz $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fxh a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("head", fxe.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxb.a);
      return $$0;
   }

   public static fxf b() {
      fxh $$0 = a();
      fxi $$1 = $$0.a();
      $$1.a("head").a("hat", fxe.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxd(0.25F)), fxb.a);
      return fxf.a($$0, 64, 64);
   }

   public static fxf c() {
      fxh $$0 = a();
      return fxf.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
