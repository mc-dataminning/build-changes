public class grw extends gsb<cjt, gyf> {
   private static final aku a = aku.b("textures/entity/end_crystal/end_crystal.png");
   private static final gmh b = gmh.g(a);
   private final gbx h;

   public grw(gsc.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gbx($$0.a(gfb.aK));
   }

   public void a(gyf $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hea.d);
      $$1.b();
      fba $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         grx.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = ayz.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gyf a() {
      return new gyf();
   }

   public void a(cjt $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.m();
      ji $$3 = $$0.l();
      if ($$3 != null) {
         $$1.b = fba.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cjt $$0, gpo $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.l() != null;
   }
}
