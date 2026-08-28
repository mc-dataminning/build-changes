public class gem extends gby<gyh> {
   private static final int a = 16;
   private final gfa b;
   private final gfa c;
   private final gfa d;

   public gem(gfa $$0) {
      super($$0, gmf::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("bone", gff.c(), gfc.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gff.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gfe(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gfe(0.0F)),
         gfc.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gff.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gfe(0.0F)), gfc.a(0.0F, 0.0F, 0.0F));
      return gfg.a($$0, 64, 32);
   }

   @Override
   public void a(gyh $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
