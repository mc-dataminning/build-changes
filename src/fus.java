public class fus extends fwg {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fyk e;
   private final fyk f;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;

   public fus(fyk $$0) {
      super(gfh::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("left_lid", fyp.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fym.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fyp.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fym.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fyp.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fym.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fyp.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fym.a);
      $$1.a("right_pages", fyp.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fym.a);
      fyp $$2 = fyp.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fym.a);
      $$1.a("flip_page2", $$2, fym.a);
      return fyq.a($$0, 64, 32);
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   public void b(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.e.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (ayo.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = ayo.a($$4);
      this.i.b = ayo.a($$4);
      this.j.b = ayo.a($$4);
      this.k.b = ayo.a($$4);
   }
}
