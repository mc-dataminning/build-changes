public class fwn extends fxk<gsv> {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;

   public fwn(gal $$0) {
      super(ghq::e);
      this.a = $$0;
      this.c = $$0.b("body");
      this.b = $$0.b("head");
      this.d = this.c.b("right_wing");
      this.f = this.d.b("right_wing_tip");
      this.e = this.c.b("left_wing");
      this.g = this.e.b("left_wing_tip");
      this.i = this.c.b("feet");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("body", gaq.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gan.a(0.0F, 17.0F, 0.0F));
      gav $$3 = $$1.a("head", gaq.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gan.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gaq.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gan.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gaq.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gan.a(1.1F, -3.0F, 0.0F));
      gav $$4 = $$2.a("right_wing", gaq.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gan.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gaq.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gan.a(-2.0F, 0.0F, 0.0F));
      gav $$5 = $$2.a("left_wing", gaq.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gan.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gaq.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gan.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gaq.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gan.a(0.0F, 5.0F, 0.0F));
      return gar.a($$0, 32, 32);
   }

   @Override
   public gal a() {
      return this.a;
   }

   public void a(gsv $$0) {
      this.a().e().forEach(gal::c);
      if ($$0.a) {
         this.a($$0.U);
      }

      this.a($$0.b, fje.b, $$0.p, 1.0F);
      this.a($$0.c, fje.a, $$0.p, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
