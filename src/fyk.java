public class fyk extends fzv {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final gcc e;
   private final gcc f;
   private final gcc g;
   private final gcc h;
   private final gcc i;
   private final gcc j;

   public fyk(gcc $$0) {
      super($$0, gjh::c);
      this.e = $$0.b("left_lid");
      this.f = $$0.b("right_lid");
      this.g = $$0.b("left_pages");
      this.h = $$0.b("right_pages");
      this.i = $$0.b("flip_page1");
      this.j = $$0.b("flip_page2");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("left_lid", gch.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gce.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", gch.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), gce.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", gch.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), gce.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", gch.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), gce.a);
      $$1.a("right_pages", gch.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), gce.a);
      gch $$2 = gch.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, gce.a);
      $$1.a("flip_page2", $$2, gce.a);
      return gci.a($$0, 64, 32);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (azn.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.e.f = (float) Math.PI + $$4;
      this.f.f = -$$4;
      this.g.f = $$4;
      this.h.f = -$$4;
      this.i.f = $$4 - $$4 * 2.0F * $$1;
      this.j.f = $$4 - $$4 * 2.0F * $$2;
      this.g.b = azn.a($$4);
      this.h.b = azn.a($$4);
      this.i.b = azn.a($$4);
      this.j.b = azn.a($$4);
   }
}
