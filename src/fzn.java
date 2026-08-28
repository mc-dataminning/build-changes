public class fzn extends fxa<gsu> {
   private static final int a = 16;
   private final gab b;
   private final gab c;
   private final gab d;

   public fzn(gab $$0) {
      super(ghe::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("bone", gag.c(), gad.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gag.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gaf(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gaf(0.0F)),
         gad.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gag.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gaf(0.0F)), gad.a(0.0F, 0.0F, 0.0F));
      return gah.a($$0, 64, 32);
   }

   @Override
   public void a(gsu $$0) {
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public gab a() {
      return this.b;
   }
}
