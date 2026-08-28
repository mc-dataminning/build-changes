public class fuq extends fwe {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fyi e;
   private final fyi f;
   private final fyi g;
   private final fyi h;
   private final fyi i;
   private final fyi j;
   private final fyi k;

   public fuq(fyi $$0) {
      super(gff::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fyo a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("left_lid", fyn.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyk.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fyn.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyk.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fyn.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fyk.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fyn.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fyk.a);
      $$1.a("right_pages", fyn.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fyk.a);
      fyn $$2 = fyn.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fyk.a);
      $$1.a("flip_page2", $$2, fyk.a);
      return fyo.a($$0, 64, 32);
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   public void b(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
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
