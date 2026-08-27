public class fzf extends fyz<cca> {
   private final fun a;

   public fzf(fza.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cca $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      djp $$6 = $$0.u();
      if ($$6.l() == ddd.c) {
         ctx $$7 = $$0.dL();
         if ($$6 != $$7.a_($$0.dl()) && $$6.l() != ddd.a) {
            $$3.a();
            hx $$8 = hx.a($$0.dq(), $$0.cH().e, $$0.dw());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fto.b($$6)), false, auw.a(), $$6.a($$0.q()), ges.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ahh a(cca $$0) {
      return gfa.e;
   }
}
