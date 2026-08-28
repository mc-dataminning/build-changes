public class gjf extends ggp<hdf> {
   private static final int a = 16;
   private final gjt b;
   private final gjt c;
   private final gjt d;

   public gjf(gjt $$0) {
      super($$0, grc::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      gkd $$2 = $$1.a("bone", gjy.c(), gjv.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gjy.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gjx(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gjx(0.0F)),
         gjv.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gjy.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gjx(0.0F)), gjv.a(0.0F, 0.0F, 0.0F));
      return gjz.a($$0, 64, 32);
   }

   @Override
   public void a(hdf $$0) {
      super.a($$0);
      this.c.f = -$$0.u * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.u * 16.0F * (float) (Math.PI / 180.0);
   }
}
