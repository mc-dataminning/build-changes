public class fwx<T extends bsh> extends fui<T> {
   private final fxq a;
   private final fxq b;

   public fwx(fxq $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fxw a(fxu $$0) {
      fxy $$1 = new fxy();
      fxz $$2 = $$1.a();
      int $$3 = 19;
      $$2.a("body", fxv.c().a(0, 20).a(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, $$0), fxs.a(0.0F, 19.0F, 0.0F));
      $$2.a("tail", fxv.c().a(21, 16).a(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, $$0), fxs.a(0.0F, 19.0F, 3.0F));
      $$2.a("right_fin", fxv.c().a(2, 16).a(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fxs.a(-1.0F, 20.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fxv.c().a(2, 12).a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fxs.a(1.0F, 20.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fxv.c().a(20, 11).a(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), fxs.a(0.0F, 16.0F, -3.0F));
      $$2.a("bottom_fin", fxv.c().a(20, 21).a(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), fxs.a(0.0F, 22.0F, -3.0F));
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
