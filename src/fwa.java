public class fwa extends fxa<gsc> {
   private final gab a;

   public fwa(gab $$0) {
      super(ghe::e);
      this.a = $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("back", gag.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gad.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gag $$2 = gag.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gaf.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gad.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gad.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gah.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(gsc $$0) {
      this.a.c();
      if ($$0.c > 0.0F) {
         float $$1 = -azc.a($$0.c * 3.0F) * $$0.c;
         this.a.g += $$1 * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public gab a() {
      return this.a;
   }
}
