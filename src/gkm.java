public class gkm extends gkg<cjg> {
   private final gfr a;

   public gkm(gkh.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.c();
   }

   public void a(cjg $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      dtc $$6 = $$0.t();
      if ($$6.l() == dmf.c) {
         dcw $$7 = $$0.dP();
         if ($$6 != $$7.a_($$0.dp()) && $$6.l() != dmf.a) {
            $$3.a();
            jd $$8 = jd.a($$0.du(), $$0.cL().e, $$0.dA());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(ges.b($$6)), false, ayw.a(), $$6.a($$0.p()), gqa.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public akr a(cjg $$0) {
      return gqi.e;
   }
}
