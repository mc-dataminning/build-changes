public class fws extends fxa<gsn> {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private static final int g = 6;

   public fws(gab $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.d = $$0.b("right_hind_leg");
      this.c = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.e = $$0.b("left_front_leg");
   }

   public static gah a(gaf $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      $$2.a("head", gag.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gad.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gag.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gad.a(0.0F, 6.0F, 0.0F));
      gag $$3 = gag.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gad.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gad.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gad.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gad.a(2.0F, 18.0F, -4.0F));
      return gah.a($$1, 64, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gsn $$0) {
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.c.e = azc.b($$2 * 0.6662F) * 1.4F * $$1;
      this.d.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azc.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = azc.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
