public class fvi<T extends bsv> extends fuk<T> {
   private final fxb a;
   private final fxb b;
   private final fxb f;

   public fvi(fxb $$0) {
      this.a = $$0;
      this.b = $$0.b("left_blue_fin");
      this.f = $$0.b("right_blue_fin");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fxg.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxd.a(0.0F, 22.0F, 0.0F));
      $$1.a("right_blue_fin", fxg.c().a(24, 0).a(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), fxd.a(-4.0F, 15.0F, -2.0F));
      $$1.a("left_blue_fin", fxg.c().a(24, 3).a(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), fxd.a(4.0F, 15.0F, -2.0F));
      $$1.a("top_front_fin", fxg.c().a(15, 17).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxd.a(0.0F, 14.0F, -4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("top_middle_fin", fxg.c().a(14, 16).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F), fxd.a(0.0F, 14.0F, 0.0F));
      $$1.a("top_back_fin", fxg.c().a(23, 18).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxd.a(0.0F, 14.0F, 4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_front_fin", fxg.c().a(5, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxd.a(-4.0F, 22.0F, -4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("left_front_fin", fxg.c().a(1, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxd.a(4.0F, 22.0F, -4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("bottom_front_fin", fxg.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxd.a(0.0F, 22.0F, -4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("bottom_middle_fin", fxg.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxd.a(0.0F, 22.0F, 0.0F));
      $$1.a("bottom_back_fin", fxg.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxd.a(0.0F, 22.0F, 4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_back_fin", fxg.c().a(9, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxd.a(-4.0F, 22.0F, 4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("left_back_fin", fxg.c().a(9, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxd.a(4.0F, 22.0F, 4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      return fxh.a($$0, 32, 32);
   }

   @Override
   public fxb a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * ayz.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * ayz.a($$3 * 0.2F);
   }
}
