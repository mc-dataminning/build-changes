public class gbo extends fza<gvd> {
   private static final int a = 16;
   private final gcc b;
   private final gcc c;
   private final gcc d;

   public gbo(gcc $$0) {
      super($$0, gjh::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      gcm $$2 = $$1.a("bone", gch.c(), gce.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gch.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gcg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gcg(0.0F)),
         gce.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gch.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gcg(0.0F)), gce.a(0.0F, 0.0F, 0.0F));
      return gci.a($$0, 64, 32);
   }

   @Override
   public void a(gvd $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
