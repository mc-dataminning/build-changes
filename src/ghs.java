public class ghs extends gfd<hbp> {
   private static final int a = 16;
   private final gig b;
   private final gig c;
   private final gig d;

   public ghs(gig $$0) {
      super($$0, gpn::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("bone", gil.c(), gii.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gil.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gik(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gik(0.0F)),
         gii.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gil.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gik(0.0F)), gii.a(0.0F, 0.0F, 0.0F));
      return gim.a($$0, 64, 32);
   }

   @Override
   public void a(hbp $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
