public class fwu extends fyf {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal h;
   private final gal i;
   private final gal j;
   private final gal k;

   public fwu(gal $$0) {
      super(ghq::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("left_lid", gaq.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gan.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", gaq.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gan.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", gaq.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), gan.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", gaq.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), gan.a);
      $$1.a("right_pages", gaq.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), gan.a);
      gaq $$2 = gaq.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, gan.a);
      $$1.a("flip_page2", $$2, gan.a);
      return gar.a($$0, 64, 32);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (azd.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = azd.a($$4);
      this.i.b = azd.a($$4);
      this.j.b = azd.a($$4);
      this.k.b = azd.a($$4);
   }

   @Override
   public gal a() {
      return this.e;
   }
}
