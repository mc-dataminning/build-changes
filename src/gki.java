public class gki extends gkc<cje> {
   private final gfn a;

   public gki(gkd.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cje $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      dta $$6 = $$0.t();
      if ($$6.l() == dmd.c) {
         dcu $$7 = $$0.dQ();
         if ($$6 != $$7.a_($$0.dq()) && $$6.l() != dmd.a) {
            $$3.a();
            jd $$8 = jd.a($$0.dv(), $$0.cL().e, $$0.dB());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(geo.b($$6)), false, ayv.a(), $$6.a($$0.p()), gpw.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akq a(cje $$0) {
      return gqe.e;
   }
}
