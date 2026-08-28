public class gdz extends gbl<gxu> {
   private static final int a = 16;
   private final gen b;
   private final gen c;
   private final gen d;

   public gdz(gen $$0) {
      super($$0, glu::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("bone", ges.c(), gep.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         ges.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ger(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ger(0.0F)),
         gep.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", ges.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ger(0.0F)), gep.a(0.0F, 0.0F, 0.0F));
      return get.a($$0, 64, 32);
   }

   @Override
   public void a(gxu $$0) {
      super.a($$0);
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }
}
