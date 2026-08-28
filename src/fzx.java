public class fzx extends fxk<gtl> {
   private static final int a = 16;
   private final gal b;
   private final gal c;
   private final gal d;

   public fzx(gal $$0) {
      super(ghq::i);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("bone", gaq.c(), gan.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gaq.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gap(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gap(0.0F)),
         gan.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gaq.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gap(0.0F)), gan.a(0.0F, 0.0F, 0.0F));
      return gar.a($$0, 64, 32);
   }

   @Override
   public void a(gtl $$0) {
      this.c.f = -$$0.p * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.p * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public gal a() {
      return this.b;
   }
}
