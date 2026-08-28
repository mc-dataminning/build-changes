public class gan extends fxz<guc> {
   private static final int a = 16;
   private final gbb b;
   private final gbb c;
   private final gbb d;

   public gan(gbb $$0) {
      super($$0, gig::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("bone", gbg.c(), gbd.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gbg.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gbf(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gbf(0.0F)),
         gbd.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gbg.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gbf(0.0F)), gbd.a(0.0F, 0.0F, 0.0F));
      return gbh.a($$0, 64, 32);
   }

   @Override
   public void a(guc $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
