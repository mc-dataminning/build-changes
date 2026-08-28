public class fyt extends fxa<guo> {
   public static final String a = "lid";
   private static final String b = "base";
   private final gab c;
   private final gab d;
   private final gab e;

   public fyt(gab $$0) {
      super(ghe::g);
      this.c = $$0;
      this.d = $$0.b("lid");
      this.e = $$0.b("head");
   }

   private static gaj d() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("lid", gag.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), gad.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", gag.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), gad.a(0.0F, 24.0F, 0.0F));
      return $$0;
   }

   public static gah b() {
      gaj $$0 = d();
      $$0.a().a("head", gag.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), gad.a(0.0F, 12.0F, 0.0F));
      return gah.a($$0, 64, 64);
   }

   public static gah c() {
      gaj $$0 = d();
      return gah.a($$0, 64, 64);
   }

   public void a(guo $$0) {
      float $$1 = (0.5F + $$0.c) * (float) Math.PI;
      float $$2 = -1.0F + azc.a($$1);
      float $$3 = 0.0F;
      if ($$1 > (float) Math.PI) {
         $$3 = azc.a($$0.p * 0.1F) * 0.7F;
      }

      this.d.a(0.0F, 16.0F + azc.a($$1) * 8.0F + $$3, 0.0F);
      if ($$0.c > 0.3F) {
         this.d.f = $$2 * $$2 * $$2 * $$2 * (float) Math.PI * 0.125F;
      } else {
         this.d.f = 0.0F;
      }

      this.e.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.f = ($$0.d - 180.0F - $$0.e) * (float) (Math.PI / 180.0);
   }

   @Override
   public gab a() {
      return this.c;
   }
}
