public class grf extends grk<ckk, gxn> {
   private static final alp a = alp.b("textures/entity/end_crystal/end_crystal.png");
   private static final glq b = glq.g(a);
   private final gbe h;

   public grf(grl.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.h = new gbe($$0.a(gei.aK));
   }

   public void a(gxn $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.h.a($$0);
      this.h.a($$1, $$2.getBuffer(b), $$3, hax.d);
      $$1.b();
      fbr $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.p);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         grg.a(-$$6, -$$7 + $$5, -$$8, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = azu.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public gxn a() {
      return new gxn();
   }

   public void a(ckk $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.p = (float)$$0.a + $$2;
      $$1.a = $$0.m();
      jh $$3 = $$0.l();
      if ($$3 != null) {
         $$1.b = fbr.b($$3).d($$0.o($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(ckk $$0, gox $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.l() != null;
   }
}
