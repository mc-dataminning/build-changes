public class gdy extends gbk<gxt> {
   private static final int a = 16;
   private final gem b;
   private final gem c;
   private final gem d;

   public gdy(gem $$0) {
      super($$0, glt::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("bone", ger.c(), geo.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         ger.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new geq(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new geq(0.0F)),
         geo.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", ger.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new geq(0.0F)), geo.a(0.0F, 0.0F, 0.0F));
      return ges.a($$0, 64, 32);
   }

   @Override
   public void a(gxt $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
