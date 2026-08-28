public class fzu extends fyx {
   private final gab a;
   private final gab b;

   public fzu(gab $$0) {
      this.a = $$0.b("head");
      this.b = this.a.b("jaw");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      float $$2 = -16.0F;
      gal $$3 = $$1.a(
         "head",
         gag.c()
            .a("upper_lip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upper_head", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a(true)
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a(false)
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gad.a(0.0F, -7.986666F, 0.0F).b(0.75F)
      );
      $$3.a("jaw", gag.c().a(176, 65).a("jaw", -6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F), gad.a(0.0F, 4.0F, -8.0F));
      return gah.a($$0, 256, 256);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.b.e = (float)(Math.sin((double)($$0 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public gab a() {
      return this.a;
   }
}
