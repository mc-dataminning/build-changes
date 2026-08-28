public class gks extends gic<her> {
   private static final int a = 16;
   private final glg b;
   private final glg c;
   private final glg d;

   public gks(glg $$0) {
      super($$0, gsn::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("bone", gll.c(), gli.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gll.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new glk(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new glk(0.0F)),
         gli.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gll.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new glk(0.0F)), gli.a(0.0F, 0.0F, 0.0F));
      return glm.a($$0, 64, 32);
   }

   @Override
   public void a(her $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
