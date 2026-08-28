public class gfu extends ghl {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final gjt e;
   private final gjt f;
   private final gjt g;
   private final gjt h;
   private final gjt i;
   private final gjt j;

   public gfu(gjt $$0) {
      super($$0, grc::d);
      this.e = $$0.b("left_lid");
      this.f = $$0.b("right_lid");
      this.g = $$0.b("left_pages");
      this.h = $$0.b("right_pages");
      this.i = $$0.b("flip_page1");
      this.j = $$0.b("flip_page2");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("left_lid", gjy.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gjv.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", gjy.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gjv.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", gjy.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), gjv.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", gjy.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), gjv.a);
      $$1.a("right_pages", gjy.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), gjv.a);
      gjy $$2 = gjy.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, gjv.a);
      $$1.a("flip_page2", $$2, gjv.a);
      return gjz.a($$0, 64, 32);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (azm.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.e.f = (float) Math.PI + $$4;
      this.f.f = -$$4;
      this.g.f = $$4;
      this.h.f = -$$4;
      this.i.f = $$4 - $$4 * 2.0F * $$1;
      this.j.f = $$4 - $$4 * 2.0F * $$2;
      this.g.b = azm.a($$4);
      this.h.b = azm.a($$4);
      this.i.b = azm.a($$4);
      this.j.b = azm.a($$4);
   }
}
