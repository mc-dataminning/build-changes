public class fwk extends fxv {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab h;
   private final gab i;
   private final gab j;
   private final gab k;

   public fwk(gab $$0) {
      super(ghe::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("left_lid", gag.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gad.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", gag.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gad.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", gag.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), gad.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", gag.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), gad.a);
      $$1.a("right_pages", gag.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), gad.a);
      gag $$2 = gag.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, gad.a);
      $$1.a("flip_page2", $$2, gad.a);
      return gah.a($$0, 64, 32);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (azc.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = azc.a($$4);
      this.i.b = azc.a($$4);
      this.j.b = azc.a($$4);
      this.k.b = azc.a($$4);
   }

   @Override
   public gab a() {
      return this.e;
   }
}
