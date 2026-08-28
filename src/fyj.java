public class fyj extends fxa<gsu> {
   private final gab a;
   private final gab b;
   private final gab c;

   public fyj(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.c = $$0.b("right_fin");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gag.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gad.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gag.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gad.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gag.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gad.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gag.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gad.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gag.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gad.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gag.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gad.a(1.5F, 22.0F, -1.5F));
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   @Override
   public void a(gsu $$0) {
      this.c.g = -0.2F + 0.4F * azc.a($$0.p * 0.2F);
      this.b.g = 0.2F - 0.4F * azc.a($$0.p * 0.2F);
   }
}
