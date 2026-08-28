public class gfo extends gda<gzj> {
   private static final int a = 16;
   private final ggc b;
   private final ggc c;
   private final ggc d;

   public gfo(ggc $$0) {
      super($$0, gnh::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      ggm $$2 = $$1.a("bone", ggh.c(), gge.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         ggh.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new ggg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new ggg(0.0F)),
         gge.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", ggh.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new ggg(0.0F)), gge.a(0.0F, 0.0F, 0.0F));
      return ggi.a($$0, 64, 32);
   }

   @Override
   public void a(gzj $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
