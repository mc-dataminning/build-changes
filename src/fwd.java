public class fwd extends fxa<gse> {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;

   public fwd(gab $$0) {
      super(ghe::e);
      this.a = $$0;
      this.c = $$0.b("body");
      this.b = $$0.b("head");
      this.d = this.c.b("right_wing");
      this.f = this.d.b("right_wing_tip");
      this.e = this.c.b("left_wing");
      this.g = this.e.b("left_wing_tip");
      this.i = this.c.b("feet");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("body", gag.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gad.a(0.0F, 17.0F, 0.0F));
      gal $$3 = $$1.a("head", gag.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gad.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gag.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gad.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gag.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gad.a(1.1F, -3.0F, 0.0F));
      gal $$4 = $$2.a("right_wing", gag.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gad.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gag.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gad.a(-2.0F, 0.0F, 0.0F));
      gal $$5 = $$2.a("left_wing", gag.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gad.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gag.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gad.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gag.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gad.a(0.0F, 5.0F, 0.0F));
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.a;
   }

   public void a(gse $$0) {
      this.a().e().forEach(gab::c);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fiu.b, $$0.p, 1.0F);
      this.a($$0.c, fiu.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
