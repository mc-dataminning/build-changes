public class gja extends ggk<hcz> {
   private static final int a = 16;
   private final gjo b;
   private final gjo c;
   private final gjo d;

   public gja(gjo $$0) {
      super($$0, gqx::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      gjy $$2 = $$1.a("bone", gjt.c(), gjq.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gjt.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gjs(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gjs(0.0F)),
         gjq.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gjt.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gjs(0.0F)), gjq.a(0.0F, 0.0F, 0.0F));
      return gju.a($$0, 64, 32);
   }

   @Override
   public void a(hcz $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
