public class fxt extends fxn<cbd> {
   private final ftc a;

   public fxt(fxo.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(cbd $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      dip $$6 = $$0.u();
      if ($$6.l() == dce.c) {
         csy $$7 = $$0.dM();
         if ($$6 != $$7.a_($$0.dm()) && $$6.l() != dce.a) {
            $$3.a();
            hv $$8 = hv.a($$0.dr(), $$0.cH().e, $$0.dx());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fsd.b($$6)), false, auf.a(), $$6.a($$0.q()), gdf.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public agt a(cbd $$0) {
      return gdn.e;
   }
}
