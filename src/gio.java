public class gio extends gfy<hcn> {
   private static final int a = 16;
   private final gjc b;
   private final gjc c;
   private final gjc d;

   public gio(gjc $$0) {
      super($$0, gqk::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("bone", gjh.c(), gje.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gjh.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gjg(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gjg(0.0F)),
         gje.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gjh.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gjg(0.0F)), gje.a(0.0F, 0.0F, 0.0F));
      return gji.a($$0, 64, 32);
   }

   @Override
   public void a(hcn $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
