public class fxz extends fxa<guc> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;

   public fxz(gab $$0) {
      this.c = $$0;
      gab $$1 = $$0.b("body");
      this.i = $$1.b("tail_base");
      this.j = this.i.b("tail_tip");
      this.d = $$1.b("left_wing_base");
      this.e = this.d.b("left_wing_tip");
      this.f = $$1.b("right_wing_base");
      this.g = this.f.b("right_wing_tip");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("body", gag.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gad.b(-0.1F, 0.0F, 0.0F));
      gal $$3 = $$2.a("tail_base", gag.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gad.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", gag.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gad.a(0.0F, 0.5F, 6.0F));
      gal $$4 = $$2.a("left_wing_base", gag.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gad.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", gag.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gad.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      gal $$5 = $$2.a("right_wing_base", gag.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gad.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", gag.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gad.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", gag.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gad.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return gah.a($$0, 64, 64);
   }

   @Override
   public gab a() {
      return this.c;
   }

   public void a(guc $$0) {
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.d.g = azc.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = azc.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.f.g = -this.d.g;
      this.g.g = -this.e.g;
      this.i.e = -(5.0F + azc.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.j.e = -(5.0F + azc.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
