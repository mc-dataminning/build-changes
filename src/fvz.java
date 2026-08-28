public class fvz<T extends bsh> extends fuz<T> {
   private final fxq a;
   private final fxq b;
   private final fxq f;

   public fvz(fxq $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.f = $$0.b("right_fin");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", fxv.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxs.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", fxv.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fxs.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", fxv.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fxs.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", fxv.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), fxs.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", fxv.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fxs.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", fxv.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fxs.a(1.5F, 22.0F, -1.5F));
      return fxw.a($$0, 32, 32);
   }

   @Override
   public fxq a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * ayg.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * ayg.a($$3 * 0.2F);
   }
}
