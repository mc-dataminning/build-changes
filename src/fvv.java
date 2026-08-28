public class fvv<T extends bsg> extends fux<T> {
   private final fxo a;
   private final fxo b;
   private final fxo f;

   public fvv(fxo $$0) {
      this.a = $$0;
      this.b = $$0.b("left_blue_fin");
      this.f = $$0.b("right_blue_fin");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fxt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxq.a(0.0F, 22.0F, 0.0F));
      $$1.a("right_blue_fin", fxt.c().a(24, 0).a(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), fxq.a(-4.0F, 15.0F, -2.0F));
      $$1.a("left_blue_fin", fxt.c().a(24, 3).a(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), fxq.a(4.0F, 15.0F, -2.0F));
      $$1.a("top_front_fin", fxt.c().a(15, 17).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxq.a(0.0F, 14.0F, -4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("top_middle_fin", fxt.c().a(14, 16).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F), fxq.a(0.0F, 14.0F, 0.0F));
      $$1.a("top_back_fin", fxt.c().a(23, 18).a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxq.a(0.0F, 14.0F, 4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_front_fin", fxt.c().a(5, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxq.a(-4.0F, 22.0F, -4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("left_front_fin", fxt.c().a(1, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxq.a(4.0F, 22.0F, -4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("bottom_front_fin", fxt.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxq.a(0.0F, 22.0F, -4.0F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("bottom_middle_fin", fxt.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxq.a(0.0F, 22.0F, 0.0F));
      $$1.a("bottom_back_fin", fxt.c().a(15, 20).a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F), fxq.a(0.0F, 22.0F, 4.0F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_back_fin", fxt.c().a(9, 17).a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxq.a(-4.0F, 22.0F, 4.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("left_back_fin", fxt.c().a(9, 17).a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F), fxq.a(4.0F, 22.0F, 4.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      return fxu.a($$0, 32, 32);
   }

   @Override
   public fxo a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * ayg.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * ayg.a($$3 * 0.2F);
   }
}
