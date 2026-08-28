public class gcv extends gbm<gxv> {
   private final geo a;
   private final geo b;

   public gcv(geo $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", get.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), geq.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", get.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), geq.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", get.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), geq.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", get.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), geq.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", get.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), geq.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", get.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), geq.a(1.5F, 22.0F, -1.5F));
      return geu.a($$0, 32, 32);
   }

   @Override
   public void a(gxv $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * bae.a($$0.p * 0.2F);
      this.a.g = 0.2F - 0.4F * bae.a($$0.p * 0.2F);
   }
}
