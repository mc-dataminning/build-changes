public class gkq extends gia<hep> {
   private static final int a = 16;
   private final gle b;
   private final gle c;
   private final gle d;

   public gkq(gle $$0) {
      super($$0, gsl::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glo $$2 = $$1.a("bone", glj.c(), glg.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         glj.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gli(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gli(0.0F)),
         glg.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", glj.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gli(0.0F)), glg.a(0.0F, 0.0F, 0.0F));
      return glk.a($$0, 64, 32);
   }

   @Override
   public void a(hep $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
