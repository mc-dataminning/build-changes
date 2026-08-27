public class fwh extends fwb<car> {
   private final frt a;

   public fwh(fwc.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(car $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      dhn $$6 = $$0.u();
      if ($$6.l() == dbk.c) {
         csf $$7 = $$0.dN();
         if ($$6 != $$7.a_($$0.dn()) && $$6.l() != dbk.a) {
            $$3.a();
            hx $$8 = hx.a($$0.ds(), $$0.cH().e, $$0.dy());
            $$3.a(-0.5, 0.0, -0.5);
            this.a.b().a($$7, this.a.a($$6), $$6, $$8, $$3, $$4.getBuffer(fqu.b($$6)), false, atw.a(), $$6.a($$0.q()), gbq.d);
            $$3.b();
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public agm a(car $$0) {
      return gby.e;
   }
}
