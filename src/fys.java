public class fys extends fym<cbt> {
   private final fub a;

   public fys(fyn.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cbt $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      djh $$6 = $$0.u();
      if ($$6.l() == dcv.c) {
         ctp $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dcv.a) {
            $$3.a();
            hx $$8 = hx.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(ftc.b($$6)), false, auv.a(), $$6.a($$0.q()), gee.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ahg a(cbt $$0) {
      return gem.e;
   }
}
