public class fve<T extends bsp> extends fue<T> {
   private final fwv a;
   private final fwv b;
   private final fwv f;

   public fve(fwv $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.f = $$0.b("right_fin");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", fxa.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), fwx.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", fxa.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fwx.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", fxa.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fwx.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", fxa.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), fwx.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", fxa.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fwx.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", fxa.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fwx.a(1.5F, 22.0F, -1.5F));
      return fxb.a($$0, 32, 32);
   }

   @Override
   public fwv a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * ayu.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * ayu.a($$3 * 0.2F);
   }
}
