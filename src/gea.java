public class gea extends gbm<gxv> {
   private static final int a = 16;
   private final geo b;
   private final geo c;
   private final geo d;

   public gea(geo $$0) {
      super($$0, glv::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("bone", get.c(), geq.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         get.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ges(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ges(0.0F)),
         geq.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", get.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ges(0.0F)), geq.a(0.0F, 0.0F, 0.0F));
      return geu.a($$0, 64, 32);
   }

   @Override
   public void a(gxv $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
