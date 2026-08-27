public class fui extends fuc<bzp> {
   private final fpu a;

   public fui(fud.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(bzp $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      dgb $$6 = $$0.t();
      if ($$6.l() == dae.c) {
         cqz $$7 = $$0.dL();
         if ($$6 != $$7.a_($$0.dl()) && $$6.l() != dae.a) {
            $$3.a();
            ht $$8 = ht.a($$0.dq(), $$0.cG().e, $$0.dw());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fow.b($$6)), false, ate.a(), $$6.a($$0.q()), fzr.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public afw a(bzp $$0) {
      return fzz.e;
   }
}
