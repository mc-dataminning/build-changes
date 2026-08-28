public class gig extends gfq<hcf> {
   private static final int a = 16;
   private final giu b;
   private final giu c;
   private final giu d;

   public gig(giu $$0) {
      super($$0, gqc::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("bone", giz.c(), giw.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         giz.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new giy(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new giy(0.0F)),
         giw.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", giz.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new giy(0.0F)), giw.a(0.0F, 0.0F, 0.0F));
      return gja.a($$0, 64, 32);
   }

   @Override
   public void a(hcf $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
