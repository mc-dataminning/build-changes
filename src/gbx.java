public class gbx extends fzj<gvo> {
   private static final int a = 16;
   private final gcl b;
   private final gcl c;
   private final gcl d;

   public gbx(gcl $$0) {
      super($$0, gjq::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("bone", gcq.c(), gcn.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gcq.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gcp(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gcp(0.0F)),
         gcn.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gcq.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gcp(0.0F)), gcn.a(0.0F, 0.0F, 0.0F));
      return gcr.a($$0, 64, 32);
   }

   @Override
   public void a(gvo $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
