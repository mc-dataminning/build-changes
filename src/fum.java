public class fum extends fwa {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fye e;
   private final fye f;
   private final fye g;
   private final fye h;
   private final fye i;
   private final fye j;
   private final fye k;

   public fum(fye $$0) {
      super(gfb::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("left_lid", fyj.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyg.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fyj.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyg.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fyj.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fyg.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fyj.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fyg.a);
      $$1.a("right_pages", fyj.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fyg.a);
      fyj $$2 = fyj.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fyg.a);
      $$1.a("flip_page2", $$2, fyg.a);
      return fyk.a($$0, 64, 32);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   public void b(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.e.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (ayn.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = ayn.a($$4);
      this.i.b = ayn.a($$4);
      this.j.b = ayn.a($$4);
      this.k.b = ayn.a($$4);
   }
}
