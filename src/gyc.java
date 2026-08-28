public class gyc extends gyh<cmu, hem> {
   private static final ali a = ali.b("textures/entity/end_crystal/end_crystal.png");
   private static final gsl g = gsl.g(a);
   private final ghx h;

   public gyc(gyi.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.h = new ghx($$0.a(gld.aU));
   }

   public void a(hem $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(g), $$3, hkq.d);
      $$1.b();
      ffq $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gyd.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azo.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hem a() {
      return new hem();
   }

   public void a(cmu $$0, hem $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.g();
      iv $$3 = $$0.f();
      if ($$3 != null) {
         $$1.b = ffq.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cmu $$0, gvu $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.f() != null;
   }
}
