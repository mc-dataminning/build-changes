public class gkv extends gkp<cif> {
   private final gga a;

   public gkv(gkq.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.c();
   }

   public void a(cif $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      dtc $$6 = $$0.t();
      if ($$6.l() == dlw.c) {
         dca $$7 = $$0.dU();
         if ($$6 != $$7.a_($$0.du()) && $$6.l() != dlw.a) {
            $$3.a();
            ir $$8 = ir.a($$0.dz(), $$0.cP().e, $$0.dF());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(gfb.b($$6)), false, ayt.a(), $$6.a($$0.p()), gqp.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akt a(cif $$0) {
      return gqx.e;
   }
}
