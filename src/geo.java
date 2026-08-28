public class geo extends gca<gyi> {
   private static final int a = 16;
   private final gfc b;
   private final gfc c;
   private final gfc d;

   public geo(gfc $$0) {
      super($$0, gmh::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("bone", gfh.c(), gfe.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gfh.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gfg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gfg(0.0F)),
         gfe.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gfh.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gfg(0.0F)), gfe.a(0.0F, 0.0F, 0.0F));
      return gfi.a($$0, 64, 32);
   }

   @Override
   public void a(gyi $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
