public class fyw extends fyx {
   private final gab b;
   protected final gab a;

   public fyw(gab $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static gaj b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gad.a);
      return $$0;
   }

   public static gah c() {
      gaj $$0 = b();
      gal $$1 = $$0.a();
      $$1.b("head").a("hat", gag.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gaf(0.25F)), gad.a);
      return gah.a($$0, 64, 64);
   }

   public static gah d() {
      gaj $$0 = b();
      return gah.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public gab a() {
      return this.b;
   }
}
