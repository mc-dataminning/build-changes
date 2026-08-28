public class gdi extends gca<gyj> {
   private final gfc a;
   private final gfc b;

   public gdi(gfc $$0) {
      super($$0);
      this.a = $$0.b("left_blue_fin");
      this.b = $$0.b("right_blue_fin");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gfh.c().a(12, 22).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F), gfe.a(0.0F, 22.0F, 0.0F));
      $$1.a("right_blue_fin", gfh.c().a(24, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gfe.a(-2.5F, 18.0F, -1.5F));
      $$1.a("left_blue_fin", gfh.c().a(24, 3).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), gfe.a(2.5F, 18.0F, -1.5F));
      $$1.a("top_front_fin", gfh.c().a(19, 17).a(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 0.0F), gfe.a(0.0F, 17.0F, -2.5F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("top_back_fin", gfh.c().a(11, 17).a(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 0.0F), gfe.a(0.0F, 17.0F, 2.5F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      $$1.a("right_front_fin", gfh.c().a(5, 17).a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F), gfe.a(-2.5F, 22.0F, -2.5F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("right_back_fin", gfh.c().a(9, 17).a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F), gfe.a(-2.5F, 22.0F, 2.5F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("left_back_fin", gfh.c().a(1, 17).a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F), gfe.a(2.5F, 22.0F, 2.5F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$1.a("left_front_fin", gfh.c().a(1, 17).a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F), gfe.a(2.5F, 22.0F, -2.5F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("bottom_back_fin", gfh.c().a(18, 20).a(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 0.0F), gfe.a(-2.5F, 22.0F, 2.5F, (float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("bottom_front_fin", gfh.c().a(17, 19).a(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F), gfe.a(0.0F, 22.0F, -2.5F, (float) (-Math.PI / 4), 0.0F, 0.0F));
      return gfi.a($$0, 32, 32);
   }

   @Override
   public void a(gyj $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * ayz.a($$0.u * 0.2F);
      this.a.g = 0.2F - 0.4F * ayz.a($$0.u * 0.2F);
   }
}
