public class gws extends gwx<cmj, hdc> {
   private static final alg a = alg.b("textures/entity/end_crystal/end_crystal.png");
   private static final grc g = grc.g(a);
   private final ggm h;

   public gws(gwy.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.h = new ggm($$0.a(gjs.aU));
   }

   public void a(hdc $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(g), $$3, hjg.d);
      $$1.b();
      ffc $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gwt.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azm.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hdc a() {
      return new hdc();
   }

   public void a(cmj $$0, hdc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.g();
      iv $$3 = $$0.f();
      if ($$3 != null) {
         $$1.b = ffc.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cmj $$0, guk $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.f() != null;
   }
}
