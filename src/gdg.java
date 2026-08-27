public class gdg extends gda<cfd> {
   private final fym a;

   public gdg(gdb.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cfd $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      dnb $$6 = $$0.s();
      if ($$6.l() == dgh.c) {
         cxb $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dgh.a) {
            $$3.a();
            ib $$8 = ib.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fxn.b($$6)), false, axd.a(), $$6.a($$0.p()), git.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public ajh a(cfd $$0) {
      return gjb.e;
   }
}
