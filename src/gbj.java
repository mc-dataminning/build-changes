public class gbj extends gcv {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final gfc e;
   private final gfc f;
   private final gfc g;
   private final gfc h;
   private final gfc i;
   private final gfc j;

   public gbj(gfc $$0) {
      super($$0, gmh::d);
      this.e = $$0.b("left_lid");
      this.f = $$0.b("right_lid");
      this.g = $$0.b("left_pages");
      this.h = $$0.b("right_pages");
      this.i = $$0.b("flip_page1");
      this.j = $$0.b("flip_page2");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("left_lid", gfh.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gfe.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", gfh.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gfe.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", gfh.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), gfe.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", gfh.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), gfe.a);
      $$1.a("right_pages", gfh.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), gfe.a);
      gfh $$2 = gfh.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, gfe.a);
      $$1.a("flip_page2", $$2, gfe.a);
      return gfi.a($$0, 64, 32);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (ayz.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.e.f = (float) Math.PI + $$4;
      this.f.f = -$$4;
      this.g.f = $$4;
      this.h.f = -$$4;
      this.i.f = $$4 - $$4 * 2.0F * $$1;
      this.j.f = $$4 - $$4 * 2.0F * $$2;
      this.g.b = ayz.a($$4);
      this.h.b = ayz.a($$4);
      this.i.b = ayz.a($$4);
      this.j.b = ayz.a($$4);
   }
}
