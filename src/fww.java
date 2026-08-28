public class fww<T extends bsh> extends fui<T> {
   private final fxq a;
   private final fxq b;

   public fww(fxq $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fxw a(fxu $$0) {
      fxy $$1 = new fxy();
      fxz $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fxv.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fxs.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fxv.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fxs.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fxv.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fxs.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fxv.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fxs.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fxv.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fxs.a(0.0F, 20.5F, -3.0F));
      return fxw.a($$1, 32, 32);
   }

   @Override
   public fxq a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bg()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ayg.a(0.6F * $$3);
   }
}
