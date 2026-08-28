public class ggp extends gea<hak> {
   private static final int a = 16;
   private final ghd b;
   private final ghd c;
   private final ghd d;

   public ggp(ghd $$0) {
      super($$0, goi::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("bone", ghi.c(), ghf.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         ghi.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ghh(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ghh(0.0F)),
         ghf.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", ghi.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ghh(0.0F)), ghf.a(0.0F, 0.0F, 0.0F));
      return ghj.a($$0, 64, 32);
   }

   @Override
   public void a(hak $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
