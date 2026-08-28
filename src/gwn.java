public class gwn extends gws<cmg, hcw> {
   private static final alg a = alg.b("textures/entity/end_crystal/end_crystal.png");
   private static final gqx g = gqx.g(a);
   private final ggh h;

   public gwn(gwt.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.h = new ggh($$0.a(gjn.aU));
   }

   public void a(hcw $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(g), $$3, hja.d);
      $$1.b();
      fex $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.u);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         gwo.a(-$$6, -$$7 + $$5, -$$8, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azm.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hcw a() {
      return new hcw();
   }

   public void a(cmg $$0, hcw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.u = (float)$$0.a + $$2;
      $$1.a = $$0.g();
      iv $$3 = $$0.f();
      if ($$3 != null) {
         $$1.b = fex.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cmg $$0, guf $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.f() != null;
   }
}
