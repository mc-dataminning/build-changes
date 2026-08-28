public class gdv extends gbh<gxq> {
   private static final int a = 16;
   private final gej b;
   private final gej c;
   private final gej d;

   public gdv(gej $$0) {
      super($$0, glq::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a("bone", geo.c(), gel.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         geo.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gen(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gen(0.0F)),
         gel.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", geo.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gen(0.0F)), gel.a(0.0F, 0.0F, 0.0F));
      return gep.a($$0, 64, 32);
   }

   @Override
   public void a(gxq $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
