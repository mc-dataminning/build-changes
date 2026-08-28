public class fwf extends fxv {
   private final gab a;

   public fwf(gab $$0) {
      super(ghe::e);
      this.a = $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gag $$2 = gag.c().a(0, 0).a(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F);
      $$1.a("cross_1", $$2, gad.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gad.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gah.a($$0, 16, 16);
   }

   @Override
   public gab a() {
      return this.a;
   }
}
