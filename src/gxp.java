public class gxp extends gxu<cnf, hdz> {
   private static final alr a = alr.b("textures/entity/end_crystal/end_crystal.png");
   private static final gry g = gry.g(a);
   private final ghk h;

   public gxp(gxv.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.h = new ghk($$0.a(gkq.aU));
   }

   public void a(hdz $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(g), $$3, hkg.d);
      $$1.b();
      fgc $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.v);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gxq.a(-$$6, -$$7 + $$5, -$$8, $$0.v, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azz.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hdz a() {
      return new hdz();
   }

   public void a(cnf $$0, hdz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.v = (float)$$0.a + $$2;
      $$1.a = $$0.f();
      iw $$3 = $$0.e();
      if ($$3 != null) {
         $$1.b = fgc.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cnf $$0, gvh $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.e() != null;
   }
}
