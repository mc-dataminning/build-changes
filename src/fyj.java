public class fyj extends fxk<gut> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;
   private final gal j;

   public fyj(gal $$0) {
      this.c = $$0;
      gal $$1 = $$0.b("body");
      this.i = $$1.b("tail_base");
      this.j = this.i.b("tail_tip");
      this.d = $$1.b("left_wing_base");
      this.e = this.d.b("left_wing_tip");
      this.f = $$1.b("right_wing_base");
      this.g = this.f.b("right_wing_tip");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("body", gaq.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), gan.b(-0.1F, 0.0F, 0.0F));
      gav $$3 = $$2.a("tail_base", gaq.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), gan.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", gaq.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), gan.a(0.0F, 0.5F, 6.0F));
      gav $$4 = $$2.a("left_wing_base", gaq.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gan.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", gaq.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gan.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      gav $$5 = $$2.a("right_wing_base", gaq.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), gan.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", gaq.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), gan.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", gaq.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), gan.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return gar.a($$0, 64, 64);
   }

   @Override
   public gal a() {
      return this.c;
   }

   public void a(gut $$0) {
      float $$1 = $$0.a * 7.448451F * (float) (Math.PI / 180.0);
      float $$2 = 16.0F;
      this.d.g = azd.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.e.g = azd.b($$1) * 16.0F * (float) (Math.PI / 180.0);
      this.f.g = -this.d.g;
      this.g.g = -this.e.g;
      this.i.e = -(5.0F + azd.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.j.e = -(5.0F + azd.b($$1 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
