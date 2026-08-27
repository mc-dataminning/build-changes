public class fuy extends fwn {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fys e;
   private final fys f;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final fys k;

   public fuy(fys $$0) {
      super(gfo::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fyy a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("left_lid", fyx.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyu.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fyx.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fyu.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fyx.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fyu.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fyx.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fyu.a);
      $$1.a("right_pages", fyx.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fyu.a);
      fyx $$2 = fyx.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fyu.a);
      $$1.a("flip_page2", $$2, fyu.a);
      return fyy.a($$0, 64, 32);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void b(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (aym.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = aym.a($$4);
      this.i.b = aym.a($$4);
      this.j.b = aym.a($$4);
      this.k.b = aym.a($$4);
   }
}
