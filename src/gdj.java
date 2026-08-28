public class gdj extends gca<gyj> {
   private final gfc a;
   private final gfc b;

   public gdj(gfc $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gfh.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gfe.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gfh.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gfe.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gfh.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gfe.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gfh.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gfe.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gfh.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gfe.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gfh.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gfe.a(1.5F, 22.0F, -1.5F));
      return gfi.a($$0, 32, 32);
   }

   @Override
   public void a(gyj $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * ayz.a($$0.u * 0.2F);
      this.a.g = 0.2F - 0.4F * ayz.a($$0.u * 0.2F);
   }
}
