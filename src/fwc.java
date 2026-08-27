public class fwc extends fvw<cam> {
   private final fro a;

   public fwc(fvx.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cam $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      dhi $$6 = $$0.u();
      if ($$6.l() == dbf.c) {
         csa $$7 = $$0.dN();
         if ($$6 != $$7.a_($$0.dn()) && $$6.l() != dbf.a) {
            $$3.a();
            ht $$8 = ht.a($$0.ds(), $$0.cH().e, $$0.dy());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fqp.b($$6)), false, ats.a(), $$6.a($$0.q()), gbl.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public agi a(cam $$0) {
      return gbt.e;
   }
}
