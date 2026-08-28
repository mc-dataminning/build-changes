public class gep extends gcb<gyk> {
   private static final int a = 16;
   private final gfd b;
   private final gfd c;
   private final gfd d;

   public gep(gfd $$0) {
      super($$0, gmi::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("bone", gfi.c(), gff.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gfi.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gfh(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gfh(0.0F)),
         gff.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gfi.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gfh(0.0F)), gff.a(0.0F, 0.0F, 0.0F));
      return gfj.a($$0, 64, 32);
   }

   @Override
   public void a(gyk $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
