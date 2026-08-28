public class grk extends grp<ckt, gxs> {
   private static final alz a = alz.b("textures/entity/end_crystal/end_crystal.png");
   private static final glv b = glv.g(a);
   private final gbj h;

   public grk(grq.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gbj($$0.a(gen.aH));
   }

   public void a(gxs $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hbc.d);
      $$1.b();
      fby $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         grl.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = bae.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gxs a() {
      return new gxs();
   }

   public void a(ckt $$0, gxs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.a + $$2;
      $$1.a = $$0.m();
      jh $$3 = $$0.l();
      if ($$3 != null) {
         $$1.b = fby.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(ckt $$0, gpc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.l() != null;
   }
}
